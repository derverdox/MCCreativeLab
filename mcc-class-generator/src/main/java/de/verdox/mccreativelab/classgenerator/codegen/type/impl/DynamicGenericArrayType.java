package de.verdox.mccreativelab.classgenerator.codegen.type.impl;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

public class DynamicGenericArrayType implements GenericArrayType {
    private final Type componentType;

    public DynamicGenericArrayType(Type componentType) {
        this.componentType = componentType;
    }

    @Override
    public Type getGenericComponentType() {
        return componentType;
    }
}

