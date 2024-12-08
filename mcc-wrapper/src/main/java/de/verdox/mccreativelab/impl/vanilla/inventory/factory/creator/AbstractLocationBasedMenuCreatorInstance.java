package de.verdox.mccreativelab.impl.vanilla.inventory.factory.creator;

import com.mojang.datafixers.util.Function4;
import de.verdox.mccreativelab.conversion.ConversionService;
import de.verdox.mccreativelab.wrapper.annotations.MCCRequireVanillaElement;
import de.verdox.mccreativelab.wrapper.entity.types.MCCPlayer;
import de.verdox.mccreativelab.wrapper.inventory.types.MCCLocatedContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.creator.LocationBasedMenuCreatorInstance;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import net.kyori.adventure.text.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.SimpleContainerData;
import org.apache.commons.lang3.function.TriFunction;
import org.jetbrains.annotations.Nullable;

import java.util.function.Function;

public abstract class AbstractLocationBasedMenuCreatorInstance<F extends MCCLocatedContainerMenu<?, ?>> extends AbstractMenuCreatorInstance<F> implements LocationBasedMenuCreatorInstance<F> {
    private final MCCLocation mccLocation;
    protected ContainerLevelAccess containerLevelAccess;

    public AbstractLocationBasedMenuCreatorInstance(@MCCRequireVanillaElement @Nullable MCCLocation mccLocation) {
        if (mccLocation != null) {
            mccLocation.requireVanilla();
        }
        this.mccLocation = mccLocation;
        if (mccLocation == null) {
            this.containerLevelAccess = ContainerLevelAccess.NULL;
        } else {
            this.containerLevelAccess = ContainerLevelAccess.create(converter().unwrap(mccLocation.world()), new BlockPos(mccLocation.blockX(), mccLocation.blockY(), mccLocation.blockZ()));
        }
    }

    @Override
    public MCCLocation getLocation() {
        return mccLocation;
    }

    public static <F extends MCCLocatedContainerMenu<?, ?>> Function<MCCLocation, LocationBasedMenuCreatorInstance<F>> createWithoutDelegate(TriFunction<Integer, Inventory, ContainerLevelAccess, AbstractContainerMenu> nmsMenuCreator) {
        return mccLocation -> new AbstractLocationBasedMenuCreatorInstance<>(mccLocation) {
            @Override
            public F createMenuForPlayer(MCCPlayer player, Component title) {
                ConversionService conversionService = MCCPlatform.getInstance().getConversionService();
                ServerPlayer serverPlayer = conversionService.unwrap(player);
                return openViaNMSMenuProvider(serverPlayer, title, (syncId, inventory, player1) -> nmsMenuCreator.apply(syncId, inventory, containerLevelAccess));
            }
        };
    }

    public static <F extends MCCLocatedContainerMenu<?, ?>> Function<MCCLocation, LocationBasedMenuCreatorInstance<F>> createWithDelegate(int containerDataSize, Function4<Integer, Inventory, ContainerLevelAccess, ContainerData, AbstractContainerMenu> nmsMenuCreator) {
        return mccLocation -> new AbstractLocationBasedMenuCreatorInstance<>(mccLocation) {
            private final ContainerData containerData = new SimpleContainerData(containerDataSize);

            @Override
            public F createMenuForPlayer(MCCPlayer player, Component title) {
                ConversionService conversionService = MCCPlatform.getInstance().getConversionService();
                ServerPlayer serverPlayer = conversionService.unwrap(player);
                return openViaNMSMenuProvider(serverPlayer, title, (syncId, inventory, player1) -> nmsMenuCreator.apply(syncId, inventory, containerLevelAccess, containerData));
            }
        };
    }

}
