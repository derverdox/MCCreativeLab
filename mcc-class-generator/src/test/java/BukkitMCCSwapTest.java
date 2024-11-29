import de.verdox.mccreativelab.classgenerator.EventGeneratorFromBukkitPreset;
import de.verdox.mccreativelab.classgenerator.codegen.type.impl.DynamicType;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSPlatform;
import de.verdox.mccreativelab.wrapper.block.MCCBlock;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import org.bukkit.block.Block;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BukkitMCCSwapTest {

    @BeforeAll
    public static void init(){
        MCCPlatform.INSTANCE.setup(new NMSPlatform(), MCCPlatform::init);
    }

    @Test
    public void testSimple(){
        DynamicType swapped = EventGeneratorFromBukkitPreset.swapBukkitWithMCC(DynamicType.of(Block.class));
        Assertions.assertEquals(DynamicType.of(MCCBlock.class), swapped);
    }

    @Test
    public void testList(){
        DynamicType swapped = EventGeneratorFromBukkitPreset.swapBukkitWithMCC(DynamicType.of(List.class).withAddedGeneric(DynamicType.of(Block.class)));
        Assertions.assertEquals(DynamicType.of(List.class).withAddedGeneric(DynamicType.of(MCCBlock.class)), swapped);
    }

}
