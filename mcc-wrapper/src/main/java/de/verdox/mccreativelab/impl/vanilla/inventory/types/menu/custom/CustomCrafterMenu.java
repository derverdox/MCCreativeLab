package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu.custom;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.CrafterMenu;
import net.minecraft.world.inventory.CraftingContainer;

public class CustomCrafterMenu extends CrafterMenu implements CustomMenu {
    public CustomCrafterMenu(int syncId, Inventory playerInventory, CraftingContainer inputInventory, ContainerData propertyDelegate) {
        super(syncId, playerInventory, inputInventory, propertyDelegate);
    }

    public CustomCrafterMenu(int syncId, Inventory playerInventory) {
        super(syncId, playerInventory);
    }
}
