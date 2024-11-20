package de.verdox.mccreativelab.wrapper.inventory.types;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import org.bukkit.block.Furnace;
import org.jetbrains.annotations.Nullable;

public interface MCCFurnaceContainer extends MCCContainer<MCCBlockContainerSource> {
    /**
     * Get the current item in the result slot.
     *
     * @return The item
     */
    @Nullable
    default MCCItemStack getResult() {
        return this.getItem(2);
    }

    /**
     * Get the current fuel.
     *
     * @return The item
     */
    @Nullable
    default MCCItemStack getFuel() {
        return this.getItem(1);
    }

    /**
     * Get the item currently smelting.
     *
     * @return The item
     */
    @Nullable
    default MCCItemStack getSmelting() {
        return this.getItem(0);
    }

    /**
     * Set the current fuel.
     *
     * @param stack The item
     */
    default void setFuel(@Nullable MCCItemStack stack) {
        this.setItem(1, stack);
    }

    /**
     * Set the current item in the result slot.
     *
     * @param stack The item
     */
    default void setResult(@Nullable MCCItemStack stack) {
        this.setItem(2, stack);
    }

    /**
     * Set the item currently smelting.
     *
     * @param stack The item
     */
    default void setSmelting(@Nullable MCCItemStack stack) {
        this.setItem(0, stack);
    }


    /**
     * Check if an item can be used as a fuel source in this furnace container
     *
     * @param item Item to check
     * @return True if a valid fuel source
     */
    public boolean isFuel(@Nullable MCCItemStack item);

    /**
     * Check if an item can be smelted in this furnace container
     *
     * @param item Item to check
     * @return True if can be smelt
     */
    public boolean canSmelt(@Nullable MCCItemStack item);

    /**
     * The cook time for this view.
     * <p>
     * See {@link Furnace#getCookTime()} for more information.
     *
     * @return a number between 0 and 1
     */
    float getCookTime();

    /**
     * The total burn time for this view.
     * <p>
     * See {@link Furnace#getBurnTime()} for more information.
     *
     * @return a number between 0 and 1
     */
    float getBurnTime();

    /**
     * Checks whether or not the furnace is burning
     *
     * @return true given that the furnace is burning
     */
    boolean isBurning();

    /**
     * Sets the cook time
     * <p>
     * Setting cook time requires manipulation of both cookProgress and
     * cookDuration. This method does a simple division to get total progress
     * within the furnaces visual duration bar. For a clear visual effect
     * (cookProgress / cookDuration) should return a number between 0 and 1
     * inclusively.
     *
     * @param cookProgress the current of the cooking
     * @param cookDuration the total cook time
     */
    void setCookTime(int cookProgress, int cookDuration);

    /**
     * Sets the burn time
     * <p>
     * Setting burn time requires manipulation of both burnProgress and
     * burnDuration. This method does a simple division to get total progress
     * within the furnaces visual burning bar. For a clear visual effect
     * (burnProgress / burnDuration) should return a number between 0 and 1
     * inclusively.
     *
     * @param burnProgress the progress towards the burnDuration
     * @param burnDuration the total duration the view should be lit
     */
    void setBurnTime(int burnProgress, int burnDuration);

    @Override
    default boolean canBeOpened() {
        return true;
    }
}
