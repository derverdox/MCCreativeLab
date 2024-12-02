package de.verdox.mccreativelab.wrapper.inventory.types.menu;

import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.recipe.MCCMerchantRecipe;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCEntityContainerSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface MCCMerchantContainerMenu extends MCCContainerMenu<MCCEntityContainerSource<MCCEntity>, MCCContainer> {

    MCCContainer getContainerOfMerchant();

    /**
     * Get the index of the currently selected recipe.
     *
     * @return the index of the currently selected recipe
     */
    int getSelectedRecipeIndex();

    void setSelectedRecipeIndex(int index);

    /**
     * Get the currently active recipe.
     * <p>
     * This will be <code>null</code> if the items provided by the player do
     * not match the ingredients of the selected recipe. This does not
     * necessarily match the recipe selected by the player: If the player has
     * selected the first recipe, the merchant will search all of its offers
     * for a matching recipe to activate.
     *
     * @return the currently active recipe
     */
    @Nullable
    MCCMerchantRecipe getSelectedRecipe();

    /**
     * Get the recipe at a certain index of this merchant's trade list.
     *
     * @param index the index
     * @return the recipe
     * @throws IndexOutOfBoundsException if recipe index out of bounds
     */
    @NotNull
    MCCMerchantRecipe getRecipe(int index) throws IndexOutOfBoundsException;

    /**
     * Set the recipe at a certain index of this merchant's trade list.
     *
     * @param i      the index
     * @param recipe the recipe
     * @throws IndexOutOfBoundsException if recipe index out of bounds
     */
    void setRecipe(int index, @NotNull MCCMerchantRecipe recipe) throws IndexOutOfBoundsException;

    /**
     * Get a list of trades currently available from this merchant.
     *
     * @return an immutable list of trades
     */
    @NotNull
    List<MCCMerchantRecipe> getRecipes();

    /**
     * Set the list of trades currently available from this merchant.
     * <br>
     * This will not change the selected trades of players currently trading
     * with this merchant.
     *
     * @param recipes a list of recipes
     */
    void setRecipes(@NotNull List<MCCMerchantRecipe> recipes);

    void setExperienceBar(float progress);

    float getExperienceBarProgress();

    /**
     * Get the number of trades this merchant currently has available.
     *
     * @return the recipe count
     */
    int getRecipeCount();

    void setLevel(int level);

    int getLevel();

    void setCanRestock(boolean value);

    boolean canRestock();

    boolean showsProgressBar();

    void showProgressBar(boolean value);
}
