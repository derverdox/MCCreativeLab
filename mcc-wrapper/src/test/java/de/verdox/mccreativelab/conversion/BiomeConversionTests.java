package de.verdox.mccreativelab.conversion;

import de.verdox.mccreativelab.TestBase;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.world.level.biome.MCCBiome;
import org.bukkit.block.Biome;
import org.junit.jupiter.api.Test;

public class BiomeConversionTests extends TestBase {

    @Test
    public void testBiomeConversion() {
        Biome minecraftBiome = Biome.BADLANDS;
        MCCBiome mccBiome = MCCPlatform.getInstance().getConversionService().wrap(minecraftBiome, MCCBiome.class);

        System.out.println(mccBiome.getBaseTemperature());
    }
}
