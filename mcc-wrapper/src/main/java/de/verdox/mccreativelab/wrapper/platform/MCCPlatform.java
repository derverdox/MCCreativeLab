package de.verdox.mccreativelab.wrapper.platform;

import de.verdox.mccreativelab.Singleton;
import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.event.MCCEvent;
import de.verdox.mccreativelab.wrapper.inventory.factory.MCCContainerFactory;
import org.jetbrains.annotations.Nullable;

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


    void callEvent(MCCEvent mccEvent);


    @Nullable MCCPlayer getOnlinePlayer(UUID uuid);

}
