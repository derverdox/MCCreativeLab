package de.verdox.mccreativelab.wrapper.inventory.factory;

import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerMenu;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import net.kyori.adventure.text.Component;

/**
 * A container provider is an element that is used to create instances of containers.
 *
 * @param <C>
 */
public interface ContainerProvider<C extends MCCContainerMenu<?>> {
    /**
     * Sets the title of the container provided
     *
     * @param title the title
     */
    void setTitle(Component title);

    /**
     * Gets the title of the container provided
     *
     * @return the title
     */
    Component getTitle();

    /**
     * Creates a container view for the player
     *
     * @param player the player
     * @return the container
     */
    C createMenuForPlayer(MCCPlayer player);

    /**
     * The origin of the provider. Must be in a loaded chunk.
     *
     * @return the origin
     */
    MCCLocation origin();
}
