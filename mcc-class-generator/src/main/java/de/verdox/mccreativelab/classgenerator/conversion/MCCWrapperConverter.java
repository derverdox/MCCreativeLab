package de.verdox.mccreativelab.classgenerator.conversion;

import de.verdox.mccreativelab.classgenerator.ConverterGenerator;
import de.verdox.mccreativelab.classgenerator.codegen.ClassBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.DynamicType;
import de.verdox.mccreativelab.classgenerator.wrapper.WrappedClass;
import de.verdox.mccreativelab.classgenerator.wrapper.WrappedClassRegistry;

public class MCCWrapperConverter implements ConverterGenerator.ConversionMethodCreator {
    @Override
    public boolean generate(ConverterGenerator converterGenerator, DynamicType from, DynamicType to, String assignedMethodName, String fromParameterName, String outputParameterName, CodeLineBuilder methodBuilder, ClassBuilder classBuilder) {
        if(from.getClassDescription().isEnum() && to.getClassDescription().isEnum())
            return false;
        if (from.getClassDescription().getClassName().startsWith("MCC")) {
            WrappedClass wrappedClass = WrappedClassRegistry.INSTANCE.findWrappingInformationByGeneratedClass(from.getClassDescription());
            if(wrappedClass == null)
                return false;
            DynamicType implType = DynamicType.of(wrappedClass.implementation(), false);
            classBuilder.includeImport(implType);
            methodBuilder.append("var "+outputParameterName+" = ").append("((" + implType + ")" + fromParameterName + ").getHandle();");
            return true;
        } else if (to.getClassDescription().getClassName().startsWith("MCC")) {
            WrappedClass wrappedClass = WrappedClassRegistry.INSTANCE.findWrappingInformationByGeneratedClass(to.getClassDescription());
            if(wrappedClass == null)
                return false;
            DynamicType implType = DynamicType.of(wrappedClass.implementation(), false);
            classBuilder.includeImport(implType);
            methodBuilder.append("var "+outputParameterName+" = ").append("new " + implType + "(" + fromParameterName + ");");
            return true;
        }
        return false;
    }
}
