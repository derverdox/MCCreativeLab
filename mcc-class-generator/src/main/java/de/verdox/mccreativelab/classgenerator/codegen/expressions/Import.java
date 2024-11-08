package de.verdox.mccreativelab.classgenerator.codegen.expressions;

import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.type.ClassDescription;

import java.util.Objects;

public record Import(ClassDescription classDescription) implements CodeExpression {

    @Override
    public void write(CodeLineBuilder code) {
        code.appendAndNewLine("import " + classDescription + ";");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Import anImport = (Import) o;
        return Objects.equals(classDescription.toString(), anImport.classDescription.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(classDescription.toString());
    }
}
