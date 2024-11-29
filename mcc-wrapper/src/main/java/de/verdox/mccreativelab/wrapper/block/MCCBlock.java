package de.verdox.mccreativelab.wrapper.block;

import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import de.verdox.mccreativelab.wrapper.MCCKeyedWrapper;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.world.chunk.MCCChunk;
import net.kyori.adventure.key.Key;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Objects;

/**
 * Describes an actual block in a minecraft world with a location and a type
 */
public final class MCCBlock implements MCCKeyedWrapper {
    private final MCCLocation location;
    private final MCCChunk mccChunk;

    public MCCBlock(MCCLocation location, MCCChunk mccChunk) {
        this.location = location;
        this.mccChunk = mccChunk;
    }

    /**
     * Returns the location of this block
     *
     * @return the location of the block
     */
    @NotNull
    public MCCLocation getLocation() {
        return location;
    }

    /**
     * Returns the block data of this block.
     *
     * @return the block data
     */
    @NotNull
    public MCCBlockState getBlockState() {
        return mccChunk.getBlockDataAt(location);
    }

    MCCCapturedBlockState captureBlock(){
        return new MCCCapturedBlockState(this);
    }

    /**
     * Returns the block type of this block
     *
     * @return the block type
     */
    @NotNull
    public MCCBlockType getBlockType() {
        return mccChunk.getBlockTypeAt(location);
    }

    /**
     * Returns all drops of this block as if it was broken by an entity.
     *
     * @param tool   the tool used to break the block
     * @param entity the entity breaking the block
     * @return the drops of this block as items
     */
    @NotNull
    public Collection<MCCItemStack> getDrops(@Nullable MCCEntity entity, @Nullable MCCItemStack tool) {
        return getBlockState().getDrops(entity, tool);
    }

    public void dropBlockLoot(@Nullable MCCEntity entity, @Nullable MCCItemStack tool){
        getLocation().world().dropItemsNaturally(getLocation(), getBlockState().getDrops(entity, tool));
    }

    /**
     * Naturally breaks this block as if a player had broken it.
     *
     * @param tool           the tool used
     * @param triggerEffect  whether to trigger a block break effect
     * @param dropExperience whether to drop Experience
     * @param ignoreTool     whether to ignore the tool
     */
    public void breakBlockNaturally(@Nullable MCCItemStack tool, boolean triggerEffect, boolean dropLoot, boolean dropExperience, boolean ignoreTool) {
        mccChunk.getWorld().breakBlockNaturally(tool, triggerEffect, dropLoot, dropExperience, ignoreTool);
    }

    /**
     * Naturally breaks this block as if a player had broken it.
     *
     * @param triggerEffect  whether to trigger a block break effect
     * @param dropExperience whether to drop Experience
     */
    public void breakBlockNaturally(boolean triggerEffect, boolean dropLoot, boolean dropExperience) {
        breakBlockNaturally(null, triggerEffect, dropLoot, dropExperience, true);
    }

    @Override
    public @NotNull Key key() {
        return getBlockState().key();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MCCBlock block = (MCCBlock) o;
        return Objects.equals(location, block.location) && Objects.equals(mccChunk, block.mccChunk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, mccChunk);
    }
}
