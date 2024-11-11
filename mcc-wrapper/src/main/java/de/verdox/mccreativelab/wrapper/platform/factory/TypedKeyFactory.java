package de.verdox.mccreativelab.wrapper.platform.factory;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.registry.*;
import de.verdox.mccreativelab.wrapper.MCCWrapped;
import net.kyori.adventure.key.Key;

import java.util.List;

/**
 * Used to create typed keys
 */
public interface TypedKeyFactory {
    /**
     * Creates a typed key for a specific type
     *
     * @param key         the key of the typed key
     * @param registryKey the key of registry
     * @param type        the type
     * @param <T>         the generic wrapped type
     * @return the typed key
     */
    <T extends MCCWrapped> MCCTypedKey<T> getKey(Key key, Key registryKey, TypeToken<T> type);

    <T extends MCCWrapped> MCCTag<T> createTag(Key key, Key registryKey, TypeToken<T> type);

    <T extends MCCWrapped> MCCReferenceSet<T> createImmutableSetWithoutKey(List<MCCRegistry<T>> references);
}
