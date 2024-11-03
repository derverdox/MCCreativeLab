import de.verdox.mccreativelab.classgenerator.codegen.DynamicType;
import de.verdox.mccreativelab.classgenerator.codegen.type.ClassDescription;
import model.TestImplClass;
import net.minecraft.world.item.ItemStack;
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
    public void testToStringWithFakeClassRawTypeSwap() throws NoSuchFieldException {
        Type type = TestImplClass.class.getDeclaredField("simpleListWithSwappableGeneric").getGenericType();
        DynamicType listType = DynamicType.of(type, false);
        DynamicType ABCClassType = DynamicType.of(new ClassDescription("de.verdox.test", "ABCClass", null), false);
        DynamicType merged = listType.withRawType(ABCClassType);
        Assertions.assertEquals("ABCClass<ItemStack>", merged.toString());
    }

    @Test
    public void testNestedGenerics() throws NoSuchFieldException {
        Type type = TestImplClass.class.getDeclaredField("tripleGeneric").getGenericType();
        DynamicType tripleGenericType = DynamicType.of(type, false);
        Assertions.assertEquals("Optional<Key>", tripleGenericType.toString());
    }

    //TODO Test ob nach mergen die imports stimmen
    //TODO Testen ob mit vielen Generics toString noch klappt

}
