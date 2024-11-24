package de.verdox.mccreativelab.wrapper.world.level.biome;

import de.verdox.mccreativelab.wrapper.core.MCCBlockPos;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.world.MCCSound;

import java.util.Optional;

/**
 * Represents a MCC Biome
 */
public interface MCCBiome {

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

    // TODO: Optional<Holder<SoundEvent>> getAmbientLoop()

    /**
     * Gets the ambient loop of the biome
     * @return the ambient loop
     */
    Optional<MCCReference<MCCSound>> getAmbientLoop();

    // TODO: Optional<AmbientAdditionsSettings> getAmbientAdditions()

    // TODO: Optional<Music> getBackgroundMusic()

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
