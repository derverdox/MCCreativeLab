package de.verdox.mccreativelab.wrapper.inventory.recipe;

import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import org.bukkit.inventory.MerchantRecipe;
import org.jetbrains.annotations.NotNull;

public record MCCMerchantRecipe(@NotNull MCCItemStack result, int uses, int maxUses, boolean experienceReward,
                                int villagerExperience, float priceMultiplier, int demand, int specialPrice,
                                boolean ignoreDiscounts) implements MCCRecipe {
    @Override
    public @NotNull MCCItemStack getResult() {

        return result;
    }
}
