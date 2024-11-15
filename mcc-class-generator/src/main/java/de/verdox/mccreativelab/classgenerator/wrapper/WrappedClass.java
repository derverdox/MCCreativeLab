package de.verdox.mccreativelab.classgenerator.wrapper;

import de.verdox.mccreativelab.classgenerator.codegen.type.ClassDescription;
import org.jetbrains.annotations.Nullable;

public record WrappedClass(Class<?> classToWrap, ClassDescription apiInterface, @Nullable ClassDescription implementation) {
}
