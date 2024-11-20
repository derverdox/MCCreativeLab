package de.verdox.mccreativelab.wrapper.platform;

import de.verdox.mccreativelab.Singleton;
import de.verdox.mccreativelab.conversion.ConversionService;
import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.event.MCCEvent;
import de.verdox.mccreativelab.wrapper.inventory.factory.MCCContainerFactory;
import de.verdox.mccreativelab.wrapper.platform.factory.TypedKeyFactory;
import de.verdox.mccreativelab.wrapper.world.MCCWorld;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Set;
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
    MCCContainerFactory getContainerFactory();

    /**
     * Returns the task manager of this platform
     *
     * @return the task manager
     */
    MCCTaskManager getTaskManager();

    /**
     * Returns the typed key factory of this platform
     *
     * @return the factory
     */
    TypedKeyFactory getTypedKeyFactory();

    ConversionService getConversionService();

    void callEvent(MCCEvent mccEvent);

    List<MCCWorld> getWorlds();

    @Nullable MCCPlayer getOnlinePlayer(UUID uuid);

    void init();
}
