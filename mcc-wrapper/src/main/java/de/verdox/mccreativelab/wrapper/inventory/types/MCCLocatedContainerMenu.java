package de.verdox.mccreativelab.wrapper.inventory.types;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCContainerSource;

/**
 * Represents a menu that is connected to a location
 */
public interface MCCLocatedContainerMenu<T extends MCCContainerSource, C extends MCCContainer> extends MCCContainerMenu<T, C> {
}
