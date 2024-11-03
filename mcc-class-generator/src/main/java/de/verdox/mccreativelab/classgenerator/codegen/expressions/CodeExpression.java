package de.verdox.mccreativelab.classgenerator.codegen.expressions;

import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;

public interface CodeExpression {
    void write(CodeLineBuilder codeLineBuilder);
}
