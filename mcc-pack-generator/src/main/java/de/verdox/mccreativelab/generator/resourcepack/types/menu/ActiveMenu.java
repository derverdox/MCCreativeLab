package de.verdox.mccreativelab.generator.resourcepack.types.menu;

import de.verdox.mccreativelab.generator.resourcepack.types.hud.ActiveHud;
import de.verdox.mccreativelab.generator.resourcepack.types.rendered.element.group.Button;
import de.verdox.mccreativelab.generator.resourcepack.types.rendered.element.group.HudMultiLineText;
import de.verdox.mccreativelab.generator.resourcepack.types.rendered.element.single.SingleHudText;
import de.verdox.mccreativelab.generator.resourcepack.types.rendered.element.single.SingleHudTexture;
import de.verdox.mccreativelab.platform.GeneratorPlatformHelper;
import de.verdox.mccreativelab.wrapper.entity.types.MCCPlayer;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import io.vertx.core.impl.ConcurrentHashSet;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.sound.Sound;
import net.kyori.adventure.sound.SoundStop;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.Consumer;

public class ActiveMenu {
    public static final Map<UUID, ActiveMenu> activeMenus = new HashMap<>();
    private final MCCPlayer player;
    private final UUID playerUUID;
    private final CustomMenu customMenu;
    private final MenuBehaviour behaviour;
    private final Set<MenuState> enabledStates = new ConcurrentHashSet<>();
    private MCCItemStack activeBackgroundPicture;

    ActiveMenu(MCCPlayer player, CustomMenu customMenu) {
        this.player = player;
        this.playerUUID = GeneratorPlatformHelper.INSTANCE.get().getUUIDOfAudienceOrThrow(player);
        this.customMenu = customMenu;
        closeActiveMenu(player);
        behaviour = GeneratorPlatformHelper.INSTANCE.get().createMenuBehavior(player, this, (playerKeyInput, activeMenu) -> {
            for (MenuState enabledState : activeMenu.enabledStates) {
                for (Consumer<ActiveMenu> activeMenuConsumer : enabledState.getMenuOperationsOnKey(playerKeyInput)) {
                    activeMenuConsumer.accept(activeMenu);
                }
            }
        }, () -> customMenu.getOnClose().accept(this));
        ;
        behaviour.start();
        if (customMenu.getMenuHud() != null)
            GeneratorPlatformHelper.INSTANCE.get().getHudRenderer().getOrStartActiveHud(player, customMenu.getMenuHud());
        if (activeMenus.containsKey(playerUUID)) {
            activeMenus.get(playerUUID).close();
        }
        activeMenus.put(playerUUID, this);
        hideEverything();
        customMenu.getStates().forEach((s, menuState) -> {
            if (!menuState.isVisibleOnOpen())
                return;
            this.enableState(s);
        });
    }

    MCCItemStack getActiveBackgroundPicture() {
        return activeBackgroundPicture;
    }

    public static void closeActiveMenu(Audience player) {
        var activeMenu = activeMenus.getOrDefault(GeneratorPlatformHelper.INSTANCE.get().getUUIDOfAudienceOrThrow(player), null);
        if (activeMenu == null)
            return;
        activeMenu.close();
    }

    public static boolean hasActiveMenu(Audience player){
        return activeMenus.containsKey(GeneratorPlatformHelper.INSTANCE.get().getUUIDOfAudienceOrThrow(player));
    }

    public CustomMenu getCustomMenu() {
        return customMenu;
    }

    public MCCPlayer getPlayer() {
        return player;
    }

    public void close() {
        player.stopSound(SoundStop.source(Sound.Source.MASTER));
        behaviour.close();
    }

    @Nullable
    public ActiveHud getActiveHud() {
        if (customMenu.getMenuHud() != null)
            return GeneratorPlatformHelper.INSTANCE.get().getHudRenderer().getOrStartActiveHud(player, customMenu.getMenuHud());
        return null;
    }

