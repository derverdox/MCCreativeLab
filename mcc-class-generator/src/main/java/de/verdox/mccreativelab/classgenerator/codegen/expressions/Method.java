package de.verdox.mccreativelab.classgenerator.codegen.expressions;

import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.type.impl.DynamicType;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Consumer;

public record Method(String modifier, List<GenericDeclaration> genericDeclarations, String name,
                     @Nullable DynamicType returnType,
                     @Nullable Consumer<CodeLineBuilder> content,
                     Parameter... parameters) implements CodeExpression {
    public Method(String modifier, String name, DynamicType returnType,
                  @Nullable Consumer<CodeLineBuilder> content,
                  Parameter... parameters) {
        this(modifier, List.of(), name, returnType, content, parameters);
    }

    @Override
    public void write(CodeLineBuilder code) {
        code.increaseDepth(1);

        code.append(modifier).append(" ");

        for (int i = 0; i < genericDeclarations.size(); i++) {
            GenericDeclaration genericDeclaration = genericDeclarations.get(i);
            genericDeclaration.write(code);
            if (i < genericDeclarations.size() - 1)
                code.append("; ");
        }

        if (returnType != null) {
            code.append(returnType);
        } else {
            code.append("void");
        }

        code.append(" ").append(name).append("(");
        for (int i = 0; i < parameters.length; i++) {
            Parameter parameter = parameters[i];
            parameter.write(code);
            if (i < parameters.length - 1)
                code.append(", ");
        }
        code.append(")");
        if (content != null) {
            code.appendAndNewLine("{");
            code.increaseDepth(1);
            content.accept(code);
            code.increaseDepth(-1);
            code.appendAndNewLine("}");
        } else
            code.appendAndNewLine(";");
        code.increaseDepth(-1);
        code.appendAndNewLine("");
    }

}
