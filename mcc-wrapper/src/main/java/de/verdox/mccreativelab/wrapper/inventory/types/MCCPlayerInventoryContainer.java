package de.verdox.mccreativelab.wrapper.inventory.types;

import de.verdox.mccreativelab.wrapper.entity.MCCEquipmentSlotGroup;
import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCEntityContainerSource;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import org.checkerframework.common.value.qual.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface MCCPlayerInventoryContainer extends MCCContainer<MCCEntityContainerSource<MCCPlayer>> {

    /**
     * Gets all ItemStacks from the armor slots.
     *
     * @return all the ItemStacks from the armor slots. Individual items can be
     * null and are returned in a fixed order starting from the boots and going
     * up to the helmet
     */
    public @NotNull MCCItemStack @NotNull [] getArmorContents();

    /**
     * Return the ItemStack from the helmet slot
     *
     * @return The ItemStack in the helmet slot
     */
    @Nullable
    default MCCItemStack getHelmet() {
        return getItem(MCCEquipmentSlotGroup.HEAD);
    }

    /**
     * Return the ItemStack from the chestplate slot
     *
     * @return The ItemStack in the chestplate slot
     */
    @Nullable
    default MCCItemStack getChestplate() {
        return getItem(MCCEquipmentSlotGroup.CHEST);
    }

    /**
     * Return the ItemStack from the leg slot
     *
     * @return The ItemStack in the leg slot
     */
    @Nullable
    default MCCItemStack getLeggings() {
        return getItem(MCCEquipmentSlotGroup.LEGS);
    }

    /**
     * Return the ItemStack from the boots slot
     *
     * @return The ItemStack in the boots slot
     */
    @Nullable
    default MCCItemStack getBoots() {
        return getItem(MCCEquipmentSlotGroup.FEET);
    }

    /**
     * Stores the ItemStack at the given index of the inventory.
     * <p>
     * Indexes 0 through 8 refer to the hotbar. 9 through 35 refer to the main inventory, counting up from 9 at the top
     * left corner of the inventory, moving to the right, and moving to the row below it back on the left side when it
     * reaches the end of the row. It follows the same path in the inventory like you would read a book.
     * <p>
     * Indexes 36 through 39 refer to the armor slots. Though you can set armor with this method using these indexes,
     * you are encouraged to use the provided methods for those slots.
     * <p>
     * Index 40 refers to the off hand (shield) item slot. Though you can set off hand with this method using this index,
     * you are encouraged to use the provided method for this slot.
     * <p>
     * If you attempt to use this method with an index less than 0 or greater than 40, an ArrayIndexOutOfBounds
     * exception will be thrown.
     *
     * @param index The index where to put the ItemStack
     * @param item  The ItemStack to set
     * @throws ArrayIndexOutOfBoundsException when index &lt; 0 || index &gt; 40
     */
    @Override
    public void setItem(int index, @Nullable MCCItemStack item);

    /**
     * Stores the ItemStack at the given equipment slot in the inventory.
     *
     * @param slot the slot to put the ItemStack
     * @param item the ItemStack to set
     * @throws IllegalArgumentException if the slot is invalid for the player
     */
    public void setItem(@NotNull MCCEquipmentSlotGroup slot, @Nullable MCCItemStack item);

    /**
     * Gets the ItemStack at the given equipment slot in the inventory.
     *
     * @param slot the slot to get the ItemStack
     * @return the ItemStack in the given slot
     * @throws IllegalArgumentException if the slot is invalid for the player
     */
    @NotNull // Paper
    public MCCItemStack getItem(@NotNull MCCEquipmentSlotGroup slot);

    /**
     * Put the given ItemStacks into the armor slots
     *
     * @param items The ItemStacks to use as armour
     */
    public void setArmorContents(@Nullable MCCItemStack[] items);

    /**
     * Put the given ItemStack into the helmet slot. This does not check if
     * the ItemStack is a helmet
     *
     * @param helmet The ItemStack to use as helmet
     */
    default void setHelmet(@Nullable MCCItemStack helmet) {
        setItem(MCCEquipmentSlotGroup.HEAD, helmet);
    }

    /**
     * Put the given ItemStack into the chestplate slot. This does not check
     * if the ItemStack is a chestplate
     *
     * @param chestplate The ItemStack to use as chestplate
     */
    default void setChestplate(@Nullable MCCItemStack chestplate) {
        setItem(MCCEquipmentSlotGroup.CHEST, chestplate);
    }

    /**
     * Put the given ItemStack into the leg slot. This does not check if the
     * ItemStack is a pair of leggings
     *
     * @param leggings The ItemStack to use as leggings
     */
    default void setLeggings(@Nullable MCCItemStack leggings) {
        setItem(MCCEquipmentSlotGroup.LEGS, leggings);
    }

    /**
     * Put the given ItemStack into the boots slot. This does not check if the
     * ItemStack is a boots
     *
     * @param boots The ItemStack to use as boots
     */
    default void setBoots(@Nullable MCCItemStack boots) {
        setItem(MCCEquipmentSlotGroup.FEET, boots);
    }

    /**
     * Gets the item the player is currently holding
     * in their main hand.
     *
     * @return the currently held item
     */
    @NotNull
    default MCCItemStack getItemInMainHand() {
        return getItem(MCCEquipmentSlotGroup.MAINHAND);
    }

    /**
     * Sets the item the player is holding in their main hand.
     *
     * @param item The item to put into the player's hand
     */
    default void setItemInMainHand(@Nullable MCCItemStack item) {
        setItem(MCCEquipmentSlotGroup.MAINHAND, item);
    }

    /**
     * Gets the item the player is currently holding
     * in their off hand.
     *
     * @return the currently held item
     */
    @NotNull
    default MCCItemStack getItemInOffHand() {
        return getItem(MCCEquipmentSlotGroup.OFFHAND);
    }

    /**
     * Sets the item the player is holding in their off hand.
     *
     * @param item The item to put into the player's hand
     */
    default void setItemInOffHand(@Nullable MCCItemStack item) {
        setItem(MCCEquipmentSlotGroup.OFFHAND, item);
    }

    /**
     * Get the slot number of the currently held item
     *
     * @return Held item slot number
     */
    public int getHeldItemSlot();

    /**
     * Set the slot number of the currently held item.
     * <p>
     * This validates whether the slot is between 0 and 8 inclusive.
     *
     * @param slot The new slot number
     * @throws IllegalArgumentException Thrown if slot is not between 0 and 8
     *                                  inclusive
     */
    public void setHeldItemSlot(@IntRange(from = 0, to = 8) int slot);

    void sendFakeContents(MCCItemStack[] contents);

    @Override
    default boolean canBeOpened() {
        return false;
    }
}
