package de.verdox.mccreativelab.wrapper.inventory.types;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;

public interface MCCChestContainer extends MCCContainer<MCCBlockContainerSource> {
    @Override
    default boolean canBeOpened() {
        return true;
    }
}
