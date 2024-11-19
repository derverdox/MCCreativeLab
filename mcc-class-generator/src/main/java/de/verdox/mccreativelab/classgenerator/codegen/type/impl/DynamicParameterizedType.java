package de.verdox.mccreativelab.classgenerator.codegen.type.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class DynamicParameterizedType implements ParameterizedType {
    private Type ownerType;
    private final Type rawType;
    private final Type[] typeArguments;

    public DynamicParameterizedType(Type rawType, Type... typeArguments) {
        this.rawType = rawType;
        this.typeArguments = typeArguments;
    }

    void setOwnerType(Type ownerType) {
        this.ownerType = ownerType;
    }

    @Override
    public Type[] getActualTypeArguments() {
        return typeArguments;
    }

    @Override
    public Type getRawType() {
        return rawType;
    }

    @Override
    public Type getOwnerType() {
        return ownerType; // Standardmäßig kein äußerer Typ
    }
}

