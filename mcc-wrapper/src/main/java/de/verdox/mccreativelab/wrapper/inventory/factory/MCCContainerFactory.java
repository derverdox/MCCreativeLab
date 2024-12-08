package de.verdox.mccreativelab.wrapper.inventory.factory;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import de.verdox.mccreativelab.wrapper.inventory.types.MCCLocatedContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.MCCPrivateContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.MCCSharedContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.creator.LocationBasedMenuCreatorInstance;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.creator.MenuCreatorInstance;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.creator.SharedMenuCreatorInstance;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.NotNull;

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
     * Creates a located menu creator instance with a provided location
     *
     * @param menuType the menu type
     * @param location the location
     * @param <F>      the generic menu type
     * @return the creator instance
     */
    <F extends MCCLocatedContainerMenu<?, ?>> LocationBasedMenuCreatorInstance<F> createLocated(MCCMenuType<F> menuType, @NotNull MCCLocation location);

    /**
     * Creates a shared menu creator instance with a provided container
     *
     * @param menuType  the menu type
     * @param container the container
     * @param <C>       the generic container type
     * @param <F>       the generic menu type
     * @return the creator instance
     */
    <C extends MCCContainer, F extends MCCSharedContainerMenu<?, ?>> SharedMenuCreatorInstance<C, F> createShared(MCCMenuType<F> menuType, @NotNull C container);

    /**
     * Creates a private menu creator
     *
     * @param menuType the menu type
     * @param <F>      the generic menu type
     * @return the creator instance
     */
    <F extends MCCPrivateContainerMenu<?, ?>> MenuCreatorInstance<F> createPrivate(MCCMenuType<F> menuType);

    /**
     * Creates a menu regardless of its type from standard values already provided to this container factory
     *
     * @param menuType the menu type
     * @param <F>      the generic menu type
     * @return the creator instance
     */
    <F extends MCCContainerMenu<?, ?>> MenuCreatorInstance<F> create(MCCMenuType<F> menuType);
}
