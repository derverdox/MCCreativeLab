package de.verdox.mccreativelab.wrapper.item.components;


import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.MCCWrapped;

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
