package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu.custom;

import net.minecraft.world.Container;
import net.minecraft.world.inventory.BeaconMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.ContainerLevelAccess;

public class CustomBeaconMenu extends BeaconMenu implements CustomMenu {
    public CustomBeaconMenu(int syncId, Container inventory, ContainerData propertyDelegate, ContainerLevelAccess context) {
        super(syncId, inventory, propertyDelegate, context);
    }
}
