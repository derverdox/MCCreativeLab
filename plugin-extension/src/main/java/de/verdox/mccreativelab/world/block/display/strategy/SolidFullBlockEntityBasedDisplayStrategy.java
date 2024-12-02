package de.verdox.mccreativelab.world.block.display.strategy;

import de.verdox.mccreativelab.world.block.FakeBlock;
import de.verdox.mccreativelab.world.block.display.SolidFullBlockEntityDisplay;
import de.verdox.mccreativelab.generator.resourcepack.types.ItemTextureData;
import de.verdox.mccreativelab.wrapper.block.MCCBlockFace;
import org.bukkit.Location;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ItemDisplay;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.util.Vector;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * This Display Strategy spawns the block faces at the neighbour block to fix lighting issues
 */
public class SolidFullBlockEntityBasedDisplayStrategy extends FakeBlockVisualStrategy<SolidFullBlockEntityBasedDisplayStrategy.FakeBlockFaces> {
    public static final SolidFullBlockEntityBasedDisplayStrategy INSTANCE = new SolidFullBlockEntityBasedDisplayStrategy();
    private static final NamespacedKey ITEM_DISPLAY_BLOCK_FACE_KEY = new NamespacedKey("mccreativelab", "linked_fake_block_face");

    @Override
    public void spawnFakeBlockDisplay(Block block, FakeBlock.FakeBlockState fakeBlockState) {
        if(!(fakeBlockState.getFakeBlockDisplay() instanceof SolidFullBlockEntityDisplay solidFullBlockEntityDisplay))
            return;
        FakeBlockFaces fakeBlockFaces = getOrCreateFakeBlockDisplayData(block);
        for (Map.Entry<MCCBlockFace, ItemTextureData> blockFaceItemTextureDataEntry : solidFullBlockEntityDisplay.getItemTextureDataPerBlockFace().entrySet()) {
            ItemTextureData itemTextureData = blockFaceItemTextureDataEntry.getValue();
            MCCBlockFace blockFace = blockFaceItemTextureDataEntry.getKey();
            ItemDisplay fakeBlockFace = createFakeBlockFace(blockFace, itemTextureData, block, fakeBlockState);
            fakeBlockFaces.saveBlockFaceDisplay(blockFace, fakeBlockFace);
        }
    }

    @Override
    public void blockUpdate(Block block, FakeBlock.FakeBlockState fakeBlockState, MCCBlockFace direction, BlockData neighbourBlockData) {
        if(!(fakeBlockState.getFakeBlockDisplay() instanceof SolidFullBlockEntityDisplay solidFullBlockEntityDisplay))
            return;
        if (!neighbourBlockData.isOccluding())
            spawnFakeBlockFace(block, direction, fakeBlockState, solidFullBlockEntityDisplay);
        else
            removeFakeBlockFace(block, direction);
    }

    @Override
    public void loadItemDisplayAsBlockDisplay(PotentialItemDisplay potentialItemDisplay) {
        if(!(potentialItemDisplay.storedFakeBlockState().getFakeBlockDisplay() instanceof SolidFullBlockEntityDisplay solidFullBlockEntityDisplay))
            return;
        Block block = potentialItemDisplay.block();
        ItemDisplay itemDisplay = potentialItemDisplay.itemDisplay();
        FakeBlock.FakeBlockState fakeBlockState = potentialItemDisplay.storedFakeBlockState();
        MCCBlockFace blockFace = MCCBlockFace.valueOf(itemDisplay.getPersistentDataContainer()
                                                           .getOrDefault(ITEM_DISPLAY_BLOCK_FACE_KEY, PersistentDataType.STRING, "SELF"));
        if (blockFace.equals(MCCBlockFace.SELF)) {
            safelyRemoveItemDisplay(itemDisplay);
            return;
        }

        ItemTextureData blockFaceItemTextureData = solidFullBlockEntityDisplay
                                                                 .getItemTextureDataPerBlockFace()
                                                                 .getOrDefault(blockFace, null);

        // Current block does not have a texture for this block face. Thus, we do not need this block face display
        if (blockFaceItemTextureData == null) {
            safelyRemoveItemDisplay(itemDisplay);
            return;
        }

        setupItemDisplayNBT(itemDisplay, blockFace, blockFaceItemTextureData, block, fakeBlockState);
        getOrCreateFakeBlockDisplayData(block).saveBlockFaceDisplay(blockFace, itemDisplay);
    }

