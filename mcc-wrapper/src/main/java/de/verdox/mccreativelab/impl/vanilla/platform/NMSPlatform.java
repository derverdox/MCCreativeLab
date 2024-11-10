package de.verdox.mccreativelab.impl.vanilla.platform;

import de.verdox.mccreativelab.conversion.ConversionService;
import de.verdox.mccreativelab.conversion.ConversionServiceImpl;
import de.verdox.mccreativelab.impl.vanilla.block.NMSBlockState;
import de.verdox.mccreativelab.impl.vanilla.block.NMSBlockType;
import de.verdox.mccreativelab.impl.vanilla.entity.NMSEntity;
import de.verdox.mccreativelab.impl.vanilla.entity.NMSEntityType;
import de.verdox.mccreativelab.impl.vanilla.item.NMSItemStack;
import de.verdox.mccreativelab.impl.vanilla.item.NMSItemType;
import de.verdox.mccreativelab.impl.vanilla.platform.converter.EitherHolderConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.converter.HolderConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.converter.HolderSetConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.converter.ResourceKeyConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.factory.NMSTypedKeyFactory;
import de.verdox.mccreativelab.impl.vanilla.world.NMSWorld;
import de.verdox.mccreativelab.wrapper.MCCTypedKey;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.entity.MCCEntityType;
import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.event.MCCEvent;
import de.verdox.mccreativelab.wrapper.inventory.factory.MCCContainerFactory;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.platform.MCCTaskManager;
import de.verdox.mccreativelab.wrapper.platform.factory.TypedKeyFactory;
import de.verdox.mccreativelab.wrapper.world.MCCWorld;
import org.jetbrains.annotations.Nullable;

import java.util.Set;
import java.util.UUID;

public class NMSPlatform implements MCCPlatform {
    private final NMSTypedKeyFactory typedKeyFactory = new NMSTypedKeyFactory();
    private final ConversionService conversionService = new ConversionServiceImpl();

    public NMSPlatform() {
        getConversionService().registerPlatformType(MCCBlockState.class, NMSBlockState.CONVERTER);
        getConversionService().registerPlatformType(MCCBlockType.class, NMSBlockType.CONVERTER);
        getConversionService().registerPlatformType(MCCEntity.class, NMSEntity.CONVERTER);
        getConversionService().registerPlatformType(MCCEntityType.class, NMSEntityType.CONVERTER);
        getConversionService().registerPlatformType(MCCItemStack.class, NMSItemStack.CONVERTER);
        getConversionService().registerPlatformType(MCCItemType.class, NMSItemType.CONVERTER);
        getConversionService().registerPlatformType(MCCWorld.class, NMSWorld.CONVERTER);

        getConversionService().registerPlatformType(MCCTypedKey.class, new ResourceKeyConverter());
        getConversionService().registerPlatformType(MCCTypedKey.class, new HolderConverter());
        getConversionService().registerPlatformType(MCCTypedKey.class, new EitherHolderConverter());
        getConversionService().registerPlatformType(Set.class, new HolderSetConverter());
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
    public @Nullable MCCPlayer getOnlinePlayer(UUID uuid) {
        return null;
    }
}
