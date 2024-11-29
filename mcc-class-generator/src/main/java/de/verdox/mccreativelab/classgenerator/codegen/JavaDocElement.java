package de.verdox.mccreativelab.classgenerator.codegen;

import de.verdox.mccreativelab.classgenerator.codegen.expressions.JavaDocExpression;

public interface JavaDocElement<T extends JavaDocElement<T>> {
    T javaDoc(JavaDocExpression javaDoc);
    JavaDocExpression javaDoc();
}
