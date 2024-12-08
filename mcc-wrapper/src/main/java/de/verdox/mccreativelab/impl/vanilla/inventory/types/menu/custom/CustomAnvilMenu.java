package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu.custom;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AnvilMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;

public class CustomAnvilMenu extends AnvilMenu implements CustomMenu {
    public CustomAnvilMenu(int syncId, Inventory inventory, ContainerLevelAccess context) {
        super(syncId, inventory, context);
    }
}
