package de.verdox.mccreativelab.generator.resourcepack.types.gui;

import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerCloseReason;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.Objects;
import java.util.Stack;

/**
 * Tracks the GUIs opened by a player
 */
public class PlayerGUIStack {

    private final Stack<StackElement> stack = new Stack<>();
    private final MCCPlayer player;

    public static PlayerGUIStack load(MCCPlayer player) {
        if (!player.getTempData().containsData("playerGUIStack"))
            player.getTempData().storeData("playerGUIStack", new PlayerGUIStack(player));

        return player.getTempData().getData(PlayerGUIStack.class, "playerGUIStack");
    }

    public PlayerGUIStack(MCCPlayer player) {
        this.player = player;
    }

    public void onActiveGuiClose(@NotNull ActiveGUI closedActiveGui, MCCContainerCloseReason closeReason){
        Objects.requireNonNull(closedActiveGui);
        Objects.requireNonNull(closeReason);
        if (stack.isEmpty() || closeReason.equals(MCCContainerCloseReason.OPEN_NEW))
            return;
        if (closeReason.equals(MCCContainerCloseReason.CLOSED_BY_VIEWER)) {
            popAndOpenLast(player, closedActiveGui);
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
