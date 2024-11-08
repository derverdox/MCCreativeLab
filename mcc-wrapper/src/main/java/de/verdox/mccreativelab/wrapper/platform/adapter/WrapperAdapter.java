package de.verdox.mccreativelab.wrapper.platform.adapter;

import de.verdox.mccreativelab.wrapper.MCCKeyedWrapper;

/**
 * Used to convert any object from platform specific objects to mostly {@link MCCKeyedWrapper} objects.
 *
 * @param <F> The platform type
 * @param <T> the api type
 */
public interface WrapperAdapter<F, T> {
    /**
     * Converts a wrapped object to a platform object
     * @param wrappedObject the wrapped object
     * @return the platform object
     */
    F apiToPlatform(T wrappedObject);

    /**
     * Converts a platform object to a wrapped object
     * @param platformObject the platform object
     * @return the wrapped object
     */
    T platformToApi(F platformObject);

    /**
     * Returns the platform type
     * @return the platform type
     */
    Class<F> getPlatformType();

    /**
     * Returns the wrapped type
     * @return the wrapped type
     */
    Class<T> getApiType();
}
