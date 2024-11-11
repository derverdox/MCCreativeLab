package de.verdox.mccreativelab.impl.vanilla.registry;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.ConversionService;
import de.verdox.mccreativelab.conversion.NoConverterFoundException;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.kyori.adventure.key.Key;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

/**
 * An NMS implementation for a NMSTypedKey
 *
 * @param <T> the api type
 */
public class NMSTypedKey<T> extends NMSHandle<ResourceKey<?>> implements MCCTypedKey<T> {
    public static final MCCConverter<ResourceKey, NMSTypedKey> CONVERTER = converter(NMSTypedKey.class, ResourceKey.class, NMSTypedKey::new, resourceKey -> (ResourceKey) resourceKey.getHandle());

    public NMSTypedKey(Key key, Key registryKey) {
        this(ResourceKey.create(ResourceKey.createRegistryKey(MCCPlatform.getInstance().getConversionService().unwrap(registryKey, ResourceLocation.class)), MCCPlatform.getInstance().getConversionService().unwrap(key, ResourceLocation.class)));
    }

    public NMSTypedKey(ResourceKey<?> resourceKey) {
        super(resourceKey);
    }

    @Override
    public @Nullable T get() {
        ConversionService conversionService = MCCPlatform.getInstance().getConversionService();
        Object nativeFromRegistries = getNativeElementFromMinecraftRegistries();
        return (T) conversionService.wrap(nativeFromRegistries);
    }

    public Object getNativeElementFromMinecraftRegistries() {
        Registry<?> registry;
        if (handle.registry().getPath().equals(Registries.ROOT_REGISTRY_NAME.getPath()))
            registry = BuiltInRegistries.REGISTRY;
        else
            registry = BuiltInRegistries.REGISTRY.get(handle.registry());
        Objects.requireNonNull(registry, "The registry with the key " + handle.registry() + " could not be found");
        return registry.get(handle.location());
    }

    @Override
    public Key getRegistryKey() {
        return MCCPlatform.getInstance().getConversionService().wrap(handle.registry(), Key.class);
    }

    @Override
    public MCCReference<T> getAsReference() {
        Registry registry = BuiltInRegistries.REGISTRY.get(handle.registry());
        registry.getHolderOrThrow(handle);
        var optional = registry.getHolder(handle.location());
        if (optional.isEmpty())
            throw new IllegalStateException("Could not get " + handle + " as reference.");
        return MCCPlatform.getInstance().getConversionService().wrap(optional.get(), new TypeToken<>() {
        });
    }

    @Override
    public @NotNull Key key() {
        return MCCPlatform.getInstance().getConversionService().wrap(handle.location(), Key.class);
    }
}
