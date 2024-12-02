package de.verdox.mccreativelab.impl.paper.block.settings;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.block.settings.MCCFurnaceSettings;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.typed.MCCItemTags;
import de.verdox.mccreativelab.wrapper.typed.MCCItems;
import org.bukkit.block.BlastFurnace;
import org.bukkit.block.Furnace;
import org.bukkit.block.Smoker;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.FurnaceBurnEvent;

import java.util.HashMap;
import java.util.Map;

public class PaperFurnaceSettings implements MCCFurnaceSettings, Listener {
    private final Map<MCCItemType, Integer> furnace = new HashMap<>();
    private final Map<MCCItemType, Integer> smoker = new HashMap<>();
    private final Map<MCCItemType, Integer> blastFurnace = new HashMap<>();

    public void initVanillaBurnDurations() {
        addFurnaceFuel(MCCItems.LAVA_BUCKET.get(), 20000);
        addFurnaceFuel(MCCItems.COAL_BLOCK.get(), 16000);
        addFurnaceFuel(MCCItems.BLAZE_ROD.get(), 2400);
        addFurnaceFuel(MCCItems.COAL.get(), 1600);
        addFurnaceFuel(MCCItems.CHARCOAL.get(), 1600);
        addFurnaceFuel(MCCItemTags.LOGS, 300);
        addFurnaceFuel(MCCItemTags.BAMBOO_BLOCKS, 300);
        addFurnaceFuel(MCCItemTags.VILLAGER_PLANTABLE_SEEDS, 300);
        addFurnaceFuel(MCCItemTags.PLANKS, 300);
        addFurnaceFuel(MCCItems.BAMBOO_MOSAIC.get(), 300);
        addFurnaceFuel(MCCItemTags.WOODEN_STAIRS, 300);
        addFurnaceFuel(MCCItems.BAMBOO_MOSAIC_STAIRS.get(), 300);
        addFurnaceFuel(MCCItemTags.WOODEN_SLABS, 150);
        addFurnaceFuel(MCCItems.BAMBOO_MOSAIC_SLAB.get(), 150);
        addFurnaceFuel(MCCItemTags.WOODEN_TRAPDOORS, 300);
        addFurnaceFuel(MCCItemTags.WOODEN_PRESSURE_PLATES, 300);
        addFurnaceFuel(MCCItemTags.WOODEN_FENCES, 300);
        addFurnaceFuel(MCCItemTags.FENCE_GATES, 300);
        addFurnaceFuel(MCCItems.NOTE_BLOCK.get(), 300);
        addFurnaceFuel(MCCItems.BOOKSHELF.get(), 300);
        addFurnaceFuel(MCCItems.CHISELED_BOOKSHELF.get(), 300);
        addFurnaceFuel(MCCItems.LECTERN.get(), 300);
        addFurnaceFuel(MCCItems.JUKEBOX.get(), 300);
        addFurnaceFuel(MCCItems.CHEST.get(), 300);
        addFurnaceFuel(MCCItems.TRAPPED_CHEST.get(), 300);
        addFurnaceFuel(MCCItems.CRAFTING_TABLE.get(), 300);
        addFurnaceFuel(MCCItems.DAYLIGHT_DETECTOR.get(), 300);
        addFurnaceFuel(MCCItemTags.BANNERS, 300);
        addFurnaceFuel(MCCItems.BOW.get(), 300);
        addFurnaceFuel(MCCItems.FISHING_ROD.get(), 300);
        addFurnaceFuel(MCCItems.LADDER.get(), 300);
        addFurnaceFuel(MCCItemTags.SIGNS, 200);
        addFurnaceFuel(MCCItemTags.HANGING_SIGNS, 800);
        addFurnaceFuel(MCCItems.WOODEN_SHOVEL.get(), 200);
        addFurnaceFuel(MCCItems.WOODEN_SWORD.get(), 200);
        addFurnaceFuel(MCCItems.WOODEN_HOE.get(), 200);
        addFurnaceFuel(MCCItems.WOODEN_AXE.get(), 200);
        addFurnaceFuel(MCCItems.WOODEN_PICKAXE.get(), 200);
        addFurnaceFuel(MCCItemTags.WOODEN_DOORS, 200);
        addFurnaceFuel(MCCItemTags.BOATS, 1200);
        addFurnaceFuel(MCCItemTags.CHEST_BOATS, 1200);
        addFurnaceFuel(MCCItemTags.WOOL, 100);
        addFurnaceFuel(MCCItemTags.WOODEN_BUTTONS, 100);
        addFurnaceFuel(MCCItems.STICK.get(), 100);
        addFurnaceFuel(MCCItemTags.SAPLINGS, 100);
        addFurnaceFuel(MCCItems.BOWL.get(), 100);
        addFurnaceFuel(MCCItemTags.WOOL_CARPETS, 67);
        addFurnaceFuel(MCCItems.DRIED_KELP_BLOCK.get(), 4001);
        addFurnaceFuel(MCCItems.CROSSBOW.get(), 300);
        addFurnaceFuel(MCCItems.BAMBOO.get(), 50);
        addFurnaceFuel(MCCItems.DEAD_BUSH.get(), 100);
        addFurnaceFuel(MCCItems.SCAFFOLDING.get(), 50);
        addFurnaceFuel(MCCItems.LOOM.get(), 300);
        addFurnaceFuel(MCCItems.BARREL.get(), 300);
        addFurnaceFuel(MCCItems.CARTOGRAPHY_TABLE.get(), 300);
        addFurnaceFuel(MCCItems.FLETCHING_TABLE.get(), 300);
        addFurnaceFuel(MCCItems.SMITHING_TABLE.get(), 300);
        addFurnaceFuel(MCCItems.COMPOSTER.get(), 300);
        addFurnaceFuel(MCCItems.AZALEA.get(), 100);
        addFurnaceFuel(MCCItems.FLOWERING_AZALEA.get(), 100);
        addFurnaceFuel(MCCItems.MANGROVE_ROOTS.get(), 300);
    }

