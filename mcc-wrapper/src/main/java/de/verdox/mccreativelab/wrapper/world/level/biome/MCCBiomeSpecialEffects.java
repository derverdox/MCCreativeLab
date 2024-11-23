package de.verdox.mccreativelab.wrapper.world.level.biome;

import java.util.Optional;

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


    public int getFogColor() {
        return fogColor;
    }

    public int getWaterColor() {
        return waterColor;
    }

    public int getWaterFogColor() {
        return waterFogColor;
    }

    public int getSkyColor() {
        return skyColor;
    }

    public Optional<Integer> getFoliageColorOverride() {
        return foliageColorOverride;
    }

    public Optional<Integer> getGrassColorOverride() {
        return grassColorOverride;
    }

    public enum MCCGrassColorModifier {
        NONE("none"),
        DARK_FOREST("dark_forest"),
        SWAMP("swamp"),;

        private final String name;

        MCCGrassColorModifier(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
