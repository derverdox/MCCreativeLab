package de.verdox.mccreativelab.wrapper.util;

import de.verdox.mccreativelab.wrapper.entity.MCCEntity;

import java.util.List;

public interface MCCEntityMultiProperty<T, E extends MCCEntity> {
    List<T> get();

    void add(T newValue);

    void remove(T newValue);

    void add(T... newValues);

    T get(int index);

    boolean contains(T value);

    void clear();

    void sync();
}
