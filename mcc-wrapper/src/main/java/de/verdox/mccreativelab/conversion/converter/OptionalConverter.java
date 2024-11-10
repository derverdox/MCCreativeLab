package de.verdox.mccreativelab.conversion.converter;

import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Supplier;

public class OptionalConverter implements MCCConverter<Optional, Optional> {

    @Override
    public ConversionResult<Optional> wrap(Optional nativeType) {
        if (nativeType.isEmpty())
            return done(Optional.empty());

        Object o = nativeType.get();
        return done(Optional.of(MCCPlatform.getInstance().getConversionService().wrap(o)));
    }

    @Override
    public ConversionResult<Optional> unwrap(Optional platformImplType) {
        if (platformImplType.isEmpty())
            return done(Optional.empty());

        Object o = platformImplType.get();
        return done(Optional.of(MCCPlatform.getInstance().getConversionService().unwrap(o)));
    }

    @Override
    public Class<Optional> apiImplementationClass() {
        return Optional.class;
    }

    @Override
    public Class<Optional> nativeMinecraftType() {
        return Optional.class;
    }
}
