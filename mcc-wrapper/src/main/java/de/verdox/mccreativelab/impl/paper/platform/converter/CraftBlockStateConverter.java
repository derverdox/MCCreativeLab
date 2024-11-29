package de.verdox.mccreativelab.impl.paper.platform.converter;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.paper.block.PaperCapturedBlockState;
import de.verdox.mccreativelab.wrapper.block.MCCCapturedBlockState;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import org.bukkit.craftbukkit.block.CraftBlockState;

public class CraftBlockStateConverter implements MCCConverter<CraftBlockState, MCCCapturedBlockState> {
    @Override
    public ConversionResult<MCCCapturedBlockState> wrap(CraftBlockState nativeType) {
        return done(PaperCapturedBlockState.from(nativeType, MCCPlatform.getInstance().getConversionService()));
    }

    @Override
    public ConversionResult<CraftBlockState> unwrap(MCCCapturedBlockState platformImplType) {
        return done((CraftBlockState) PaperCapturedBlockState.from(platformImplType).getBukkitBlockState());
    }

    @Override
    public Class<MCCCapturedBlockState> apiImplementationClass() {
        return MCCCapturedBlockState.class;
    }

    @Override
    public Class<CraftBlockState> nativeMinecraftType() {
        return CraftBlockState.class;
    }
}
