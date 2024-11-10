package de.verdox.mccreativelab.conversion.converter;

import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;

import java.util.Collection;
import java.util.Map;
import java.util.function.Supplier;

public class MapConverter<M extends Map, T extends M> implements MCCConverter<M, M> {
    private final Supplier<T> constructor;
    private final Class<M> mapType;

    public MapConverter(Supplier<T> constructor, Class<M> mapType) {
        this.constructor = constructor;
        this.mapType = mapType;
    }

    @Override
    public ConversionResult<M> wrap(M nativeType) {
        M newMap = constructor.get();
        nativeType.forEach((nativeKey, nativeValue) -> {
            Object wrappedKey = MCCPlatform.getInstance().getConversionService().wrap(nativeKey);
            Object wrappedValue = MCCPlatform.getInstance().getConversionService().wrap(nativeValue);
            newMap.put(wrappedKey, wrappedValue);
        });
        return done(newMap);
    }

    @Override
    public ConversionResult<M> unwrap(M platformImplType) {
        M newMap = constructor.get();
        platformImplType.forEach((wrappedKey, wrappedValue) -> {
            Object nativeKey = MCCPlatform.getInstance().getConversionService().unwrap(wrappedKey);
            Object nativeValue = MCCPlatform.getInstance().getConversionService().unwrap(wrappedValue);
            newMap.put(nativeKey, nativeValue);
        });
        return done(newMap);
    }

    @Override
    public Class<M> apiImplementationClass() {
        return mapType;
    }

    @Override
    public Class<M> nativeMinecraftType() {
        return mapType;
    }
}
