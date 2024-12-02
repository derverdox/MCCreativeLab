package de.verdox.mccreativelab.wrapper.inventory.types.menu.horse;

import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import org.bukkit.inventory.AbstractHorseInventory;

public interface MCCArmoredHorseInventoryContainer extends AbstractHorseInventory {

    /**
     * Gets the item in the horse's armor slot.
     *
     * @return the armor item
     */
    MCCItemStack getArmor();

    /**
     * Sets the item in the horse's armor slot.
     *
     * @param stack the new item
     */
    void setArmor(MCCItemStack stack);
}
