package de.verdox.mccreativelab.classgenerator;

import de.verdox.mccreativelab.classgenerator.codegen.ClassBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.type.ClassDescription;
import de.verdox.mccreativelab.classgenerator.codegen.type.impl.DynamicType;
import de.verdox.mccreativelab.classgenerator.codegen.expressions.CodeExpression;
import de.verdox.mccreativelab.classgenerator.codegen.expressions.Parameter;
import de.verdox.mccreativelab.classgenerator.wrapper.WrappedClass;
import de.verdox.mccreativelab.classgenerator.wrapper.WrappedClassRegistry;
import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy;
import net.bytebuddy.implementation.MethodDelegation;
import org.bukkit.event.Event;
import org.jetbrains.annotations.Nullable;
import org.reflections.Reflections;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.*;
import java.util.*;
import java.util.logging.Logger;

public class EventGeneratorFromBukkitPreset extends AbstractClassGenerator {
    private static final Logger LOGGER = Logger.getLogger(EventGeneratorFromBukkitPreset.class.getSimpleName());
    private final Map<Class<?>, ClassBuilder> DONE = new HashMap<>();

    public EventGeneratorFromBukkitPreset(File srcDir, String prefix, String suffix, List<Class<?>> excludedTypes, List<String> excludedPackages) {
        super(srcDir, prefix, suffix, excludedTypes, excludedPackages);
    }

    public void generateEventWrappers() throws IOException {
        Reflections reflections = new Reflections("org.bukkit");
        Set<Class<? extends Event>> subtypes = reflections.getSubTypesOf(Event.class);

        for (Class<? extends Event> subtype : subtypes) {
            generate(subtype);
        }
    }

    private ClassBuilder generateWrapper(Class<?> bukkitEventClass) throws IOException {
        if (DONE.containsKey(bukkitEventClass))
            return DONE.get(bukkitEventClass);
        ClassBuilder classBuilder = new ClassBuilder();
        classBuilder.withHeader("public", ClassBuilder.ClassHeader.CLASS, prefix + bukkitEventClass.getSimpleName(), "");
        classBuilder.withPackage(bukkitEventClass.getPackageName().replace("org.bukkit.", "de.verdox.mccreativelab.wrapper.").replace("com.destroystokyo.paper.", "de.verdox.mccreativelab.wrapper."));

        for (Field declaredField : bukkitEventClass.getDeclaredFields()) {
            if (Modifier.isStatic(declaredField.getModifiers())) {
                continue;
            }

            DynamicType fieldType = swapBukkitWithMCC(DynamicType.of(declaredField.getGenericType()));
            if (fieldType == null) {
                LOGGER.warning("Could not generate mcc event for bukkit event " + bukkitEventClass.getCanonicalName() + " because there is no mcc type for the bukkit type " + DynamicType.of(declaredField.getGenericType()));
                return null;
            }
            String modifier = Modifier.isFinal(declaredField.getModifiers()) ? "private final" : "private";

            classBuilder.withField(modifier, fieldType, declaredField.getName(), (CodeExpression) null);
        }

        int foundParameters = 0;
        Constructor<?> found = null;
        for (Constructor<?> declaredConstructor : bukkitEventClass.getDeclaredConstructors()) {
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                continue;
            }
            if (declaredConstructor.getParameters().length > foundParameters) {
                foundParameters = declaredConstructor.getParameters().length;
                found = declaredConstructor;
            }
        }

        if (found == null) {
            LOGGER.warning("Could not generate mcc event for bukkit event " + bukkitEventClass.getCanonicalName() + " because no constructor was found.");
            return null;
        }

        Parameter[] parameters = new Parameter[foundParameters];
        int counter = 0;
        for (java.lang.reflect.Parameter parameter : found.getParameters()) {
            Type genericParameterType = parameter.getParameterizedType();
            DynamicType parameterType = swapBukkitWithMCC(DynamicType.of(genericParameterType));
            if (parameterType == null) {
                LOGGER.warning("Could not generate mcc event for bukkit event " + bukkitEventClass.getCanonicalName() + " because there is no mcc type for the bukkit type " + DynamicType.of(genericParameterType));
                return null;
            }
            parameters[counter++] = new Parameter(parameterType, parameter.getName());
        }
        classBuilder.withConstructor("public", codeLineBuilder -> {

        }, parameters);

        if (Event.class.isAssignableFrom(bukkitEventClass.getSuperclass()) && !Event.class.equals(bukkitEventClass.getSuperclass())) {
            ClassBuilder parent = generateWrapper(bukkitEventClass.getSuperclass());
            if (parent == null) {
                LOGGER.warning("Could not generate mcc event for bukkit event " + bukkitEventClass.getCanonicalName() + " because the wrapper for the super type " + bukkitEventClass.getSuperclass().getCanonicalName() + " could not be generated");
                return null;
            }
            classBuilder.extendsClasses(DynamicType.of(parent.getClassDescription()));
        }

