package de.verdox.mccreativelab.impl.vanilla.world.level.biome;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.block.NMSBlockState;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.world.level.biome.MCCBiome;
import de.verdox.mccreativelab.wrapper.world.level.biome.MCCBiomeSpecialEffects;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSpecialEffects;

public class NMSBiome extends NMSHandle<Biome> implements MCCBiome {
    public static final MCCConverter<Biome, NMSBiome> CONVERTER = converter(NMSBiome.class, Biome.class, NMSBiome::new, NMSHandle::getHandle);

    public NMSBiome(Biome handle) {
        super(handle);
    }

    @Override
    public Boolean hasPrecipitation() {
        return getHandle().hasPrecipitation();
    }

    @Override
    public float getBaseTemperature() {
        return getHandle().getBaseTemperature();
    }


    @Override
    public MCCBiomeSpecialEffects getSpecialEffects() {
        BiomeSpecialEffects specialEffects = getHandle().getSpecialEffects();
        return new MCCBiomeSpecialEffects(
            specialEffects.getFogColor(),
            specialEffects.getWaterColor(),
            specialEffects.getWaterFogColor(),
            specialEffects.getSkyColor(),
            specialEffects.getFoliageColorOverride(),
            specialEffects.getGrassColorOverride(),
            MCCBiomeSpecialEffects.MCCGrassColorModifier.valueOf(specialEffects.getGrassColorModifier().name())
        );
    }
}
