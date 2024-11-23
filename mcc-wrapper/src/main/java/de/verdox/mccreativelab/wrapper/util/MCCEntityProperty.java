package de.verdox.mccreativelab.wrapper.util;

import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import org.jetbrains.annotations.Nullable;

public interface MCCEntityProperty<T, E extends MCCEntity> {
    @Nullable T get();

    void set(@Nullable T newValue);

    void sync();
}
