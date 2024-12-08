package de.verdox.mccreativelab.classgenerator;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.classgenerator.codegen.ClassBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.type.impl.DynamicType;
import de.verdox.mccreativelab.wrapper.platform.factory.TypedKeyFactory;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.registry.MCCRegistry;
import de.verdox.mccreativelab.wrapper.registry.MCCTag;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.bytebuddy.implementation.bytecode.Throw;
import net.kyori.adventure.key.Key;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Blocks;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

/**
 * Used to convert classes like Items.class or Blocks.class to MCCreativeLab classes
 */
public class TypedKeyCollectionBuilder extends AbstractClassGenerator {

    public TypedKeyCollectionBuilder(File srcDir, String prefix, String suffix, List<Class<?>> excludedTypes, List<String> excludedPackages) {
        super(srcDir, prefix, suffix, excludedTypes, excludedPackages);
    }

    public <F> List<Result> generateForPlatformGroupingClass(Class<?> groupingClass, TypeToken<F> typeToGroup, ResourceKey<? extends Registry<F>> registryKey, String newClassPackage, String groupClassName) throws IOException, IllegalAccessException {
        Logger.getLogger(TypedKeyCollectionBuilder.class.getSimpleName()).info("Generate collection class " + groupClassName + ".");
        List<Result> list = new LinkedList<>();

        Registry<F> registry = (Registry<F>) BuiltInRegistries.REGISTRY.get(registryKey.location());
        String minecraftRegistryKey = registryKey.location().getPath();
        ClassBuilder classBuilder = new ClassBuilder();
        classBuilder.withPackage(newClassPackage);
        classBuilder.withHeader("public", ClassBuilder.ClassHeader.CLASS, groupClassName, "");

        classBuilder.withField("public static final", DynamicType.of(Key.class), "VANILLA_REGISTRY_KEY", "Key.key(\"minecraft\", \"" + minecraftRegistryKey + "\")");

        for (Field declaredField : groupingClass.getDeclaredFields()) {
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
            Object fieldValue = declaredField.get(null);
            if (isForbiddenType(fieldType)) {
                Logger.getLogger(TypedKeyCollectionBuilder.class.getSimpleName()).warning("Type was found that has no wrapper yet in MCC. (" + DynamicType.of(fieldType, false) + ")");
                continue;
            }
            String fieldName = declaredField.getName();
            DynamicType resultFieldType;
            Type nativeType;

            try {
                if (ResourceKey.class.isAssignableFrom(declaredField.getType()) ||
                    Holder.class.isAssignableFrom(declaredField.getType()) ||
                    TagKey.class.isAssignableFrom(declaredField.getType())) {
                    ParameterizedType type = (ParameterizedType) declaredField.getGenericType();
                    nativeType = type.getActualTypeArguments()[0];

                    String key;
                    if (fieldValue instanceof ResourceKey<?> resourceKey) {
                        key = resourceKey.location().getPath();
                        resultFieldType = setupTypedKeyField(classBuilder, key, fieldName, nativeType);
                    } else if (fieldValue instanceof Holder<?> holder) {
                        key = holder.unwrapKey().get().location().getPath();
                        resultFieldType = setupReferenceField(classBuilder, key, fieldName, nativeType);
                    } else if (fieldValue instanceof TagKey<?> tagKey) {
                        key = tagKey.location().getPath();
                        resultFieldType = setupTagKeyField(classBuilder, key, fieldName, nativeType);
                    } else {
                        throw new IllegalStateException("Could not create field for " + fieldName + " with type " + declaredField.getGenericType());
                    }
                } else if (typeToGroup.getRawType().isAssignableFrom(declaredField.getType())) {
                    ResourceLocation resourceLocation = registry.getKey((F) fieldValue);
                    String key = resourceLocation.getPath();
                    nativeType = fieldType;
                    resultFieldType = setupReferenceField(classBuilder, key, fieldName, fieldType);
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable e) {
                Logger.getLogger(TypedKeyCollectionBuilder.class.getSimpleName()).warning("Exceptionally (" + e.getCause() + ") skipping field " + fieldName + "(" + fieldType + ")" + " of collection class " + groupClassName);
                continue;
            }

            if (isForbiddenType(nativeType)) {
                Logger.getLogger(TypedKeyCollectionBuilder.class.getSimpleName()).warning("Skipping forbidden field " + fieldName + "(" + fieldType + ")" + " of collection class " + groupClassName);
                continue;
            }

            classBuilder.includeImport(DynamicType.of(Key.class));
            classBuilder.includeImport(DynamicType.of(TypeToken.class));
            classBuilder.includeImport(DynamicType.of(MCCPlatform.class));
            list.add(new Result(groupingClass, declaredField.getName(), DynamicType.of(fieldType, false), fieldName, resultFieldType));
        }
        if (list.isEmpty()) {
            Logger.getLogger(TypedKeyCollectionBuilder.class.getSimpleName()).warning("Could not generate collection class " + groupClassName + " because no fields were found.");
            return list;
        } else {
            classBuilder.writeClassFile(srcDir);
        }
        return list;
    }

    public record Result(Class<?> groupingClass, String nmsFieldName, DynamicType nmsFieldType, String apiFieldName,
                         DynamicType apiFieldType) {}

    private DynamicType setupTypedKeyField(ClassBuilder classBuilder, String key, String fieldName, Type nativeType) {
        DynamicType swappedNativeType = NMSMapper.getSwap(nativeType);
        DynamicType resultFieldType = DynamicType.of(MCCTypedKey.class).withAddedGeneric(swappedNativeType);

        String initValue = "MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key(\"minecraft\", \"" + key + "\"), VANILLA_REGISTRY_KEY, new TypeToken<>(){})";
        classBuilder.withField("public static final", resultFieldType, fieldName, initValue);
        classBuilder.includeImport(swappedNativeType);

        return resultFieldType;
    }

    private DynamicType setupReferenceField(ClassBuilder classBuilder, String key, String fieldName, Type nativeType) {
        DynamicType swappedNativeType = DynamicType.of(nativeType);
        DynamicType resultFieldType = DynamicType.of(MCCReference.class).withAddedGeneric(swappedNativeType);

        String initValue = "MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key(\"minecraft\", \"" + key + "\"), VANILLA_REGISTRY_KEY, new TypeToken<" + swappedNativeType.toString() + ">(){}).getAsReference()";
        classBuilder.withField("public static final", resultFieldType, fieldName, initValue);
        classBuilder.includeImport(swappedNativeType);

        return resultFieldType;
    }

    private DynamicType setupTagKeyField(ClassBuilder classBuilder, String key, String fieldName, Type nativeType) {
        DynamicType swappedNativeType = DynamicType.of(nativeType);
        DynamicType resultFieldType = DynamicType.of(MCCTag.class).withAddedGeneric(swappedNativeType);

        String initValue = "MCCPlatform.getInstance().getTypedKeyFactory().createTag(Key.key(\"minecraft\", \"" + key + "\"), VANILLA_REGISTRY_KEY, new TypeToken<>(){})";
        classBuilder.withField("public static final", resultFieldType, fieldName, initValue);
        classBuilder.includeImport(swappedNativeType);

        return resultFieldType;
    }
}
