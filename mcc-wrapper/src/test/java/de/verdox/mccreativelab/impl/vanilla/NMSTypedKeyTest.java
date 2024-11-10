package de.verdox.mccreativelab.impl.vanilla;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSPlatform;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.platform.adapter.MCCAdapters;
import net.kyori.adventure.text.Component;
import net.minecraft.SharedConstants;
import net.minecraft.server.Bootstrap;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NMSTypedKeyTest {
    @Test
    public void testGetNotNull(){
        //Assertions.assertNotNull(MCCBlocks.STONE.get());
    }

    @Test
    public void testConversionCorrect() {
        MCCBlockType mccBlockType = MCCAdapters.getAdapter(new TypeToken<MCCBlockType>() {}).wrap(Blocks.STONE);
        //Assertions.assertEquals(MCCBlocks.STONE.get(), mccBlockType);
        Block block = (Block) MCCAdapters.getAdapter(new TypeToken<MCCBlockType>() {}).unwrap(mccBlockType);
        Assertions.assertEquals(Blocks.STONE, block);
    }

}
