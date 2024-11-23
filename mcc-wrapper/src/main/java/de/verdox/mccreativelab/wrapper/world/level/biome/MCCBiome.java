package de.verdox.mccreativelab.wrapper.world.level.biome;

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
     * Gets the base temperature of the biome
     *
     * @return the base temperature
     */
    float getBaseTemperature();

    /**
     * Gets the temperature modifier of the biome
     *
     * @return the temperature modifier
     */
    MCCBiomeSpecialEffects getSpecialEffects();

    /**
     * Enum for temperature modifiers
     */
    enum MCCTemperatureModifier {
        NONE("none"),
        FROZEN("frozen"),;
        private final String name;

        MCCTemperatureModifier(final String name) {
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
}
