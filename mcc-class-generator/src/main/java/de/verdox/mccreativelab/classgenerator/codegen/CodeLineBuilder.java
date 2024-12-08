package de.verdox.mccreativelab.classgenerator.codegen;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.classgenerator.codegen.expressions.CodeExpression;
import de.verdox.mccreativelab.classgenerator.codegen.expressions.Parameter;
import de.verdox.mccreativelab.classgenerator.codegen.type.impl.DynamicType;

import java.util.LinkedList;
import java.util.List;

public class CodeLineBuilder {
    private final ClassBuilder classBuilder;
    private int depth;
    private final List<CodeLine> lines = new LinkedList<>();
    private boolean lineBreak;

    public CodeLineBuilder(ClassBuilder classBuilder, int depth) {
        this.classBuilder = classBuilder;
        this.depth = depth;
    }

    public ClassBuilder getClassBuilder() {
        return classBuilder;
    }

    public CodeLineBuilder append(String line) {
        if (lineBreak || lines.isEmpty())
            lines.add(new CodeLine(depth, new StringBuilder().append(line)));
        else
            lines.getLast().content.append(line);
        lineBreak = false;
        return this;
    }

    public CodeLineBuilder append(CodeExpression codeExpression) {
        codeExpression.write(this);
        return this;
    }

    public CodeLineBuilder add(CodeLineBuilder codeLineBuilder) {
        for (CodeLine line : codeLineBuilder.lines) {
            this.lines.add(new CodeLine(depth, line.content()));
        }
        return this;
    }

    public CodeLineBuilder appendAndNewLine(CodeExpression codeExpression) {
        codeExpression.write(this);
        newLine();
        return this;
    }

    public CodeLineBuilder appendParametersInBrackets(Parameter... parameters) {
        append("(");
        for (int i = 0; i < parameters.length; i++) {
            parameters[i].writeWithoutTypeName(this);
            if (i < parameters.length - 1)
                append(", ");
        }
        append(")");
        return this;
    }

    public CodeLineBuilder appendVariablesInBrackets(CodeExpression... variableNames) {
        append("(");
        for (int i = 0; i < variableNames.length; i++) {
            append(variableNames[i]);
            if (i < variableNames.length - 1)
                append(", ");
        }
        append(")");
        return this;
    }

    public CodeLineBuilder appendAndNewLine(String line) {
        append(line);
        return newLine();
    }

    private CodeLineBuilder newLine() {
        lineBreak = true;
        return this;
    }

    public CodeLineBuilder append(DynamicType dynamicType) {
        return append(dynamicType.asCodeExpression(getClassBuilder()));
    }

    public CodeLineBuilder append(DynamicType dynamicType, boolean insideGeneric) {
        return append(dynamicType.asCodeExpression(getClassBuilder(), insideGeneric));
    }

    public CodeLineBuilder appendTypeToken(DynamicType dynamicType) {
        getClassBuilder().includeImport(DynamicType.of(TypeToken.class, false));
        return append("new TypeToken<").append(dynamicType.asCodeExpression(getClassBuilder())).append(">(){}");
    }

    public CodeLineBuilder increaseDepth(int increase) {
        this.depth += increase;
        this.depth = Math.max(0, this.depth);
        newLine();
        return this;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (CodeLine line : lines) {
            if (line.depth > 0)
                stringBuilder.append("\t".repeat(line.depth));
            stringBuilder.append(line.content);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public boolean isEmpty() {
        return this.lines.isEmpty();
    }

    private record CodeLine(int depth, StringBuilder content) {
    }
}