    @Override
    public void addFurnaceFuel(MCCItemType mccItemType, int durationInTicks) {
        furnace.put(mccItemType, durationInTicks);
    }

    @Override
    public void addSmokerFuel(MCCItemType mccItemType, int durationInTicks) {
        smoker.put(mccItemType, durationInTicks);
    }

    @Override
    public void addBlastingFurnaceFuel(MCCItemType mccItemType, int durationInTicks) {
        blastFurnace.put(mccItemType, durationInTicks);
    }

    @Override
    public int getFurnaceFuelBurnDuration(MCCItemType mccItemType) {
        return furnace.getOrDefault(mccItemType, -1);
    }

    @Override
    public int getBlastFurnaceFuelBurnDuration(MCCItemType mccItemType) {
        return blastFurnace.getOrDefault(mccItemType, -1);
    }

    @Override
    public int getSmokerFuelBurnDuration(MCCItemType mccItemType) {
        return smoker.getOrDefault(mccItemType, -1);
    }

    @EventHandler(priority = EventPriority.LOWEST, ignoreCancelled = true)
    public void changeFuelBurnTime(FurnaceBurnEvent e) {
        MCCItemStack mccItemStack = MCCPlatform.getInstance().getConversionService().wrap(e.getFuel(), new TypeToken<>() {});

        int burnTimeTicks = -1;
        if (e.getBlock().getState() instanceof BlastFurnace) {
            burnTimeTicks = getBlastFurnaceFuelBurnDuration(mccItemStack.getType());
        } else if (e.getBlock().getState() instanceof Smoker) {
            burnTimeTicks = getSmokerFuelBurnDuration(mccItemStack.getType());
        }
        if (e.getBlock().getState() instanceof Furnace) {
            burnTimeTicks = getFurnaceFuelBurnDuration(mccItemStack.getType());
        }

        if(burnTimeTicks == -1){
            e.setCancelled(true);
        }
        else {
            e.setBurnTime(burnTimeTicks);
        }
    }
}