    public void changeButton(String id, Consumer<Button.RenderedButton> consumer) {
                if (getActiveHud() == null)
            return;
        getActiveHud().editRenderedElement(id, Button.RenderedButton.class, consumer);
    }

    public void changeText(String id, Consumer<SingleHudText.RenderedSingleHudText> consumer) {
        if (getActiveHud() == null)
            return;
        getActiveHud().editRenderedElement(id, SingleHudText.RenderedSingleHudText.class, consumer);
    }

    public void changeMultiLineText(String id, Consumer<HudMultiLineText.RenderedGroupMultiLineText> consumer) {
        if (getActiveHud() == null)
            return;
        getActiveHud().editRenderedElement(id, HudMultiLineText.RenderedGroupMultiLineText.class, consumer);
    }

    public void changeTexture(String id, Consumer<SingleHudTexture.RenderedSingleHudTexture> consumer) {
        if (getActiveHud() == null)
            return;
        getActiveHud().editRenderedElement(id, SingleHudTexture.RenderedSingleHudTexture.class, consumer);
    }

    public void setBackgroundPicture(String id) {
        if (!customMenu.getBackgroundPictures().containsKey(id))
            throw new IllegalArgumentException("No background picture found with id " + id);

        MCCItemStack newBackgroundPicture = customMenu.getBackgroundPictures().get(id).createItem();
        if(activeBackgroundPicture != null && activeBackgroundPicture.equals(newBackgroundPicture))
            return;

        activeBackgroundPicture = newBackgroundPicture;
        updateBackgroundPicture();
    }

    private void updateBackgroundPicture() {
    }

    public void clearBackgroundPicture() {
        activeBackgroundPicture = null;
    }

    public void enableState(String id) {
        if (id == null)
            return;
        if (!customMenu.getStates().containsKey(id))
            throw new NullPointerException("state id " + id + " does not exist");
        var state = customMenu.getStates().get(id);
        enableState(state);
        GeneratorPlatformHelper.INSTANCE.get().getHudRenderer().forceUpdate(player);

    }

    public void disableState(String id) {
        if (id == null)
            return;
        if (!customMenu.getStates().containsKey(id))
            throw new NullPointerException("state id " + id + " does not exist");
        var state = customMenu.getStates().get(id);
        disableState(state);
        updateBackgroundPicture();
        GeneratorPlatformHelper.INSTANCE.get().getHudRenderer().forceUpdate(player);
    }

    private void enableState(MenuState state) {
        state.getOnEnableState().accept(this);
        enabledStates.add(state);
        updateBackgroundPicture();
        GeneratorPlatformHelper.INSTANCE.get().getHudRenderer().forceUpdate(player);
    }

    private void disableState(MenuState state) {
        enabledStates.remove(state);
        state.getOnDisableState().accept(this);
        updateBackgroundPicture();
        GeneratorPlatformHelper.INSTANCE.get().getHudRenderer().forceUpdate(player);
    }

    private void execute(PlayerKeyInput keyInput, ActiveMenu activeMenu) {
        new HashSet<>(enabledStates).forEach(menuState -> menuState.getMenuOperationsOnKey(keyInput)
                                                                   .forEach(consumer -> consumer.accept(activeMenu)));
        updateBackgroundPicture();
        GeneratorPlatformHelper.INSTANCE.get().getHudRenderer().forceUpdate(player);
    }

    private void onEnd() {
        if (this.customMenu.getOnClose() != null)
            this.customMenu.getOnClose().accept(this);
        hideEverything();
        if (customMenu.getMenuHud() != null)
            GeneratorPlatformHelper.INSTANCE.get().getHudRenderer().stopActiveHud(player, customMenu.getMenuHud());
        activeMenus.remove(playerUUID);
    }

    private void hideEverything() {
        clearBackgroundPicture();
        for (MenuState menuState : enabledStates)
            disableState(menuState);
        var activeHud = getActiveHud();
        if (activeHud == null)
            return;
        activeHud.hideAll();
        GeneratorPlatformHelper.INSTANCE.get().getHudRenderer().forceUpdate(player);
    }
}

