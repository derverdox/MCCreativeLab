package de.verdox.mccreativelab.classgenerator.codegen.expressions;

import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;

public record EnumEntry(String name, CodeExpression... parameterValues) implements CodeExpression{
    @Override
    public void write(CodeLineBuilder codeLineBuilder) {
        codeLineBuilder.increaseDepth(1);
        codeLineBuilder.append(name);
        if(parameterValues.length != 0){
            codeLineBuilder.append("(");
            for (int i = 0; i < parameterValues.length; i++) {
                CodeExpression value = parameterValues[i];
                value.write(codeLineBuilder);
                if(i < parameterValues.length - 1)
                    codeLineBuilder.append(", ");
            }
            codeLineBuilder.append(")");
        }
        codeLineBuilder.appendAndNewLine(",");
        codeLineBuilder.increaseDepth(-1);
    }
}
