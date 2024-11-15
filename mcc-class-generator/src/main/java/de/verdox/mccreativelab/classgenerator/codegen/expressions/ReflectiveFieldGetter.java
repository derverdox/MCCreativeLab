package de.verdox.mccreativelab.classgenerator.codegen.expressions;

import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.DynamicType;
import de.verdox.mccreativelab.classgenerator.codegen.type.ClassDescription;

import java.lang.reflect.Parameter;

/**
 * Used to build reflection code that reads a field of an object and declares a variable with the respective type.
 *
 * @param variableName The name of the variable the data is put into
 * @param classToReflect the class to do reflection on
 * @param parameter the reflection parameter
 */
public record ReflectiveFieldGetter(String variableName, Class<?> classToReflect, Parameter parameter) implements CodeExpression {
    @Override
    public void write(CodeLineBuilder codeLineBuilder) {

        codeLineBuilder.appendAndNewLine(DynamicType.of(parameter.getParameterizedType(), false)+" "+variableName+";");
        codeLineBuilder.append("if(handle==null) return ");
        codeLineBuilder.append(DynamicType.of(parameter.getParameterizedType(), false).getDefaultValueAsString());
        codeLineBuilder.appendAndNewLine(";");
        codeLineBuilder.appendAndNewLine("try {");
        codeLineBuilder.increaseDepth(+1);
        codeLineBuilder.append("Field nmsField = ").append(new ClassDescription(classToReflect).getTypeName()).append(".class").append(".getDeclaredField(\"").append(parameter.getName()).appendAndNewLine("\");");
        codeLineBuilder.appendAndNewLine("nmsField.setAccessible(true);");
        codeLineBuilder.appendAndNewLine(variableName+" = (" + DynamicType.of(parameter.getParameterizedType(), false) + ") nmsField.get(handle);");
        codeLineBuilder.increaseDepth(-1);
        codeLineBuilder.appendAndNewLine("} catch (Throwable e) { throw new RuntimeException(e); }");
    }
}
