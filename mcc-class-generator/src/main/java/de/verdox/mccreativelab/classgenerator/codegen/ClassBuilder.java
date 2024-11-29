package de.verdox.mccreativelab.classgenerator.codegen;

import de.verdox.mccreativelab.classgenerator.codegen.expressions.*;
import de.verdox.mccreativelab.classgenerator.codegen.type.ClassDescription;
import de.verdox.mccreativelab.classgenerator.codegen.type.impl.DynamicType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassBuilder implements JavaDocElement<ClassBuilder> {
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
    private final List<EnumEntry> enumEntries = new LinkedList<>();
    private final Set<ClassBuilder> includedClasses = new HashSet<>();
    private final List<DynamicType> implementsList = new LinkedList<>();
    private final List<DynamicType> extendsList = new LinkedList<>();
    private final List<GenericDeclaration> genericDeclarations = new LinkedList<>();
    private final Map<String, DynamicType> uniqueNames = new HashMap<>();
    private boolean isInnerClass;
    private ClassBuilder parent;
    private int depth = 0;
    private JavaDocExpression javaDoc;

    public ClassBuilder withPackage(String packageName) {
        this.packageName = packageName;
        return this;
    }

    public ClassDescription getClassDescription() {
        return new ClassDescription(this);
    }

    public void markAsInnerClass(ClassBuilder parent) {
        this.parent = parent;
        isInnerClass = true;
        this.depth = parent.depth + 1;
    }

    public ClassBuilder withField(String modifier, DynamicType type, String fieldName, String initValue, DynamicType... genericTypes) {
        return withField(modifier, type, fieldName, CodeExpression.create().with(initValue), genericTypes);
    }

    public ClassBuilder withField(String modifier, DynamicType type, String fieldName, CodeExpression initValue, DynamicType... genericTypes) {
        Field field = new Field(modifier, type, fieldName, initValue, genericTypes);
        LOGGER.log(Level.FINER, "Including field " + field);
        fields.add(field);

        includeImport(type);
        for (DynamicType genericType : genericTypes)
            includeImport(genericType);
        return this;
    }

    public ClassBuilder withClassGeneric(String genericName, @Nullable DynamicType genericType) {
        genericDeclarations.add(new GenericDeclaration(genericName, genericType));
        return this;
    }

    public ClassBuilder withHeader(String modifier, ClassHeader classHeader, String className, String suffix) {
        if (classHeader.equals(ClassHeader.RECORD))
            throw new IllegalArgumentException("For record type use the withRecordHeader() function.");
        this.classModifier = modifier;
        this.classHeader = classHeader;
        this.className = className;
        this.classSuffix = suffix;
        return this;
    }

    public ClassBuilder withRecordHeader(String modifier, String className, String suffix, Parameter... parameters) {
        this.classModifier = modifier;
        this.classHeader = ClassHeader.RECORD;
        this.className = className;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        for (int i = 0; i < parameters.length; i++) {
            Parameter parameter = parameters[i];
            stringBuilder.append(parameter.type());
            if (i < parameters.length - 1)
                stringBuilder.append(", ");
        }
        stringBuilder.append(")");
        stringBuilder.append(" ").append(suffix);
        this.classSuffix = stringBuilder.toString();
        return this;
    }

    public ClassBuilder implementsClasses(DynamicType... dynamicTypes) {
        if (this.getClassDescription().isInterface())
            throw new IllegalStateException(this + " cannot implement any class because it is an interface");
        for (DynamicType dynamicType : dynamicTypes) {
            if (!dynamicType.getClassDescription().isInterface())
                throw new IllegalArgumentException(dynamicType + " is not an interface");
            if (!implementsList.contains(dynamicType)) {
                includeImport(dynamicType);
                implementsList.add(dynamicType);
            }
        }
        return this;
    }

    public ClassBuilder extendsClasses(DynamicType... dynamicTypes) {
        for (DynamicType dynamicType : dynamicTypes) {
            if (dynamicType.getClassDescription().isInterface() && !this.getClassDescription().isInterface())
                throw new IllegalArgumentException(this + " is not an interface so it cannot extend the interface " + dynamicType);
            if (!extendsList.contains(dynamicType)) {
                includeImport(dynamicType);
                extendsList.add(dynamicType);
            }
        }
        return this;
    }

    public ClassBuilder withEnumEntry(String name, CodeExpression... parameterValues) {
        enumEntries.add(new EnumEntry(name, parameterValues));
        return this;
    }

    public ClassBuilder withMethod(Method method) {
        LOGGER.log(Level.FINER, "Including method " + method);
        methods.add(method);

        if (method.type() != null) {
            includeImport(method.type());
        }
        for (Parameter parameter : method.parameters())
            includeImport(parameter.type());
        return this;
    }

    public ClassBuilder withConstructor(Constructor constructor) {
        LOGGER.log(Level.FINER, "Including constructor constructor " + constructor);
        constructor.type(DynamicType.of(getClassDescription(), false));
        constructors.add(constructor);

        for (Parameter parameter : constructor.parameters())
            includeImport(parameter.type());
        return this;
    }

    public ClassBuilder includeInnerClass(ClassBuilder classBuilder) {
        classBuilder.markAsInnerClass(this);
        includedClasses.add(classBuilder);
        return this;
    }

    public ClassBuilder removeInnerClass(ClassBuilder classBuilder) {
        classBuilder.markAsInnerClass(this);
        includedClasses.remove(classBuilder);
        return this;
    }

    public ClassBuilder includeImport(ClassDescription importedClassOrPackage) {
        return includeImport(DynamicType.of(importedClassOrPackage));
    }

    public ClassBuilder includeImport(DynamicType dynamicType) {
        Objects.requireNonNull(dynamicType);
        if (dynamicType.getClassDescription() == null)
            return this;
        if (Objects.equals(packageName, dynamicType.getClassDescription().getPackageName()))
            return this;
        if (this.isInnerClass && this.parent != null) {
            this.parent.includeImport(dynamicType);
            return this;
        }

        //TODO: If a class with the same name but different package is imported while there already exists a class with that name -> We need to notify the Classbuilder to write the types with package in front

        LOGGER.log(Level.FINER, "Including import " + dynamicType);
        for (ClassDescription importedClass : dynamicType.getImportedClasses())
            imports.add(new Import(importedClass));
        return this;
    }

    public ClassBuilder includeImport(Type type) {
        return includeImport(DynamicType.of(type));
    }

    public void buildClassFileString(StringBuilder code) {
        if (this.className == null || this.classHeader == null)
            return;
        // We build the class file in reverse because some of the write calls create new imports.
        // Since the imports are at the top of the file they are built last.
        StringBuilder includedClassesBuilder = new StringBuilder();
        for (ClassBuilder includedClass : includedClasses) {
            includedClass.buildClassFileString(includedClassesBuilder);
        }

        CodeLineBuilder enumEntryBuilder = new CodeLineBuilder(this, depth);
        for (EnumEntry enumEntry : enumEntries) {
            enumEntry.write(enumEntryBuilder);
        }
        enumEntryBuilder.appendAndNewLine(";");

        CodeLineBuilder constructorBuilder = new CodeLineBuilder(this, depth);
        for (Constructor constructor : constructors) {
            constructor.write(constructorBuilder);
        }

        CodeLineBuilder methodsBuilder = new CodeLineBuilder(this, depth);
        for (Method method : methods) {
            method.write(methodsBuilder);
        }

        CodeLineBuilder fieldsBuilder = new CodeLineBuilder(this, depth);
        for (Field field : fields)
            field.write(fieldsBuilder);

        CodeLineBuilder classTitleBuilder = buildClassTitle();


        CodeLineBuilder importBuilder = new CodeLineBuilder(this, depth);
        for (Import anImport : imports) {
            Objects.requireNonNull(anImport.classDescription().getClassName(), "No class name found for import: " + anImport);
            Objects.requireNonNull(anImport.classDescription().getPackageName(), "No class name found for import: " + anImport);
            if (anImport.classDescription().isPrimitiveType())
                continue;
            anImport.write(importBuilder);
        }

        CodeLineBuilder packageBuilder = new CodeLineBuilder(this, depth);
        if (packageName != null && !isInnerClass)
            packageBuilder.append("package ").append(packageName).append(";\n");

        code.append(packageBuilder);
        code.append(importBuilder);
        CodeLineBuilder javaDocBuilder = new CodeLineBuilder(this, depth);
        if (javaDoc != null) {
            code.append("\n");
            javaDocBuilder.append(javaDoc);
        }

        code.append(javaDocBuilder);

        code.append("\n");
        code.append(classTitleBuilder);


        if (classHeader.equals(ClassHeader.ENUM)) {
            code.append(enumEntryBuilder);
        }

        code.append(fieldsBuilder);
        if (!classHeader.equals(ClassHeader.INTERFACE)) {
            code.append(constructorBuilder);
        }
        code.append(methodsBuilder);
        code.append(includedClassesBuilder);
        CodeLineBuilder lastLine = new CodeLineBuilder(this, depth);
        lastLine.appendAndNewLine("}");
        code.append(lastLine);
    }

    private @NotNull CodeLineBuilder buildClassTitle() {
        CodeLineBuilder classTitleBuilder = new CodeLineBuilder(this, depth);
        if (classModifier != null)
            classTitleBuilder.append(classModifier);
        classTitleBuilder.append(" ");
        classTitleBuilder.append(classHeader.getHeader());
        classTitleBuilder.append(" ");
        classTitleBuilder.append(className);


        classTitleBuilder.append(" ");
        if (!genericDeclarations.isEmpty()) {
            classTitleBuilder.append("<");
            for (int i = 0; i < genericDeclarations.size(); i++) {
                GenericDeclaration genericDeclaration = genericDeclarations.get(i);

                if (genericDeclaration.type() != null) {
                    classTitleBuilder.append(genericDeclaration.name() + " extends " + genericDeclaration.type());
                } else {
                    classTitleBuilder.append(genericDeclaration.name());
                }
                if (i < genericDeclarations.size() - 1)
                    classTitleBuilder.append(", ");
            }
            classTitleBuilder.append(">");
            classTitleBuilder.append(" ");
        }
        if (!extendsList.isEmpty()) {
            classTitleBuilder.append("extends ");
            for (int i = 0; i < extendsList.size(); i++) {
                DynamicType extendedType = extendsList.get(i);
                classTitleBuilder.append(extendedType);
                if (i < extendsList.size() - 1)
                    classTitleBuilder.append(", ");
            }
            classTitleBuilder.append(" ");
        }
        if (!implementsList.isEmpty()) {
            classTitleBuilder.append("implements ");
            for (int i = 0; i < implementsList.size(); i++) {
                DynamicType implementedType = implementsList.get(i);
                classTitleBuilder.append(implementedType);
                if (i < implementsList.size() - 1)
                    classTitleBuilder.append(", ");
            }
            classTitleBuilder.append(" ");
        }
        if (classSuffix != null)
            classTitleBuilder.append(classSuffix);
        classTitleBuilder.append(" {");
        classTitleBuilder.appendAndNewLine("");
        classTitleBuilder.appendAndNewLine("");
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
            LOGGER.log(Level.FINER, "Created java file " + file);
        }
    }

    private void logType(DynamicType type) {
        if (!uniqueNames.containsKey(type.getTypeName())) {
            uniqueNames.put(type.getTypeName(), type);
        }
        for (DynamicType genericType : type.getGenericTypes()) {
            logType(genericType);
        }
    }

    /**
     * @param type Checks if this types name was written anywhere in the class builder. If no it returns true. Else the class builder wants it to be written with full package name
     * @return true if the type was already written in the class, and it's the same type.
     */
    public boolean canWriteSimpleName(DynamicType type) {
        logType(type);
        boolean canWriteSimple = uniqueNames.containsKey(type.getTypeName()) && uniqueNames.get(type.getTypeName()).compareWithoutGenerics(type);
        if (!canWriteSimple)
            imports.remove(new Import(type.getClassDescription()));
        return canWriteSimple;
    }

    @Override
    public ClassBuilder javaDoc(JavaDocExpression javaDoc) {
        this.javaDoc = javaDoc;
        return this;
    }

    @Override
    public JavaDocExpression javaDoc() {
        return javaDoc;
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

    public String getPackageName() {
        return packageName;
    }

    public String getClassModifier() {
        return classModifier;
    }

    public ClassHeader getClassHeader() {
        return classHeader;
    }

    public String getClassName() {
        return className;
    }

    public String getClassSuffix() {
        return classSuffix;
    }

    public List<Method> getMethods() {
        return methods;
    }

    public List<Constructor> getConstructors() {
        return constructors;
    }

    public Set<Import> getImports() {
        return Set.copyOf(imports);
    }

    public List<Field> getFields() {
        return List.copyOf(fields);
    }

    public List<EnumEntry> getEnumEntries() {
        return List.copyOf(enumEntries);
    }

    public Set<ClassBuilder> getIncludedClasses() {
        return Set.copyOf(includedClasses);
    }

    public boolean isInnerClass() {
        return isInnerClass;
    }

    public ClassBuilder getParent() {
        return parent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassBuilder that = (ClassBuilder) o;
        return Objects.equals(packageName, that.packageName) && Objects.equals(classModifier, that.classModifier) && Objects.equals(parent, that.parent) && classHeader == that.classHeader && Objects.equals(className, that.className) && Objects.equals(classSuffix, that.classSuffix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageName, classModifier, classHeader, className, classSuffix, parent);
    }
}
