package de.verdox.mccreativelab.wrapper.inventory.types.menu.creator;

import de.verdox.mccreativelab.wrapper.entity.types.MCCPlayer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerMenu;
import net.kyori.adventure.text.Component;

public interface MenuCreatorInstance<F extends MCCContainerMenu<?, ?>> {
    F createMenuForPlayer(MCCPlayer player, Component title);
}
