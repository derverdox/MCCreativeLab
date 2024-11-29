package de.verdox.mccreativelab.wrapper.world.chunk;

import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.annotations.MCCInstantiationSource;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;

public interface MCCChunkSection extends MCCWrapped {

    int getChunkSectionIndex();

    int getChunkX();

    int getChunkZ();

    default int getSectionWidth(){
        return 16;
    }

    default int getSectionLength(){
        return 16;
    }

    default int getSectionHeight(){
        return 16;
    }

    default boolean isRandomlyTicking() {
        return this.isRandomlyTickingBlocks() || this.isRandomlyTickingFluids();
    }

    boolean isEmpty();

    boolean isRandomlyTickingBlocks();

    boolean isRandomlyTickingFluids();

    // Returns the block type from before
    MCCBlockState setBlockState(int localX, int localY, int localZ, MCCBlockState state);

    MCCBlockState getBlockState(int localX, int localY, int localZ);

    void disableFluidTicking();

    //TODO: Set tickingBlockCount to Integer.MINVALUE -> must be > 0
    void disableBlockTicking();

    void enableBlockTicking();

    void enableFluidTicking();

    MCCChunk getParent();
}
