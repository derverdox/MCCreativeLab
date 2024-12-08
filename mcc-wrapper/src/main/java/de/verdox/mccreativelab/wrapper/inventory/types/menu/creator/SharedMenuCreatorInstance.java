package de.verdox.mccreativelab.wrapper.inventory.types.menu.creator;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.MCCSharedContainerMenu;

/**
 * Creates menus that share the same container and can be viewed by multiple viewers.
 *
 * @param <F> the generic container menu type
 */
public interface SharedMenuCreatorInstance<C extends MCCContainer, F extends MCCSharedContainerMenu<?, ?>> extends MenuCreatorInstance<F> {
    C getSharedContainer();

    boolean isRightContainerSize(C mccContainer);
}
