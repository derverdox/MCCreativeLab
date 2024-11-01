package de.verdox.mccreativelab.classgenerator;

import org.checkerframework.checker.units.qual.C;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

public class InterfaceGenerator {
    public static final Logger LOGGER = Logger.getLogger(ClassGenerator.class.getName());
    // Methoden ausschließen, deren Namen in dieser Liste stehen
    private final List<String> excludedMethodNames;
    private final List<Class<?>> excludedTypes;
    private final List<String> excludedPackages;
    private final File parentDirectory;
    private final String wrapperPrefix;
    private final Set<Class<?>> typesForInterfaces;
    private final Set<Class<?>> includedAPIClasses = new HashSet<>();

    public InterfaceGenerator(File file, String wrapperPrefix, List<String> excludedMethodNames, List<Class<?>> excludedTypes, List<String> excludedPackages, Class<?>... typesForInterfaces) {
        this(file, wrapperPrefix, excludedMethodNames, excludedTypes, excludedPackages, Set.copyOf(Arrays.stream(typesForInterfaces).toList()));
    }

    public InterfaceGenerator(File file, String wrapperPrefix, List<String> excludedMethodNames, List<Class<?>> excludedTypes, List<String> excludedPackages, Set<Class<?>> typesForInterfaces) {
        this.parentDirectory = file;
        this.wrapperPrefix = wrapperPrefix;
        this.excludedMethodNames = excludedMethodNames;
        this.excludedTypes = excludedTypes;
        this.excludedPackages = excludedPackages;
        this.typesForInterfaces = Set.copyOf(typesForInterfaces);
    }

    public void generateInterface(String packageName, Class<?> clazz, boolean isInnerClass, ClassBuilder classBuilder) {
        if (!isTypeAllowedToGenerateInterface(clazz))
            return;

        includedAPIClasses.clear();

        String interfaceName = isInnerClass ? clazz.getSimpleName() : wrapperPrefix + clazz.getSimpleName();

        classBuilder.withHeader("public", ClassBuilder.ClassHeader.INTERFACE, interfaceName);
        classBuilder.withPackage(packageName);

        NMSMapper.register(clazz, new ClassBuilder.ImportableClass(packageName, interfaceName));

        if (clazz.isRecord()) {
            for (RecordComponent component : clazz.getRecordComponents()) {

                String fieldName = component.getName();

                classBuilder.withAbstractMethod("public", "get" + fieldName, new DynamicType(component.getGenericType()));
                classBuilder.withAbstractMethod("public", "with" + fieldName, new DynamicType(component.getGenericType()));
            }

        } else {
            // Generating methods for the interface
            for (Method method : clazz.getMethods()) {
                if (!shouldIncludeMethod(method))
                    continue;
                if (Modifier.isStatic(method.getModifiers()) || !Modifier.isPublic(method.getModifiers()) || Modifier.isAbstract(method.getModifiers()))
                    continue;

                MethodOriginFinder methodOriginFinder = new MethodOriginFinder();
                methodOriginFinder.startFindingMethod(method);
                Method overridenMethod = methodOriginFinder.getOriginalMethod();
                if (overridenMethod == null)
                    continue;

                ClassBuilder.Parameter[] params = new ClassBuilder.Parameter[method.getParameters().length];
                int counter = 0;
                for (Parameter parameter : method.getParameters()) {
                    params[counter++] = new ClassBuilder.Parameter(new DynamicType(parameter.getParameterizedType()), parameter.getName());
                }

                classBuilder.withAbstractMethod("public", method.getName(), new DynamicType(method.getGenericReturnType()), params);
            }
        }

        for (Class<?> includedAPIClass : includedAPIClasses) {
            classBuilder.includeImport(new ClassBuilder.ImportableClass(includedAPIClass));
        }

        // Rekursion für innere Klassen
        for (Class<?> innerClass : clazz.getDeclaredClasses()) {
            if (!Modifier.isPrivate(innerClass.getModifiers())) { // Ignoriere private innere Klassen
                ClassBuilder childBuilder = new ClassBuilder();
                classBuilder.includeInnerClass(childBuilder);
                generateInterface(packageName, innerClass, true, childBuilder);
            }
        }

        if(!isInnerClass){
            // Write the interface to a .java file
            parentDirectory.mkdirs();

            String fileName = parentDirectory.getPath() + "/" + interfaceName + ".java";
            try (FileWriter writer = new FileWriter(fileName)) {
                StringBuilder code = new StringBuilder();
                classBuilder.buildClassFileString(code);
                writer.write(code.toString());
                LOGGER.info("Generated wrapper interface: " + interfaceName);
            } catch (IOException e) {
                LOGGER.warning("Error writing interface file: " + e.getMessage());
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
