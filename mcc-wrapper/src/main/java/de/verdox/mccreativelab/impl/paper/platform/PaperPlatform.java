package de.verdox.mccreativelab.impl.paper.platform;

import de.verdox.mccreativelab.conversion.converter.EnumConverter;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.paper.block.settings.PaperBlockHardnessSettings;
import de.verdox.mccreativelab.impl.paper.block.settings.PaperBlockSoundSettings;
import de.verdox.mccreativelab.impl.paper.block.settings.PaperFurnaceSettings;
import de.verdox.mccreativelab.impl.paper.entity.PaperAttributeInstance;
import de.verdox.mccreativelab.impl.paper.platform.converter.BukkitCraftConverters;
import de.verdox.mccreativelab.impl.paper.platform.converter.CraftBlockStateConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSPlatform;
import de.verdox.mccreativelab.wrapper.block.MCCBlock;
import de.verdox.mccreativelab.wrapper.block.MCCBlockFace;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.block.MCCCapturedBlockState;
import de.verdox.mccreativelab.wrapper.block.settings.MCCBlockHardnessSettings;
import de.verdox.mccreativelab.wrapper.block.settings.MCCBlockSoundSettings;
import de.verdox.mccreativelab.wrapper.block.settings.MCCFurnaceSettings;
import de.verdox.mccreativelab.wrapper.entity.*;
import io.papermc.paper.adventure.PaperAdventure;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.block.BlockFace;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class PaperPlatform extends NMSPlatform {
    protected final JavaPlugin javaPlugin;
    private final PaperBlockSoundSettings blockSoundSettings = new PaperBlockSoundSettings();
    private final PaperBlockHardnessSettings paperBlockHardnessSettings = new PaperBlockHardnessSettings();
    private final PaperFurnaceSettings paperFurnaceSettings = new PaperFurnaceSettings();

    public PaperPlatform(JavaPlugin javaPlugin) {
        this.javaPlugin = javaPlugin;
    }

    @Override
    public void init() {
        super.init();
        BukkitCraftConverters.init();
        conversionService.registerPlatformType(MCCAttributeInstance.class, PaperAttributeInstance.CONVERTER);
        conversionService.registerPlatformType(MCCCapturedBlockState.class, new CraftBlockStateConverter());
        conversionService.registerPlatformType(MCCEquipmentSlot.class, new EnumConverter<>(EquipmentSlot.class, MCCEquipmentSlot.class));
        conversionService.registerPlatformType(MCCBlockFace.class, new EnumConverter<>(BlockFace.class, MCCBlockFace.class));
        conversionService.registerPlatformType(Component.class, new MCCConverter<net.minecraft.network.chat.Component, Component>() {
            @Override
            public ConversionResult<Component> wrap(net.minecraft.network.chat.Component nativeType) {
                return done(PaperAdventure.asAdventure(nativeType));
            }

            @Override
            public ConversionResult<net.minecraft.network.chat.Component> unwrap(Component platformImplType) {
                return done(PaperAdventure.asVanilla(platformImplType));
            }

            @Override
            public Class<Component> apiImplementationClass() {
                return Component.class;
            }

            @Override
            public Class<net.minecraft.network.chat.Component> nativeMinecraftType() {
                return net.minecraft.network.chat.Component.class;
            }
        });
    }

    public void enableListeners() {
        paperFurnaceSettings.initVanillaBurnDurations();
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
