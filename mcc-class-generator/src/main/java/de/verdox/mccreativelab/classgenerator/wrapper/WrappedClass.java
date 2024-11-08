package de.verdox.mccreativelab.classgenerator.wrapper;

import de.verdox.mccreativelab.classgenerator.codegen.type.ClassDescription;

public record WrappedClass(Class<?> classToWrap, ClassDescription apiInterface, ClassDescription implementation) {
}
