package de.verdox.mccreativelab.wrapper.inventory.types.menu.creator;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.MCCLocatedContainerMenu;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;

public interface LocationBasedMenuCreatorInstance<F extends MCCLocatedContainerMenu<?, ?>> extends MenuCreatorInstance<F> {
    MCCLocation getLocation();
}
