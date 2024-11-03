package de.verdox.mccreativelab.classgenerator.codegen.expressions;

import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.DynamicType;

public record Field(String modifier, DynamicType type, String fieldName, String initValue,
                    DynamicType... genericTypes) implements CodeExpression{
    @Override
    public void write(CodeLineBuilder code) {
        code.increaseDepth(1);
        code.append(modifier).append(" ").append(type).append(" ").append(fieldName);
        if (genericTypes.length != 0) {
            code.append("<");
            for (int i = 0; i < genericTypes.length; i++) {
                DynamicType genericType = genericTypes[i];
                code.append(genericType);
                if (i < genericTypes.length - 1)
                    code.append(",");
            }
            code.append(">");
        }
        if (initValue != null && !initValue.isEmpty()) {
            code.append(" ").append(" = ").append(initValue);
        }
        code.append(";\n");
        code.increaseDepth(-1);
    }
}
