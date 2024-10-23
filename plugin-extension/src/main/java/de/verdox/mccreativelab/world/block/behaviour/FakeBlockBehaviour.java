package de.verdox.mccreativelab.world.block.behaviour;

import de.verdox.mccreativelab.InteractionResult;
import de.verdox.mccreativelab.ItemInteractionResult;
import de.verdox.mccreativelab.behaviour.BehaviourResult;
import de.verdox.mccreativelab.behaviour.BlockBehaviour;
import de.verdox.mccreativelab.world.block.FakeBlockRegistry;
import de.verdox.mccreativelab.world.block.FakeBlock;
import de.verdox.mccreativelab.world.block.FakeBlockStorage;
import de.verdox.mccreativelab.world.block.entity.FakeBlockEntity;
import de.verdox.mccreativelab.world.block.entity.FakeBlockEntityStorage;
import de.verdox.mccreativelab.world.block.util.FakeBlockUtil;
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
import org.bukkit.util.Vector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FakeBlockBehaviour implements BlockBehaviour {

    @Override
    public BehaviourResult.@NotNull Callback onPlayerPlace(@NotNull Player player, @NotNull ItemStack stackUsedToPlaceBlock, @NotNull Location location, @NotNull BlockData thePlacedState) {
        setFakeBlockStateIfReusesVanillaBlockState(location.getBlock(), thePlacedState);

        FakeBlock.FakeBlockState fakeBlockState = FakeBlockStorage.getFakeBlockState(location, false);
        if(fakeBlockState != null && fakeBlockState.getFakeBlock().hasBlockEntity()) {
            FakeBlockEntity fakeBlockEntity = FakeBlockEntityStorage.createFakeBlockEntity(fakeBlockState, location);
            FakeBlockEntityStorage.getFakeBlockEntityDataFromItemStack(fakeBlockEntity, stackUsedToPlaceBlock);
        }

        return BlockBehaviour.super.onPlayerPlace(player, stackUsedToPlaceBlock, location, thePlacedState);
    }

    @Override
    public BehaviourResult.@NotNull Callback onPlayerBreak(@NotNull Player player, @NotNull Location location, @NotNull BlockData brokenState) {
        FakeBlockEntityStorage.removeFakeBlockEntityAt(location);
        return BlockBehaviour.super.onPlayerBreak(player, location, brokenState);
    }

    @Override
    public BehaviourResult.@NotNull Callback onPistonMoveBlock(@NotNull BlockData blockDataMoved, @NotNull Location positionBeforeMove, @NotNull Location positionAfterMove, @NotNull Block piston, @NotNull Vector moveDirection) {

        FakeBlockEntity fakeBlockEntity = FakeBlockEntityStorage.getFakeBlockEntityAt(positionBeforeMove.getBlock());
        if(fakeBlockEntity == null)
            return done();
        fakeBlockEntity.changePosition(positionAfterMove);
        return done();
    }

    @Override
    public BehaviourResult.@NotNull Callback onPlace(@NotNull Location location, @NotNull BlockData newBlockData, @NotNull BlockData oldBlockData, boolean notify, boolean isProcessingBlockPlaceEvent) {
        if (!isProcessingBlockPlaceEvent)
            setFakeBlockStateIfReusesVanillaBlockState(location.getBlock(), newBlockData);

        FakeBlock.FakeBlockState fakeBlockState = FakeBlockStorage.getFakeBlockState(location, false);
        if (!notify && !newBlockData.equals(oldBlockData) && fakeBlockState != null  && fakeBlockState.getFakeBlock().hasBlockEntity())
            FakeBlockEntityStorage.createFakeBlockEntity(fakeBlockState, location);

        return BlockBehaviour.super.onPlace(location, newBlockData, oldBlockData, notify, isProcessingBlockPlaceEvent);
    }

    @Override
    public BehaviourResult.@NotNull Callback onRemove(@NotNull Location location, @NotNull BlockData newBlockData, @NotNull BlockData oldBlockData, boolean moved) {
        if (!moved && !newBlockData.equals(oldBlockData)) FakeBlockEntityStorage.removeFakeBlockEntityAt(location);

        if (!newBlockData.getMaterial().isAir())
            return done();
        return BlockBehaviour.super.onRemove(location, newBlockData, oldBlockData, moved);
    }

    @Override
    public BehaviourResult.@NotNull Callback onDestroy(@NotNull Location location, boolean drop, @Nullable Entity destroyingEntity, int maxUpdateDepth) {
        FakeBlockEntityStorage.removeFakeBlockEntityAt(location);
        return BlockBehaviour.super.onDestroy(location, drop, destroyingEntity, maxUpdateDepth);
    }

    @Override
    public BehaviourResult.@NotNull Object<Float> getExplosionResistance(@NotNull Block block, @NotNull BlockData blockData) {
        FakeBlock.FakeBlockState fakeBlockState = FakeBlockStorage.getFakeBlockState(block.getLocation(), false);
        if (fakeBlockState == null)
            return BlockBehaviour.super.getExplosionResistance(block, blockData);

        return new BehaviourResult.Object<>(fakeBlockState.getProperties().getExplosionResistance(), BehaviourResult.Object.Type.REPLACE_VANILLA);
    }

    @Override
    public BehaviourResult.@NotNull Bool fertilizeAction(@NotNull Block block, @NotNull ItemStack stack) {
        FakeBlock.FakeBlockState fakeBlockState = FakeBlockStorage.getFakeBlockState(block.getLocation(), false);
        if (fakeBlockState == null)
            return BlockBehaviour.super.fertilizeAction(block, stack);

        return fakeBlockState.getFakeBlock().fertilizeAction(block, stack);
    }

    @Override
    public BehaviourResult.@NotNull Bool isBlockDataRandomlyTicking(@NotNull BlockData blockData) {
        return new BehaviourResult.Bool(true, BehaviourResult.Bool.Type.REPLACE_VANILLA);
    }

    @Override
    public BehaviourResult.@NotNull Bool isBlockRandomlyTicking(@NotNull Block block, @NotNull BlockData blockData) {
        FakeBlock.FakeBlockState fakeBlockState = FakeBlockStorage.getFakeBlockState(block.getLocation(), false);

        if (fakeBlockState == null)
            fakeBlockState = setFakeBlockStateIfReusesVanillaBlockState(block, blockData);

        if (fakeBlockState != null)
            return new BehaviourResult.Bool(fakeBlockState.getProperties().isRandomlyTicking(), BehaviourResult.Bool.Type.REPLACE_VANILLA);

        return BlockBehaviour.super.isBlockRandomlyTicking(block, blockData);
    }

    @Override
    public BehaviourResult.@NotNull Bool canSurvive(@NotNull Block block, @NotNull World world) {
        FakeBlock.FakeBlockState fakeBlockState = FakeBlockStorage.getFakeBlockState(block.getLocation(), false);

        if (fakeBlockState == null)
            fakeBlockState = setFakeBlockStateIfReusesVanillaBlockState(block, block.getBlockData());

        if (fakeBlockState != null)
            return fakeBlockState.getFakeBlock().canSurvive(block, world);

        return BlockBehaviour.super.canSurvive(block, world);
    }

    @Override
    public BehaviourResult.@NotNull Void stepOn(@NotNull Block block, @NotNull BlockData blockData, @NotNull Entity entity) {
        FakeBlock.FakeBlockState fakeBlockState = FakeBlockStorage.getFakeBlockState(block.getLocation(), false);

        if (fakeBlockState == null)
            fakeBlockState = setFakeBlockStateIfReusesVanillaBlockState(block, blockData);

        if (fakeBlockState != null)
            return fakeBlockState.getFakeBlock().stepOn(block, blockData, entity);

        return BlockBehaviour.super.stepOn(block, blockData, entity);
    }

    @Override
    public BehaviourResult.@NotNull Void randomTick(@NotNull Block block, @NotNull VanillaRandomSource vanillaRandomSource) {
        FakeBlock.FakeBlockState fakeBlockState = FakeBlockStorage.getFakeBlockState(block.getLocation(), false);

        if (fakeBlockState == null)
            fakeBlockState = setFakeBlockStateIfReusesVanillaBlockState(block, block.getBlockData());

        if (fakeBlockState != null)
            return fakeBlockState.getFakeBlock().randomTick(block, vanillaRandomSource);

        return BlockBehaviour.super.randomTick(block, vanillaRandomSource);
    }

    @Override
    public BehaviourResult.@NotNull Void tick(@NotNull Block block, @NotNull VanillaRandomSource vanillaRandomSource) {
        FakeBlock.FakeBlockState fakeBlockState = FakeBlockStorage.getFakeBlockState(block.getLocation(), false);

        if (fakeBlockState == null)
            fakeBlockState = setFakeBlockStateIfReusesVanillaBlockState(block, block.getBlockData());

        if (fakeBlockState != null)
            return fakeBlockState.getFakeBlock().tick(block, vanillaRandomSource);

        return BlockBehaviour.super.tick(block, vanillaRandomSource);
    }

    @Override
    public BehaviourResult.@NotNull Object<BlockData> blockUpdate(@NotNull Location location, @NotNull BlockData blockData, @NotNull BlockFace direction, @NotNull BlockData neighbourBlockData, @NotNull Location neighbourLocation) {
        FakeBlock.FakeBlockState fakeBlockState = FakeBlockStorage.getFakeBlockState(location, false);

        if (fakeBlockState == null)
            fakeBlockState = setFakeBlockStateIfReusesVanillaBlockState(location.getBlock(), blockData);

        if (fakeBlockState != null) {
            BehaviourResult.Object<BlockData> result = fakeBlockState.getFakeBlock().blockUpdate(location, blockData, direction, neighbourBlockData, neighbourLocation);
/*            fakeBlockState.getFakeBlockDisplay().getFakeBlockVisualStrategy()
                .blockUpdate(location.getBlock(), fakeBlockState, direction, neighbourBlockData);*/
            return result;
        }
        return BlockBehaviour.super.blockUpdate(location, blockData, direction, neighbourBlockData, neighbourLocation);
    }

    @Override
    public BehaviourResult.@NotNull Void onNeighbourBlockUpdate(@NotNull Block block, @NotNull Block sourceBlock, boolean notify) {
        FakeBlock.FakeBlockState fakeBlockState = FakeBlockStorage.getFakeBlockState(block.getLocation(), false);

        if (fakeBlockState == null)
            fakeBlockState = setFakeBlockStateIfReusesVanillaBlockState(block, block.getBlockData());

        if (fakeBlockState != null)
            return fakeBlockState.getFakeBlock().onNeighbourBlockUpdate(block, sourceBlock, notify);

        return BlockBehaviour.super.onNeighbourBlockUpdate(block, sourceBlock, notify);
    }

    @Override
    public BehaviourResult.@NotNull Void attack(@NotNull Block block, @NotNull Player player) {
        FakeBlock.FakeBlockState fakeBlockState = FakeBlockStorage.getFakeBlockState(block.getLocation(), false);

        if (fakeBlockState == null)
            fakeBlockState = setFakeBlockStateIfReusesVanillaBlockState(block, block.getBlockData());

        if (fakeBlockState != null)
            return fakeBlockState.getFakeBlock().attack(block, player);

        return BlockBehaviour.super.attack(block, player);
    }

    @Override
    public BehaviourResult.@NotNull Object<ItemInteractionResult> use(@NotNull Block block, @NotNull Player player, @NotNull EquipmentSlot hand, @NotNull RayTraceResult rayTraceResult) {
        FakeBlock.FakeBlockState fakeBlockState = FakeBlockStorage.getFakeBlockState(block.getLocation(), false);
        if (fakeBlockState != null)
            return fakeBlockState.getFakeBlock().use(block, player, hand, rayTraceResult);
        return BlockBehaviour.super.use(block, player, hand, rayTraceResult);
    }

    @Override
    public BehaviourResult.@NotNull Callback onUseCallback(@NotNull Block block, @NotNull Player player, @NotNull EquipmentSlot hand, @NotNull RayTraceResult rayTraceResult, @NotNull InteractionResult interactionResult) {
        setFakeBlockStateIfReusesVanillaBlockState(block, block.getBlockData());
        return BlockBehaviour.super.onUseCallback(block, player, hand, rayTraceResult, interactionResult);
    }

    @Nullable
    public static FakeBlock.FakeBlockState setFakeBlockStateIfReusesVanillaBlockState(Block block, BlockData blockData) {
        FakeBlock.FakeBlockState fakeBlockState = FakeBlockRegistry.getFakeBlockStateFromBlockData(blockData);
        if (fakeBlockState == null)
            return null;
        FakeBlockStorage.setFakeBlockState(block.getLocation(), fakeBlockState, false, false);
        return fakeBlockState;
    }
}
