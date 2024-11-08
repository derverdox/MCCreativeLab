package de.verdox.mccreativelab.wrapper.block;

import de.verdox.mccreativelab.wrapper.MCCKeyedWrapper;
import net.kyori.adventure.sound.Sound;

/**
 * The sound group of a block.
 * <p>
 * Take a look at the minecraft block sound groups in the <a href="https://minecraft.wiki/w/Category:Block_sounds">Minecraft Wiki</a>
 */
public interface MCCBlockSoundGroup extends MCCKeyedWrapper {

    /**
     * Get the volume these sounds are played at.
     * <p>
     * Note that this volume does not always represent the actual volume
     * received by the client.
     *
     * @return volume
     */
    float getVolume();

    /**
     * Gets the pitch these sounds are played at.
     * <p>
     * Note that this pitch does not always represent the actual pitch received
     * by the client.
     *
     * @return pitch
     */
    float getPitch();

    /**
     * Returns the Sound when the block is hit by a player
     *
     * @return the sound
     */
    Sound getHitSound();

    /**
     * Returns the sound when an entity steps on this block
     *
     * @return the sound
     */
    Sound getStepSound();

    /**
     * Returns the sound when the block is broken
     *
     * @return the sound
     */
    Sound getBreakSound();

    /**
     * Returns the sound when the block is placed
     *
     * @return the sound
     */
    Sound getPlaceSound();

    /**
     * Returns the sound when the block falls
     *
     * @return the sound
     */
    Sound getFallSound();
}
