package de.verdox.mccreativelab.impl.vanilla.platform.converter;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.factory.NMSTypedKey;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.EitherHolder;

public class ResourceKeyConverter implements MCCConverter<ResourceKey, NMSTypedKey> {

    @Override
    public ConversionResult<NMSTypedKey> wrap(ResourceKey platform) {
        return done(new NMSTypedKey(platform));
    }

    @Override
    public ConversionResult<ResourceKey> unwrap(NMSTypedKey api) {
        return done(api.asResourceKey());
    }

    @Override
    public Class<NMSTypedKey> apiImplementationClass() {
        return NMSTypedKey.class;
    }

    @Override
    public Class<ResourceKey> nativeMinecraftType() {
        return ResourceKey.class;
    }
}
