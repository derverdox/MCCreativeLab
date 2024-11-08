package de.verdox.mccreativelab.wrapper.inventory.factory;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import net.kyori.adventure.text.Component;

public interface ContainerFabricator {
    MCCContainer fabricate(Component component);

    /**
     * Returns the menu type of this fabricator
     *
     * @return the menu type
     */
    MCCMenuType getMenuType();
}
