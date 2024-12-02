package de.verdox.mccreativelab.wrapper.platform;

import de.verdox.mccreativelab.Singleton;
import de.verdox.mccreativelab.conversion.ConversionService;
import de.verdox.mccreativelab.wrapper.block.settings.MCCBlockHardnessSettings;
import de.verdox.mccreativelab.wrapper.block.settings.MCCBlockSoundSettings;
import de.verdox.mccreativelab.wrapper.block.settings.MCCFurnaceSettings;
import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.inventory.factory.MCCContainerFactory;
import de.verdox.mccreativelab.wrapper.platform.factory.TypedKeyFactory;
import de.verdox.mccreativelab.wrapper.platform.properties.MCCServerProperties;
import de.verdox.mccreativelab.wrapper.world.MCCWorld;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

/**
 * The main entrance point for the MCC-Wrapper Library.
 */
public interface MCCPlatform {
    /**
     * The respective server software implements this interface and sets the singleton accordingly
     */
    Singleton<MCCPlatform> INSTANCE = new Singleton<>(MCCPlatform.class);

    /**
     * Returns the active platform instance
     *
     * @return the platform
     */
    static MCCPlatform getInstance() {
        return INSTANCE.get();
    }

    /**
     * Returns the container factory of this platform
     *
     * @return the container factory
     */
    @NotNull MCCContainerFactory getContainerFactory();

    /**
     * Returns the task manager of this platform
     *
     * @return the task manager
     */
    @NotNull MCCTaskManager getTaskManager();

    /**
     * Returns the typed key factory of this platform
     *
     * @return the factory
     */
    @NotNull TypedKeyFactory getTypedKeyFactory();

    /**
     * Returns the conversion service of this platform
     *
     * @return the conversion service
     */
    @NotNull ConversionService getConversionService();

    /**
     * Returns all worlds that are loaded on this minecraft platform
     *
     * @return the list of worlds loaded
     */
    @NotNull List<MCCWorld> getWorlds();

    /**
     * Gets an online player by his uuid. Returns null if the server is not online.
     *
     * @param uuid the uuid of the player
     * @return the player or null
     */
    @Nullable MCCPlayer getOnlinePlayer(@NotNull UUID uuid);

    /**
     * Returns a list of all online players
     *
     * @return the list of online players
     */
    @NotNull List<MCCPlayer> getOnlinePlayers();

    /**
     * Sets the server resource pack on this server
     *
     * @param resourcePack the server resource pack
     */
    void setServerResourcePack(@NotNull MCCResourcePack resourcePack);

    /**
     * Must be called after instantiating the platform object. Else the platform might not work as expected
     */
    void init();

    /**
     * Returns the block hardness settings of this platform
     *
     * @return the block hardness settings
     */
    @NotNull MCCBlockHardnessSettings getBlockHardnessSettings();

    /**
     * Returns the block sound settings of this platform
     *
     * @return the block sound settings
     */
    @NotNull MCCBlockSoundSettings getBlockSoundSettings();

    /**
     * Returns the furnace settings of this platform
     *
     * @return the furnace settings
     */
    @NotNull MCCFurnaceSettings getFurnaceSettings();

    int getPublicTick();

    MCCServerProperties getServerProperties();

    void shutdown();
}
