package de.verdox.mccreativelab.world.block;

import com.destroystokyo.paper.event.block.BlockDestroyEvent;
import com.destroystokyo.paper.event.entity.EntityAddToWorldEvent;
import de.verdox.mccreativelab.world.block.entity.FakeBlockEntity;
import de.verdox.mccreativelab.world.block.entity.FakeBlockEntityStorage;
import io.papermc.paper.event.player.PlayerArmSwingEvent;
import org.bukkit.GameMode;
import org.bukkit.block.Block;
import org.bukkit.entity.Display;
import org.bukkit.entity.Interaction;
import org.bukkit.entity.Marker;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.*;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.inventory.HopperInventorySearchEvent;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.util.RayTraceResult;

public class FakeBlockListener implements Listener {
    @EventHandler(ignoreCancelled = true, priority = EventPriority.HIGHEST)
    public void preventNotePlayWhenIsFakeBlockEvent(NotePlayEvent e) {
        Block block = e.getBlock();
        if (FakeBlockStorage.getFakeBlock(block.getLocation(), false) != null)
            e.setCancelled(true);
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.HIGHEST)
    public void blockDestroy(BlockDestroyEvent e) {
        FakeBlock.FakeBlockState fakeBlockState = FakeBlockStorage.getFakeBlockState(e.getBlock().getLocation(), false);
        if (fakeBlockState == null)
            return;
        fakeBlockState.getFakeBlock().remove(e.getBlock().getLocation(), e.playEffect(), e.willDrop(), null, null, true);
        e.setWillDrop(false);
        e.setPlayEffect(false);
        e.setExpToDrop(0);
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void ultimatelyAllowSpawnOfUtilityEntities(EntitySpawnEvent e) {
        if (e.getEntity() instanceof Marker || e.getEntity() instanceof Display || e.getEntity() instanceof Interaction)
            e.setCancelled(false);
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.HIGHEST)
    public void preventBukkitFertilizationLogic(BlockFertilizeEvent e) {
        FakeBlock.FakeBlockState fakeBlockState = FakeBlockStorage.getFakeBlockState(e.getBlock().getLocation(), false);
        if (fakeBlockState == null)
            return;
        if (fakeBlockState.getBlockedEventsByDefault().contains(e.getClass()))
            e.setCancelled(true);
    }


    @EventHandler(ignoreCancelled = true, priority = EventPriority.HIGHEST)
    public void doNotDropVanillaLootForFakeBlocks(BlockBreakEvent e) {
        FakeBlock.FakeBlockState fakeBlockState = FakeBlockStorage.getFakeBlockState(e.getBlock()
            .getLocation(), false);
        if (fakeBlockState == null)
            return;
        fakeBlockState.getFakeBlock().dropBlockLoot(e.getBlock().getLocation(), fakeBlockState, e.getPlayer(), e.getPlayer().getInventory().getItemInMainHand(), false);
        fakeBlockState.getFakeBlock().dropBlockExperience(e.getBlock().getLocation(), fakeBlockState, e.getPlayer(), e.getPlayer().getInventory().getItemInMainHand(), false);
        e.setDropItems(false);
    }

    @EventHandler(ignoreCancelled = true, priority = EventPriority.HIGHEST)
    public void exposeFakeBlockEntityContainersToHoppers(HopperInventorySearchEvent e) {
        FakeBlockEntity fakeBlockEntity = FakeBlockEntityStorage.getFakeBlockEntityAt(e.getSearchBlock());
        if (fakeBlockEntity == null || fakeBlockEntity.getContainerOfEntity() == null)
            return;
        e.setInventory(fakeBlockEntity.getContainerOfEntity());
    }
}
