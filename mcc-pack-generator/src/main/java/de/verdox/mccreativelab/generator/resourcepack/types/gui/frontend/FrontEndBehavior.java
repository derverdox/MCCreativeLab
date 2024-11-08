package de.verdox.mccreativelab.generator.resourcepack.types.gui.frontend;

import de.verdox.mccreativelab.generator.resourcepack.types.gui.ActiveGUI;
import de.verdox.mccreativelab.generator.resourcepack.types.gui.ClickableItem;
import de.verdox.mccreativelab.generator.resourcepack.types.gui.GUIClickAction;
import de.verdox.mccreativelab.generator.resourcepack.types.gui.PlayerGUIStack;
import de.verdox.mccreativelab.generator.resourcepack.types.gui.element.active.ActiveGUIElement;
import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.event.MCCCancellable;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerCloseReason;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;

import java.util.List;
import java.util.Set;

public abstract class FrontEndBehavior {
    private static final long SHIFT_COOLDOWN_MILLIS = 20;
    private final ActiveGUI activeGUI;
    private long lastShift = System.currentTimeMillis();


    public FrontEndBehavior(ActiveGUI activeGUI) {
        this.activeGUI = activeGUI;
    }

    public void clickBehavior(GUIClickAction clickAction) {
        try {
            MCCPlayer player = clickAction.getEntityClicking();
            synchronized (activeGUI.getViewers()) {
                if (!activeGUI.getViewers().contains(player.asAudience()))
                    return;
            }

            int rawSlot = clickAction.getClickedRawSlot();
            if (activeGUI.getIndexToClickableItemMapping().containsKey(rawSlot)) {
                clickAction.setCancelled(true);

                ClickableItem clickableItem = activeGUI.getIndexToClickableItemMapping().get(rawSlot);
                clickableItem.getOnClick().accept(clickAction, activeGUI);

                if (clickableItem.getBuilder().clearGUIStackAndClose) {
                    PlayerGUIStack.load(player).clear();

                    player.closeCurrentInventory(MCCContainerCloseReason.CLOSE_CUSTOM_GUI);
                } else if (clickableItem.getBuilder().popGUIStack) {
                    PlayerGUIStack.load(player).popAndOpenLast(player, activeGUI);
                }

                if (activeGUI.getComponentRendered().getClickConsumer() != null)
                    activeGUI.getComponentRendered().getClickConsumer().accept(clickAction, activeGUI);

                return;
            }


            ActiveGUIElement<?> activeGUIElement = activeGUI.getGuiElementsBySlot().getOrDefault(rawSlot, null);


            if (activeGUI.getComponentRendered().isSlotBlocked(rawSlot) && clickAction.isUpperInventoryClicked()) {
                clickAction.setCancelled(true);
                if (activeGUIElement != null)
                    activeGUIElement.onClick(clickAction, rawSlot % 9, rawSlot / 9);
            }
            // Prevent inventory clicks if is using player slots
            if (activeGUI.getComponentRendered().isUsePlayerSlots() && !clickAction.isUpperInventoryClicked())
                clickAction.setCancelled(true);

            if (clickAction.getClickType().isShiftClick() && !clickAction.isUpperInventoryClicked()) {
                if (activeGUI.getComponentRendered().isUsePlayerSlots() || System.currentTimeMillis() - lastShift < SHIFT_COOLDOWN_MILLIS) {
                    clickAction.setCancelled(true);
                    return;
                }
                lastShift = System.currentTimeMillis();


                shiftItemToInventory(player.getInventory(), activeGUI.getVanillaInventory(), clickAction.getClickedSlot(), activeGUI.getComponentRendered().getBlockedSlots());
                clickAction.setCancelled(true);
            }

            if (activeGUI.getComponentRendered().getClickConsumer() != null)
                activeGUI.getComponentRendered().getClickConsumer().accept(clickAction, activeGUI);
        } finally {
            activeGUI.forceUpdate();
        }
    }

    public void onDrag(MCCPlayer clicker, List<Integer> involvedSlots, MCCCancellable dragAction) {
        synchronized (activeGUI.getViewers()) {
            if (!activeGUI.getViewers().contains(clicker.asAudience()))
                return;
        }
        var rawSlotUsed = involvedSlots.stream().anyMatch(activeGUI.getComponentRendered()::isSlotBlocked);
        if (rawSlotUsed)
            dragAction.setCancelled(true);
    }

    public void onClose(MCCPlayer closingPlayer, MCCContainerCloseReason closeReason) {
        synchronized (activeGUI.getViewers()) {
            if (!activeGUI.getViewers().contains(closingPlayer.asAudience()))
                return;
        }

        // A player is in this update whitelist if we reopen the updated inventory to the player
        // Since this forced InventoryCloseEvent should not be
        synchronized (activeGUI.getInventoryUpdateWhitelist()) {
            if (activeGUI.getInventoryUpdateWhitelist().contains(closingPlayer.getUUID()))
                return;
        }
        removePlayerFromGUI(closingPlayer, closeReason);
    }

