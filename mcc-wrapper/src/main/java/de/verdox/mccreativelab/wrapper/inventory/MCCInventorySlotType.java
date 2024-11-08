package de.verdox.mccreativelab.wrapper.inventory;

/**
 * The type of a slot in a container
 */
public enum MCCInventorySlotType {
    /**
     * A result slot in a furnace or crafting inventory.
     */
    RESULT,
    /**
     * A slot in the crafting matrix, or an 'input' slot.
     */
    CRAFTING,
    /**
     * An armour slot in the player's inventory.
     */
    ARMOR,
    /**
     * A regular slot in the container or the player's inventory; anything
     * not covered by the other enum values.
     */
    CONTAINER,
    /**
     * A slot in the bottom row or quickbar.
     */
    QUICKBAR,
    /**
     * A pseudo-slot representing the area outside the inventory window.
     */
    OUTSIDE,
    /**
     * The fuel slot in a furnace inventory, or the ingredient slot in a
     * brewing stand inventory.
     */
    FUEL;
}
