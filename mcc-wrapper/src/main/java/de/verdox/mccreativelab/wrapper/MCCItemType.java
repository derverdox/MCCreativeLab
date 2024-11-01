package de.verdox.mccreativelab.wrapper;

import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface MCCItemType extends MCCWrapped {
    @NotNull MCCItemStack createItem();
    boolean isSame(@Nullable MCCItemStack stack);
}
