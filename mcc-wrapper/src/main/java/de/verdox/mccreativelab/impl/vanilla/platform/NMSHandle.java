package de.verdox.mccreativelab.impl.vanilla.platform;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.ConversionService;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;

import java.util.Objects;
import java.util.function.Function;

public class NMSHandle<T> {
    protected final T handle;
    protected ConversionService conversionService = MCCPlatform.getInstance().getConversionService();

    public NMSHandle(T handle) {
        this.handle = handle;
    }

    public T getHandle() {
        return handle;
    }

    protected static <F, T> MCCConverter<F, T> converterCustomResult(Class<T> apiType, Class<F> platformType, Function<F, MCCConverter.ConversionResult<T>> wrap, Function<T, MCCConverter.ConversionResult<F>> unwrap) {
        return new MCCConverter<>() {
            @Override
            public ConversionResult<T> wrap(F platform) {
                return wrap.apply(platform);
            }

            @Override
            public ConversionResult<F> unwrap(T api) {
                return unwrap.apply(api);
            }

            @Override
            public Class<T> apiImplementationClass() {
                return apiType;
            }

            @Override
            public Class<F> nativeMinecraftType() {
                return platformType;
            }
        };
    }

    protected static <F, T> MCCConverter<F, T> converter(Class<T> apiType, Class<F> platformType, Function<F, T> wrap, Function<T, F> unwrap) {
        return new MCCConverter<>() {
            @Override
            public ConversionResult<T> wrap(F platform) {
                return done(wrap.apply(platform));
            }

            @Override
            public ConversionResult<F> unwrap(T api) {
                return done(unwrap.apply(api));
            }

            @Override
            public Class<T> apiImplementationClass() {
                return apiType;
            }

            @Override
            public Class<F> nativeMinecraftType() {
                return platformType;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NMSHandle<?> nmsHandle = (NMSHandle<?>) o;
        return Objects.equals(handle, nmsHandle.handle);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(handle);
    }

    protected <T> T readFieldFromHandle(String fieldName, TypeToken<T> type){
        try {
            return (T) getHandle().getClass().getDeclaredField(fieldName).get(getHandle());
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}
