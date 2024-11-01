package de.verdox.mccreativelab.classgenerator;

import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class ClassBuilder {
    private String packageName;
    private String classModifier;
    private ClassHeader classHeader;
    private String className;
    private final Set<Method> methods = new HashSet<>();
    private final Set<Import> imports = new HashSet<>();
    private final Set<ClassBuilder> includedClasses = new HashSet<>();
    private boolean isInnerClass;
    private ClassBuilder parent;
    private int depth = 0;

    public ClassBuilder withPackage(String packageName) {
        this.packageName = packageName;
        return this;
    }

    public void markAsInnerClass(ClassBuilder parent) {
        this.parent = parent;
        isInnerClass = true;
        this.depth = parent.depth + 1;
    }

    public ClassBuilder withHeader(String modifier, ClassHeader classHeader, String className) {
        this.classModifier = modifier;
        this.classHeader = classHeader;
        this.className = className;
        return this;
    }

    public ClassBuilder withMethod(String modifier, String name, DynamicType returnType, Consumer<StringBuilder> content, Parameter... parameters) {
        methods.add(new Method(modifier, name, returnType, content, parameters));
        return this;
    }

    public ClassBuilder includeInnerClass(ClassBuilder classBuilder) {
        classBuilder.markAsInnerClass(this);
        includedClasses.add(classBuilder);
        return this;
    }

    public ClassBuilder withAbstractMethod(String modifier, String name, DynamicType returnType, Parameter... parameters) {
        methods.add(new Method(modifier, name, returnType, null, parameters));
        return this;
    }

    public ClassBuilder includeImport(ImportableClass importedClassOrPackage) {
        if (isInnerClass && this.parent != null)
            this.parent.includeImport(importedClassOrPackage);
        else
            imports.add(new Import(importedClassOrPackage));
        return this;
    }

    public void buildClassFileString(StringBuilder code) {
        // We build the class file in reverse because some of the write calls create new imports.
        // Since the imports are at the top of the file they are built last.
        String tabs = "";
        if (depth > 0)
            tabs = "\t".repeat(depth);


        StringBuilder includedClassesBuilder = new StringBuilder();
        for (ClassBuilder includedClass : includedClasses) {
            includedClass.buildClassFileString(includedClassesBuilder);
        }

        StringBuilder methodsBuilder = new StringBuilder();
        for (Method method : methods) {
            method.write(methodsBuilder, tabs);
            for (ImportableClass importedClass : method.returnType.getImportedClasses()) {
                includeImport(importedClass);
            }
            for (Parameter parameter : method.parameters()) {
                for (ImportableClass importedClass : parameter.type().getImportedClasses()) {
                    includeImport(importedClass);
                }
            }
        }

        String classTitleBuilder = tabs + (classModifier != null ? classModifier : "") + " " + classHeader.getHeader() + " " + className + " {\n\n";

        StringBuilder importBuilder = new StringBuilder();
        for (Import anImport : imports) {
            anImport.write(importBuilder);
        }

        StringBuilder packageBuilder = new StringBuilder();
        if (packageName != null && !isInnerClass)
            packageBuilder.append("package ").append(packageName).append(";\n\n");

        code.append(packageBuilder);
        code.append(importBuilder);
        code.append(classTitleBuilder);
        code.append(methodsBuilder);
        code.append(includedClassesBuilder);
        code.append("}\n");
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        buildClassFileString(stringBuilder);
        return stringBuilder.toString();
    }

    public enum ClassHeader {
        INTERFACE("interface"),
        ;
        private final String header;

        ClassHeader(String header) {
            this.header = header;
        }

        public String getHeader() {
            return header;
        }
    }

    public record Method(String modifier, String name, DynamicType returnType, @Nullable Consumer<StringBuilder> content,
                         Parameter... parameters) {

        public void write(StringBuilder code, String lineStart) {
            code.append(lineStart).append("\t").append(modifier).append(" ").append(returnType).append(" ").append(name).append(" (");
            for (int i = 0; i < parameters.length; i++) {
                Parameter parameter = parameters[i];
                parameter.write(code);
                if (i < parameters.length - 1)
                    code.append(", ");
            }
            code.append(")");
            if (content != null) {
                StringBuilder methodBody = new StringBuilder();
                content.accept(methodBody);
                code.append(lineStart).append("{\n");
                code.append(lineStart).append(methodBody).append("\n");
                code.append(lineStart).append("}\n");
            } else
                code.append(";\n");
        }

    }

    public record Import(ImportableClass importableClass) {
        public void write(StringBuilder code) {
            code.append("import " + importableClass + ";\n");
        }
    }

    public record Parameter(DynamicType type, String name) {
        public void write(StringBuilder code) {
            code.append(type).append(" ").append(name);
        }
    }

    public record ImportableClass(String packageName, String className){
        public ImportableClass(Class<?> type){
            this(type.getPackageName(), type.getSimpleName());
        }

        @Override
        public String toString() {
            return packageName+"."+className;
        }
    }
}
