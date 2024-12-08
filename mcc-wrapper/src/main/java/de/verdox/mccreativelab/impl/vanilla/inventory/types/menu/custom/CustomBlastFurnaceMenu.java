package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu.custom;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.BlastFurnaceMenu;
import net.minecraft.world.inventory.ContainerData;

public class CustomBlastFurnaceMenu extends BlastFurnaceMenu implements CustomMenu {
    public CustomBlastFurnaceMenu(int syncId, Inventory playerInventory, Container inventory, ContainerData propertyDelegate) {
        super(syncId, playerInventory, inventory, propertyDelegate);
    }
}
