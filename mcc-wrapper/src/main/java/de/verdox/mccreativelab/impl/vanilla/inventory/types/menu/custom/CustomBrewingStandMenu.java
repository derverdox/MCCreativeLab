package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu.custom;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.BrewingStandMenu;
import net.minecraft.world.inventory.ContainerData;

public class CustomBrewingStandMenu extends BrewingStandMenu implements CustomMenu {
    public CustomBrewingStandMenu(int syncId, Inventory playerInventory, Container inventory, ContainerData propertyDelegate) {
        super(syncId, playerInventory, inventory, propertyDelegate);
    }
}
