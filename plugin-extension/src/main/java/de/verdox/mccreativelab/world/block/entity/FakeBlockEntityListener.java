package de.verdox.mccreativelab.world.block.entity;

import com.destroystokyo.paper.event.entity.EntityAddToWorldEvent;
import com.destroystokyo.paper.event.entity.EntityRemoveFromWorldEvent;
import de.verdox.mccreativelab.events.ChunkDataEvent;
import de.verdox.mccreativelab.world.block.display.strategy.FakeBlockVisualStrategy;
import org.bukkit.entity.ItemDisplay;
import org.bukkit.entity.Marker;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.HopperInventorySearchEvent;
import org.bukkit.event.world.ChunkLoadEvent;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FakeBlockEntityListener implements Listener {
    private static FakeBlockEntityListener INSTANCE;

    public FakeBlockEntityListener() {
        if (INSTANCE != null)
            throw new IllegalArgumentException("FakeBlockCacheHandler singleton instantiated more than once");
        INSTANCE = this;
    }

    private final Map<ChunkDataEvent.ChunkPos, Set<FakeBlockVisualStrategy.PotentialItemDisplay>> potentialLoadedBlockVisuals = new ConcurrentHashMap<>();
    private final Map<ChunkDataEvent.ChunkPos, Set<Marker>> potentialLoadedBlockEntities = new ConcurrentHashMap<>();

    @EventHandler
    public void linkDisplayEntitiesToFakeBlocks(EntityAddToWorldEvent e) {
        if ((e.getEntity() instanceof ItemDisplay itemDisplay)) {
            FakeBlockVisualStrategy.PotentialItemDisplay potentialItemDisplay = FakeBlockVisualStrategy.loadPotentialDisplay(itemDisplay);
            if (potentialItemDisplay == null)
                return;
            potentialLoadedBlockVisuals.computeIfAbsent(new ChunkDataEvent.ChunkPos(e.getEntity().getChunk().getX(), e.getEntity().getChunk().getZ()), chunkPos -> new HashSet<>()).add(potentialItemDisplay);
            return;
        }
        if (e.getEntity() instanceof Marker marker) {
            potentialLoadedBlockEntities.computeIfAbsent(new ChunkDataEvent.ChunkPos(e.getEntity().getChunk().getX(), e.getEntity().getChunk().getZ()), chunkPos -> new HashSet<>()).add(marker);
        }
    }

    @EventHandler
    public void entityRemoveFromWorld(EntityRemoveFromWorldEvent e) {
        if (e.getEntity() instanceof Marker marker) {
            FakeBlockEntity fakeBlockEntity = FakeBlockEntityStorage.getAsFakeBlockEntity(marker);
            if (fakeBlockEntity != null) {
                fakeBlockEntity.onUnload();
            }
        }
    }

    @EventHandler
    public void loadAndLinkDisplayEntitiesWhenChunkWasLoaded(ChunkLoadEvent e) {
        if (e.isNewChunk())
            return;
        ChunkDataEvent.ChunkPos chunkPos = new ChunkDataEvent.ChunkPos(e.getChunk().getX(), e.getChunk().getZ());

        if (potentialLoadedBlockVisuals.containsKey(chunkPos)) {
            for (FakeBlockVisualStrategy.PotentialItemDisplay potentialItemDisplay : potentialLoadedBlockVisuals.get(chunkPos)) {
                potentialItemDisplay.load();
            }
            potentialLoadedBlockVisuals.remove(chunkPos);
        }

        if (potentialLoadedBlockEntities.containsKey(chunkPos)) {
            for (Marker marker : potentialLoadedBlockEntities.get(chunkPos)) {
                FakeBlockEntityStorage.getFakeBlockEntityAt(marker.getLocation().getBlock());
            }
            potentialLoadedBlockEntities.remove(chunkPos);

        }
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.HIGHEST)
    public void exposeFakeBlockEntityContainersToHoppers(HopperInventorySearchEvent e) {
        FakeBlockEntity fakeBlockEntity = FakeBlockEntityStorage.getFakeBlockEntityAt(e.getSearchBlock());
        if (fakeBlockEntity == null || fakeBlockEntity.getContainerOfEntity() == null)
            return;
        e.setInventory(fakeBlockEntity.getContainerOfEntity());
    }
}
