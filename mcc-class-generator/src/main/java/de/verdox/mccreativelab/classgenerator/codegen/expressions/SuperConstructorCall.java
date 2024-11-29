package de.verdox.mccreativelab.classgenerator.codegen.expressions;

import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;

public record SuperConstructorCall(Parameter... parameters) implements CodeExpression {
    @Override
    public void write(CodeLineBuilder codeLineBuilder) {
        if(parameters.length == 0) {
            return;
        }
        codeLineBuilder.append("super");
        codeLineBuilder.appendParametersInBrackets(parameters);
        codeLineBuilder.appendAndNewLine(";");
    }
}
