package de.verdox.mccreativelab.wrapper.typed;

import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import com.google.common.reflect.TypeToken;
import net.kyori.adventure.key.Key;

public class MCCBlocks  {

	public static final Key VANILLA_REGISTRY_KEY  = Key.key("minecraft", "block");

	public static final MCCReference<MCCBlockType> AIR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "air"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GRANITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "granite"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_GRANITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_granite"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DIORITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diorite"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_DIORITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_diorite"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ANDESITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "andesite"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_ANDESITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_andesite"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GRASS_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "grass_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DIRT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dirt"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> COARSE_DIRT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "coarse_dirt"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PODZOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "podzol"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> COBBLESTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobblestone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OAK_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_planks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SPRUCE_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_planks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BIRCH_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_planks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> JUNGLE_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_planks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ACACIA_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_planks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHERRY_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_planks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DARK_OAK_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_planks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MANGROVE_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_planks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BAMBOO_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_planks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BAMBOO_MOSAIC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_mosaic"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OAK_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SPRUCE_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BIRCH_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> JUNGLE_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ACACIA_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHERRY_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DARK_OAK_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MANGROVE_PROPAGULE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_propagule"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BEDROCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bedrock"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "water"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LAVA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lava"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sand"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SUSPICIOUS_SAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "suspicious_sand"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_SAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_sand"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GRAVEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gravel"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SUSPICIOUS_GRAVEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "suspicious_gravel"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GOLD_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gold_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEEPSLATE_GOLD_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_gold_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> IRON_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEEPSLATE_IRON_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_iron_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> COAL_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "coal_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEEPSLATE_COAL_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_coal_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> NETHER_GOLD_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_gold_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OAK_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SPRUCE_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BIRCH_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> JUNGLE_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ACACIA_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHERRY_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DARK_OAK_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MANGROVE_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MANGROVE_ROOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_roots"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MUDDY_MANGROVE_ROOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "muddy_mangrove_roots"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BAMBOO_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STRIPPED_SPRUCE_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_spruce_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STRIPPED_BIRCH_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_birch_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STRIPPED_JUNGLE_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_jungle_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STRIPPED_ACACIA_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_acacia_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STRIPPED_CHERRY_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_cherry_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STRIPPED_DARK_OAK_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_dark_oak_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STRIPPED_OAK_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_oak_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STRIPPED_MANGROVE_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_mangrove_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STRIPPED_BAMBOO_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_bamboo_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OAK_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SPRUCE_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BIRCH_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> JUNGLE_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ACACIA_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHERRY_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DARK_OAK_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MANGROVE_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STRIPPED_OAK_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_oak_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STRIPPED_SPRUCE_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_spruce_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STRIPPED_BIRCH_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_birch_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STRIPPED_JUNGLE_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_jungle_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STRIPPED_ACACIA_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_acacia_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STRIPPED_CHERRY_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_cherry_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STRIPPED_DARK_OAK_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_dark_oak_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STRIPPED_MANGROVE_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_mangrove_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OAK_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SPRUCE_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BIRCH_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> JUNGLE_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ACACIA_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHERRY_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DARK_OAK_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MANGROVE_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> AZALEA_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "azalea_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> FLOWERING_AZALEA_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flowering_azalea_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SPONGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sponge"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WET_SPONGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wet_sponge"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LAPIS_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lapis_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEEPSLATE_LAPIS_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_lapis_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LAPIS_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lapis_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DISPENSER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dispenser"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHISELED_SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CUT_SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cut_sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> NOTE_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "note_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WHITE_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ORANGE_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MAGENTA_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_BLUE_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> YELLOW_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIME_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PINK_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GRAY_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_GRAY_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CYAN_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PURPLE_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLUE_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BROWN_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GREEN_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLACK_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POWERED_RAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "powered_rail"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DETECTOR_RAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "detector_rail"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STICKY_PISTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sticky_piston"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> COBWEB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobweb"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SHORT_GRASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "short_grass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> FERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fern"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEAD_BUSH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_bush"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SEAGRASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "seagrass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TALL_SEAGRASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tall_seagrass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PISTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piston"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PISTON_HEAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piston_head"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WHITE_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ORANGE_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MAGENTA_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_BLUE_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> YELLOW_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIME_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PINK_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GRAY_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_GRAY_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CYAN_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PURPLE_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLUE_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BROWN_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GREEN_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLACK_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MOVING_PISTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "moving_piston"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DANDELION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dandelion"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TORCHFLOWER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "torchflower"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POPPY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "poppy"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLUE_ORCHID  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_orchid"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ALLIUM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "allium"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> AZURE_BLUET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "azure_bluet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_TULIP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_tulip"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ORANGE_TULIP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_tulip"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WHITE_TULIP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_tulip"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PINK_TULIP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_tulip"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OXEYE_DAISY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxeye_daisy"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CORNFLOWER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cornflower"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WITHER_ROSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither_rose"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LILY_OF_THE_VALLEY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lily_of_the_valley"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BROWN_MUSHROOM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_mushroom"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_MUSHROOM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_mushroom"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GOLD_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gold_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> IRON_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TNT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tnt"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BOOKSHELF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bookshelf"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHISELED_BOOKSHELF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_bookshelf"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MOSSY_COBBLESTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_cobblestone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OBSIDIAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "obsidian"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TORCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "torch"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WALL_TORCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wall_torch"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> FIRE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fire"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SOUL_FIRE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_fire"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SPAWNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spawner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OAK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHEST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chest"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> REDSTONE_WIRE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "redstone_wire"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DIAMOND_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEEPSLATE_DIAMOND_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_diamond_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DIAMOND_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRAFTING_TABLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crafting_table"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WHEAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wheat"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> FARMLAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "farmland"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> FURNACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "furnace"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OAK_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SPRUCE_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BIRCH_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ACACIA_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHERRY_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> JUNGLE_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DARK_OAK_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MANGROVE_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BAMBOO_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OAK_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LADDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ladder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rail"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> COBBLESTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobblestone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OAK_WALL_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_wall_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SPRUCE_WALL_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_wall_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BIRCH_WALL_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_wall_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ACACIA_WALL_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_wall_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHERRY_WALL_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wall_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> JUNGLE_WALL_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_wall_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DARK_OAK_WALL_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_wall_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MANGROVE_WALL_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_wall_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BAMBOO_WALL_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_wall_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OAK_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SPRUCE_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BIRCH_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ACACIA_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHERRY_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> JUNGLE_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DARK_OAK_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRIMSON_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WARPED_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MANGROVE_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BAMBOO_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OAK_WALL_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_wall_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SPRUCE_WALL_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_wall_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BIRCH_WALL_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_wall_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ACACIA_WALL_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_wall_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHERRY_WALL_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wall_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> JUNGLE_WALL_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_wall_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DARK_OAK_WALL_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_wall_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MANGROVE_WALL_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_wall_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRIMSON_WALL_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_wall_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WARPED_WALL_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_wall_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BAMBOO_WALL_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_wall_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LEVER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lever"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STONE_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> IRON_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OAK_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SPRUCE_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BIRCH_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> JUNGLE_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ACACIA_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHERRY_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DARK_OAK_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MANGROVE_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BAMBOO_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> REDSTONE_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "redstone_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEEPSLATE_REDSTONE_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_redstone_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> REDSTONE_TORCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "redstone_torch"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> REDSTONE_WALL_TORCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "redstone_wall_torch"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STONE_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SNOW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snow"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ICE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ice"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SNOW_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snow_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CACTUS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cactus"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CLAY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "clay"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SUGAR_CANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sugar_cane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> JUKEBOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jukebox"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OAK_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> NETHERRACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherrack"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SOUL_SAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_sand"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SOUL_SOIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_soil"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BASALT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "basalt"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_BASALT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_basalt"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SOUL_TORCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_torch"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SOUL_WALL_TORCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_wall_torch"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GLOWSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glowstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> NETHER_PORTAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_portal"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CARVED_PUMPKIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "carved_pumpkin"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> JACK_O_LANTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jack_o_lantern"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CAKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cake"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> REPEATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "repeater"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WHITE_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ORANGE_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MAGENTA_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_BLUE_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> YELLOW_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIME_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PINK_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GRAY_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_GRAY_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CYAN_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PURPLE_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLUE_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BROWN_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GREEN_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLACK_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OAK_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SPRUCE_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BIRCH_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> JUNGLE_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ACACIA_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHERRY_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DARK_OAK_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MANGROVE_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BAMBOO_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MOSSY_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRACKED_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cracked_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHISELED_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PACKED_MUD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "packed_mud"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MUD_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> INFESTED_STONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infested_stone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> INFESTED_COBBLESTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infested_cobblestone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> INFESTED_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infested_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> INFESTED_MOSSY_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infested_mossy_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> INFESTED_CRACKED_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infested_cracked_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> INFESTED_CHISELED_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infested_chiseled_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BROWN_MUSHROOM_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_mushroom_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_MUSHROOM_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_mushroom_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MUSHROOM_STEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mushroom_stem"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> IRON_BARS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_bars"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHAIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chain"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PUMPKIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pumpkin"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MELON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "melon"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ATTACHED_PUMPKIN_STEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "attached_pumpkin_stem"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ATTACHED_MELON_STEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "attached_melon_stem"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PUMPKIN_STEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pumpkin_stem"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MELON_STEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "melon_stem"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> VINE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vine"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GLOW_LICHEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glow_lichen"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OAK_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STONE_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MUD_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MYCELIUM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mycelium"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LILY_PAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lily_pad"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> NETHER_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> NETHER_BRICK_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_brick_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> NETHER_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> NETHER_WART  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wart"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ENCHANTING_TABLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "enchanting_table"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BREWING_STAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brewing_stand"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CAULDRON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cauldron"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WATER_CAULDRON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "water_cauldron"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LAVA_CAULDRON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lava_cauldron"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POWDER_SNOW_CAULDRON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "powder_snow_cauldron"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> END_PORTAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_portal"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> END_PORTAL_FRAME  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_portal_frame"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> END_STONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_stone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DRAGON_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dragon_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> REDSTONE_LAMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "redstone_lamp"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> COCOA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cocoa"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SANDSTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sandstone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> EMERALD_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "emerald_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEEPSLATE_EMERALD_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_emerald_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ENDER_CHEST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ender_chest"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TRIPWIRE_HOOK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tripwire_hook"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TRIPWIRE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tripwire"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> EMERALD_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "emerald_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SPRUCE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BIRCH_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> JUNGLE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> COMMAND_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "command_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BEACON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beacon"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> COBBLESTONE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobblestone_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MOSSY_COBBLESTONE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_cobblestone_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> FLOWER_POT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flower_pot"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_TORCHFLOWER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_torchflower"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_OAK_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_oak_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_SPRUCE_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_spruce_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_BIRCH_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_birch_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_JUNGLE_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_jungle_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_ACACIA_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_acacia_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_CHERRY_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_cherry_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_DARK_OAK_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_dark_oak_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_MANGROVE_PROPAGULE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_mangrove_propagule"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_FERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_fern"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_DANDELION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_dandelion"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_POPPY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_poppy"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_BLUE_ORCHID  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_blue_orchid"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_ALLIUM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_allium"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_AZURE_BLUET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_azure_bluet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_RED_TULIP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_red_tulip"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_ORANGE_TULIP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_orange_tulip"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_WHITE_TULIP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_white_tulip"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_PINK_TULIP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_pink_tulip"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_OXEYE_DAISY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_oxeye_daisy"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_CORNFLOWER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_cornflower"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_LILY_OF_THE_VALLEY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_lily_of_the_valley"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_WITHER_ROSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_wither_rose"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_RED_MUSHROOM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_red_mushroom"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_BROWN_MUSHROOM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_brown_mushroom"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_DEAD_BUSH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_dead_bush"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_CACTUS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_cactus"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CARROTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "carrots"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTATOES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potatoes"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OAK_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SPRUCE_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BIRCH_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> JUNGLE_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ACACIA_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHERRY_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DARK_OAK_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MANGROVE_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BAMBOO_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SKELETON_SKULL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skeleton_skull"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SKELETON_WALL_SKULL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skeleton_wall_skull"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WITHER_SKELETON_SKULL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither_skeleton_skull"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WITHER_SKELETON_WALL_SKULL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither_skeleton_wall_skull"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ZOMBIE_HEAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_head"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ZOMBIE_WALL_HEAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_wall_head"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PLAYER_HEAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_head"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PLAYER_WALL_HEAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_wall_head"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CREEPER_HEAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "creeper_head"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CREEPER_WALL_HEAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "creeper_wall_head"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DRAGON_HEAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dragon_head"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DRAGON_WALL_HEAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dragon_wall_head"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PIGLIN_HEAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_head"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PIGLIN_WALL_HEAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_wall_head"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ANVIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "anvil"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHIPPED_ANVIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chipped_anvil"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DAMAGED_ANVIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "damaged_anvil"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TRAPPED_CHEST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trapped_chest"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_WEIGHTED_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_weighted_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> HEAVY_WEIGHTED_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "heavy_weighted_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> COMPARATOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "comparator"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DAYLIGHT_DETECTOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "daylight_detector"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> REDSTONE_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "redstone_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> NETHER_QUARTZ_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_quartz_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> HOPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hopper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> QUARTZ_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "quartz_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHISELED_QUARTZ_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_quartz_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> QUARTZ_PILLAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "quartz_pillar"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> QUARTZ_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "quartz_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ACTIVATOR_RAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "activator_rail"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DROPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dropper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WHITE_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ORANGE_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MAGENTA_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_BLUE_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> YELLOW_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIME_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PINK_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GRAY_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_GRAY_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CYAN_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PURPLE_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLUE_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BROWN_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GREEN_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLACK_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WHITE_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ORANGE_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MAGENTA_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_BLUE_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> YELLOW_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIME_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PINK_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GRAY_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_GRAY_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CYAN_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PURPLE_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLUE_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BROWN_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GREEN_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLACK_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ACACIA_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHERRY_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DARK_OAK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MANGROVE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BAMBOO_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BAMBOO_MOSAIC_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_mosaic_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SLIME_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slime_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BARRIER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "barrier"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> IRON_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PRISMARINE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PRISMARINE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DARK_PRISMARINE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_prismarine"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PRISMARINE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PRISMARINE_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DARK_PRISMARINE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_prismarine_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PRISMARINE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PRISMARINE_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DARK_PRISMARINE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_prismarine_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SEA_LANTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sea_lantern"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> HAY_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hay_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WHITE_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ORANGE_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MAGENTA_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_BLUE_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> YELLOW_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIME_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PINK_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GRAY_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_GRAY_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CYAN_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PURPLE_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLUE_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BROWN_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GREEN_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLACK_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> COAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "coal_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PACKED_ICE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "packed_ice"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SUNFLOWER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sunflower"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LILAC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lilac"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ROSE_BUSH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rose_bush"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PEONY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "peony"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TALL_GRASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tall_grass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LARGE_FERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "large_fern"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WHITE_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ORANGE_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MAGENTA_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_BLUE_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> YELLOW_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIME_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PINK_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GRAY_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_GRAY_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CYAN_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PURPLE_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLUE_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BROWN_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GREEN_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLACK_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WHITE_WALL_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_wall_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ORANGE_WALL_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_wall_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MAGENTA_WALL_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_wall_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_BLUE_WALL_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_wall_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> YELLOW_WALL_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_wall_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIME_WALL_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_wall_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PINK_WALL_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_wall_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GRAY_WALL_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_wall_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_GRAY_WALL_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_wall_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CYAN_WALL_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_wall_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PURPLE_WALL_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_wall_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLUE_WALL_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_wall_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BROWN_WALL_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_wall_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GREEN_WALL_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_wall_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_WALL_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_wall_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLACK_WALL_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_wall_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHISELED_RED_SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_red_sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CUT_RED_SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cut_red_sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_SANDSTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_sandstone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OAK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SPRUCE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BIRCH_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> JUNGLE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ACACIA_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHERRY_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DARK_OAK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MANGROVE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BAMBOO_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BAMBOO_MOSAIC_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_mosaic_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SMOOTH_STONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_stone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SANDSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sandstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CUT_SANDSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cut_sandstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PETRIFIED_OAK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "petrified_oak_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> COBBLESTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobblestone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STONE_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MUD_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> NETHER_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> QUARTZ_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "quartz_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_SANDSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_sandstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CUT_RED_SANDSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cut_red_sandstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PURPUR_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purpur_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SMOOTH_STONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_stone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SMOOTH_SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SMOOTH_QUARTZ  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_quartz"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SMOOTH_RED_SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_red_sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SPRUCE_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BIRCH_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> JUNGLE_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ACACIA_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHERRY_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DARK_OAK_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MANGROVE_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BAMBOO_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SPRUCE_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BIRCH_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> JUNGLE_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ACACIA_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHERRY_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DARK_OAK_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MANGROVE_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BAMBOO_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SPRUCE_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BIRCH_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> JUNGLE_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ACACIA_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHERRY_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DARK_OAK_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MANGROVE_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BAMBOO_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> END_ROD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_rod"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHORUS_PLANT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chorus_plant"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHORUS_FLOWER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chorus_flower"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PURPUR_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purpur_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PURPUR_PILLAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purpur_pillar"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PURPUR_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purpur_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> END_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TORCHFLOWER_CROP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "torchflower_crop"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PITCHER_CROP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pitcher_crop"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PITCHER_PLANT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pitcher_plant"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BEETROOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beetroots"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DIRT_PATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dirt_path"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> END_GATEWAY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_gateway"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> REPEATING_COMMAND_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "repeating_command_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHAIN_COMMAND_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chain_command_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> FROSTED_ICE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "frosted_ice"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MAGMA_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magma_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> NETHER_WART_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wart_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_NETHER_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_nether_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BONE_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bone_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STRUCTURE_VOID  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "structure_void"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OBSERVER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "observer"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WHITE_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ORANGE_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MAGENTA_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_BLUE_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> YELLOW_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIME_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PINK_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GRAY_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_GRAY_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CYAN_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PURPLE_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLUE_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BROWN_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GREEN_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLACK_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WHITE_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ORANGE_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MAGENTA_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_BLUE_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> YELLOW_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIME_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PINK_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GRAY_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_GRAY_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CYAN_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PURPLE_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLUE_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BROWN_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GREEN_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLACK_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WHITE_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ORANGE_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MAGENTA_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_BLUE_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> YELLOW_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIME_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PINK_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GRAY_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_GRAY_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CYAN_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PURPLE_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLUE_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BROWN_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GREEN_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLACK_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WHITE_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ORANGE_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MAGENTA_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_BLUE_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> YELLOW_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIME_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PINK_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GRAY_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_GRAY_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CYAN_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PURPLE_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLUE_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BROWN_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GREEN_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLACK_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> KELP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "kelp"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> KELP_PLANT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "kelp_plant"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DRIED_KELP_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dried_kelp_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TURTLE_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "turtle_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SNIFFER_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sniffer_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEAD_TUBE_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_tube_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEAD_BRAIN_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_brain_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEAD_BUBBLE_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_bubble_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEAD_FIRE_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_fire_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEAD_HORN_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_horn_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TUBE_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tube_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BRAIN_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brain_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BUBBLE_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bubble_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> FIRE_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fire_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> HORN_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horn_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEAD_TUBE_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_tube_coral"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEAD_BRAIN_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_brain_coral"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEAD_BUBBLE_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_bubble_coral"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEAD_FIRE_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_fire_coral"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEAD_HORN_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_horn_coral"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TUBE_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tube_coral"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BRAIN_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brain_coral"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BUBBLE_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bubble_coral"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> FIRE_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fire_coral"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> HORN_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horn_coral"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEAD_TUBE_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_tube_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEAD_BRAIN_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_brain_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEAD_BUBBLE_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_bubble_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEAD_FIRE_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_fire_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEAD_HORN_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_horn_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TUBE_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tube_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BRAIN_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brain_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BUBBLE_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bubble_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> FIRE_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fire_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> HORN_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horn_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEAD_TUBE_CORAL_WALL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_tube_coral_wall_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEAD_BRAIN_CORAL_WALL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_brain_coral_wall_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEAD_BUBBLE_CORAL_WALL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_bubble_coral_wall_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEAD_FIRE_CORAL_WALL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_fire_coral_wall_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEAD_HORN_CORAL_WALL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_horn_coral_wall_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TUBE_CORAL_WALL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tube_coral_wall_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BRAIN_CORAL_WALL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brain_coral_wall_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BUBBLE_CORAL_WALL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bubble_coral_wall_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> FIRE_CORAL_WALL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fire_coral_wall_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> HORN_CORAL_WALL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horn_coral_wall_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SEA_PICKLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sea_pickle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLUE_ICE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_ice"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CONDUIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "conduit"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BAMBOO_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BAMBOO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_BAMBOO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_bamboo"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> VOID_AIR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "void_air"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CAVE_AIR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cave_air"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BUBBLE_COLUMN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bubble_column"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_GRANITE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_granite_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SMOOTH_RED_SANDSTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_red_sandstone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MOSSY_STONE_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_stone_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_DIORITE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_diorite_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MOSSY_COBBLESTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_cobblestone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> END_STONE_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_stone_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SMOOTH_SANDSTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_sandstone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SMOOTH_QUARTZ_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_quartz_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GRANITE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "granite_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ANDESITE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "andesite_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_NETHER_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_nether_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_ANDESITE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_andesite_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DIORITE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diorite_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_GRANITE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_granite_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SMOOTH_RED_SANDSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_red_sandstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MOSSY_STONE_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_stone_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_DIORITE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_diorite_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MOSSY_COBBLESTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_cobblestone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> END_STONE_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_stone_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SMOOTH_SANDSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_sandstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SMOOTH_QUARTZ_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_quartz_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GRANITE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "granite_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ANDESITE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "andesite_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_NETHER_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_nether_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_ANDESITE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_andesite_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DIORITE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diorite_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PRISMARINE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_SANDSTONE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_sandstone_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MOSSY_STONE_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_stone_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GRANITE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "granite_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STONE_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MUD_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> NETHER_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ANDESITE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "andesite_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_NETHER_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_nether_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SANDSTONE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sandstone_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> END_STONE_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_stone_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DIORITE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diorite_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SCAFFOLDING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "scaffolding"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LOOM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "loom"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BARREL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "barrel"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SMOKER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smoker"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLAST_FURNACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blast_furnace"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CARTOGRAPHY_TABLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cartography_table"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> FLETCHING_TABLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fletching_table"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GRINDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "grindstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LECTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lectern"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SMITHING_TABLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smithing_table"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STONECUTTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stonecutter"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BELL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bell"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LANTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lantern"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SOUL_LANTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_lantern"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CAMPFIRE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "campfire"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SOUL_CAMPFIRE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_campfire"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SWEET_BERRY_BUSH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sweet_berry_bush"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WARPED_STEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_stem"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STRIPPED_WARPED_STEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_warped_stem"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WARPED_HYPHAE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_hyphae"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STRIPPED_WARPED_HYPHAE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_warped_hyphae"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WARPED_NYLIUM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_nylium"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WARPED_FUNGUS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_fungus"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WARPED_WART_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_wart_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WARPED_ROOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_roots"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> NETHER_SPROUTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_sprouts"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRIMSON_STEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_stem"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STRIPPED_CRIMSON_STEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_crimson_stem"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRIMSON_HYPHAE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_hyphae"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STRIPPED_CRIMSON_HYPHAE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_crimson_hyphae"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRIMSON_NYLIUM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_nylium"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRIMSON_FUNGUS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_fungus"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SHROOMLIGHT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shroomlight"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WEEPING_VINES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weeping_vines"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WEEPING_VINES_PLANT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weeping_vines_plant"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TWISTING_VINES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "twisting_vines"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TWISTING_VINES_PLANT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "twisting_vines_plant"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRIMSON_ROOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_roots"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRIMSON_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_planks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WARPED_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_planks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRIMSON_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WARPED_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRIMSON_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WARPED_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRIMSON_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WARPED_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRIMSON_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WARPED_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRIMSON_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WARPED_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRIMSON_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WARPED_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRIMSON_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WARPED_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRIMSON_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WARPED_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRIMSON_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WARPED_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRIMSON_WALL_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_wall_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WARPED_WALL_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_wall_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> STRUCTURE_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "structure_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> JIGSAW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jigsaw"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> COMPOSTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "composter"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TARGET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "target"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BEE_NEST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bee_nest"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BEEHIVE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beehive"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> HONEY_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "honey_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> HONEYCOMB_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "honeycomb_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> NETHERITE_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ANCIENT_DEBRIS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ancient_debris"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRYING_OBSIDIAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crying_obsidian"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RESPAWN_ANCHOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "respawn_anchor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_CRIMSON_FUNGUS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_crimson_fungus"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_WARPED_FUNGUS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_warped_fungus"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_CRIMSON_ROOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_crimson_roots"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_WARPED_ROOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_warped_roots"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LODESTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lodestone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLACKSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blackstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLACKSTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blackstone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLACKSTONE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blackstone_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLACKSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blackstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_BLACKSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_BLACKSTONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRACKED_POLISHED_BLACKSTONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cracked_polished_blackstone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHISELED_POLISHED_BLACKSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_polished_blackstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_BLACKSTONE_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_BLACKSTONE_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_BLACKSTONE_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GILDED_BLACKSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gilded_blackstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_BLACKSTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_BLACKSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_BLACKSTONE_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_BLACKSTONE_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_BLACKSTONE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHISELED_NETHER_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_nether_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRACKED_NETHER_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cracked_nether_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> QUARTZ_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "quartz_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WHITE_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ORANGE_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MAGENTA_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_BLUE_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> YELLOW_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIME_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PINK_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GRAY_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_GRAY_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CYAN_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PURPLE_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLUE_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BROWN_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GREEN_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLACK_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CANDLE_CAKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "candle_cake"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WHITE_CANDLE_CAKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_candle_cake"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ORANGE_CANDLE_CAKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_candle_cake"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MAGENTA_CANDLE_CAKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_candle_cake"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_BLUE_CANDLE_CAKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_candle_cake"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> YELLOW_CANDLE_CAKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_candle_cake"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIME_CANDLE_CAKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_candle_cake"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PINK_CANDLE_CAKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_candle_cake"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GRAY_CANDLE_CAKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_candle_cake"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHT_GRAY_CANDLE_CAKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_candle_cake"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CYAN_CANDLE_CAKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_candle_cake"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PURPLE_CANDLE_CAKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_candle_cake"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLUE_CANDLE_CAKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_candle_cake"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BROWN_CANDLE_CAKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_candle_cake"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> GREEN_CANDLE_CAKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_candle_cake"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RED_CANDLE_CAKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_candle_cake"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BLACK_CANDLE_CAKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_candle_cake"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> AMETHYST_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "amethyst_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BUDDING_AMETHYST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "budding_amethyst"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> AMETHYST_CLUSTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "amethyst_cluster"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LARGE_AMETHYST_BUD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "large_amethyst_bud"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MEDIUM_AMETHYST_BUD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "medium_amethyst_bud"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SMALL_AMETHYST_BUD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "small_amethyst_bud"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TUFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TUFF_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TUFF_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TUFF_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_TUFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_tuff"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_TUFF_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_tuff_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_TUFF_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_tuff_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_TUFF_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_tuff_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHISELED_TUFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_tuff"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TUFF_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TUFF_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TUFF_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TUFF_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHISELED_TUFF_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_tuff_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CALCITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "calcite"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TINTED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tinted_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POWDER_SNOW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "powder_snow"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SCULK_SENSOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_sensor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CALIBRATED_SCULK_SENSOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "calibrated_sculk_sensor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SCULK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SCULK_VEIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_vein"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SCULK_CATALYST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_catalyst"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SCULK_SHRIEKER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_shrieker"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> COPPER_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> EXPOSED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WEATHERED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OXIDIZED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> COPPER_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEEPSLATE_COPPER_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_copper_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OXIDIZED_CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WEATHERED_CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> EXPOSED_CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OXIDIZED_CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WEATHERED_CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> EXPOSED_CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_OXIDIZED_CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_WEATHERED_CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_EXPOSED_CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OXIDIZED_CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WEATHERED_CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> EXPOSED_CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OXIDIZED_CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WEATHERED_CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> EXPOSED_CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_COPPER_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_copper_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_WEATHERED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_EXPOSED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_OXIDIZED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_OXIDIZED_CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_WEATHERED_CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_EXPOSED_CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_OXIDIZED_CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_WEATHERED_CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_EXPOSED_CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_OXIDIZED_CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_WEATHERED_CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_EXPOSED_CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> EXPOSED_COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OXIDIZED_COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WEATHERED_COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_EXPOSED_COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_OXIDIZED_COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_WEATHERED_COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> EXPOSED_COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OXIDIZED_COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WEATHERED_COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_EXPOSED_COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_OXIDIZED_COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_WEATHERED_COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> EXPOSED_COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WEATHERED_COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OXIDIZED_COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_EXPOSED_COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_WEATHERED_COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_OXIDIZED_COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> EXPOSED_COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WEATHERED_COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OXIDIZED_COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_EXPOSED_COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_WEATHERED_COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> WAXED_OXIDIZED_COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> LIGHTNING_ROD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lightning_rod"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POINTED_DRIPSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pointed_dripstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DRIPSTONE_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dripstone_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CAVE_VINES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cave_vines"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CAVE_VINES_PLANT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cave_vines_plant"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SPORE_BLOSSOM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spore_blossom"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> AZALEA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "azalea"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> FLOWERING_AZALEA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flowering_azalea"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MOSS_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "moss_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PINK_PETALS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_petals"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MOSS_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "moss_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BIG_DRIPLEAF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "big_dripleaf"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> BIG_DRIPLEAF_STEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "big_dripleaf_stem"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SMALL_DRIPLEAF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "small_dripleaf"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> HANGING_ROOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hanging_roots"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> ROOTED_DIRT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rooted_dirt"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> MUD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEEPSLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> COBBLED_DEEPSLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobbled_deepslate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> COBBLED_DEEPSLATE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobbled_deepslate_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> COBBLED_DEEPSLATE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobbled_deepslate_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> COBBLED_DEEPSLATE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobbled_deepslate_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_DEEPSLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_deepslate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_DEEPSLATE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_deepslate_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_DEEPSLATE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_deepslate_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POLISHED_DEEPSLATE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_deepslate_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEEPSLATE_TILES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_tiles"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEEPSLATE_TILE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_tile_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEEPSLATE_TILE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_tile_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEEPSLATE_TILE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_tile_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEEPSLATE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEEPSLATE_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEEPSLATE_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DEEPSLATE_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CHISELED_DEEPSLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_deepslate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRACKED_DEEPSLATE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cracked_deepslate_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRACKED_DEEPSLATE_TILES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cracked_deepslate_tiles"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> INFESTED_DEEPSLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infested_deepslate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> SMOOTH_BASALT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_basalt"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RAW_IRON_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "raw_iron_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RAW_COPPER_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "raw_copper_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> RAW_GOLD_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "raw_gold_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_AZALEA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_azalea_bush"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> POTTED_FLOWERING_AZALEA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potted_flowering_azalea_bush"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> OCHRE_FROGLIGHT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ochre_froglight"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> VERDANT_FROGLIGHT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "verdant_froglight"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> PEARLESCENT_FROGLIGHT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pearlescent_froglight"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> FROGSPAWN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "frogspawn"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> REINFORCED_DEEPSLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "reinforced_deepslate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> DECORATED_POT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "decorated_pot"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> CRAFTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crafter"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> TRIAL_SPAWNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trial_spawner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> VAULT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vault"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

	public static final MCCReference<MCCBlockType> HEAVY_CORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "heavy_core"), VANILLA_REGISTRY_KEY, new TypeToken<MCCBlockType>(){}).getAsReference();

}
