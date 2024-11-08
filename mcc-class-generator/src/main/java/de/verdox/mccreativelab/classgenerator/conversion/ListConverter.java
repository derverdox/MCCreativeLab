package de.verdox.mccreativelab.classgenerator.conversion;

import de.verdox.mccreativelab.classgenerator.ConverterGenerator;
import de.verdox.mccreativelab.classgenerator.NMSMapper;
import de.verdox.mccreativelab.classgenerator.codegen.ClassBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.DynamicType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListConverter implements ConverterGenerator.ConversionMethodCreator {
    @Override
    public boolean generate(ConverterGenerator converterGenerator, DynamicType from, DynamicType to, String assignedMethodName, String fromParameterName, String outputParameterName, CodeLineBuilder methodBuilder, ClassBuilder classBuilder) {
        if (List.class.equals(from.getRawType()) && List.class.equals(to.getRawType())) {
            DynamicType actualElementType1 = from.getGenericTypes().get(0);
            DynamicType actualElementType2 = to.getGenericTypes().get(0);

            if (NMSMapper.isSwapped(actualElementType1) && !NMSMapper.isSwapped(actualElementType2)) {
                converterGenerator.requireGeneratorFunction(actualElementType2, actualElementType1);
            } else {
                converterGenerator.requireGeneratorFunction(actualElementType1, actualElementType2);
            }

            String converterFunctionName = converterGenerator.getConverterFunctionName(actualElementType1, actualElementType2);
            classBuilder.includeImport(DynamicType.of(ArrayList.class));

            methodBuilder.appendAndNewLine("if (" + fromParameterName + ".isEmpty()) return new ArrayList<>();");
            methodBuilder.appendAndNewLine(to + " " + outputParameterName + " = new ArrayList<>();");
            methodBuilder.appendAndNewLine("");

            methodBuilder.appendAndNewLine("for (" + actualElementType1 + " element : " + fromParameterName + ") {");
            methodBuilder.increaseDepth(1);
            methodBuilder.appendAndNewLine(outputParameterName + ".add(" + converterFunctionName + "(element));");
            methodBuilder.increaseDepth(-1);
            methodBuilder.appendAndNewLine("}");
            return true;
        }

        return false;
    }
}
