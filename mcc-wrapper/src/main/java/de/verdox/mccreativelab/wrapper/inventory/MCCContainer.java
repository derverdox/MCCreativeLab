package de.verdox.mccreativelab.wrapper.inventory;

import de.verdox.mccreativelab.wrapper.entity.ContainerViewer;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCContainerSource;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Set;

/**
 * Describes a minecraft inventory
 */
public interface MCCContainer<T extends MCCContainerSource> extends Iterable<MCCItemStack> {
    /**
     * Gets the {@link MCCMenuType} of the container
     *
     * @return the type
     */
    MCCMenuType getType();

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
     * @param mccItemType the item type
     * @return true if the inventory contains the type
     */
    boolean contains(MCCItemType mccItemType);

    /**
     * Returns true if an item of the provided type and amount is contained in the inventory
     *
     * @param mccItemType the item type
     * @return true if the inventory contains the type
     */
    boolean contains(MCCItemType mccItemType, int amount);

    /**
     * Returns true if an item of the provided type and amount is at least contained in the inventory
     *
     * @param mccItemType the item type
     * @return true if the inventory contains the type
     */
    boolean containsAtLeast(MCCItemType mccItemType, int amount);

    /**
     * Returns true if an item of the provided definition is contained in the inventory
     *
     * @param mccItemStack the item type
     * @return true if the inventory contains the stack
     */
    boolean contains(MCCItemStack mccItemStack);

    /**
     * Returns true if an item of the provided definition and amount is contained in the inventory
     *
     * @param mccItemStack the item type
     * @return true if the inventory contains the stack
     */
    boolean contains(MCCItemStack mccItemStack, int amount);

    /**
     * Returns true if an item of the provided definition and amount is at least contained in the inventory
     *
     * @param mccItemStack the item type
     * @return true if the inventory contains the stack
     */
    boolean containsAtLeast(MCCItemStack mccItemStack, int amount);

    /**
     * Removes the item from the slot
     *
     * @param index the index
     */
    void removeItem(int index);

    /**
     * Changes the title of the inventory and reopens it to all viewers
     *
     * @param component the new title of the inventory
     */
    void setTitle(Component component);

    /**
     * Returns the title of the container
     *
     * @return the title
     */
    Component getTitle();


    default int getSize() {
        return getType().containerSize();
    }

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
    void setContents(MCCItemStack[] items);

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
     * Clears the inventory
     */
    void clear();

    /**
     * Closes the inventory for every viewer
     */
    void close();

    /**
     * Returns all viewers that currently view the container
     *
     * @return the viewers
     */
    Set<ContainerViewer> getViewers();

    /**
     * Returns true when this container has a GUI that can be opened by a player
     *
     * @return true if the container can be opened
     */
    boolean canBeOpened();

    /**
     * Returns the container source of this container. Might be null if the container was created by the server software instead of being from a real game element.
     * @return the source or null if no source is available
     */
    @Nullable
    T getSource();
}
