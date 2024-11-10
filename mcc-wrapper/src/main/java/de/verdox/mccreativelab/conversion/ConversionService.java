package de.verdox.mccreativelab.conversion;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import org.jetbrains.annotations.Nullable;

import java.util.*;

/**
 * This Conversion Service is used to implement interfaces on a particular platform.
 * In addition, the programmer may register custom types that coexist with the standard implementation of a particular interface.
 */
public interface ConversionService {
    /**
     * Used to register the standard 'platform type' of an 'api type'.
     * Let's say we have implemented our own version of the {@link de.verdox.mccreativelab.wrapper.item.MCCItemStack} interface.
     * We want this implementation to be the standard implementation on this platform.
     * Thus, we use this method
     *
     * @param apiType   The api type
     * @param converter the converter that converts between the impl and the native object
     * @param <A>       the generic api type
     * @param <T>       the generic impl type
     * @param <F>       the generic native type
     */
    <A, T extends A, F> void registerPlatformType(Class<A> apiType, MCCConverter<F, T> converter);

    /**
     * Used to register a custom 'platform type' of an 'api type' that coexists with the standard type.
     * Let's say we have implemented another custom version of the {@link de.verdox.mccreativelab.wrapper.item.MCCItemStack} interface.
     * We want this implementation to be available at the same time.
     * Thus, we use this method.
     *
     * @param apiType   The api type
     * @param converter the converter that converts between the impl and the native object
     * @param <A>       the generic api type
     * @param <T>       the generic impl type
     * @param <F>       the generic native type
     */
    <A, T extends A, F> void registerCustomPlatformType(Class<A> apiType, MCCConverter<F, T> converter);

    /**
     * Used to find platform implementations of MCC Wrapper classes.
     * For example, we could search for Implementation classes of {@link de.verdox.mccreativelab.wrapper.block.MCCBlockType}
     *
     * @param apiType the api type
     * @param <A>     the generic api type
     * @return a set of types
     */
    <A> Set<Class<?>> findAllPlatformTypesForApiType(Class<A> apiType);

    /**
     * Used to find a native class that is used inside a {@link MCCConverter} to convert a native object to a platform impl type
     *
     * @param platformType the platform type
     * @param <A>          the generic platform type
     * @return the found native class
     */
    @Nullable
    <A> Class<?> findNativeClassForPlatformType(Class<A> platformType);

    /**
     * Used to find the api class for a native class. For example, if we provide the native item stack class we should get {@link de.verdox.mccreativelab.wrapper.item.MCCItemStack}
     *
     * @param nativeType the native type
     * @param <A>        the native generic type
     * @return the api type
     */
    @Nullable
    <A> Class<?> findAPITypeForNativeClass(Class<A> nativeType);

    /**
     * Used to find the api class for an implementation class. For example, if we provide a platform implementation of the {@link de.verdox.mccreativelab.wrapper.item.MCCItemStack} interface we should get {@link de.verdox.mccreativelab.wrapper.item.MCCItemStack}
     *
     * @param implType the impl type
     * @param <A>      the impl generic type
     * @return the api type
     */
    @Nullable
    <A> Class<?> findAPIClassForImplClass(Class<A> implType);

    /**
     * Used to wrap a native object to the given apiType
     *
     * @param objectToWrap       the native object
     * @param apiTypeToConvertTo the api type
     * @param <F>                the generic native type
     * @param <T>                the generic api type
     * @return the wrapped api object
     */
    <F, T> T wrap(F objectToWrap, TypeToken<T> apiTypeToConvertTo);

    /**
     * Used to wrap a native object to the given apiType
     *
     * @param objectToWrap       the native object
     * @param apiTypeToConvertTo the api type
     * @param <F>                the generic native type
     * @param <T>                the generic api type
     * @return the wrapped api object
     */
    default <F, T> T wrap(F objectToWrap, Class<T> apiTypeToConvertTo) {
        return wrap(objectToWrap, TypeToken.of(apiTypeToConvertTo));
    }

    /**
     * Used to unwrap an api object to the given platform type
     *
     * @param objectToUnwrap     the api type to unwrap
     * @param nativePlatformType the native type
     * @param <F>                the generic api type
     * @param <T>                the generic native type
     * @return the native object
     */
    <F, T> F unwrap(T objectToUnwrap, TypeToken<F> nativePlatformType);

    /**
     * Used to unwrap an api object to the given platform type
     *
     * @param objectToUnwrap     the api type to unwrap
     * @param nativePlatformType the native type
     * @param <F>                the generic api type
     * @param <T>                the generic native type
     * @return the native object
     */
    default <F, T> F unwrap(T objectToUnwrap, Class<F> nativePlatformType) {
        return unwrap(objectToUnwrap, TypeToken.of(nativePlatformType));
    }

