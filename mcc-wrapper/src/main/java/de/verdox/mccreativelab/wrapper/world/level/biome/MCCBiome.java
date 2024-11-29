package de.verdox.mccreativelab.wrapper.world.level.biome;

import de.verdox.mccreativelab.wrapper.MCCDataDriven;
import de.verdox.mccreativelab.wrapper.world.MCCBlockPos;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.sounds.MCCMusic;
import net.kyori.adventure.sound.Sound;

import java.util.Optional;

/**
 * Represents a MCC Biome
 */
public interface MCCBiome extends MCCDataDriven {

    /**
     * Checks if the biome has precipitation
     *
     * @return true if the biome has precipitation
     */
    Boolean hasPrecipitation();

    /**
     * Gets the precipitation type of the biome
     *
     * @param pos the position to check the precipitation at
     *
     * @return the precipitation type
     */
    Precipitation getPrecipitationAt(MCCBlockPos pos);

    /**
     * Gets the base temperature of the biome
     *
     * @return the base temperature
     */
    float getBaseTemperature();

    /**
     * Gets the special effects of the biome
     *
     * @return the special effects
     */
    MCCBiomeSpecialEffects getSpecialEffects();

    /**
     * Gets the temperature modifier of the biome
     *
     * @return the temperature modifier
     */
    TemperatureModifier getTemperatureModifier();

    /**
     * Gets the ambient loop of the biome
     * @return the ambient loop
     */
    Optional<MCCReference<Sound>> getAmbientLoop();

    /**
     * Gets the ambient additions of the biome
     * @return the ambient additions
     */
    Optional<MCCAmbientAdditionsSettings> getAmbientAdditions();

    /**
     * Gets the background music of the biome
     * @return the background music
     */
    Optional<MCCMusic> getBackgroundMusic();

    /**
     * Enum for temperature modifiers
     */
    enum TemperatureModifier {
        NONE("none"),
        FROZEN("frozen");
        private final String name;

        TemperatureModifier(final String name) {
            this.name = name;
        }

        /**
         * returns the name of the modifier
         * @return the name of the modifier
         */
        public String getName() {
            return name;
        }
    }

    enum Precipitation {
        NONE("none"),
        RAIN("rain"),
        SNOW("snow");

        private final String name;

        Precipitation(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
