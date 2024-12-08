package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu.custom;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.MenuType;

public class CustomChestMenu extends ChestMenu implements CustomMenu {
    public CustomChestMenu(MenuType<?> type, int syncId, Inventory playerInventory, Container inventory, int rows) {
        super(type, syncId, playerInventory, inventory, rows);
    }
}
