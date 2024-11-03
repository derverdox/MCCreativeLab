package de.verdox.mccreativelab.classgenerator.codegen.type;

import java.lang.reflect.Type;

public record ClassDescription(String packageName, String className, ClassDescription declaringParentClass) implements Type {
    public ClassDescription(Class<?> type) {
        this(type.getPackageName(), type.getSimpleName(), type.getDeclaringClass() != null ? new ClassDescription(type.getDeclaringClass()) : null);
    }

    @Override
    public String getTypeName() {
        if (declaringParentClass == null)
            return className;
        return declaringParentClass.getTypeName() + "." + className;
    }

    @Override
    public String toString() {
        return packageName + "." + getTypeName();
    }

    public boolean isPrimitiveType() {
        return className.equals("int") ||
            className.equals("boolean") ||
            className.equals("double") ||
            className.equals("long") ||
            className.equals("short") ||
            className.equals("byte") ||
            className.equals("char") ||
            className.equals("float") ||
            className.equals("void");
    }
}
