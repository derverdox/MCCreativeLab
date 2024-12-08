package de.verdox.mccreativelab.classgenerator;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.classgenerator.codegen.ClassBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.type.impl.DynamicType;
import de.verdox.mccreativelab.classgenerator.codegen.expressions.CodeExpression;
import de.verdox.mccreativelab.classgenerator.conversion.*;
import de.verdox.mccreativelab.classgenerator.wrapper.WrappedClass;
import de.verdox.mccreativelab.classgenerator.wrapper.WrappedClassRegistry;
import de.verdox.mccreativelab.classgenerator.wrapper.WrapperInterfaceGenerator;
import de.verdox.mccreativelab.impl.paper.platform.PaperPlatform;
import de.verdox.mccreativelab.impl.vanilla.item.components.NMSDataComponentType;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSPlatform;
import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.entity.MCCEntityType;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuTypes;
import de.verdox.mccreativelab.wrapper.item.MCCAttributeModifier;
import de.verdox.mccreativelab.wrapper.item.components.MCCDataComponentType;
import de.verdox.mccreativelab.wrapper.item.components.MCCItemComponent;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.kyori.adventure.key.Key;
import net.minecraft.advancements.Advancement;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.advancements.packs.VanillaAdventureAdvancements;
import net.minecraft.data.advancements.packs.VanillaHusbandryAdvancements;
import net.minecraft.data.advancements.packs.VanillaNetherAdvancements;
import net.minecraft.data.advancements.packs.VanillaTheEndAdvancements;
import net.minecraft.data.worldgen.DimensionTypes;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.stats.StatType;
import net.minecraft.stats.Stats;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.util.Unit;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.memory.MemoryModuleType;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.ai.village.poi.PoiTypes;
import net.minecraft.world.entity.animal.FrogVariant;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraft.world.entity.decoration.PaintingVariants;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerType;
import net.minecraft.world.entity.schedule.Schedule;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.*;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.item.armortrim.TrimPattern;
import net.minecraft.world.item.armortrim.TrimPatterns;
import net.minecraft.world.item.component.*;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.ItemEnchantments;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BannerPatternLayers;
import net.minecraft.world.level.block.entity.DecoratedPotPattern;
import net.minecraft.world.level.block.entity.DecoratedPotPatterns;
import net.minecraft.world.level.block.entity.PotDecorations;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.levelgen.structure.StructureType;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.function.TriConsumer;
import org.apache.commons.lang3.function.TriFunction;
import org.bukkit.event.inventory.InventoryType;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Locale;
import java.util.function.*;
import java.util.logging.Logger;

public class ClassGenerator {

    //TODO: ItemKeys -> Create class that contains all Item keys
    //TODO: BlockItemKeys -> Create a class that contains all BlockItems

    public static final Logger LOGGER = Logger.getLogger(ClassGenerator.class.getName());
    public static final File GENERATION_DIR = new File("../../mcc-wrapper/generated/");
    public static final List<String> EXCLUDED_PACKAGES = List.of("java.");
    ;

    private static final List<Class<?>> excludedTypes = List.of(
        AdventureModePredicate.class,
        Unit.class,
        WritableBookContent.class,
        WrittenBookContent.class,
        DebugStickState.class,
        BannerPatternLayers.class,
        BundleContents.class,
        Fireworks.class,
        PotDecorations.class,
        CustomData.class,
        ItemEnchantments.class,
        ChargedProjectiles.class,
        ItemContainerContents.class,
        Function.class,
        BiFunction.class,
        TriFunction.class,
        Consumer.class,
        BiConsumer.class,
        TriConsumer.class,
        Predicate.class,
        BiPredicate.class
    );


