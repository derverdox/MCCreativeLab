package de.verdox.mccreativelab.impl.vanilla.platform.factory;

import de.verdox.mccreativelab.conversion.ConversionService;
import de.verdox.mccreativelab.wrapper.MCCTypedKey;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.platform.adapter.NoAdapterFoundException;
import net.kyori.adventure.key.Key;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An NMS implementation for a NMSTypedKey
 *
 * @param <T> the api type
 */
public class NMSTypedKey<T> implements MCCTypedKey<T> {
    private final Key key;
    private final Key registryKey;
    private Class<T> apiType;

    public NMSTypedKey(Key key, Key registryKey) {
        this.key = key;
        this.registryKey = registryKey;
    }

    public NMSTypedKey(ResourceKey<?> resourceKey) {
        this(Key.key(resourceKey.location().getNamespace(), resourceKey.location().getPath()), Key.key(resourceKey.registry().getNamespace(), resourceKey.registry().getPath()));
    }

    @Override
    public @Nullable T get() {
        try {
            ConversionService conversionService = MCCPlatform.getInstance().getConversionService();
            Object nativeFromRegistries = getNativeElementFromMinecraftRegistries();
            return conversionService.wrap(nativeFromRegistries, getApiType(nativeFromRegistries));
        } catch (NoAdapterFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public ResourceKey<?> asResourceKey() {
        return ResourceKey.create(ResourceKey.createRegistryKey(ResourceLocation.tryBuild(registryKey.namespace(), registryKey.value())), ResourceLocation.tryBuild(key.namespace(), key.value()));
    }

    public Object getNativeElementFromMinecraftRegistries() {
        Registry<?> registry = BuiltInRegistries.REGISTRY.get(ResourceLocation.tryBuild(registryKey.namespace(), registryKey.value()));
        return registry.get(ResourceLocation.tryBuild(key.namespace(), key.value()));
    }

    public Holder<?> getNativeElementFromMinecraftRegistriesAsHolder() {
        Registry<?> registry = BuiltInRegistries.REGISTRY.get(ResourceLocation.tryBuild(registryKey.namespace(), registryKey.value()));
        return registry.getHolder(ResourceLocation.tryBuild(key.namespace(), key.value())).get();
    }

    @Override
    public Key getRegistryKey() {
        return registryKey;
    }

    @Override
    public @NotNull Key key() {
        return key;
    }

    private Class<T> getApiType(Object nativeType) {
        if (this.apiType != null)
            return apiType;
        Class<?> found = MCCPlatform.getInstance().getConversionService().findAPITypeForNativeClass(nativeType.getClass());
        if (found == null)
            found = nativeType.getClass();
        try {
            this.apiType = (Class<T>) found;
            return this.apiType;
        } catch (ClassCastException e) {
            throw new NoAdapterFoundException("There was an error when getting the api type of an NMSTypedKey with Key: " + key + " and RegistryKey: " + registryKey + ". We could not find an API Type for the native class " + nativeType.getClass().getCanonicalName() + ". However the native class itself is not the type we expected. This normally happens if the Platform has not registered any MCCConverters for the native Type " + nativeType.getClass().getCanonicalName(), e);
        }
    };
}
