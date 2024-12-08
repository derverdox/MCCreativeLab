package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu.custom;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.HopperMenu;

public class CustomHopperMenu extends HopperMenu implements CustomMenu {
    public CustomHopperMenu(int syncId, Inventory playerInventory, Container inventory) {
        super(syncId, playerInventory, inventory);
    }
}
