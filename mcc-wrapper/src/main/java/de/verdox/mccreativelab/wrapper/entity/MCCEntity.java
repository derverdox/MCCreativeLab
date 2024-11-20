package de.verdox.mccreativelab.wrapper.entity;

import de.verdox.mccreativelab.wrapper.MCCKeyedWrapper;
import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.platform.TempData;
import de.verdox.mccreativelab.wrapper.platform.TempDataHolder;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * Describes an entity in a minecraft world
 */
public interface MCCEntity extends MCCKeyedWrapper, TempDataHolder, MCCWrapped {
    /**
     * Gets the type of this entity
     *
     * @return the type
     */
    @NotNull MCCEntityType getType();

    /**
     * Gets the audience of this entity
     *
     * @return the audience
     */
    Audience asAudience();

    /**
     * Gets the uuid of this entity
     *
     * @return the uuid
     */
    UUID getUUID();

    /**
     * Gets the display name of this entity
     *
     * @return the display name
     */
    Component displayName();

    /**
     * Sets the display name of this entity
     *
     * @param name the display name
     */
    void displayName(Component name);

    CompletableFuture<Void> teleport(MCCLocation location);

    MCCLocation getLocation();
}
