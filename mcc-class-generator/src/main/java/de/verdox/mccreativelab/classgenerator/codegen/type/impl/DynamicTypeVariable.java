package de.verdox.mccreativelab.classgenerator.codegen.type.impl;

import org.jetbrains.annotations.NotNull;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class DynamicTypeVariable<T extends GenericDeclaration> implements TypeVariable<T> {
    @Override
    public Type[] getBounds() {
        return new Type[0];
    }

    @Override
    public T getGenericDeclaration() {
        return null;
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public AnnotatedType[] getAnnotatedBounds() {
        return new AnnotatedType[0];
    }

    @Override
    public <T extends Annotation> T getAnnotation(@NotNull Class<T> annotationClass) {
        return null;
    }

    @Override
    public Annotation[] getAnnotations() {
        return new Annotation[0];
    }

    @Override
    public Annotation[] getDeclaredAnnotations() {
        return new Annotation[0];
    }
}
