package de.verdox.mccreativelab.impl.vanilla.entity;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.platform.TempCache;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.entity.MCCEntityType;
import de.verdox.mccreativelab.wrapper.platform.TempData;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.text.Component;
import net.minecraft.world.entity.Entity;
import org.jetbrains.annotations.NotNull;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public class NMSEntity<T extends Entity> extends MCCHandle<T> implements MCCEntity {
    public static final MCCConverter<Entity, NMSEntity> CONVERTER = converter(NMSEntity.class, Entity.class, NMSEntity::new, nmsEntity -> (Entity) nmsEntity.getHandle());


    public NMSEntity(T handle) {
        super(handle);
    }

    @Override
    public @NotNull MCCEntityType getType() {
        return null;
    }

    @Override
    public Audience asAudience() {
        return null;
    }

    @Override
    public UUID getUUID() {
        return null;
    }

    @Override
    public Component displayName() {
        return null;
    }

    @Override
    public void displayName(Component name) {

    }

    @Override
    public CompletableFuture<MCCEntity> teleport(MCCLocation location) {
        return null;
    }

    @Override
    public MCCLocation getLocation() {
        return null;
    }

    @Override
    public @NotNull Key key() {
        return getType().key();
    }

    @Override
    public TempData getTempData() {
        return TempCache.get(getHandle());
    }


    @Override
    public int getEntityID() {
        return handle.getId();
    }

    @Override
    public boolean isCrouching() {
        return handle.isCrouching();
    }

    @Override
    public boolean isAlwaysTicking() {
        return handle.isAlwaysTicking();
    }

    @Override
    public boolean isAttackable() {
        return handle.isAttackable();
    }

    @Override
    public boolean isCurrentlyGlowing() {
        return handle.isCurrentlyGlowing();
    }

    @Override
    public boolean isFreezing() {
        return handle.isFreezing();
    }

    @Override
    public boolean isFullyFrozen() {
        return handle.isFullyFrozen();
    }

    @Override
    public boolean isIgnoringBlockTriggers() {
        return handle.isIgnoringBlockTriggers();
    }

    @Override
    public boolean isInBubbleColumn() {
        return handle.isInBubbleColumn();
    }

    @Override
    public boolean isInLava() {
        return handle.isInLava();
    }

    @Override
    public boolean isInLiquid() {
        return handle.isInLiquid();
    }

    @Override
    public boolean isInWall() {
        return handle.isInWall();
    }

    @Override
    public boolean isInWater() {
        return handle.isInWater();
    }

    @Override
    public boolean isInWaterOrBubble() {
        return handle.isInWaterOrBubble();
    }

    @Override
    public boolean isInWaterOrRain() {
        return handle.isInWaterOrRain();
    }

    @Override
    public boolean isInWaterOrRainOrBubble() {
        return handle.isInWaterRainOrBubble();
    }

    @Override
    public boolean isNoGravity() {
        return handle.isNoGravity();
    }

    @Override
    public boolean isOnFire() {
        return handle.isOnFire();
    }

    @Override
    public boolean isOnRails() {
        return handle.isOnRails();
    }

    @Override
    public boolean isPickable() {
        return handle.isPickable();
    }

    @Override
    public boolean isPushable() {
        return handle.isPushable();
    }

    @Override
    public boolean isShiftKeyDown() {
        return handle.isShiftKeyDown();
    }

    @Override
    public boolean isSprinting() {
        return handle.isSprinting();
    }

    @Override
    public boolean isSteppingCarefully() {
        return handle.isSteppingCarefully();
    }

    @Override
    public boolean isSwimming() {
        return handle.isSwimming();
    }

    @Override
    public boolean isTicking() {
        return handle.isTicking();
    }

    @Override
    public boolean isUnderwater() {
        return handle.isUnderWater();
    }

    @Override
    public boolean isOnGround() {
        return handle.onGround();
    }
}
