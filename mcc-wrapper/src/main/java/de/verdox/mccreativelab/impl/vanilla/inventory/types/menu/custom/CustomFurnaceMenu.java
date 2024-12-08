package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu.custom;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.FurnaceMenu;

public class CustomFurnaceMenu extends FurnaceMenu implements CustomMenu {
    public CustomFurnaceMenu(int syncId, Inventory playerInventory, Container inventory, ContainerData propertyDelegate) {
        super(syncId, playerInventory, inventory, propertyDelegate);
    }
}
