package de.verdox.mccreativelab.classgenerator;

import de.verdox.mccreativelab.classgenerator.codegen.ClassBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.DynamicType;
import de.verdox.mccreativelab.classgenerator.codegen.type.ClassDescription;
import de.verdox.mccreativelab.classgenerator.codegen.expressions.*;
import de.verdox.mccreativelab.classgenerator.util.FieldNameUtil;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.*;
import java.util.logging.Logger;

public class WrapperInterfaceGenerator {
    public static final Logger LOGGER = Logger.getLogger(WrapperInterfaceGenerator.class.getName());

    private final String wrapperSuffix;
    private final List<String> excludedMethodNames;
    private final List<Class<?>> excludedTypes;
    private final List<String> excludedPackages;
    private final File parentDirectory;
    private final String wrapperPrefix;
    private final Set<Class<?>> includedAPIClasses = new HashSet<>();

    public WrapperInterfaceGenerator(File file, String wrapperPrefix, String wrapperSuffix, List<String> excludedMethodNames, List<Class<?>> excludedTypes, List<String> excludedPackages) {
        this.parentDirectory = file;
        this.wrapperPrefix = wrapperPrefix;
        this.wrapperSuffix = wrapperSuffix;
        this.excludedMethodNames = excludedMethodNames;
        this.excludedTypes = excludedTypes;
        this.excludedPackages = excludedPackages;
    }

    public void generateWrapper(Class<?> nmsClass, String apiPackage, String implPackage, NMSConverterGenerator nmsConverterGenerator) {
        if (!isTypeAllowedToGenerateInterface(nmsClass))
            return;
        generateWrapper(nmsClass, apiPackage, implPackage, false, new ClassBuilder(), new ClassBuilder(), nmsConverterGenerator);
    }

    private void generateWrapper(Class<?> nmsClass, String apiPackage, String implPackage, boolean isInnerClass, ClassBuilder interfaceBuilder, ClassBuilder implBuilder, NMSConverterGenerator nmsConverterGenerator) {
        String interfaceName = wrapperPrefix + nmsClass.getSimpleName();
        interfaceBuilder.withHeader("public", ClassBuilder.ClassHeader.INTERFACE, interfaceName, wrapperSuffix);
        interfaceBuilder.withPackage(apiPackage);

        NMSMapper.register(nmsClass, interfaceBuilder.getClassDescription());

        for (Class<?> innerClass : nmsClass.getDeclaredClasses()) {
            if (excludedTypes.contains(innerClass))
                continue;
            if (Modifier.isPublic(innerClass.getModifiers())) {

                ClassBuilder interfaceChild = new ClassBuilder();
                interfaceBuilder.includeInnerClass(interfaceChild);

                ClassBuilder implChild = new ClassBuilder();
                implBuilder.includeInnerClass(implChild);

                generateWrapper(innerClass, apiPackage, implPackage, true, interfaceChild, implChild, nmsConverterGenerator);
            }
        }

        String implName = interfaceName + "Impl";
        implBuilder.withHeader("public", ClassBuilder.ClassHeader.CLASS, implName, " implements " + interfaceName);
        implBuilder.withPackage(implPackage);
        implBuilder.includeImport(interfaceBuilder.getClassDescription());
        implBuilder.includeImport(nmsClass);
        implBuilder.withField("private final", DynamicType.of(nmsClass, false), "handle", null);
        implBuilder.includeImport(nmsConverterGenerator.getConverterClass());

        implBuilder.withConstructor("public", constructorCode -> {
            constructorCode.appendAndNewLine("this.handle = handle;");
        }, new de.verdox.mccreativelab.classgenerator.codegen.expressions.Parameter(DynamicType.of(nmsClass, false), "handle"));


        if (nmsClass.isRecord()) {
            buildRecordWrapper(nmsClass, implName, interfaceBuilder, implBuilder, nmsConverterGenerator);
        } else {

            int amountParameters = 0;
            Constructor<?> foundConstructor = null;
            for (Constructor<?> declaredConstructor : nmsClass.getDeclaredConstructors()) {
                if (!Modifier.isPublic(declaredConstructor.getModifiers()))
                    continue;
                if (declaredConstructor.getParameterCount() > amountParameters) {
                    amountParameters = declaredConstructor.getParameterCount();
                    foundConstructor = declaredConstructor;
                }
            }

            if (foundConstructor != null) {
                createGetterAndSetter(nmsClass, interfaceBuilder, implBuilder, foundConstructor.getParameters(), nmsConverterGenerator);
            }
            // If no constructor was found we might find a public static factory method
            else {
                for (Method declaredMethod : nmsClass.getDeclaredMethods()) {
                    if (!Modifier.isPublic(declaredMethod.getModifiers()))
                        continue;
                    if (!Modifier.isStatic(declaredMethod.getModifiers()))
                        continue;
                    if (!declaredMethod.getReturnType().equals(nmsClass))
                        continue;
                    createGetterAndSetter(nmsClass, interfaceBuilder, implBuilder, declaredMethod.getParameters(), nmsConverterGenerator);
                }
            }
        }

        for (Class<?> includedAPIClass : includedAPIClasses) {
            interfaceBuilder.includeImport(includedAPIClass);
            implBuilder.includeImport(includedAPIClass);
        }

        if (!isInnerClass) {
            // Write the interface to a .java file
            parentDirectory.mkdirs();
            try {
                interfaceBuilder.writeClassFile(parentDirectory.getPath());
                implBuilder.writeClassFile(parentDirectory.getPath());
                LOGGER.info("Generated wrapper interface: " + interfaceName);
            } catch (IOException e) {
                LOGGER.warning("Error writing interface file: " + e.getMessage());
            }
        }
    }

