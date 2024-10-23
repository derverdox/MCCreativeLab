package de.verdox.mccreativelab.world.item.behaviour;

import de.verdox.mccreativelab.InteractionResult;
import de.verdox.mccreativelab.behaviour.BehaviourResult;
import de.verdox.mccreativelab.behaviour.ItemBehaviour;
import de.verdox.mccreativelab.behaviour.interaction.ItemStackInteraction;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Item;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.RayTraceResult;
import org.jetbrains.annotations.NotNull;

public interface VanillaReplacingItemBehaviour extends ItemBehaviour {
    @Override
    default BehaviourResult.@NotNull Object<ItemStack> finishUsingItem(@NotNull LivingEntity livingEntity, @NotNull ItemStack usedItem) {
        return new BehaviourResult.Object<>(usedItem, BehaviourResult.Object.Type.REPLACE_VANILLA);
    }

    @Override
    default BehaviourResult.@NotNull Bool mineBlock(@NotNull ItemStack stack, @NotNull Block block, @NotNull Player miner) {
        return new BehaviourResult.Bool(false, BehaviourResult.Bool.Type.REPLACE_VANILLA);
    }

    @Override
    default BehaviourResult.@NotNull Bool isCorrectToolForDrops(@NotNull ItemStack stack, @NotNull BlockData blockData) {
        return new BehaviourResult.Bool(false, BehaviourResult.Bool.Type.REPLACE_VANILLA);
    }

    @Override
    default BehaviourResult.@NotNull Void onCraftedBy(@NotNull ItemStack stack, @NotNull Player player, int amount) {
        return new BehaviourResult.Void(BehaviourResult.Void.Type.REPLACE_VANILLA);
    }

    @Override
    default BehaviourResult.@NotNull Void onDestroyed(@NotNull ItemStack stack, @NotNull Item item) {
        return new BehaviourResult.Void(BehaviourResult.Void.Type.REPLACE_VANILLA);
    }

    @Override
    default BehaviourResult.@NotNull Object<ItemStackInteraction> use(@NotNull ItemStack stack, @NotNull Player player, @NotNull EquipmentSlot equipmentSlot) {
        return new BehaviourResult.Object<>(new ItemStackInteraction(InteractionResult.PASS, new ItemStack(Material.AIR)), BehaviourResult.Object.Type.REPLACE_VANILLA);
    }

    @Override
    default BehaviourResult.@NotNull Object<InteractionResult> useOn(@NotNull ItemStack stack, @NotNull Player player, @NotNull EquipmentSlot equipmentSlot, @NotNull RayTraceResult rayTraceResult) {
        return new BehaviourResult.Object<>(InteractionResult.PASS, BehaviourResult.Object.Type.REPLACE_VANILLA);
    }

    @Override
    default BehaviourResult.@NotNull Object<ItemStack> getCraftRemainingItem(@NotNull ItemStack stack) {
        return new BehaviourResult.Object<>(new ItemStack(Material.AIR), BehaviourResult.Object.Type.REPLACE_VANILLA);
    }

    @Override
    default BehaviourResult.@NotNull Bool canFitInsideContainerItems(@NotNull ItemStack stack) {
        return new BehaviourResult.Bool(false, BehaviourResult.Bool.Type.REPLACE_VANILLA);
    }

    @Override
    default BehaviourResult.@NotNull Bool isEnchantable(@NotNull ItemStack stack) {
        return new BehaviourResult.Bool(false, BehaviourResult.Bool.Type.REPLACE_VANILLA);
    }

    @Override
    default BehaviourResult.@NotNull Object<InteractionResult> interactLivingEntity(@NotNull ItemStack stack, @NotNull Player player, @NotNull LivingEntity livingEntity, @NotNull EquipmentSlot equipmentSlot) {
        return new BehaviourResult.Object<>(InteractionResult.PASS, BehaviourResult.Object.Type.REPLACE_VANILLA);
    }
}
