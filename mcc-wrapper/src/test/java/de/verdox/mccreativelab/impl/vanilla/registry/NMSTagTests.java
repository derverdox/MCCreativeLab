package de.verdox.mccreativelab.impl.vanilla.registry;

import de.verdox.mccreativelab.TestBase;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import net.kyori.adventure.key.Key;
import net.minecraft.tags.BlockTags;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NMSTagTests extends TestBase {
    @Test
    public void testTagInstantiationWithoutHandleObject() {
        Key elementKey = Key.key("minecraft", "wool");
        Key registryKey = Key.key("minecraft", "block");

        NMSTag<MCCBlockType> nmsTag = new NMSTag<>(elementKey, registryKey);
        Assertions.assertEquals(BlockTags.WOOL, nmsTag.getHandle());
    }
}
