package de.verdox.mccreativelab.impl.vanilla.world.chunk;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.exceptions.OperationNotPossibleOnNMS;
import de.verdox.mccreativelab.wrapper.world.MCCWorld;
import de.verdox.mccreativelab.wrapper.world.chunk.MCCChunk;
import de.verdox.mccreativelab.wrapper.world.chunk.MCCChunkSection;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.chunk.LevelChunkSection;
import org.checkerframework.checker.index.qual.NonNegative;

import java.util.LinkedList;
import java.util.List;

public class NMSChunk extends MCCHandle<LevelChunk> implements MCCChunk {
    public static final MCCConverter<LevelChunk, NMSChunk> CONVERTER = converter(NMSChunk.class, LevelChunk.class, NMSChunk::new, MCCHandle::getHandle);

    public NMSChunk(LevelChunk handle) {
        super(handle);
    }

    @Override
    public boolean isLoaded() {
        return handle.loaded;
    }

    @Override
    public MCCWorld getWorld() {
        return conversionService.wrap(((ServerLevel) handle.getLevel()), new TypeToken<>() {});
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
        //TODO
        return null;
    }
}
