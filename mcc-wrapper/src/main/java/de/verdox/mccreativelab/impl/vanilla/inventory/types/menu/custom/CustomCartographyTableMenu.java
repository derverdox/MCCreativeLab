package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu.custom;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.CartographyTableMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;

public class CustomCartographyTableMenu extends CartographyTableMenu implements CustomMenu {
    public CustomCartographyTableMenu(int syncId, Inventory inventory, ContainerLevelAccess context) {
        super(syncId, inventory, context);
    }
}
