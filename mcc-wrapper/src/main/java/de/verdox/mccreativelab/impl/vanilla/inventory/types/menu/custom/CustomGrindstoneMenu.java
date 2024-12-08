package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu.custom;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.GrindstoneMenu;

public class CustomGrindstoneMenu extends GrindstoneMenu implements CustomMenu {
    public CustomGrindstoneMenu(int syncId, Inventory playerInventory, ContainerLevelAccess context) {
        super(syncId, playerInventory, context);
    }
}
