package de.verdox.mccreativelab.wrapper.event;

import org.jetbrains.annotations.Nullable;

public interface EventArgument<T> {
    String argumentId();

    boolean isFinal();

    void set(T newData);

    @Nullable T get();
}
