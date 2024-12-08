package de.verdox.mccreativelab.wrapper.inventory.types.menu.horse;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCEntityContainerSource;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import org.jetbrains.annotations.Nullable;

public interface MCCAbstractHorseInventoryContainerMenu extends MCCContainerMenu<MCCEntityContainerSource<?>, MCCContainer> {

    /**
     * Gets the item in the horse's saddle slot.
     *
     * @return the saddle item
     */
    @Nullable
    MCCItemStack getSaddle();

    /**
     * Sets the item in the horse's saddle slot.
     *
     * @param stack the new item
     */
    void setSaddle(@Nullable MCCItemStack stack);
}
