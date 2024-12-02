package de.verdox.mccreativelab.wrapper.inventory.types.menu;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.container.MCCResultContainer;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import org.jetbrains.annotations.Nullable;

public interface MCCGrindstoneContainerMenu extends MCCContainerMenu<MCCBlockContainerSource, MCCResultContainer> {
    /**
     * Gets the upper input item.
     *
     * @return upper input item
     */
    @Nullable
    default MCCItemStack getUpperItem() {
        return getContainer().getItem(0);
    }

    /**
     * Sets the upper input item.
     *
     * @param upperItem item to set
     */
    default void setUpperItem(@Nullable MCCItemStack upperItem) {
        getContainer().setItem(0, upperItem);
    }

    /**
     * Gets the lower input item.
     *
     * @return lower input item
     */
    @Nullable
    default MCCItemStack getLowerItem() {
        return getContainer().getItem(1);
    }

    /**
     * Sets the lower input item.
     *
     * @param lowerItem item to set
     */
    default void setLowerItem(@Nullable MCCItemStack lowerItem) {
        getContainer().setItem(1, lowerItem);
    }

    /**
     * Gets the result.
     *
     * @return result
     */
    @Nullable
    default MCCItemStack getResult() {
        return getContainer().getItem(2);
    }

    /**
     * Sets the result.
     *
     * @param result item to set
     */
    default void setResult(@Nullable MCCItemStack result) {
        getContainer().setItem(2, result);
    }
}
