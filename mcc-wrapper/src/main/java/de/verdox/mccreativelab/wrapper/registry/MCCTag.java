package de.verdox.mccreativelab.wrapper.registry;

import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.annotations.MCCInstantiationSource;
import net.kyori.adventure.key.Keyed;

/**
 * Represents a group of minecraft elements
 *
 * @param <T> the tag type
 */
public interface MCCTag<T> extends Keyed, MCCWrapped {
    /**
     * Checks whether the tag belongs to a particular registry
     *
     * @param registryKey the registry key
     * @return true if it belongs to the provided registry
     */
    boolean isFor(MCCTypedKey<? extends MCCRegistry<?>> registryKey);

    /**
     * Returns the registry key of this tag
     *
     * @return the registry key
     */
    MCCTypedKey<? extends MCCRegistry<T>> getRegistryKey();

    /**
     * Returns the registry this key belongs to
     *
     * @return the registry
     */
    MCCRegistry<T> getRegistry();

    /**
     * Returns the values that are bound to this tag
     *
     * @return the values
     */
    default MCCReferenceSet<T> getValues() {
        return getRegistry().getOrCreateTag(this);
    }

    default boolean contains(T value){
        MCCReference<T> referenceOfValue = getRegistry().wrapAsReference(value);
        return getValues().contains(referenceOfValue);
    }
}
