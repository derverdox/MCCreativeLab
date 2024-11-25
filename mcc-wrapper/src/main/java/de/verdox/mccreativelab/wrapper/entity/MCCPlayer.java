package de.verdox.mccreativelab.wrapper.entity;

import de.verdox.mccreativelab.wrapper.block.MCCBlock;
import de.verdox.mccreativelab.wrapper.inventory.types.MCCPlayerInventoryContainer;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.util.MCCEntityMultiProperty;
import de.verdox.mccreativelab.wrapper.util.MCCEntityProperty;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import de.verdox.mccreativelab.wrapper.world.Weather;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

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

    /**
     * Sets the resource pack of a player
     *
     * @param uuid        the uuid of the resource pack
     * @param downloadURL the download url of the resource pack
     * @param hashBytes   the hash bytes of the resource pack
     * @param prompt      the prompt to show to the player
     * @param required    whether the resource pack is required on this server
     */
    void setResourcePack(UUID uuid, String downloadURL, byte[] hashBytes, @Nullable Component prompt, boolean required);

    /**
     * Sends block damage to this player at a specified location
     * @param location location of the block with the damage state
     * @param progress the damage state
     * @param entityId The id of the effect
     */
    void sendBlockDamage(@NotNull MCCLocation location, @Range(from = 0, to = 1) float progress, int entityId);

    void breakBlock(MCCBlock block);
}
