package de.verdox.mccreativelab.wrapper.inventory.types.container;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Represents a container that consists of two underlying containers. One for ingredients and one for results
 */
public interface MCCResultContainer extends MCCContainer {

    MCCContainer getResultInventory();

    MCCContainer getIngredientsInventory();

    @Override
    @NotNull
    default HashMap<Integer, MCCItemStack> addItem(@NotNull MCCItemStack... items) throws IllegalArgumentException {
        HashMap<Integer, MCCItemStack> leftOvers = getIngredientsInventory().addItem(items);
        return getResultInventory().addItem(leftOvers.values().toArray(MCCItemStack[]::new));
    }

    @Override
    @NotNull
    default HashMap<Integer, MCCItemStack> removeItem(@NotNull MCCItemStack... items) throws IllegalArgumentException {
        HashMap<Integer, MCCItemStack> leftOvers = getIngredientsInventory().removeItem(items);
        return getResultInventory().removeItem(leftOvers.values().toArray(MCCItemStack[]::new));
    }

    @Override
    default int firstEmpty() {
        int firstEmpty = getIngredientsInventory().firstEmpty();
        if (firstEmpty == -1) {
            firstEmpty = getResultInventory().firstEmpty();
        }
        return firstEmpty;
    }

    @Override
    default int first(MCCItemStack stack, boolean checkItemAmounts) {
        int firstEmpty = getIngredientsInventory().first(stack, checkItemAmounts);
        if (firstEmpty == -1) {
            firstEmpty = getResultInventory().first(stack, checkItemAmounts);
        }
        return firstEmpty;
    }

    @Override
    default Iterator<MCCItemStack> iterator() {
        Iterator<MCCItemStack> ingredientsIterator = getIngredientsInventory().iterator();
        Iterator<MCCItemStack> resultsIterator = getResultInventory().iterator();

        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return ingredientsIterator.hasNext() || resultsIterator.hasNext();
            }

            @Override
            public MCCItemStack next() {
                if (ingredientsIterator.hasNext()) {
                    return ingredientsIterator.next();
                }
                return resultsIterator.next();
            }
        };

    }

    @Override
    @NotNull
    default HashMap<Integer, ? extends MCCItemStack> all(@Nullable MCCItemStack item) {
        HashMap<Integer, MCCItemStack> allFromIngredients = (HashMap<Integer, MCCItemStack>) getIngredientsInventory().all(item);
        HashMap<Integer, MCCItemStack> allFromResults = (HashMap<Integer, MCCItemStack>) getResultInventory().all(item);

        allFromResults.forEach((integer, mccItemStack) -> allFromIngredients.put(integer + this.getIngredientsInventory().getSize(), mccItemStack));
        return allFromIngredients;
    }

    @Override
    @NotNull
    default HashMap<Integer, ? extends MCCItemStack> all(@NotNull MCCItemType material) throws IllegalArgumentException {
        HashMap<Integer, MCCItemStack> allFromIngredients = (HashMap<Integer, MCCItemStack>) getIngredientsInventory().all(material);
        HashMap<Integer, MCCItemStack> allFromResults = (HashMap<Integer, MCCItemStack>) getResultInventory().all(material);

        allFromResults.forEach((integer, mccItemStack) -> allFromIngredients.put(integer + this.getIngredientsInventory().getSize(), mccItemStack));
        return allFromIngredients;
    }

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
    default void removeItem(int index) {
        if (index < this.getIngredientsInventory().getSize()) {
            this.getIngredientsInventory().removeItem(index);
        } else {
            this.getResultInventory().removeItem((index - this.getIngredientsInventory().getSize()));
        }
    }

    @Override
    default boolean contains(MCCItemType mccItemType) {
        return getIngredientsInventory().contains(mccItemType) || getResultInventory().contains(mccItemType);
    }

    @Override
    default boolean contains(MCCItemType mccItemType, int amount) {
        return getIngredientsInventory().contains(mccItemType, amount) || getResultInventory().contains(mccItemType, amount);
    }

    @Override
    default boolean contains(MCCItemStack mccItemStack) {
        return getIngredientsInventory().contains(mccItemStack) || getResultInventory().contains(mccItemStack);
    }

    @Override
    default boolean contains(MCCItemStack mccItemStack, int amount) {
        return getIngredientsInventory().contains(mccItemStack, amount) || getResultInventory().contains(mccItemStack, amount);
    }

    @Override
    default int getSize() {
        return this.getResultInventory().getSize() + this.getIngredientsInventory().getSize();
    }

    @Override
    default void setContents(MCCItemStack[] items) {
        for (int i = 0; i < items.length; i++) {
            setItem(i, items[i]);
        }
    }

    @Override
    default MCCItemStack[] getContent() {
        MCCItemStack[] ingredients = getIngredientsInventory().getContent();
        MCCItemStack[] results = getResultInventory().getContent();

        MCCItemStack[] result = new MCCItemStack[ingredients.length + results.length];
        System.arraycopy(ingredients, 0, result, 0, ingredients.length);
        System.arraycopy(results, 0, result, results.length, results.length);
        return result;
    }

    @Override
    default void clear() {
        getIngredientsInventory().clear();
        getResultInventory().clear();
    }

    @Override
    default boolean containsAtLeast(MCCItemStack item, int amount) {
        return this.getResultInventory().containsAtLeast(item, amount) || this.getIngredientsInventory().containsAtLeast(item, amount);
    }
}
