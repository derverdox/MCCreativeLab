package de.verdox.mccreativelab.world.block.behaviour;

import de.verdox.mccreativelab.InteractionResult;
import de.verdox.mccreativelab.ItemInteractionResult;
import de.verdox.mccreativelab.behaviour.BehaviourResult;
import de.verdox.mccreativelab.behaviour.BlockBehaviour;
import de.verdox.mccreativelab.random.VanillaRandomSource;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.RayTraceResult;
import org.jetbrains.annotations.NotNull;

public interface VanillaReplacingBlockBehaviour extends BlockBehaviour {

    BehaviourResult.Void VOID_DEFAULT = new BehaviourResult.Void(BehaviourResult.Void.Type.REPLACE_VANILLA);

    @Override
    default BehaviourResult.@NotNull Object<Float> getExplosionResistance(@NotNull Block block, @NotNull BlockData blockData) {
        return BlockBehaviour.super.getExplosionResistance(block, blockData);
    }

    @Override
    default BehaviourResult.@NotNull Object<BlockData> blockUpdate(@NotNull Location location, @NotNull BlockData blockData, @NotNull BlockFace direction, @NotNull BlockData neighbourBlockData, @NotNull Location neighbourLocation) {
        return new BehaviourResult.Object<>(blockData, BehaviourResult.Object.Type.REPLACE_VANILLA);
    }

    @Override
    default BehaviourResult.@NotNull Void onNeighbourBlockUpdate(@NotNull Block block, @NotNull Block sourceBlock, boolean notify) {
        return VOID_DEFAULT;
    }

    @Override
    default BehaviourResult.@NotNull Void stepOn(@NotNull Block block, @NotNull BlockData blockData, @NotNull Entity entity) {
        return VOID_DEFAULT;
    }

    @Override
    default BehaviourResult.@NotNull Void randomTick(@NotNull Block block, @NotNull VanillaRandomSource vanillaRandomSource) {
        return VOID_DEFAULT;
    }

    @Override
    default BehaviourResult.@NotNull Bool isBlockDataRandomlyTicking(@NotNull BlockData blockData) {
        return BlockBehaviour.super.isBlockDataRandomlyTicking(blockData);
    }

    @Override
    default BehaviourResult.@NotNull Bool isBlockRandomlyTicking(@NotNull Block block, @NotNull BlockData blockData) {
        return BlockBehaviour.super.isBlockRandomlyTicking(block, blockData);
    }

    @Override
    default BehaviourResult.@NotNull Callback onPlace(@NotNull Location location, @NotNull BlockData newBlockData, @NotNull BlockData oldBlockData, boolean notify, boolean isProcessingBlockPlaceEvent) {
        return BlockBehaviour.super.onPlace(location, newBlockData, oldBlockData, notify, isProcessingBlockPlaceEvent);
    }

    @Override
    default BehaviourResult.@NotNull Callback onPlayerPlace(@NotNull Player player, @NotNull ItemStack stackUsedToPlaceBlock, @NotNull Location location, @NotNull BlockData thePlacedState) {
        return BlockBehaviour.super.onPlayerPlace(player, stackUsedToPlaceBlock, location, thePlacedState);
    }

    @Override
    default BehaviourResult.@NotNull Callback onPlayerBreak(@NotNull Player player, @NotNull Location location, @NotNull BlockData brokenState) {
        return BlockBehaviour.super.onPlayerBreak(player, location, brokenState);
    }

    @Override
    default BehaviourResult.@NotNull Callback onRemove(@NotNull Location location, @NotNull BlockData newBlockData, @NotNull BlockData oldBlockData, boolean moved) {
        return BlockBehaviour.super.onRemove(location, newBlockData, oldBlockData, moved);
    }

    @Override
    default BehaviourResult.@NotNull Callback onUseCallback(@NotNull Block block, @NotNull Player player, @NotNull EquipmentSlot hand, @NotNull RayTraceResult rayTraceResult, @NotNull InteractionResult interactionResult) {
        return BlockBehaviour.super.onUseCallback(block, player, hand, rayTraceResult, interactionResult);
    }

    @Override
    default BehaviourResult.@NotNull Object<ItemInteractionResult> use(@NotNull Block block, @NotNull Player player, @NotNull EquipmentSlot hand, @NotNull RayTraceResult rayTraceResult) {
        return new BehaviourResult.Object<>(ItemInteractionResult.SUCCESS, BehaviourResult.Object.Type.REPLACE_VANILLA);
    }

    @Override
    default BehaviourResult.@NotNull Void tick(@NotNull Block block, @NotNull VanillaRandomSource vanillaRandomSource) {
        return VOID_DEFAULT;
    }

    @Override
    default BehaviourResult.@NotNull Bool canSurvive(@NotNull Block block, @NotNull World world) {
        return BlockBehaviour.super.canSurvive(block, world);
    }

    @Override
    default BehaviourResult.@NotNull Void attack(@NotNull Block block, @NotNull Player player) {
        return VOID_DEFAULT;
    }
}
