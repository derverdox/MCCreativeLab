package de.verdox.mccreativelab.classgenerator.codegen.expressions;

import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.DynamicType;

public interface CodeExpression {
    void write(CodeLineBuilder codeLineBuilder);

    default CodeExpression with(CodeExpression newExpression) {
        return new ChainedExpression(this, newExpression);
    }

    default CodeExpression with(String blankCode) {
        return new ChainedExpression(this, new StringExpression(blankCode));
    }

    default CodeExpression with(DynamicType dynamicType) {
        return new ChainedExpression(this, codeLineBuilder -> codeLineBuilder.append(dynamicType));
    }

    static CodeExpression create() {
        return new ChainedExpression();
    }
}
