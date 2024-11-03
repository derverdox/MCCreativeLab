package de.verdox.mccreativelab.classgenerator.codegen.expressions;

import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;

public record StringExpression(String expression) implements CodeExpression {
    @Override
    public void write(CodeLineBuilder codeLineBuilder) {
        codeLineBuilder.append(expression);
    }
}
