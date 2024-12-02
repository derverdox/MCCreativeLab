package de.verdox.mccreativelab.wrapper.inventory.factory;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;

/**
 * Used to create containers of a specific menu type.
 * If custom menu types are registered their creation process needs to be registered to the container factory
 */
public interface MCCContainerFactory {
    /**
     * Used to create a container provider that resides at a specific location. This location must be in a loaded world in a loaded chunk but does not
     * have to be in proximity to the players that open the menu. All players who access the inventory have the same view.
     *
     * @param mccMenuType the menu type
     * @param mccLocation the location
     * @return the container provider
     */
    ContainerProvider<?> createContainerProvider(MCCMenuType mccMenuType, MCCLocation mccLocation);

    /**
     * Creates a dummy provider that always provides the parameter container
     *
     * @param existingContainer the existing container to provide
     * @return the dummy provider
     */
    ContainerProvider<?> fromExistingContainer(MCCContainerMenu<?> existingContainer);
}