    public void removePlayerFromGUI(MCCPlayer player, MCCContainerCloseReason reason) {
        synchronized (activeGUI.getViewers()) {
            //Bukkit.getLogger().info("Removing player " + player.getName() + " from gui " + getComponentRendered().getKey().asString());
            activeGUI.getViewers().remove(player.asAudience());


            if (activeGUI.equals(ActiveGUI.PlayerGUIData.getCurrentActiveGUI(player))) {
                ActiveGUI.PlayerGUIData.trackCurrentActiveGUI(player, null);
            }

            FakeInventory.stopFakeInventoryOfPlayer(player);
            player.updateInventory();
        }
    }

    public void openToPlayer(MCCPlayer player) {
        ActiveGUI currentActiveGUI = ActiveGUI.PlayerGUIData.getCurrentActiveGUI(player);
        if (currentActiveGUI != null) {
            if (currentActiveGUI.equals(this))
                return;

            //Bukkit.getLogger().info("Before opening " + getComponentRendered().getKey().asString() + " we must remove the player from " + currentActiveGUI.getComponentRendered().getKey().asString());
            currentActiveGUI.frontEndBehavior.removePlayerFromGUI(player, MCCContainerCloseReason.OPEN_NEW);
        }

        addPlayerToGUI(player);
    }

    private void addPlayerToGUI(MCCPlayer player) {
        synchronized (viewers) {
            if (viewers.contains(player.asAudience()))
                return;
            //Bukkit.getLogger().info("Adding player " + player.getName() + " to gui " + getComponentRendered().getKey().asString());
            ActiveGUI.PlayerGUIData.trackCurrentActiveGUI(player, this);
            viewers.add(player.asAudience());
        }
        startFrontEnd(getComponentRendered());
        if (activeGUI.getComponentRendered().onOpen != null) {
            activeGUI.getComponentRendered().onOpen.accept(this);
        }
    }

    public abstract void onFrontendClose();
    public abstract void onFrontendRenderStart();

    private void shiftItemToInventory(MCCContainer sourceInventory, MCCContainer targetInventory, int sourceSlot, Set<Integer> blockedSlots) {
        int targetSlot = 0;

        MCCItemStack itemStack = sourceInventory.getItem(sourceSlot);

        // Überprüfe, ob das Item im Quell-Slot vorhanden ist
        if (itemStack == null) {
            return; // Beende die Funktion, wenn kein Item im Quell-Slot ist
        }

        // Überprüfe, ob alle Slots blockiert sind
        boolean allSlotsBlocked = true;
        for (int i = 0; i < targetInventory.getSize(); i++) {
            if (!blockedSlots.contains(i)) {
                allSlotsBlocked = false;
                break;
            }
        }

        if (allSlotsBlocked)
            return; // Beende die Funktion, wenn alle Slots blockiert sind

        // Iteriere über alle Slots im Ziel-Inventar
        for (int i = 0; i < targetInventory.getSize(); i++) {
            // Überprüfe, ob der aktuelle Slot blockiert ist
            if (blockedSlots.contains(i))
                continue; // Überspringe den aktuellen Slot und gehe zum nächsten

            MCCItemStack currentSlotItem = targetInventory.getItem(i);

            // Überprüfe, ob der aktuelle Slot leer ist
            if (currentSlotItem == null) {
                targetInventory.setItem(i, itemStack);
                sourceInventory.setItem(sourceSlot, null); // Entferne das Item aus dem Quell-Inventar
                return; // Das Item wurde verschoben, beende die Funktion
            }

            // Überprüfe, ob das Item im aktuellen Slot vom gleichen Typ und stapelbar ist
            if (currentSlotItem.isSimilar(itemStack) && currentSlotItem.getAmount() < currentSlotItem.getMaxStackSize()) {
                int spaceLeft = currentSlotItem.getMaxStackSize() - currentSlotItem.getAmount();
                int amountToMove = Math.min(spaceLeft, itemStack.getAmount());

                currentSlotItem.setAmount(currentSlotItem.getAmount() + amountToMove);
                itemStack.setAmount(itemStack.getAmount() - amountToMove);

                if (itemStack.getAmount() == 0) {
                    sourceInventory.setItem(sourceSlot, null); // Entferne das Item aus dem Quell-Inventar
                    return; // Das gesamte Item wurde verschoben, beende die Funktion
                }
            }

            targetSlot++;
        }

        // Falls alle Slots blockiert waren oder kein passender Slot gefunden wurde,
        // wird das Item nicht verschoben
    }
}
