package de.verdox.mccreativelab.classgenerator;

import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.component.DataComponents;
import net.minecraft.util.Unit;
import net.minecraft.world.item.AdventureModePredicate;
import net.minecraft.world.item.component.*;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

public class ClassGenerator {
    public static final Logger LOGGER = Logger.getLogger(ClassGenerator.class.getName());
    public static final File GENERATED_FOLDER = new File("../mcc-class-generator/src/main/java/de/verdox/mccreativelab/wrapper");

    public static void run() {
        if (!System.getenv("IS_IDEA").equals("true")) {
            LOGGER.info("Skipping class generator because not in IDEA");
            return;
        }
        LOGGER.info("Running class generator");


        generateItemComponentInterfaces();

    }

    private static void generateItemComponentInterfaces() {

        Class<?> dataComponentClass = DataComponents.class;
        LOGGER.info("Searching for DataComponents in " + dataComponentClass);

        Set<Class<?>> componentClasses = new HashSet<>();

        // Alle Felder der Klasse durchgehen
        for (Field field : dataComponentClass.getDeclaredFields()) {
            // Überprüfen, ob das Feld vom Typ DataComponentType ist
            if (DataComponentType.class.isAssignableFrom(field.getType())) {
                // Typ des generischen Parameters extrahieren
                Type genericType = field.getGenericType();
                if (genericType instanceof ParameterizedType) {
                    Type[] typeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
                    if (typeArguments.length > 0 && typeArguments[0] instanceof Class<?>) {
                        Class<?> componentType = (Class<?>) typeArguments[0];
                        componentClasses.add(componentType);
                    }
                }
            }
        }

        File parentDir = new File(GENERATED_FOLDER.getPath() + "/item/components/");
        try {
            FileUtils.deleteDirectory(parentDir);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        final List<String> excludedMethodNames = Arrays.asList(
            "toString",
            "hashCode",
            "contains",
            "equals",
            "test",
            "addToTooltip",
            "withTooltip",
            "innerTexture",
            "compareTo",
            "outerTexture"
        );
        final List<Class<?>> excludedTypes = List.of(
            AdventureModePredicate.class,
            Unit.class,
            WritableBookContent.class,
            WrittenBookContent.class,
            DebugStickState.class,
            BundleContents.Mutable.class,
            CustomData.class
        );
        final List<String> excludedPackages = List.of("java.");

        InterfaceGenerator interfaceGenerator = new InterfaceGenerator(parentDir, "MCC", excludedMethodNames, excludedTypes, excludedPackages, componentClasses);
        // Ergebnis ausgeben
        componentClasses.stream().filter(aClass -> NMSMapper.getAPIClassOfNMSClass(aClass) == null).filter(aClass -> !excludedTypes.contains(aClass)).forEach(aClass -> interfaceGenerator.generateInterface("de.verdox.mccreativelab.wrapper.item.components", aClass, false, new ClassBuilder()));
    }
}
