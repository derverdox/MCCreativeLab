package de.verdox.mccreativelab.classgenerator;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.Predicate;

public class DynamicType {
    public static final Predicate<String> PACKAGE_EXCLUDE_FROM_IMPORT_PREDICATE = packageName -> packageName.contains("net.minecraft") || packageName.contains("org.craftbukkit");
    private final Type type;
    private final Set<ClassBuilder.ImportableClass> importedClasses = new HashSet<>();

    public DynamicType(Type type) {
        this.type = trySwapWithApiClass(type);
    }

    public String toString() {
        if (type instanceof ParameterizedType parameterizedType) {
            ClassBuilder.ImportableClass importableClass = getNameForClass((Class<?>) parameterizedType.getRawType());


            StringBuilder genericTypeName = new StringBuilder();

            ClassBuilder.ImportableClass swappedGeneric = NMSMapper.getAPIGenericClassOfNMSClass((Class<?>) parameterizedType.getRawType());
            if (swappedGeneric != null)
                addImport(swappedGeneric);
            else
                addImport((Class<?>) parameterizedType.getRawType());

            genericTypeName.append(swappedGeneric != null ? swappedGeneric.className() : importableClass.className());
            genericTypeName.append("<");

            Type[] typeArguments = parameterizedType.getActualTypeArguments();
            for (int i = 0; i < typeArguments.length; i++) {
                Type argument = typeArguments[i];
                genericTypeName.append(getTypeNameOfChild(argument));

                if (i < typeArguments.length - 1) {
                    genericTypeName.append(", ");
                }
            }
            genericTypeName.append(">");

            return genericTypeName.toString();
        } else if (type instanceof ClassBuilder.ImportableClass importableClass) {
            return importableClass.getTypeName();
        } else if (type instanceof Class<?> clazz) {
            String name;
            if (clazz.isArray()) {
                name = getTypeNameOfChild(clazz.getComponentType()) + "[]";
                addImport(clazz.getComponentType());
            } else {
                name = getNameForClass(clazz).className();
                if (!isPrimitiveType(clazz))
                    addImport(clazz);
            }
            return name;
        }
        return type.toString();
    }

    public String getTypeNameOfChild(Type type) {
        DynamicType dynamicType = new DynamicType(type);
        importedClasses.addAll(dynamicType.getImportedClasses());
        return dynamicType.toString();
    }

    public Set<ClassBuilder.ImportableClass> getImportedClasses() {
        return Set.copyOf(importedClasses);
    }

    @NotNull
    private Type trySwapWithApiClass(Type type) {
        Class<?> toCheck = null;
        if (type instanceof ParameterizedType parameterizedType) {
            toCheck = (Class<?>) parameterizedType.getRawType();
        } else if (type instanceof Class<?> clazz) {
            toCheck = clazz;
        }

        if (isPrimitiveType(toCheck))
            return type;

        if (toCheck == null)
            return type;

        Class<?> apiClass = NMSMapper.getAPIClassOfNMSClass(toCheck);

        if (apiClass == null) {
            // If the class was not replaced by API but does not contain to the nms source we want to import it since it might be a library from dependencies
            addImport(toCheck);
            return type;
        }
        addImport(apiClass);
        return apiClass;
    }

    private ClassBuilder.ImportableClass getNameForClass(Class<?> type) {
        return NMSMapper.getAPIClassNameForNMSClass(type);
    }

    private void addImport(ClassBuilder.ImportableClass importableClass) {
        importedClasses.add(importableClass);
    }

    private void addImport(Class<?> clazz) {
        if (isPrimitiveType(clazz))
            return;
        if (PACKAGE_EXCLUDE_FROM_IMPORT_PREDICATE.test(clazz.getPackageName()))
            return;
        addImport(new ClassBuilder.ImportableClass(clazz));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DynamicType that = (DynamicType) o;
        return Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, importedClasses);
    }

    public static boolean isPrimitiveType(Class<?> clazz) {
        return clazz == int.class || clazz == boolean.class || clazz == double.class ||
            clazz == long.class || clazz == short.class || clazz == byte.class ||
            clazz == char.class || clazz == float.class || clazz == void.class;
    }
}
