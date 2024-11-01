package de.verdox.mccreativelab.classgenerator;

import de.verdox.mccreativelab.classgenerator.util.FieldNameUtil;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.component.DataComponents;
import net.minecraft.util.Unit;
import net.minecraft.world.item.AdventureModePredicate;
import net.minecraft.world.item.component.*;
import net.minecraft.world.level.block.entity.BannerPatternLayers;
import net.minecraft.world.level.block.entity.PotDecorations;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class ClassGenerator {
    public static final Logger LOGGER = Logger.getLogger(ClassGenerator.class.getName());

    public static void run() {
        LOGGER.info("Running class generator");


        try {
            generateMCCItemComponentWrapper();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void generateMCCItemComponentWrapper() throws IOException {
        File parentDir = new File("../mcc-wrapper/generated/");
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
            "addToTag",
            "tick",
            "save",
            "outerTexture"
        );
        final List<Class<?>> excludedTypes = List.of(
            AdventureModePredicate.class,
            Unit.class,
            WritableBookContent.class,
            WrittenBookContent.class,
            DebugStickState.class,
            BannerPatternLayers.class,
            BundleContents.class,
            ItemLore.class,
            Fireworks.class,
            PotDecorations.class,
            CustomData.class
        );
        final List<String> excludedPackages = List.of("java.");

        Class<?> dataComponentClass = DataComponents.class;
        LOGGER.info("Generating wrapper classes for DataComponents in " + dataComponentClass + " to " + parentDir.getAbsolutePath());

        // Alle Felder der Klasse durchgehen
        for (Field field : dataComponentClass.getDeclaredFields()) {
            // Überprüfen, ob das Feld vom Typ DataComponentType ist
            if (!DataComponentType.class.isAssignableFrom(field.getType())) {
                continue;
            }
            Type genericType = field.getGenericType();
            if (!(genericType instanceof ParameterizedType parameterizedType))
                continue;
            Type[] typeArguments = parameterizedType.getActualTypeArguments();
            if (!DataComponentType.class.isAssignableFrom(field.getType()))
                continue;

            if (typeArguments.length > 0 && typeArguments[0] instanceof Class<?> componentType) {
                if (NMSMapper.getAPIClassOfNMSClass(componentType) == null && !excludedTypes.contains(componentType)) {
                    WrapperInterfaceGenerator wrapperInterfaceGenerator = new WrapperInterfaceGenerator(new File("../mcc-wrapper/generated"), "MCC", "extends MCCItemComponentType", excludedMethodNames, excludedTypes, excludedPackages);
                    wrapperInterfaceGenerator.generateInterface("de.verdox.mccreativelab.wrapper.item.components", componentType, false, new ClassBuilder());
                }
            }
        }
    }
}
