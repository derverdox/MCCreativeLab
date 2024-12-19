package de.verdox.mccreativelab.world.item;

import de.verdox.mccreativelab.MCCreativeLabExtension;
import de.verdox.mccreativelab.impl.paper.platform.converter.BukkitAdapter;
import de.verdox.mccreativelab.registry.Reference;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDropItemEvent;
import org.bukkit.event.inventory.*;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.inventory.ComplexRecipe;
import org.bukkit.inventory.ItemStack;

public class FakeItemListener implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void preventVanillaDurabilityChange(PlayerItemDamageEvent e){
        Reference<? extends FakeItem> fakeItemReference = MCCreativeLabExtension.getFakeItemRegistry().getFakeItem(e.getItem());
        if(fakeItemReference == null)
            return;
        e.setCancelled(fakeItemReference.unwrapValue().getFakeItemProperties().isPreventNormalDurabilityChange());
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void preventItemDrop(PlayerDropItemEvent e){
        ItemStack stack = e.getItemDrop().getItemStack();
        Reference<? extends FakeItem> fakeItemReference = MCCreativeLabExtension.getFakeItemRegistry().getFakeItem(stack);
        if(fakeItemReference == null)
            return;
        e.setCancelled(fakeItemReference.unwrapValue().getFakeItemProperties().isPreventDrop());
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void preventItemDrop(EntityDropItemEvent e){
        ItemStack stack = e.getItemDrop().getItemStack();
        Reference<? extends FakeItem> fakeItemReference = MCCreativeLabExtension.getFakeItemRegistry().getFakeItem(stack);
        if(fakeItemReference == null)
            return;
        e.setCancelled(fakeItemReference.unwrapValue().getFakeItemProperties().isPreventDrop());
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void preventItemClick(InventoryClickEvent e){
        if(e.getWhoClicked().getGameMode().equals(GameMode.CREATIVE))
            return;
        if(e.getCurrentItem() == null)
            return;
        Reference<? extends FakeItem> fakeItemReference = MCCreativeLabExtension.getFakeItemRegistry().getFakeItem(e.getCurrentItem());
        if(fakeItemReference == null)
            return;
        fakeItemReference.unwrapValue().onClick(e);
        e.setCancelled(fakeItemReference.unwrapValue().getFakeItemProperties().isPreventInventoryClick());
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void preventItemClick(InventoryMoveItemEvent e){
        Reference<? extends FakeItem> fakeItemReference = MCCreativeLabExtension.getFakeItemRegistry().getFakeItem(e.getItem());
        if(fakeItemReference == null)
            return;
        e.setCancelled(fakeItemReference.unwrapValue().getFakeItemProperties().isPreventInventoryClick());
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void preventItemClick(InventoryDragEvent e){
        if(e.getWhoClicked().getGameMode().equals(GameMode.CREATIVE))
            return;
        Reference<? extends FakeItem> fakeItemReference = MCCreativeLabExtension.getFakeItemRegistry().getFakeItem(e.getCursor());
        if(fakeItemReference == null)
            return;
        e.setCancelled(fakeItemReference.unwrapValue().getFakeItemProperties().isPreventInventoryClick());
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void fixItemRepairRecipesNotWorkingWithCustomModelData(PrepareItemCraftEvent e){
        if(!(e.getRecipe() instanceof ComplexRecipe complexRecipe) || !e.isRepair())
            return;

        MCCItemType repairedType = null;

        for (ItemStack matrix : e.getInventory().getMatrix()) {
            if(matrix == null)
                continue;
            if(repairedType == null)
                repairedType = BukkitAdapter.wrap(matrix.getType());
            else {
                if(!repairedType.isSame(BukkitAdapter.wrap(matrix)))
                    break;

            }
        }

    }
}
