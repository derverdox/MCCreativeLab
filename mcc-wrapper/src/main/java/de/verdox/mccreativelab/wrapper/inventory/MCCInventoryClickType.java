package de.verdox.mccreativelab.wrapper.inventory;

/**
 * What the client did to trigger this action (not the result).
 */
public enum MCCInventoryClickType {

    /**
     * The left (or primary) mouse button.
     */
    LEFT,
    /**
     * Holding shift while pressing the left mouse button.
     */
    SHIFT_LEFT,
    /**
     * The right mouse button.
     */
    RIGHT,
    /**
     * Holding shift while pressing the right mouse button.
     */
    SHIFT_RIGHT,
    /**
     * Clicking the left mouse button on the grey area around the inventory.
     */
    WINDOW_BORDER_LEFT,
    /**
     * Clicking the right mouse button on the grey area around the inventory.
     */
    WINDOW_BORDER_RIGHT,
    /**
     * The middle mouse button, or a "scrollwheel click".
     */
    MIDDLE,
    /**
     * One of the number keys 1-9, correspond to slots on the hotbar.
     */
    NUMBER_KEY,
    /**
     * Pressing the left mouse button twice in quick succession.
     */
    DOUBLE_CLICK,
    /**
     * The "Drop" key (defaults to Q).
     */
    DROP,
    /**
     * Holding Ctrl while pressing the "Drop" key (defaults to Q).
     */
    CONTROL_DROP,
    /**
     * Any action done with the Creative inventory open.
     */
    CREATIVE,
    /**
     * The "swap item with offhand" key (defaults to F).
     */
    SWAP_OFFHAND,
    /**
     * A type of inventory manipulation not yet recognized by Bukkit.
     * <p>
     * This is only for transitional purposes on a new Minecraft update, and
     * should never be relied upon.
     * <p>
     * Any MCCClickAction.UNKNOWN is called on a best-effort basis.
     */
    UNKNOWN,
    ;

    /**
     * Gets whether this MCCClickAction represents the pressing of a key on a
     * keyboard.
     *
     * @return true if this MCCClickAction represents the pressing of a key
     */
    public boolean isKeyboardClick() {
        return (this == MCCInventoryClickType.NUMBER_KEY) || (this == MCCInventoryClickType.DROP) || (this == MCCInventoryClickType.CONTROL_DROP) || (this == MCCInventoryClickType.SWAP_OFFHAND);
    }

    /**
     * Gets whether this MCCClickAction represents the pressing of a mouse button
     *
     * @return true if this MCCClickAction represents the pressing of a mouse button
     */
    public boolean isMouseClick() {
        return (this == MCCInventoryClickType.DOUBLE_CLICK) || (this == MCCInventoryClickType.LEFT) || (this == MCCInventoryClickType.RIGHT) || (this == MCCInventoryClickType.MIDDLE)
            || (this == MCCInventoryClickType.WINDOW_BORDER_LEFT) || (this == MCCInventoryClickType.SHIFT_LEFT) || (this == MCCInventoryClickType.SHIFT_RIGHT) || (this == MCCInventoryClickType.WINDOW_BORDER_RIGHT);
    }

    /**
     * Gets whether this MCCClickAction represents an action that can only be
     * performed by a Player in creative mode.
     *
     * @return true if this action requires Creative mode
     */
    public boolean isCreativeAction() {
        // Why use middle click?
        return (this == MCCInventoryClickType.MIDDLE) || (this == MCCInventoryClickType.CREATIVE);
    }

    /**
     * Gets whether this MCCClickAction represents a right click.
     *
     * @return true if this MCCClickAction represents a right click
     */
    public boolean isRightClick() {
        return (this == MCCInventoryClickType.RIGHT) || (this == MCCInventoryClickType.SHIFT_RIGHT);
    }

    /**
     * Gets whether this MCCClickAction represents a left click.
     *
     * @return true if this MCCClickAction represents a left click
     */
    public boolean isLeftClick() {
        return (this == MCCInventoryClickType.LEFT) || (this == MCCInventoryClickType.SHIFT_LEFT) || (this == MCCInventoryClickType.DOUBLE_CLICK) || (this == MCCInventoryClickType.CREATIVE);
    }

    /**
     * Gets whether this MCCClickAction indicates that the shift key was pressed
     * down when the click was made.
     *
     * @return true if the action uses Shift.
     */
    public boolean isShiftClick() {
        return (this == MCCInventoryClickType.SHIFT_LEFT) || (this == MCCInventoryClickType.SHIFT_RIGHT);
    }
}
