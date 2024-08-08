package de.verdox.mccreativelab.behaviour;

import de.verdox.mccreativelab.InteractionResult;
import de.verdox.mccreativelab.ItemInteractionResult;
import de.verdox.mccreativelab.MultiCustomBehaviour;
import de.verdox.mccreativelab.random.VanillaRandomSource;
import org.bukkit.Location;
import org.bukkit.Material;
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

public interface BlockBehaviour extends Behaviour {
    MultiCustomBehaviour<Material, BlockBehaviour> BLOCK_BEHAVIOUR = new MultiCustomBehaviour<>(BlockBehaviour.class, new BlockBehaviour() {}, "MCCLab - BlockBehaviour");

    /**
     * This method is called to get the explosion resistance of a block
     *
     * @param block     The block
     * @param blockData The blockData of the block
     * @return float result
     */
    default BehaviourResult.Object<Float> getExplosionResistance(Block block, BlockData blockData) {
        return BehaviourResult.Object.DEFAULT_INSTANCE;
    }

    /**
     * This method is called everytime the block receives a block update due to any reason.
     * Normally this happens when a block next to this block was changed. If you want to implement any custom behaviour on environmental changes use this method.
     *
     * @param location           The location of the block
     * @param blockData          The blockData of the block
     * @param direction          The direction of the Blockupdate
     * @param neighbourBlockData The neighbour blockdata that issued the block update
     * @param neighbourLocation  The neighbour location
     * @return The blockdata that results from this update.
     */
    default BehaviourResult.Object<BlockData> blockUpdate(Location location, BlockData blockData, BlockFace direction, BlockData neighbourBlockData, Location neighbourLocation) {
        return result(blockData, BehaviourResult.Object.Type.USE_VANILLA);
    }

    /**
     * This method is called everytime the block recognizes a neighbour block update
     * Normally this happens when a block next to this block was changed. If you want to implement any custom behaviour on environmental changes use this method.
     *
     * @param block           The block recognizing the neighbour update
     * @param sourceBlock     The neighbour block receiving the block update
     * @param notify          The Notify flag
     */
    default BehaviourResult.Void onNeighbourBlockUpdate(Block block, Block sourceBlock, boolean notify) {
        return BehaviourResult.Void.DEFAULT_INSTANCE;
    }

    /**
     * This method is called whenever an entity steps on a block
     *
     * @param block     The block
     * @param blockData The blockData of the block
     * @param entity    The Entity stepping on the block
     * @return void result
     */
    default BehaviourResult.Void stepOn(Block block, BlockData blockData, Entity entity) {
        return BehaviourResult.Void.DEFAULT_INSTANCE;
    }

    /**
     * This method is called every time the server software tries to randomly tick a block.
     *
     * @param block               The randomly ticked block
     * @param vanillaRandomSource The vanilla random source
     */
    default BehaviourResult.Void randomTick(Block block, VanillaRandomSource vanillaRandomSource) {
        return BehaviourResult.Void.DEFAULT_INSTANCE;
    }

    /**
     * This method is called to check if a blockdata is randomly ticking regardless of it being placed in a world right now.
     *
     * @param blockData The block data of the block
     * @return A boolean result
     */
    default BehaviourResult.Bool isBlockDataRandomlyTicking(BlockData blockData) {
        return BehaviourResult.Bool.DEFAULT_INSTANCE;
    }

    /**
     * This method is called to check if a block in a world is randomly ticking
     *
     * @param block     The block
     * @param blockData The block data of the block
     * @return A boolean result
     */
    default BehaviourResult.Bool isBlockRandomlyTicking(Block block, BlockData blockData) {
        return BehaviourResult.Bool.DEFAULT_INSTANCE;
    }

    /**
     * This callback is run after the server placed a block due to any reason. This method is NOT called when a player places block!
     *
     * @param location     The location
     * @param newBlockData The new block data
     * @param oldBlockData The old block data
     * @param notify       Whether this notifies the world
     * @return callback
     */
    default BehaviourResult.Callback onPlace(Location location, BlockData newBlockData, BlockData oldBlockData, boolean notify, boolean isProcessingBlockPlaceEvent) {
        return BehaviourResult.Callback.DEFAULT_INSTANCE;
    }

    /**
     * This callback is run after a player successfully placed a block. If the Block Place Action was cancelled by an event this function is not called.
     *
     * @param player   The player
     * @param location The location
     * @return callback
     */
    default BehaviourResult.Callback onPlayerPlace(Player player, ItemStack stackUsedToPlaceBlock, Location location, BlockData thePlacedState) {
        return BehaviourResult.Callback.DEFAULT_INSTANCE;
    }

