package de.verdox.mccreativelab.generator.resourcepack.types.gui;

import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;

import java.util.Map;
import java.util.Stack;

/**
 * Tracks the GUIs opened by a player
 */
public class PlayerGUIStack implements Listener {

    private final Stack<StackElement> stack = new Stack<>();
    private final MCCPlayer player;

    static PlayerGUIStack load(MCCPlayer player) {
        if (!player.containsData("playerGUIStack"))
            player.storeData("playerGUIStack", new PlayerGUIStack(player));

        return player.getData(PlayerGUIStack.class, "playerGUIStack");
    }

    public PlayerGUIStack(MCCPlayer player) {
        this.player = player;
        Bukkit.getPluginManager().registerEvents(this, MCCreativeLabExtension.getInstance());
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        if (!e.getPlayer().equals(this.player))
            return;
        HandlerList.unregisterAll(this);
    }

    @EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
    public void onInventoryClose(GUICloseEvent e) {
        if (stack.isEmpty() || e.getReason().equals(InventoryCloseEvent.Reason.OPEN_NEW))
            return;
        if (e.getReason().equals(InventoryCloseEvent.Reason.PLAYER)) {
            popAndOpenLast(e.getPlayer(), e.getActiveGUI());
        } else
            clear();
    }

    public void popAndOpenLast(MCCPlayer player, ActiveGUI activeGUI) {
        StackElement stackElement = stack.pop();

        if (stackElement.activeGUI.getComponentRendered().equals(activeGUI.getComponentRendered()))
            return;

        stackElement.activeGUI.openToPlayer(player);
    }

    public void trackGUI(ActiveGUI activeGUI) {
        StackElement stackElement = new StackElement(activeGUI, activeGUI.tempData);
        stack.push(stackElement);
    }

    public void clear() {
        stack.clear();
    }

    private record StackElement(ActiveGUI activeGUI, Map<String, Object> tempData) {

    }
}
