package de.verdox.mccreativelab.classgenerator.codegen.type;

import de.verdox.mccreativelab.classgenerator.codegen.ClassBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Type;
import java.util.Objects;

public class ClassDescription implements Type {
    @Nullable
    private ClassBuilder classBuilder;
    @Nullable
    private Class<?> underlyingType;

    public ClassDescription(@NotNull ClassBuilder classBuilder) {
        Objects.requireNonNull(classBuilder);
        this.classBuilder = classBuilder;
    }

    public ClassDescription(@NotNull Class<?> type) {
        Objects.requireNonNull(type);
        this.underlyingType = type;
    }

    public boolean isRecord() {
        if(classBuilder != null) {
            return classBuilder.getClassHeader().equals(ClassBuilder.ClassHeader.RECORD);
        }
        else if(underlyingType != null) {
            return underlyingType.isRecord();
        }
        return false;
    }

    public boolean isEnum() {
        if(classBuilder != null) {
            return classBuilder.getClassHeader().equals(ClassBuilder.ClassHeader.ENUM);
        }
        else if(underlyingType != null) {
            return underlyingType.isEnum();
        }
        throw new IllegalStateException();
    }

    public boolean isInterface() {
        if(classBuilder != null) {
            return classBuilder.getClassHeader().equals(ClassBuilder.ClassHeader.INTERFACE);
        }
        else if(underlyingType != null) {
            return underlyingType.isInterface();
        }
        throw new IllegalStateException();
    }

    @Nullable
    public ClassDescription getDeclaringParentClass() {
        if(classBuilder != null && classBuilder.isInnerClass()) {
            return classBuilder.getParent().getClassDescription();
        }
        else if(underlyingType != null && underlyingType.getDeclaringClass() != null) {
            return new ClassDescription(underlyingType.getDeclaringClass());
        }
        return null;
    }

    public String getClassName() {
        if(classBuilder != null) {
            return classBuilder.getClassName();
        }
        else if(underlyingType != null) {
            return underlyingType.getSimpleName();
        }
        throw new IllegalStateException();
    }

    public String getPackageName() {
        if(classBuilder != null) {
            return classBuilder.getPackageName();
        }
        else if(underlyingType != null) {
            return underlyingType.getPackageName();
        }
        throw new IllegalStateException();
    }

    @Override
    public String getTypeName() {
        if(classBuilder != null) {
            if(getDeclaringParentClass() == null)
                return getClassName();
            else
                return getDeclaringParentClass().getTypeName()+"."+getClassName();
        }
        else if(underlyingType != null) {
            return underlyingType.getCanonicalName().replace(getPackageName()+".", "");
        }
        throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassDescription that = (ClassDescription) o;
        if(underlyingType != null)
            return underlyingType.equals(that.underlyingType);
        else if(classBuilder != null)
            return classBuilder.equals(that.classBuilder);
        return false;
    }

    @Override
    public int hashCode() {
        if(underlyingType != null)
            return underlyingType.hashCode();
        else if(classBuilder != null)
            return classBuilder.hashCode();
        throw new IllegalStateException();
    }

    @Override
    public String toString() {
        return getPackageName() + "." + getTypeName();
    }

    public boolean isPrimitiveType() {
        return getClassName().equals("int") ||
            getClassName().equals("boolean") ||
            getClassName().equals("double") ||
            getClassName().equals("long") ||
            getClassName().equals("short") ||
            getClassName().equals("byte") ||
            getClassName().equals("char") ||
            getClassName().equals("float") ||
            getClassName().equals("void");
    }
}
