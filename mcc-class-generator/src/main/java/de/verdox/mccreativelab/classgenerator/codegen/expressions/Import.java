package de.verdox.mccreativelab.classgenerator.codegen.expressions;

import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.type.ClassDescription;

public record Import(ClassDescription classDescription) implements CodeExpression {

    @Override
    public void write(CodeLineBuilder code) {
        code.appendAndNewLine("import " + classDescription + ";");
    }
}
