package de.verdox.mccreativelab.impl.vanilla.item.components;

import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.item.components.MCCDataComponentType;
import net.minecraft.core.component.DataComponentType;

import java.util.function.Supplier;

public class NMSDataComponentType<N, T, I extends T> extends NMSHandle<DataComponentType<?>> implements MCCDataComponentType<T> {
    private final Class<N> nativeDataClass;
    private final Class<T> apiDataClass;
    private final Supplier<I> defaultCreator;

    public NMSDataComponentType(DataComponentType<N> handle, Class<N> nativeDataClass, Class<T> apiDataClass, Supplier<I> defaultCreator) {
        super(handle);
        this.nativeDataClass = nativeDataClass;
        this.apiDataClass = apiDataClass;
        this.defaultCreator = defaultCreator;
    }


    @Override
    public Class<T> dataType() {
        return apiDataClass;
    }

    @Override
    public Class<?> nativeType() {
        return nativeDataClass;
    }

    @Override
    public T createEmpty() {
        return defaultCreator.get();
    }
}
