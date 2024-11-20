package de.verdox.mccreativelab.wrapper.inventory.recipe;

import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import org.jetbrains.annotations.NotNull;

public interface MCCRecipe {

    @NotNull MCCItemStack getResult();

}
