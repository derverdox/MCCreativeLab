package de.verdox.mccreativelab.wrapper.inventory.types;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuTypes;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import org.jetbrains.annotations.Nullable;

public interface MCCBrewingStandContainer extends MCCContainer<MCCBlockContainerSource> {

    /**
     * Get the current ingredient for brewing.
     *
     * @return The ingredient.
     */
    @Nullable
    default MCCItemStack getIngredient(){
        return this.getItem(3);
    }

    /**
     * Set the current ingredient for brewing.
     *
     * @param ingredient The ingredient
     */
    default void setIngredient(@Nullable MCCItemStack ingredient){
        this.setItem(3, ingredient);
    }

    /**
     * Get the current fuel for brewing.
     *
     * @return The fuel
     */
    @Nullable
    default MCCItemStack getFuel(){
        return this.getItem(4);
    }

    /**
     * Set the current fuel for brewing.
     *
     * @param fuel The fuel
     */
    default void setFuel(@Nullable MCCItemStack fuel){
        this.setItem(4, fuel);
    }

    /**
     * Gets the fuel level of this brewing stand.
     * <p>
     * The default maximum fuel level in minecraft is 20.
     *
     * @return The amount of fuel level left
     */
    int getFuelLevel();

    /**
     * Gets the amount of brewing ticks left.
     *
     * @return The amount of ticks left for the brewing task
     */
    int getBrewingTicks();

    /**
     * Sets the fuel level left.
     *
     * @param level the level of the fuel, which is no less than 0
     * @throws IllegalArgumentException if the level is less than 0
     */
    void setFuelLevel(final int level) throws IllegalArgumentException;

    /**
     * Sets the brewing ticks left.
     *
     * @param ticks the ticks left, which is no less than 0
     * @throws IllegalArgumentException if the ticks are less than 0
     */
    void setBrewingTicks(final int ticks) throws IllegalArgumentException;

    /**
     * Sets the recipe time for the brewing process which is
     * used to compute the progress of the brewing process with
     * {@link #getBrewingTicks()}.
     *
     * @param recipeBrewTime recipe brew time (in ticks)
     * @throws IllegalArgumentException if the recipe brew time is non-positive
     */
    void setRecipeBrewTime(@org.jetbrains.annotations.Range(from = 1, to = Integer.MAX_VALUE) int recipeBrewTime);

    /**
     * Gets the recipe time for the brewing process which is
     * used to compute the progress of the brewing process with
     * {@link #getBrewingTicks()}.
     *
     * @return recipe brew time (in ticks)
     */
    int getRecipeBrewTime();

    @Override
    default MCCMenuType getType() {
        return MCCMenuTypes.BREWING_STAND;
    }

    @Override
    default boolean canBeOpened() {
        return true;
    }
}
