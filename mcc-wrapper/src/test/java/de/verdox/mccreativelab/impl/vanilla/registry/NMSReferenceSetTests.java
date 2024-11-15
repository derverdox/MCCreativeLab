package de.verdox.mccreativelab.impl.vanilla.registry;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.TestBase;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCReferenceSet;
import de.verdox.mccreativelab.wrapper.registry.MCCTag;
import de.verdox.mccreativelab.wrapper.typed.MCCRegistries;
import net.kyori.adventure.key.Key;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NMSReferenceSetTests extends TestBase {
    @Test
    public void testGet() {
        Key elementKey = Key.key("minecraft", "stone_blocks");
        Key registryKey = Key.key("minecraft", "block");

        MCCTag<MCCBlockType> tag = MCCPlatform.getInstance().getTypedKeyFactory().createTag(elementKey, registryKey, new TypeToken<>() {});
        MCCReferenceSet<MCCBlockType> referenceSet = MCCRegistries.BLOCK_REGISTRY.get().getOrCreateTag(tag);

        HolderSet<Block> holderSet = BuiltInRegistries.BLOCK.getTag(MCCPlatform.getInstance().getConversionService().unwrap(tag, new TypeToken<>() {})).get();
        MCCReferenceSet<MCCBlockType> references = new NMSReferenceSet<>(holderSet);

        Assertions.assertEquals(holderSet, MCCPlatform.getInstance().getConversionService().unwrap(references, HolderSet.class));
    }
}
