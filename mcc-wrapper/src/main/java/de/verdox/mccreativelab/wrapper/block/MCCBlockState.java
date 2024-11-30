package de.verdox.mccreativelab.wrapper.block;

import de.verdox.mccreativelab.wrapper.annotations.MCCBuiltIn;
import de.verdox.mccreativelab.wrapper.annotations.MCCInstantiationSource;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import de.verdox.mccreativelab.wrapper.MCCKeyedWrapper;
import de.verdox.mccreativelab.wrapper.world.chunk.MCCChunk;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Describes a variant of a block
 */
@MCCInstantiationSource(sourceClasses = MCCChunk.class)
@MCCBuiltIn(syncState = MCCBuiltIn.SyncState.SYNCED, clientEntersErrorStateOnDesync = true)
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
    default void setBlock(@NotNull MCCLocation location, boolean applyPhysics) {
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

    float getDestroySpeed(MCCPlayer player, MCCItemStack mccItemStack, boolean considerEnchants);

    /**
     * Returns all drops of this block as if it was broken by an entity.
     *
     * @param entity the entity breaking the block
     * @param tool   the tool used to break the block
     * @return the drops of this block as items
     */
    @NotNull List<MCCItemStack> getDrops(@Nullable MCCEntity entity, @Nullable MCCItemStack tool);
}
