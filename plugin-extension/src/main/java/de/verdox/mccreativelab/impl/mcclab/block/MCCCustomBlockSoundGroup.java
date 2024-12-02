package de.verdox.mccreativelab.impl.mcclab.block;

import de.verdox.mccreativelab.wrapper.block.MCCBlockSoundGroup;
import net.kyori.adventure.sound.Sound;

public record MCCCustomBlockSoundGroup(Sound hitSound, Sound stepSound, Sound breakSound, Sound placeSound,
                                       Sound fallSound) implements MCCBlockSoundGroup {

    @Override
    public float getVolume() {
        return 1;
    }

    @Override
    public float getPitch() {
        return 1;
    }
}
