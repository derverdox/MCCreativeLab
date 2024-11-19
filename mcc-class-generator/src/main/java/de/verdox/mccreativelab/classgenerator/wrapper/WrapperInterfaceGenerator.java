package de.verdox.mccreativelab.classgenerator.wrapper;

import de.verdox.mccreativelab.classgenerator.AbstractClassGenerator;
import de.verdox.mccreativelab.classgenerator.NMSMapper;
import de.verdox.mccreativelab.classgenerator.codegen.ClassBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.type.impl.DynamicType;
import de.verdox.mccreativelab.classgenerator.conversion.MCCConverterGenerator;
import de.verdox.mccreativelab.classgenerator.wrapper.strategy.ClassGeneratorStrategy;
import de.verdox.mccreativelab.classgenerator.wrapper.strategy.RecordGeneratorStrategy;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.*;
import java.util.*;
import java.util.logging.Logger;

public class WrapperInterfaceGenerator extends AbstractClassGenerator {
    public static final Logger LOGGER = Logger.getLogger(WrapperInterfaceGenerator.class.getName());

    private final String implPrefix;

    public WrapperInterfaceGenerator(File srcDir, String wrapperPrefix, String wrapperSuffix, String implPrefix, List<Class<?>> excludedTypes, List<String> excludedPackages) {
        super(srcDir, wrapperPrefix, wrapperSuffix, excludedTypes, excludedPackages);
        this.implPrefix = implPrefix;
    }

    @Nullable
    public WrappedClass generateWrapper(Class<?> nmsClass, String apiPackage, String implPackage, DynamicType wrapperParentClass, boolean withSetters) {
        if (!isTypeAllowedToGenerateInterface(nmsClass))
            return null;
        ClassBuilder interfaceBuilder = new ClassBuilder();
        ClassBuilder implBuilder = new ClassBuilder();
        return generateWrapper(nmsClass, apiPackage, implPackage, false, interfaceBuilder, implBuilder, wrapperParentClass, withSetters);
    }

    private WrappedClass generateWrapper(Class<?> nmsClass, String apiPackage, String implPackage, boolean isInnerClass, ClassBuilder interfaceBuilder, ClassBuilder implBuilder, DynamicType wrapperParentClass, boolean withSetters) {
        String interfaceName = prefix + nmsClass.getSimpleName();
        String implName = implPrefix + nmsClass.getSimpleName();
        interfaceBuilder.withPackage(apiPackage);
        if (wrapperParentClass != null)
            interfaceBuilder.includeImport(wrapperParentClass);

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
            setupImplHeader(nmsClass, implPackage, isInnerClass, interfaceBuilder, implBuilder, implName, interfaceName);
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

                var childWrappedClass = generateWrapper(innerClass, apiPackage, implPackage, true, interfaceChild, implChild, null, withSetters);
                childClasses.add(childWrappedClass);
                if (interfaceChild.getClassDescription().isEnum()) continue;
                if (withSetters) {
                    interfaceBuilder.withAbstractMethod("public", "create" + interfaceChild.getClassDescription().getClassName(), DynamicType.of(interfaceChild.getClassDescription(), false));
                    implBuilder.withMethod("public", "create" + interfaceChild.getClassDescription().getClassName(), DynamicType.of(interfaceChild.getClassDescription(), false), codeLineBuilder -> {
                        codeLineBuilder.append("return new " + childWrappedClass.implementation().getClassName() + "(null);");
                    });
                }
            }
        }

        if (nmsClass.isRecord()) {
            new RecordGeneratorStrategy().createGetterAndSetter(nmsClass, interfaceBuilder, implBuilder, withSetters);
        } else if (nmsClass.isEnum()) {
            for (Object enumConstant : nmsClass.getEnumConstants())
                interfaceBuilder.withEnumEntry(enumConstant.toString());
        } else {
            new ClassGeneratorStrategy().createGetterAndSetter(nmsClass, interfaceBuilder, implBuilder, withSetters);
        }

        NMSMapper.register(DynamicType.of(nmsClass, false), DynamicType.of(interfaceBuilder.getClassDescription(), false), false);

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

        WrappedClass wrappedClass = new WrappedClass(nmsClass, interfaceBuilder.getClassDescription(), implBuilder.getClassDescription().getClassName() == null || implBuilder.getClassDescription().getPackageName() == null ? null : implBuilder.getClassDescription());
        WrappedClassRegistry.INSTANCE.register(wrappedClass);
        return wrappedClass;
    }

    private boolean isTypeAllowedToGenerateInterface(Class<?> type) {
        for (String excludedPackage : excludedPackages) {
            if (type.getPackageName().contains(excludedPackage)) {
                return false;
            }
        }
        for (Class<?> excludedType : excludedTypes) {
            if (type.equals(excludedType)) {
                return false;
            }
        }
        return true;
    }

    private static void setupImplHeader(Class<?> nmsClass, String implPackage, boolean isInnerClass, ClassBuilder interfaceBuilder, ClassBuilder implBuilder, String implName, String interfaceName) {
        implBuilder.withHeader(isInnerClass ? "public static" : "public", ClassBuilder.ClassHeader.CLASS, implName, "");
        implBuilder.extendsClasses(DynamicType.of(NMSHandle.class).withAddedGeneric(DynamicType.of(nmsClass, false)));
        implBuilder.implementsClasses(DynamicType.of(interfaceBuilder.getClassDescription(), false));
        implBuilder.withPackage(implPackage);
        implBuilder.includeImport(interfaceBuilder.getClassDescription());
        implBuilder.includeImport(nmsClass);
        implBuilder.includeImport(DynamicType.of(NMSHandle.class));
        //implBuilder.includeImport(converterGenerator.getConverterClass());

        DynamicType implType = DynamicType.of(implBuilder.getClassDescription(), false);

        MCCConverterGenerator.createNMSHandleConverter(implBuilder, DynamicType.of(nmsClass, false), implType, DynamicType.of(interfaceBuilder.getClassDescription(), false));

        //implBuilder.withField("private final", DynamicType.of(nmsClass, false), "handle", null);
        implBuilder.withConstructor("public", constructorCode -> {
            constructorCode.append("super(handle);");
        }, new de.verdox.mccreativelab.classgenerator.codegen.expressions.Parameter(DynamicType.of(nmsClass, false), "handle"));
        //implBuilder.withMethod("public", "getHandle", DynamicType.of(nmsClass, false), codeLineBuilder -> codeLineBuilder.append("return this.handle;"));
    }
}
