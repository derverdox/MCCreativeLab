package de.verdox.mccreativelab.wrapper.inventory.types;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCContainerSource;

/**
 * Represents a menu that can be viewed by one client
 *
 * @param <T>
 * @param <C>
 */
public interface MCCPrivateContainerMenu<T extends MCCContainerSource, C extends MCCContainer> extends MCCContainerMenu<T, C> {
}