    private static @Nullable Field findNonStaticFieldInClassForParameter(Class<?> nmsClass, Parameter parameter) {
        Field fieldOfParameter = null;
        for (Field declaredField : nmsClass.getDeclaredFields()) {
            if (declaredField.getGenericType().equals(parameter.getParameterizedType()))
                fieldOfParameter = declaredField;
        }
        return fieldOfParameter;
    }

    /**
     * Used to tell the {@link NMSConverterGenerator} that we require a conversion function for the two types
     *
     * @param variableToConvert  the name of the field to convert
     * @param from               type1
     * @param to                 type2
     * @param converterGenerator the converter generator
     * @return the conversion code expression
     */
    private CodeExpression createConverterExpression(String variableToConvert, DynamicType from, DynamicType to, NMSConverterGenerator converterGenerator) {

        String functionName = converterGenerator.getConverterFunctionName(from, to);

        if (functionName.equals("implToApi22")) {
            LOGGER.info("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            LOGGER.info(from + "");
            LOGGER.info(to + "");
        }

        return new StringExpression("NMSConverter.INSTANCE.get()." + functionName + "(" + variableToConvert + ")");
    }

    private void buildRecordWrapper(Class<?> nmsClass, String wrapperClassName, ClassBuilder interfaceBuilder, ClassBuilder implBuilder, NMSConverterGenerator converterGenerator) {
        for (RecordComponent component : nmsClass.getRecordComponents()) {
            DynamicType dynamicType = DynamicType.of(component.getGenericType());
            if (excludedTypes.contains(component.getType()))
                continue;

            String fieldName = component.getName();

            interfaceBuilder.withAbstractMethod("public", "get" + FieldNameUtil.capitalize(fieldName), DynamicType.of(component.getGenericType()));
            interfaceBuilder.withAbstractMethod("public", "with" + FieldNameUtil.capitalize(fieldName), DynamicType.of(nmsClass), new de.verdox.mccreativelab.classgenerator.codegen.expressions.Parameter(DynamicType.of(component.getGenericType()), "new" + FieldNameUtil.capitalize(fieldName)));

            implBuilder.withMethod("public", "get" + FieldNameUtil.capitalize(fieldName), dynamicType, methodCode -> {

                if (NMSMapper.isSwapped(component.getGenericType())) {
                    LOGGER.info("api: " + DynamicType.of(component.getGenericType()) + ", impl: " + DynamicType.of(component.getGenericType(), false) + "(" + component.getGenericType() + ")");
                    converterGenerator.requireGeneratorFunction(DynamicType.of(component.getGenericType()), DynamicType.of(component.getGenericType(), false));
                    CodeExpression conversionExpression = createConverterExpression("handle." + fieldName + "()", DynamicType.of(component.getGenericType(), false), DynamicType.of(component.getGenericType()), converterGenerator);
                    methodCode.append("return ");
                    methodCode.append(conversionExpression);
                    methodCode.appendAndNewLine(";");
                } else
                    methodCode.append("return handle.").append(fieldName).appendAndNewLine("();");
            });
            implBuilder.withMethod("public", "with" + FieldNameUtil.capitalize(fieldName), DynamicType.of(nmsClass), methodCode -> {
                methodCode.append("var newHandle = new ").append(DynamicType.of(nmsClass, false).getTypeName());

                methodCode.appendVariablesInBrackets(Arrays.stream(nmsClass.getRecordComponents()).map(recordComponent -> {
                    if (recordComponent.equals(component))
                        return DynamicType.of(component.getGenericType()).toString();
                    else
                        return "handle." + recordComponent.getName() + "()";
                }).toArray(String[]::new));

                methodCode.appendAndNewLine(";");
                methodCode.appendAndNewLine("return new " + wrapperClassName + "(newHandle);");
            }, new de.verdox.mccreativelab.classgenerator.codegen.expressions.Parameter(DynamicType.of(component.getGenericType()), "new" + FieldNameUtil.capitalize(fieldName)));
        }
    }

    private void createGetterAndSetter(Class<?> nmsClass, ClassBuilder interfaceBuilder, ClassBuilder implBuilder, Parameter[] parameters, NMSConverterGenerator nmsConverterGenerator) {
        Map<Parameter, String> parameterToGetter = new HashMap<>();
        for (Parameter parameter : parameters) {
            String apiGetterMethodName = "get" + FieldNameUtil.capitalize(parameter.getName());
            String nmsGetterMethodName = apiGetterMethodName + "NMS";
            if (NMSMapper.isSwapped(parameter.getParameterizedType()))
                parameterToGetter.put(parameter, nmsGetterMethodName);
            else
                parameterToGetter.put(parameter, apiGetterMethodName);
        }

        for (Parameter parameter : parameters) {
            interfaceBuilder.withAbstractMethod("public", "get" + FieldNameUtil.capitalize(parameter.getName()), DynamicType.of(parameter.getParameterizedType()));
            interfaceBuilder.withAbstractMethod("public", "with" + FieldNameUtil.capitalize(parameter.getName()), DynamicType.of(interfaceBuilder.getClassDescription()), new de.verdox.mccreativelab.classgenerator.codegen.expressions.Parameter(DynamicType.of(parameter.getParameterizedType()), parameter.getName()));

            //Search for respective private attribute for the getter
            Field fieldOfParameter = findNonStaticFieldInClassForParameter(nmsClass, parameter);
            if (fieldOfParameter != null) {
                String apiGetterMethodName = "get" + FieldNameUtil.capitalize(parameter.getName());
                String nmsGetterMethodName = apiGetterMethodName + "NMS";

                boolean isReplacedByAPIClass = NMSMapper.isSwapped(parameter.getParameterizedType());


                implBuilder.withMethod("public", apiGetterMethodName, DynamicType.of(parameter.getParameterizedType()), codeLineBuilder -> {
                    if (isReplacedByAPIClass) {
                        codeLineBuilder.appendAndNewLine("var nms = " + nmsGetterMethodName + "();");
                        codeLineBuilder.append("return ");
                        nmsConverterGenerator.requireGeneratorFunction(DynamicType.of(parameter.getParameterizedType()), DynamicType.of(parameter.getParameterizedType(), false));
                        CodeExpression converterExpression = createConverterExpression("nms", DynamicType.of(parameter.getParameterizedType(), false), DynamicType.of(parameter.getParameterizedType()), nmsConverterGenerator);
                        codeLineBuilder.append(converterExpression);
                        codeLineBuilder.appendAndNewLine(";");
                    } else {
                        new ReflectiveFieldGetter("nms", nmsClass, parameter).write(codeLineBuilder);
                        codeLineBuilder.appendAndNewLine("return nms;");
                    }
                });

                if (isReplacedByAPIClass) {
                    implBuilder.withMethod("private", nmsGetterMethodName, DynamicType.of(parameter.getParameterizedType(), false), codeLineBuilder -> {
                        new ReflectiveFieldGetter("nms", nmsClass, parameter).write(codeLineBuilder);
                        codeLineBuilder.appendAndNewLine("return nms;");
                    });
                }

                implBuilder.withMethod("public", "with" + FieldNameUtil.capitalize(parameter.getName()), DynamicType.of(interfaceBuilder.getClassDescription()), codeLineBuilder -> {

                    int counter = 0;
                    Map<Parameter, LocalVariableAssignment> variables = new LinkedHashMap<>();
                    for (Parameter finalFoundConstructorParameter : parameters) {
                        if (finalFoundConstructorParameter.equals(parameter))
                            if (isReplacedByAPIClass) {
                                nmsConverterGenerator.requireGeneratorFunction(DynamicType.of(parameter.getParameterizedType()), DynamicType.of(parameter.getParameterizedType(), false));
                                CodeExpression conversionExpression = createConverterExpression(parameter.getName(), DynamicType.of(parameter.getParameterizedType()), DynamicType.of(parameter.getParameterizedType(), false), nmsConverterGenerator);
                                variables.put(finalFoundConstructorParameter, new LocalVariableAssignment("param" + (counter++), conversionExpression));
                            } else
                                variables.put(finalFoundConstructorParameter, new LocalVariableAssignment("param" + (counter++), new StringExpression(parameter.getName())));
                        else
                            variables.put(finalFoundConstructorParameter, new LocalVariableAssignment("param" + (counter++), new StringExpression(parameterToGetter.get(finalFoundConstructorParameter) + "()")));
                        variables.get(finalFoundConstructorParameter).write(codeLineBuilder);
                    }

                    codeLineBuilder.append("return ");
                    new ConstructorCall(DynamicType.of(implBuilder.getClassDescription(), false), new ConstructorCall(DynamicType.of(nmsClass, false), variables.values().stream().map(localVariableAssignment -> new StringExpression(localVariableAssignment.variableName())).toArray(CodeExpression[]::new))).write(codeLineBuilder);
                    codeLineBuilder.append(";");
                }, new de.verdox.mccreativelab.classgenerator.codegen.expressions.Parameter(DynamicType.of(parameter.getParameterizedType()), parameter.getName()));

                implBuilder.includeImport(fieldOfParameter.getGenericType());
                implBuilder.includeImport(parameter.getParameterizedType());
                implBuilder.includeImport(Field.class);
            }
        }
    }

    private boolean isTypeAllowedToGenerateInterface(Class<?> type) {
        for (String excludedPackage : excludedPackages) {
            if (type.getPackageName().contains(excludedPackage))
                return false;
        }
        for (Class<?> excludedType : excludedTypes) {
            if (type.equals(excludedType))
                return false;
        }
        return true;
    }

    // Prüft, ob eine Methode im Interface enthalten sein soll
    private boolean shouldIncludeMethod(Method method) {
        return !excludedMethodNames.contains(method.getName()) && !Modifier.isStatic(method.getModifiers()) && Modifier.isPublic(method.getModifiers()) && !Modifier.isAbstract(method.getModifiers());
    }
}
