package de.verdox.mccreativelab.wrapper;

import net.kyori.adventure.sound.Sound;

public interface MCCBlockSoundGroup extends MCCWrapped {

    Sound getHitSound();

    Sound getStepSound();

    Sound getBreakSound();

    Sound getPlaceSound();

    Sound getFallSound();

    float volume();

    float pitch();
}
