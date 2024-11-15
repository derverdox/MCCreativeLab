package de.verdox.mccreativelab.wrapper.entity.ai;

import de.verdox.mccreativelab.wrapper.MCCWrapped;

public interface MCCMemoryModuleType<T> extends MCCWrapped {
    /**
     * Returns the data type that is stored with this memory module type
     *
     * @return the data type
     */
    Class<T> dataType();

    /**
     * Returns the native data type that is stored with this memory module type
     * @return the native data type
     */
    Class<?> nativeType();
}
