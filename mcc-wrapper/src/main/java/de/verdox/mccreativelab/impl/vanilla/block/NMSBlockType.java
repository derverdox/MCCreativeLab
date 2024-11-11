package de.verdox.mccreativelab.impl.vanilla.block;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.block.MCCBlockSoundGroup;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.kyori.adventure.key.Key;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class NMSBlockType extends NMSHandle<Block> implements MCCBlockType {
    public static final MCCConverter<Block, NMSBlockType> CONVERTER = converter(NMSBlockType.class, Block.class, NMSBlockType::new, NMSHandle::getHandle);

    public NMSBlockType(Block handle) {
        super(handle);
    }

    @Override
    public List<MCCBlockState> getAllBlockStates() {
        return handle.getStateDefinition().getPossibleStates().stream().map(blockState -> MCCPlatform.getInstance().getConversionService().wrap(blockState, new TypeToken<MCCBlockState>() {})).toList();
    }

    @Override
    public MCCBlockSoundGroup getSoundGroup() {
        return null;
    }

    @Override
    public @NotNull Key key() {
        ResourceLocation resourceLocation = BuiltInRegistries.BLOCK.getKey(handle);
        return Key.key(resourceLocation.getNamespace(), resourceLocation.getPath());
    }
}
