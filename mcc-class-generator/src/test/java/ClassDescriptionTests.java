import de.verdox.mccreativelab.classgenerator.codegen.type.ClassDescription;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class ClassDescriptionTests {


    @Test
    public void testClassNameSimple(){
        ClassDescription classDescription = new ClassDescription(String.class);
        Assertions.assertEquals("String", classDescription.getClassName());
    }

    @Test
    public void testClassNameNested(){
        ClassDescription classDescription = new ClassDescription(Map.Entry.class);
        Assertions.assertEquals("Entry", classDescription.getClassName());
    }

    @Test
    public void testTypeNameSimple(){
        ClassDescription classDescription = new ClassDescription(String.class);
        Assertions.assertEquals("String", classDescription.getTypeName());
    }

    @Test
    public void testTypeNameNested(){
        ClassDescription classDescription = new ClassDescription(Map.Entry.class);
        Assertions.assertEquals("Map.Entry", classDescription.getTypeName());
    }
}
