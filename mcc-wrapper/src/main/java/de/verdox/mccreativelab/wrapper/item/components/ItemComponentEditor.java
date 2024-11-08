package de.verdox.mccreativelab.wrapper.item.components;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Used to edit an item component
 *
 * @param <R> the generic type of the component
 * @param <T> the component type
 */
public interface ItemComponentEditor<R, T extends MCCDataComponentType<R>> {

    /**
     * Reads the value from the component
     *
     * @return the component value
     */
    @Nullable R get();

    /**
     * Sets the value in the component
     *
     * @param data the new value
     */
    void set(@Nullable R data);

    /**
     * Creates a new value
     *
     * @return the new value
     */
    @NotNull R create();

    /**
     *
     * @param consumer
     */
    default void with(@NotNull Consumer<R> consumer) {
        Objects.requireNonNull(consumer);
        R component = create();
        consumer.accept(component);
        set(component);
    }

    /**
     * Gets the {@link MCCDataComponentType}
     * @return the type
     */
    T type();
}
