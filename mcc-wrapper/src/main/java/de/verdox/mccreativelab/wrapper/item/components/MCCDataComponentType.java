package de.verdox.mccreativelab.wrapper.item.components;


import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.annotations.MCCBuiltIn;
import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.annotations.MCCInstantiationSource;

@MCCInstantiationSource(sourceClasses = MCCDataComponentEditor.class)
@MCCBuiltIn(syncState = MCCBuiltIn.SyncState.SYNCED, clientEntersErrorStateOnDesync = true)
public interface MCCDataComponentType<T> extends MCCWrapped {
    /**
     * Returns the data type that is stored in an ItemStack when using this component type
     *
     * @return the data type
     */
    TypeToken<T> dataType();

    /**
     * Returns the native data type that is stored in an ItemStack when using this component type
     * @return the native data type
     */
    TypeToken<?> nativeType();

    T createEmpty();
}
