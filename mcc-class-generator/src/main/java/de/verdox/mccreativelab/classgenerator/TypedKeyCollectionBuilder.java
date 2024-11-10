package de.verdox.mccreativelab.classgenerator;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.classgenerator.codegen.ClassBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.DynamicType;
import de.verdox.mccreativelab.wrapper.MCCTypedKey;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.kyori.adventure.key.Key;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.schedule.Activity;
import net.minecraft.world.level.block.Blocks;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/**
 * Used to convert classes like Items.class or Blocks.class to MCCreativeLab classes
 */
public class TypedKeyCollectionBuilder extends AbstractClassGenerator {

    public TypedKeyCollectionBuilder(File srcDir, String prefix, String suffix, List<Class<?>> excludedTypes, List<String> excludedPackages) {
        super(srcDir, prefix, suffix, excludedTypes, excludedPackages);
    }

    public void generateForPlatformGroupingClass(Class<?> groupingClass, Class<?> typeToGroup, String minecraftRegistryKey, String newClassPackage, String groupClassName, ConverterGenerator converterGenerator) throws IOException, IllegalAccessException {
        ClassBuilder classBuilder = new ClassBuilder();
        classBuilder.withPackage(newClassPackage);
        classBuilder.withHeader("public", ClassBuilder.ClassHeader.CLASS, groupClassName, "");

        classBuilder.withField("public static final", DynamicType.of(Key.class), "VANILLA_REGISTRY_KEY", "Key.key(\"minecraft\", \"" + minecraftRegistryKey + "\")");

        for (Field declaredField : groupingClass.getDeclaredFields()) {
            if (!typeToGroup.isAssignableFrom(declaredField.getType())) {
                continue;
            }
            if (!Modifier.isPublic(declaredField.getModifiers())) {
                continue;
            }
            if (!Modifier.isStatic(declaredField.getModifiers())) {
                continue;
            }
            if (!Modifier.isFinal(declaredField.getModifiers())) {
                continue;
            }

            Type fieldType = declaredField.getGenericType();
            if (isForbiddenType(fieldType))
                continue;
            String fieldName = declaredField.getName();

            String key;
            DynamicType newFieldType = DynamicType.of(MCCTypedKey.class);
            DynamicType genericOfTypedKey;
            if (declaredField.getType().equals(ResourceKey.class)) {
                //TODO: Wenn es bereits ein resource key ist müssen wir seinen key auslesen
                //TODO: Danach erstellen ganz normal
                ResourceKey<?> resourceKey = (ResourceKey<?>) declaredField.get(null);
                key = resourceKey.location().getPath();
                genericOfTypedKey = DynamicType.of(fieldType, true).getGenericTypes().get(0);
            } else {
                key = fieldName.toLowerCase(Locale.ROOT);
                genericOfTypedKey = DynamicType.of(fieldType, true);
            }
            newFieldType = newFieldType.withAddedGeneric(genericOfTypedKey);

            StringBuilder initValue = new StringBuilder();
            initValue.append("MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key(\"minecraft\", \"").append(key).append("\"), VANILLA_REGISTRY_KEY, ");
            initValue.append("new TypeToken<").append(">(){}");
            initValue.append(")");


            classBuilder.withField("public static final", newFieldType, fieldName, initValue.toString());
            classBuilder.includeImport(DynamicType.of(Key.class));
            classBuilder.includeImport(DynamicType.of(TypeToken.class));
            classBuilder.includeImport(DynamicType.of(MCCPlatform.class));
            classBuilder.includeImport(genericOfTypedKey);
        }

        classBuilder.writeClassFile(srcDir);
    }
}
