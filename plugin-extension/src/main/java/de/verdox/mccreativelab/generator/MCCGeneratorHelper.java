package de.verdox.mccreativelab.generator;

import de.verdox.mccreativelab.generator.resourcepack.CustomResourcePack;
import de.verdox.mccreativelab.generator.resourcepack.types.gui.ActiveGUI;
import de.verdox.mccreativelab.generator.resourcepack.types.gui.GUIFrontEndBehavior;
import de.verdox.mccreativelab.generator.resourcepack.types.hud.renderer.HudRenderer;
import de.verdox.mccreativelab.generator.resourcepack.types.hud.renderer.HudRendererImpl;
import de.verdox.mccreativelab.generator.resourcepack.types.menu.ActiveMenu;
import de.verdox.mccreativelab.generator.resourcepack.types.menu.MenuBehaviour;
import de.verdox.mccreativelab.generator.resourcepack.types.menu.PlayerKeyInput;
import de.verdox.mccreativelab.platform.GeneratorPlatformHelper;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.entity.types.MCCPlayer;
import de.verdox.mccreativelab.wrapper.world.MCCWorld;
import net.kyori.adventure.audience.Audience;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;
import java.util.function.BiConsumer;

public class MCCGeneratorHelper implements GeneratorPlatformHelper {
    private final HudRendererImpl hudRenderer = new HudRendererImpl();
    private final JavaPlugin javaPlugin;
    private final CustomResourcePack customResourcePack;

    public MCCGeneratorHelper(JavaPlugin javaPlugin, CustomResourcePack customResourcePack) {
        this.javaPlugin = javaPlugin;
        this.customResourcePack = customResourcePack;
        this.hudRenderer.start();
    }


    @Override
    public @NotNull String stripOldColorCodes(@NotNull String message) {
        return ChatColor.stripColor(message);
    }

    @Override
    public @NotNull HudRenderer getHudRenderer() {
        return this.hudRenderer;
    }

    @Override
    public @Nullable UUID getUUIDOfAudience(Audience audience) {
        if (audience instanceof MCCEntity mccEntity)
            return mccEntity.getUUID();
        else if(audience instanceof MCCWorld world)
            return world.getUUID();
        return null;
    }

    @Override
    public @Nullable CustomResourcePack getPlatformResourcePack() {
        return customResourcePack;
    }

    @Override
    public @NotNull GUIFrontEndBehavior createFrondEndBehavior(ActiveGUI activeGUI) {
        return new PaperGUIFrontEndBehavior(javaPlugin, activeGUI);
    }

    @Override
    public @NotNull MenuBehaviour createMenuBehavior(MCCPlayer player, ActiveMenu activeMenu, BiConsumer<PlayerKeyInput, ActiveMenu> consumer, Runnable onEnd) {
        return new PaperMenuBehavior(player, activeMenu, consumer, onEnd);
    }
}
