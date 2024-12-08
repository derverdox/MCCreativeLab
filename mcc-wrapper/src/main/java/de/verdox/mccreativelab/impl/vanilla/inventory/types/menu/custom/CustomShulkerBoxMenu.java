package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu.custom;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ShulkerBoxMenu;

public class CustomShulkerBoxMenu extends ShulkerBoxMenu implements CustomMenu {
    public CustomShulkerBoxMenu(int syncId, Inventory playerInventory, Container inventory) {
        super(syncId, playerInventory, inventory);
    }
}
