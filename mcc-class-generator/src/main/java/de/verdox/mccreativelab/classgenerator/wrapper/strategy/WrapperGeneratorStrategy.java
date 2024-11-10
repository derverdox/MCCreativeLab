package de.verdox.mccreativelab.classgenerator.wrapper.strategy;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.classgenerator.ConverterGenerator;
import de.verdox.mccreativelab.classgenerator.NMSMapper;
import de.verdox.mccreativelab.classgenerator.codegen.ClassBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.DynamicType;
import de.verdox.mccreativelab.classgenerator.codegen.expressions.*;
import de.verdox.mccreativelab.classgenerator.util.FieldNameUtil;

import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.platform.adapter.MCCAdapters;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.RecordComponent;
import java.lang.reflect.Type;
import java.util.*;

public interface WrapperGeneratorStrategy {

    List<ParameterOrRecord> collectParametersForGettersAndSetters(Class<?> nmsClass);

    CodeExpression createInstantiationExpression(Class<?> nmsClass, ClassBuilder interfaceBuilder, ClassBuilder implBuilder, ConverterGenerator converterGenerator, Map<ParameterOrRecord, LocalVariableAssignment> parameters);

    default String getApiGetterMethodName(ParameterOrRecord parameter) {
        String capitalizedParameterName = FieldNameUtil.capitalize(parameter.getName());
        return "get" + capitalizedParameterName;
    }

    default String getApiSetterMethodName(ParameterOrRecord parameter) {
        String capitalizedParameterName = FieldNameUtil.capitalize(parameter.getName());
        return "with" + capitalizedParameterName;
    }

    default String getImplGetterMethodName(ParameterOrRecord parameter) {
        return getApiGetterMethodName(parameter) + "FromImpl";
    }

