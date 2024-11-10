package de.verdox.mccreativelab.impl.vanilla.block;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.kyori.adventure.key.Key;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class NMSBlockState extends NMSHandle<BlockState> implements MCCBlockState {
    public static final MCCConverter<BlockState, NMSBlockState> CONVERTER = converter(NMSBlockState.class, BlockState.class, NMSBlockState::new, NMSHandle::getHandle);

    public NMSBlockState(BlockState handle) {
        super(handle);
    }

    @Override
    public @NotNull MCCBlockType getBlockType() {
        return MCCPlatform.getInstance().getConversionService().wrap(handle.getBlock(), new TypeToken<>() {});
    }

    @Override
    public String toBlockDataString() {
        return handle.toString();
    }

    @Override
    public @NotNull Key key() {
        return getBlockType().key();
    }
}
