package de.verdox.mccreativelab.wrapper.inventory.types.menu;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.inventory.types.container.MCCResultContainer;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;

public interface MCCCartographyTableContainerMenu extends MCCContainerMenu<MCCBlockContainerSource, MCCResultContainer> {
    /**
     * Check what item is in the result slot of this smithing table.
     *
     * @return the result item
     */
    @org.jetbrains.annotations.Nullable
    default MCCItemStack getResult() {
        return getContainer().getItem(2); // net.minecraft.world.inventory.CartographyTableMenu.RESULT_SLOT
    }

    /**
     * Set the item in the result slot of the smithing table
     *
     * @param newResult the new result item
     */
    default void setResult(final @org.jetbrains.annotations.Nullable MCCItemStack newResult) {
        getContainer().setItem(2, newResult); // net.minecraft.world.inventory.CartographyTableMenu.RESULT_SLOT
    }
}
