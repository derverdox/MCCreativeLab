package de.verdox.mccreativelab.generator.resourcepack.types.menu;

import de.verdox.mccreativelab.wrapper.entity.MCCEffect;
import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.entity.player.Input;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.platform.MCCTask;
import de.verdox.mccreativelab.wrapper.typed.MCCEffects;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import de.verdox.mccreativelab.wrapper.world.Weather;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;

public class MenuBehaviour {
    private static final int tickCooldown = 3;
    private final MCCPlayer player;
    private final ActiveMenu activeMenu;
    private final BiConsumer<PlayerKeyInput, ActiveMenu> consumer;
    private final Runnable onEnd;
    private MCCTask posUpdaterTask;
    private MCCTask effectTask;
    private MCCTask checkerTask;
    private MCCLocation locationBefore;
    private int lastTickButtonPressed;
    private int lastScrollTick;
    private int currentScrollMode = 0;
    private int heldSlotBefore;

    public MenuBehaviour(MCCPlayer player, ActiveMenu activeMenu, BiConsumer<PlayerKeyInput, ActiveMenu> consumer, Runnable onEnd) {
        this.onEnd = onEnd;
        this.player = player;
        this.activeMenu = activeMenu;
        this.consumer = consumer;
    }

    public void start() {
        if (activeMenu.getCustomMenu().hideOtherPlayers) {
            for (MCCPlayer onlinePlayer : MCCPlatform.getInstance().getOnlinePlayers()) {
                player.getHideProperty().add(onlinePlayer);
            }
        }

        MCCItemStack[] fakeContents = new MCCItemStack[46];

        heldSlotBefore = player.getInventory().getHeldItemSlot();

        locationBefore = player.getLocation();



        player.getTempData().storeData("hasMenuOpen", false);

        MCCLocation locationOnOpen = getLocationOnOpen();

        this.checkerTask = MCCPlatform.getInstance().getTaskManager().runTimerAsync(mccTask -> {
            if(player.isDead() || !player.isOnline()){
                close();
                return;
            }

            if (activeMenu.getCustomMenu().doFakeTime)
                player.getTimeProperty().set(6000L);
            if (activeMenu.getCustomMenu().doFakeWeather)
                player.getWeatherProperty().set(Weather.CLEAR);

            player.getPickupItemProperty().set(false);
            player.getInventoryClickProperty().set(false);
            player.getInventoryInteractProperty().set(false);
            player.getSwapHandsProperty().set(false);
            player.getInteractProperty().set(false);
            player.getPickupItemProperty().set(false);
            player.getUntargetableProperty().addAllPossibilities();
            player.getDamageImmunityProperty().addAllPossibilities();
        }, 0L, 1L, TimeUnit.SECONDS);

        this.posUpdaterTask = MCCPlatform.getInstance().getTaskManager().runTimerAsync((task) -> {
            player.getInventory().setHeldItemSlot(4);
            fakeContents[45] = activeMenu.getActiveBackgroundPicture();
            player.getInventory().sendFakeContents(fakeContents);

            if (!activeMenu.getCustomMenu().doYawPitchLock && !activeMenu.getCustomMenu().doPositionLoc)
                return;

            if (player.getLocation().yaw() == 0 && player.getLocation().pitch() == -90 && activeMenu.getCustomMenu().doYawPitchLock)
                return;

            if (locationOnOpen != null)
                player.teleport(locationOnOpen);
        }, 0L, 50L, TimeUnit.MILLISECONDS);

        if (activeMenu.getCustomMenu().doEffects) {
            this.effectTask = MCCPlatform.getInstance().getTaskManager().runTimerAsync(mccTask -> {

                MCCEffect slowness = MCCEffects.MOVEMENT_SLOWDOWN.get().create(20, 3, false, false, false, null);
                MCCEffect fatigue = MCCEffects.DIG_SLOWDOWN.get().create(20, -1, false, false, false, null);
                MCCEffect blind = MCCEffects.BLINDNESS.get().create(40, 1, false, false, false, null);
                slowness.apply(player);
                fatigue.apply(player);
                blind.apply(player);

            }, 0L, 1, TimeUnit.SECONDS);
        }
    }

