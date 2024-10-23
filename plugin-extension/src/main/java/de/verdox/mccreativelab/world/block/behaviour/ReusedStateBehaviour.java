package de.verdox.mccreativelab.world.block.behaviour;

import de.verdox.mccreativelab.InteractionResult;
import de.verdox.mccreativelab.ItemInteractionResult;
import de.verdox.mccreativelab.MCCreativeLabExtension;
import de.verdox.mccreativelab.behaviour.BehaviourResult;
import de.verdox.mccreativelab.behaviour.BlockBehaviour;
import de.verdox.mccreativelab.world.block.FakeBlock;
import de.verdox.mccreativelab.world.block.FakeBlockRegistry;
import de.verdox.mccreativelab.world.block.FakeBlockStorage;
import de.verdox.mccreativelab.random.VanillaRandomSource;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
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
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

/**
 * This behaviour is used for reused block states like note blocks.
 */
public class ReusedStateBehaviour extends FakeBlockBehaviour {
    private final Material replacedVanillaBlock;
    private final NamespacedKey fakeBlockKey;
    private Supplier<BlockBehaviour> replacedVanillaBehaviour;

    public ReusedStateBehaviour(Material replacedVanillaBlock, @Nullable NamespacedKey fakeBlockKey, @Nullable Supplier<BlockBehaviour> replacedVanillaBehaviour) {
        this.replacedVanillaBlock = replacedVanillaBlock;
        this.fakeBlockKey = fakeBlockKey;
        this.replacedVanillaBehaviour = replacedVanillaBehaviour != null ? replacedVanillaBehaviour : () -> new BlockBehaviour() {
        };
    }

    public ReusedStateBehaviour(Material replacedVanillaBlock, @Nullable NamespacedKey fakeBlockKey, @Nullable BlockBehaviour replacedVanillaBehaviour) {
        this(replacedVanillaBlock, fakeBlockKey, replacedVanillaBehaviour == null ? null : () -> replacedVanillaBehaviour);
    }

    public ReusedStateBehaviour(Material replacedVanillaBlock) {
        this(replacedVanillaBlock, null, (BlockBehaviour) null);
    }

    private BlockBehaviour getReplacedVanillaBehaviour() {
        return replacedVanillaBehaviour.get();
    }

    @Override
    public BehaviourResult.@NotNull Object<Float> getExplosionResistance(@NotNull Block block, @NotNull BlockData blockData) {
        if (isReplacedVanillaBlock(block))
            return getReplacedVanillaBehaviour().getExplosionResistance(block, blockData);
        return super.getExplosionResistance(block, blockData);
    }

    @Override
    public BehaviourResult.@NotNull Bool isBlockRandomlyTicking(@NotNull Block block, @NotNull BlockData blockData) {
        if (isReplacedVanillaBlock(block))
            return getReplacedVanillaBehaviour().isBlockRandomlyTicking(block, blockData);
        return super.isBlockRandomlyTicking(block, blockData);
    }

    @Override
    public BehaviourResult.@NotNull Callback onPlayerBreak(@NotNull Player player, @NotNull Location location, @NotNull BlockData brokenState) {
        if (isReplacedVanillaBlock(location.getBlock()))
            return getReplacedVanillaBehaviour().onPlayerBreak(player, location, brokenState);
        return super.onPlayerBreak(player, location, brokenState);
    }

    @Override
    public BehaviourResult.@NotNull Callback onPlace(@NotNull Location location, @NotNull BlockData newBlockData, @NotNull BlockData oldBlockData, boolean notify, boolean isProcessingBlockPlaceEvent) {
        //System.out.println("onPlaceByServer: " + oldBlockData.getAsString() + " -> " + newBlockData + " (notify = " + notify + ")");
        if (isReplacedVanillaBlock(location.getBlock()))
            return getReplacedVanillaBehaviour().onPlace(location, newBlockData, oldBlockData, notify, isProcessingBlockPlaceEvent);
        return super.onPlace(location, newBlockData, oldBlockData, notify, isProcessingBlockPlaceEvent);
    }

    @Override
    public BehaviourResult.@NotNull Callback onRemove(@NotNull Location location, @NotNull BlockData newBlockData, @NotNull BlockData oldBlockData, boolean moved) {
        //System.out.println("onRemove: " + oldBlockData.getAsString() + " ---> " + newBlockData.getAsString() + " (moved = " + moved + ")");
        if (isReplacedVanillaBlock(location.getBlock()))
            return getReplacedVanillaBehaviour().onRemove(location, newBlockData, oldBlockData, moved);
        return super.onRemove(location, newBlockData, oldBlockData, moved);
    }

    @Override
    public BehaviourResult.@NotNull Callback onPlayerPlace(@NotNull Player player, @NotNull ItemStack stackUsedToPlaceBlock, @NotNull Location location, @NotNull BlockData thePlacedState) {
        if (isReplacedVanillaBlock(location.getBlock()))
            return getReplacedVanillaBehaviour().onPlayerPlace(player, stackUsedToPlaceBlock, location, thePlacedState);
        replaceVanillaWithFakeBlock(location.getBlock());
        return super.onPlayerPlace(player, stackUsedToPlaceBlock, location, thePlacedState);
    }

