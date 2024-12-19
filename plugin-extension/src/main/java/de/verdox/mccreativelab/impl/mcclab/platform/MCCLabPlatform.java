package de.verdox.mccreativelab.impl.mcclab.platform;

import de.verdox.mccreativelab.impl.mcclab.block.MCCCustomBlockState;
import de.verdox.mccreativelab.impl.mcclab.block.MCCCustomBlockType;
import de.verdox.mccreativelab.impl.mcclab.item.MCCCustomItemStack;
import de.verdox.mccreativelab.impl.mcclab.item.MCCCustomItemType;
import de.verdox.mccreativelab.impl.mcclab.world.chunk.MCCCustomChunk;
import de.verdox.mccreativelab.impl.paper.platform.PaperPlatform;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import de.verdox.mccreativelab.wrapper.world.chunk.MCCChunk;
import org.bukkit.plugin.java.JavaPlugin;

public class MCCLabPlatform extends PaperPlatform {
    public MCCLabPlatform() {
        super();
    }

    @Override
    public void init() {
        super.init();
        getConversionService().registerConverterForNewImplType(MCCBlockType.class, MCCCustomBlockType.CONVERTER);
        getConversionService().registerConverterForNewImplType(MCCBlockState.class, MCCCustomBlockState.CONVERTER);
        getConversionService().registerConverterForNewImplType(MCCChunk.class, MCCCustomChunk.CONVERTER);

        getConversionService().registerConverterForNewImplType(MCCItemType.class, MCCCustomItemType.CONVERTER);
        getConversionService().registerConverterForNewImplType(MCCItemStack.class, MCCCustomItemStack.CONVERTER);
    }
}
