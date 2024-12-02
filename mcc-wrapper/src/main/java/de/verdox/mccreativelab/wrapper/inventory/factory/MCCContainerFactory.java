package de.verdox.mccreativelab.wrapper.inventory.factory;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerMenu;
import org.checkerframework.checker.index.qual.Positive;

/**
 * Used to create containers of a specific menu type.
 * If custom menu types are registered their creation process needs to be registered to the container factory
 */
public interface MCCContainerFactory {
    /**
     * Creates a simple container that stores item stacks
     *
     * @param size the size of the container
     * @return the container
     */
    MCCContainer createSimpleContainer(@Positive int size);

    /**
     * Creates a menu with the given container as input for a given player
     *
     * @param menuType  the menu type
     * @param container the container the menu should operate on
     * @param player    the player the menu is constructed for
     * @param <C>       the container type
     * @param <M>       the menu type
     * @return the constructed menu
     */
    <C extends MCCContainer, M extends MCCContainerMenu<?, C>> M openMenuOnContainer(TypeToken<M> menuType, MCCPlayer player, C container);
}
