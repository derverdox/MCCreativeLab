package de.verdox.mccreativelab.wrapper.inventory;

import de.verdox.mccreativelab.wrapper.types.MCCEnchantment;
import org.jetbrains.annotations.NotNull;

public record MCCEnchantmentOffer(@NotNull MCCEnchantment enchantment, int enchantmentLevel, int cost) {
}