    @Override
    public BehaviourResult.@NotNull Bool canSurvive(@NotNull Block block, @NotNull World world) {
        if (isReplacedVanillaBlock(block))
            return getReplacedVanillaBehaviour().canSurvive(block, world);
        return super.canSurvive(block, world);
    }

    @Override
    public BehaviourResult.@NotNull Void stepOn(@NotNull Block block, @NotNull BlockData blockData, @NotNull Entity entity) {
        if (isReplacedVanillaBlock(block))
            return getReplacedVanillaBehaviour().stepOn(block, blockData, entity);
        return super.stepOn(block, blockData, entity);
    }

    @Override
    public BehaviourResult.@NotNull Callback onUseCallback(@NotNull Block block, @NotNull Player player, @NotNull EquipmentSlot hand, @NotNull RayTraceResult rayTraceResult, @NotNull InteractionResult interactionResult) {
        if (isReplacedVanillaBlock(block))
            return getReplacedVanillaBehaviour().onUseCallback(block, player, hand, rayTraceResult, interactionResult);
        replaceVanillaWithFakeBlock(block);
        return super.onUseCallback(block, player, hand, rayTraceResult, interactionResult);
    }

    @Override
    public BehaviourResult.@NotNull Void randomTick(@NotNull Block block, @NotNull VanillaRandomSource vanillaRandomSource) {
        if (isReplacedVanillaBlock(block))
            return getReplacedVanillaBehaviour().randomTick(block, vanillaRandomSource);
        replaceVanillaWithFakeBlock(block);
        return super.randomTick(block, vanillaRandomSource);
    }

    @Override
    public BehaviourResult.@NotNull Void tick(@NotNull Block block, @NotNull VanillaRandomSource vanillaRandomSource) {
        if (isReplacedVanillaBlock(block))
            return getReplacedVanillaBehaviour().tick(block, vanillaRandomSource);
        replaceVanillaWithFakeBlock(block);
        return super.tick(block, vanillaRandomSource);
    }

    @Override
    public BehaviourResult.@NotNull Object<ItemInteractionResult> use(@NotNull Block block, @NotNull Player player, @NotNull EquipmentSlot hand, @NotNull RayTraceResult rayTraceResult) {
        if (isReplacedVanillaBlock(block))
            return getReplacedVanillaBehaviour().use(block, player, hand, rayTraceResult);
        replaceVanillaWithFakeBlock(block);
        return super.use(block, player, hand, rayTraceResult);
    }

    @Override
    public BehaviourResult.@NotNull Object<BlockData> blockUpdate(@NotNull Location location, @NotNull BlockData blockData, @NotNull BlockFace direction, @NotNull BlockData neighbourBlockData, @NotNull Location neighbourLocation) {
        if (isReplacedVanillaBlock(location.getBlock()))
            return getReplacedVanillaBehaviour().blockUpdate(location, blockData, direction, neighbourBlockData, neighbourLocation);
        replaceVanillaWithFakeBlock(location.getBlock());
        return super.blockUpdate(location, blockData, direction, neighbourBlockData, neighbourLocation);
    }

    @Override
    public BehaviourResult.@NotNull Void onNeighbourBlockUpdate(@NotNull Block block, @NotNull Block sourceBlock, boolean notify) {
        if (isReplacedVanillaBlock(block))
            return getReplacedVanillaBehaviour().onNeighbourBlockUpdate(block, sourceBlock, notify);
        replaceVanillaWithFakeBlock(block);
        return super.onNeighbourBlockUpdate(block, sourceBlock, notify);
    }

    @Override
    public BehaviourResult.@NotNull Void attack(@NotNull Block block, @NotNull Player player) {
        if (isReplacedVanillaBlock(block))
            return getReplacedVanillaBehaviour().attack(block, player);
        replaceVanillaWithFakeBlock(block);
        return super.attack(block, player);
    }

    private void replaceVanillaWithFakeBlock(Block block) {
        FakeBlock.FakeBlockState fakeBlockState = FakeBlockStorage.getFakeBlockState(block.getLocation(), false);
        if (fakeBlockState != null)
            return;
        FakeBlockStorage.setFakeBlockState(block.getLocation(), FakeBlockRegistry.getReusedBlockStates().getOrDefault(block.getBlockData(), null), false, false);
    }

    private boolean isReplacedVanillaBlock(Block block) {
        if (fakeBlockKey == null)
            return false;
        FakeBlock.FakeBlockState fakeBlockState = FakeBlockStorage.getFakeBlockState(block.getLocation(), false);
        if (fakeBlockState == null)
            return false;
        return fakeBlockState.getFakeBlock().getKey().equals(fakeBlockKey);
    }

}
