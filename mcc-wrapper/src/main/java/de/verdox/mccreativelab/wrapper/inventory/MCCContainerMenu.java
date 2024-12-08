package de.verdox.mccreativelab.wrapper.inventory;

import de.verdox.mccreativelab.wrapper.annotations.MCCLogic;
import de.verdox.mccreativelab.wrapper.entity.ContainerViewer;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCContainerSource;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

/**
 * Describes a minecraft menu
 */
public interface MCCContainerMenu<T extends MCCContainerSource, C extends MCCContainer> extends Iterable<MCCItemStack>, ContainerHolder<C> {
    /**
     * Gets the {@link MCCMenuType} of the container
     *
     * @return the type
     */
    MCCMenuType getType();

    /**
     * Changes the title of the inventory and reopens it to all viewers
     *
     * @param component the new title of the inventory
     */
    void setTitle(Component component);

    /**
     * Returns the title of the container
     *
     * @return the title
     */
    Component getTitle();

    /**
     * Closes the inventory for every viewer
     */
    @MCCLogic
    void close();

    /**
     * Returns all viewers that currently view the container
     *
     * @return the viewers
     */
    @MCCLogic
    Set<ContainerViewer> getViewers();

    /**
     * Returns the container source of this container. Might be null if the container was created by the server software instead of being from a real game element.
     *
     * @return the source or null if no source is available
     */
    @Nullable
    @MCCLogic
    T getSource();
}
