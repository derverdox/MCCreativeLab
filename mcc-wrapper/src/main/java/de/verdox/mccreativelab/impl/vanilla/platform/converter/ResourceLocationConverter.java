package de.verdox.mccreativelab.impl.vanilla.platform.converter;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import net.kyori.adventure.key.Key;
import net.minecraft.resources.ResourceLocation;

public class ResourceLocationConverter implements MCCConverter<ResourceLocation, Key> {
    @Override
    public ConversionResult<Key> wrap(ResourceLocation nativeType) {
        return done(Key.key(nativeType.getNamespace(), nativeType.getPath()));
    }

    @Override
    public ConversionResult<ResourceLocation> unwrap(Key platformImplType) {
        return done(ResourceLocation.tryBuild(platformImplType.namespace(), platformImplType.value()));
    }

    @Override
    public Class<Key> apiImplementationClass() {
        return Key.class;
    }

    @Override
    public Class<ResourceLocation> nativeMinecraftType() {
        return ResourceLocation.class;
    }
}
