package de.verdox.mccreativelab.impl.vanilla.entity;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.block.MCCBlock;
import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.exceptions.OperationNotPossibleOnNMS;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerCloseReason;
import de.verdox.mccreativelab.wrapper.inventory.types.MCCPlayerInventoryContainer;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.util.MCCEntityMultiProperty;
import de.verdox.mccreativelab.wrapper.util.MCCEntityProperty;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import de.verdox.mccreativelab.wrapper.world.Weather;
import net.kyori.adventure.text.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import java.util.Objects;
import java.util.UUID;

public class NMSPlayer extends NMSLivingEntity<Player> implements MCCPlayer {
    public static final MCCConverter<Player, NMSPlayer> CONVERTER = converter(NMSPlayer.class, Player.class, NMSPlayer::new, MCCHandle::getHandle);


    public NMSPlayer(Player handle) {
        super(handle);
    }

    @Override
    public MCCPlayerInventoryContainer getInventory() {
        return MCCPlatform.getInstance().getConversionService().wrap(handle.getInventory(), new TypeToken<>() {});
    }

    @Override
    public void syncInventory() {

    }

    @Override
    public MCCEntityProperty<Long, MCCPlayer> getTimeProperty() {
        return new MCCEntityProperty<>() {
            @Override
            public @Nullable Long get() {
                return getServerPlayer().getPlayerTime();
            }

            @Override
            public void set(@Nullable Long newValue) {
                Objects.requireNonNull(newValue);
                getServerPlayer().timeOffset = newValue;
                getServerPlayer().relativeTime = false;
            }

            @Override
            public void sync() {
                getServerPlayer().timeOffset = 0;
                getServerPlayer().relativeTime = false;
            }
        };
    }

    @Override
    public MCCEntityProperty<Weather, MCCPlayer> getWeatherProperty() {
        //TODO:
        return null;
    }

    @Override
    public MCCEntityMultiProperty<MCCPlayer, MCCPlayer> getHideProperty() {
        return null;
    }

    @Override
    public MCCEntityProperty<MCCItemStack, MCCPlayer> getCursorProperty() {
        return new MCCEntityProperty<>() {
            @Override
            public @Nullable MCCItemStack get() {
                return MCCPlatform.getInstance().getConversionService().wrap(getServerPlayer().containerMenu.getCarried(), new TypeToken<>() {});
            }

            @Override
            public void set(@Nullable MCCItemStack newValue) {
                ItemStack stack = MCCPlatform.getInstance().getConversionService().unwrap(newValue, new TypeToken<>() {});
                getServerPlayer().containerMenu.setCarried(stack);
                getServerPlayer().containerMenu.broadcastCarriedItem();
            }

            @Override
            public void sync() {

            }
        };
    }

    @Override
    public MCCEntityProperty<Boolean, MCCPlayer> getInventoryClickProperty() {
        throw new OperationNotPossibleOnNMS();
    }

    @Override
    public MCCEntityProperty<Boolean, MCCPlayer> getInventoryInteractProperty() {
        throw new OperationNotPossibleOnNMS();
    }

    @Override
    public MCCEntityProperty<Boolean, MCCPlayer> getSwapHandsProperty() {
        throw new OperationNotPossibleOnNMS();
    }

    @Override
    public MCCEntityProperty<Boolean, MCCPlayer> getInteractProperty() {
        throw new OperationNotPossibleOnNMS();
    }

    @Override
    public boolean isOnline() {
        return !getServerPlayer().hasDisconnected();
    }

    @Override
    public void setResourcePack(UUID uuid, String downloadURL, byte[] bytes, @Nullable Component prompt, boolean required) {

    }

    @Override
    public void sendBlockDamage(@NotNull MCCLocation location, @Range(from = 0, to = 1) float progress, int entityId) {

    }

    @Override
    public void breakBlock(MCCBlock block) {

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

    protected ServerPlayer getServerPlayer(){
        return (ServerPlayer) getHandle();
    }
}
