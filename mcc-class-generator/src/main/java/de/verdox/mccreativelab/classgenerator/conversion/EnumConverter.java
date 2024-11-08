package de.verdox.mccreativelab.classgenerator.conversion;

import de.verdox.mccreativelab.classgenerator.ConverterGenerator;
import de.verdox.mccreativelab.classgenerator.codegen.ClassBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.DynamicType;

public class EnumConverter implements ConverterGenerator.ConversionMethodCreator{
    @Override
    public boolean generate(ConverterGenerator converterGenerator, DynamicType from, DynamicType to, String assignedMethodName, String fromParameterName, String outputParameterName, CodeLineBuilder methodBuilder, ClassBuilder classBuilder) {
        if(!from.getClassDescription().isEnum() || !to.getClassDescription().isEnum()){
            return false;
        }
        methodBuilder.append("var to = "+to+".valueOf("+fromParameterName+".name());");
        return true;
    }
}
