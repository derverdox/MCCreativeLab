package de.verdox.mccreativelab.impl.vanilla.registry;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.ConversionService;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.*;
import net.kyori.adventure.key.Key;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import org.apache.commons.lang3.tuple.Pair;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

public class NMSRegistry<T, R> extends NMSHandle<Registry<R>> implements MCCRegistry<T> {
    public static final MCCConverter<Registry, NMSRegistry> CONVERTER = converter(NMSRegistry.class, Registry.class, NMSRegistry::new, registry -> (Registry) registry.getHandle());
    private final ConversionService conversionService;

    public NMSRegistry(Registry<R> handle) {
        super(handle);
        conversionService = MCCPlatform.getInstance().getConversionService();
    }

    private Class<R> getNativeTypeOfRegistry() {
        if (handle.getAny().isEmpty())
            return null;
        return (Class<R>) handle.getAny().get().getClass();
    }

    private R unwrap(T value) {
        if (value == null)
            return null;
        return conversionService.unwrap(value, getNativeTypeOfRegistry());
    }

    private T wrap(R value) {
        if (value == null)
            return null;
        return (T) conversionService.wrap(value);
    }

    private ResourceLocation unwrap(Key key) {
        return conversionService.unwrap(key, new TypeToken<>() {
        });
    }

    private Key wrap(ResourceLocation resourceLocation) {
        return conversionService.wrap(resourceLocation, new TypeToken<>() {
        });
    }

    private ResourceKey<R> unwrap(MCCTypedKey<T> reference) {
        return conversionService.unwrap(reference, new TypeToken<>() {
        });
    }

    private MCCReference<T> wrap(ResourceKey<R> resourceKey) {
        return conversionService.wrap(resourceKey, new TypeToken<>() {
        });
    }

    @Override
    public @Nullable Key getKey(T value) {
        return wrap(handle.getKey(unwrap(value)));
    }

    @Override
    public Optional<MCCTypedKey<T>> getTypedKey(T value) {
        return conversionService.wrap(handle.getResourceKey(unwrap(value)), new TypeToken<>() {
        });
    }

    @Override
    public int getId(T value) {
        return handle.getId(unwrap(value));
    }

    @Override
    public @Nullable T get(@Nullable MCCTypedKey<T> key) {
        return wrap(handle.get(unwrap(key)));
    }

    @Override
    public @Nullable T get(@Nullable Key id) {
        return wrap(handle.get(unwrap(id)));
    }

    @Override
    public Optional<MCCReference<T>> getAny() {
        return conversionService.wrap(handle.getAny(), new TypeToken<>() {
        });
    }

    @Override
    public T getOrThrow(MCCTypedKey<T> key) {
        return conversionService.wrap(handle.getOrThrow(unwrap(key)), new TypeToken<>() {
        });
    }

    @Override
    public Set<Key> keySet() {
        return conversionService.wrap(handle.keySet(), new TypeToken<>() {
        });
    }

    @Override
    public Set<Map.Entry<MCCTypedKey<T>, T>> entrySet() {
        return conversionService.wrap(handle.entrySet(), new TypeToken<>() {});
    }

    @Override
    public Set<MCCTypedKey<T>> registryKeySet() {
        return conversionService.wrap(handle.registryKeySet(), new TypeToken<>() {});
    }

    @Override
    public boolean containsKey(Key key) {
        return handle.containsKey(unwrap(key));
    }

    @Override
    public boolean containsKey(MCCTypedKey<T> key) {
        return handle.containsKey(unwrap(key));
    }

    @Override
    public Optional<MCCReference<T>> getReference(int rawId) {
        return conversionService.wrap(handle.getHolder(rawId), new TypeToken<>() {});
    }

    @Override
    public Optional<MCCReference<T>> getReference(Key key) {
        return conversionService.wrap(handle.getHolder(unwrap(key)), new TypeToken<>() {});
    }

    @Override
    public Optional<MCCReference<T>> getReference(MCCTypedKey<T> key) {
        return conversionService.wrap(handle.getHolder(unwrap(key)), new TypeToken<>() {});
    }

    @Override
    public MCCReference<T> wrapAsReference(T value) {
        return conversionService.wrap(handle.wrapAsHolder(unwrap(value)), new TypeToken<>() {});
    }

    @Override
    public Optional<MCCReferenceSet<T>> getTag(MCCTag<T> tag) {
        return conversionService.wrap(handle.getTag(conversionService.unwrap(tag, new TypeToken<>() {})), new TypeToken<>() {});
    }

    @Override
    public MCCReferenceSet<T> getOrCreateTag(MCCTag<T> tag) {
        return conversionService.wrap(handle.getOrCreateTag(conversionService.unwrap(tag, new TypeToken<>() {})), new TypeToken<>() {});
    }

    @Override
    public Stream<MCCTag<T>> getTagNames() {
        return handle.getTagNames().map(rTagKey -> conversionService.wrap(rTagKey, new TypeToken<MCCTag<T>>() {}));
    }

    @Override
    public Stream<Pair<MCCTag<T>, MCCReferenceSet<T>>> getTags() {
        return handle.getTags().map(pair -> Pair.of(conversionService.wrap(pair.getFirst(), new TypeToken<>() {}), conversionService.wrap(pair.getSecond(), new TypeToken<>() {})));
    }
}
