package de.verdox.mccreativelab.wrapper.inventory.types;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCContainerSource;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;

public interface MCCResultContainer<T extends MCCContainerSource> extends MCCContainer<T> {

    MCCContainer<T> getResultInventory();

    MCCContainer<T> getIngredientsInventory();

    @Override
    default MCCItemStack getItem(int slot) {
        if (slot < this.getIngredientsInventory().getSize()) {
            return this.getIngredientsInventory().getItem(slot);
        } else {
            return this.getResultInventory().getItem(slot - this.getIngredientsInventory().getSize());
        }
    }

    @Override
    default void setItem(int index, MCCItemStack item) {
        if (index < this.getIngredientsInventory().getSize()) {
            this.getIngredientsInventory().setItem(index, item);
        } else {
            this.getResultInventory().setItem((index - this.getIngredientsInventory().getSize()), item);
        }
    }

    @Override
    default int getSize() {
        return this.getResultInventory().getSize() + this.getIngredientsInventory().getSize();
    }
}
