package de.verdox.mccreativelab.conversion.converter;

import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;

import java.util.HashMap;
import java.util.Map;

public class MapEntryConverter implements MCCConverter<Map.Entry, Map.Entry> {
    @Override
    public ConversionResult<Map.Entry> wrap(Map.Entry nativeType) {
        Object wrappedKey = MCCPlatform.getInstance().getConversionService().wrap(nativeType.getKey());
        Object wrappedValue = MCCPlatform.getInstance().getConversionService().wrap(nativeType.getValue());
        Map<Object, Object> map = new HashMap<>();
        map.put(wrappedKey, wrappedValue);
        return done(map.entrySet().stream().findAny().orElseThrow());
    }

    @Override
    public ConversionResult<Map.Entry> unwrap(Map.Entry platformImplType) {
        Object unWrappedKey = MCCPlatform.getInstance().getConversionService().unwrap(platformImplType.getKey());
        Object unWrappedValue = MCCPlatform.getInstance().getConversionService().unwrap(platformImplType.getValue());
        Map<Object, Object> map = new HashMap<>();
        map.put(unWrappedKey, unWrappedValue);
        return done(map.entrySet().stream().findAny().orElseThrow());
    }

    @Override
    public Class<Map.Entry> apiImplementationClass() {
        return Map.Entry.class;
    }

    @Override
    public Class<Map.Entry> nativeMinecraftType() {
        return Map.Entry.class;
    }
}
