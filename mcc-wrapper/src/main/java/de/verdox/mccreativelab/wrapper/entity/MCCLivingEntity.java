package de.verdox.mccreativelab.wrapper.entity;

import de.verdox.mccreativelab.wrapper.util.MCCEntityMultiProperty;
import de.verdox.mccreativelab.wrapper.util.MCCEntityProperty;
import de.verdox.mccreativelab.wrapper.world.MCCDamageType;

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
    MCCEntityMultiProperty<MCCEntityType, MCCLivingEntity> getTargetableProperty();

    /**
     * Represents the ability of a living entity to pickup items
     *
     * @return the pickup item property
     */
    MCCEntityProperty<Boolean, MCCLivingEntity> getPickupItemProperty();

    /**
     * Returns true if the entity is dead
     *
     * @return true if it is dead
     */
    boolean isDead();
}
