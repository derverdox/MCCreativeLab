package de.verdox.mccreativelab.wrapper.inventory.types;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuTypes;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;

public interface MCCCartographyTableContainer extends MCCContainer<MCCBlockContainerSource> {
    /**
     * Check what item is in the result slot of this smithing table.
     *
     * @return the result item
     */
    @org.jetbrains.annotations.Nullable
    default MCCItemStack getResult() {
        return this.getItem(2); // net.minecraft.world.inventory.CartographyTableMenu.RESULT_SLOT
    }

    /**
     * Set the item in the result slot of the smithing table
     *
     * @param newResult the new result item
     */
    default void setResult(final @org.jetbrains.annotations.Nullable MCCItemStack newResult) {
        this.setItem(2, newResult); // net.minecraft.world.inventory.CartographyTableMenu.RESULT_SLOT
    }

    @Override
    default MCCMenuType getType() {
        return MCCMenuTypes.CARTOGRAPHY_TABLE;
    }

    @Override
    default boolean canBeOpened() {
        return true;
    }
}
