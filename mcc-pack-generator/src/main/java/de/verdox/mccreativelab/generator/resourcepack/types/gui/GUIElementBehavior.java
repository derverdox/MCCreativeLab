package de.verdox.mccreativelab.generator.resourcepack.types.gui;

import de.verdox.mccreativelab.generator.resourcepack.types.gui.element.active.ActiveGUIElement;

public interface GUIElementBehavior <T extends ActiveGUIElement<?>> {
    default void onOpen(ActiveGUI parentElement, T element){}
    default void whileOpen(ActiveGUI parentElement, T element){}
}