    /**
     * Used to wrap a native object to an api object without knowing the apis representation class
     * If no representation class was found the object is returned without any conversion
     *
     * @param nativeObject the native object
     * @return the wrapped object
     */
    default Object wrap(Object nativeObject) {
        Class<?> apiType = findAPITypeForNativeClass(nativeObject.getClass());
        if (apiType == null)
            return nativeObject;
        return wrap(nativeObject, apiType);
    }

    /**
     * Used to unwrap an api object to a native object without knowing native object type
     * If no native class was found the object is returned without any conversion
     *
     * @param platformImpl the api object
     * @return the unwrapped object
     */
    default Object unwrap(Object platformImpl) {
        Class<?> nativeType = findNativeClassForPlatformType(platformImpl.getClass());
        if (nativeType == null)
            return platformImpl;
        return unwrap(platformImpl, nativeType);
    }

/*    default <F, T> Optional<T> wrapOptional(Optional<F> optionalWithObjectToWrap, TypeToken<T> apiTypeToConvertTo) {
        return optionalWithObjectToWrap.map(f -> wrap(f, apiTypeToConvertTo));
    }

    default <F, T> Optional<T> wrapOptional(Optional<F> optionalWithObjectToWrap, Class<T> apiTypeToConvertTo) {
        return wrapOptional(optionalWithObjectToWrap, TypeToken.of(apiTypeToConvertTo));
    }

    default <F, T> Optional<F> unwrapOptional(Optional<T> optionalWithObjectToWrap, TypeToken<F> nativePlatformType) {
        return optionalWithObjectToWrap.map(t -> unwrap(t, nativePlatformType));
    }

    default <F, T> Optional<F> unwrapOptional(Optional<T> optionalWithObjectToWrap, Class<F> nativePlatformType) {
        return wrapOptional(optionalWithObjectToWrap, TypeToken.of(nativePlatformType));
    }

    default <F, T, C extends Collection<T>> C wrapCollection(Collection<F> collectionToWrap, TypeToken<T> apiTypeToConvertTo, Supplier<C> constructor) {
        C collection = constructor.get();
        collectionToWrap.stream().map(f -> wrap(f, apiTypeToConvertTo)).forEach(collection::add);
        return collection;
    }

    default <F, T, C extends Collection<T>> C wrapCollection(Collection<F> collectionToWrap, Class<T> apiTypeToConvertTo, Supplier<C> constructor) {
        return wrapCollection(collectionToWrap, TypeToken.of(apiTypeToConvertTo), constructor);
    }

    default <F, T, C extends Collection<F>> C unwrapCollection(Collection<T> collectionToWrap, TypeToken<F> nativePlatformType, Supplier<C> constructor) {
        C collection = constructor.get();
        collectionToWrap.stream().map(t -> unwrap(t, nativePlatformType)).forEach(collection::add);
        return collection;
    }

    default <F, T, C extends Collection<F>> C unwrapCollection(Collection<T> collectionToWrap, Class<F> nativePlatformType, Supplier<C> constructor) {
        return wrapCollection(collectionToWrap, TypeToken.of(nativePlatformType), constructor);
    }

    default <KF, KT, VF, VT, M extends Map<KT, VT>> M wrapMap(Map<KF, VF> mapToWrap, TypeToken<KT> apiTypeToConvertKeyTo, TypeToken<VT> apiTypeToConvertValueTo, Supplier<M> constructor) {
        M map = constructor.get();
        mapToWrap.forEach((kf, vf) -> {
            map.put(wrap(kf, apiTypeToConvertKeyTo), wrap(vf, apiTypeToConvertValueTo));
        });
        return map;
    }

    default <KF, KT, VF, VT, M extends Map<KT, VT>> M wrapMap(Map<KF, VF> mapToWrap, Class<KT> apiTypeToConvertKeyTo, Class<VT> apiTypeToConvertValueTo, Supplier<M> constructor) {
        return wrapMap(mapToWrap, TypeToken.of(apiTypeToConvertKeyTo), TypeToken.of(apiTypeToConvertValueTo), constructor);
    }

    default <KF, KT, VF, VT, M extends Map<KF, VF>> M unwrapMap(Map<KT, VT> mapToWrap, TypeToken<KF> nativeTypeToConvertKeyTo, TypeToken<VF> nativeTypeToConvertValueTo, Supplier<M> constructor) {
        M map = constructor.get();
        mapToWrap.forEach((key, value) -> {
            map.put(wrap(key, nativeTypeToConvertKeyTo), unwrap(value, nativeTypeToConvertValueTo));
        });
        return map;
    }

    default <KF, KT, VF, VT, M extends Map<KF, VF>> M unwrapMap(Map<KT, VT> mapToWrap, Class<KF> nativeTypeToConvertKeyTo, Class<VF> nativeTypeToConvertValueTo, Supplier<M> constructor) {
        return unwrapMap(mapToWrap, TypeToken.of(nativeTypeToConvertKeyTo), TypeToken.of(nativeTypeToConvertValueTo), constructor);
    }*/
}
