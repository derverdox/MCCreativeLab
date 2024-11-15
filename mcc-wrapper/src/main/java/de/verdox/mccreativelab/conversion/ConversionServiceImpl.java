package de.verdox.mccreativelab.conversion;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.*;
import net.minecraft.core.HolderSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.Predicate;

public class ConversionServiceImpl implements ConversionService {
    private final Map<ClassPair, MCCConverter<?, ?>> registeredConverters = new HashMap<>();
    private final Map<Class<?>, Set<ClassPair>> apiTypesToPairs = new HashMap<>();

    private final Map<Class<?>, Class<?>> implClassesToApiClasses = new HashMap<>();
    private final Map<Class<?>, Class<?>> nativeClassesToApiClasses = new HashMap<>();
    private final Map<Class<?>, Class<?>> implClassesToNativeClasses = new HashMap<>();

    private final Set<Class<?>> knownNativeTypes = new HashSet<>();
    private final Set<Class<?>> knownApiTypes = new HashSet<>();

    private final Map<Class<?>, MCCConverter<?, ?>> apiTypesToDirectConverters = new HashMap<>();
    private final Map<Class<?>, MCCConverter<?, ?>> nativeTypesToDirectConverters = new HashMap<>();
    private final Map<Class<?>, Class<?>> directNativeTypesToApiTypes = new HashMap<>();

    private final Map<Class<?>, Class<?>> closestRelativesOfNatives = new HashMap<>();
    private final Map<Class<?>, Class<?>> closestRelativesOfImpls = new HashMap<>();

    private final Map<ClassPair, List<ConversionService>> variants = new HashMap<>();
    private final Map<Class<?>, List<ConversionService>> implClassesToVariants = new HashMap<>();
    private final boolean inner;

    private ConversionServiceImpl(boolean inner) {
        this.inner = inner;
        registerDirectConverter(Optional.class, new OptionalConverter());
        registerDirectConverter(List.class, new CollectionConverter<>(ArrayList::new, List.class));

        registerDirectConverter(Set.class, new CollectionConverter<>(HashSet::new, Set.class));
        registerDirectConverter(Map.class, new MapConverter<>(HashMap::new, Map.class));
        registerDirectConverter(Map.Entry.class, new MapEntryConverter());
    }

    public ConversionServiceImpl() {
        this(false);
    }

    @Override
    public <A, T extends A, F> void registerPlatformType(Class<A> apiType, MCCConverter<F, T> converter) {
        if (apiType.equals(converter.apiImplementationClass()))
            throw new IllegalArgumentException("The provided converter must use an implementation (platform type) of the provided api type " + apiType + ". Else register a direct converter.");
        if(apiTypesToDirectConverters.containsKey(apiType))
            throw new IllegalArgumentException("The api type "+apiType+" is already used by a direct converter that converts "+apiType+" <-> "+apiTypesToDirectConverters.get(apiType).nativeMinecraftType());
        if(nativeTypesToDirectConverters.containsKey(converter.nativeMinecraftType()))
            throw new IllegalArgumentException("The native type "+converter.nativeMinecraftType()+" is already used by a direct converter that converts "+apiType+" <-> "+nativeTypesToDirectConverters.get(converter.nativeMinecraftType()).nativeMinecraftType());

        ClassPair classPair = new ClassPair(apiType, converter.nativeMinecraftType());
        registeredConverters.put(classPair, converter);

        closestRelativesOfImpls.put(converter.apiImplementationClass(), apiType);

        apiTypesToPairs.computeIfAbsent(apiType, aClass -> new HashSet<>()).add(classPair);

        apiTypesToPairs.computeIfAbsent(converter.apiImplementationClass(), aClass -> new HashSet<>()).add(classPair);

        registerMappings(apiType, converter);
        knownNativeTypes.add(converter.nativeMinecraftType());
        knownApiTypes.add(apiType);

        // Clear closestRelatives cache
        closestRelativesOfNatives.clear();
    }

    @Override
    public <A, T extends A, F> void registerCustomPlatformType(Class<A> apiType, MCCConverter<F, T> converter) {
        ClassPair classPairToCompareWithStandard = new ClassPair(apiType, converter.nativeMinecraftType());
        if (registeredConverters.containsKey(classPairToCompareWithStandard)) {

            MCCConverter<?, ?> foundStandardConverter = registeredConverters.get(classPairToCompareWithStandard);
            if (foundStandardConverter.nativeMinecraftType().equals(converter.nativeMinecraftType()) && foundStandardConverter.apiImplementationClass().equals(converter.apiImplementationClass()))
                throw new IllegalArgumentException("The provided custom platform type " + converter.apiImplementationClass() + " converts to " + converter.nativeMinecraftType() + ". However, this is what the standard serializer of " + apiType + " already does! You may want to check that the generic type of your custom MCCSerializer serializes exactly between your custom type and the native minecraft implementation. It should NOT convert between " + converter.apiImplementationClass() + " and " + converter.nativeMinecraftType());
        }

        closestRelativesOfImpls.put(converter.apiImplementationClass(), apiType);

        ConversionService conversionService = new ConversionServiceImpl(true);
        conversionService.registerPlatformType(apiType, converter);

        ClassPair classPair = new ClassPair(apiType, converter.nativeMinecraftType());
        variants.computeIfAbsent(classPair, classPair1 -> new LinkedList<>()).add(conversionService);
        implClassesToVariants.computeIfAbsent(converter.apiImplementationClass(), aClass -> new LinkedList<>()).add(conversionService);
        knownNativeTypes.add(converter.nativeMinecraftType());
        registerMappings(apiType, converter);
        //registerMappings(apiType, converter);
    }

