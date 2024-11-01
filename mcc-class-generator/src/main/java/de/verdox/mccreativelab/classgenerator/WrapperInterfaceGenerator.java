package de.verdox.mccreativelab.classgenerator;

import de.verdox.mccreativelab.classgenerator.util.FieldNameUtil;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

public class WrapperInterfaceGenerator {
    public static final Logger LOGGER = Logger.getLogger(ClassGenerator.class.getName());

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

    public ClassBuilder.ImportableClass generateInterface(String packageName, Class<?> clazz, boolean isInnerClass, ClassBuilder classBuilder) {
        if (!isTypeAllowedToGenerateInterface(clazz))
            return new ClassBuilder.ImportableClass(clazz);

        includedAPIClasses.clear();

        String interfaceName = isInnerClass ? clazz.getSimpleName() : wrapperPrefix + clazz.getSimpleName();

        classBuilder.withHeader("public", ClassBuilder.ClassHeader.INTERFACE, interfaceName, wrapperSuffix);
        classBuilder.withPackage(packageName);

        ClassBuilder.ImportableClass thisAsImportableClass = new ClassBuilder.ImportableClass(packageName, interfaceName);

        NMSMapper.register(clazz, thisAsImportableClass);

        if (clazz.isRecord()) {
            for (RecordComponent component : clazz.getRecordComponents()) {

                String fieldName = component.getName();

                classBuilder.withAbstractMethod("public", "get" + FieldNameUtil.capitalize(fieldName), new DynamicType(component.getGenericType()));
                classBuilder.withAbstractMethod("public", "with" + FieldNameUtil.capitalize(fieldName), new DynamicType(clazz), new ClassBuilder.Parameter(new DynamicType(component.getGenericType()), "new" + FieldNameUtil.capitalize(fieldName)));
            }

        } else if (clazz.isEnum()) {

        } else {
            // Generating methods for the interface
            for (Field declaredField : clazz.getDeclaredFields()) {
                if(Modifier.isStatic(declaredField.getModifiers()))
                    continue;
                boolean isFinalField = Modifier.isFinal(declaredField.getModifiers());

                classBuilder.withAbstractMethod("public", "get" + FieldNameUtil.capitalize(declaredField.getName()), new DynamicType(declaredField.getGenericType()));

                if (isFinalField)
                    classBuilder.withAbstractMethod("public", "with" + FieldNameUtil.capitalize(declaredField.getName()), new DynamicType(thisAsImportableClass), new ClassBuilder.Parameter(new DynamicType(declaredField.getGenericType()), declaredField.getName()));
                else
                    classBuilder.withAbstractMethod("public", "set" + FieldNameUtil.capitalize(declaredField.getName()), new DynamicType(Void.class), new ClassBuilder.Parameter(new DynamicType(declaredField.getGenericType()), declaredField.getName()));

            }

/*            for (Method method : clazz.getMethods()) {
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
            }*/
        }

        for (Class<?> includedAPIClass : includedAPIClasses) {
            classBuilder.includeImport(new ClassBuilder.ImportableClass(includedAPIClass));
        }

        // Rekursion für innere Klassen
        for (Class<?> innerClass : clazz.getDeclaredClasses()) {
            if(excludedTypes.contains(innerClass))
                continue;
            if (!Modifier.isPrivate(innerClass.getModifiers())) { // Ignoriere private innere Klassen
                ClassBuilder childBuilder = new ClassBuilder();
                classBuilder.includeInnerClass(childBuilder);
                generateInterface(packageName, innerClass, true, childBuilder);
            }
        }

        if (!isInnerClass) {
            // Write the interface to a .java file
            parentDirectory.mkdirs();
            try {
                classBuilder.writeClassFile(parentDirectory.getPath());
                LOGGER.info("Generated wrapper interface: " + interfaceName);
            } catch (IOException e) {
                LOGGER.warning("Error writing interface file: " + e.getMessage());
            }
        }
        return new ClassBuilder.ImportableClass(packageName, interfaceName);
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
