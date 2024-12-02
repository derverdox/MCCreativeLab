package de.verdox.mccreativelab.conversion;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

public interface ConversionService {
    <A, T extends A, F> void registerPlatformType(Class<A> apiType, MCCConverter<F, T> converter);

    <F,T> T wrap(F nativeObject);

    <F,T> F unwrap(T apiObject);

    boolean isNativeTypeKnown(Class<?> nativeType);

    boolean isApiTypeKnown(Class<?> apiType);

    default <F, T> T wrap(@Nullable F objectToWrap, TypeToken<T> apiTypeToConvertTo) {
        return (T) wrap(objectToWrap);
    }

    default <F, T> T wrap(@Nullable F objectToWrap, Class<T> apiTypeToConvertTo) {
        return (T) wrap(objectToWrap);
    }

    default <F, T> F unwrap(@Nullable T objectToUnwrap, TypeToken<F> nativePlatformType) {
        return (F) unwrap(objectToUnwrap);
    }

    default <F, T> F unwrap(@Nullable T objectToUnwrap, Class<F> nativePlatformType) {
        return (F) unwrap(objectToUnwrap);
    }


    Set<ClassPair> getAllKnownClassPairs();

    record ClassPair(Class<?> apiType, Class<?> nativeType){}
}
