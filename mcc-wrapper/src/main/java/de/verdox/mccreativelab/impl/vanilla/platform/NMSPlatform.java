package de.verdox.mccreativelab.impl.vanilla.platform;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.ConversionService;
import de.verdox.mccreativelab.conversion.ConversionServiceImpl;
import de.verdox.mccreativelab.impl.vanilla.block.NMSBlockState;
import de.verdox.mccreativelab.impl.vanilla.block.NMSBlockType;
import de.verdox.mccreativelab.impl.vanilla.entity.*;
import de.verdox.mccreativelab.impl.vanilla.inventory.types.*;
import de.verdox.mccreativelab.impl.vanilla.item.NMSItemStack;
import de.verdox.mccreativelab.impl.vanilla.item.NMSItemType;
import de.verdox.mccreativelab.impl.vanilla.platform.converter.ResourceLocationConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.factory.NMSTypedKeyFactory;
import de.verdox.mccreativelab.impl.vanilla.registry.*;
import de.verdox.mccreativelab.impl.vanilla.world.NMSSound;
import de.verdox.mccreativelab.impl.vanilla.world.NMSWorld;
import de.verdox.mccreativelab.impl.vanilla.world.level.biome.NMSBiome;
import de.verdox.mccreativelab.wrapper.entity.*;
import de.verdox.mccreativelab.wrapper.exceptions.OperationNotPossibleOnNMS;
import de.verdox.mccreativelab.wrapper.inventory.types.*;
import de.verdox.mccreativelab.wrapper.platform.MCCResourcePack;
import de.verdox.mccreativelab.wrapper.registry.*;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.event.MCCEvent;
import de.verdox.mccreativelab.wrapper.inventory.factory.MCCContainerFactory;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.platform.MCCTaskManager;
import de.verdox.mccreativelab.wrapper.platform.factory.TypedKeyFactory;
import de.verdox.mccreativelab.wrapper.world.MCCSound;
import de.verdox.mccreativelab.wrapper.world.MCCWorld;
import de.verdox.mccreativelab.wrapper.world.level.biome.MCCBiome;
import net.kyori.adventure.key.Key;
import net.minecraft.server.MinecraftServer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class NMSPlatform implements MCCPlatform {
    private final NMSTypedKeyFactory typedKeyFactory = new NMSTypedKeyFactory();
    private final ConversionService conversionService = new ConversionServiceImpl();

    public NMSPlatform() {
        //GeneratedConverters.init(conversionService);
        conversionService.registerPlatformType(MCCBlockState.class, NMSBlockState.CONVERTER);
        conversionService.registerPlatformType(MCCBlockType.class, NMSBlockType.CONVERTER);
        conversionService.registerPlatformType(MCCEntity.class, NMSEntity.CONVERTER);
        conversionService.registerPlatformType(MCCAttribute.class, NMSAttribute.CONVERTER);
        conversionService.registerPlatformType(MCCEntityType.class, NMSEntityType.CONVERTER);
        conversionService.registerPlatformType(MCCItemStack.class, NMSItemStack.CONVERTER);
        conversionService.registerPlatformType(MCCItemType.class, NMSItemType.CONVERTER);
        conversionService.registerPlatformType(MCCWorld.class, NMSWorld.CONVERTER);
        conversionService.registerPlatformType(MCCBiome.class, NMSBiome.CONVERTER);
        conversionService.registerPlatformType(MCCSound.class, NMSSound.CONVERTER);
        conversionService.registerPlatformType(MCCEffectType.class, NMSEffectType.CONVERTER);
        conversionService.registerPlatformType(MCCEffect.class, NMSEffect.CONVERTER);

        conversionService.registerPlatformType(Key.class, new ResourceLocationConverter());
        conversionService.registerPlatformType(MCCTypedKey.class, NMSTypedKey.CONVERTER);
        conversionService.registerPlatformType(MCCReference.class, NMSReference.CONVERTER);
        conversionService.registerPlatformType(MCCTag.class, NMSTag.CONVERTER);
        conversionService.registerPlatformType(MCCReferenceSet.class, NMSReferenceSet.CONVERTER);
        conversionService.registerPlatformType(MCCEitherReference.class, NMSEitherReference.CONVERTER);
        conversionService.registerPlatformType(MCCRegistry.class, NMSRegistry.CONVERTER);

        registerContainerTypes();
    }

    @Override
    public void init() {

    }

    @Override
    public MCCContainerFactory getContainerFactory() {
        return null;
    }

    @Override
    public MCCTaskManager getTaskManager() {
        return null;
    }

    @Override
    public TypedKeyFactory getTypedKeyFactory() {
        return typedKeyFactory;
    }

    @Override
    public ConversionService getConversionService() {
        return conversionService;
    }

    @Override
    public void callEvent(MCCEvent mccEvent) {

    }

    @Override
    public List<MCCWorld> getWorlds() {
        List<MCCWorld> worlds = new LinkedList<>();
        MinecraftServer.getServer().getAllLevels().forEach(serverLevel -> {
            worlds.add(getConversionService().wrap(serverLevel, new TypeToken<>() {}));
        });
        return worlds;
    }

    @Override
    public @Nullable MCCPlayer getOnlinePlayer(UUID uuid) {
        return null;
    }

    @Override
    public @NotNull List<MCCPlayer> getOnlinePlayers() {
        return MinecraftServer.getServer().getPlayerList().getPlayers().stream().map(serverPlayer -> getConversionService().wrap(serverPlayer, new TypeToken<MCCPlayer>() {})).toList();
    }

    @Override
    public void setServerResourcePack(MCCResourcePack resourcePack) {
        throw new OperationNotPossibleOnNMS();
    }

    private void registerContainerTypes() {
        conversionService.registerPlatformType(MCCAnvilContainer.class, NMSAnvilContainer.CONVERTER);
        conversionService.registerPlatformType(MCCBeaconContainer.class, NMSBeaconContainer.CONVERTER);
        conversionService.registerPlatformType(MCCBrewingStandContainer.class, NMSBrewingStandContainer.CONVERTER);
        conversionService.registerPlatformType(MCCCartographyTableContainer.class, NMSCartographyTableContainer.CONVERTER);
        conversionService.registerPlatformType(MCCChestContainer.class, NMSChestContainer.CONVERTER);
        conversionService.registerPlatformType(MCCCrafterContainer.class, NMSCrafterContainer.CONVERTER);
        conversionService.registerPlatformType(MCCEnchantingTableContainer.class, NMSEnchantingTableContainer.CONVERTER);
        conversionService.registerPlatformType(MCCFurnaceContainer.class, NMSFurnaceContainer.CONVERTER);
        conversionService.registerPlatformType(MCCGrindstoneContainer.class, NMSGrindstoneContainer.CONVERTER);
        conversionService.registerPlatformType(MCCLecternContainer.class, NMSLecternContainer.CONVERTER);
        conversionService.registerPlatformType(MCCMerchantContainer.class, NMSMerchantContainer.CONVERTER);
        conversionService.registerPlatformType(MCCPlayerInventoryContainer.class, NMSPlayerInventoryContainer.CONVERTER);
    }
}
