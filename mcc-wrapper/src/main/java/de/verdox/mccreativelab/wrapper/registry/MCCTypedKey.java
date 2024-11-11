package de.verdox.mccreativelab.wrapper.registry;

import de.verdox.mccreativelab.wrapper.MCCWrapped;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.Keyed;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

/**
 * Represents key value pairs that point to a data object in the minecraft registries
 *
 * @param <T>
 */
public interface MCCTypedKey<T> extends Keyed, MCCWrapped {
    /**
     * Reads the value from the registry where it is stored or null if the value is not stored in any known registry
     *
     * @return the value or null
     */
    @Nullable T get();

    /**
     * Reads the value from the registry or throws an exception if the value is not found
     *
     * @param exceptionSupplier the exception to be thrown
     * @return the value
     */
    @NotNull
    default T readFromRegistriesOrThrow(Supplier<RuntimeException> exceptionSupplier) {
        T valueFromRegistries = get();
        if (valueFromRegistries == null)
            throw exceptionSupplier.get();
        return valueFromRegistries;
    }

    /**
     * Returns the key of the registry this typed key belongs to
     *
     * @return the registry key
     */
    Key getRegistryKey();

    /**
     * Gets a reference of this typed key that wraps the underlying element.
     *
     * @return the reference
     */
    MCCReference<T> getAsReference();
}
