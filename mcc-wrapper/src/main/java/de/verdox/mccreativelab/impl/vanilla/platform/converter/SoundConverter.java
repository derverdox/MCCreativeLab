package de.verdox.mccreativelab.impl.vanilla.platform.converter;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.sound.Sound;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class SoundConverter implements MCCConverter<SoundEvent, Sound> {
    @Override
    public ConversionResult<Sound> wrap(SoundEvent nativeType) {
        Sound sound = Sound.sound()
            .source(Sound.Source.MASTER)
            .type(MCCPlatform.getInstance().getConversionService().wrap(nativeType.getLocation(), new TypeToken<Key>(){}))
            .build();
        return done(sound);
    }

    @Override
    public ConversionResult<SoundEvent> unwrap(Sound platformImplType) {
        Registry<SoundEvent> registry = (Registry<SoundEvent>) BuiltInRegistries.REGISTRY.get(Registries.SOUND_EVENT.location());
        SoundEvent soundEvent = registry.get(MCCPlatform.getInstance().getConversionService().unwrap(platformImplType.name(), new TypeToken<ResourceLocation>(){}));
        return done(soundEvent);
    }

    @Override
    public Class<Sound> apiImplementationClass() {
        return Sound.class;
    }

    @Override
    public Class<SoundEvent> nativeMinecraftType() {
        return SoundEvent.class;
    }
}
