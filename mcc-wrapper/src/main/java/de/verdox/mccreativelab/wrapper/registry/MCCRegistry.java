package de.verdox.mccreativelab.wrapper.registry;

import de.verdox.mccreativelab.wrapper.MCCWrapped;
import net.kyori.adventure.key.Key;
import org.apache.commons.lang3.tuple.Pair;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Represents a minecraft registry
 *
 * @param <T> the type
 */
public interface MCCRegistry<T> extends MCCWrapped {
    /**
     * Gets the key of a provided value
     *
     * @param value the value
     * @return the key
     */
    @Nullable
    Key getKey(T value);

    Optional<MCCTypedKey<T>> getTypedKey(T value);

    int getId(T value);

    @Nullable
    T get(@Nullable MCCTypedKey<T> key);

    @Nullable
    T get(@Nullable Key id);

    default Optional<T> getOptional(@Nullable Key id) {
        return Optional.ofNullable(get(id));
    }

    default Optional<T> getOptional(@Nullable MCCTypedKey<T> key) {
        return Optional.ofNullable(get(key));
    }

    Optional<MCCReference<T>> getAny();

    T getOrThrow(MCCTypedKey<T> key);

    Set<Key> keySet();

    Set<Map.Entry<MCCTypedKey<T>, T>> entrySet();

    Set<MCCTypedKey<T>> registryKeySet();

    boolean containsKey(Key key);

    boolean containsKey(MCCTypedKey<T> key);

    Optional<MCCReference<T>> getReference(int rawId);

    Optional<MCCReference<T>> getReference(Key key);

    Optional<MCCReference<T>> getReference(MCCTypedKey<T> key);

    MCCReference<T> wrapAsReference(T value);

    /**
     * Returns a reference set that belongs to a tag
     *
     * @param tag the tag
     * @return the reference set as an optional
     */
    Optional<MCCReferenceSet<T>> getTag(MCCTag<T> tag);

    /**
     * Gets or registers a tag to this registry
     *
     * @param tag the tag key
     * @return the references set
     */
    MCCReferenceSet<T> getOrCreateTag(MCCTag<T> tag);

    /**
     * Returns all tag names known to this registry
     *
     * @return a stream of all tags
     */
    Stream<MCCTag<T>> getTagNames();

    /**
     * Returns all tags and references that are registered to this registry as a stream
     *
     * @return all tags and references
     */
    Stream<Pair<MCCTag<T>, MCCReferenceSet<T>>> getTags();
}
