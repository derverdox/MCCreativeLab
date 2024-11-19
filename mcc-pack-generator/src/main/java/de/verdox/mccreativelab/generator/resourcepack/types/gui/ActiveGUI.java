package de.verdox.mccreativelab.generator.resourcepack.types.gui;

import de.verdox.mccreativelab.generator.resourcepack.types.gui.element.active.ActiveGUIElement;
import de.verdox.mccreativelab.generator.resourcepack.types.gui.frontend.FrontEndBehavior;
import de.verdox.mccreativelab.generator.resourcepack.types.rendered.ActiveComponentRendered;
import de.verdox.mccreativelab.platform.GeneratorPlatformHelper;
import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerCloseReason;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.platform.MCCTask;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ActiveGUI extends ActiveComponentRendered<ActiveGUI, CustomGUIBuilder> {
    private final Map<String, ActiveGUIElement<?>> activeGUIElements = new HashMap<>();
    private final Map<Integer, ActiveGUIElement<?>> guiElementsBySlot = new HashMap<>();

    private MCCTask updateTask;
    private FrontEndRenderer frontEndRenderer;

    private final AtomicBoolean isUpdating = new AtomicBoolean();
    private final AtomicReference<MCCContainer> inventory = new AtomicReference<>();

    private final Map<Integer, ClickableItem> indexToClickableItemMapping = new HashMap<>();

    private final Set<UUID> inventoryUpdateWhitelist = new HashSet<>();
    private boolean setup;
    private FrontEndBehavior frontEndBehavior;

    public ActiveGUI(CustomGUIBuilder customGUIBuilder, @Nullable Consumer<ActiveGUI> initialSetup) {
        super(customGUIBuilder);
        customGUIBuilder.checkInstalled();

        customGUIBuilder.guiElements.forEach((s, guiElement) -> {
            var activeElement = guiElement.toActiveElement(this);
            activeGUIElements.put(s, activeElement);
        });

        this.frontEndBehavior = GeneratorPlatformHelper.INSTANCE.get().createFrondEndBehavior(this);

        this.inventory.set(createInventory(render()));

        if (initialSetup != null) {
            initialSetup.accept(this);
            forEachElementBehavior((activeGUIRenderedRenderedElementBehavior, rendered, a) -> activeGUIRenderedRenderedElementBehavior.onOpen(this, rendered, a), true);
            forEachGUIElementBehavior((guiElementBehavior, activeGUIElement) -> guiElementBehavior.onOpen(this, activeGUIElement));
        }
    }

    public Map<Integer, ActiveGUIElement<?>> getGuiElementsBySlot() {
        return Map.copyOf(guiElementsBySlot);
    }

    public Map<Integer, ClickableItem> getIndexToClickableItemMapping() {
        return Map.copyOf(indexToClickableItemMapping);
    }

    public Set<UUID> getInventoryUpdateWhitelist() {
        return inventoryUpdateWhitelist;
    }

    /**
     * We are able to reopen an existing inventory with a new title without creating a new inventory object.
     * Thus, we use this constructor to link a custom gui to an existing inventory
     *
     * @param customGUIBuilder The customGUIBuilder this belongs to
     * @param inventory        The inventory that is linked to this CustomGUI
     * @param initialSetup     The initial setup
     */

    public ActiveGUI(CustomGUIBuilder customGUIBuilder, MCCContainer inventory, @Nullable Consumer<ActiveGUI> initialSetup) {
        super(customGUIBuilder);
        if ((!inventory.getType().equals(customGUIBuilder.getType())))
            throw new IllegalArgumentException("Trying to link an existing inventory with type " + customGUIBuilder.getType() + " to existing inventory with type " + inventory.getType());
        customGUIBuilder.checkInstalled();

        customGUIBuilder.guiElements.forEach((s, guiElement) -> {
            var activeElement = guiElement.toActiveElement(this);
            activeGUIElements.put(s, activeElement);
        });

        this.inventory.set(inventory);

        if (initialSetup != null) {
            initialSetup.accept(this);
            forEachElementBehavior((activeGUIRenderedRenderedElementBehavior, rendered, audience) -> activeGUIRenderedRenderedElementBehavior.onOpen(this, rendered, audience), true);
            forEachGUIElementBehavior((guiElementBehavior, activeGUIElement) -> guiElementBehavior.onOpen(this, activeGUIElement));
        }
    }

    private void startFrontEnd() {
        if (updateTask != null && updateTask.isRunning())
            return;

        frontEndBehavior.onFrontendRenderStart();

        frontEndRenderer = new FrontEndRenderer();
        frontEndRenderer.start();

        MCCPlatform.getInstance().getTaskManager().runTimerAsync(mccTask -> {
            synchronized (viewers) {
                if (viewers.isEmpty()) {
                    updateTask.cancel();
                    frontEndBehavior.onFrontendClose();
                    frontEndRenderer.stopRenderer();
                    //Bukkit.getLogger().info("Stopping dynamic frontend renderer for gui " + getComponentRendered().getKey().asString());
                    return;
                }
            }
            if (getComponentRendered().updateInterval > 0)
                forceUpdate();
        }, 0, getComponentRendered().updateInterval > 0 ? getComponentRendered().updateInterval * 50L : 1, TimeUnit.MILLISECONDS);

        if (getComponentRendered().updateInterval < 0) {
            MCCPlatform.getInstance().getTaskManager().runAsync(mccTask -> forceUpdate());
        }
    }

    public final void addClickableItem(int index, ClickableItem clickableItem) {
        this.getVanillaInventory().setItem(index, clickableItem.getStack());
        indexToClickableItemMapping.put(index, clickableItem);
    }

    public final void removeClickableItem(int index) {
        if (!indexToClickableItemMapping.containsKey(index))
            return;
        this.getVanillaInventory().setItem(index, null);
        indexToClickableItemMapping.remove(index);
    }

    public void openToPlayer(MCCPlayer player) {
        ActiveGUI currentActiveGUI = PlayerGUIData.getCurrentActiveGUI(player);
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
            PlayerGUIData.trackCurrentActiveGUI(player, this);
            viewers.add(player.asAudience());
        }
        startFrontEnd();
        if (getComponentRendered().onOpen != null) {
            getComponentRendered().onOpen.accept(this);
        }
    }

    public final void forEachGUIElementBehavior(BiConsumer<GUIElementBehavior<ActiveGUIElement<?>>, ActiveGUIElement<?>> forEach) {
        this.activeGUIElements.forEach((s, activeGUIElement) -> {
            GUIElementBehavior<ActiveGUIElement<?>> guiElementBehavior = (GUIElementBehavior<ActiveGUIElement<?>>) getComponentRendered()
                .getGuiElementBehaviors().getOrDefault(activeGUIElement.getGuiElement(), null);
            if (guiElementBehavior != null)
                forEach.accept(guiElementBehavior, activeGUIElement);
        });
        //forceUpdate();
    }

    public final <H extends ActiveGUIElement<?>> boolean editGUIElement(String id, Class<? extends H> type, Consumer<H> execution) {
        return edit(id, activeGUIElements, type, h -> {
            h.setVisible(true);
            execution.accept(h);
        });
    }

    void trackGUIInStack(MCCPlayer player) {
        PlayerGUIStack.load(player).trackGUI(this);
    }

    public MCCContainer getVanillaInventory() {
        return inventory.get();
    }

    public void placeGuiElementInSlot(int slotIndex, @Nullable ActiveGUIElement<?> activeGUIElement) {
        if (activeGUIElement != null && !this.equals(activeGUIElement.getActiveGUI()))
            throw new IllegalArgumentException("Trying to add gui element that does not belong to this gui.");
        if (activeGUIElement != null)
            guiElementsBySlot.put(slotIndex, activeGUIElement);
        else
            guiElementsBySlot.remove(slotIndex);
    }

    public @Nullable ActiveGUIElement<?> getGUIElementAtIndex(int slotIndex) {
        return guiElementsBySlot.getOrDefault(slotIndex, null);
    }

    @Override
    protected void doUpdate() {
        frontEndRenderer.offer(() -> {
            if (getComponentRendered().whileOpen != null) getComponentRendered().whileOpen.accept(this);
            forEachElementBehavior((activeGUIRenderedRenderedElementBehavior, rendered, audience) -> activeGUIRenderedRenderedElementBehavior.whileOpen(this, rendered, audience), false);
            forEachGUIElementBehavior((guiElementBehavior, activeGUIElement) -> guiElementBehavior.whileOpen(this, activeGUIElement));

            isUpdating.set(true);
            try {
                int viewerCount;
                synchronized (viewers) {
                    viewerCount = ActiveGUI.this.viewers.size();
                }
                if (viewerCount == 0)
                    return;

                Component lastRendering = getLastRendered();
                Component newRendering = render();
                MCCContainer newInventory;
                if (ActiveGUI.this.inventory.get() == null) {
                    newInventory = createInventory(newRendering);

                    if (ActiveGUI.this.inventory.get() != null)
                        newInventory.setContents(ActiveGUI.this.inventory.get().getContent());

                    ActiveGUI.this.inventory.set(newInventory);
                }

                if (newRendering.equals(lastRendering) && setup)
                    return;

                CompletableFuture<Void> waitForSync = new CompletableFuture<>();

                MCCPlatform.getInstance().getTaskManager().runAsync(mccTask -> {
                    synchronized (viewers) {
                        Iterator<Audience> iterator = viewers.iterator();

                        while (iterator.hasNext()) {
                            UUID uuid = GeneratorPlatformHelper.INSTANCE.get().getUUIDOfAudience(iterator.next());
                            if (uuid == null)
                                continue;
                            MCCPlayer player = MCCPlatform.getInstance().getOnlinePlayer(uuid);
                            if (player == null)
                                continue;
                            if (!ActiveGUI.this.equals(PlayerGUIData.getCurrentActiveGUI(player))) {
                                iterator.remove();
                                continue;
                            }

                            var itemAtCursor = player.getCursorItem().copy();
                            openUpdatedInventory(player, itemAtCursor, newRendering);
                        }
                    }
                    waitForSync.complete(null);
                });
                waitForSync.join();
            } finally {
                setup = true;
                isUpdating.set(false);
            }
        });
    }

    private @NotNull MCCContainer createInventory(Component rendering) {
        return MCCPlatform.getInstance().getContainerFactory().createContainer(getComponentRendered().getType(), rendering);
    }

    private void openUpdatedInventory(MCCPlayer player, MCCItemStack itemAtCursor, Component rendering) {
        synchronized (viewers) {
            if (!viewers.contains(player.asAudience()) && !FakeInventory.hasFakeInventory(player) && getComponentRendered().isUsePlayerSlots())
                FakeInventory.setFakeInventoryOfPlayer(player);
        }

        synchronized (inventoryUpdateWhitelist) {
            inventoryUpdateWhitelist.add(player.getUUID());

            try {
                boolean couldOpen = player.openContainer(this.inventory.get(), rendering);
                if (itemAtCursor != null) {
                    if (couldOpen && !itemAtCursor.getType().isEmpty() && !getComponentRendered().isUsePlayerSlots()) {
                        player.getInventory().removeItem(itemAtCursor);
                        player.setCursorItem(itemAtCursor);
                    }
                }
                viewers.add(player.asAudience());
            } finally {
                inventoryUpdateWhitelist.remove(player.getUUID());
            }
        }
    }

    public FrontEndBehavior getFrontEndBehavior() {
        return frontEndBehavior;
    }

    @Override
    public Set<Audience> getViewers() {
        return super.getViewers();
    }

    private class FrontEndRenderer extends Thread {

        private final LinkedBlockingQueue<Runnable> updateQueue = new LinkedBlockingQueue<>();
        private boolean running = true;

        public void stopRenderer() {
            this.running = false;
        }

        public void offer(Runnable runnable) {
            updateQueue.offer(runnable);
        }

        @Override
        public void run() {
            try {
                while (running) {
                    Runnable update = updateQueue.take();
                    update.run();
                }
            } catch (Throwable e) {
                Logger.getLogger(FrontEndRenderer.class.getSimpleName()).log(Level.SEVERE, "An error occured while rendering the active gui " + getComponentRendered().key().asString(), e);
            }
        }
    }

    private static class PlayerGUIData {
        public static void trackCurrentActiveGUI(MCCPlayer player, @Nullable ActiveGUI activeGUI) {
            if (activeGUI != null) {
                player.getTempData().storeData("active_gui", activeGUI);
            } else {
                player.getTempData().removeData("active_gui");
            }
        }

        @Nullable
        public static ActiveGUI getCurrentActiveGUI(MCCPlayer player) {
            if (!player.getTempData().containsData("active_gui"))
                return null;
            return player.getTempData().getData(ActiveGUI.class, "active_gui");
        }
    }
}
