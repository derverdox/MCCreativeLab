package de.verdox.mccreativelab.wrapper.item;

import de.verdox.mccreativelab.wrapper.MCCKeyedWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface MCCItemType extends MCCKeyedWrapper {
    @NotNull
    MCCItemStack createItem();

    default boolean isSame(@Nullable MCCItemStack stack) {
        if (stack == null)
            return false;
        return equals(stack.getType());
    }

    boolean isEmpty();
}
