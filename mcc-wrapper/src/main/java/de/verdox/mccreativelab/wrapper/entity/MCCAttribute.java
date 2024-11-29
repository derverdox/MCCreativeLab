package de.verdox.mccreativelab.wrapper.entity;

import de.verdox.mccreativelab.wrapper.annotations.MCCBuiltIn;
import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.annotations.MCCInstantiationSource;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;

/**
 * Represents an entity attribute
 */
@MCCInstantiationSource(sourceClasses = {MCCReference.class})
@MCCBuiltIn(syncState = MCCBuiltIn.SyncState.PARTIALLY_SYNCED)
public interface MCCAttribute extends MCCWrapped {

    /**
     * Gets the translation key of this attribute
     *
     * @return the translation key
     */
    String getTranslationKey();

    /**
     * Returns the default value of this attribute
     *
     * @return the default value
     */
    double getDefaultValue();

    /**
     * Returns the min value of this attribute
     *
     * @return the min value
     */
    double getMinValue();

    /**
     * Returns the max value of this attribute
     *
     * @return the max value
     */
    double getMaxValue();
}
