package de.verdox.mccreativelab.impl.vanilla.inventory.factory.creator;

import de.verdox.mccreativelab.impl.vanilla.inventory.types.menu.custom.CustomMenu;
import net.minecraft.world.entity.player.Inventory;

public interface CustomMenuCreator<F extends CustomMenu> {
    F create(int syncId, Inventory playerInventory);
}