    public static void run() {
        LOGGER.info("Running class generator");
        try {
            MCCPlatform.INSTANCE.setup(new PaperPlatform(null), MCCPlatform::init);
            generateMCCItemComponentWrapper();
            createItemComponentConverters();
            generateMenuTypesClass();
            generateTypedKeys();
            //generateEventClasses();
            //converterGenerator.buildConverterInterface(GENERATION_DIR);
            //converterGenerator.buildWrapperAdapters(GENERATION_DIR);
            MCCConverterGenerator.createGeneratedConvertersClass(GENERATION_DIR);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private static void generateEventClasses() throws IOException {
        EventGeneratorFromBukkitPreset generator = new EventGeneratorFromBukkitPreset(new File("../../mcc-wrapper/generated"), "MCC", "", excludedTypes, EXCLUDED_PACKAGES);
        generator.generateEventWrappers();
    }

    private static void generateMCCItemComponentWrapper() throws IOException {
        File parentDir = new File("../../mcc-wrapper/generated/");
        try {
            FileUtils.deleteDirectory(parentDir);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        Class<?> dataComponentClass = DataComponents.class;
        LOGGER.info("Generating wrapper classes for DataComponents in " + dataComponentClass + " to " + parentDir.getAbsolutePath());


        WrapperInterfaceGenerator generator = new WrapperInterfaceGenerator(new File("../../mcc-wrapper/generated"), "MCC", "", "NMS", excludedTypes, EXCLUDED_PACKAGES);
        // Alle Felder der Klasse durchgehen
        for (Field field : dataComponentClass.getDeclaredFields()) {
            // Überprüfen, ob das Feld vom Typ DataComponentType ist

            if (!DataComponentType.class.isAssignableFrom(field.getType())) {
                continue;
            }
            Type genericType = field.getGenericType();
            if (!(genericType instanceof ParameterizedType parameterizedType)) {
                continue;
            }
            Type[] typeArguments = parameterizedType.getActualTypeArguments();

            DynamicType fieldType = DynamicType.of(MCCDataComponentType.class);

            if (typeArguments.length > 0) {
                if (typeArguments[0] instanceof Class<?> componentType) {
                    if(NMSMapper.isSwapped(componentType) && !NMSMapper.getSwap(componentType).getClassDescription().getPackageName().contains("de.verdox.mccreativelab")){
                        continue;
                    }


                    if (!excludedTypes.contains(componentType)) {
                        generator.generateWrapper(componentType, "de.verdox.mccreativelab.wrapper.item.components", "de.verdox.mccreativelab.impl.vanilla.wrapper.item.components", DynamicType.of(MCCItemComponent.class), true);
                        DynamicType generic = DynamicType.of(field.getGenericType(), false).getGenericTypes().get(0);
                        fieldType = fieldType.withAddedGeneric(generic);
                    }
                }
            }
        }
/*                classBuilder.writeClassFile(parentDir);*/
    }

    private static void generateMenuTypesClass() throws IOException {

        ClassBuilder classBuilder = new ClassBuilder();
        classBuilder.withPackage("de.verdox.mccreativelab.wrapper.inventory");
        classBuilder.withHeader("public", ClassBuilder.ClassHeader.INTERFACE, "MCCMenuTypes", "");

        for (Field field : MenuType.class.getFields()) {
            if (!Modifier.isStatic(field.getModifiers()))
                continue;
            if (!Modifier.isFinal(field.getModifiers()))
                continue;
            if (!Modifier.isPublic(field.getModifiers()))
                continue;
            if (!MenuType.class.isAssignableFrom(field.getType()))
                continue;
            if(!(field.getGenericType() instanceof ParameterizedType parameterizedType))
                continue;
            String fieldName = field.getName();
            String keyValue = fieldName.toLowerCase(Locale.ROOT);


            int containerSize = 0;
            if (keyValue.contains("generic")) {
                String[] twoInts = keyValue.replace("generic_", "").split("x");
                containerSize = Integer.parseInt(twoInts[0]) * Integer.parseInt(twoInts[1]);
            } else {
                for (InventoryType value : InventoryType.values()) {
                    if (value.getMenuType() == null)
                        continue;
                    if (value.getMenuType().key().equals(Key.key(Key.MINECRAFT_NAMESPACE, keyValue)))
                        containerSize = value.getDefaultSize();
                }
            }

            classBuilder.includeImport(DynamicType.of(parameterizedType.getActualTypeArguments()[0]));
            classBuilder.withField("public static final", DynamicType.of(MCCMenuType.class).withAddedGeneric(DynamicType.of(parameterizedType.getActualTypeArguments()[0])), fieldName, "new MCCMenuType<>(Key.key(Key.MINECRAFT_NAMESPACE, \"" + keyValue + "\"), " + containerSize + ")");
        }
        classBuilder.includeImport(DynamicType.of(Key.class));
        classBuilder.writeClassFile(GENERATION_DIR);
    }

    private static void generateTypedKeys() throws IOException, IllegalAccessException {
        String wrapperPackage = "de.verdox.mccreativelab.wrapper.";
        String implPackage = "de.verdox.mccreativelab.impl.vanilla.";

        WrapperInterfaceGenerator generator = new WrapperInterfaceGenerator(new File("../../mcc-wrapper/generated"), "MCC", "", "NMS", excludedTypes, EXCLUDED_PACKAGES);
        TypedKeyCollectionBuilder typedKeyCollectionBuilder = new TypedKeyCollectionBuilder(GENERATION_DIR, "MCC", "", excludedTypes, List.of());
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(Attributes.class, new TypeToken<>() {}, Registries.ATTRIBUTE, "de.verdox.mccreativelab.wrapper.typed", "MCCAttributes");

        typedKeyCollectionBuilder.generateForPlatformGroupingClass(MobEffects.class, new TypeToken<>() {}, Registries.MOB_EFFECT, "de.verdox.mccreativelab.wrapper.typed", "MCCEffects");

        typedKeyCollectionBuilder.generateForPlatformGroupingClass(SoundEvents.class, new TypeToken<>() {}, Registries.SOUND_EVENT, "de.verdox.mccreativelab.wrapper.typed", "MCCSounds");

        typedKeyCollectionBuilder.generateForPlatformGroupingClass(Blocks.class, new TypeToken<>() {}, Registries.BLOCK, "de.verdox.mccreativelab.wrapper.typed", "MCCBlocks");

        typedKeyCollectionBuilder.generateForPlatformGroupingClass(BlockTags.class, new TypeToken<>() {}, Registries.BLOCK, "de.verdox.mccreativelab.wrapper.typed", "MCCBlockTags");
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(ItemTags.class, new TypeToken<>() {}, Registries.ITEM, "de.verdox.mccreativelab.wrapper.typed", "MCCItemTags");

        typedKeyCollectionBuilder.generateForPlatformGroupingClass(Items.class, new TypeToken<>() {}, Registries.ITEM, "de.verdox.mccreativelab.wrapper.typed", "MCCItems");
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(DataComponents.class, new TypeToken<>() {}, Registries.DATA_COMPONENT_TYPE, "de.verdox.mccreativelab.wrapper.typed", "MCCDataComponentTypes");

        generator.generateWrapper(FrogVariant.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(FrogVariant.class, new TypeToken<>() {}, Registries.FROG_VARIANT, "de.verdox.mccreativelab.wrapper.typed", "MCCFrogVariants");

        generator.generateWrapper(GameEvent.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(GameEvent.class, new TypeToken<>() {}, Registries.GAME_EVENT, "de.verdox.mccreativelab.wrapper.typed", "MCCGameEvents");

        generator.generateWrapper(Instrument.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(Instrument.class, new TypeToken<>() {}, Registries.INSTRUMENT, "de.verdox.mccreativelab.wrapper.typed", "MCCInstruments");

        generator.generateWrapper(JukeboxSong.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(JukeboxSongs.class, new TypeToken<>() {}, Registries.JUKEBOX_SONG, "de.verdox.mccreativelab.wrapper.typed", "MCCJukeboxSongs");

        //typedKeyCollectionBuilder.generateForPlatformGroupingClass(EntityType.class, new TypeToken<>() {}, Registries.ENTITY_TYPE, "de.verdox.mccreativelab.wrapper.typed", "MCCEntityTypes");

        //typedKeyCollectionBuilder.generateForPlatformGroupingClass(MemoryModuleType.class, new TypeToken<>() {}, Registries.MEMORY_MODULE_TYPE, "de.verdox.mccreativelab.wrapper.typed", "MCCMemoryModuleTypes");

        generator.generateWrapper(PaintingVariant.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(PaintingVariants.class, new TypeToken<>() {}, Registries.PAINTING_VARIANT, "de.verdox.mccreativelab.wrapper.typed", "MCCPaintingVariants");

        generator.generateWrapper(PoiType.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(PoiTypes.class, new TypeToken<>() {}, Registries.POINT_OF_INTEREST_TYPE, "de.verdox.mccreativelab.wrapper.typed", "MCCPoiTypes");

        //typedKeyCollectionBuilder.generateForPlatformGroupingClass(Potions.class, new TypeToken<>() {}, Registries.POTION, "de.verdox.mccreativelab.wrapper.typed", "MCCPotions");
        //typedKeyCollectionBuilder.generateForPlatformGroupingClass(RecipeType.class, new TypeToken<>() {}, Registries.RECIPE_TYPE, "de.verdox.mccreativelab.wrapper.typed", "MCCRecipeTypes");
        //typedKeyCollectionBuilder.generateForPlatformGroupingClass(Schedule.class, new TypeToken<>() {}, Registries.SCHEDULE, "de.verdox.mccreativelab.wrapper.typed", "MCCSchedules");
        //generator.generateWrapper(StatType.class, wrapperPackage+"types", implPackage+"types", DynamicType.of(MCCWrapped.class), false);
        //typedKeyCollectionBuilder.generateForPlatformGroupingClass(Stats.class, new TypeToken<>() {}, Registries.STAT_TYPE, "de.verdox.mccreativelab.wrapper.typed", "MCCStatTypes");

        //typedKeyCollectionBuilder.generateForPlatformGroupingClass(StructureType.class, new TypeToken<>() {}, Registries.STRUCTURE_TYPE, "de.verdox.mccreativelab.wrapper.typed", "MCCStructureTypes");

        generator.generateWrapper(VillagerProfession.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(VillagerProfession.class, new TypeToken<>() {}, Registries.VILLAGER_PROFESSION, "de.verdox.mccreativelab.wrapper.typed", "MCCVillagerProfessions");

        //typedKeyCollectionBuilder.generateForPlatformGroupingClass(VillagerType.class, new TypeToken<>() {}, Registries.VILLAGER_TYPE, "de.verdox.mccreativelab.wrapper.typed", "MCCVillagerTypes");

        generator.generateWrapper(DecoratedPotPattern.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(DecoratedPotPatterns.class, new TypeToken<>() {}, Registries.DECORATED_POT_PATTERN, "de.verdox.mccreativelab.wrapper.typed", "MCCDecoratedPotPatterns");

        generator.generateWrapper(ArmorMaterial.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(ArmorMaterials.class, new TypeToken<>() {}, Registries.ARMOR_MATERIAL, "de.verdox.mccreativelab.wrapper.typed", "MCCArmorMaterials");

        typedKeyCollectionBuilder.generateForPlatformGroupingClass(Biomes.class, new TypeToken<>() {}, Registries.BIOME, "de.verdox.mccreativelab.wrapper.typed", "MCCBiomes");

        generator.generateWrapper(DimensionType.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(DimensionTypes.class, new TypeToken<>() {}, Registries.DIMENSION_TYPE, "de.verdox.mccreativelab.wrapper.typed", "MCCDimensionTypes");

        generator.generateWrapper(Enchantment.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(Enchantments.class, new TypeToken<>() {}, Registries.ENCHANTMENT, "de.verdox.mccreativelab.wrapper.typed", "MCCEnchantments");

        typedKeyCollectionBuilder.generateForPlatformGroupingClass(VanillaAdventureAdvancements.class, new TypeToken<>() {}, Registries.ADVANCEMENT, "de.verdox.mccreativelab.wrapper.typed", "MCCAdventureAdvancements");

        typedKeyCollectionBuilder.generateForPlatformGroupingClass(VanillaHusbandryAdvancements.class, new TypeToken<>() {}, Registries.ADVANCEMENT, "de.verdox.mccreativelab.wrapper.typed", "MCCHusbandryAdvancements");
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(VanillaNetherAdvancements.class, new TypeToken<>() {}, Registries.ADVANCEMENT, "de.verdox.mccreativelab.wrapper.typed", "MCCNetherAdvancements");
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(VanillaTheEndAdvancements.class, new TypeToken<>() {}, Registries.ADVANCEMENT, "de.verdox.mccreativelab.wrapper.typed", "MCCEndAdvancements");

        generator.generateWrapper(TrimMaterial.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(TrimMaterials.class, new TypeToken<>() {}, Registries.TRIM_MATERIAL, "de.verdox.mccreativelab.wrapper.typed", "MCCTrimMaterials");

        generator.generateWrapper(TrimPattern.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(TrimPatterns.class, new TypeToken<>() {}, Registries.TRIM_PATTERN, "de.verdox.mccreativelab.wrapper.typed", "MCCTrimPatterns");
        //typedKeyCollectionBuilder.generateForPlatformGroupingClass(BuiltInLootTables.class, ResourceKey.class, Registries.LOOT_TABLE,"de.verdox.mccreativelab.wrapper.typed", "MCCLootTables", converterGenerator);
    }

    public static void createItemComponentConverters() throws IOException {

        new MCCConverterGenerator(GENERATION_DIR, "DataComponentTypeConverter", "de.verdox.mccreativelab.impl.vanilla.platform.converter", DynamicType.of(DataComponentType.class, false), DynamicType.of(NMSDataComponentType.class, false), new MCCConverterGenerator.WrappingMethodBuilder() {
            @Override
            public void wrapFunction(AbstractClassGenerator abstractClassGenerator, String parameterName, DynamicType nativeType, DynamicType typeToWrapInto, CodeLineBuilder codeLineBuilder) {
                for (Field declaredField : DataComponents.class.getDeclaredFields()) {
                    if (!Modifier.isFinal(declaredField.getModifiers()) && !Modifier.isPublic(declaredField.getModifiers()) && !Modifier.isStatic(declaredField.getModifiers()))
                        continue;
                    if (!(declaredField.getGenericType() instanceof ParameterizedType parameterizedType))
                        continue;

                    DynamicType componentNativeType = DynamicType.of(parameterizedType.getActualTypeArguments()[0], false);
                    DynamicType swappedComponentType = DynamicType.of(parameterizedType.getActualTypeArguments()[0], true);
                    if (abstractClassGenerator.isForbiddenType(componentNativeType))
                        continue;
                    CodeExpression defaultInstantiation = CodeExpression.create().with("null");
                    if (NMSMapper.isSwapped(componentNativeType)) {
                        WrappedClass wrappedClass = WrappedClassRegistry.INSTANCE.getWrappingInformationByWrappedClass(componentNativeType.getRawType());
                        if (wrappedClass != null && wrappedClass.implementation() != null) {
                            defaultInstantiation = CodeExpression.create().with("() -> new ").with(DynamicType.of(wrappedClass.implementation(), false)).with("(null)");
                            codeLineBuilder.getClassBuilder().includeImport(wrappedClass.implementation());
                        }
                    }


                    codeLineBuilder.getClassBuilder().includeImport(componentNativeType);
                    codeLineBuilder.getClassBuilder().includeImport(swappedComponentType);
                    codeLineBuilder.getClassBuilder().includeImport(DynamicType.of(DataComponents.class));

                    codeLineBuilder.append("if(").append(parameterName).append(".equals(DataComponents." + declaredField.getName()).appendAndNewLine(")) {");
                    codeLineBuilder.increaseDepth(1);
                    codeLineBuilder.append("return done(").append("new ").append(typeToWrapInto).append("<>("+parameterName+", ").appendTypeToken(componentNativeType).append(", ").appendTypeToken(swappedComponentType).append(", ").append(defaultInstantiation).append("));");
                    codeLineBuilder.increaseDepth(-1);
                    codeLineBuilder.appendAndNewLine("}");

                }
                codeLineBuilder.append("return notDone(null);");
            }

            @Override
            public void unwrapFunction(AbstractClassGenerator abstractClassGenerator, String parameterName, DynamicType apiType, DynamicType nativeTypeToUnwrapTo, CodeLineBuilder codeLineBuilder) {
                codeLineBuilder.append("return done((DataComponentType) platformImplType.getHandle());");
            }
        }, excludedTypes, EXCLUDED_PACKAGES).create();

    }
}
