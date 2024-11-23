package de.verdox.mccreativelab.wrapper.inventory.types;

import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuTypes;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import org.jetbrains.annotations.Nullable;

public interface MCCAnvilContainer extends MCCResultContainer<MCCBlockContainerSource> {

    /**
     * Gets the item in the left input slot.
     *
     * @return item in the first slot
     */
    @Nullable
    default MCCItemStack getFirstItem() {
        return getItem(0);
    }

    /**
     * Sets the item in the left input slot.
     *
     * @param firstItem item to set
     */
    default void setFirstItem(@Nullable MCCItemStack firstItem) {
        setItem(0, firstItem);
    }

    /**
     * Gets the item in the right input slot.
     *
     * @return item in the second slot
     */
    @Nullable
    default MCCItemStack getSecondItem() {
        return getItem(1);
    }

    /**
     * Sets the item in the right input slot.
     *
     * @param secondItem item to set
     */
    default void setSecondItem(@Nullable MCCItemStack secondItem) {
        setItem(1, secondItem);
    }

    /**
     * Gets the item in the result slot.
     *
     * @return item in the result slot
     */
    @Nullable
    default MCCItemStack getResult() {
        return getItem(2);
    }

    /**
     * Sets the item in the result slot.
     * Note that the client might not be able to take out the item if it does not match the input items.
     *
     * @param result item to set
     */
    default void setResult(@Nullable MCCItemStack result) {
        setItem(2, result);
    }

    /**
     * Gets the rename text specified within the anvil's text field.
     *
     * @return The text within the anvil's text field if an item is present
     * otherwise null
     */
    @Nullable
    String getTextFieldText();

    /**
     * Gets the amount of items needed to repair.
     *
     * @return The amount of materials required to repair the item
     */
    int getRepairItemCountCost();

    /**
     * Gets the experience cost needed to repair.
     *
     * @return The repair cost in experience
     */
    int getRepairCost();

    /**
     * Sets the amount of repair materials required to repair the item.
     *
     * @param amount the amount of repair materials
     */
    void setRepairItemCountCost(int amount);

    /**
     * Sets the repair cost in experience.
     *
     * @param cost the experience cost to repair
     */
    void setRepairCost(int cost);

    /**
     * Returns whether this view will bypass the vanilla enchantment level restriction
     * when applying enchantments to an item or not.
     * <p>
     * By default, vanilla will limit enchantments applied to items to the respective
     * max level, even if the applied enchantment itself is above said
     * limit.
     * Disabling this limit via {@link MCCAnvilContainer#bypassEnchantmentLevelRestriction(boolean)} allows for, e.g., enchanted
     * books to be applied fully, even if their enchantments are beyond the limit.
     *
     * @return {@code true} if this view bypasses the vanilla restrictions.
     */
    boolean bypassesEnchantmentLevelRestriction();

    /**
     * Sets if enchantments applied via this anvil view may bypass vanilla's level restrictions.
     *
     * @param bypassEnchantmentLevelRestriction if this view bypasses the vanilla level restrictions.
     * @see MCCAnvilContainer#bypassesEnchantmentLevelRestriction()
     */
    void bypassEnchantmentLevelRestriction(boolean bypassEnchantmentLevelRestriction);

    @Override
    default MCCMenuType getType() {
        return MCCMenuTypes.ANVIL;
    }

    @Override
    default boolean canBeOpened() {
        return true;
    }
}
