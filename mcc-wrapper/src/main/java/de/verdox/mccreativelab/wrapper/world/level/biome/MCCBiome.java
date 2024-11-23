package de.verdox.mccreativelab.wrapper.world.level.biome;

public interface MCCBiome {

    Boolean hasPrecipitation();

    float getBaseTemperature();

    MCCBiomeSpecialEffects getSpecialEffects();

    enum MCCTemperatureModifier {
        NONE("none"),
        FROZEN("frozen"),;

        private final String name;

        MCCTemperatureModifier(final String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
