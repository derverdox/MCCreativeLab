package de.verdox.mccreativelab.wrapper;

import de.verdox.mccreativelab.world.block.FakeBlock;
import org.apache.commons.lang3.NotImplementedException;
import org.bukkit.NamespacedKey;
import org.bukkit.SoundGroup;
import org.jetbrains.annotations.NotNull;

public interface MCCBlockSoundGroup extends MCCWrapped {
    static MCCBlockSoundGroup of(SoundGroup soundGroup) {
        return new Vanilla(soundGroup);
    }

    static MCCBlockSoundGroup of(FakeBlock.FakeBlockSoundGroup fakeBlockSoundGroup){
        return new FakeSoundGroup(fakeBlockSoundGroup);
    }

    MCCSound getHitSound();

    MCCSound getStepSound();

    MCCSound getBreakSound();

    MCCSound getPlaceSound();

    MCCSound getFallSound();

    float volume();

    float pitch();

    class Vanilla extends MCCWrapped.Impl<SoundGroup> implements MCCBlockSoundGroup {
        protected Vanilla(SoundGroup handle) {
            super(handle);
        }

        @Override
        public @NotNull NamespacedKey getKey() {
            throw new NotImplementedException("Vanilla block sound groups don't have a key");
        }

        @Override
        public MCCSound getHitSound() {
            return MCCSound.of(getHandle().getHitSound());
        }

        @Override
        public MCCSound getStepSound() {
            return MCCSound.of(getHandle().getStepSound());
        }

        @Override
        public MCCSound getBreakSound() {
            return MCCSound.of(getHandle().getBreakSound());
        }

        @Override
        public MCCSound getPlaceSound() {
            return MCCSound.of(getHandle().getPlaceSound());
        }

        @Override
        public MCCSound getFallSound() {
            return MCCSound.of(getHandle().getFallSound());
        }

        @Override
        public float volume() {
            return getHandle().getVolume();
        }

        @Override
        public float pitch() {
            return getHandle().getPitch();
        }
    }

    class FakeSoundGroup extends MCCWrapped.Impl<FakeBlock.FakeBlockSoundGroup> implements MCCBlockSoundGroup {

        protected FakeSoundGroup(FakeBlock.FakeBlockSoundGroup handle) {
            super(handle);
        }

        @Override
        public @NotNull NamespacedKey getKey() {
            return getHandle().getKey();
        }

        @Override
        public MCCSound getHitSound() {
            return MCCSound.of(getHandle().getHitSound());
        }

        @Override
        public MCCSound getStepSound() {
            return MCCSound.of(getHandle().getStepSound());
        }

        @Override
        public MCCSound getBreakSound() {
            return MCCSound.of(getHandle().getBreakSound());
        }

        @Override
        public MCCSound getPlaceSound() {
            return MCCSound.of(getHandle().getPlaceSound());
        }

        @Override
        public MCCSound getFallSound() {
            return MCCSound.of(getHandle().getFallSound());
        }

        @Override
        public float volume() {
            return 1;
        }

        @Override
        public float pitch() {
            return 0.5f;
        }
    }
}