    @Override
    protected FakeBlockFaces newData() {
        return new FakeBlockFaces();
    }

    private ItemDisplay createFakeBlockFace(MCCBlockFace blockFace, ItemTextureData itemTextureData, Block block, FakeBlock.FakeBlockState fakeBlockState) {
        Location blockCenter = block.getLocation().clone().add(0.5, 0.5, 0.5);
        var dir = blockFace.getDirection().mul(0.5d);
        Location spawnLocation = blockCenter.clone().add(new Vector(dir.x, dir.y, dir.z));

        ItemDisplay itemDisplay = (ItemDisplay) block.getWorld().spawnEntity(spawnLocation, EntityType.ITEM_DISPLAY, CreatureSpawnEvent.SpawnReason.CUSTOM);
        setupItemDisplayNBT(itemDisplay, blockFace, itemTextureData, block, fakeBlockState);

        return itemDisplay;
    }

    private void spawnFakeBlockFace(Block block, MCCBlockFace blockFace, FakeBlock.FakeBlockState fakeBlockState, SolidFullBlockEntityDisplay solidFullBlockEntityDisplay) {
        ItemTextureData itemTextureData = solidFullBlockEntityDisplay.getItemTextureDataPerBlockFace()
                                                        .getOrDefault(blockFace, null);
        if (itemTextureData == null)
            return;

        FakeBlockFaces fakeBlockFaces = getOrCreateFakeBlockDisplayData(block);
        if (fakeBlockFaces.getBlockFaceDisplay(blockFace) != null)
            return;
        ItemDisplay fakeBlockFace = createFakeBlockFace(blockFace, itemTextureData, block, fakeBlockState);
        fakeBlockFaces.saveBlockFaceDisplay(blockFace, fakeBlockFace);
    }

    private void removeFakeBlockFace(Block block, MCCBlockFace blockFace) {
        FakeBlockFaces fakeBlockFaces = getFakeBlockDisplayData(block, false);
        if (fakeBlockFaces == null)
            return;
        fakeBlockFaces.removeBlockFaceAndDeSpawn(blockFace);
    }

    private void setupItemDisplayNBT(ItemDisplay itemDisplay, MCCBlockFace blockFace, ItemTextureData itemTextureData, Block block, FakeBlock.FakeBlockState fakeBlockState) {
        setupItemDisplayNBT(itemDisplay, itemTextureData, block, fakeBlockState);
        itemDisplay.getPersistentDataContainer()
                   .set(ITEM_DISPLAY_BLOCK_FACE_KEY, PersistentDataType.STRING, blockFace.name());
    }

    protected static class FakeBlockFaces extends FakeBlockDisplayData{
        private final Map<MCCBlockFace, ItemDisplay> blockFaces = new HashMap<>();

        FakeBlockFaces() {
        }

        @Override
        protected void moveTo(int x, int y, int z) {
            blockFaces.forEach((blockFace, itemDisplay) -> itemDisplay.teleportAsync(itemDisplay.getLocation().clone().add(x, y, z)));
        }

        @Override
        public void destroy() {
            blockFaces.forEach((blockFace, itemDisplay) -> itemDisplay.remove());
            blockFaces.clear();
        }

        @Nullable
        public ItemDisplay getBlockFaceDisplay(MCCBlockFace blockFace) {
            Objects.requireNonNull(blockFace);
            return blockFaces.getOrDefault(blockFace, null);
        }

        void saveBlockFaceDisplay(MCCBlockFace blockFace, ItemDisplay itemDisplay) {
            Objects.requireNonNull(blockFace);
            Objects.requireNonNull(itemDisplay);
            if (blockFaces.containsKey(blockFace))
                removeBlockFaceAndDeSpawn(blockFace);
            blockFaces.put(blockFace, itemDisplay);
        }

        private void removeBlockFaceAndDeSpawn(MCCBlockFace blockFace) {
            ItemDisplay itemDisplay = blockFaces.remove(blockFace);
            if (itemDisplay == null)
                return;
            safelyRemoveItemDisplay(itemDisplay);
        }
    }
}
