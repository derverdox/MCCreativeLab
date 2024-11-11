package de.verdox.mccreativelab.impl.vanilla.entity;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.item.NMSItemStack;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerCloseReason;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.kyori.adventure.text.Component;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.Nullable;

public class NMSPlayer extends NMSEntity<Player> implements MCCPlayer {
    public static final MCCConverter<Player, NMSPlayer> CONVERTER = converter(NMSPlayer.class, Player.class, NMSPlayer::new, NMSHandle::getHandle);


    public NMSPlayer(Player handle) {
        super(handle);
    }

    @Override
    public MCCContainer getInventory() {
        return MCCPlatform.getInstance().getConversionService().wrap(handle.getInventory(), new TypeToken<>() {});
    }

    @Override
    public @Nullable MCCItemStack getCursorItem() {
        return null;
    }

    @Override
    public void setCursorItem(MCCItemStack mccItemStack) {

    }

    @Override
    public boolean openContainer(MCCContainer mccContainer, Component title) {
        return false;
    }

    @Override
    public void closeCurrentInventory(MCCContainerCloseReason closeReason) {

    }

    @Override
    public @Nullable MCCContainer getCurrentlyViewedInventory() {
        return null;
    }
}