    default void createGetterAndSetter(Class<?> nmsClass, ClassBuilder interfaceBuilder, ClassBuilder implBuilder, ConverterGenerator converterGenerator) {
        List<ParameterOrRecord> parameters = collectParametersForGettersAndSetters(nmsClass);
        implBuilder.includeImport(DynamicType.of(MCCPlatform.class));
        implBuilder.includeImport(DynamicType.of(TypeToken.class));
        implBuilder.includeImport(DynamicType.of(List.class));
        implBuilder.includeImport(DynamicType.of(ArrayList.class));
        implBuilder.includeImport(DynamicType.of(Set.class));
        implBuilder.includeImport(DynamicType.of(HashSet.class));

        //TODO: Create a private utility function to gather those information
        Map<ParameterOrRecord, String> parameterToGetter = new HashMap<>();
        for (ParameterOrRecord parameter : parameters) {
            String apiGetterMethodName = "get" + FieldNameUtil.capitalize(parameter.getName());
            String nmsGetterMethodName = apiGetterMethodName + "NMS";
            if (NMSMapper.isSwapped(parameter.getGenericType()))
                parameterToGetter.put(parameter, nmsGetterMethodName);
            else
                parameterToGetter.put(parameter, apiGetterMethodName);
        }

        DynamicType interfaceType = DynamicType.of(interfaceBuilder.getClassDescription());

        for (ParameterOrRecord parameter : parameters) {
            boolean isParameterSwapped = NMSMapper.isSwapped(parameter.getGenericType());

            DynamicType parameterTypeSwapped = DynamicType.of(parameter.getGenericType());
            DynamicType parameterTypeNotSwapped = DynamicType.of(parameter.getGenericType(), false);

            CodeExpression notSwappedStandardValue = parameterTypeNotSwapped.getDefaultValueAsString();


            String apiGetterMethodName = getApiGetterMethodName(parameter);
            String apiSetterMethodName = getApiSetterMethodName(parameter);

            String nmsGetterMethodName = getImplGetterMethodName(parameter);

            interfaceBuilder.withAbstractMethod("public", apiGetterMethodName, parameterTypeSwapped);
            interfaceBuilder.withAbstractMethod("public", apiSetterMethodName, interfaceType, new Parameter(parameterTypeSwapped, parameter.getName()));

            boolean generateGetterImpl = true;

            if (!nmsClass.isRecord()) {
                Field fieldOfParameter = findNonStaticFieldInClassForParameter(nmsClass, parameter.parameter());
                // If we cannot find an attribute of the nmsClass that saves our parameter we cannot create getter for it.
                if (fieldOfParameter == null)
                    generateGetterImpl = false;
                implBuilder.includeImport(parameter.getGenericType());
                implBuilder.includeImport(Field.class);
            }

            if (generateGetterImpl) {
                // Build public getter method
                implBuilder.withMethod("public", apiGetterMethodName, parameterTypeSwapped, methodCode -> {
                    methodCode.appendAndNewLine("var nms = " + nmsGetterMethodName + "();");
                    if (!isParameterSwapped) {
                        methodCode.appendAndNewLine("return nms;");
                        return;
                    }

                    methodCode.append("return ");
                    //converterGenerator.requireGeneratorFunction(parameterTypeSwapped, parameterTypeNotSwapped);
                    CodeExpression converterExpression = createImplToApiExpression("nms", parameterTypeNotSwapped, parameterTypeSwapped, converterGenerator);
                    methodCode.append(converterExpression);
                    methodCode.appendAndNewLine(";");
                });

                // Build private ImplGetterMethod
                implBuilder.withMethod("private", nmsGetterMethodName, DynamicType.of(parameter.getGenericType(), false), methodCode -> {
                    if (nmsClass.isRecord()) {
                        methodCode.append("return handle == null ? ");
                        methodCode.append(notSwappedStandardValue);
                        methodCode.append(" : handle.");
                        methodCode.append(parameter.getName()).appendAndNewLine("();");
                    } else {
                        new ReflectiveFieldGetter("nms", nmsClass, parameter.parameter()).write(methodCode);
                        methodCode.appendAndNewLine("return nms;");
                    }
                });
            }

            implBuilder.withMethod("public", apiSetterMethodName, interfaceType, codeLineBuilder -> {
                int counter = 0;
                Map<ParameterOrRecord, LocalVariableAssignment> variables = new LinkedHashMap<>();

                for (ParameterOrRecord param : parameters) {
                    if (!param.equals(parameter)) {


                        variables.put(param, new LocalVariableAssignment("param" + (counter++), new StringExpression(getImplGetterMethodName(param) + "()")));
                        variables.get(param).write(codeLineBuilder);
                        continue;
                    }


                    if (isParameterSwapped) {
                        //converterGenerator.requireGeneratorFunction(parameterTypeSwapped, parameterTypeNotSwapped);
                        CodeExpression conversionExpression = createApiToImplExpression(parameter.getName(), parameterTypeSwapped, parameterTypeNotSwapped, converterGenerator);
                        variables.put(param, new LocalVariableAssignment("param" + (counter++), conversionExpression));
                    } else {
                        variables.put(param, new LocalVariableAssignment("param" + (counter++), new StringExpression(parameter.getName())));
                    }
                    variables.get(param).write(codeLineBuilder);
                }
                codeLineBuilder.append("return ");
                createInstantiationExpression(nmsClass, interfaceBuilder, implBuilder, converterGenerator, variables).write(codeLineBuilder);
                codeLineBuilder.append(";");
            }, new Parameter(parameterTypeSwapped, parameter.getName()));
            implBuilder.includeImport(parameter.getGenericType());
        }
    }

    private static @Nullable Field findNonStaticFieldInClassForParameter(Class<?> nmsClass, java.lang.reflect.Parameter parameter) {
        Field fieldOfParameter = null;
        for (Field declaredField : nmsClass.getDeclaredFields()) {
            if (declaredField.getGenericType().equals(parameter.getParameterizedType()))
                fieldOfParameter = declaredField;
        }
        return fieldOfParameter;
    }

