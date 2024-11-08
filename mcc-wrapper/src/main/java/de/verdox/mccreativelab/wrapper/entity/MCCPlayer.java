package de.verdox.mccreativelab.wrapper.entity;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import org.jetbrains.annotations.Nullable;

/**
 * Represents a player on a minecraft server
 */
public interface MCCPlayer extends MCCEntity, ContainerViewer {
    /**
     * Gets the inventory of the player
     *
     * @return the inventory
     */
    MCCContainer getInventory();

    /**
     * Returns the item on the player's cursor. If no item is on the players cursor null is returned instead
     *
     * @return the item on the cursor if available
     */
    @Nullable MCCItemStack getCursorItem();

    /**
     * Sets the item on the player's cursor.
     * If the player does not have an inventory open this function will do nothing instead.
     *
     * @param mccItemStack the item stack to put on the players cursor
     */
    void setCursorItem(MCCItemStack mccItemStack);
}
