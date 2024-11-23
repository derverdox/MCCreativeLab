package de.verdox.mccreativelab.wrapper.world.chunk;

import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.block.MCCBlock;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import org.checkerframework.checker.index.qual.NonNegative;

import java.util.List;

public interface MCCChunk extends MCCWrapped {
    int getX();

    int getZ();

    int getHeight();

    int getHighestFilledSectionIndex();

    List<MCCEntity> getEntitiesInChunk();

    MCCBlockState getBlockDataAt(int localX, int localY, int localZ);

    MCCBlockType getBlockTypeAt(int localX, int localY, int localZ);

    MCCBlock getBlockAt(int localX, int localY, int localZ);

    int getAmountChunkSections();

    List<MCCChunkSection> getChunkSections();

    MCCChunkSection getChunkSectionByIndex(@NonNegative int index);
}