    @Override
    public <A, F> void registerDirectConverter(Class<A> apiType, MCCConverter<F, A> converter) {
        if (!apiType.equals(converter.apiImplementationClass()))
            throw new IllegalArgumentException("You cannot specify a implementation of the " + apiType + " class in a direct converter. A direct converter always converts between an api type and a native type directly without having a custom implementation between the two (platform type).");

        apiTypesToDirectConverters.put(apiType, converter);
        nativeTypesToDirectConverters.put(converter.nativeMinecraftType(), converter);
        directNativeTypesToApiTypes.put(converter.nativeMinecraftType(), apiType);
        knownNativeTypes.add(converter.nativeMinecraftType());
    }

    private <A, T extends A, F> void registerMappings(Class<A> apiType, MCCConverter<F, T> converter) {
        Class<?> implType = converter.apiImplementationClass();
        Class<?> nativeType = converter.nativeMinecraftType();

        if (nativeClassesToApiClasses.containsKey(nativeType)) {
            Class<?> mappedApiType = nativeClassesToApiClasses.get(nativeType);
            if (!mappedApiType.equals(apiType)) {
                throw new IllegalArgumentException("The native type " + nativeType + " has already been mapped to the api type " + mappedApiType + " which is not " + apiType);
            }
        }
        nativeClassesToApiClasses.put(converter.nativeMinecraftType(), apiType);

        if (implClassesToApiClasses.containsKey(implType)) {
            Class<?> mappedApiType = implClassesToApiClasses.get(implType);
            if (!mappedApiType.equals(apiType)) {
                throw new IllegalArgumentException("The impl type " + implType + " has already been mapped to the api type " + mappedApiType + " which is not " + apiType);
            }
        }
        implClassesToApiClasses.put(converter.apiImplementationClass(), apiType);

        if (implClassesToNativeClasses.containsKey(implType)) {
            Class<?> mappedNativeType = implClassesToNativeClasses.get(implType);
            if (!mappedNativeType.equals(nativeType)) {
                throw new IllegalArgumentException("The impl type " + implType + " has already been mapped to the native type " + mappedNativeType + " which is not " + nativeType);
            }
        }
        implClassesToNativeClasses.put(converter.apiImplementationClass(), converter.nativeMinecraftType());
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
        // This condition is only true if platformType = apiType -> direct converter
        if(apiTypesToDirectConverters.containsKey(platformType))
            return apiTypesToDirectConverters.get(platformType).nativeMinecraftType();
        else if(implClassesToNativeClasses.containsKey(platformType))
            return implClassesToNativeClasses.get(platformType);
        else {
            for (Class<?> aClass : apiTypesToDirectConverters.keySet()) {
                if(aClass.isAssignableFrom(platformType)){
                    apiTypesToDirectConverters.put(platformType, apiTypesToDirectConverters.get(aClass));
                    return apiTypesToDirectConverters.get(aClass).nativeMinecraftType();
                }
            }
        }
        return null;
    }

    @Nullable
    @Override
    public <A> Class<?> findAPITypeForNativeClass(Class<A> nativeType) {
        if(directNativeTypesToApiTypes.containsKey(nativeType))
            return directNativeTypesToApiTypes.get(nativeType);

        return nativeClassesToApiClasses.getOrDefault(nativeType, null);
    }

    @Override
    public <A> Class<?> findAPIClassForImplClass(Class<A> implType) {
        if(implClassesToApiClasses.containsKey(implType))
            return implClassesToApiClasses.get(implType);
        else {
            for (Class<?> aClass : apiTypesToDirectConverters.keySet()) {
                if(aClass.isAssignableFrom(implType)){
                    implClassesToApiClasses.put(implType, aClass);
                    return aClass;
                }
            }
        }
        return null;
    }

