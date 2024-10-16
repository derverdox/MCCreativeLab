package de.verdox.mccreativelab.wrapper;

import de.verdox.mccreativelab.generator.resourcepack.types.sound.SoundData;
import net.kyori.adventure.audience.Audience;
import org.bukkit.*;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public interface MCCSound extends MCCWrapped {
    static MCCSound of(Sound sound) {
        return new BukkitSound(sound);
    }

    static MCCSound of(net.kyori.adventure.sound.Sound sound) {
        return new AdventureSound(sound);
    }

    static MCCSound of(SoundData soundData) {
        return new CustomSound(soundData);
    }

    default void play(Audience audience, net.kyori.adventure.sound.Sound.Source source, float volume, float pitch) {
        net.kyori.adventure.sound.Sound sound = net.kyori.adventure.sound.Sound.sound(getKey(), source, volume, pitch);
        audience.playSound(sound);
    }

    default void play(Location location, net.kyori.adventure.sound.Sound.Source source, float volume, float pitch) {
        net.kyori.adventure.sound.Sound sound = net.kyori.adventure.sound.Sound.sound(getKey(), source, volume, pitch);
        location.getWorld().playSound(sound, location.getX(), location.getY(), location.getZ());
    }

    default void play(Audience audience, SoundCategory soundCategory, float volume, float pitch) {
        play(audience, soundCategory.soundSource(), volume, pitch);
    }

    default void play(Location location, SoundCategory soundCategory, float volume, float pitch) {
        play(location, soundCategory.soundSource(), volume, pitch);
    }

    class BukkitSound extends MCCWrapped.Impl<Sound> implements MCCSound {
        protected BukkitSound(Sound handle) {
            super(handle);
        }

        @Override
        public @NotNull NamespacedKey getKey() {
            return Objects.requireNonNull(Registry.SOUNDS.getKey(getHandle()));
        }
    }

    class AdventureSound extends MCCWrapped.Impl<net.kyori.adventure.sound.Sound> implements MCCSound {
        protected AdventureSound(net.kyori.adventure.sound.Sound handle) {
            super(handle);
        }

        @Override
        public @NotNull NamespacedKey getKey() {
            return new NamespacedKey(getHandle().name().namespace(), getHandle().name().key().value());
        }
    }

    class CustomSound extends MCCWrapped.Impl<SoundData> implements MCCSound {
        protected CustomSound(SoundData handle) {
            super(handle);
        }

        @Override
        public @NotNull NamespacedKey getKey() {
            return getHandle().getKey();
        }
    }
}
