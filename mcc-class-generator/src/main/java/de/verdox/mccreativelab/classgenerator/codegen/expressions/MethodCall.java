package de.verdox.mccreativelab.classgenerator.codegen.expressions;

import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;

public record MethodCall(String methodName, CodeExpression... parameterExpressions) implements CodeExpression {
    @Override
    public void write(CodeLineBuilder codeLineBuilder) {
        codeLineBuilder.append(methodName + "(");
        for (int i = 0; i < parameterExpressions.length; i++) {
            parameterExpressions[i].write(codeLineBuilder);
            if (i < parameterExpressions.length - 1)
                codeLineBuilder.append(", ");
        }
        codeLineBuilder.append(")");
    }
}
