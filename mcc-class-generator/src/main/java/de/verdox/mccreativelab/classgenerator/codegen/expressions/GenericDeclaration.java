package de.verdox.mccreativelab.classgenerator.codegen.expressions;

import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.DynamicType;
import org.jetbrains.annotations.Nullable;

public record GenericDeclaration(String name, @Nullable DynamicType type) implements CodeExpression {
    @Override
    public void write(CodeLineBuilder codeLineBuilder) {
        if (type != null) {
            codeLineBuilder.append("<" + name + " extends " + type + ">");
        } else {
            codeLineBuilder.append("<" + name + ">");
        }
    }
}
