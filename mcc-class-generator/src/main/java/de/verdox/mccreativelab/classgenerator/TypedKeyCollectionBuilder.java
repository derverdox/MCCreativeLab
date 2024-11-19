package de.verdox.mccreativelab.classgenerator;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.classgenerator.codegen.ClassBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.type.impl.DynamicType;
import de.verdox.mccreativelab.wrapper.registry.MCCRegistry;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.kyori.adventure.key.Key;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
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

    public List<Result> generateForPlatformGroupingClass(Class<?> groupingClass, Class<?> typeToGroup, String minecraftRegistryKey, String newClassPackage, String groupClassName) throws IOException, IllegalAccessException {
        List<Result> list = new LinkedList<>();

        ClassBuilder classBuilder = new ClassBuilder();
        classBuilder.withPackage(newClassPackage);
        classBuilder.withHeader("public", ClassBuilder.ClassHeader.CLASS, groupClassName, "");

        DynamicType apiTypeOfGroupedType = null;

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

            if (isForbiddenType(fieldType)) {
                //Logger.getLogger(TypedKeyCollectionBuilder.class.getSimpleName()).warning("Could not generate collection class " + groupClassName + " because a type was found that has no wrapper yet in MCC. (" + DynamicType.of(fieldType) + ")");
                continue;
            }
            String fieldName = declaredField.getName();

            String key;
            DynamicType newFieldType = DynamicType.of(MCCTypedKey.class);
            DynamicType genericOfTypedKey;
            DynamicType nativeType;
            if (declaredField.getType().equals(ResourceKey.class) || Holder.class.isAssignableFrom(declaredField.getType())) {
                //TODO: Wenn es bereits ein resource key ist müssen wir seinen key auslesen
                //TODO: Danach erstellen ganz normal
                try {
                    ResourceKey<?> resourceKey;
                    if(Holder.class.isAssignableFrom(declaredField.getType())){
                        resourceKey = ((Holder<?>)declaredField.get(null)).unwrapKey().get();
                    }
                    else {
                        resourceKey = (ResourceKey<?>) declaredField.get(null);
                    }
                    key = resourceKey.location().getPath();
                    nativeType = DynamicType.of(fieldType, false).getGenericTypes().get(0);
                    genericOfTypedKey = DynamicType.of(fieldType, true).getGenericTypes().get(0);
                }
                catch (Throwable e){
                    //LOGGER.warning("Could not determine type of field "+fieldName+" of class "+groupingClass+" with type "+DynamicType.of(fieldType, false)+" ("+DynamicType.of(fieldType, true)+")");
                    e.printStackTrace();
                    continue;
                }
            }
            else if(typeToGroup.isAssignableFrom(declaredField.getType())){
                key = fieldName.toLowerCase(Locale.ROOT);
                nativeType = DynamicType.of(fieldType, false);
                genericOfTypedKey = DynamicType.of(fieldType, true);
            }
            else {
                LOGGER.warning("Could not determine type of field "+fieldName+" of class "+groupingClass+" with type "+DynamicType.of(fieldType, false)+" ("+DynamicType.of(fieldType, true)+")");
                continue;
            }

            if (isForbiddenType(nativeType)) {
                Logger.getLogger(TypedKeyCollectionBuilder.class.getSimpleName()).warning("Skipping field "+fieldName+"("+fieldType+")"+" of collection class " + groupClassName);
                continue;
            }
            newFieldType = newFieldType.withAddedGeneric(genericOfTypedKey);
            if (apiTypeOfGroupedType == null) {
                apiTypeOfGroupedType = genericOfTypedKey;
                classBuilder.withField("public static final", DynamicType.of(MCCTypedKey.class).withAddedGeneric(DynamicType.of(MCCRegistry.class).withAddedGeneric(apiTypeOfGroupedType)), "VANILLA_REGISTRY", "MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key(\"minecraft\", \"root\"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});");
            }


            StringBuilder initValue = new StringBuilder();
            /*            initValue.append("VANILLA_REGISTRY.get().getReference(Key.key(\"minecraft\", \"").append(key).append("\")).get();");*/
            initValue.append("MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key(\"minecraft\", \"").append(key).append("\"), VANILLA_REGISTRY_KEY, ");
            initValue.append("new TypeToken<").append(">(){}");
            initValue.append(")");

            classBuilder.withField("public static final", newFieldType, fieldName, initValue.toString());
            classBuilder.includeImport(DynamicType.of(Key.class));
            classBuilder.includeImport(DynamicType.of(TypeToken.class));
            classBuilder.includeImport(DynamicType.of(MCCPlatform.class));
            classBuilder.includeImport(genericOfTypedKey);

            list.add(new Result(groupingClass, declaredField.getName(), nativeType, fieldName, genericOfTypedKey));
        }
        if(list.isEmpty()){
            Logger.getLogger(TypedKeyCollectionBuilder.class.getSimpleName()).warning("Could not generate collection class " + groupClassName + " because no fields were found.");
            return list;
        }
        else {
            classBuilder.writeClassFile(srcDir);
        }
        return list;
    }

    public record Result(Class<?> groupingClass, String nmsFieldName, DynamicType nmsFieldType, String apiFieldName,
                         DynamicType apiFieldType) {}
}
