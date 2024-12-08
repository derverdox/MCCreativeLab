package de.verdox.mccreativelab.platform;

import de.verdox.mccreativelab.Singleton;
import de.verdox.mccreativelab.generator.resourcepack.CustomResourcePack;
import de.verdox.mccreativelab.generator.resourcepack.types.gui.ActiveGUI;
import de.verdox.mccreativelab.generator.resourcepack.types.gui.GUIFrontEndBehavior;
import de.verdox.mccreativelab.generator.resourcepack.types.hud.renderer.HudRenderer;
import de.verdox.mccreativelab.generator.resourcepack.types.menu.ActiveMenu;
import de.verdox.mccreativelab.generator.resourcepack.types.menu.MenuBehaviour;
import de.verdox.mccreativelab.generator.resourcepack.types.menu.PlayerKeyInput;
import de.verdox.mccreativelab.wrapper.entity.types.MCCPlayer;
import net.kyori.adventure.audience.Audience;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;
import java.util.function.BiConsumer;

public interface GeneratorPlatformHelper {
    Singleton<GeneratorPlatformHelper> INSTANCE = new Singleton<>(GeneratorPlatformHelper.class);

    /**
     * Used by {@link de.verdox.mccreativelab.generator.resourcepack.types.rendered.ComponentRendered} to remove old minecraft color codes from text.
     *
     * @param message the text potentially including color codes
     * @return the same text but without color codes
     */
    @NotNull String stripOldColorCodes(@NotNull String message);

    @NotNull HudRenderer getHudRenderer();

    /**
     * Returns the {@link UUID} of {@link Audience} if available. Else this method returns null.
     *
     * @param audience the audience object
     * @return the uuid if available
     */
    @Nullable UUID getUUIDOfAudience(Audience audience);

    @NotNull
    default UUID getUUIDOfAudienceOrThrow(Audience audience) {
        UUID uuid = getUUIDOfAudience(audience);
        if (uuid == null)
            throw new IllegalArgumentException("The provided audience parameter is of type " + audience.getClass() + " and does not seem to have a UUID. If you think this is a bug contact the author of the GeneratorPlatformHelper implementation on your current server software platform.");
        return uuid;
    }

    /**
     * Returns the currently loaded resource pack of the platform
     *
     * @return the currently loaded resource pack if available, else null
     */
    @Nullable CustomResourcePack getPlatformResourcePack();

    @NotNull GUIFrontEndBehavior createFrondEndBehavior(ActiveGUI activeGUI);

    @NotNull MenuBehaviour createMenuBehavior(MCCPlayer player, ActiveMenu activeMenu, BiConsumer<PlayerKeyInput, ActiveMenu> consumer, Runnable onEnd);
}
