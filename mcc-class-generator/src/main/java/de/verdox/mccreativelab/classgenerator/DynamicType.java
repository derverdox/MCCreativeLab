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
            System.out.println(type + " is parameterized");
            ClassBuilder.ImportableClass importableClass = getNameForClass((Class<?>) parameterizedType.getRawType());
            importedClasses.add(importableClass);

            StringBuilder genericTypeName = new StringBuilder();
            genericTypeName.append(importableClass.className());
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
        } else if (type instanceof Class<?> clazz) {
            String name;
            if (clazz.isArray()) {
                name = getTypeNameOfChild(clazz.getComponentType()) + "[]";
                importedClasses.add(new ClassBuilder.ImportableClass(clazz.getComponentType()));
            } else {
                name = getNameForClass(clazz).className();
                if (!clazz.isPrimitive())
                    importedClasses.add(new ClassBuilder.ImportableClass(clazz));
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

        if (toCheck == null)
            return type;

        Class<?> apiClass = NMSMapper.getAPIClassOfNMSClass(toCheck);

        if (apiClass == null) {
            // If the class was not replaced by API but does not contain to the nms source we want to import it since it might be a library from dependencies
            if(!PACKAGE_EXCLUDE_FROM_IMPORT_PREDICATE.test(toCheck.getPackageName()))
                importedClasses.add(new ClassBuilder.ImportableClass(toCheck));

            return type;
        }
        importedClasses.add(new ClassBuilder.ImportableClass(apiClass));
        return apiClass;
    }

    private ClassBuilder.ImportableClass getNameForClass(Class<?> type) {
        return NMSMapper.getAPIClassNameForNMSClass(type);
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
}
