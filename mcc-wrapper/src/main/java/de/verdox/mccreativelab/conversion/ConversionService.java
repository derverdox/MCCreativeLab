package de.verdox.mccreativelab.conversion;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;

public interface ConversionService {
    <A, T extends A, F> void registerPlatformType(Class<A> apiType, MCCConverter<F, T> converter);

    Object wrap(Object nativeObject);

    Object unwrap(Object apiObject);

    boolean isNativeTypeKnown(Class<?> nativeType);

    boolean isApiTypeKnown(Class<?> apiType);

    default <F, T> T wrap(F objectToWrap, TypeToken<T> apiTypeToConvertTo) {
        return (T) wrap(objectToWrap);
    }

    default <F, T> T wrap(F objectToWrap, Class<T> apiTypeToConvertTo) {
        return (T) wrap(objectToWrap);
    }

    default <F, T> F unwrap(T objectToUnwrap, TypeToken<F> nativePlatformType) {
        return (F) unwrap(objectToUnwrap);
    }

    default <F, T> F unwrap(T objectToUnwrap, Class<F> nativePlatformType) {
        return (F) unwrap(objectToUnwrap);
    }
}
