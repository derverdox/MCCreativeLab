package de.verdox.mccreativelab.classgenerator.codegen.expressions;

import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.JavaDocElement;
import de.verdox.mccreativelab.classgenerator.codegen.type.impl.DynamicType;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Method extends CodeExpressionWithModifierAndParameters<Method> implements JavaDocElement<Method> {

    private DynamicType type;
    private Consumer<CodeLineBuilder> content;
    private String name;
    private final List<GenericDeclaration> genericDeclarations = new LinkedList<>();
    private JavaDocExpression javaDoc;

    public Method type(DynamicType type) {
        this.type = type;
        return this;
    }

    public DynamicType type() {
        return type;
    }

    public Method name(String name) {
        this.name = name;
        return this;
    }

    public String name() {
        return name;
    }

    public Method code(Consumer<CodeLineBuilder> content) {
        this.content = content;
        return this;
    }

    public Consumer<CodeLineBuilder> code() {
        return content;
    }

    public Method generic(GenericDeclaration... declarations){
        this.genericDeclarations.addAll(Arrays.asList(declarations));
        return this;
    }

    public Method generic(Collection<GenericDeclaration> declarations){
        this.genericDeclarations.addAll(declarations);
        return this;
    }

    public List<GenericDeclaration> generics() {
        return genericDeclarations;
    }

    protected void writeType(CodeLineBuilder code){
        if (type != null) {
            code.append(type);
        } else {
            code.append("void");
        }
    }

    @Override
    public void write(CodeLineBuilder code) {
        code.increaseDepth(1);

        if(javaDoc != null){
            code.append(javaDoc);
        }

        code.append(modifier).append(" ");

        if(!genericDeclarations.isEmpty()){
            for (int i = 0; i < genericDeclarations.size(); i++) {
                GenericDeclaration genericDeclaration = genericDeclarations.get(i);
                genericDeclaration.write(code);
                if (i < genericDeclarations.size() - 1)
                    code.append("; ");
            }
        }

        writeType(code);

        if(name != null){
            code.append(" ").append(name);
        }

        writeParameters(code);

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

    @Override
    public Method javaDoc(JavaDocExpression javaDoc) {
        this.javaDoc = javaDoc;
        return this;
    }

    @Override
    public JavaDocExpression javaDoc() {
        return javaDoc;
    }
}
