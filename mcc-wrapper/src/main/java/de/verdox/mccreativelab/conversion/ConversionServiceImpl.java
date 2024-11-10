package de.verdox.mccreativelab.conversion;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.CollectionConverter;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.conversion.converter.MapConverter;
import de.verdox.mccreativelab.conversion.converter.OptionalConverter;
import de.verdox.mccreativelab.wrapper.platform.adapter.NoAdapterFoundException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

public class ConversionServiceImpl implements ConversionService {
    private final Map<ClassPair, MCCConverter<?, ?>> registeredConverters = new HashMap<>();
    private final Map<Class<?>, Set<ClassPair>> apiTypesToPairs = new HashMap<>();
    private final Map<Class<?>, Set<ClassPair>> platformImplsToPairs = new HashMap<>();

    private final Map<Class<?>, Class<?>> apiClassesToNativeClasses = new HashMap<>();
    private final Map<Class<?>, Class<?>> implClassesToApiClasses = new HashMap<>();
    private final Map<Class<?>, Class<?>> nativeClassesToApiClasses = new HashMap<>();

    private final Map<ClassPair, List<ConversionService>> variants = new HashMap<>();
    private final Map<Class<?>, List<ConversionService>> platformImplsToVariants = new HashMap<>();
    private final boolean inner;

    private ConversionServiceImpl(boolean inner) {
        this.inner = inner;
        registerPlatformType(Optional.class, new OptionalConverter());
        registerPlatformType(List.class, new CollectionConverter<>(ArrayList::new, List.class));
        registerPlatformType(Set.class, new CollectionConverter<>(HashSet::new, Set.class));
        registerPlatformType(Map.class, new MapConverter<>(HashMap::new, Map.class));
    }

    public ConversionServiceImpl() {
        this(false);
    }

    @Override
    public <A, T extends A, F> void registerPlatformType(Class<A> apiType, MCCConverter<F, T> converter) {
        ClassPair classPair = new ClassPair(apiType, converter.nativeMinecraftType());
        registeredConverters.put(classPair, converter);

        apiTypesToPairs.computeIfAbsent(apiType, aClass -> new HashSet<>()).add(classPair);

        apiTypesToPairs.computeIfAbsent(converter.apiImplementationClass(), aClass -> new HashSet<>()).add(classPair);
        // converter
        platformImplsToPairs.computeIfAbsent(converter.apiImplementationClass(), aClass -> new HashSet<>()).add(classPair);

        apiClassesToNativeClasses.put(apiType, converter.nativeMinecraftType());
        nativeClassesToApiClasses.put(converter.nativeMinecraftType(), apiType);
        implClassesToApiClasses.put(converter.apiImplementationClass(), apiType);
    }

    @Override
    public <A, T extends A, F> void registerCustomPlatformType(Class<A> apiType, MCCConverter<F, T> converter) {
        ClassPair classPairToCompareWithStandard = new ClassPair(apiType, converter.nativeMinecraftType());
        if (registeredConverters.containsKey(classPairToCompareWithStandard)) {

            MCCConverter<?, ?> foundStandardConverter = registeredConverters.get(classPairToCompareWithStandard);
            if (foundStandardConverter.nativeMinecraftType().equals(converter.nativeMinecraftType()) && foundStandardConverter.apiImplementationClass().equals(converter.apiImplementationClass()))
                throw new IllegalArgumentException("The provided custom platform type " + converter.apiImplementationClass() + " converts to " + converter.nativeMinecraftType() + ". However, this is what the standard serializer of " + apiType + " already does! You may want to check that the generic type of your custom MCCSerializer serializes exactly between your custom type and the native minecraft implementation. It should NOT convert between " + converter.apiImplementationClass() + " and " + converter.nativeMinecraftType());
        }


        ConversionService conversionService = new ConversionServiceImpl(true);
        conversionService.registerPlatformType(apiType, converter);

        ClassPair classPair = new ClassPair(apiType, converter.nativeMinecraftType());
        variants.computeIfAbsent(classPair, classPair1 -> new LinkedList<>()).add(conversionService);
        platformImplsToVariants.computeIfAbsent(converter.apiImplementationClass(), aClass -> new LinkedList<>()).add(conversionService);
    }

