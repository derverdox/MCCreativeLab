package de.verdox.mccreativelab.conversion;

import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.Stream;

public class ConversionCache<V> {
    private final TypeHierarchyMap<List<Class<?>>> apiToImpls = new TypeHierarchyMap<>();
    private final TypeHierarchyMap<List<Class<?>>> nativeToImpls = new TypeHierarchyMap<>();
    private final TypeHierarchyMap<Class<?>> apiToNative = new TypeHierarchyMap<>();

    private final TypeHierarchyMap<V> implToValue = new TypeHierarchyMap<>();

    public <A, T extends A, F> void put(Class<A> apiType, Class<T> implType, Class<F> nativeType, V value) {
        apiToImpls.computeIfAbsent(apiType, aClass -> new LinkedList<>()).addFirst(implType);
        nativeToImpls.computeIfAbsent(nativeType, aClass -> new LinkedList<>()).addFirst(implType);
        apiToNative.put(apiType, nativeType);

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

    Set<Map.Entry<Class<?>, Class<?>>> getApiToNativeMapping(){
        return apiToNative.entrySet();
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
