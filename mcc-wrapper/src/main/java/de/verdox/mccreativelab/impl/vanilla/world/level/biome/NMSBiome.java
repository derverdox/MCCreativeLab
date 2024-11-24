package de.verdox.mccreativelab.impl.vanilla.world.level.biome;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.impl.vanilla.registry.NMSReference;
import de.verdox.mccreativelab.impl.vanilla.world.NMSSound;
import de.verdox.mccreativelab.wrapper.core.MCCBlockPos;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.world.MCCSound;
import de.verdox.mccreativelab.wrapper.world.level.biome.MCCBiome;
import de.verdox.mccreativelab.wrapper.world.level.biome.MCCBiomeSpecialEffects;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSpecialEffects;

import java.util.Optional;

/**
 * Class representing the native Minecraft Biome implementing the MCCBiome interface
 */
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
    public Precipitation getPrecipitationAt(MCCBlockPos pos) {
        return Precipitation.valueOf(getHandle().getPrecipitationAt(new BlockPos(pos.x(), pos.y(), pos.z())).name());
    }

    @Override
    public float getBaseTemperature() {
        return getHandle().getBaseTemperature();
    }


    @Override
    public MCCBiomeSpecialEffects getSpecialEffects() {
        final BiomeSpecialEffects specialEffects = getHandle().getSpecialEffects();
        return new MCCBiomeSpecialEffects(
            specialEffects.getFogColor(),
            specialEffects.getWaterColor(),
            specialEffects.getWaterFogColor(),
            specialEffects.getSkyColor(),
            specialEffects.getFoliageColorOverride(),
            specialEffects.getGrassColorOverride(),
            MCCBiomeSpecialEffects.GrassColorModifier.valueOf(specialEffects.getGrassColorModifier().name())
        );
    }

    @Override
    public TemperatureModifier getTemperatureModifier() {
        final Biome.TemperatureModifier temperatureModifier = getHandle().climateSettings.temperatureModifier();
        return MCCBiome.TemperatureModifier.valueOf(temperatureModifier.name());
    }

    @Override
    public Optional<MCCReference<MCCSound>> getAmbientLoop() {
        Optional<Holder<SoundEvent>> ambientLoop = getHandle().getAmbientLoop();
        return ambientLoop.map(soundEventHolder -> new NMSReference<>(Holder.direct(new NMSSound(soundEventHolder.value()))));
    }
}
