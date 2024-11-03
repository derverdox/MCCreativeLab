package de.verdox.mccreativelab.classgenerator.codegen.expressions;

import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.DynamicType;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public record Constructor(String modifier, DynamicType constructorType,
                          @Nullable Consumer<CodeLineBuilder> content,
                          Parameter... parameters) implements CodeExpression {

    @Override
    public void write(CodeLineBuilder code) {
        code.increaseDepth(1);

        code.append(modifier).append(" ").append(constructorType.getClassDescription().className()).append(" (");
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
            code.newLine();
            code.appendAndNewLine("}");
        } else
            code.appendAndNewLine(";");
        code.increaseDepth(-1);
        code.newLine();
    }

}
