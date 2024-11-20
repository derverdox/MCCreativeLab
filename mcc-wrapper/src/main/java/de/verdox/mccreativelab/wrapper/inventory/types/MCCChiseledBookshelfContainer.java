package de.verdox.mccreativelab.wrapper.inventory.types;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;

public interface MCCChiseledBookshelfContainer extends MCCContainer<MCCBlockContainerSource> {
    @Override
    default boolean canBeOpened() {
        return false;
    }
}
