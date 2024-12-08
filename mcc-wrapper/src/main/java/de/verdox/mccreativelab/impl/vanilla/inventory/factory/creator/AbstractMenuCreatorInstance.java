package de.verdox.mccreativelab.impl.vanilla.inventory.factory.creator;

import de.verdox.mccreativelab.conversion.ConversionService;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.creator.MenuCreatorInstance;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import org.apache.commons.lang3.function.TriFunction;
import org.jetbrains.annotations.Nullable;

public abstract class AbstractMenuCreatorInstance<F extends MCCContainerMenu<?, ?>> implements MenuCreatorInstance<F> {
    public ConversionService converter() {
        return MCCPlatform.getInstance().getConversionService();
    }

    protected <F extends MCCContainerMenu<?, ?>> F openViaNMSMenuProvider(ServerPlayer serverPlayer, net.kyori.adventure.text.Component title, TriFunction<Integer, Inventory, Player, AbstractContainerMenu> vanillaCreateMenuFunction) {
        serverPlayer.openMenu(new MenuProvider() {
            @Override
            public Component getDisplayName() {
                return MCCPlatform.getInstance().getConversionService().unwrap(title);
            }

            @Override
            public @Nullable AbstractContainerMenu createMenu(int syncId, Inventory playerInventory, Player player) {
                return vanillaCreateMenuFunction.apply(syncId, playerInventory, player);
            }
        });
        try {
            return MCCPlatform.getInstance().getConversionService().wrap(serverPlayer.containerMenu);
        }
        catch (Throwable e){
            e.printStackTrace();
            return null;
        }
    }
}
