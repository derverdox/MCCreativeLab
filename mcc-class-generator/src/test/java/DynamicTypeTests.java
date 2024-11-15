import de.verdox.mccreativelab.classgenerator.NMSMapper;
import de.verdox.mccreativelab.classgenerator.codegen.DynamicType;
import de.verdox.mccreativelab.classgenerator.codegen.type.ClassDescription;
import model.TestImplClass;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Type;
import java.util.List;

public class DynamicTypeTests {

    @Test
    public void testRawTypeAttributeSetCorrectly() throws NoSuchFieldException {
        Type type = TestImplClass.class.getDeclaredField("simpleListWithSwappableGeneric").getGenericType();

        DynamicType dynamicType = DynamicType.of(type, false);
        Assertions.assertEquals(List.class, dynamicType.getRawType());
    }

    @Test
    public void testClassDescriptionCorrectIfNotSwapped() throws NoSuchFieldException {
        DynamicType dynamicType = DynamicType.of(Block.class, false);
        Assertions.assertEquals(new ClassDescription(Block.class), dynamicType.getClassDescription());
    }

    @Test
    public void testGenericsSetCorrectly() throws NoSuchFieldException {
        Type type = TestImplClass.class.getDeclaredField("simpleListWithSwappableGeneric").getGenericType();
        DynamicType dynamicType = DynamicType.of(type, false);
        Assertions.assertEquals(ItemStack.class, dynamicType.getGenericTypes().get(0).getRawType());
    }

    @Test
    public void testToString() throws NoSuchFieldException {
        Type type = TestImplClass.class.getDeclaredField("simpleListWithSwappableGeneric").getGenericType();
        DynamicType dynamicType = DynamicType.of(type, false);
        Assertions.assertEquals("List<ItemStack>", dynamicType.toString());
    }

    @Test
    public void testNestedGenerics() throws NoSuchFieldException {
        Type type = TestImplClass.class.getDeclaredField("tripleGeneric").getGenericType();
        DynamicType tripleGenericType = DynamicType.of(type, true);
        Assertions.assertEquals("Optional<Key>", tripleGenericType.toString());
    }

    /**
     * Tests if Generic Type is swapped correctly. The generic type of the type is also swapped
     * @throws NoSuchFieldException
     */
    @Test
    public void testDynamicTypeSwappingGeneric() throws NoSuchFieldException {
        Type type = TestImplClass.class.getDeclaredField("swappableCollection").getGenericType();
        DynamicType swappableCollection = DynamicType.of(type);
        Assertions.assertEquals("List<MCCBlockType>", swappableCollection.toString());
    }

    @Test
    public void testMapperReturnsNullIfNoMappingExists() throws NoSuchFieldException {
        Assertions.assertNull(NMSMapper.getSwap(DynamicType.of(Boolean.class)));
        Assertions.assertFalse(NMSMapper.isSwapped(DynamicType.of(Boolean.class)));
    }

    //TODO Test ob nach mergen die imports stimmen
    //TODO Testen ob mit vielen Generics toString noch klappt

}
