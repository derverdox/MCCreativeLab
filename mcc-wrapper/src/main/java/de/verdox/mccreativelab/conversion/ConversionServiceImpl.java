package de.verdox.mccreativelab.conversion;

import de.verdox.mccreativelab.conversion.converter.*;

import java.util.*;
import java.util.stream.Collectors;

public class ConversionServiceImpl implements ConversionService {
    private final ConversionCache<MCCConverter<?, ?>> conversionCache = new ConversionCache<>();

    public ConversionServiceImpl(){
        registerPlatformType(Optional.class, new OptionalConverter());
        registerPlatformType(List.class, new CollectionConverter<>(ArrayList::new, List.class));

        registerPlatformType(Set.class, new CollectionConverter<>(HashSet::new, Set.class));
        registerPlatformType(Map.class, new MapConverter<>(HashMap::new, Map.class));
        registerPlatformType(Map.Entry.class, new MapEntryConverter());
    }

    @Override
    public <A, T extends A, F> void registerPlatformType(Class<A> apiType, MCCConverter<F, T> converter) {
        conversionCache.put(apiType, converter.apiImplementationClass(), converter.nativeMinecraftType(), converter);
    }

    @Override
    public Object wrap(Object nativeObject) {
        return conversionCache.getAllVariantsForNativeType(nativeObject)
            .filter(mccConverter -> mccConverter.nativeMinecraftType().isAssignableFrom(nativeObject.getClass()))
            .map(mccConverter -> (MCCConverter<Object, Object>) mccConverter)
            .map(mccConverter -> mccConverter.wrap(nativeObject))
            .filter(objectConversionResult -> objectConversionResult.result().isDone())
            .map(MCCConverter.ConversionResult::value)
            .findAny().orElse(null);
    }

    @Override
    public Object unwrap(Object apiObject) {
        return conversionCache.getAllVariantsForApiType(apiObject)
            .filter(mccConverter -> mccConverter.apiImplementationClass().isAssignableFrom(apiObject.getClass()))
            .map(mccConverter -> (MCCConverter<Object, Object>) mccConverter)
            .map(mccConverter -> mccConverter.unwrap(apiObject))
            .filter(objectConversionResult -> objectConversionResult.result().isDone())
            .map(MCCConverter.ConversionResult::value)
            .findAny().orElse(null);
    }

    @Override
    public boolean isNativeTypeKnown(Class<?> nativeType) {
        return conversionCache.knowsNativeType(nativeType);
    }

    @Override
    public boolean isApiTypeKnown(Class<?> apiType) {
        return conversionCache.knowsApiType(apiType);
    }

    @Override
    public Set<ClassPair> getAllKnownClassPairs() {
        return conversionCache.getApiToNativeMapping().stream().map(pair -> new ClassPair(pair.getKey(), pair.getValue())).collect(Collectors.toSet());
    }

    @Override
    public String toString() {
        return "ConversionServiceImpl{" +
            "conversionCache=" + conversionCache +
            '}';
    }
}
