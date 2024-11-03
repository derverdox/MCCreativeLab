package de.verdox.mccreativelab.classgenerator.codegen;

import de.verdox.mccreativelab.classgenerator.codegen.expressions.*;
import de.verdox.mccreativelab.classgenerator.codegen.type.ClassDescription;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import java.util.function.Consumer;
import java.util.logging.Logger;

public class ClassBuilder {
    public static final Logger LOGGER = Logger.getLogger(ClassBuilder.class.getName());
    private String packageName;
    private String classModifier;
    private ClassHeader classHeader;
    private String className;
    private String classSuffix;
    private final List<Method> methods = new LinkedList<>();
    private final List<Constructor> constructors = new LinkedList<>();
    private final Set<Import> imports = new HashSet<>();
    private final List<Field> fields = new LinkedList<>();
    private final List<ClassBuilder> includedClasses = new LinkedList<>();
    private boolean isInnerClass;
    private ClassBuilder parent;
    private int depth = 0;

    public ClassBuilder withPackage(String packageName) {
        this.packageName = packageName;
        return this;
    }

    public ClassDescription getClassDescription() {
        return new ClassDescription(packageName, className, parent != null ? parent.getClassDescription() : null);
    }

    public void markAsInnerClass(ClassBuilder parent) {
        this.parent = parent;
        isInnerClass = true;
        this.depth = parent.depth + 1;
    }

    public ClassBuilder withField(String modifier, DynamicType type, String fieldName, String initValue, DynamicType... genericTypes) {
        Field field = new Field(modifier, type, fieldName, initValue, genericTypes);
        LOGGER.info("Including field " + field);
        fields.add(field);

        includeImport(type);
        for (DynamicType genericType : genericTypes)
            includeImport(genericType);
        return this;
    }

    public ClassBuilder withHeader(String modifier, ClassHeader classHeader, String className, String suffix) {
        this.classModifier = modifier;
        this.classHeader = classHeader;
        this.className = className;
        this.classSuffix = suffix;
        return this;
    }

    public ClassBuilder withMethod(String modifier, String name, DynamicType returnType, Consumer<CodeLineBuilder> content, Parameter... parameters) {
        Method method = new Method(modifier, name, returnType, content, parameters);
        LOGGER.info("Including method " + method);
        methods.add(method);

        includeImport(returnType);
        for (Parameter parameter : parameters)
            includeImport(parameter.type());
        return this;
    }

    public ClassBuilder withAbstractMethod(String modifier, String name, DynamicType returnType, Parameter... parameters) {
        Method method = new Method(modifier, name, returnType, null, parameters);
        LOGGER.info("Including abstract method " + method);
        methods.add(method);

        includeImport(returnType);
        for (Parameter parameter : parameters)
            includeImport(parameter.type());
        return this;
    }

    public ClassBuilder withConstructor(String modifier, Consumer<CodeLineBuilder> content, Parameter... parameters) {
        Constructor constructor = new Constructor(modifier, DynamicType.of(getClassDescription()), content, parameters);
        LOGGER.info("Including constructor constructor " + constructor);
        constructors.add(constructor);

        for (Parameter parameter : parameters)
            includeImport(parameter.type());
        return this;
    }

    public ClassBuilder includeInnerClass(ClassBuilder classBuilder) {
        classBuilder.markAsInnerClass(this);
        includedClasses.add(classBuilder);
        return this;
    }

    public ClassBuilder includeImport(ClassDescription importedClassOrPackage) {
        return includeImport(DynamicType.of(importedClassOrPackage));
    }

    public ClassBuilder includeImport(DynamicType dynamicType) {
        Objects.requireNonNull(dynamicType);
        if(this.isInnerClass && this.parent != null) {
            this.parent.includeImport(dynamicType);
            return this;
        }

        //TODO: If a class with the same name but different package is imported while there already exists a class with that name -> We need to notify the Classbuilder to write the types with package in front

        LOGGER.info("Including import "+dynamicType);
        for (ClassDescription importedClass : dynamicType.getImportedClasses())
            imports.add(new Import(importedClass));
        return this;
    }

    public ClassBuilder includeImport(Type type) {
        return includeImport(DynamicType.of(type));
    }

    public void buildClassFileString(StringBuilder code) {
        // We build the class file in reverse because some of the write calls create new imports.
        // Since the imports are at the top of the file they are built last.
        StringBuilder includedClassesBuilder = new StringBuilder();
        for (ClassBuilder includedClass : includedClasses) {
            includedClass.buildClassFileString(includedClassesBuilder);
        }

        CodeLineBuilder constructorBuilder = new CodeLineBuilder(depth);
        for (Constructor constructor : constructors) {
            constructor.write(constructorBuilder);
            constructorBuilder.newLine();
        }

        CodeLineBuilder methodsBuilder = new CodeLineBuilder(depth);
        for (Method method : methods) {
            method.write(methodsBuilder);
            methodsBuilder.newLine();
        }

        CodeLineBuilder fieldsBuilder = new CodeLineBuilder(depth);
        for (Field field : fields)
            field.write(fieldsBuilder);

        CodeLineBuilder classTitleBuilder = buildClassTitle();


        CodeLineBuilder importBuilder = new CodeLineBuilder(depth);
        for (Import anImport : imports) {
            anImport.write(importBuilder);
        }

        CodeLineBuilder packageBuilder = new CodeLineBuilder(depth);
        if (packageName != null && !isInnerClass)
            packageBuilder.append("package ").append(packageName).append(";\n");

        code.append(packageBuilder);
        code.append(importBuilder);
        code.append("\n");
        code.append(classTitleBuilder);
        code.append(fieldsBuilder);
        code.append("\n");
        code.append(constructorBuilder);
        code.append("\n");
        code.append(methodsBuilder);
        code.append(includedClassesBuilder);
        CodeLineBuilder lastLine = new CodeLineBuilder(depth);
        lastLine.appendAndNewLine("}");
        code.append(lastLine);
    }

    private @NotNull CodeLineBuilder buildClassTitle() {
        CodeLineBuilder classTitleBuilder = new CodeLineBuilder(depth);
        if (classModifier != null)
            classTitleBuilder.append(classModifier);
        classTitleBuilder.append(" ");
        classTitleBuilder.append(classHeader.getHeader());
        classTitleBuilder.append(" ");
        classTitleBuilder.append(className);
        classTitleBuilder.append(" ");
        if (classSuffix != null)
            classTitleBuilder.append(classSuffix);
        classTitleBuilder.append("{");
        classTitleBuilder.newLine();
        classTitleBuilder.newLine();
        return classTitleBuilder;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        buildClassFileString(stringBuilder);
        return stringBuilder.toString();
    }

    public void writeClassFile(String fileName) throws IOException {
        writeClassFile(new File(fileName));
    }

    public void writeClassFile(File sourceDir) throws IOException {
        File file = new File(sourceDir.getPath() + "/" + packageName.replace(".", "/") + "/" + className + ".java");
        file.getParentFile().mkdirs();
        try (FileWriter writer = new FileWriter(file)) {
            StringBuilder code = new StringBuilder();
            buildClassFileString(code);
            writer.write(code.toString());
        }
    }

    public enum ClassHeader {
        INTERFACE("interface"),
        CLASS("class"),
        RECORD("record"),
        ENUM("enum"),
        ;
        private final String header;

        ClassHeader(String header) {
            this.header = header;
        }

        public String getHeader() {
            return header;
        }
    }

}
