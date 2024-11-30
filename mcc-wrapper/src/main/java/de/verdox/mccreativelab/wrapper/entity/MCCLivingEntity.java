package de.verdox.mccreativelab.wrapper.entity;

import de.verdox.mccreativelab.wrapper.annotations.MCCInstantiationSource;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.util.MCCEntityMultiProperty;
import de.verdox.mccreativelab.wrapper.util.MCCEntityProperty;
import de.verdox.mccreativelab.wrapper.world.MCCDamageType;
import de.verdox.mccreativelab.wrapper.world.MCCWorld;
import org.jetbrains.annotations.Nullable;

public interface MCCLivingEntity extends MCCEntity {

    /**
     * Represents the immunity properties of an entity
     *
     * @return the damage immunity property
     */
    MCCEntityMultiProperty<MCCDamageType, MCCLivingEntity> getDamageImmunityProperty();

    /**
     * Represents the targetability of an entity by other entity types
     *
     * @return the targetable property
     */
    MCCEntityMultiProperty<MCCEntityType, MCCLivingEntity> getUntargetableProperty();

    /**
     * Represents the ability of a living entity to pickup items
     *
     * @return the pickup item property
     */
    MCCEntityProperty<Boolean, MCCLivingEntity> getPickupItemProperty();

    /**
     * Gets the active effect for a provided effect type or null if no active effect was found
     *
     * @param effectType the effect type
     * @return the active effect or null
     */
    @Nullable
    default MCCEffect getActiveEffect(MCCEffectType effectType) {
        return effectType.getActiveEffect(this);
    }

    /**
     * Checks if this entity has an active effect of the provided effect type
     *
     * @param effectType the effect type
     * @return true if there is an active effect
     */
    default boolean hasActiveEffect(MCCEffectType effectType) {
        return effectType.hasActiveEffect(this);
    }

    /**
     * Returns true if the entity is dead
     *
     * @return true if it is dead
     */
    boolean isDead();

    /**
     * Returns the attribute map of this living entity
     *
     * @return the attribute map
     */
    MCCAttributeMap getAttributes();


}