    private @Nullable MCCLocation getLocationOnOpen() {
        MCCLocation location = null;

        if (activeMenu.getCustomMenu().doYawPitchLock)
            location = new MCCLocation(player.getLocation().world(), player.getLocation().x() + 0.5, player.getLocation().y(), player.getLocation().z() + 0.5, 0, -90);
        else if (activeMenu.getCustomMenu().doPositionLoc)
            location = new MCCLocation(player.getLocation().world(), player.getLocation().x() + 0.5, player.getLocation().y(), player.getLocation().z() + 0.5, player.getLocation().yaw(), player.getLocation().pitch());
        return location;
    }

    public void close() {
        player.getInventory().setHeldItemSlot(heldSlotBefore);

        player.syncInventory();

        player.getTimeProperty().sync();
        player.getWeatherProperty().sync();
        player.getPickupItemProperty().sync();
        player.getInventoryClickProperty().sync();
        player.getInventoryInteractProperty().sync();
        player.getSwapHandsProperty().sync();
        player.getInteractProperty().sync();
        player.getPickupItemProperty().sync();
        player.getUntargetableProperty().sync();
        player.getDamageImmunityProperty().sync();

        if (posUpdaterTask != null)
            posUpdaterTask.cancel();
        if (checkerTask != null)
            checkerTask.cancel();
        if (effectTask != null)
            effectTask.cancel();
        player.teleport(locationBefore);
        if (onEnd != null)
            onEnd.run();

        player.getTempData().removeData("hasMenuOpen");
        if (activeMenu.getCustomMenu().hideOtherPlayers) {
            for (MCCPlayer onlinePlayer : MCCPlatform.getInstance().getOnlinePlayers()) {
                player.getHideProperty().remove(onlinePlayer);
            }
        }
    }

    public void handleInput(Input input){
        if(input.isForward())
            triggerKeyInput(PlayerKeyInput.FORWARD);
        if(input.isBackward())
            triggerKeyInput(PlayerKeyInput.BACKWARD);
        if(input.isLeft())
            triggerKeyInput(PlayerKeyInput.LEFT);
        if(input.isRight())
            triggerKeyInput(PlayerKeyInput.RIGHT);
        if(input.isJump())
            triggerKeyInput(PlayerKeyInput.SPACE);
        if(input.isSneak())
            triggerKeyInput(PlayerKeyInput.SNEAK);
        if(input.isSprint())
            triggerKeyInput(PlayerKeyInput.SPRINT);
    }

    public void handleHotBarScrolling(int currentTick, int oldIndex, int newIndex){
        var difference = currentTick - lastScrollTick;
        lastScrollTick = currentTick;
        if (difference <= 2) {
            if (currentScrollMode == 1)
                consumer.accept(PlayerKeyInput.SCROLL_UP, activeMenu);
            else if (currentScrollMode == -1)
                consumer.accept(PlayerKeyInput.SCROLL_DOWN, activeMenu);
        } else {
            var slotDifference = newIndex - oldIndex;

            if (slotDifference >= 0 && slotDifference <= 3) {
                consumer.accept(PlayerKeyInput.SCROLL_DOWN, activeMenu);
                currentScrollMode = -1;
            } else if (slotDifference <= 0 && slotDifference >= -3) {
                consumer.accept(PlayerKeyInput.SCROLL_UP, activeMenu);
                currentScrollMode = 1;
            } else
                currentScrollMode = 0;
        }
    }

    private void triggerKeyInput(PlayerKeyInput playerKeyInput) {
        consumer.accept(playerKeyInput, activeMenu);
    }

}
