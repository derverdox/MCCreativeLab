package de.verdox.mccreativelab.impl.vanilla.entity.ai;

import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.entity.ai.MCCMemoryModuleType;
import de.verdox.mccreativelab.wrapper.item.components.MCCDataComponentType;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.world.entity.ai.memory.MemoryModuleType;

import java.util.function.Supplier;

public class NMSMemoryModuleType<N, T, I extends T> extends NMSHandle<MemoryModuleType<?>> implements MCCMemoryModuleType<T> {
    private final Class<N> nativeDataClass;
    private final Class<T> apiDataClass;

    public NMSMemoryModuleType(MemoryModuleType<N> handle, Class<N> nativeDataClass, Class<T> apiDataClass) {
        super(handle);
        this.nativeDataClass = nativeDataClass;
        this.apiDataClass = apiDataClass;
    }

    @Override
    public Class<T> dataType() {
        return apiDataClass;
    }

    @Override
    public Class<?> nativeType() {
        return nativeDataClass;
    }
}
