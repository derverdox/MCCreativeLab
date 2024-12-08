package de.verdox.mccreativelab.wrapper.world.chunk;

import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.annotations.MCCInstantiationSource;
import de.verdox.mccreativelab.wrapper.block.MCCBlock;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import de.verdox.mccreativelab.wrapper.world.MCCWorld;
import org.checkerframework.checker.index.qual.NonNegative;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface MCCChunk extends MCCWrapped {
    boolean isLoaded();

    MCCWorld getWorld();

    int getX();

    int getZ();

    int getHeight();

    int getHighestFilledSectionIndex();

    List<MCCEntity> getEntitiesInChunk();

    default MCCBlockState getBlockDataAt(MCCLocation location) {
        checkIfLocationInChunk(location);
        return getBlockDataAt(location.toChunkBlockLocalX(), location.toChunkBlockLocalY(), location.toChunkBlockLocalZ());
    }

    default MCCBlockType getBlockTypeAt(MCCLocation location) {
        checkIfLocationInChunk(location);
        return getBlockTypeAt(location.toChunkBlockLocalX(), location.toChunkBlockLocalY(), location.toChunkBlockLocalZ());
    }

    default void setBlock(@NotNull MCCBlockType mccBlockType, MCCLocation location) {
        checkIfLocationInChunk(location);
        setBlock(mccBlockType, location.toChunkBlockLocalX(), location.toChunkBlockLocalY(), location.toChunkBlockLocalZ());
    }

    default void setBlock(@NotNull MCCBlockState mccBlockState, MCCLocation location) {
        checkIfLocationInChunk(location);
        setBlock(mccBlockState, location.toChunkBlockLocalX(), location.toChunkBlockLocalY(), location.toChunkBlockLocalZ());
    }

    default MCCBlockType getBlockTypeAt(int localX, int localY, int localZ){
        MCCChunkSection chunkSection = getChunkSectionByGlobalYCoordinate(localY);
        return chunkSection.getBlockState(localX, localY, localZ).getBlockType();
    }

    default void setBlock(@NotNull MCCBlockType mccBlockType, int localX, int localY, int localZ){
        MCCChunkSection chunkSection = getChunkSectionByGlobalYCoordinate(localY);
        chunkSection.setBlockState(localX, localY, localZ, mccBlockType.getDefaultState());
    }

    default void setBlock(@NotNull MCCBlockState mccBlockState, int localX, int localY, int localZ){
        MCCChunkSection chunkSection = getChunkSectionByGlobalYCoordinate(localY);
        chunkSection.setBlockState(localX, localY, localZ, mccBlockState);
    }

    default MCCBlockState getBlockDataAt(int localX, int localY, int localZ) {
        MCCChunkSection chunkSection = getChunkSectionByGlobalYCoordinate(localY);
        return chunkSection.getBlockState(localX, localY, localZ);
    }

    int getAmountChunkSections();

    List<MCCChunkSection> getChunkSections();

    MCCChunkSection getChunkSectionByIndex(@NonNegative int index);

    MCCChunkSection getChunkSectionByGlobalYCoordinate(int blockHeight);

    default void checkIfLocationInChunk(MCCLocation location) {
        if (!location.world().equals(getWorld()) || location.getChunkX() != getX() || location.getChunkZ() != getZ()) {
            throw new IllegalArgumentException("The provided location is not in this chunk");
        }
    }
}
