package de.verdox.mccreativelab.wrapper.item.components;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.function.Consumer;

public interface ItemComponentEditor<T extends MCCItemComponentType> {

    @Nullable T get();

    void set(@Nullable T data);

    @NotNull T create();

    default void with(@NotNull Consumer<T> consumer) {
        Objects.requireNonNull(consumer);
        T component = create();
        consumer.accept(component);
        set(component);
    }

}
