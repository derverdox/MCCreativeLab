package de.verdox.mccreativelab.impl.vanilla.registry;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.TestBase;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import de.verdox.mccreativelab.wrapper.typed.MCCBlocks;
import net.kyori.adventure.key.Key;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NMSTypedKeyTests extends TestBase {

    @Test
    public void testGet() {
        Key elementKey = Key.key("minecraft", "stone");
        Key registryKey = Key.key("minecraft", "block");

        MCCTypedKey<MCCBlockType> key = MCCPlatform.getInstance().getTypedKeyFactory().getKey(elementKey, registryKey, new TypeToken<>() {
        });
        Assertions.assertEquals(Blocks.STONE, MCCPlatform.getInstance().getConversionService().unwrap(key.get(), Block.class));
    }

    @Test
    public void testKey() {
        Key elementKey = Key.key("minecraft", "stone");
        Key registryKey = Key.key("minecraft", "block");

        MCCTypedKey<MCCBlockType> key = MCCPlatform.getInstance().getTypedKeyFactory().getKey(elementKey, registryKey, new TypeToken<>() {
        });
        Assertions.assertEquals(elementKey, key.key());
    }

    @Test
    public void testRegistryKey() {
        Key elementKey = Key.key("minecraft", "stone");
        Key registryKey = Key.key("minecraft", "block");

        MCCTypedKey<MCCBlockType> key = MCCPlatform.getInstance().getTypedKeyFactory().getKey(elementKey, registryKey, new TypeToken<>() {
        });
        Assertions.assertEquals(registryKey, key.getRegistryKey());
    }
}
