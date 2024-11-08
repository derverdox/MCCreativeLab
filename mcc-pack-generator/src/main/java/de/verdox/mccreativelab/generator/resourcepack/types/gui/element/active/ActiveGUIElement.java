package de.verdox.mccreativelab.generator.resourcepack.types.gui.element.active;

import de.verdox.mccreativelab.generator.resourcepack.types.gui.ActiveGUI;
import de.verdox.mccreativelab.generator.resourcepack.types.gui.GUIClickAction;
import de.verdox.mccreativelab.generator.resourcepack.types.gui.element.GUIElement;
import org.jetbrains.annotations.NotNull;

public abstract class ActiveGUIElement<T extends GUIElement> {
    protected final ActiveGUI activeGUI;
    protected final T guiElement;

    public ActiveGUIElement(@NotNull ActiveGUI activeGUI, T guiElement) {
        this.activeGUI = activeGUI;
        this.guiElement = guiElement;
    }

    @NotNull
    public ActiveGUI getActiveGUI() {
        return activeGUI;
    }

    public T getGuiElement() {
        return guiElement;
    }

    public abstract void setVisible(boolean visible);
    public abstract void onClick(GUIClickAction inventoryClickEvent, int clickedX, int clickedY);
}
