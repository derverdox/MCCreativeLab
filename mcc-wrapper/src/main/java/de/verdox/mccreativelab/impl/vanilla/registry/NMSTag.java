package de.verdox.mccreativelab.impl.vanilla.registry;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCRegistry;
import de.verdox.mccreativelab.wrapper.registry.MCCTag;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import net.kyori.adventure.key.Key;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import org.jetbrains.annotations.NotNull;

public class NMSTag<T> extends MCCHandle<TagKey<?>> implements MCCTag<T> {
    public static final MCCConverter<TagKey, NMSTag> CONVERTER = converter(NMSTag.class, TagKey.class, NMSTag::new, tag -> (TagKey) tag.getHandle());

    public NMSTag(Key key, Key registryKey) {
        this(TagKey.create(ResourceKey.createRegistryKey(MCCPlatform.getInstance().getConversionService().unwrap(registryKey, ResourceLocation.class)), MCCPlatform.getInstance().getConversionService().unwrap(key, ResourceLocation.class)));
    }

    public NMSTag(TagKey<?> handle) {
        super(handle);
    }

    @Override
    public boolean isFor(MCCTypedKey<? extends MCCRegistry<?>> registryKey) {
        return handle.isFor(MCCPlatform.getInstance().getConversionService().unwrap(registryKey, new TypeToken<>() {
        }));
    }

    @Override
    public MCCTypedKey<? extends MCCRegistry<T>> getRegistryKey() {
        return MCCPlatform.getInstance().getConversionService().wrap(handle.registry(), new TypeToken<>() {
        });
    }

    @Override
    public MCCRegistry<T> getRegistry() {
        return MCCPlatform.getInstance().getConversionService().wrap(BuiltInRegistries.REGISTRY.get(handle.registry().location()), new TypeToken<>() {});
    }

    @Override
    public @NotNull Key key() {
        return MCCPlatform.getInstance().getConversionService().wrap(handle.location(), Key.class);
    }
}
