package de.verdox.mccreativelab.wrapper.block;

import de.verdox.mccreativelab.wrapper.annotations.MCCBuiltIn;
import de.verdox.mccreativelab.wrapper.annotations.MCCInstantiationSource;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import de.verdox.mccreativelab.wrapper.MCCKeyedWrapper;
import de.verdox.mccreativelab.wrapper.world.chunk.MCCChunkSection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Describes a block type and its block states
 */
@MCCInstantiationSource(sourceClasses = MCCChunkSection.class)
@MCCBuiltIn(syncState = MCCBuiltIn.SyncState.SYNCED, clientEntersErrorStateOnDesync = true)
public interface MCCBlockType extends MCCKeyedWrapper {

    /**
     * Changes a block at the provided location to this block type
     *
     * @param location the location to change the block at
     */
    default void setBlock(@NotNull MCCLocation location) {
        setBlock(location, false);
    }

    /**
     * Changes a block at the provided location to this block type
     *
     * @param location     the location to change the block at
     * @param applyPhysics whether a block update is triggered
     */
    default void setBlock(@NotNull MCCLocation location, boolean applyPhysics) {
        location.world().setBlock(this, location, applyPhysics);
    }

    /**
     * Returns all defined block states for this block type
     *
     * @return a list of block states
     */
    List<MCCBlockState> getAllBlockStates();

    /**
     * Returns the default block state of this block
     *
     * @return the default block state
     */
    MCCBlockState getDefaultState();

    /**
     * Returns the sound group of this block type
     *
     * @return the sound group
     */
    MCCBlockSoundGroup getSoundGroup();

    default List<MCCItemStack> getDrops(MCCBlockState blockState, @Nullable MCCEntity entity, @Nullable MCCItemStack tool) {
        return blockState.getDrops(entity, tool);
    }

    /**
     * Returns the explosion resistance of this block type
     *
     * @return the explosion resistance
     */
    float getExplosionResistance();

    /**
     * Returns the hardness of this block type
     *
     * @return the hardness
     */
    float getHardness();

    /**
     * Returns the friction of this block type
     *
     * @return the friction
     */
    float getFriction();

    /**
     * Returns the jump factor of this block type
     *
     * @return the jump factor
     */
    float getJumpFactor();

    /**
     * Returns the speed factor of this block type
     *
     * @return the speed factor
     */
    float getSpeedFactor();

    /**
     * Returns if this block type is randomly ticking
     *
     * @return true if the block type is randomly ticking
     */
    boolean isRandomlyTicking();

    /**
     * Returns if this block type requires correct tools for drops
     *
     * @return true if the block type requires correct tools for drops
     */
    boolean requiresCorrectToolForDrops();

    //TODO: 
    // - Piston Push Reaction
    // - Light Level
}
