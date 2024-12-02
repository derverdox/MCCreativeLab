package de.verdox.mccreativelab.world.block;

import de.verdox.mccreativelab.MCCreativeLabExtension;
import de.verdox.mccreativelab.util.storage.palette.NBTPalettedContainer;
import de.verdox.mccreativelab.util.storage.palette.IdMap;
import de.verdox.mccreativelab.util.PaletteUtil;
import net.kyori.adventure.key.Key;
import org.bukkit.*;
import org.bukkit.persistence.PersistentDataAdapterContext;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import javax.annotation.Nullable;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class FakeBlockStorage {

    public static boolean USE_NEW_IMPLEMENTATION = true;

    private static final NamespacedKey FAKE_BLOCK_PALETTE_KEY = new NamespacedKey("mccreativelab", "fake_block_storage");
    private static final NamespacedKey BLOCK_STATE_BLOCK_KEY = new NamespacedKey("mccreativelab", "fake_block_key");
    private static final NamespacedKey BLOCK_STATE_ID = new NamespacedKey("mccreativelab", "block_state_id");

    public static boolean setFakeBlock(Location location, @Nullable FakeBlock fakeBlock, boolean forceLoad) {
        return setFakeBlockState(location, fakeBlock != null ? fakeBlock.getDefaultBlockState() : null, forceLoad);
    }

    public static boolean setFakeBlock(Location location, @Nullable FakeBlock fakeBlock, boolean updateBlockData, boolean forceLoad) {
        return setFakeBlockState(location, fakeBlock != null ? fakeBlock.getDefaultBlockState() : null, updateBlockData, forceLoad);
    }

    public static FakeBlock getFakeBlock(Location location, boolean forceLoad) {
        FakeBlock.FakeBlockState fakeBlockState = getFakeBlockState(location, forceLoad);
        if (fakeBlockState == null)
            return null;
        return fakeBlockState.getFakeBlock();
    }

    public static boolean setFakeBlockState(Location location, @Nullable FakeBlock.FakeBlockState fakeBlockState, boolean forceLoad) {
        return setFakeBlockState(location, fakeBlockState, true, forceLoad);
    }

    public static boolean setFakeBlockState(Location location, @Nullable FakeBlock.FakeBlockState fakeBlockState, boolean updateBlockData, boolean forceLoad) {
        return FakeBlockContainer.setFakeBlockState(location, fakeBlockState, updateBlockData, forceLoad);
    }

    public static @Nullable FakeBlock.FakeBlockState getFakeBlockState(Location location, boolean forceLoad) {
        return FakeBlockContainer.getFakeBlockState(location, forceLoad);
    }

    private final Map<ChunkEntry, FakeBlockPalettedContainer> fakeBlockPalettes = new ConcurrentHashMap<>();

    public FakeBlockStorage() {
    }

    @Deprecated
    FakeBlockPalettedContainer getFakeBlockPalette(World world, long chunkKey) {
        ChunkEntry chunkEntry = new ChunkEntry(world.getName(), chunkKey);
        if (!fakeBlockPalettes.containsKey(chunkEntry))
            return createData(world, chunkKey);
        return fakeBlockPalettes.get(chunkEntry);
    }

    @Deprecated
    FakeBlockPalettedContainer createData(World world, long chunkKey) {
        ChunkEntry chunkEntry = new ChunkEntry(world.getName(), chunkKey);
        FakeBlockPalettedContainer fakeBlockPaletteContainer = new FakeBlockPalettedContainer(FakeBlockRegistry.FAKE_BLOCK_STATE_ID_MAP, 16, PaletteUtil.getMaxYPaletteFromWorldLimits(world), 16);
        fakeBlockPalettes.put(chunkEntry, fakeBlockPaletteContainer);
        return fakeBlockPaletteContainer;
    }

    @Deprecated
    public static class FakeBlockPalettedContainer extends NBTPalettedContainer<FakeBlock.FakeBlockState> {
        public FakeBlockPalettedContainer(IdMap<FakeBlock.FakeBlockState> idMap, int xSize, int ySize, int zSize) {
            super(idMap, xSize, ySize, zSize);
        }

        public PersistentDataContainer dataToNbt(PersistentDataAdapterContext adapterContext, FakeBlock.FakeBlockState data) {
            PersistentDataContainer blockStateData = adapterContext.newPersistentDataContainer();

            FakeBlock fakeBlock = data.getFakeBlock();
            int blockStateID = fakeBlock.getBlockStateID(data);
            if (blockStateID == -1)
                return null;
            Key blockKey = MCCreativeLabExtension.getFakeBlockRegistry().getKey(fakeBlock);

            blockStateData.set(BLOCK_STATE_BLOCK_KEY, PersistentDataType.STRING, blockKey.asString());
            blockStateData.set(BLOCK_STATE_ID, PersistentDataType.INTEGER, blockStateID);

            return blockStateData;
        }

        @Nullable
        public FakeBlock.FakeBlockState nbtToData(PersistentDataContainer persistentDataContainer) {
            String blockKeyAsString = persistentDataContainer.get(BLOCK_STATE_BLOCK_KEY, PersistentDataType.STRING);
            if (blockKeyAsString == null)
                return null;
            if (!persistentDataContainer.has(BLOCK_STATE_ID))
                return null;
            int blockStateSubId = persistentDataContainer.get(BLOCK_STATE_ID, PersistentDataType.INTEGER).intValue();

            NamespacedKey namespacedKey = NamespacedKey.fromString(blockKeyAsString);
            FakeBlock foundFakeBlock = MCCreativeLabExtension.getFakeBlockRegistry().get(namespacedKey);
            if (foundFakeBlock == null)
                return null;
            return foundFakeBlock.getBlockState(blockStateSubId);
        }
    }


    @Deprecated
    private record ChunkEntry(String worldName, long chunkKey) {
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ChunkEntry that = (ChunkEntry) o;
            return chunkKey == that.chunkKey && Objects.equals(worldName, that.worldName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(worldName, chunkKey);
        }
    }
}
