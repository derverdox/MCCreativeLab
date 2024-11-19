package de.verdox.mccreativelab.classgenerator.codegen.expressions;

import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.type.impl.DynamicType;

public record ConstructorCall(DynamicType typeToInstantiate, CodeExpression... parameterExpressions) implements CodeExpression {
    @Override
    public void write(CodeLineBuilder codeLineBuilder) {
        codeLineBuilder.append("new " + typeToInstantiate.toString() + "(");
        for (int i = 0; i < parameterExpressions.length; i++) {
            parameterExpressions[i].write(codeLineBuilder);
            if (i < parameterExpressions.length - 1)
                codeLineBuilder.append(", ");
        }
        codeLineBuilder.append(")");
    }
}
