package de.verdox.mccreativelab.wrapper.registry;

import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.annotations.MCCInstantiationSource;
import de.verdox.mccreativelab.wrapper.annotations.MCCReflective;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Represents a set of {@link MCCReference}
 */
public interface MCCReferenceSet<T> extends Iterable<MCCReference<T>>, MCCWrapped {

    /**
     * Returns the amount of elements contained in this set
     *
     * @return the amount of elements
     */
    int size();

    /**
     * Returns true if the provided reference is contained in the set
     *
     * @param reference the reference
     * @return true if the set contains the reference
     */
    boolean contains(MCCReference<T> reference);

    /**
     * Streams all values of the set
     *
     * @return the stream
     */
    Stream<MCCReference<T>> stream();

    /**
     * Unwraps the tag of this set as an optional
     *
     * @return the optional tag
     */
    Optional<MCCTag<T>> unwrapKey();

    /**
     * Sets the contents of the tag. Will throw a {@link UnsupportedOperationException} if the set is immutable.
     * If the tag is produced by minecraft its contents will be overwritten when the server reloads its resources.
     *
     * @param newContents the new contents
     */
    @MCCReflective
    void setContents(List<MCCReference<T>> newContents);

    /**
     * Checks whether the set is immutable
     *
     * @return true if the set is immutable
     */
    boolean isImmutable();
}
