package de.verdox.mccreativelab.impl.paper.platform.converter;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import org.bukkit.craftbukkit.util.Handleable;

import java.util.function.BiFunction;

/**
 * @param <F> The native minecraft type
 * @param <H> A Bukkit Handle wrapping the native minecraft type
 * @param <T> The MCC Api type to convert to
 */
public class BukkitHandleableConverter<F, H extends Handleable<F>, T> implements MCCConverter<H, T> {

    private final Class<T> apiType;
    private final Class<H> craftBukkitType;
    private final BiFunction<BukkitHandleableConverter<F, H, T>, T, ConversionResult<H>> unwrapFunction;

    public BukkitHandleableConverter(Class<T> apiType, Class<H> craftBukkitType, BiFunction<BukkitHandleableConverter<F, H, T>, T, ConversionResult<H>> unwrapFunction) {
        this.apiType = apiType;
        this.craftBukkitType = craftBukkitType;
        this.unwrapFunction = unwrapFunction;
    }

    @Override
    public ConversionResult<T> wrap(H nativeType) {
        Object wrappedResult = MCCPlatform.getInstance().getConversionService().wrap(nativeType.getHandle());
        try {
            return done(apiImplementationClass().cast(MCCPlatform.getInstance().getConversionService().wrap(nativeType.getHandle())));
        } catch (ClassCastException e) {
            throw new RuntimeException("The BukkitHandleableConverter tried to wrap the native minecraft handle " + nativeType.getHandle() + " (" + nativeType.getHandle().getClass() + ") of the craftbukkit element " + nativeType + " (" + nativeType.getClass() + ") but failed because the converter tries to wrap it to the api type " + apiImplementationClass() + " while the actual type after wrapping the native object is " + wrappedResult + ". ", e);
        }
    }

    @Override
    public ConversionResult<H> unwrap(T platformImplType) {
        return unwrapFunction.apply(this, platformImplType);
    }

    @Override
    public Class<T> apiImplementationClass() {
        return apiType;
    }

    @Override
    public Class<H> nativeMinecraftType() {
        return craftBukkitType;
    }
}
