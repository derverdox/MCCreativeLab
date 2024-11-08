package de.verdox.mccreativelab.wrapper.inventory.factory;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

/**
 * Used to create containers of a specific menu type.
 * If custom menu types are registered their creation process needs to be registered to the container factory
 */
public abstract class MCCContainerFactory {

    private static final Map<MCCMenuType, ContainerFabricator> fabricators = new HashMap<>();

    /**
     * Used to create a container of a specific menu type
     *
     * @param mccMenuType the menu type
     * @param component   the title
     * @return
     */
    public abstract MCCContainer createContainer(MCCMenuType mccMenuType, Component component);

    /**
     * Registers a container fabricator for a specific menu type.
     *
     * @param mccMenuType         the menu type
     * @param containerFabricator the fabricator
     */
    public void registerFabricator(MCCMenuType mccMenuType, ContainerFabricator containerFabricator) {
        fabricators.put(mccMenuType, containerFabricator);
    }

    /**
     * Gets the fabricator for a specific menu type
     *
     * @param mccMenuType the menu type
     * @return the fabricator or null if no fabricator was found
     */
    public @Nullable ContainerFabricator getFabricator(MCCMenuType mccMenuType) {
        return fabricators.getOrDefault(mccMenuType, null);
    }
}
