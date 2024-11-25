package de.verdox.mccreativelab.wrapper.world.level.biome;

import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.world.MCCSound;

/**
 * Represents the ambient additions of a biome
 *
 * @param sound the sound of the ambient addition
 * @param tickChance the chance of the ambient addition
 */
public record MCCAmbientAdditionsSettings(MCCReference<MCCSound> sound, double tickChance) {

    /**
     * Gets the sound of the ambient addition
     *
     * @return the sound
     */
    @Override
    public MCCReference<MCCSound> sound() {
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
