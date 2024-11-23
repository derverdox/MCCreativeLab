package de.verdox.mccreativelab.wrapper.entity;

import de.verdox.mccreativelab.wrapper.inventory.types.MCCPlayerInventoryContainer;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.util.MCCEntityMultiProperty;
import de.verdox.mccreativelab.wrapper.util.MCCEntityProperty;
import de.verdox.mccreativelab.wrapper.world.Weather;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;

/**
 * Represents a player on a minecraft server
 */
public interface MCCPlayer extends MCCLivingEntity, ContainerViewer {
    /**
     * Gets the inventory of the player
     *
     * @return the inventory
     */
    MCCPlayerInventoryContainer getInventory();

    void resetPlayerWeather();

    void syncInventory();

    /**
     * Represents the world time of the player
     *
     * @return the world time property
     */
    MCCEntityProperty<Long, MCCPlayer> getTimeProperty();

    /**
     * Represents the client weather of the player
     *
     * @return the world time property
     */
    MCCEntityProperty<Weather, MCCPlayer> getWeatherProperty();

    /**
     * Represents all players hidden from this player
     *
     * @return the hide property
     */
    MCCEntityMultiProperty<MCCPlayer, MCCPlayer> getHideProperty();

    /**
     * Represents the item on a players cursor if available. Null if the player does not have a gui open or any item on their mouse cursor.
     *
     * @return the hide property
     */
    MCCEntityProperty<MCCItemStack, MCCPlayer> getCursorProperty();

    /**
     * Represents the ability of a player to click in any gui
     *
     * @return the inventory click property
     */
    MCCEntityProperty<Boolean, MCCPlayer> getInventoryClickProperty();

    /**
     * Represents the ability of a player to click in any gui
     *
     * @return the inventory interact property
     */
    MCCEntityProperty<Boolean, MCCPlayer> getInventoryInteractProperty();

    /**
     * Represents the ability of a player to swap his hand items
     *
     * @return the swap hand property
     */
    MCCEntityProperty<Boolean, MCCPlayer> getSwapHandsProperty();

    /**
     * Represents the ability of a player to interact with blocks or the air
     *
     * @return the interact property
     */
    MCCEntityProperty<Boolean, MCCPlayer> getInteractProperty();

    /**
     * Returns true if the player is still online
     *
     * @return true if the player is still online
     */
    boolean isOnline();

    void setResourcePack(UUID uuid, String downloadURL, byte[] bytes, @Nullable Component prompt, boolean required);
}
