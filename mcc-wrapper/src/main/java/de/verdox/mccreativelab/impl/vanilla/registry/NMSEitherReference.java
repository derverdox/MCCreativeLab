package de.verdox.mccreativelab.impl.vanilla.registry;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCEitherReference;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import net.minecraft.world.item.EitherHolder;

import java.util.Optional;

public class NMSEitherReference<T> extends MCCHandle<EitherHolder<?>> implements MCCEitherReference<T> {
    public static final MCCConverter<EitherHolder, NMSEitherReference> CONVERTER = converter(NMSEitherReference.class, EitherHolder.class, NMSEitherReference::new, holder -> (EitherHolder) holder.getHandle());

    public NMSEitherReference(EitherHolder<?> handle) {
        super(handle);
    }

    @Override
    public Optional<MCCReference<T>> getReference() {
        return MCCPlatform.getInstance().getConversionService().wrap(handle.holder(), new TypeToken<>() {});
    }

    @Override
    public MCCTypedKey<T> getTypedKey() {
        return MCCPlatform.getInstance().getConversionService().wrap(handle.key(), new TypeToken<>() {});
    }
}
