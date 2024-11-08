package de.verdox.mccreativelab.classgenerator.codegen.expressions;

import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;

public interface CodeExpression {
    void write(CodeLineBuilder codeLineBuilder);

    default CodeExpression with(CodeExpression newExpression){
        return new ChainedExpression(this, newExpression);
    }

    default CodeExpression with(String blankCode){
        return new ChainedExpression(this, new StringExpression(blankCode));
    }
}
