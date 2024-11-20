package de.verdox.mccreativelab.wrapper.inventory.types;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCEntityContainerSource;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import org.jetbrains.annotations.Nullable;

public interface MCCLamaInventoryContainer extends MCCContainer<MCCEntityContainerSource<?>> {

    /**
     * Gets the item in the llama's decor slot.
     *
     * @return the decor item
     */
    MCCItemStack getDecor();

    /**
     * Sets the item in the llama's decor slot.
     *
     * @param stack the new item
     */
    void setDecor(@Nullable MCCItemStack stack);

    @Override
    default boolean canBeOpened() {
        return true;
    }
}
