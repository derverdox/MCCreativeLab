package de.verdox.mccreativelab.classgenerator.conversion;

import de.verdox.mccreativelab.classgenerator.ConverterGenerator;
import de.verdox.mccreativelab.classgenerator.codegen.ClassBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.DynamicType;
import de.verdox.mccreativelab.classgenerator.codegen.expressions.ReflectiveFieldGetter;
import io.papermc.paper.adventure.PaperAdventure;
import net.kyori.adventure.key.Key;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.registries.VanillaRegistries;
import net.minecraft.resources.ResourceKey;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class HolderKeyConversion implements ConverterGenerator.ConversionMethodCreator {
    @Override
    public boolean generate(ConverterGenerator converterGenerator, DynamicType from, DynamicType to, String assignedMethodName, String fromParameterName, String outputParameterName, CodeLineBuilder methodBuilder, ClassBuilder classBuilder) {
        if (from.getRawType() == null || to.getRawType() == null)
            return false;
        if (Holder.class.isAssignableFrom(from.getRawType()) && Key.class.equals(to.getRawType())) {
            methodBuilder.appendAndNewLine("var key = from.unwrapKey().orElseThrow().location();");
            methodBuilder.appendAndNewLine("var " + outputParameterName + " = Key.key(key.getNamespace(), key.getPath());");
            return true;
        } else if (Key.class.equals(from.getRawType()) && Holder.class.isAssignableFrom(to.getRawType())) {
            DynamicType nmsRegistryElementType = to.getGenericTypes().get(0);

            String foundBuiltinRegistryFieldName = findBuiltinRegistryFieldName(nmsRegistryElementType);
            //TODO: Either find the right registry in BuiltInRegistries or perform a VanillaRegistry lookup

            classBuilder.includeImport(DynamicType.of(BuiltInRegistries.class, false));
            classBuilder.includeImport(DynamicType.of(PaperAdventure.class, false));
            if (foundBuiltinRegistryFieldName != null) {
                methodBuilder.append("var " + outputParameterName + " = BuiltInRegistries.").append(foundBuiltinRegistryFieldName).appendAndNewLine(".getHolder(PaperAdventure.asVanilla(" + fromParameterName + ")).get();");
            } else {

                Field foundField = null;
                for (Field field : Registries.class.getFields()) {
                    if (!Modifier.isPublic(field.getModifiers()))
                        continue;
                    if (!Modifier.isStatic(field.getModifiers()))
                        continue;
                    if (!field.getType().equals(ResourceKey.class))
                        continue;
                    DynamicType registryKeyType = DynamicType.of(field.getGenericType(), false);
                    if (!registryKeyType.getGenericTypes().get(0).compareWithoutGenerics(to))
                        continue;
                    foundField = field;
                }
                if (foundField == null)
                    return false;

                var registry = "Registries." + foundField.getName();
                var resourceKeyCreation = "ResourceKey.create("+registry+", PaperAdventure.asVanilla("+fromParameterName+"))";
                methodBuilder.append("var " + outputParameterName + " = VanillaRegistries.createLookup().asGetterLookup().get(").append(registry).append(", "+resourceKeyCreation).appendAndNewLine(").get();");

                //TODO:
                // return VanillaRegistries.createLookup().asGetterLookup().get(Registries.TRIM_MATERIAL, ResourceKey.create(Registries.TRIM_MATERIAL, PaperAdventure.asVanilla(from))).get();
                return true;
            }
            return true;
        }
        return false;
    }

    @Nullable
    private String findBuiltinRegistryFieldName(DynamicType registryElementType) {
        for (Field field : BuiltInRegistries.class.getFields()) {
            DynamicType fieldType = DynamicType.of(field.getGenericType(), false);
            if (fieldType.getGenericTypes().size() == 1 && fieldType.getGenericTypes().get(0).equals(registryElementType))
                return field.getName();
        }
        return null;
    }
}
