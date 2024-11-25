package de.verdox.mccreativelab.wrapper.sounds;

import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import net.kyori.adventure.sound.Sound;

/**
 * Represents a Music
 *
 * @param sound the sound of the music
 * @param minDelay the minimum delay of the music
 * @param maxDelay the maximum delay of the music
 * @param replaceCurrentMusic if the music should replace the current music
 */
public record MCCMusic(
    MCCReference<Sound> sound,
    int minDelay,
    int maxDelay,
    boolean replaceCurrentMusic
) {

    /**
     * Gets the sound of the music
     *
     * @return the sound
     */
    @Override
    public MCCReference<Sound> sound() {
        return sound;
    }

    /**
     * Gets the minimum delay of the music
     *
     * @return the minimum delay
     */
    @Override
    public int minDelay() {
        return minDelay;
    }

    /**
     * Gets the maximum delay of the music
     *
     * @return the maximum delay
     */
    @Override
    public int maxDelay() {
        return maxDelay;
    }

    /**
     * Checks if the music should replace the current music
     *
     * @return true if the music should replace the current music
     */
    @Override
    public boolean replaceCurrentMusic() {
        return replaceCurrentMusic;
    }
}
