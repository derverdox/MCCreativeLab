package de.verdox.mccreativelab.conversion;

import de.verdox.mccreativelab.conversion.converter.CollectionConverter;
import de.verdox.mccreativelab.conversion.converter.MapConverter;
import de.verdox.mccreativelab.conversion.converter.MapEntryConverter;
import de.verdox.mccreativelab.conversion.converter.OptionalConverter;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.Stream;

public class ConversionCache<V> {
    private final TypeHierarchyMap<List<Class<?>>> apiToImpls = new TypeHierarchyMap<>();
    private final TypeHierarchyMap<List<Class<?>>> nativeToImpls = new TypeHierarchyMap<>();

    private final TypeHierarchyMap<V> implToValue = new TypeHierarchyMap<>();

    public <A, T extends A, F> void put(Class<A> apiType, Class<T> implType, Class<F> nativeType, V value) {
        apiToImpls.computeIfAbsent(apiType, aClass -> new LinkedList<>()).addFirst(implType);
        nativeToImpls.computeIfAbsent(nativeType, aClass -> new LinkedList<>()).addFirst(implType);

        implToValue.put(implType, value);
    }

    public boolean knowsApiType(Class<?> apiType){
        return apiToImpls.containsKey(apiType);
    }

    public boolean knowsNativeType(Class<?> nativeType){
        return nativeToImpls.containsKey(nativeType);
    }

    @NotNull
    public Stream<V> getAllVariantsForNativeType(Object nativeType) {
        List<Class<?>> foundImplTypes = nativeToImpls.get(nativeType.getClass());
        if(foundImplTypes == null) {
            return Stream.of();
        }

        return foundImplTypes.stream().map(implToValue::get);
    }

    @NotNull
    public Stream<V> getAllVariantsForApiType(Object apiObject) {
        List<Class<?>> foundImplTypes = apiToImpls.get(apiObject.getClass());
        if(foundImplTypes == null) {
            return Stream.of();
        }
        return foundImplTypes.stream().map(implToValue::get);
    }

    @Override
    public String toString() {
        return "ConversionCache{" +
            "apiToImpls=" + apiToImpls +
            ", nativeToImpls=" + nativeToImpls +
            ", implToValue=" + implToValue +
            '}';
    }
}
