package de.verdox.mccreativelab.wrapper.registry;

import de.verdox.mccreativelab.wrapper.MCCWrapped;

import java.util.Optional;

/**
 * A reference always holds direct access to an underlying native object.
 * Sometimes a reference also is bound to a typed key.
 * If no typed key is available this reference is a direct reference. Else it is a referenced one.
 *
 * @param <T> The api type
 */
public interface MCCReference<T> extends MCCWrapped {
    /**
     * Gets an optional containing the typed key of this reference if available
     *
     * @return the typed key
     */
    Optional<MCCTypedKey<T>> unwrapKey();

    T get();
}
