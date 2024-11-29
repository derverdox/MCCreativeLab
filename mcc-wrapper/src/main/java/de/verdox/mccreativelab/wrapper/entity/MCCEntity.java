package de.verdox.mccreativelab.wrapper.entity;

import de.verdox.mccreativelab.wrapper.MCCKeyedWrapper;
import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.annotations.MCCInstantiationSource;
import de.verdox.mccreativelab.wrapper.platform.TempDataHolder;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import de.verdox.mccreativelab.wrapper.world.MCCWorld;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * Describes an entity in a minecraft world
 */
@MCCInstantiationSource(sourceClasses = {MCCWorld.class})
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

    default CompletableFuture<MCCEntity> teleport(MCCLocation location) {
        return location.world().teleport(location, this);
    }

    MCCLocation getLocation();

    int getEntityID();

    boolean isCrouching();

    boolean isAlwaysTicking();

    boolean isAttackable();

    boolean isCurrentlyGlowing();

    boolean isFreezing();

    boolean isFullyFrozen();

    boolean isIgnoringBlockTriggers();

    boolean isInBubbleColumn();

    boolean isInLava();

    boolean isInLiquid();

    boolean isInWall();

    boolean isInWater();

    boolean isInWaterOrBubble();

    boolean isInWaterOrRain();

    boolean isInWaterOrRainOrBubble();

    boolean isNoGravity();

    boolean isOnFire();

    boolean isOnRails();

    boolean isPickable();

    boolean isPushable();

    boolean isShiftKeyDown();

    boolean isSprinting();

    boolean isSteppingCarefully();

    boolean isSwimming();

    boolean isTicking();

    boolean isUnderwater();

    boolean isOnGround();
}