        classBuilder.writeClassFile(srcDir);
        DONE.put(bukkitEventClass, classBuilder);
        LOGGER.info("Generated event from bukkit source: " + classBuilder.getClassName());
        return classBuilder;
    }

    private ClassDescription generate(Class<?> originalClass) throws IOException {
        Type superType = Object.class;
        if (Event.class.isAssignableFrom(originalClass.getSuperclass())) {
            ClassDescription parent = generate(originalClass.getSuperclass());
            if (parent == null) {
                LOGGER.warning("Could not generate mcc event for bukkit event " + originalClass.getCanonicalName() + " because the wrapper for the super type " + originalClass.getSuperclass().getCanonicalName() + " could not be generated");
                return null;
            }
            superType = parent;
        }


        // ByteBuddy-Build-Prozess starten
        net.bytebuddy.dynamic.DynamicType.Builder<?> builder = new ByteBuddy()
            .subclass(superType, ConstructorStrategy.Default.NO_CONSTRUCTORS)
            .name(prefix + originalClass.getSimpleName());

        // Felder kopieren und Typen ersetzen
        for (Field field : originalClass.getDeclaredFields()) {
            int modifiers = field.getModifiers();
            if (Modifier.isStatic(modifiers)) {
                continue; // Statische Felder werden übersprungen
            }

            // Ersetze den Typ (Beispiel: Alle Typen durch String ersetzen)
            Class<?> fieldType = field.getType();
            DynamicType typeOfField = swapBukkitWithMCC(DynamicType.of(field.getGenericType(), false));
            if(typeOfField == null){
                LOGGER.warning("Could not generate mcc event for bukkit event " + originalClass.getCanonicalName() + " because the wrapper for the super type " + originalClass.getSuperclass().getCanonicalName() + " could not be generated");
            }

/*            if (fieldType == ItemStack.class) {
                fieldType = replaceType;
            }*/

            builder = builder.defineField(field.getName(), typeOfField.toType(), modifiers);
        }

        // Methoden kopieren (ohne Implementierungen)
        for (Method method : originalClass.getDeclaredMethods()) {
            int modifiers = method.getModifiers();

            if (Modifier.isStatic(modifiers) || Modifier.isNative(modifiers)) {
                continue; // Statische oder native Methoden überspringen
            }

            // Rückgabetyp und Parameter-Typen
            Class<?> returnType = method.getReturnType();
            Class<?>[] parameterTypes = method.getParameterTypes();

            builder = builder.defineMethod(
                    method.getName(),
                    returnType,
                    modifiers)
                .withParameters(parameterTypes).withoutCode();
        }

        // Neue Klasse erstellen
        net.bytebuddy.dynamic.DynamicType.Unloaded<?> dynamicType = builder.make();

        // Zielverzeichnis für Speicherung
        String outputDir = "output/classes";

        // Speichere die Klasse in das Zielverzeichnis

        String className = prefix + originalClass.getSimpleName();
        String classPackage = originalClass.getPackageName().replace("org.bukkit.", "de.verdox.mccreativelab.wrapper.").replace("com.destroystokyo.paper.", "de.verdox.mccreativelab.wrapper.");

        File file = new File(srcDir.getPath() + "/" + classPackage.replace(".", "/") + "/" + className + ".java");
        dynamicType.saveIn(file);
        System.out.println("Klasse erfolgreich kopiert und gespeichert: " + outputDir);
        ClassBuilder classBuilder = new ClassBuilder();
        classBuilder.withPackage(classPackage);
        classBuilder.withHeader("pulic", ClassBuilder.ClassHeader.CLASS, className, "");
        return new ClassDescription(classBuilder);
    }

    @Nullable
    private DynamicType swapBukkitWithMCC(DynamicType dynamicType) {
        Class<?> rawType = dynamicType.getRawType();
        if (rawType == null) {
            return null;
        }

        if (!rawType.getPackageName().contains("org.bukkit"))
            return dynamicType;

        WrappedClass wrappedClass = WrappedClassRegistry.INSTANCE.getWrappingInformationByApiName(prefix + rawType.getSimpleName());
        DynamicType swappedType;
        if (wrappedClass != null) {
            swappedType = DynamicType.of(wrappedClass.apiInterface(), false);
        } else {
            try {
                Class<?> found = Class.forName(prefix + rawType.getSimpleName());
                swappedType = DynamicType.of(found);
            } catch (ClassNotFoundException e) {
                return null;
            }
        }

        for (DynamicType genericType : dynamicType.getGenericTypes()) {
            DynamicType swappedGeneric = swapBukkitWithMCC(swappedType);
            if (swappedGeneric == null)
                return null;
            swappedType.withAddedGeneric(swappedGeneric);
        }
        return swappedType;
    }
}