    @Override
    public <A> Set<Class<?>> findAllPlatformTypesForApiType(Class<A> apiType) {
        Set<Class<?>> set = new HashSet<>();
        for (ClassPair classPair : apiTypesToPairs.get(apiType)) {
            set.add(registeredConverters.get(classPair).apiImplementationClass());
        }

        variants.keySet()
            .stream()
            .filter(classPair -> classPair.apiType().equals(apiType))
            .map(variants::get)
            .flatMap(Collection::stream)
            .map(conversionService -> conversionService.findAllPlatformTypesForApiType(apiType))
            .forEach(set::addAll);

        return set;
    }

    @Nullable
    @Override
    public <A> Class<?> findNativeClassForPlatformType(Class<A> platformType) {
        if (platformImplsToPairs.containsKey(platformType)) {
            Class<?> foundClass = null;
            for (ClassPair classPair : platformImplsToPairs.get(platformType)) {
                foundClass = registeredConverters.get(classPair).nativeMinecraftType();
                if (foundClass != null)
                    return foundClass;
            }
        }

        if (platformImplsToVariants.containsKey(platformType)) {
            return platformImplsToVariants.get(platformType).stream().map(conversionService -> conversionService.findNativeClassForPlatformType(platformType)).filter(Objects::nonNull).findAny().orElse(null);
        }
        return null;
    }

    @Nullable
    @Override
    public <A> Class<?> findAPITypeForNativeClass(Class<A> nativeType) {
        if(nativeClassesToApiClasses.containsKey(nativeType))
            return nativeClassesToApiClasses.get(nativeType);

        return variants.keySet().stream().filter(classPair -> classPair.nativeType().equals(nativeType)).map(ClassPair::apiType).findAny().orElse(null);
    }

    @Override
    public <A> Class<?> findAPIClassForImplClass(Class<A> implType) {
        if(implClassesToApiClasses.containsKey(implType))
            return implClassesToApiClasses.get(implType);
        if(platformImplsToVariants.containsKey(implType))
            return platformImplsToVariants.get(implType).stream().map(conversionService -> conversionService.findAPIClassForImplClass(implType)).filter(Objects::nonNull).findAny().orElse(null);
        return null;
    }

    @Override
    @NotNull
    public <F, T> T wrap(F objectToWrap, TypeToken<T> apiTypeToConvertTo) {
        ClassPair classPair = new ClassPair(apiTypeToConvertTo.getRawType(), objectToWrap.getClass());
        if (variants.containsKey(classPair)) {
            for (ConversionService conversionService : variants.get(classPair)) {
                T result = conversionService.wrap(objectToWrap, apiTypeToConvertTo);
                if (result != null)
                    return result;
            }
        }

        MCCConverter<F, T> converter = (MCCConverter<F, T>) registeredConverters.getOrDefault(classPair, null);
        if (converter == null) {
            if (!inner) {
                throw new NoAdapterFoundException();
            }
            return null;
        }


        MCCConverter.ConversionResult<T> result = converter.wrap(objectToWrap);
        if (result.result().isDone())
            return result.value();
        else if (apiTypeToConvertTo.isSupertypeOf(objectToWrap.getClass()))
            return (T) objectToWrap;
        else if (inner)
            return null;
        throw new NoAdapterFoundException();
    }

    @Override
    public <F, T> F unwrap(T objectToUnwrap, TypeToken<F> nativeTypeToConvertTo) {
        Class<?> apiClass = findAPIClassForImplClass(objectToUnwrap.getClass());
        ClassPair classPair = new ClassPair(apiClass, nativeTypeToConvertTo.getRawType());
        if (variants.containsKey(classPair)) {
            for (ConversionService conversionService : variants.get(classPair)) {
                F result = conversionService.unwrap(objectToUnwrap, nativeTypeToConvertTo);
                if (result != null)
                    return result;
            }
        }

        MCCConverter<F, T> converter = (MCCConverter<F, T>) registeredConverters.getOrDefault(classPair, null);
        if (converter == null) {
            if (!inner) {
                throw new NoAdapterFoundException();
            }
            return null;
        }

        MCCConverter.ConversionResult<F> result = converter.unwrap(objectToUnwrap);
        if (result.result().isDone())
            return result.value();
        else if (nativeTypeToConvertTo.isSupertypeOf(objectToUnwrap.getClass()))
            return (F) objectToUnwrap;
        else if (inner)
            return null;
        throw new NoAdapterFoundException();
    }

    private record ClassPair(Class<?> apiType, Class<?> nativeType) {
    }
}
