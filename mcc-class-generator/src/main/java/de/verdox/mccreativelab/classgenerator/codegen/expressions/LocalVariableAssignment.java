package de.verdox.mccreativelab.classgenerator.codegen.expressions;

import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;

public record LocalVariableAssignment(String variableName, CodeExpression value) implements CodeExpression {
    public LocalVariableAssignment(String variableName){
        this(variableName, null);
    }
    @Override
    public void write(CodeLineBuilder codeLineBuilder) {
        codeLineBuilder.append("var");
        codeLineBuilder.append(" ");
        codeLineBuilder.append(variableName);
        if(value != null){
            codeLineBuilder.append(" = ");
            value.write(codeLineBuilder);
        }
        codeLineBuilder.appendAndNewLine(";");
    }
}