    /**
     * This callback is run after a player breaks a block
     *
     * @param player      The player
     * @param location    The location
     * @param brokenState The broken block state
     * @return callback
     */
    default BehaviourResult.Callback onPlayerBreak(Player player, Location location, BlockData brokenState) {
        return BehaviourResult.Callback.DEFAULT_INSTANCE;
    }


    /**
     * This callback is run after the server removes a block due to any reason. This does not include a player breaking a block.
     *
     * @param location     The location
     * @param newBlockData The new block data
     * @param oldBlockData The old block data
     * @param moved        Whether the block was moved
     * @return callback
     */
    default BehaviourResult.Callback onRemove(Location location, BlockData newBlockData, BlockData oldBlockData, boolean moved) {
        return BehaviourResult.Callback.DEFAULT_INSTANCE;
    }

    /**
     *
     * @param location - The block location
     * @param drop - True if the block dropped items
     * @param destroyingEntity - The Entity that destroyed the block
     * @param maxUpdateDepth - The chunk update depth
     * @return a callback object
     */
    default BehaviourResult.Callback onDestroy(Location location, boolean drop, @javax.annotation.Nullable Entity destroyingEntity, int maxUpdateDepth) {
        return BehaviourResult.Callback.DEFAULT_INSTANCE;
    }

    /**
     * This method is run when a player interacts with a block in any way. By overriding this method, various bukkit events, paper code, and fixed won't be called.
     *
     * @param block          The block
     * @param player         The player
     * @param hand           The Hand used to interact
     * @param rayTraceResult The interaction info
     * @return The result of this interaction
     */
    default BehaviourResult.Object<ItemInteractionResult> use(Block block, Player player, EquipmentSlot hand, RayTraceResult rayTraceResult) {
        return BehaviourResult.Object.DEFAULT_INSTANCE;
    }

    /**
     * This callback is run after a player interacted with this block. This method is not run on blocks that call bukkit events! Only on those that do not define any specific onUse Behaviour
     *
     * @param block          The block
     * @param player         The player
     * @param hand           The Hand used to interact
     * @param rayTraceResult The interaction info
     * @return callback
     */
    default BehaviourResult.Callback onUseCallback(Block block, Player player, EquipmentSlot hand, RayTraceResult rayTraceResult, InteractionResult interactionResult) {
        return BehaviourResult.Callback.DEFAULT_INSTANCE;
    }

    /**
     * This callback is run after a block was successfully moved by a piston
     *
     * @return callback
     */
    default BehaviourResult.Callback onPistonMoveBlock(BlockData blockDataMoved, Location positionBeforeMove, Location positionAfterMove, Block piston, Vector moveDirection) {
        return BehaviourResult.Callback.DEFAULT_INSTANCE;
    }

    /**
     * This method is called every time the server software ticks a block.
     * <p>
     * Some blocks may not be ticked in vanilla by default. For example Stone blocks don't receive ticks.
     * Please use the blockUpdate method to implement any custom logic or to call this method.
     *
     * @param block               The ticked block
     * @param vanillaRandomSource The vanilla random source
     */
    default BehaviourResult.Void tick(Block block, VanillaRandomSource vanillaRandomSource) {
        return BehaviourResult.Void.DEFAULT_INSTANCE;
    }

    /**
     * This method is called to check if a block can survive in the current environment
     * <p>
     * Some blocks may not use this method by default.
     * Please use the blockUpdate method to implement any custom logic or to call this method.
     *
     * @param block The block
     * @param world The world
     * @return A boolean result
     */
    default BehaviourResult.Bool canSurvive(Block block, World world) {
        return BehaviourResult.Bool.DEFAULT_INSTANCE;
    }

    /**
     * This method is called every time a user left-clicks a block.
     * <p>
     *
     * @param block  The clicked block
     * @param player The player
     */
    default BehaviourResult.Void attack(Block block, Player player) {
        return BehaviourResult.Void.DEFAULT_INSTANCE;
    }

    /**
     * Called when a player uses bonemeal on a block.
     * @param block The block that is fertilized
     * @param stack The item used to fertilize. The Minecraft server will call this only for bonemeal.
     * @return True if the action was a success
     */
    default BehaviourResult.Bool fertilizeAction(Block block, ItemStack stack){
        return BehaviourResult.Bool.DEFAULT_INSTANCE;
    }
}

