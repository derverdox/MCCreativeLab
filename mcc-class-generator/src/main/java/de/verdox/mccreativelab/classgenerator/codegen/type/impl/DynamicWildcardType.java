package de.verdox.mccreativelab.classgenerator.codegen.type.impl;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

public class DynamicWildcardType implements WildcardType {
    private final Type[] upperBounds;
    private final Type[] lowerBounds;

    public DynamicWildcardType(Type[] upperBounds, Type[] lowerBounds) {
        this.upperBounds = upperBounds.length == 0 ? new Type[]{Object.class} : upperBounds;
        this.lowerBounds = lowerBounds;
    }

    @Override
    public Type[] getUpperBounds() {
        return upperBounds;
    }

    @Override
    public Type[] getLowerBounds() {
        return lowerBounds;
    }
}