    @Override
    @NotNull
    public <F, T> T wrap(F objectToWrap, TypeToken<T> apiTypeToConvertTo) {
        if (apiTypesToDirectConverters.containsKey(apiTypeToConvertTo.getRawType())) {
            var converter = (MCCConverter<F, T>) apiTypesToDirectConverters.get(apiTypeToConvertTo.getRawType());
            var directResult = converter.wrap(objectToWrap);
            if (!directResult.result().isDone())
                throw new IllegalArgumentException("Direct converter between " + converter.apiImplementationClass() + " and " + converter.apiImplementationClass() + " creates undone wrap results. This is not allowed for direct converters.");
            return directResult.value();
        }


        Class<?> nativeType = objectToWrap.getClass();
        nativeType = findClosestRelativeNativeType(nativeType);
        ClassPair classPair = new ClassPair(apiTypeToConvertTo.getRawType(), nativeType);
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
                throw new NoConverterFoundException("No converter found to wrap " + objectToWrap + " (" + objectToWrap.getClass() + ") to " + apiTypeToConvertTo);
            }
            return null;
        }


        MCCConverter.ConversionResult<T> result = converter.wrap(objectToWrap);
        if (result.result().isDone()) {
            return result.value();
        }
        // TODO: Auch "objectToWrap.getClass()" in "nativeType" abändern?
        else if (apiTypeToConvertTo.isSupertypeOf(objectToWrap.getClass())) {
            return (T) objectToWrap;
        } else if (inner) {
            return null;
        }
        throw new NoConverterFoundException("No converter found to wrap " + objectToWrap + " (" + objectToWrap.getClass() + ") to " + apiTypeToConvertTo);
    }

    @Override
    public <F, T> F unwrap(T objectToUnwrap, TypeToken<F> nativeTypeToConvertTo) {
        if (nativeTypesToDirectConverters.containsKey(nativeTypeToConvertTo.getRawType())) {
            var converter = (MCCConverter<F, T>) nativeTypesToDirectConverters.get(nativeTypeToConvertTo.getRawType());
            var directResult = converter.unwrap(objectToUnwrap);
            if (!directResult.result().isDone())
                throw new IllegalArgumentException("Direct converter between " + converter.apiImplementationClass() + " and " + converter.apiImplementationClass() + " creates undone unwrap results. This is not allowed for direct converters.");
            return directResult.value();
        }

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
                throw new NoConverterFoundException("No converter found to unwrap " + objectToUnwrap + " (" + objectToUnwrap.getClass() + ") to " + nativeTypeToConvertTo);
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
        throw new NoConverterFoundException("No converter found to unwrap " + objectToUnwrap + " (" + objectToUnwrap.getClass() + ") to " + nativeTypeToConvertTo);
    }

    @Override
    public boolean isNativeTypeKnown(Class<?> nativeType) {
        return knownNativeTypes.contains(nativeType);
    }

    @Override
    public boolean isApiTypeKnown(Class<?> apiType) {
        return knownApiTypes.contains(apiType);
    }

    @Override
    public @Nullable Class<?> findClosestRelativeNativeType(Class<?> nativeType) {
        if (isNativeTypeKnown(nativeType))
            return nativeType;

        if (closestRelativesOfNatives.containsKey(nativeType))
            return closestRelativesOfNatives.get(nativeType);

        Class<?> result = findKnownNativeInHierarchy(nativeType, this::isNativeTypeKnown);
        if (result != null)
            closestRelativesOfNatives.put(nativeType, result);
        return result;
    }

    @Override
    public Class<?> findClosestRelativeApiType(Class<?> implType) {
        Class<?> result = findAPIClassForImplClass(implType);
        if (result != null) {
            return result;
        }

        if (closestRelativesOfImpls.containsKey(implType))
            return closestRelativesOfImpls.get(implType);

        result = findKnownNativeInHierarchy(implType, this::isApiTypeKnown);
        if (result != null)
            closestRelativesOfImpls.put(implType, result);
        return result;
    }

    @Override
    public Set<ClassPair> getAllKnownClassPairs() {
        Set<ClassPair> set = new HashSet<>(registeredConverters.keySet());
        variants.values().stream().flatMap(Collection::stream).forEach(conversionService -> set.addAll(conversionService.getAllKnownClassPairs()));
        return set;
    }

    private Class<?> findKnownNativeInHierarchy(Class<?> type, Predicate<Class<?>> predicate) {
        // Superklassen durchsuchen
        Class<?> superClass = type.getSuperclass();
        if (superClass != null && predicate.test(superClass)) {
            return superClass;
        } else if (superClass != null) {
            Class<?> result = findKnownNativeInHierarchy(superClass, predicate);
            if (result != null) {
                return result;
            }
        }

        // Interfaces durchsuchen
        for (Class<?> iface : type.getInterfaces()) {
            if (predicate.test(iface)) {
                return iface;
            }
            Class<?> result = findKnownNativeInHierarchy(iface, predicate);
            if (result != null) {
                return result;
            }
        }

        // Kein bekannter nativer Typ gefunden
        return null;
    }
}
