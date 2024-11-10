package de.verdox.mccreativelab.classgenerator.wrapper;

import de.verdox.mccreativelab.classgenerator.AbstractClassGenerator;
import de.verdox.mccreativelab.classgenerator.ConverterGenerator;
import de.verdox.mccreativelab.classgenerator.NMSMapper;
import de.verdox.mccreativelab.classgenerator.codegen.ClassBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.DynamicType;
import de.verdox.mccreativelab.classgenerator.codegen.expressions.*;
import de.verdox.mccreativelab.classgenerator.util.FieldNameUtil;
import de.verdox.mccreativelab.classgenerator.wrapper.strategy.ClassGeneratorStrategy;
import de.verdox.mccreativelab.classgenerator.wrapper.strategy.RecordGeneratorStrategy;
import de.verdox.mccreativelab.classgenerator.wrapper.strategy.WrapperGeneratorStrategy;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.*;
import java.util.function.Function;
import java.util.logging.Logger;

public class WrapperInterfaceGenerator extends AbstractClassGenerator {
    public static final Logger LOGGER = Logger.getLogger(WrapperInterfaceGenerator.class.getName());

    public WrapperInterfaceGenerator(File srcDir, String wrapperPrefix, String wrapperSuffix, List<Class<?>> excludedTypes, List<String> excludedPackages) {
        super(srcDir, wrapperPrefix, wrapperSuffix, excludedTypes, excludedPackages);
    }

    @Nullable
    public WrappedClass generateWrapper(Class<?> nmsClass, String apiPackage, String implPackage, ConverterGenerator converterGenerator, DynamicType wrapperParentClass) {
        if (!isTypeAllowedToGenerateInterface(nmsClass))
            return null;
        ClassBuilder interfaceBuilder = new ClassBuilder();
        ClassBuilder implBuilder = new ClassBuilder();
        return generateWrapper(nmsClass, apiPackage, implPackage, false, interfaceBuilder, implBuilder, converterGenerator, wrapperParentClass);
    }

    private WrappedClass generateWrapper(Class<?> nmsClass, String apiPackage, String implPackage, boolean isInnerClass, ClassBuilder interfaceBuilder, ClassBuilder implBuilder, ConverterGenerator converterGenerator, DynamicType wrapperParentClass) {
        String interfaceName = prefix + nmsClass.getSimpleName();
        String implName = interfaceName + "Impl";
        interfaceBuilder.withPackage(apiPackage);

        ClassBuilder.ClassHeader header = ClassBuilder.ClassHeader.INTERFACE;
        if (nmsClass.isEnum()) {
            header = ClassBuilder.ClassHeader.ENUM;
        }
        interfaceBuilder.withHeader(isInnerClass ? "public static" : "public", header, interfaceName, suffix);

        if (nmsClass.isEnum()) {
            if (wrapperParentClass != null) {
                if (wrapperParentClass.getClassDescription().isInterface()) {
                    interfaceBuilder.implementsClasses(wrapperParentClass);
                } else {
                    interfaceBuilder.extendsClasses(wrapperParentClass);
                }
            }
        } else {
            if (wrapperParentClass != null) {
                if (wrapperParentClass.getClassDescription().isInterface()) {
                    interfaceBuilder.extendsClasses(wrapperParentClass);
                }
            }
            setupImplHeader(nmsClass, implPackage, isInnerClass, interfaceBuilder, implBuilder, converterGenerator, implName, interfaceName);
        }

        NMSMapper.register(nmsClass, interfaceBuilder.getClassDescription());


        List<WrappedClass> childClasses = new LinkedList<>();

        for (Class<?> innerClass : nmsClass.getDeclaredClasses()) {
            if (excludedTypes.contains(innerClass))
                continue;
            if (Modifier.isPublic(innerClass.getModifiers())) {

                ClassBuilder interfaceChild = new ClassBuilder();
                interfaceBuilder.includeInnerClass(interfaceChild);

                ClassBuilder implChild = new ClassBuilder();
                implBuilder.includeInnerClass(implChild);

                var childWrappedClass = generateWrapper(innerClass, apiPackage, implPackage, true, interfaceChild, implChild, converterGenerator, null);
                childClasses.add(childWrappedClass);
                if (interfaceChild.getClassDescription().isEnum()) continue;
                interfaceBuilder.withAbstractMethod("public", "create" + interfaceChild.getClassDescription().getClassName(), DynamicType.of(interfaceChild.getClassDescription(), false));
                implBuilder.withMethod("public", "create" + interfaceChild.getClassDescription().getClassName(), DynamicType.of(interfaceChild.getClassDescription(), false), codeLineBuilder -> {
                    codeLineBuilder.append("return new " + childWrappedClass.implementation().getClassName() + "(null);");
                });
            }
        }

        //TODO: Wir wollen für records die gleichen Methoden haben wie für die anderen. Unterschied -> Die NMSGetter function die bei normalen Klassen reflection anwendet

        if (nmsClass.isRecord()) {
            new RecordGeneratorStrategy().createGetterAndSetter(nmsClass, interfaceBuilder, implBuilder, converterGenerator);
        } else if (nmsClass.isEnum()) {
            for (Object enumConstant : nmsClass.getEnumConstants())
                interfaceBuilder.withEnumEntry(enumConstant.toString());
        } else {
            new ClassGeneratorStrategy().createGetterAndSetter(nmsClass, interfaceBuilder, implBuilder, converterGenerator);
        }

        if (!isInnerClass) {
            // Write the interface to a .java file
            srcDir.mkdirs();
            try {
                interfaceBuilder.writeClassFile(srcDir.getPath());
                if (!interfaceBuilder.getClassDescription().isEnum())
                    implBuilder.writeClassFile(srcDir.getPath());
                LOGGER.info("Generated wrapper interface: " + interfaceName);
            } catch (IOException e) {
                LOGGER.warning("Error writing interface file: " + e.getMessage());
            }
        }

        WrappedClass wrappedClass = new WrappedClass(nmsClass, interfaceBuilder.getClassDescription(), implBuilder.getClassDescription());
        WrappedClassRegistry.INSTANCE.register(wrappedClass);
        return wrappedClass;
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

    private static void setupImplHeader(Class<?> nmsClass, String implPackage, boolean isInnerClass, ClassBuilder interfaceBuilder, ClassBuilder implBuilder, ConverterGenerator converterGenerator, String implName, String interfaceName) {
        implBuilder.withHeader(isInnerClass ? "public static" : "public", ClassBuilder.ClassHeader.CLASS, implName, "implements " + interfaceName);
        implBuilder.withPackage(implPackage);
        implBuilder.includeImport(interfaceBuilder.getClassDescription());
        implBuilder.includeImport(nmsClass);
        implBuilder.withField("private final", DynamicType.of(nmsClass, false), "handle", null);
        implBuilder.includeImport(converterGenerator.getConverterClass());

        implBuilder.withConstructor("public", constructorCode -> {
            constructorCode.appendAndNewLine("this.handle = handle;");
        }, new de.verdox.mccreativelab.classgenerator.codegen.expressions.Parameter(DynamicType.of(nmsClass, false), "handle"));

        implBuilder.withMethod("public", "getHandle", DynamicType.of(nmsClass, false), codeLineBuilder -> codeLineBuilder.append("return this.handle;"));
    }
}
