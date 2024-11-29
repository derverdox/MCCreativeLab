package de.verdox.mccreativelab.classgenerator.codegen.expressions;

import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.type.impl.DynamicType;

import java.util.Objects;
import java.util.function.Consumer;

public class Constructor extends Method {

    public Constructor(){

    }

    @Override
    public Constructor generic(GenericDeclaration... declarations) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Constructor name(String name) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Constructor type(DynamicType type) {
        super.type(type);
        return this;
    }

    @Override
    public Constructor modifier(String modifier) {
        super.modifier(modifier);
        return this;
    }

    @Override
    public Constructor javaDoc(JavaDocExpression javaDoc) {
        super.javaDoc(javaDoc);
        return this;
    }

    @Override
    public Constructor code(Consumer<CodeLineBuilder> content) {
        super.code(content);
        return this;
    }

    @Override
    public Constructor parameter(Parameter... parameters) {
        super.parameter(parameters);
        return this;
    }

    @Override
    protected void writeType(CodeLineBuilder code) {
        Objects.requireNonNull(type());
        code.append(type().getClassDescription().getClassName());
    }
}
