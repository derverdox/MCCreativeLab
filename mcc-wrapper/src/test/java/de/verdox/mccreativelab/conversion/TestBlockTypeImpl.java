package de.verdox.mccreativelab.conversion;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.block.MCCBlockSoundGroup;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import net.kyori.adventure.key.Key;
import net.minecraft.world.level.block.StonecutterBlock;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TestBlockTypeImpl extends MCCHandle<StonecutterBlock> implements MCCBlockType {
    public static final MCCConverter<StonecutterBlock, TestBlockTypeImpl> CONVERTER = converter(TestBlockTypeImpl.class, StonecutterBlock.class, TestBlockTypeImpl::new, MCCHandle::getHandle);

    public TestBlockTypeImpl(StonecutterBlock handle) {
        super(handle);
    }

    @Override
    public List<MCCBlockState> getAllBlockStates() {
        return List.of();
    }

    @Override
    public MCCBlockState getDefaultState() {
        return null;
    }

    @Override
    public MCCBlockSoundGroup getSoundGroup() {
        return null;
    }

    @Override
    public float getExplosionResistance() {
        return 0;
    }

    @Override
    public float getHardness() {
        return 0;
    }

    @Override
    public float getFriction() {
        return 0;
    }

    @Override
    public float getJumpFactor() {
        return 0;
    }

    @Override
    public float getSpeedFactor() {
        return 0;
    }

    @Override
    public boolean isRandomlyTicking() {
        return false;
    }

    @Override
    public boolean requiresCorrectToolForDrops() {
        return false;
    }

    @Override
    public @NotNull Key key() {
        return null;
    }
}
