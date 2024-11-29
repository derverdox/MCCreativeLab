package de.verdox.mccreativelab.wrapper.item;

import de.verdox.mccreativelab.wrapper.annotations.MCCBuiltIn;
import de.verdox.mccreativelab.wrapper.MCCKeyedWrapper;
import de.verdox.mccreativelab.wrapper.annotations.MCCInstantiationSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@MCCInstantiationSource(sourceClasses = MCCItemStack.class)
@MCCBuiltIn(syncState = MCCBuiltIn.SyncState.SYNCED, clientEntersErrorStateOnDesync = true)
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
