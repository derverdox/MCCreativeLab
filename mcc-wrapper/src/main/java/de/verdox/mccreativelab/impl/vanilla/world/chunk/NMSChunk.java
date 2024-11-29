package de.verdox.mccreativelab.impl.vanilla.world.chunk;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.exceptions.OperationNotPossibleOnNMS;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.world.MCCWorld;
import de.verdox.mccreativelab.wrapper.world.chunk.MCCChunk;
import de.verdox.mccreativelab.wrapper.world.chunk.MCCChunkSection;
import net.minecraft.world.level.chunk.ChunkAccess;
import net.minecraft.world.level.chunk.LevelChunkSection;
import org.checkerframework.checker.index.qual.NonNegative;

import java.util.LinkedList;
import java.util.List;

public class NMSChunk extends MCCHandle<ChunkAccess> implements MCCChunk {
    public NMSChunk(ChunkAccess handle) {
        super(handle);
    }

    @Override
    public boolean isLoaded() {
        return false;
    }

    @Override
    public MCCWorld getWorld() {
        return null;
    }

    @Override
    public int getX() {
        return handle.locX;
    }

    @Override
    public int getZ() {
        return handle.locZ;
    }

    @Override
    public int getHeight() {
        return handle.getHeight();
    }

    @Override
    public int getHighestFilledSectionIndex() {
        return handle.getHighestFilledSectionIndex();
    }

    @Override
    public List<MCCEntity> getEntitiesInChunk() {
        throw new OperationNotPossibleOnNMS();
    }

    @Override
    public MCCBlockState getBlockDataAt(int localX, int localY, int localZ) {
        return MCCPlatform.getInstance().getConversionService().wrap(handle.getBlockState(localX, localY, localZ), new TypeToken<>() {});
    }

    @Override
    public MCCBlockType getBlockTypeAt(int localX, int localY, int localZ) {
        return MCCPlatform.getInstance().getConversionService().wrap(handle.getBlockState(localX, localY, localZ).getBlock(), new TypeToken<>() {});
    }

    @Override
    public int getAmountChunkSections() {
        return handle.getSections().length;
    }

    @Override
    public List<MCCChunkSection> getChunkSections() {
        List<MCCChunkSection> list = new LinkedList<>();
        for (int i = 0; i < getAmountChunkSections(); i++) {
            list.add(getChunkSectionByIndex(i));
        }
        return list;
    }

    @Override
    public MCCChunkSection getChunkSectionByIndex(int index) {
        LevelChunkSection levelChunkSection = handle.getSection(index);
        return new NMSChunkSection(handle, levelChunkSection, index, getX(), getZ());
    }

    @Override
    public MCCChunkSection getChunkSectionByGlobalYCoordinate(@NonNegative int index) {
        return null;
    }
}