    private static CodeExpression createApiToImplExpression(String variableToConvert, DynamicType api, DynamicType impl, ConverterGenerator converterGenerator) {
        if (api.compareWithoutGenerics(DynamicType.of(Optional.class)) && impl.compareWithoutGenerics(DynamicType.of(Optional.class))) {
            return new StringExpression("MCCPlatform.getInstance().getConversionService().unwrapOptional(" + variableToConvert + ", new TypeToken<" + impl.getGenericTypes().get(0) + ">() {})");
        } else if (api.compareWithoutGenerics(DynamicType.of(List.class)) && impl.compareWithoutGenerics(DynamicType.of(List.class))) {
            return new StringExpression("MCCPlatform.getInstance().getConversionService().unwrapCollection(" + variableToConvert + ", new TypeToken<" + impl.getGenericTypes().get(0) + ">() {}, ArrayList::new)");
        } else if (api.compareWithoutGenerics(DynamicType.of(Set.class)) && impl.compareWithoutGenerics(DynamicType.of(Set.class))) {
            return new StringExpression("MCCPlatform.getInstance().getConversionService().unwrapCollection(" + variableToConvert + ", new TypeToken<" + impl.getGenericTypes().get(0) + ">() {}, HashSet::new)");
        } else {
            return new StringExpression("MCCPlatform.getInstance().getConversionService().unwrap(" + variableToConvert + ", new TypeToken<" + impl + ">() {})");
        }
    }

    private static CodeExpression createImplToApiExpression(String variableToConvert, DynamicType impl, DynamicType api, ConverterGenerator converterGenerator) {
        if (api.compareWithoutGenerics(DynamicType.of(Optional.class)) && impl.compareWithoutGenerics(DynamicType.of(Optional.class))) {
            return new StringExpression("MCCPlatform.getInstance().getConversionService().wrapOptional(" + variableToConvert + ", new TypeToken<" + api.getGenericTypes().get(0) + ">() {})");
        } else if (api.compareWithoutGenerics(DynamicType.of(List.class)) && impl.compareWithoutGenerics(DynamicType.of(List.class))) {
            return new StringExpression("MCCPlatform.getInstance().getConversionService().wrapCollection(" + variableToConvert + ", new TypeToken<" + api.getGenericTypes().get(0) + ">() {}, ArrayList::new)");
        } else if (api.compareWithoutGenerics(DynamicType.of(Set.class)) && impl.compareWithoutGenerics(DynamicType.of(Set.class))) {
            return new StringExpression("MCCPlatform.getInstance().getConversionService().wrapCollection(" + variableToConvert + ", new TypeToken<" + api.getGenericTypes().get(0) + ">() {}, HashSet::new)");
        } else {
            return new StringExpression("MCCPlatform.getInstance().getConversionService().wrap(" + variableToConvert + ", new TypeToken<" + api + ">() {})");
        }
    }

    default @Nullable java.lang.reflect.Constructor<?> findConstructorWithMostNumberOfArguments(Class<?> nmsClass) {
        int amountParameters = 0;
        java.lang.reflect.Constructor<?> foundConstructor = null;
        for (java.lang.reflect.Constructor<?> declaredConstructor : nmsClass.getDeclaredConstructors()) {
            if (!Modifier.isPublic(declaredConstructor.getModifiers()))
                continue;
            if (declaredConstructor.getParameterCount() > amountParameters) {
                amountParameters = declaredConstructor.getParameterCount();
                foundConstructor = declaredConstructor;
            }
        }
        return foundConstructor;
    }

    default @Nullable java.lang.reflect.Method findFactoryMethodWithMostNumberOfArguments(Class<?> nmsClass) {
        int amountParameters = 0;
        java.lang.reflect.Method foundMethod = null;
        for (java.lang.reflect.Method declaredMethod : nmsClass.getMethods()) {
            if (!Modifier.isPublic(declaredMethod.getModifiers()))
                continue;

            if (!Modifier.isStatic(declaredMethod.getModifiers()))
                continue;
            if (!declaredMethod.getReturnType().equals(nmsClass))
                continue;

            if (declaredMethod.getParameterCount() > amountParameters) {
                amountParameters = declaredMethod.getParameterCount();
                foundMethod = declaredMethod;
            }
        }
        return foundMethod;
    }

    record ParameterOrRecord(java.lang.reflect.Parameter parameter, RecordComponent recordComponent) {
        public ParameterOrRecord(java.lang.reflect.Parameter parameter) {
            this(parameter, null);
        }

        public ParameterOrRecord(RecordComponent recordComponent) {
            this(null, recordComponent);
        }

        public String getName() {
            return parameter != null ? parameter.getName() : recordComponent.getName();
        }

        public Type getGenericType() {
            return parameter != null ? parameter.getParameterizedType() : recordComponent.getGenericType();
        }
    }
}
