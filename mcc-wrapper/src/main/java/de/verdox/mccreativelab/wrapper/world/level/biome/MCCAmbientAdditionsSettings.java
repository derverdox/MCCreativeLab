package de.verdox.mccreativelab.wrapper.world.level.biome;

import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import net.kyori.adventure.sound.Sound;

/**
 * Represents the ambient additions of a biome
 *
 * @param sound the sound of the ambient addition
 * @param tickChance the chance of the ambient addition
 */
public record MCCAmbientAdditionsSettings(MCCReference<Sound> sound, double tickChance) {

    /**
     * Gets the sound of the ambient addition
     *
     * @return the sound
     */
    @Override
    public MCCReference<Sound> sound() {
        return sound;
    }

    /**
     * Gets the chance of the ambient addition
     *
     * @return the chance
     */
    @Override
    public double tickChance() {
        return tickChance;
    }
}
