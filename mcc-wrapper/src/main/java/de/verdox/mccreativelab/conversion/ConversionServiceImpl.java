package de.verdox.mccreativelab.conversion;

import de.verdox.mccreativelab.conversion.converter.*;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class ConversionServiceImpl implements ConversionService {
    //TODO: Introduce caching of nativeObjects to object allocations
    private static final Logger LOGGER = Logger.getLogger(ConversionService.class.getSimpleName());

    private final ConversionCache<MCCConverter<?, ?>> conversionCache = new ConversionCache<>();

    public ConversionServiceImpl() {
        registerPlatformType(Optional.class, new OptionalConverter());
        registerPlatformType(List.class, new CollectionConverter<>(ArrayList::new, List.class));

        registerPlatformType(Set.class, new CollectionConverter<>(HashSet::new, Set.class));
        registerPlatformType(Map.class, new MapConverter<>(HashMap::new, Map.class));
        registerPlatformType(Map.Entry.class, new MapEntryConverter());
    }

    @Override
    public <A, T extends A, F> void registerPlatformType(Class<A> apiType, MCCConverter<F, T> converter) {
        LOGGER.info("Registering converter for "+apiType.getSimpleName()+" ("+converter.nativeMinecraftType().getSimpleName()+" <-> "+converter.apiImplementationClass().getSimpleName()+")");
        conversionCache.put(apiType, converter.apiImplementationClass(), converter.nativeMinecraftType(), converter);
    }

    @Override
    public Object wrap(@Nullable Object nativeObject) {
        if (nativeObject == null) {
            return null;
        }
        return conversionCache.getAllVariantsForNativeType(nativeObject)
            .filter(mccConverter -> mccConverter.nativeMinecraftType().isAssignableFrom(nativeObject.getClass()))
            .map(mccConverter -> (MCCConverter<Object, Object>) mccConverter)
            .map(mccConverter -> mccConverter.wrap(nativeObject))
            .filter(objectConversionResult -> objectConversionResult.result().isDone())
            .map(MCCConverter.ConversionResult::value)
            .findAny().orElseThrow(() -> new IllegalArgumentException("Could not find a converter to wrap the native type " + nativeObject + " (" + nativeObject.getClass().getCanonicalName() + "). Make sure that you have registered a converter for the given object type."));
    }

    @Override
    public Object unwrap(@Nullable Object apiObject) {
        if (apiObject == null) {
            return null;
        }
        return conversionCache.getAllVariantsForApiType(apiObject)
            .filter(mccConverter -> mccConverter.apiImplementationClass().isAssignableFrom(apiObject.getClass()))
            .map(mccConverter -> (MCCConverter<Object, Object>) mccConverter)
            .map(mccConverter -> mccConverter.unwrap(apiObject))
            .filter(objectConversionResult -> objectConversionResult.result().isDone())
            .map(MCCConverter.ConversionResult::value)
            .findAny().orElseThrow(() -> new IllegalArgumentException("Could not find a converter to wrap the api type " + apiObject + " (" + apiObject.getClass().getCanonicalName() + "). Make sure that you have registered a converter for the given object type."));
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
