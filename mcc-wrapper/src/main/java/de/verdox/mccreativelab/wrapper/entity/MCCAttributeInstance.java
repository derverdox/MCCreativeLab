package de.verdox.mccreativelab.wrapper.entity;

import de.verdox.mccreativelab.wrapper.annotations.MCCInstantiationSource;
import de.verdox.mccreativelab.wrapper.annotations.MCCLogic;
import de.verdox.mccreativelab.wrapper.item.MCCAttributeModifier;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.world.chunk.MCCChunkSection;
import net.kyori.adventure.key.Key;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public interface MCCAttributeInstance {
    /**
     * The attribute pertaining to this instance.
     *
     * @return the attribute
     */
    @NotNull
    MCCReference<MCCAttribute> getAttribute();

    /**
     * Base value of this instance before modifiers are applied.
     *
     * @return base value
     */
    double getBaseValue();

    /**
     * Set the base value of this instance.
     *
     * @param value new base value
     */
    void setBaseValue(double value);

    /**
     * Get all modifiers present on this instance.
     *
     * @return a copied collection of all modifiers
     */
    @NotNull
    Collection<MCCAttributeModifier> getModifiers();

    /**
     * Remove a modifier with the corresponding key from this instance.
     *
     * @param key the key of the modifier
     */
    void removeModifier(@NotNull Key key);

    /**
     * Add a modifier to this instance.
     *
     * @param modifier to add
     */
    void addModifier(@NotNull MCCAttributeModifier modifier);

    /**
     * Add a transient modifier to this instance.
     * Transient modifiers are not persisted (saved with the NBT data)
     *
     * @param modifier to add
     */
    @MCCLogic
    void addTransientModifier(@NotNull MCCAttributeModifier modifier);

    /**
     * Remove a modifier from this instance.
     *
     * @param modifier to remove
     */
    default void removeModifier(@NotNull MCCAttributeModifier modifier){
        removeModifier(modifier.key());
    }

    /**
     * Get the value of this instance after all associated modifiers have been
     * applied.
     *
     * @return the total attribute value
     */
    double getValue();

    /**
     * Gets the default value of the Attribute attached to this instance.
     *
     * @return server default value
     */
    double getDefaultValue();
}
