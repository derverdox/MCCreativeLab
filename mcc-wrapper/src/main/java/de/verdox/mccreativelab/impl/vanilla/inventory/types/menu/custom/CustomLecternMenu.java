package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu.custom;

import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.LecternMenu;

public class CustomLecternMenu extends LecternMenu implements CustomMenu {
    public CustomLecternMenu(int syncId, Inventory playerinventory, Container container, ContainerData containerData) {
        super(syncId, container, containerData, playerinventory);
    }
}
