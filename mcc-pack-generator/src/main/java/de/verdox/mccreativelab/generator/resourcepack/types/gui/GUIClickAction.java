package de.verdox.mccreativelab.generator.resourcepack.types.gui;

import de.verdox.mccreativelab.wrapper.entity.types.MCCPlayer;
import de.verdox.mccreativelab.wrapper.event.MCCCancellable;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCInventoryAction;
import de.verdox.mccreativelab.wrapper.inventory.MCCInventoryClickType;
import de.verdox.mccreativelab.wrapper.inventory.MCCInventorySlotType;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;

public class GUIClickAction implements MCCCancellable {
    private final MCCContainer clickedContainer;
    private final MCCPlayer entityClicking;
    private final boolean isUpperInventoryClicked;
    private final int clickedSlot;
    private final int clickedRawSlot;
    private final MCCItemStack clickedItem;
    private final MCCItemStack cursorItem;
    private final MCCInventorySlotType slotType;
    private final MCCInventoryClickType clickType;
    private final MCCInventoryAction inventoryAction;
    private boolean cancelled;

    public GUIClickAction(MCCContainer clickedContainer, MCCPlayer entityClicking, boolean isUpperInventoryClicked, int clickedSlot, int clickedRawSlot, MCCItemStack clickedItem, MCCItemStack cursorItem, MCCInventorySlotType slotType, MCCInventoryClickType clickType, MCCInventoryAction inventoryAction) {
        this.clickedContainer = clickedContainer;
        this.entityClicking = entityClicking;
        this.isUpperInventoryClicked = isUpperInventoryClicked;
        this.clickedSlot = clickedSlot;
        this.clickedRawSlot = clickedRawSlot;
        this.clickedItem = clickedItem;
        this.cursorItem = cursorItem;
        this.slotType = slotType;
        this.clickType = clickType;
        this.inventoryAction = inventoryAction;
    }

    public MCCContainer getClickedContainer() {
        return clickedContainer;
    }

    public MCCItemStack getClickedItem() {
        return clickedItem;
    }

    public MCCItemStack getCursorItem() {
        return cursorItem;
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
