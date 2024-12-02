package de.verdox.mccreativelab.wrapper.inventory.types.menu;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCEntityContainerSource;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import org.jetbrains.annotations.Nullable;

public interface MCCLamaInventoryContainerMenu extends MCCContainerMenu<MCCEntityContainerSource<?>, MCCContainer> {

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
}
