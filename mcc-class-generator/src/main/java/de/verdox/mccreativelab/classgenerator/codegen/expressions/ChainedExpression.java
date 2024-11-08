package de.verdox.mccreativelab.classgenerator.codegen.expressions;

import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;

public record ChainedExpression(CodeExpression... expressions) implements CodeExpression{
    @Override
    public void write(CodeLineBuilder codeLineBuilder) {
        for (CodeExpression expression : expressions) {
            expression.write(codeLineBuilder);
        }
    }
}
