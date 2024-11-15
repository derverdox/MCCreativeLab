package de.verdox.mccreativelab.classgenerator;

import de.verdox.mccreativelab.classgenerator.codegen.ClassBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.CodeLineBuilder;
import de.verdox.mccreativelab.classgenerator.codegen.DynamicType;
import de.verdox.mccreativelab.classgenerator.codegen.expressions.CodeExpression;
import de.verdox.mccreativelab.classgenerator.codegen.type.ClassDescription;
import de.verdox.mccreativelab.classgenerator.conversion.*;
import de.verdox.mccreativelab.classgenerator.wrapper.WrappedClass;
import de.verdox.mccreativelab.classgenerator.wrapper.WrappedClassRegistry;
import de.verdox.mccreativelab.classgenerator.wrapper.WrapperInterfaceGenerator;
import de.verdox.mccreativelab.impl.vanilla.item.components.NMSDataComponentType;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSPlatform;
import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
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
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.stats.StatType;
import net.minecraft.stats.Stats;
import net.minecraft.util.Unit;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
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
        ItemLore.class,
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
            MCCPlatform.INSTANCE.setup(new NMSPlatform());
            generateMCCItemComponentWrapper();
            generateMenuTypesClass();
            //converterGenerator.buildConverterInterface(GENERATION_DIR);
            //converterGenerator.buildWrapperAdapters(GENERATION_DIR);
            generateTypedKeys();
            createItemComponentConverters();
            MCCConverterGenerator.createGeneratedConvertersClass(GENERATION_DIR);
        } catch (IOException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
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
        generator.generateWrapper(AttributeModifier.class, "de.verdox.mccreativelab.wrapper.item.components", "de.verdox.mccreativelab.impl.vanilla.wrapper.item", null, true);
        generator.generateWrapper(EquipmentSlotGroup.class, "de.verdox.mccreativelab.wrapper.item.components", "de.verdox.mccreativelab.impl.vanilla.wrapper.item", null, false);

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
                    if (!NMSMapper.isSwapped(componentType) && !excludedTypes.contains(componentType)) {
                        WrapperInterfaceGenerator wrapperInterfaceGenerator = new WrapperInterfaceGenerator(new File("../../mcc-wrapper/generated"), "MCC", "", "NMS", excludedTypes, EXCLUDED_PACKAGES);

                        wrapperInterfaceGenerator.generateWrapper(componentType, "de.verdox.mccreativelab.wrapper.item.components", "de.verdox.mccreativelab.impl.vanilla.wrapper.item.components", DynamicType.of(MCCItemComponent.class), true);
                        DynamicType generic = DynamicType.of(field.getGenericType(), false).getGenericTypes().get(0);
                        fieldType = fieldType.withAddedGeneric(generic);
                    }
                }
            }
        }
        /*        classBuilder.writeClassFile(parentDir);*/
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

            classBuilder.withField("public static final", DynamicType.of(MCCMenuType.class), fieldName, "new MCCMenuType(Key.key(Key.MINECRAFT_NAMESPACE, \"" + keyValue + "\"), " + containerSize + ")");
        }
        classBuilder.includeImport(DynamicType.of(Key.class));
        classBuilder.writeClassFile(GENERATION_DIR);
    }

    private static void generateTypedKeys() throws IOException, IllegalAccessException {
        String wrapperPackage = "de.verdox.mccreativelab.wrapper.";
        String implPackage = "de.verdox.mccreativelab.impl.vanilla.";

        WrapperInterfaceGenerator generator = new WrapperInterfaceGenerator(new File("../../mcc-wrapper/generated"), "MCC", "", "NMS", excludedTypes, EXCLUDED_PACKAGES);
        TypedKeyCollectionBuilder typedKeyCollectionBuilder = new TypedKeyCollectionBuilder(GENERATION_DIR, "MCC", "", excludedTypes, List.of());
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(Blocks.class, Block.class, Registries.BLOCK.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCBlocks");
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(Items.class, Item.class, Registries.ITEM.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCItems");
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(DataComponents.class, DataComponentType.class, Registries.DATA_COMPONENT_TYPE.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCDataComponentTypes");


        generator.generateWrapper(FrogVariant.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(FrogVariant.class, FrogVariant.class, Registries.FROG_VARIANT.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCFrogVariants");

        generator.generateWrapper(GameEvent.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(GameEvent.class, GameEvent.class, Registries.GAME_EVENT.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCGameEvents");

        generator.generateWrapper(Instrument.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(Instrument.class, Instrument.class, Registries.INSTRUMENT.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCInstruments");

        generator.generateWrapper(JukeboxSong.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(JukeboxSongs.class, JukeboxSong.class, Registries.JUKEBOX_SONG.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCJukeboxSongs");

        typedKeyCollectionBuilder.generateForPlatformGroupingClass(MemoryModuleType.class, MemoryModuleType.class, Registries.MEMORY_MODULE_TYPE.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCMemoryModuleTypes");

        generator.generateWrapper(MenuType.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(MenuType.class, MenuType.class, Registries.MENU.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCMenuTypes");

        typedKeyCollectionBuilder.generateForPlatformGroupingClass(MobEffects.class, MobEffect.class, Registries.MOB_EFFECT.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCMobEffects");

        generator.generateWrapper(PaintingVariant.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(PaintingVariants.class, PaintingVariant.class, Registries.PAINTING_VARIANT.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCPaintingVariants");

        generator.generateWrapper(PoiType.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(PoiTypes.class, PoiType.class, Registries.POINT_OF_INTEREST_TYPE.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCPoiTypes");

        typedKeyCollectionBuilder.generateForPlatformGroupingClass(Potions.class, Potion.class, Registries.POTION.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCPotions");
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(RecipeType.class, RecipeType.class, Registries.RECIPE_TYPE.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCRecipeTypes");
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(Schedule.class, Schedule.class, Registries.SCHEDULE.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCSchedules");

        typedKeyCollectionBuilder.generateForPlatformGroupingClass(SoundEvents.class, SoundEvent.class, Registries.SOUND_EVENT.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCSoundEvents");

        //generator.generateWrapper(StatType.class, wrapperPackage+"types", implPackage+"types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(Stats.class, StatType.class, Registries.STAT_TYPE.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCStatTypes");

        typedKeyCollectionBuilder.generateForPlatformGroupingClass(StructureType.class, StructureType.class, Registries.STRUCTURE_TYPE.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCStructureTypes");

        generator.generateWrapper(VillagerProfession.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(VillagerProfession.class, VillagerProfession.class, Registries.VILLAGER_PROFESSION.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCVillagerProfessions");

        typedKeyCollectionBuilder.generateForPlatformGroupingClass(VillagerType.class, VillagerType.class, Registries.VILLAGER_TYPE.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCVillagerTypes");

        generator.generateWrapper(DecoratedPotPattern.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(DecoratedPotPatterns.class, DecoratedPotPattern.class, Registries.DECORATED_POT_PATTERN.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCDecoratedPotPatterns");

        generator.generateWrapper(ArmorMaterial.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(ArmorMaterials.class, ArmorMaterial.class, Registries.ARMOR_MATERIAL.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCArmorMaterials");

        typedKeyCollectionBuilder.generateForPlatformGroupingClass(Biomes.class, Biome.class, Registries.BIOME.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCBiomes");

        generator.generateWrapper(DimensionType.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(DimensionTypes.class, DimensionType.class, Registries.DIMENSION_TYPE.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCDimensionTypes");

        generator.generateWrapper(Enchantment.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(Enchantments.class, Enchantment.class, Registries.ENCHANTMENT.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCEnchantments");

        typedKeyCollectionBuilder.generateForPlatformGroupingClass(VanillaAdventureAdvancements.class, Advancement.class, Registries.ADVANCEMENT.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCAdventureAdvancements");

        typedKeyCollectionBuilder.generateForPlatformGroupingClass(VanillaHusbandryAdvancements.class, Advancement.class, Registries.ADVANCEMENT.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCHusbandryAdvancements");
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(VanillaNetherAdvancements.class, Advancement.class, Registries.ADVANCEMENT.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCNetherAdvancements");
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(VanillaTheEndAdvancements.class, Advancement.class, Registries.ADVANCEMENT.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCEndAdvancements");

        generator.generateWrapper(TrimMaterial.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(TrimMaterials.class, TrimMaterial.class, Registries.TRIM_MATERIAL.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCTrimMaterials");

        generator.generateWrapper(TrimPattern.class, wrapperPackage + "types", implPackage + "types", DynamicType.of(MCCWrapped.class), false);
        typedKeyCollectionBuilder.generateForPlatformGroupingClass(TrimPatterns.class, TrimPattern.class, Registries.TRIM_PATTERN.location().getPath(), "de.verdox.mccreativelab.wrapper.typed", "MCCTrimPatterns");
        //typedKeyCollectionBuilder.generateForPlatformGroupingClass(BuiltInLootTables.class, ResourceKey.class, Registries.LOOT_TABLE.location().getPath(),"de.verdox.mccreativelab.wrapper.typed", "MCCLootTables", converterGenerator);
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
