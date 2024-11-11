package de.verdox.mccreativelab.impl.vanilla.registry;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.NoConverterFoundException;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import net.minecraft.core.Holder;

import java.util.Optional;

public class NMSReference<T> extends NMSHandle<Holder<?>> implements MCCReference<T> {
    public static final MCCConverter<Holder, NMSReference> CONVERTER = converter(NMSReference.class, Holder.class, NMSReference::new, holder -> (Holder) holder.getHandle());

    public NMSReference(Holder<?> handle) {
        super(handle);
    }

    @Override
    public Optional<MCCTypedKey<T>> unwrapKey() {
        return MCCPlatform.getInstance().getConversionService().wrap(handle.unwrapKey(), new TypeToken<>() {});
    }

    @Override
    public T get() {
        return (T) MCCPlatform.getInstance().getConversionService().wrap(handle.value());
    }
}
