package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu.custom;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.MerchantMenu;
import net.minecraft.world.item.trading.Merchant;

public class CustomMerchantMenu extends MerchantMenu implements CustomMenu {
    public CustomMerchantMenu(int syncId, Inventory playerInventory, Merchant merchant) {
        super(syncId, playerInventory, merchant);
    }

    public CustomMerchantMenu(int syncId, Inventory playerInventory) {
        super(syncId, playerInventory);
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }
}
