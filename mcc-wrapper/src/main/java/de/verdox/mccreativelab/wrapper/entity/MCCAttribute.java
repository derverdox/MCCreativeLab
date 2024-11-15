package de.verdox.mccreativelab.wrapper.entity;

/**
 * Represents an entity attribute
 */
public interface MCCAttribute {

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
