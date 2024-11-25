package de.verdox.mccreativelab.impl.paper.platform;

import de.verdox.mccreativelab.impl.paper.block.settings.PaperBlockHardnessSettings;
import de.verdox.mccreativelab.impl.paper.block.settings.PaperBlockSoundSettings;
import de.verdox.mccreativelab.impl.paper.block.settings.PaperFurnaceSettings;
import de.verdox.mccreativelab.impl.paper.entity.PaperAttributeInstance;
import de.verdox.mccreativelab.impl.paper.platform.converter.BukkitCraftConverters;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSPlatform;
import de.verdox.mccreativelab.wrapper.block.MCCBlock;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.block.settings.MCCBlockHardnessSettings;
import de.verdox.mccreativelab.wrapper.block.settings.MCCBlockSoundSettings;
import de.verdox.mccreativelab.wrapper.block.settings.MCCFurnaceSettings;
import de.verdox.mccreativelab.wrapper.entity.MCCAttributeInstance;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.entity.MCCEntityType;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import de.verdox.mccreativelab.wrapper.world.MCCWorld;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class PaperPlatform extends NMSPlatform {
    protected final JavaPlugin javaPlugin;
    private final PaperBlockSoundSettings blockSoundSettings = new PaperBlockSoundSettings();
    private final PaperBlockHardnessSettings paperBlockHardnessSettings = new PaperBlockHardnessSettings();
    private final PaperFurnaceSettings paperFurnaceSettings = new PaperFurnaceSettings();

    public PaperPlatform(JavaPlugin javaPlugin) {
        this.javaPlugin = javaPlugin;
        getConversionService().registerPlatformType(MCCWorld.class, BukkitCraftConverters.WORLD);
        getConversionService().registerPlatformType(MCCEntity.class, BukkitCraftConverters.ENTITY);
        getConversionService().registerPlatformType(MCCEntityType.class, BukkitCraftConverters.ENTITY_TYPE);
        getConversionService().registerPlatformType(MCCLocation.class, BukkitCraftConverters.LOCATION);
        getConversionService().registerPlatformType(MCCBlock.class, BukkitCraftConverters.BLOCK);
        getConversionService().registerPlatformType(MCCBlockType.class, BukkitCraftConverters.BLOCK_TYPE);
        getConversionService().registerPlatformType(MCCItemType.class, BukkitCraftConverters.ITEM_TYPE);
        getConversionService().registerPlatformType(MCCAttributeInstance.class, PaperAttributeInstance.CONVERTER);
    }

    public void enableListeners() {
        Bukkit.getPluginManager().registerEvents(paperBlockHardnessSettings, javaPlugin);
        Bukkit.getPluginManager().registerEvents(paperFurnaceSettings, javaPlugin);
        Bukkit.getPluginManager().registerEvents(blockSoundSettings, javaPlugin);
    }

    @Override
    public @NotNull MCCFurnaceSettings getFurnaceSettings() {
        return paperFurnaceSettings;
    }

    @Override
    public @NotNull MCCBlockHardnessSettings getBlockHardnessSettings() {
        return paperBlockHardnessSettings;
    }


    @Override
    public @NotNull MCCBlockSoundSettings getBlockSoundSettings() {
        return blockSoundSettings;
    }
}
