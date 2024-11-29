package de.verdox.mccreativelab.classgenerator.codegen.expressions;

public abstract class CodeExpressionWithModifier<T extends CodeExpressionWithModifier<T>> implements CodeExpression {

    protected String modifier = "public";

    public T modifier(String modifier) {
        this.modifier = modifier;
        return (T) this;
    }

    public String modifier() {
        return modifier;
    }
}
