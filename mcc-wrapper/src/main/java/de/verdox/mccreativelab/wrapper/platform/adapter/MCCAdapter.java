package de.verdox.mccreativelab.wrapper.platform.adapter;

import com.google.common.reflect.TypeToken;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class MCCAdapter<T> {
    private final TypeToken<T> type;
    private final Set<VariantAdapter<Object, T>> variants = new LinkedHashSet<>();
    private WrapperAdapter<Object, T> defaultAdapter;


    public MCCAdapter(TypeToken<T> type) {
        Objects.requireNonNull(type);
        this.type = type;
    }

    public T wrap(Object platformElement) {
        if (defaultAdapter == null)
            throw new NoAdapterFoundException("No standard adapter defined for " + type + " by the platform.");

        for (VariantAdapter<Object, T> variant : variants) {
            if (!variant.isRightAdapterForPlatformElement(platformElement))
                continue;
            return Objects.requireNonNull(variant.platformToApi(platformElement), "A variant adapter cannot return null. (" + variant + ")");
        }

        return Objects.requireNonNull(defaultAdapter.platformToApi(platformElement), "The default adapter cannot return null. (" + defaultAdapter + ")");
    }

    public <F> F unwrap(TypeToken<F> token, T wrapper) {
        if (defaultAdapter == null)
            throw new NoAdapterFoundException("No standard adapter defined for " + token + " by the platform.");
        for (VariantAdapter<Object, T> variant : variants) {
            if (!variant.isRightAdapterForApiElement(wrapper))
                continue;
            return (F) Objects.requireNonNull(variant.apiToPlatform(wrapper), "A variant adapter cannot return null. (" + variant + ")");
        }

        return (F) Objects.requireNonNull(defaultAdapter.apiToPlatform(wrapper), "The default adapter cannot return null. (" + defaultAdapter + ")");
    }

    public Object unwrap(T wrapper) {
        if (defaultAdapter == null)
            throw new NoAdapterFoundException("No standard adapter defined for " + type + " by the platform.");
        for (VariantAdapter<Object, T> variant : variants) {
            if (!variant.isRightAdapterForApiElement(wrapper))
                continue;
            return Objects.requireNonNull(variant.apiToPlatform(wrapper), "A variant adapter cannot return null. (" + variant + ")");
        }

        return Objects.requireNonNull(defaultAdapter.apiToPlatform(wrapper), "The default adapter cannot return null. (" + defaultAdapter + ")");
    }

    public void setStandardAdapter(WrapperAdapter<?, T> adapter) {
        if (this.defaultAdapter != null)
            throw new UnsupportedOperationException("Standard adapter already defined for " + type + " by the platform.");
        this.defaultAdapter = (WrapperAdapter<Object, T>) adapter;
    }

    public void registerVariantAdapter(VariantAdapter<?, T> adapter) {
        variants.add((VariantAdapter<Object, T>) adapter);
    }
}
