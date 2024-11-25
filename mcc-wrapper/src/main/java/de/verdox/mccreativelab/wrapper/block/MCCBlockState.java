package de.verdox.mccreativelab.wrapper.block;

import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import de.verdox.mccreativelab.wrapper.MCCKeyedWrapper;
import org.jetbrains.annotations.NotNull;

/**
 * Describes a variant of a block
 */
public interface MCCBlockState extends MCCKeyedWrapper {

    /**
     * Returns the parent block type of this block state
     *
     * @return the block type
     */
    @NotNull MCCBlockType getBlockType();

    /**
     * Changes a block at the provided location to this block state
     *
     * @param location the location to change the block at
     */
    default void setBlock(@NotNull MCCLocation location) {
        setBlock(location, true);
    }

    /**
     * Changes a block at the provided location to this block state
     *
     * @param location     the location to change the block at
     * @param applyPhysics whether the change should trigger block updates
     */
    default void setBlock(@NotNull MCCLocation location, boolean applyPhysics){
        location.world().setBlock(this, location, applyPhysics);
    }

    /**
     * The block state string describing the state and its variables
     *
     * @return the state as string
     */
    String toBlockDataString();

    default boolean isPreferredTool(MCCBlockState blockState, MCCItemStack nmsItem) {
        return !blockState.getBlockType().requiresCorrectToolForDrops() || nmsItem.isCorrectToolForDrops(blockState);
    }

    float getDestroySpeed(MCCItemStack mccItemStack, boolean considerEnchants);
}
