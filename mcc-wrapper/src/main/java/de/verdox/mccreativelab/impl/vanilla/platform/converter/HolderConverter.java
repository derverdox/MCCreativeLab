package de.verdox.mccreativelab.impl.vanilla.platform.converter;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.factory.NMSTypedKey;
import net.kyori.adventure.key.Key;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

public class HolderConverter implements MCCConverter<Holder, NMSTypedKey> {
    @Override
    public ConversionResult<NMSTypedKey> wrap(Holder platform) {
        Holder<?> holder = platform;

        ResourceKey<?> resourceKey = holder.unwrapKey().get();
        ResourceLocation registryKey = resourceKey.registryKey().location();
        ResourceLocation dataKey = resourceKey.location();
        return done(new NMSTypedKey(Key.key(dataKey.getNamespace(), dataKey.getPath()), Key.key(registryKey.getNamespace(), registryKey.getPath())));
    }

    @Override
    public ConversionResult<Holder> unwrap(NMSTypedKey api) {
        return done(api.getNativeElementFromMinecraftRegistriesAsHolder());
    }

    @Override
    public Class<NMSTypedKey> apiImplementationClass() {
        return NMSTypedKey.class;
    }

    @Override
    public Class<Holder> nativeMinecraftType() {
        return Holder.class;
    }
}
