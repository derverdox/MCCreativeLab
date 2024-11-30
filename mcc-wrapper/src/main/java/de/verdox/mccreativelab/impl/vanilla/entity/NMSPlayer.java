package de.verdox.mccreativelab.impl.vanilla.entity;

import com.google.common.base.Preconditions;
import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.entity.player.client.NMSSkinParts;
import de.verdox.mccreativelab.wrapper.entity.player.client.MCCClientOption;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.block.MCCBlock;
import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.exceptions.OperationNotPossibleOnNMS;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerCloseReason;
import de.verdox.mccreativelab.wrapper.inventory.types.MCCPlayerInventoryContainer;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.platform.properties.MCCPropertyKey;
import de.verdox.mccreativelab.wrapper.util.MCCEntityMultiProperty;
import de.verdox.mccreativelab.wrapper.util.MCCEntityProperty;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import de.verdox.mccreativelab.wrapper.world.Weather;
import net.kyori.adventure.text.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.game.ClientboundBlockDestructionPacket;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.bukkit.inventory.MainHand;
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
        //TODO
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
        //TODO
    }

    @Override
    public void sendBlockDamage(@NotNull MCCLocation location, @Range(from = 0, to = 1) float progress, int entityId) {
        Preconditions.checkArgument(location != null, "loc must not be null");
        Preconditions.checkArgument(progress >= 0.0 && progress <= 1.0, "progress must be between 0.0 and 1.0 (inclusive)");

        if (getServerPlayer().connection == null) {
            return;
        }

        int stage = (int) (9 * progress); // There are 0 - 9 damage states
        if (progress == 0.0F) {
            stage = -1; // The protocol states that any other value will reset the damage, which this API promises
        }

        ClientboundBlockDestructionPacket packet = new ClientboundBlockDestructionPacket(entityId, new BlockPos(location.blockX(), location.blockY(), location.blockZ()), stage);
        getServerPlayer().connection.send(packet);
    }

    @Override
    public boolean breakBlock(MCCBlock block) {
        Preconditions.checkArgument(block != null, "Block cannot be null");
        Preconditions.checkArgument(block.getLocation().world().equals(this.getLocation().world()), "Cannot break blocks across worlds");

        return getServerPlayer().gameMode.destroyBlock(new BlockPos(getLocation().blockX(), getLocation().blockY(), getLocation().blockZ()));
    }

    @Override
    public <T> T getClientOption(MCCClientOption<T> type) {
        if (MCCClientOption.SKIN_PARTS == type) {
            return type.getType().cast(new NMSSkinParts(getHandle()));
        } else if (MCCClientOption.CHAT_COLORS_ENABLED == type) {
            return type.getType().cast(getServerPlayer().canChatInColor());
        } else if (MCCClientOption.CHAT_VISIBILITY == type) {
            return type.getType().cast(getServerPlayer().getChatVisibility() == null ? MCCClientOption.ChatVisibility.UNKNOWN : MCCClientOption.ChatVisibility.valueOf(getServerPlayer().getChatVisibility().name()));
        } else if (MCCClientOption.LOCALE == type) {
            return type.getType().cast(getLocale());
        } else if (MCCClientOption.MAIN_HAND == type) {
            return type.getType().cast(getMainHand());
        } else if (MCCClientOption.VIEW_DISTANCE == type) {
            return type.getType().cast(getClientViewDistance());
        } else if (MCCClientOption.ALLOW_SERVER_LISTINGS == type) {
            return type.getType().cast(getServerPlayer().allowsListing());
        } else if (MCCClientOption.TEXT_FILTERING_ENABLED == type) {
            return type.getType().cast(getServerPlayer().isTextFilteringEnabled());
        }
        throw new RuntimeException("Unknown settings type");
    }

    @Override
    public boolean openContainer(MCCContainer mccContainer, Component title) {
        //TODO
        return false;
    }

    @Override
    public void closeCurrentInventory(MCCContainerCloseReason closeReason) {
        //TODO
    }

    @Override
    public @Nullable MCCContainer getCurrentlyViewedInventory() {
        return null;
    }

    protected ServerPlayer getServerPlayer(){
        return (ServerPlayer) getHandle();
    }

    private String getLocale() {
        final String locale = getServerPlayer().language;
        return locale != null ? locale : "en_us";
    }

    private MainHand getMainHand() {
        return this.getHandle().getMainArm() == HumanoidArm.LEFT ? MainHand.LEFT : MainHand.RIGHT;
    }


    private int getClientViewDistance() {
        return (getServerPlayer().requestedViewDistance() == 0) ? MCCPlatform.getInstance().getServerProperties().read(MCCPropertyKey.VIEW_DISTANCE) : getServerPlayer().requestedViewDistance();
    }
}
