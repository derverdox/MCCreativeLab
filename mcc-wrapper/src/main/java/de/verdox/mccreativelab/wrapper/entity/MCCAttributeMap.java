package de.verdox.mccreativelab.wrapper.entity;

import de.verdox.mccreativelab.wrapper.annotations.MCCInstantiationSource;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import net.kyori.adventure.key.Key;

/**
 * Represents the attributes of an entity
 */
public interface MCCAttributeMap {

    /**
     * Registers an attribute to an entity
     *
     * @param attribute the new attribute
     */
    void registerAttribute(MCCTypedKey<MCCAttribute> attribute);

    /**
     * Gets the attribute instance of a given attribute
     *
     * @param attribute the attribute
     * @return true if the attribute is known
     * @throws IllegalArgumentException if the attribute is not known to this map
     */
    MCCAttributeInstance getAttributeInstance(MCCTypedKey<MCCAttribute> attribute) throws IllegalArgumentException;

    /**
     * Checks if an attribute is known to this map
     *
     * @param attribute the attribute
     * @return true if the attribute is known
     */
    boolean hasAttribute(MCCTypedKey<MCCAttribute> attribute);

    /**
     * Checks if a modifier key is known for a particular attribute
     *
     * @param attribute   the attribute
     * @param modifierKey the modifier key
     * @return true if the attribute is known
     */
    boolean hasModifier(MCCTypedKey<MCCAttribute> attribute, Key modifierKey);

    /**
     * Gets the value of a particular attribute
     *
     * @param attribute the attribute
     * @return the value
     */
    double getValue(MCCTypedKey<MCCAttribute> attribute);

    /**
     * Gets the base value of a particular attribute
     *
     * @param attribute the attribute
     * @return the value
     */
    double getBaseValue(MCCTypedKey<MCCAttribute> attribute);

    /**
     * Gets the modifier value of a modifier
     *
     * @param attribute   the attribute
     * @param modifierKey the modifier key
     * @return the value
     */
    double getModifierValue(MCCTypedKey<MCCAttribute> attribute, Key modifierKey);

    /**
     * Assigns all values from another attribute map to this map
     *
     * @param other the other map
     */
    void assignAllValues(MCCAttributeMap other);

    /**
     * Assigns all base values from another attribute map to this map
     *
     * @param other the other map
     */
    void assignBaseValues(MCCAttributeMap other);

}
