package de.verdox.mccreativelab.impl.vanilla.platform;

import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.event.MCCEvent;
import de.verdox.mccreativelab.wrapper.inventory.factory.MCCContainerFactory;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.platform.MCCTaskManager;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

public class NMSPlatform implements MCCPlatform {

    @Override
    public MCCContainerFactory getContainerFactory() {
        return null;
    }

    @Override
    public MCCTaskManager getTaskManager() {
        return null;
    }

    @Override
    public void callEvent(MCCEvent mccEvent) {

    }

    @Override
    public @Nullable MCCPlayer getOnlinePlayer(UUID uuid) {
        return null;
    }
}
