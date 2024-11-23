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
     * Enum for temperature modifiers
     */
    public enum TemperatureModifier {
        NONE("none"),
        FROZEN("frozen"),;
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
}
