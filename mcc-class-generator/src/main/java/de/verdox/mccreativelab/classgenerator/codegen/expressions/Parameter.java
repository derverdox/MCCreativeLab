package de.verdox.mccreativelab.classgenerator.codegen.expressions;

import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.type.impl.DynamicType;

public record Parameter(DynamicType type, String name) implements CodeExpression {
    @Override
    public void write(CodeLineBuilder code) {
        code.append(type).append(" ").append(name);
    }
}
