package de.verdox.mccreativelab.wrapper.inventory;

import com.google.common.base.Preconditions;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;

public interface MCCContainer extends Iterable<MCCItemStack> {
    /**
     * Sets the {@link MCCItemStack} at the given container slot
     *
     * @param index the index of the slot
     * @param stack the item
     */
    void setItem(int index, @Nullable MCCItemStack stack);

    /**
     * Gets the {@link MCCItemStack} at the given container slot
     *
     * @param index the index of the slot
     * @return stack the item
     */
    MCCItemStack getItem(int index);

    /**
     * Returns true if an item of the provided type is contained in the inventory
     *
     * @param itemType the item type
     * @return true if the inventory contains the type
     */
    default boolean contains(MCCItemType itemType){
        Preconditions.checkArgument(itemType != null, "itemType cannot be null");
        for (MCCItemStack item : this.getContent()) {
            if (item != null && item.getType() == itemType) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns true if an item of the provided type and amount is contained in the inventory
     *
     * @param itemType the item type
     * @return true if the inventory contains the type
     */
    default boolean contains(MCCItemType itemType, int amount){
        Preconditions.checkArgument(itemType != null, "itemType cannot be null");
        if (amount <= 0) {
            return true;
        }
        for (MCCItemStack item : this.getContent()) {
            if (item != null && item.getType().equals(itemType)) {
                if ((amount -= item.getAmount()) <= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Returns true if an item of the provided definition is contained in the inventory
     *
     * @param item the item type
     * @return true if the inventory contains the stack
     */
    default boolean contains(MCCItemStack item){
        if (item == null || item.isEmpty()) {
            return false;
        }
        for (MCCItemStack i : this.getContent()) {
            if (item.equals(i)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns true if an item of the provided definition and amount is contained in the inventory
     *
     * @param item the item type
     * @return true if the inventory contains the stack
     */
    default boolean contains(MCCItemStack item, int amount){
        if (item == null || item.isEmpty()) {
            return false;
        }
        if (amount <= 0) {
            return true;
        }
        for (MCCItemStack i : this.getContent()) {
            if (item.equals(i) && --amount <= 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns true if an item of the provided definition and amount is at least contained in the inventory
     *
     * @param item the item type
     * @return true if the inventory contains the stack
     */
    default boolean containsAtLeast(MCCItemStack item, int amount){
        if (item == null || item.isEmpty()) {
            return false;
        }
        if (amount <= 0) {
            return true;
        }
        for (MCCItemStack i : this.getContent()) {
            if (item.isSimilar(i) && (amount -= i.getAmount()) <= 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Removes the item from the slot
     *
     * @param index the index
     */
    void removeItem(int index);

    int getSize();

    /**
     * Stores the given ItemStacks in the inventory. This will try to fill
     * existing stacks and empty slots as well as it can.
     * <p>
     * The returned HashMap contains what it couldn't store, where the key is
     * the index of the parameter, and the value is the ItemStack at that
     * index of the varargs parameter. If all items are stored, it will return
     * an empty HashMap.
     * <p>
     * If you pass in ItemStacks which exceed the maximum stack size for the
     * Material, first they will be added to partial stacks where
     * Material.getMaxStackSize() is not exceeded, up to
     * Material.getMaxStackSize(). When there are no partial stacks left
     * stacks will be split on Inventory.getMaxStackSize() allowing you to
     * exceed the maximum stack size for that material.
     * <p>
     * It is known that in some implementations this method will also set
     * the inputted argument amount to the number of that item not placed in
     * slots.
     *
     * @param items The ItemStacks to add
     * @return A HashMap containing items that didn't fit.
     * @throws IllegalArgumentException if items or any element in it is null
     */
    @NotNull
    HashMap<Integer, MCCItemStack> addItem(@NotNull MCCItemStack... items) throws IllegalArgumentException;

    /**
     * Searches all possible inventory slots in order to remove the given ItemStacks.
     * <p>
     * It will try to remove 'as much as possible' from the types and amounts
     * you give as arguments.
     * <p>
     * The returned HashMap contains what it couldn't remove, where the key is
     * the index of the parameter, and the value is the ItemStack at that
     * index of the varargs parameter. If all the given ItemStacks are
     * removed, it will return an empty HashMap.
     * <p>
     * It is known that in some implementations this method will also set the
     * inputted argument amount to the number of that item not removed from
     * slots.
     *
     * @param items The ItemStacks to remove
     * @return A HashMap containing items that couldn't be removed.
     * @throws IllegalArgumentException if items is null
     */
    @NotNull
    HashMap<Integer, MCCItemStack> removeItem(@NotNull MCCItemStack... items) throws IllegalArgumentException;

    /**
     * Returns all ItemStacks from the inventory
     *
     * @return An array of ItemStacks from the inventory. Individual items may be null.
     */
    MCCItemStack[] getContent();

    /**
     * Completely replaces the inventory's contents. Removes all existing
     * contents and replaces it with the ItemStacks given in the array.
     *
     * @param items A complete replacement for the contents; the length must
     *              be less than or equal to {@link #getSize()}.
     * @throws IllegalArgumentException If the array has more items than the
     *                                  inventory.
     */
    default void setContents(MCCItemStack[] items) {
        for (int i = 0; i < items.length; i++) {
            setItem(i, items[i]);
        }
    }

    /**
     * Returns a HashMap with all slots and ItemStacks in the inventory with
     * the given {@link MCCItemType}.
     * <p>
     * The HashMap contains entries where, the key is the slot index, and the
     * value is the ItemStack in that slot. If no matching ItemStack with the
     * given Material is found, an empty map is returned.
     *
     * @param material The material to look for
     * @return A HashMap containing the slot index, ItemStack pairs
     * @throws IllegalArgumentException if material is null
     */
    @NotNull
    HashMap<Integer, ? extends MCCItemStack> all(@NotNull MCCItemType material) throws IllegalArgumentException;

    /**
     * Finds all slots in the inventory containing any ItemStacks with the
     * given ItemStack. This will only match slots if both the type and the
     * amount of the stack match
     * <p>
     * The HashMap contains entries where, the key is the slot index, and the
     * value is the ItemStack in that slot. If no matching ItemStack with the
     * given Material is found, an empty map is returned.
     *
     * @param item The ItemStack to match against
     * @return A map from slot indexes to item at index
     */
    @NotNull
    HashMap<Integer, ? extends MCCItemStack> all(@Nullable MCCItemStack item);

    /**
     * Returns the first empty index of the container
     *
     * @return the first empty index
     */
    int firstEmpty();

    /**
     * Returns the first index that contains the item
     *
     * @param stack            the stack
     * @param checkItemAmounts whether the amount of the provided item should be considered for the search
     * @return the found index
     */
    int first(MCCItemStack stack, boolean checkItemAmounts);

    /**
     * Clears the inventory
     */
    void clear();
}
