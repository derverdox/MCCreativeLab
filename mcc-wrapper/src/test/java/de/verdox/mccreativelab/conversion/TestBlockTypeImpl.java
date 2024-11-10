package de.verdox.mccreativelab.conversion;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.block.MCCBlockSoundGroup;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import net.kyori.adventure.key.Key;
import net.minecraft.world.level.block.StonecutterBlock;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class TestBlockTypeImpl extends NMSHandle<StonecutterBlock> implements MCCBlockType {
    public static final MCCConverter<StonecutterBlock, TestBlockTypeImpl> CONVERTER = converter(TestBlockTypeImpl.class, StonecutterBlock.class, TestBlockTypeImpl::new, NMSHandle::getHandle);

    public TestBlockTypeImpl(StonecutterBlock handle) {
        super(handle);
    }

    @Override
    public List<MCCBlockState> getAllBlockStates() {
        return List.of();
    }

    @Override
    public MCCBlockSoundGroup getSoundGroup() {
        return null;
    }

    @Override
    public @NotNull Key key() {
        return null;
    }
}
