package de.verdox.mccreativelab.wrapper.inventory;

import de.verdox.mccreativelab.wrapper.MCCKeyedWrapper;
import net.kyori.adventure.key.Key;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 * Describes a menu type
 */
public record MCCMenuType<T extends MCCContainerMenu<?,?>>(Key key, int containerSize) implements MCCKeyedWrapper {

    @Override
    public @NotNull Key key() {
        return key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MCCMenuType<?> that = (MCCMenuType<?>) o;
        return Objects.equals(key, that.key);
    }

    /**
     * Gets the standard container size in amount of slots for this type
     *
     * @return the amount of slots
     */
    @Override
    public int containerSize() {
        return containerSize;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(key);
    }
}
