package de.verdox.mccreativelab.wrapper.inventory;

/**
 * Represents an object that has only one container
 */
public interface ContainerHolder<C extends MCCContainer> {
    C getContainer();
}
