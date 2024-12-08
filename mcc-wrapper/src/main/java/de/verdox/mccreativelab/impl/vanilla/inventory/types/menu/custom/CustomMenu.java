package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu.custom;

import net.minecraft.world.entity.player.Player;

public interface CustomMenu {
    default boolean stillValid(Player player) {
        return true;
    }
}
