package de.verdox.mccreativelab.wrapper.platform.adapter;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class MCCAdapter<T> {
    private final Class<T> type;
    private final Set<VariantAdapter<Object, T>> variants = new LinkedHashSet<>();
    private final Set<Class<?>> wrappedPlatformTypes = new HashSet<>();
    private WrapperAdapter<Object, T> defaultAdapter;


    public MCCAdapter(Class<T> type) {
        Objects.requireNonNull(type);
        this.type = type;
    }

    public T wrap(Object platformElement) {
        if (defaultAdapter == null)
            throw new IllegalStateException("No standard adapter defined for " + type + " by the platform.");

        for (VariantAdapter<Object, T> variant : variants) {
            if (!variant.getPlatformType().isAssignableFrom(platformElement.getClass()))
                continue;
            if (!variant.isRightAdapterForPlatformElement(platformElement))
                continue;
            return Objects.requireNonNull(variant.platformToApi(platformElement), "A variant adapter cannot return null. (" + variant + ")");
        }

        if (!defaultAdapter.getPlatformType().isAssignableFrom(platformElement.getClass()))
            throw new IllegalArgumentException("Cannot wrap a platform element of type " + platformElement.getClass() + " with this adapter " + defaultAdapter);
        return Objects.requireNonNull(defaultAdapter.platformToApi(platformElement), "The default adapter cannot return null. (" + defaultAdapter + ")");
    }

    public <F> F unwrap(Class<F> type, T wrapper) {
        if (defaultAdapter == null)
            throw new IllegalStateException("No standard adapter defined for " + type + " by the platform.");
        for (VariantAdapter<Object, T> variant : variants) {
            if (!variant.getApiType().isAssignableFrom(wrapper.getClass()))
                continue;
            if (!variant.isRightAdapterForApiElement(wrapper))
                continue;
            return type.cast(Objects.requireNonNull(variant.apiToPlatform(wrapper), "A variant adapter cannot return null. (" + variant + ")"));
        }

        if (!defaultAdapter.getApiType().isAssignableFrom(wrapper.getClass()))
            throw new IllegalArgumentException("Cannot unwrap an api element of type " + wrapper.getClass() + " with this adapter " + defaultAdapter);
        return type.cast(Objects.requireNonNull(defaultAdapter.apiToPlatform(wrapper), "The default adapter cannot return null. (" + defaultAdapter + ")"));
    }

    public Object unwrap(T wrapper) {
        if (defaultAdapter == null)
            throw new IllegalStateException("No standard adapter defined for " + type + " by the platform.");
        for (VariantAdapter<Object, T> variant : variants) {
            if (!variant.getApiType().isAssignableFrom(wrapper.getClass()))
                continue;
            if (!variant.isRightAdapterForApiElement(wrapper))
                continue;
            return Objects.requireNonNull(variant.apiToPlatform(wrapper), "A variant adapter cannot return null. (" + variant + ")");
        }

        if (!defaultAdapter.getApiType().isAssignableFrom(wrapper.getClass()))
            throw new IllegalArgumentException("Cannot unwrap an api element of type " + wrapper.getClass() + " with this adapter " + defaultAdapter);
        return Objects.requireNonNull(defaultAdapter.apiToPlatform(wrapper), "The default adapter cannot return null. (" + defaultAdapter + ")");
    }

    public void setStandardAdapter(WrapperAdapter<?, T> adapter) {
        if (this.defaultAdapter != null)
            throw new UnsupportedOperationException("Standard adapter already defined for " + type + " by the platform.");
        this.defaultAdapter = (WrapperAdapter<Object, T>) adapter;
        wrappedPlatformTypes.add(adapter.getPlatformType());
    }

    public void registerVariantAdapter(VariantAdapter<?, T> adapter) {
        variants.add((VariantAdapter<Object, T>) adapter);
        wrappedPlatformTypes.add(adapter.getPlatformType());
    }

    public Set<Class<?>> getWrappedPlatformTypes() {
        return Set.copyOf(wrappedPlatformTypes);
    }
}
