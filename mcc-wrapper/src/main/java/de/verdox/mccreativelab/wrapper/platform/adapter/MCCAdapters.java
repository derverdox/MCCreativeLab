package de.verdox.mccreativelab.wrapper.platform.adapter;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.map.TypeTokenMap;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class MCCAdapters {
    public static final TypeTokenMap<MCCAdapter<?>> TYPE_TO_ADAPTER_MAPPING = new TypeTokenMap<>();

    public static <T> MCCAdapter<T> register(TypeToken<T> apiType) {
        if (TYPE_TO_ADAPTER_MAPPING.contains(apiType))
            throw new IllegalArgumentException("The type " + apiType + " already has an mcc adapter");
        MCCAdapter<T> adapter = new MCCAdapter<>(apiType);
        TYPE_TO_ADAPTER_MAPPING.put(apiType, adapter);
        return adapter;
    }

    public static <T> MCCAdapter<T> getAdapter(TypeToken<T> apiType) {
        Optional<MCCAdapter<?>> optional = TYPE_TO_ADAPTER_MAPPING.get(apiType);
        return optional.map(mccAdapter -> (MCCAdapter<T>) mccAdapter).orElseGet(() -> register(apiType));

    }

    /**
     * Searches for the right adapter and tries to wrap the provided platform object.
     * If the platform object could not be wrapped an {@link NoAdapterFoundException} is thrown.
     *
     * @param apiObjectToUnwrap the platform object
     * @param platformType      the platform type
     * @param apiType           the api type
     * @return the wrapped object
     * @throws NoAdapterFoundException if no adapter was found
     */
    public static <F, T> F unwrap(TypeToken<F> platformType, TypeToken<T> apiType, @Nullable T apiObjectToUnwrap) throws NoAdapterFoundException {
        if (apiObjectToUnwrap == null)
            return null;
        return getAdapter(apiType).unwrap(platformType, apiObjectToUnwrap);
    }

    /**
     * Searches for the right adapter and tries to wrap the provided platform object.
     * If the platform object could not be wrapped an {@link NoAdapterFoundException} is thrown.
     *
     * @param platformObjectToWrap the platform object
     * @return the wrapped object
     * @throws NoAdapterFoundException if no adapter was found
     */
    public static <T, F> T wrap(TypeToken<T> apiType, TypeToken<F> platformType, @Nullable F platformObjectToWrap) throws NoAdapterFoundException {
        if (platformObjectToWrap == null)
            return null;
        return getAdapter(apiType).wrap(platformObjectToWrap);
    }
}
