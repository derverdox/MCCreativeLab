package de.verdox.mccreativelab.wrapper.world.level.biome;

import java.util.Optional;

/**
 * Class representing the special effects of a MCC Biome
 */
public class MCCBiomeSpecialEffects {
    private final int fogColor;
    private final int waterColor;
    private final int waterFogColor;
    private final int skyColor;
    private final Optional<Integer> foliageColorOverride;
    private final Optional<Integer> grassColorOverride;
    private final MCCGrassColorModifier grassColorModifier;

    public MCCBiomeSpecialEffects(
        int fogColor,
        final int waterColor,
        final int waterFogColor,
        final int skyColor,
        Optional<Integer> foliageColor,
        Optional<Integer> grassColor,
        MCCGrassColorModifier grassColorModifier
    ) {
        this.fogColor = fogColor;
        this.waterColor = waterColor;
        this.waterFogColor = waterFogColor;
        this.skyColor = skyColor;
        this.foliageColorOverride = foliageColor;
        this.grassColorOverride = grassColor;
        this.grassColorModifier = grassColorModifier;
    }


    /**
     * Gets the fog color of the biome
     *
     * @return the fog color
     */
    public int getFogColor() {
        return fogColor;
    }

    /**
     * Gets the water color of the biome
     *
     * @return the water color
     */
    public int getWaterColor() {
        return waterColor;
    }

    /**
     * Gets the water fog color of the biome
     *
     * @return the water fog color
     */
    public int getWaterFogColor() {
        return waterFogColor;
    }

    /**
     * Gets the sky color of the biome
     *
     * @return the sky color
     */
    public int getSkyColor() {
        return skyColor;
    }

    /**
     * Gets the grass color modifier of the biome
     *
     * @return the grass color modifier
     */
    public Optional<Integer> getFoliageColorOverride() {
        return foliageColorOverride;
    }

    /**
     * Gets the grass color override of the biome
     *
     * @return the grass color override
     */
    public Optional<Integer> getGrassColorOverride() {
        return grassColorOverride;
    }

    /**
     * Enum for grass color modifiers
     */
    public enum MCCGrassColorModifier {
        NONE("none"),
        DARK_FOREST("dark_forest"),
        SWAMP("swamp"),;

        private final String name;

        MCCGrassColorModifier(String name) {
            this.name = name;
        }

        /**
         * returns the name of the modifier
         *
         * @return the name of the modifier
         */
        public String getName() {
            return name;
        }
    }
}
