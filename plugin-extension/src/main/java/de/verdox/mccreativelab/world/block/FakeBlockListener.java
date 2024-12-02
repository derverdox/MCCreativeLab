package de.verdox.mccreativelab.world.block;

import com.destroystokyo.paper.event.block.BlockDestroyEvent;
import de.verdox.mccreativelab.world.block.entity.FakeBlockEntity;
import de.verdox.mccreativelab.world.block.entity.FakeBlockEntityStorage;
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
}
