package de.verdox.mccreativelab.generator.resourcepack.types.gui;

import de.verdox.mccreativelab.wrapper.entity.types.MCCPlayer;
import de.verdox.mccreativelab.wrapper.event.MCCCancellable;
import de.verdox.mccreativelab.wrapper.inventory.MCCInventoryAction;
import de.verdox.mccreativelab.wrapper.inventory.MCCInventoryClickType;
import de.verdox.mccreativelab.wrapper.inventory.MCCInventorySlotType;

public class GUIClickAction implements MCCCancellable {
    private final MCCPlayer entityClicking;
    private final boolean isUpperInventoryClicked;
    private final int clickedSlot;
    private final int clickedRawSlot;
    private final MCCInventorySlotType slotType;
    private final MCCInventoryClickType clickType;
    private final MCCInventoryAction inventoryAction;
    private boolean cancelled;

    public GUIClickAction(MCCPlayer entityClicking,boolean isUpperInventoryClicked, int clickedSlot, int clickedRawSlot, MCCInventorySlotType slotType, MCCInventoryClickType clickType, MCCInventoryAction inventoryAction) {
        this.entityClicking = entityClicking;
        this.isUpperInventoryClicked = isUpperInventoryClicked;
        this.clickedSlot = clickedSlot;
        this.clickedRawSlot = clickedRawSlot;
        this.slotType = slotType;
        this.clickType = clickType;
        this.inventoryAction = inventoryAction;
    }

    public int getClickedRawSlot() {
        return clickedRawSlot;
    }

    public MCCPlayer getEntityClicking() {
        return entityClicking;
    }

    public boolean isUpperInventoryClicked() {
        return isUpperInventoryClicked;
    }

    public int getClickedSlot() {
        return clickedSlot;
    }

    public MCCInventoryAction getInventoryAction() {
        return inventoryAction;
    }

    public MCCInventoryClickType getClickType() {
        return clickType;
    }

    public MCCInventorySlotType getSlotType() {
        return slotType;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
