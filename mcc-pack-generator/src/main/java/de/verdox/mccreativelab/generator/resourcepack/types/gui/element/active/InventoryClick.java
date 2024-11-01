package de.verdox.mccreativelab.generator.resourcepack.types.gui.element.active;

public interface InventoryClick {

    boolean isRightClick();

    boolean isShiftClick();

    int getSlot();

    int getRawSlot();

    int getHotbarButton();

    enum ClickType {

    }

}
