package de.verdox.mccreativelab.wrapper.inventory.types;

import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuTypes;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import org.jetbrains.annotations.Nullable;

public interface MCCGrindstoneContainer extends MCCResultContainer<MCCBlockContainerSource> {
    // Paper start
    /**
     * Gets the upper input item.
     *
     * @return upper input item
     */
    @Nullable
    default MCCItemStack getUpperItem() {
        return getItem(0);
    }

    /**
     * Sets the upper input item.
     *
     * @param upperItem item to set
     */
    default void setUpperItem(@Nullable MCCItemStack upperItem) {
        setItem(0, upperItem);
    }

    /**
     * Gets the lower input item.
     *
     * @return lower input item
     */
    @Nullable
    default MCCItemStack getLowerItem() {
        return getItem(1);
    }

    /**
     * Sets the lower input item.
     *
     * @param lowerItem item to set
     */
    default void setLowerItem(@Nullable MCCItemStack lowerItem) {
        setItem(1, lowerItem);
    }

    /**
     * Gets the result.
     *
     * @return result
     */
    @Nullable
    default MCCItemStack getResult() {
        return getItem(2);
    }

    /**
     * Sets the result.
     *
     * @param result item to set
     */
    default void setResult(@Nullable MCCItemStack result) {
        setItem(2, result);
    }
    // Paper end

    @Override
    default MCCMenuType getType() {
        return MCCMenuTypes.GRINDSTONE;
    }

    @Override
    default boolean canBeOpened() {
        return true;
    }
}
