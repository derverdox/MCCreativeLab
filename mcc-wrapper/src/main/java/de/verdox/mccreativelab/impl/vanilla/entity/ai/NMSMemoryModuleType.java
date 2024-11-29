package de.verdox.mccreativelab.impl.vanilla.entity.ai;

import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.entity.ai.MCCMemoryModuleType;
import net.minecraft.world.entity.ai.memory.MemoryModuleType;

public class NMSMemoryModuleType<N, T, I extends T> extends MCCHandle<MemoryModuleType<?>> implements MCCMemoryModuleType<T> {
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
