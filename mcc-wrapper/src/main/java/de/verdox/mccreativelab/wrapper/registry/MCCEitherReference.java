package de.verdox.mccreativelab.wrapper.registry;

import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.annotations.MCCInstantiationSource;

import java.util.Optional;

/**
 * Implements the Either pattern. This is used whenever it is not known whether a particular data is already loaded.
 * Either the data is stored in the optional as a holder, or only the resource key is available.
 *
 * @param <T> The api type
 */
public interface MCCEitherReference<T> extends MCCWrapped {
    /**
     * Returns the reference to the object
     *
     * @return the reference
     */
    Optional<MCCReference<T>> getReference();

    /**
     * Returns the resource key of the object
     *
     * @return the resource key
     */
    MCCTypedKey<T> getTypedKey();
}
