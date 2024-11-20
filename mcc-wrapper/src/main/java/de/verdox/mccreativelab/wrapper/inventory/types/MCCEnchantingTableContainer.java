package de.verdox.mccreativelab.wrapper.inventory.types;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCEnchantmentOffer;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuTypes;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import org.bukkit.enchantments.EnchantmentOffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface MCCEnchantingTableContainer extends MCCContainer<MCCBlockContainerSource> {
    /**
     * Set the item being enchanted.
     *
     * @param item The new item
     */
    default void setItem(@Nullable MCCItemStack item){
        this.setItem(0, item);
    }

    /**
     * Get the item being enchanted.
     *
     * @return The current item.
     */
    @Nullable
    default MCCItemStack getItem(){
        return this.getItem(0);
    }

    /**
     * Set the secondary item being used for the enchantment.
     *
     * @param item The new item
     */
    default void setSecondary(@Nullable MCCItemStack item){
        this.setItem(1, item);
    }

    /**
     * Get the secondary item being used for the enchantment.
     *
     * @return The second item
     */
    @Nullable
    default MCCItemStack getSecondary(){
        return this.getItem(1);
    }

    /**
     * Gets the random enchantment seed used in this view
     *
     * @return The random seed used
     */
    int getEnchantmentSeed();

    /**
     * Sets the random enchantment seed used in this view. Loses its effect once the view is closed.
     *
     * @param seed the random seed to use
     */
    void setEnchantmentSeed(int seed);

    /**
     * Gets the offers of this EnchantmentView
     *
     * @return The enchantment offers that are provided
     */
    @Nullable
    MCCEnchantmentOffer getOffer(int index);

    /**
     * Sets the offer to provide to the player in a given index.
     *
     * @param offer The offer to provide
     * @param index The index
     * @throws IllegalArgumentException if the index is >= 3
     */
    void setOffer(@NotNull EnchantmentOffer offer, int index) throws IllegalArgumentException;

    default int getMaxAmountOffers(){
        return 3;
    }

    @Override
    default MCCMenuType getType() {
        return MCCMenuTypes.ENCHANTMENT;
    }

    @Override
    default boolean canBeOpened() {
        return true;
    }
}
