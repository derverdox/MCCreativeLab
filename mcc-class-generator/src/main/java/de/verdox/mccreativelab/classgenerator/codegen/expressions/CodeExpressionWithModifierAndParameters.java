package de.verdox.mccreativelab.classgenerator.codegen.expressions;

import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public abstract class CodeExpressionWithModifierAndParameters<T extends CodeExpressionWithModifierAndParameters<T>> extends CodeExpressionWithModifier<T> {

    private final List<Parameter> parameters = new LinkedList<>();

    public T parameter(Parameter... parameters){
        this.parameters.addAll(Arrays.asList(parameters));
        return (T) this;
    }

    public T parameter(Collection<Parameter> parameters){
        this.parameters.addAll(parameters);
        return (T) this;
    }

    public List<Parameter> parameters() {
        return parameters;
    }

    public void writeParameters(CodeLineBuilder code) {
        code.append("(");
        for (int i = 0; i < parameters.size(); i++) {
            Parameter parameter = parameters.get(i);
            parameter.write(code);
            if (i < parameters.size() - 1)
                code.append(", ");
        }
        code.append(")");
    }
}
