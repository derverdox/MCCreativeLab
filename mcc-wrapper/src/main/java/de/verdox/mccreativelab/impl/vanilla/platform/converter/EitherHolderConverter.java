package de.verdox.mccreativelab.impl.vanilla.platform.converter;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.factory.NMSTypedKey;
import net.minecraft.world.item.EitherHolder;

import java.util.Optional;

public class EitherHolderConverter implements MCCConverter<EitherHolder, NMSTypedKey> {

    private final ResourceKeyConverter resourceKeyConverter = new ResourceKeyConverter();
    private final HolderConverter holderConverter = new HolderConverter();

    @Override
    public ConversionResult<NMSTypedKey> wrap(EitherHolder platform) {
        return resourceKeyConverter.wrap(platform.key());
    }

    @Override
    public ConversionResult<EitherHolder> unwrap(NMSTypedKey api) {
        return done(new EitherHolder(Optional.of(holderConverter.unwrap(api).value()), resourceKeyConverter.unwrap(api).value()));
    }

    @Override
    public Class<NMSTypedKey> apiImplementationClass() {
        return NMSTypedKey.class;
    }

    @Override
    public Class<EitherHolder> nativeMinecraftType() {
        return EitherHolder.class;
    }
}
