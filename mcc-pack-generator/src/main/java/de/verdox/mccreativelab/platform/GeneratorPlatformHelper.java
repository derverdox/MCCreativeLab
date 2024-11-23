package de.verdox.mccreativelab.platform;

import de.verdox.mccreativelab.Singleton;
import de.verdox.mccreativelab.generator.resourcepack.CustomResourcePack;
import de.verdox.mccreativelab.generator.resourcepack.types.gui.ActiveGUI;
import de.verdox.mccreativelab.generator.resourcepack.types.gui.FrontEndBehavior;
import de.verdox.mccreativelab.generator.resourcepack.types.hud.renderer.HudRenderer;
import net.kyori.adventure.audience.Audience;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public interface GeneratorPlatformHelper {
    Singleton<GeneratorPlatformHelper> INSTANCE = new Singleton<>(GeneratorPlatformHelper.class);

    /**
     * Returns the locale key of the player. If no player is online with this UUID the method returns null
     *
     * @param onlinePlayer the online player uuid
     * @return the locale
     */
    @Nullable String getPlayerLocaleKey(UUID onlinePlayer);

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

    @NotNull default UUID getUUIDOfAudienceOrThrow(Audience audience){
        UUID uuid = getUUIDOfAudience(audience);
        if(uuid == null)
            throw new IllegalArgumentException("The provided audience parameter is of type "+audience.getClass()+" and does not seem to have a UUID. If you think this is a bug contact the author of the GeneratorPlatformHelper implementation on your current server software platform.");
        return uuid;
    }

    /**
     * Returns the currently loaded resource pack of the player with the uuid {@link UUID}
     * @param playerUUID the uuid of the player
     * @return the currently loaded resource pack if available, else null
     */
    @Nullable CustomResourcePack getLoadedResourcePack(UUID playerUUID);

    @NotNull FrontEndBehavior createFrondEndBehavior(ActiveGUI activeGUI);
}
