package de.verdox.mccreativelab.impl.vanilla.world.chunk;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.annotations.MCCReflective;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.world.chunk.MCCChunk;
import de.verdox.mccreativelab.wrapper.world.chunk.MCCChunkSection;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.LevelChunkSection;

public class NMSChunkSection extends MCCHandle<LevelChunkSection> implements MCCChunkSection {
    private final ChunkAccess levelChunk;
    private final int sectionIndex;
    private final int chunkX;
    private final int chunkZ;

    public NMSChunkSection(ChunkAccess levelChunk, LevelChunkSection handle, int sectionIndex, int chunkX, int chunkZ) {
        super(handle);
        this.levelChunk = levelChunk;
        this.sectionIndex = sectionIndex;
        this.chunkX = chunkX;
        this.chunkZ = chunkZ;
    }

    @Override
    public int getChunkSectionIndex() {
        return sectionIndex;
    }

    @Override
    public int getChunkX() {
        return chunkX;
    }

    @Override
    public int getChunkZ() {
        return chunkZ;
    }

    @Override
    public boolean isEmpty() {
        return getHandle().hasOnlyAir();
    }

    @Override
    public boolean isRandomlyTickingBlocks() {
        return getHandle().isRandomlyTickingBlocks();
    }

    @Override
    public boolean isRandomlyTickingFluids() {
        return getHandle().isRandomlyTickingFluids();
    }

    @Override
    public MCCBlockState setBlockState(int localX, int localY, int localZ, MCCBlockState state) {
        if(!state.isVanilla()){
            throw new IllegalArgumentException("You can only provide vanilla block types here");
        }
        var service = MCCPlatform.getInstance().getConversionService();
        return service.wrap(getHandle().setBlockState(localX, localY, localZ, service.unwrap(state, new TypeToken<>() {})), new TypeToken<>() {});
    }

    @Override
    public MCCBlockState getBlockState(int localX, int localY, int localZ) {
        return MCCPlatform.getInstance().getConversionService().wrap(getHandle().getBlockState(localX, localY, localZ), new TypeToken<>() {});
    }

    @Override
    @MCCReflective
    public void disableFluidTicking() {
        //TODO: Reflective access to tickingBlockCount
        // Subtract with a very low constant
        // If reset -> add the very low constant (Max tickable blocks are 4096. Constant might be 4097)
    }

    @Override
    @MCCReflective
    public void disableBlockTicking() {
        //TODO: Reflective access to tickingBlockCount
        // Subtract with a very low constant
        // If reset -> add the very low constant (Max tickable blocks are 4096. Constant might be 4097)
    }

    @Override
    public void enableBlockTicking() {

    }

    @Override
    public void enableFluidTicking() {

    }

    @Override
    public MCCChunk getParent() {
        return MCCPlatform.getInstance().getConversionService().wrap(levelChunk, new TypeToken<>() {});
    }
}
