package de.verdox.mccreativelab.impl.vanilla.platform;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.ConversionService;
import de.verdox.mccreativelab.conversion.ConversionServiceImpl;
import de.verdox.mccreativelab.conversion.converter.EnumConverter;
import de.verdox.mccreativelab.impl.vanilla.block.NMSBlockSoundGroup;
import de.verdox.mccreativelab.impl.vanilla.block.NMSBlockState;
import de.verdox.mccreativelab.impl.vanilla.block.NMSBlockType;
import de.verdox.mccreativelab.impl.vanilla.entity.*;
import de.verdox.mccreativelab.impl.vanilla.inventory.types.container.NMSPlayerInventory;
import de.verdox.mccreativelab.impl.vanilla.inventory.types.menu.*;
import de.verdox.mccreativelab.impl.vanilla.item.NMSItemStack;
import de.verdox.mccreativelab.impl.vanilla.item.NMSItemType;
import de.verdox.mccreativelab.impl.vanilla.platform.converter.AttributeModifierConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.converter.GeneratedConverters;
import de.verdox.mccreativelab.impl.vanilla.platform.converter.ResourceLocationConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.converter.SoundConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.factory.NMSTypedKeyFactory;
import de.verdox.mccreativelab.impl.vanilla.registry.*;
import de.verdox.mccreativelab.impl.vanilla.world.NMSWorld;
import de.verdox.mccreativelab.impl.vanilla.world.chunk.NMSChunk;
import de.verdox.mccreativelab.impl.vanilla.world.level.biome.NMSBiome;
import de.verdox.mccreativelab.wrapper.block.MCCBlockSoundGroup;
import de.verdox.mccreativelab.wrapper.block.settings.MCCBlockHardnessSettings;
import de.verdox.mccreativelab.wrapper.block.settings.MCCBlockSoundSettings;
import de.verdox.mccreativelab.wrapper.block.settings.MCCFurnaceSettings;
import de.verdox.mccreativelab.wrapper.entity.*;
import de.verdox.mccreativelab.wrapper.entity.player.MCCGameMode;
import de.verdox.mccreativelab.wrapper.exceptions.OperationNotPossibleOnNMS;
import de.verdox.mccreativelab.wrapper.inventory.types.container.MCCPlayerInventory;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.*;
import de.verdox.mccreativelab.wrapper.item.MCCAttributeModifier;
import de.verdox.mccreativelab.wrapper.platform.MCCResourcePack;
import de.verdox.mccreativelab.wrapper.platform.properties.MCCPropertyKey;
import de.verdox.mccreativelab.wrapper.platform.properties.MCCServerProperties;
import de.verdox.mccreativelab.wrapper.registry.*;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.inventory.factory.MCCContainerFactory;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.platform.MCCTaskManager;
import de.verdox.mccreativelab.wrapper.platform.factory.TypedKeyFactory;
import de.verdox.mccreativelab.wrapper.world.MCCDifficulty;
import de.verdox.mccreativelab.wrapper.world.MCCWorld;
import de.verdox.mccreativelab.wrapper.world.chunk.MCCChunk;
import de.verdox.mccreativelab.wrapper.world.level.biome.MCCBiome;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.sound.Sound;
import net.minecraft.network.chat.Component;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.dedicated.DedicatedServer;
import net.minecraft.world.Difficulty;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.level.GameType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class NMSPlatform implements MCCPlatform {
    protected final NMSTypedKeyFactory typedKeyFactory;
    protected final ConversionService conversionService;

    public NMSPlatform() {
        this.typedKeyFactory = new NMSTypedKeyFactory();
        this.conversionService = new ConversionServiceImpl();
    }

    @Override
    public void init() {
        conversionService.registerPlatformType(MCCBlockState.class, NMSBlockState.CONVERTER);
        conversionService.registerPlatformType(MCCBlockSoundGroup.class, NMSBlockSoundGroup.CONVERTER);
        conversionService.registerPlatformType(MCCBlockType.class, NMSBlockType.CONVERTER);
        conversionService.registerPlatformType(MCCEntity.class, NMSEntity.CONVERTER);
        conversionService.registerPlatformType(MCCAttribute.class, NMSAttribute.CONVERTER);
        conversionService.registerPlatformType(MCCEntityType.class, NMSEntityType.CONVERTER);
        conversionService.registerPlatformType(MCCItemStack.class, NMSItemStack.CONVERTER);
        conversionService.registerPlatformType(MCCItemType.class, NMSItemType.CONVERTER);
        conversionService.registerPlatformType(MCCWorld.class, NMSWorld.CONVERTER);
        conversionService.registerPlatformType(MCCBiome.class, NMSBiome.CONVERTER);
        conversionService.registerPlatformType(MCCEffectType.class, NMSEffectType.CONVERTER);
        conversionService.registerPlatformType(MCCEffect.class, NMSEffect.CONVERTER);
        conversionService.registerPlatformType(MCCPlayer.class, NMSPlayer.CONVERTER);
        conversionService.registerPlatformType(MCCAttributeMap.class, NMSAttributeMap.CONVERTER);
        conversionService.registerPlatformType(MCCChunk.class, NMSChunk.CONVERTER);

        conversionService.registerPlatformType(Key.class, new ResourceLocationConverter());
        conversionService.registerPlatformType(Sound.class, new SoundConverter());
        conversionService.registerPlatformType(MCCAttributeModifier.class, new AttributeModifierConverter());
        conversionService.registerPlatformType(MCCTypedKey.class, NMSTypedKey.CONVERTER);
        conversionService.registerPlatformType(MCCReference.class, NMSReference.CONVERTER);
        conversionService.registerPlatformType(MCCTag.class, NMSTag.CONVERTER);
        conversionService.registerPlatformType(MCCReferenceSet.class, NMSReferenceSet.CONVERTER);
        conversionService.registerPlatformType(MCCEitherReference.class, NMSEitherReference.CONVERTER);
        conversionService.registerPlatformType(MCCRegistry.class, NMSRegistry.CONVERTER);

        registerMenuTypes();
        registerContainerTypes();
        registerEnumConverters();
        GeneratedConverters.init(conversionService);
    }

    @Override
    public @NotNull MCCBlockHardnessSettings getBlockHardnessSettings() {
        throw new OperationNotPossibleOnNMS();
    }

    @Override
    public @NotNull MCCBlockSoundSettings getBlockSoundSettings() {
        throw new OperationNotPossibleOnNMS();
    }

    @Override
    public @NotNull MCCFurnaceSettings getFurnaceSettings() {
        throw new OperationNotPossibleOnNMS();
    }

    @Override
    public int getPublicTick() {
        return MinecraftServer.currentTick;
    }

    @Override
    public MCCServerProperties getServerProperties() {
        DedicatedServer dedicatedServer = (DedicatedServer) MinecraftServer.getServer();
        return new MCCServerProperties(dedicatedServer.getProperties().properties, () -> dedicatedServer.settings.forceSave());
    }

    @Override
    public void shutdown() {
        MinecraftServer.getServer().halt(false);
    }

    @Override
    public @NotNull MCCContainerFactory getContainerFactory() {
        //TODO
        return null;
    }

    @Override
    public @NotNull MCCTaskManager getTaskManager() {
        //TODO
        return null;
    }

    @Override
    public @NotNull TypedKeyFactory getTypedKeyFactory() {
        return typedKeyFactory;
    }

    @Override
    public @NotNull ConversionService getConversionService() {
        return conversionService;
    }

    @Override
    public @NotNull List<MCCWorld> getWorlds() {
        List<MCCWorld> worlds = new LinkedList<>();
        MinecraftServer.getServer().getAllLevels().forEach(serverLevel -> {
            worlds.add(getConversionService().wrap(serverLevel, new TypeToken<>() {}));
        });
        return worlds;
    }

    @Override
    public @Nullable MCCPlayer getOnlinePlayer(@NotNull UUID uuid) {
        return null;
    }

    @Override
    public @NotNull List<MCCPlayer> getOnlinePlayers() {
        return MinecraftServer.getServer().getPlayerList().getPlayers().stream().map(serverPlayer -> getConversionService().wrap(serverPlayer, new TypeToken<MCCPlayer>() {})).toList();
    }

    @Override
    public void setServerResourcePack(@NotNull MCCResourcePack resourcePack) {
        String downloadUrl = getServerProperties().read(MCCPropertyKey.RESOURCE_PACK);
        UUID packID = UUID.fromString(getServerProperties().read(MCCPropertyKey.RESOURCE_PACK_ID));

        if (resourcePack.getUUID().equals(packID) && resourcePack.url().equals(downloadUrl)) {
            return;
        }
        Component component = conversionService.unwrap(resourcePack.prompt(), new TypeToken<>() {});

        getServerProperties().write(MCCPropertyKey.RESOURCE_PACK, resourcePack.url());
        getServerProperties().write(MCCPropertyKey.RESOURCE_PACK_ID, resourcePack.getUUID().toString());
        getServerProperties().write(MCCPropertyKey.RESOURCE_PACK_PROMPT, component.getString());
        getServerProperties().write(MCCPropertyKey.RESOURCE_PACK_SHA1, resourcePack.hash());
        getServerProperties().write(MCCPropertyKey.RESOURCE_PACK_REQUIRE, resourcePack.isRequired());
        getServerProperties().saveAction();
        shutdown();
    }

    private void registerMenuTypes() {
        conversionService.registerPlatformType(MCCAnvilContainerMenu.class, NMSAnvilContainerMenu.CONVERTER);
        conversionService.registerPlatformType(MCCBeaconContainerMenu.class, NMSBeaconContainerMenu.CONVERTER);
        conversionService.registerPlatformType(MCCBrewingStandContainerMenu.class, NMSBrewingStandContainerMenu.CONVERTER);
        conversionService.registerPlatformType(MCCCartographyTableContainerMenu.class, NMSCartographyTableContainerMenu.CONVERTER);
        conversionService.registerPlatformType(MCCChestContainerMenu.class, NMSChestContainerMenu.CONVERTER);
        conversionService.registerPlatformType(MCCCrafterContainerMenu.class, NMSCrafterContainerMenu.CONVERTER);
        conversionService.registerPlatformType(MCCDispenserContainerMenu.class, NMSDispenserContainerMenu.CONVERTER);
        conversionService.registerPlatformType(MCCEnchantingTableContainerMenu.class, NMSEnchantingTableContainerMenu.CONVERTER);
        conversionService.registerPlatformType(MCCFurnaceContainerMenu.class, NMSFurnaceContainerMenu.CONVERTER);
        conversionService.registerPlatformType(MCCGrindstoneContainerMenu.class, NMSGrindstoneContainerMenu.CONVERTER);
        conversionService.registerPlatformType(MCCLecternContainerMenu.class, NMSLecternContainerMenu.CONVERTER);
        conversionService.registerPlatformType(MCCMerchantContainerMenu.class, NMSMerchantContainerMenu.CONVERTER);
        conversionService.registerPlatformType(MCCWorkBenchContainerMenu.class, NMSWorkBenchContainerMenu.CONVERTER);
        conversionService.registerPlatformType(MCCHopperContainerMenu.class, NMSHopperContainerMenu.CONVERTER);
        conversionService.registerPlatformType(MCCShulkerContainerMenu.class, NMSShulkerContainerMenu.CONVERTER);
        conversionService.registerPlatformType(MCCStonecutterContainerMenu.class, NMSStoneCutterContainerMenu.CONVERTER);
        conversionService.registerPlatformType(MCCSmithingContainerMenu.class, NMSSmithingContainerMenu.CONVERTER);
    }

    private void registerContainerTypes(){
        conversionService.registerPlatformType(MCCPlayerInventory.class, NMSPlayerInventory.CONVERTER);
    }

    private void registerEnumConverters() {
        conversionService.registerPlatformType(MCCEquipmentSlot.class, new EnumConverter<>(EquipmentSlot.class, MCCEquipmentSlot.class));
        conversionService.registerPlatformType(MCCEquipmentSlotGroup.class, new EnumConverter<>(net.minecraft.world.entity.EquipmentSlotGroup.class, MCCEquipmentSlotGroup.class));
        conversionService.registerPlatformType(MCCGameMode.class, new EnumConverter<>(GameType.class, MCCGameMode.class));
        conversionService.registerPlatformType(MCCDifficulty.class, new EnumConverter<>(Difficulty.class, MCCDifficulty.class));
    }
}
