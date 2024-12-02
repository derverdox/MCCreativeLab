package de.verdox.mccreativelab.wrapper.typed;

import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import com.google.common.reflect.TypeToken;
import net.kyori.adventure.key.Key;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;

public class MCCItems  {

	public static final Key VANILLA_REGISTRY_KEY  = Key.key("minecraft", "item");

	public static final MCCReference<MCCItemType> AIR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "air"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GRANITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "granite"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_GRANITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_granite"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DIORITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diorite"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_DIORITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_diorite"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ANDESITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "andesite"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_ANDESITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_andesite"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEEPSLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COBBLED_DEEPSLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobbled_deepslate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_DEEPSLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_deepslate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CALCITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "calcite"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TUFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TUFF_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TUFF_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TUFF_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHISELED_TUFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_tuff"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_TUFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_tuff"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_TUFF_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_tuff_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_TUFF_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_tuff_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_TUFF_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_tuff_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TUFF_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TUFF_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TUFF_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TUFF_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHISELED_TUFF_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_tuff_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DRIPSTONE_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dripstone_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GRASS_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "grass_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DIRT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dirt"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COARSE_DIRT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "coarse_dirt"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PODZOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "podzol"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ROOTED_DIRT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rooted_dirt"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRIMSON_NYLIUM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_nylium"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WARPED_NYLIUM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_nylium"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COBBLESTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobblestone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OAK_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_planks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPRUCE_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_planks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BIRCH_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_planks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> JUNGLE_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_planks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ACACIA_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_planks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHERRY_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_planks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DARK_OAK_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_planks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MANGROVE_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_planks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BAMBOO_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_planks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRIMSON_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_planks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WARPED_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_planks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BAMBOO_MOSAIC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_mosaic"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OAK_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPRUCE_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BIRCH_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> JUNGLE_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ACACIA_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHERRY_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DARK_OAK_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MANGROVE_PROPAGULE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_propagule"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BEDROCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bedrock"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sand"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SUSPICIOUS_SAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "suspicious_sand"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SUSPICIOUS_GRAVEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "suspicious_gravel"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_SAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_sand"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GRAVEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gravel"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COAL_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "coal_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEEPSLATE_COAL_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_coal_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> IRON_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEEPSLATE_IRON_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_iron_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COPPER_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEEPSLATE_COPPER_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_copper_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GOLD_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gold_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEEPSLATE_GOLD_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_gold_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> REDSTONE_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "redstone_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEEPSLATE_REDSTONE_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_redstone_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> EMERALD_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "emerald_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEEPSLATE_EMERALD_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_emerald_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LAPIS_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lapis_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEEPSLATE_LAPIS_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_lapis_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DIAMOND_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEEPSLATE_DIAMOND_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_diamond_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHER_GOLD_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_gold_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHER_QUARTZ_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_quartz_ore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ANCIENT_DEBRIS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ancient_debris"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "coal_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RAW_IRON_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "raw_iron_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RAW_COPPER_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "raw_copper_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RAW_GOLD_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "raw_gold_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> HEAVY_CORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "heavy_core"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> AMETHYST_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "amethyst_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BUDDING_AMETHYST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "budding_amethyst"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> IRON_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COPPER_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GOLD_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gold_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DIAMOND_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHERITE_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> EXPOSED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WEATHERED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OXIDIZED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> EXPOSED_CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WEATHERED_CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OXIDIZED_CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> EXPOSED_CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WEATHERED_CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OXIDIZED_CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> EXPOSED_CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WEATHERED_CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OXIDIZED_CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> EXPOSED_CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WEATHERED_CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OXIDIZED_CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_COPPER_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_copper_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_EXPOSED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_WEATHERED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_OXIDIZED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_EXPOSED_CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_WEATHERED_CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_OXIDIZED_CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_EXPOSED_CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_WEATHERED_CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_OXIDIZED_CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_EXPOSED_CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_WEATHERED_CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_OXIDIZED_CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_EXPOSED_CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_WEATHERED_CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_OXIDIZED_CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OAK_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPRUCE_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BIRCH_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> JUNGLE_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ACACIA_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHERRY_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DARK_OAK_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MANGROVE_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MANGROVE_ROOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_roots"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUDDY_MANGROVE_ROOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "muddy_mangrove_roots"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRIMSON_STEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_stem"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WARPED_STEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_stem"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BAMBOO_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRIPPED_OAK_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_oak_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRIPPED_SPRUCE_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_spruce_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRIPPED_BIRCH_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_birch_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRIPPED_JUNGLE_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_jungle_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRIPPED_ACACIA_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_acacia_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRIPPED_CHERRY_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_cherry_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRIPPED_DARK_OAK_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_dark_oak_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRIPPED_MANGROVE_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_mangrove_log"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRIPPED_CRIMSON_STEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_crimson_stem"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRIPPED_WARPED_STEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_warped_stem"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRIPPED_OAK_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_oak_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRIPPED_SPRUCE_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_spruce_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRIPPED_BIRCH_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_birch_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRIPPED_JUNGLE_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_jungle_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRIPPED_ACACIA_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_acacia_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRIPPED_CHERRY_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_cherry_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRIPPED_DARK_OAK_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_dark_oak_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRIPPED_MANGROVE_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_mangrove_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRIPPED_CRIMSON_HYPHAE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_crimson_hyphae"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRIPPED_WARPED_HYPHAE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_warped_hyphae"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRIPPED_BAMBOO_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_bamboo_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OAK_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPRUCE_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BIRCH_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> JUNGLE_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ACACIA_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHERRY_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DARK_OAK_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MANGROVE_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_wood"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRIMSON_HYPHAE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_hyphae"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WARPED_HYPHAE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_hyphae"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OAK_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPRUCE_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BIRCH_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> JUNGLE_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ACACIA_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHERRY_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DARK_OAK_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MANGROVE_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> AZALEA_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "azalea_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FLOWERING_AZALEA_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flowering_azalea_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPONGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sponge"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WET_SPONGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wet_sponge"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TINTED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tinted_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LAPIS_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lapis_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHISELED_SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CUT_SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cut_sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COBWEB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobweb"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SHORT_GRASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "short_grass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fern"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> AZALEA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "azalea"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FLOWERING_AZALEA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flowering_azalea"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEAD_BUSH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_bush"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SEAGRASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "seagrass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SEA_PICKLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sea_pickle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WHITE_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ORANGE_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MAGENTA_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_BLUE_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> YELLOW_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIME_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PINK_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GRAY_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_GRAY_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CYAN_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PURPLE_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLUE_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BROWN_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GREEN_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLACK_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_wool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DANDELION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dandelion"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POPPY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "poppy"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLUE_ORCHID  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_orchid"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ALLIUM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "allium"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> AZURE_BLUET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "azure_bluet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_TULIP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_tulip"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ORANGE_TULIP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_tulip"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WHITE_TULIP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_tulip"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PINK_TULIP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_tulip"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OXEYE_DAISY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxeye_daisy"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CORNFLOWER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cornflower"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LILY_OF_THE_VALLEY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lily_of_the_valley"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WITHER_ROSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither_rose"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TORCHFLOWER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "torchflower"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PITCHER_PLANT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pitcher_plant"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPORE_BLOSSOM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spore_blossom"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BROWN_MUSHROOM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_mushroom"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_MUSHROOM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_mushroom"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRIMSON_FUNGUS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_fungus"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WARPED_FUNGUS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_fungus"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRIMSON_ROOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_roots"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WARPED_ROOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_roots"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHER_SPROUTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_sprouts"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WEEPING_VINES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weeping_vines"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TWISTING_VINES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "twisting_vines"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SUGAR_CANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sugar_cane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> KELP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "kelp"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MOSS_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "moss_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PINK_PETALS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_petals"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MOSS_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "moss_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> HANGING_ROOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hanging_roots"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BIG_DRIPLEAF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "big_dripleaf"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SMALL_DRIPLEAF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "small_dripleaf"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BAMBOO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OAK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPRUCE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BIRCH_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> JUNGLE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ACACIA_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHERRY_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DARK_OAK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MANGROVE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BAMBOO_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BAMBOO_MOSAIC_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_mosaic_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRIMSON_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WARPED_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SMOOTH_STONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_stone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SANDSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sandstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CUT_STANDSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cut_sandstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PETRIFIED_OAK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "petrified_oak_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COBBLESTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobblestone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STONE_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUD_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHER_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> QUARTZ_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "quartz_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_SANDSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_sandstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CUT_RED_SANDSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cut_red_sandstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PURPUR_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purpur_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PRISMARINE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PRISMARINE_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DARK_PRISMARINE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_prismarine_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SMOOTH_QUARTZ  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_quartz"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SMOOTH_RED_SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_red_sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SMOOTH_SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SMOOTH_STONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_stone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BOOKSHELF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bookshelf"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHISELED_BOOKSHELF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_bookshelf"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DECORATED_POT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "decorated_pot"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MOSSY_COBBLESTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_cobblestone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OBSIDIAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "obsidian"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TORCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "torch"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> END_ROD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_rod"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHORUS_PLANT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chorus_plant"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHORUS_FLOWER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chorus_flower"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PURPUR_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purpur_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PURPUR_PILLAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purpur_pillar"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PURPUR_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purpur_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPAWNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spawner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHEST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chest"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRAFTING_TABLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crafting_table"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FARMLAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "farmland"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FURNACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "furnace"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LADDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ladder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COBBLESTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobblestone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SNOW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snow"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ICE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ice"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SNOW_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snow_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CACTUS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cactus"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CLAY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "clay"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> JUKEBOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jukebox"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OAK_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPRUCE_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BIRCH_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> JUNGLE_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ACACIA_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHERRY_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DARK_OAK_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MANGROVE_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BAMBOO_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRIMSON_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WARPED_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PUMPKIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pumpkin"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CARVED_PUMPKIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "carved_pumpkin"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> JACK_O_LANTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jack_o_lantern"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHERRACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherrack"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SOUL_SAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_sand"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SOUL_SOIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_soil"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BASALT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "basalt"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_BASALT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_basalt"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SMOOTH_BASALT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_basalt"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SOUL_TORCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_torch"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GLOWSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glowstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> INFESTED_STONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infested_stone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> INFESTED_COBBLESTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infested_cobblestone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> INFESTED_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infested_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> INFESTED_MOSSY_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infested_mossy_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> INFESTED_CRACKED_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infested_cracked_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> INFESTED_CHISELED_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infested_chiseled_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> INFESTED_DEEPSLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infested_deepslate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MOSSY_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRACKED_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cracked_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHISELED_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PACKED_MUD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "packed_mud"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUD_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEEPSLATE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRACKED_DEEPSLATE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cracked_deepslate_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEEPSLATE_TILES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_tiles"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRACKED_DEEPSLATE_TILES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cracked_deepslate_tiles"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHISELED_DEEPSLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_deepslate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> REINFORCED_DEEPSLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "reinforced_deepslate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BROWN_MUSHROOM_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_mushroom_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_MUSHROOM_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_mushroom_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUSHROOM_STEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mushroom_stem"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> IRON_BARS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_bars"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHAIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chain"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MELON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "melon"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> VINE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vine"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GLOW_LICHEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glow_lichen"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STONE_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUD_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MYCELIUM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mycelium"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LILY_PAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lily_pad"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHER_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRACKED_NETHER_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cracked_nether_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHISELED_NETHER_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_nether_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHER_BRICK_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_brick_fence"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHER_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SCULK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SCULK_VEIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_vein"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SCULK_CATALYST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_catalyst"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SCULK_SHRIEKER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_shrieker"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ENCHANTING_TABLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "enchanting_table"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> END_PORTAL_FRAME  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_portal_frame"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> END_STONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_stone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> END_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DRAGON_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dragon_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SANDSTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sandstone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ENDER_CHEST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ender_chest"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> EMERALD_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "emerald_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OAK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPRUCE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BIRCH_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> JUNGLE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ACACIA_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHERRY_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DARK_OAK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MANGROVE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BAMBOO_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BAMBOO_MOSAIC_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_mosaic_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRIMSON_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WARPED_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COMMAND_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "command_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BEACON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beacon"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COBBLESTONE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobblestone_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MOSSY_COBBLESTONE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_cobblestone_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PRISMARINE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_SANDSTONE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_sandstone_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MOSSY_STONE_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_stone_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GRANITE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "granite_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STONE_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUD_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHER_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ANDESITE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "andesite_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_NETHER_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_nether_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SANDSTONE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sandstone_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> END_STONE_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_stone_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DIORITE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diorite_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLACKSTONE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blackstone_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_BLACKSTONE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_BLACKSTONE_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COBBLED_DEEPSLATE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobbled_deepslate_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_DEEPSLATE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_deepslate_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEEPSLATE_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEEPSLATE_TILE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_tile_wall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ANVIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "anvil"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHIPPED_ANVIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chipped_anvil"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DAMAGED_ANVIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "damaged_anvil"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHISELED_QUARTZ_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_quartz_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> QUARTZ_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "quartz_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> QUARTZ_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "quartz_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> QUARTZ_PILLAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "quartz_pillar"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> QUARTZ_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "quartz_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WHITE_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ORANGE_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MAGENTA_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_BLUE_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> YELLOW_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIME_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PINK_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GRAY_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_GRAY_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CYAN_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PURPLE_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLUE_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BROWN_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GREEN_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLACK_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BARRIER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "barrier"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> HAY_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hay_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WHITE_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ORANGE_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MAGENTA_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_BLUE_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> YELLOW_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIME_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PINK_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GRAY_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_GRAY_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CYAN_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PURPLE_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLUE_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BROWN_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GREEN_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLACK_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PACKED_ICE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "packed_ice"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DIRT_PATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dirt_path"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SUNFLOWER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sunflower"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LILAC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lilac"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ROSE_BUSH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rose_bush"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PEONY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "peony"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TALL_GRASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tall_grass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LARGE_FERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "large_fern"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WHITE_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ORANGE_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MAGENTA_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_BLUE_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> YELLOW_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIME_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PINK_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GRAY_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_GRAY_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CYAN_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PURPLE_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLUE_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BROWN_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GREEN_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLACK_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WHITE_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ORANGE_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MAGENTA_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_BLUE_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> YELLOW_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIME_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PINK_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GRAY_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_GRAY_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CYAN_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PURPLE_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLUE_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BROWN_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GREEN_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLACK_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PRISMARINE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PRISMARINE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DARK_PRISMARINE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_prismarine"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PRISMARINE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PRISMARINE_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DARK_PRISMARINE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_prismarine_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SEA_LANTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sea_lantern"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHISELED_RED_SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_red_sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CUT_RED_SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cut_red_sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_SANDSTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_sandstone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> REPEATING_COMMAND_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "repeating_command_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHAIN_COMMAND_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chain_command_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MAGMA_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magma_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHER_WART_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wart_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WARPED_WART_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_wart_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_NETHER_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_nether_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BONE_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bone_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRUCTURE_VOID  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "structure_void"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WHITE_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ORANGE_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MAGENTA_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_BLUE_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> YELLOW_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIME_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PINK_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GRAY_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_GRAY_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CYAN_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PURPLE_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLUE_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BROWN_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GREEN_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLACK_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WHITE_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ORANGE_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MAGENTA_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_BLUE_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> YELLOW_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIME_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PINK_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GRAY_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_GRAY_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CYAN_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PURPLE_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLUE_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BROWN_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GREEN_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLACK_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WHITE_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ORANGE_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MAGENTA_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_BLUE_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> YELLOW_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIME_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PINK_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GRAY_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_GRAY_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CYAN_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PURPLE_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLUE_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BROWN_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GREEN_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLACK_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WHITE_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ORANGE_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MAGENTA_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_BLUE_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> YELLOW_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIME_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PINK_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GRAY_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_GRAY_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CYAN_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PURPLE_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLUE_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BROWN_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GREEN_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLACK_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TURTLE_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "turtle_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SNIFFER_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sniffer_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEAD_TUBE_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_tube_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEAD_BRAIN_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_brain_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEAD_BUBBLE_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_bubble_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEAD_FIRE_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_fire_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEAD_HORN_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_horn_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TUBE_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tube_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BRAIN_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brain_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BUBBLE_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bubble_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FIRE_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fire_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> HORN_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horn_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TUBE_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tube_coral"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BRAIN_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brain_coral"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BUBBLE_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bubble_coral"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FIRE_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fire_coral"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> HORN_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horn_coral"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEAD_BRAIN_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_brain_coral"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEAD_BUBBLE_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_bubble_coral"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEAD_FIRE_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_fire_coral"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEAD_HORN_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_horn_coral"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEAD_TUBE_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_tube_coral"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TUBE_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tube_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BRAIN_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brain_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BUBBLE_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bubble_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FIRE_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fire_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> HORN_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horn_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEAD_TUBE_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_tube_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEAD_BRAIN_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_brain_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEAD_BUBBLE_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_bubble_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEAD_FIRE_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_fire_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEAD_HORN_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_horn_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLUE_ICE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_ice"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CONDUIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "conduit"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_GRANITE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_granite_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SMOOTH_RED_SANDSTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_red_sandstone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MOSSY_STONE_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_stone_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_DIORITE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_diorite_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MOSSY_COBBLESTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_cobblestone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> END_STONE_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_stone_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SMOOTH_SANDSTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_sandstone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SMOOTH_QUARTZ_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_quartz_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GRANITE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "granite_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ANDESITE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "andesite_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_NETHER_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_nether_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_ANDESITE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_andesite_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DIORITE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diorite_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COBBLED_DEEPSLATE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobbled_deepslate_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_DEEPSLATE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_deepslate_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEEPSLATE_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEEPSLATE_TILE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_tile_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_GRANITE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_granite_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SMOOTH_RED_SANDSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_red_sandstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MOSSY_STONE_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_stone_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_DIORITE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_diorite_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MOSSY_COBBLESTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_cobblestone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> END_STONE_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_stone_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SMOOTH_SANDSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_sandstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SMOOTH_QUARTZ_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_quartz_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GRANITE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "granite_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ANDESITE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "andesite_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_NETHER_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_nether_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_ANDESITE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_andesite_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DIORITE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diorite_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COBBLED_DEEPSLATE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobbled_deepslate_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_DEEPSLATE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_deepslate_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEEPSLATE_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEEPSLATE_TILE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_tile_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SCAFFOLDING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "scaffolding"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> REDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "redstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> REDSTONE_TORCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "redstone_torch"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> REDSTONE_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "redstone_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> REPEATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "repeater"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COMPARATOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "comparator"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PISTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piston"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STICKY_PISTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sticky_piston"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SLIME_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slime_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> HONEY_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "honey_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OBSERVER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "observer"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> HOPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hopper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DISPENSER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dispenser"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DROPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dropper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LECTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lectern"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TARGET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "target"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LEVER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lever"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHTNING_ROD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lightning_rod"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DAYLIGHT_DETECTOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "daylight_detector"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SCULK_SENSOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_sensor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CALIBRATED_SCULK_SENSOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "calibrated_sculk_sensor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TRIPWIRE_HOOK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tripwire_hook"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TRAPPED_CHEST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trapped_chest"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TNT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tnt"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> REDSTONE_LAMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "redstone_lamp"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NOTE_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "note_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STONE_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_BLACKSTONE_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OAK_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPRUCE_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BIRCH_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> JUNGLE_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ACACIA_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHERRY_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DARK_OAK_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MANGROVE_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BAMBOO_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRIMSON_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WARPED_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_button"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STONE_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_BLACKSTONE_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_WEIGHTED_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_weighted_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> HEAVY_WEIGHTED_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "heavy_weighted_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OAK_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPRUCE_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BIRCH_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> JUNGLE_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ACACIA_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHERRY_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DARK_OAK_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MANGROVE_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BAMBOO_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRIMSON_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WARPED_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> IRON_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OAK_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPRUCE_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BIRCH_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> JUNGLE_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ACACIA_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHERRY_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DARK_OAK_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MANGROVE_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BAMBOO_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRIMSON_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WARPED_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> EXPOSED_COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WEATHERED_COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OXIDIZED_COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_EXPOSED_COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_WEATHERED_COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_OXIDIZED_COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> IRON_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OAK_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPRUCE_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BIRCH_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> JUNGLE_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ACACIA_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHERRY_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DARK_OAK_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MANGROVE_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BAMBOO_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRIMSON_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WARPED_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> EXPOSED_COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WEATHERED_COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OXIDIZED_COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_EXPOSED_COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_WEATHERED_COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_OXIDIZED_COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OAK_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPRUCE_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BIRCH_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> JUNGLE_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ACACIA_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHERRY_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DARK_OAK_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MANGROVE_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BAMBOO_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRIMSON_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WARPED_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POWERED_RAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "powered_rail"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DETECTOR_RAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "detector_rail"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rail"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ACTIVATOR_RAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "activator_rail"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SADDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "saddle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MINECART  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "minecart"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHEST_MINECART  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chest_minecart"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FURNACE_MINECART  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "furnace_minecart"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TNT_MINECART  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tnt_minecart"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> HOPPER_MINECART  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hopper_minecart"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CARROT_ON_A_STICK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "carrot_on_a_stick"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WARPED_FUNGUS_ON_A_STICK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_fungus_on_a_stick"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ELYTRA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "elytra"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OAK_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_boat"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OAK_CHEST_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_chest_boat"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPRUCE_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_boat"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPRUCE_CHEST_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_chest_boat"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BIRCH_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_boat"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BIRCH_CHEST_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_chest_boat"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> JUNGLE_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_boat"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> JUNGLE_CHEST_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_chest_boat"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ACACIA_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_boat"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ACACIA_CHEST_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_chest_boat"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHERRY_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_boat"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHERRY_CHEST_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_chest_boat"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DARK_OAK_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_boat"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DARK_OAK_CHEST_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_chest_boat"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MANGROVE_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_boat"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MANGROVE_CHEST_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_chest_boat"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BAMBOO_RAFT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_raft"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BAMBOO_CHEST_RAFT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_chest_raft"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRUCTURE_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "structure_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> JIGSAW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jigsaw"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TURTLE_HELMET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "turtle_helmet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TURTLE_SCUTE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "turtle_scute"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ARMADILLO_SCUTE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armadillo_scute"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WOLF_ARMOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wolf_armor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FLINT_AND_STEEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flint_and_steel"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BOWL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bowl"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> APPLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "apple"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BOW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bow"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ARROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "arrow"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "coal"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHARCOAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "charcoal"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DIAMOND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> EMERALD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "emerald"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LAPIS_LAZULI  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lapis_lazuli"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> QUARTZ  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "quartz"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> AMETHYST_SHARD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "amethyst_shard"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RAW_IRON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "raw_iron"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> IRON_INGOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_ingot"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RAW_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "raw_copper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COPPER_INGOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_ingot"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RAW_GOLD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "raw_gold"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GOLD_INGOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gold_ingot"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHERITE_INGOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_ingot"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHERITE_SCRAP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_scrap"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WOODEN_SWORD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wooden_sword"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WOODEN_SHOVEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wooden_shovel"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WOODEN_PICKAXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wooden_pickaxe"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WOODEN_AXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wooden_axe"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WOODEN_HOE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wooden_hoe"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STONE_SWORD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_sword"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STONE_SHOVEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_shovel"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STONE_PICKAXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_pickaxe"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STONE_AXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_axe"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STONE_HOE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_hoe"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GOLDEN_SWORD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_sword"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GOLDEN_SHOVEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_shovel"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GOLDEN_PICKAXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_pickaxe"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GOLDEN_AXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_axe"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GOLDEN_HOE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_hoe"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> IRON_SWORD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_sword"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> IRON_SHOVEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_shovel"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> IRON_PICKAXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_pickaxe"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> IRON_AXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_axe"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> IRON_HOE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_hoe"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DIAMOND_SWORD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_sword"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DIAMOND_SHOVEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_shovel"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DIAMOND_PICKAXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_pickaxe"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DIAMOND_AXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_axe"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DIAMOND_HOE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_hoe"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHERITE_SWORD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_sword"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHERITE_SHOVEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_shovel"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHERITE_PICKAXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_pickaxe"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHERITE_AXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_axe"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHERITE_HOE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_hoe"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STICK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stick"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUSHROOM_STEW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mushroom_stew"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "string"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FEATHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "feather"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GUNPOWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gunpowder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WHEAT_SEEDS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wheat_seeds"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WHEAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wheat"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BREAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bread"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LEATHER_HELMET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "leather_helmet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LEATHER_CHESTPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "leather_chestplate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LEATHER_LEGGINGS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "leather_leggings"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LEATHER_BOOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "leather_boots"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHAINMAIL_HELMET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chainmail_helmet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHAINMAIL_CHESTPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chainmail_chestplate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHAINMAIL_LEGGINGS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chainmail_leggings"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHAINMAIL_BOOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chainmail_boots"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> IRON_HELMET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_helmet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> IRON_CHESTPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_chestplate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> IRON_LEGGINGS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_leggings"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> IRON_BOOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_boots"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DIAMOND_HELMET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_helmet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DIAMOND_CHESTPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_chestplate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DIAMOND_LEGGINGS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_leggings"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DIAMOND_BOOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_boots"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GOLDEN_HELMET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_helmet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GOLDEN_CHESTPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_chestplate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GOLDEN_LEGGINGS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_leggings"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GOLDEN_BOOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_boots"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHERITE_HELMET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_helmet"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHERITE_CHESTPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_chestplate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHERITE_LEGGINGS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_leggings"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHERITE_BOOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_boots"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FLINT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flint"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PORKCHOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "porkchop"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COOKED_PORKCHOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cooked_porkchop"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PAINTING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "painting"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GOLDEN_APPLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_apple"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ENCHANTED_GOLDEN_APPLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "enchanted_golden_apple"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OAK_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPRUCE_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BIRCH_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> JUNGLE_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ACACIA_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHERRY_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DARK_OAK_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MANGROVE_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BAMBOO_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRIMSON_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WARPED_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OAK_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPRUCE_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BIRCH_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> JUNGLE_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ACACIA_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHERRY_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DARK_OAK_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MANGROVE_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BAMBOO_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRIMSON_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WARPED_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BUCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bucket"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WATER_BUCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "water_bucket"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LAVA_BUCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lava_bucket"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POWDER_SNOW_BUCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "powder_snow_bucket"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SNOWBALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snowball"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LEATHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "leather"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MILK_BUCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "milk_bucket"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PUFFERFISH_BUCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pufferfish_bucket"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SALMON_BUCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "salmon_bucket"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COD_BUCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cod_bucket"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TROPICAL_FISH_BUCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tropical_fish_bucket"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> AXOLOTL_BUCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "axolotl_bucket"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TADPOLE_BUCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tadpole_bucket"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BRICK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brick"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CLAY_BALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "clay_ball"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DRIED_KELP_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dried_kelp_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PAPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "paper"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BOOK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "book"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SLIME_BALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slime_ball"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COMPASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "compass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RECOVERY_COMPASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "recovery_compass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BUNDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bundle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FISHING_ROD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fishing_rod"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "clock"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPYGLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spyglass"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GLOWSTONE_DUST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glowstone_dust"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cod"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SALMON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "salmon"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TROPICAL_FISH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tropical_fish"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PUFFERFISH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pufferfish"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COOKED_COD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cooked_cod"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COOKED_SALMON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cooked_salmon"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> INK_SAC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ink_sac"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GLOW_INK_SAC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glow_ink_sac"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COCOA_BEANS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cocoa_beans"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WHITE_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_dye"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ORANGE_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_dye"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MAGENTA_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_dye"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_BLUE_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_dye"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> YELLOW_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_dye"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIME_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_dye"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PINK_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_dye"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GRAY_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_dye"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_GRAY_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_dye"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CYAN_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_dye"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PURPLE_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_dye"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLUE_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_dye"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BROWN_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_dye"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GREEN_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_dye"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_dye"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLACK_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_dye"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BONE_MEAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bone_meal"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SUGAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sugar"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CAKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cake"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WHITE_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ORANGE_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MAGENTA_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_BLUE_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> YELLOW_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIME_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PINK_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GRAY_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_GRAY_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CYAN_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PURPLE_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLUE_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BROWN_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GREEN_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLACK_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_bed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COOKIE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cookie"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRAFTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crafter"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FILLED_MAP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "filled_map"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SHEARS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shears"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MELON_SLICE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "melon_slice"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DRIED_KELP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dried_kelp"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PUMPKIN_SEEDS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pumpkin_seeds"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MELON_SEEDS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "melon_seeds"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BEEF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beef"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COOKED_BEEF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cooked_beef"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHICKEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chicken"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COOKED_CHICKEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cooked_chicken"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ROTTEN_FLESH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rotten_flesh"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ENDER_PEARL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ender_pearl"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLAZE_ROD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blaze_rod"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GHAST_TEAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ghast_tear"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GOLD_NUGGET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gold_nugget"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHER_WART  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wart"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POTION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potion"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GLASS_BOTTLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glass_bottle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPIDER_EYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spider_eye"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FERMENTED_SPIDER_EYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fermented_spider_eye"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLAZE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blaze_powder"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MAGMA_CREAM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magma_cream"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BREWING_STAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brewing_stand"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CAULDRON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cauldron"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ENDER_EYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ender_eye"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GLISTERING_MELON_SLICE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glistering_melon_slice"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ARMADILLO_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armadillo_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ALLAY_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "allay_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> AXOLOTL_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "axolotl_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BAT_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bat_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BEE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bee_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLAZE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blaze_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BOGGED_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bogged_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BREEZE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "breeze_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CAT_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cat_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CAMEL_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "camel_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CAVE_SPIDER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cave_spider_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHICKEN_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chicken_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COD_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cod_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COW_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cow_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CREEPER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "creeper_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DOLPHIN_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dolphin_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DONKEY_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "donkey_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DROWNED_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "drowned_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ELDER_GUARDIAN_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "elder_guardian_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ENDER_DRAGON_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ender_dragon_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ENDERMAN_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "enderman_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ENDERMITE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "endermite_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> EVOKER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "evoker_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FOX_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fox_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FROG_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "frog_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GHAST_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ghast_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GLOW_SQUID_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glow_squid_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GOAT_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GUARDIAN_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "guardian_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> HOGLIN_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hoglin_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> HORSE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horse_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> HUSK_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "husk_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> IRON_GOLEM_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_golem_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LLAMA_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "llama_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MAGMA_CUBE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magma_cube_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MOOSHROOM_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mooshroom_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MULE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mule_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OCELOT_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ocelot_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PANDA_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "panda_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PARROT_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PHANTOM_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "phantom_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PIG_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pig_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PIGLIN_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PIGLIN_BRUTE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_brute_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PILLAGER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pillager_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLAR_BEAR_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polar_bear_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PUFFERFISH_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pufferfish_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RABBIT_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rabbit_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RAVAGER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ravager_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SALMON_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "salmon_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SHEEP_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sheep_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SHULKER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shulker_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SILVERFISH_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "silverfish_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SKELETON_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skeleton_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SKELETON_HORSE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skeleton_horse_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SLIME_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slime_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SNIFFER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sniffer_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SNOW_GOLEM_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snow_golem_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPIDER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spider_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SQUID_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "squid_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRAY_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stray_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STRIDER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "strider_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TADPOLE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tadpole_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TRADER_LLAMA_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trader_llama_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TROPICAL_FISH_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tropical_fish_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TURTLE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "turtle_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> VEX_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vex_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> VILLAGER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "villager_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> VINDICATOR_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vindicator_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WANDERING_TRADER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wandering_trader_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WARDEN_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warden_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WITCH_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "witch_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WITHER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WITHER_SKELETON_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither_skeleton_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WOLF_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wolf_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ZOGLIN_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zoglin_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ZOMBIE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ZOMBIE_HORSE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_horse_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ZOMBIE_VILLAGER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_villager_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ZOMBIFIED_PIGLIN_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombified_piglin_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> EXPERIENCE_BOTTLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "experience_bottle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FIRE_CHARGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fire_charge"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WIND_CHARGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wind_charge"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WRITABLE_BOOK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "writable_book"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WRITTEN_BOOK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "written_book"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mace"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ITEM_FRAME  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item_frame"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GLOW_ITEM_FRAME  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glow_item_frame"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FLOWER_POT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flower_pot"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CARROT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "carrot"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POTATO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potato"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BAKED_POTATO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "baked_potato"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POISONOUS_POTATO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "poisonous_potato"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MAP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "map"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GOLDEN_CARROT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_carrot"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SKELETON_SKULL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skeleton_skull"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WITHER_SKELETON_SKULL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither_skeleton_skull"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PLAYER_HEAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_head"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ZOMBIE_HEAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_head"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CREEPER_HEAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "creeper_head"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DRAGON_HEAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dragon_head"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PIGLIN_HEAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_head"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHER_STAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_star"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PUMPKIN_PIE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pumpkin_pie"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FIREWORK_ROCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "firework_rocket"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FIREWORK_STAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "firework_star"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ENCHANTED_BOOK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "enchanted_book"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHER_BRICK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_brick"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PRISMARINE_SHARD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine_shard"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PRISMARINE_CRYSTALS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine_crystals"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RABBIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rabbit"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COOKED_RABBIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cooked_rabbit"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RABBIT_STEW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rabbit_stew"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RABBIT_FOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rabbit_foot"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RABBIT_HIDE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rabbit_hide"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ARMOR_STAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armor_stand"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> IRON_HORSE_ARMOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_horse_armor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GOLDEN_HORSE_ARMOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_horse_armor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DIAMOND_HORSE_ARMOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_horse_armor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LEATHER_HORSE_ARMOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "leather_horse_armor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LEAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lead"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NAME_TAG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "name_tag"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COMMAND_BLOCK_MINECART  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "command_block_minecart"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mutton"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COOKED_MUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cooked_mutton"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WHITE_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ORANGE_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MAGENTA_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_BLUE_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> YELLOW_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIME_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PINK_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GRAY_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_GRAY_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CYAN_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PURPLE_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLUE_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BROWN_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GREEN_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLACK_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_banner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> END_CRYSTAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_crystal"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHORUS_FRUIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chorus_fruit"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POPPED_CHORUS_FRUIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "popped_chorus_fruit"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TORCHFLOWER_SEEDS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "torchflower_seeds"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PITCHER_POD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pitcher_pod"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BEETROOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beetroot"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BEETROOT_SEEDS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beetroot_seeds"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BEETROOT_SOUP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beetroot_soup"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DRAGON_BREATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dragon_breath"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPLASH_POTION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "splash_potion"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPECTRAL_ARROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spectral_arrow"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TIPPED_ARROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tipped_arrow"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LINGERING_POTION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lingering_potion"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SHIELD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shield"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TOTEM_OF_UNDYING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "totem_of_undying"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SHULKER_SHELL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shulker_shell"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> IRON_NUGGET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_nugget"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> KNOWLEDGE_BOOK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "knowledge_book"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DEBUG_STICK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "debug_stick"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUSIC_DISC_13  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_13"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUSIC_DISC_CAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_cat"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUSIC_DISC_BLOCKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_blocks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUSIC_DISC_CHIRP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_chirp"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUSIC_DISC_CREATOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_creator"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUSIC_DISC_CREATOR_MUSIC_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_creator_music_box"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUSIC_DISC_FAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_far"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUSIC_DISC_MALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_mall"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUSIC_DISC_MELLOHI  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_mellohi"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUSIC_DISC_STAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_stal"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUSIC_DISC_STRAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_strad"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUSIC_DISC_WARD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_ward"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUSIC_DISC_11  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_11"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUSIC_DISC_WAIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_wait"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUSIC_DISC_OTHERSIDE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_otherside"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUSIC_DISC_RELIC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_relic"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUSIC_DISC_5  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_5"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUSIC_DISC_PIGSTEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_pigstep"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MUSIC_DISC_PRECIPICE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_precipice"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DISC_FRAGMENT_5  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "disc_fragment_5"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TRIDENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trident"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PHANTOM_MEMBRANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "phantom_membrane"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NAUTILUS_SHELL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nautilus_shell"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> HEART_OF_THE_SEA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "heart_of_the_sea"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CROSSBOW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crossbow"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SUSPICIOUS_STEW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "suspicious_stew"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LOOM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "loom"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FLOWER_BANNER_PATTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flower_banner_pattern"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CREEPER_BANNER_PATTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "creeper_banner_pattern"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SKULL_BANNER_PATTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skull_banner_pattern"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MOJANG_BANNER_PATTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mojang_banner_pattern"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GLOBE_BANNER_PATTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "globe_banner_pattern"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PIGLIN_BANNER_PATTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_banner_pattern"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FLOW_BANNER_PATTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flow_banner_pattern"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GUSTER_BANNER_PATTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "guster_banner_pattern"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GOAT_HORN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_horn"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COMPOSTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "composter"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BARREL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "barrel"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SMOKER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smoker"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLAST_FURNACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blast_furnace"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CARTOGRAPHY_TABLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cartography_table"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FLETCHING_TABLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fletching_table"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GRINDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "grindstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SMITHING_TABLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smithing_table"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> STONECUTTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stonecutter"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BELL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bell"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LANTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lantern"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SOUL_LANTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_lantern"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SWEET_BERRIES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sweet_berries"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GLOW_BERRIES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glow_berries"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CAMPFIRE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "campfire"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SOUL_CAMPFIRE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_campfire"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SHROOMLIGHT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shroomlight"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> HONEYCOMB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "honeycomb"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BEE_NEST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bee_nest"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BEEHIVE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beehive"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> HONEY_BOTTLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "honey_bottle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> HONEYCOMB_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "honeycomb_block"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LODESTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lodestone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRYING_OBSIDIAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crying_obsidian"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLACKSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blackstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLACKSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blackstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLACKSTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blackstone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GILDED_BLACKSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gilded_blackstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_BLACKSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_BLACKSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_BLACKSTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CHISELED_POLISHED_BLACKSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_polished_blackstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_BLACKSTONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_BLACKSTONE_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POLISHED_BLACKSTONE_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CRACKED_POLISHED_BLACKSTONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cracked_polished_blackstone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RESPAWN_ANCHOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "respawn_anchor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WHITE_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ORANGE_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MAGENTA_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_BLUE_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> YELLOW_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIME_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PINK_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GRAY_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LIGHT_GRAY_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> CYAN_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PURPLE_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLUE_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BROWN_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GREEN_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RED_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLACK_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_candle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SMALL_AMETHYST_BUD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "small_amethyst_bud"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MEDIUM_AMETHYST_BUD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "medium_amethyst_bud"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> LARGE_AMETHYST_BUD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "large_amethyst_bud"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> AMETHYST_CLUSTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "amethyst_cluster"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> POINTED_DRIPSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pointed_dripstone"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OCHRE_FROGLIGHT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ochre_froglight"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> VERDANT_FROGLIGHT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "verdant_froglight"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PEARLESCENT_FROGLIGHT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pearlescent_froglight"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FROGSPAWN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "frogspawn"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ECHO_SHARD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "echo_shard"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BRUSH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brush"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> NETHERITE_UPGRADE_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_upgrade_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sentry_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DUNE_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dune_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COAST_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "coast_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WILD_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wild_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WARD_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ward_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> EYE_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "eye_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> VEX_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vex_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TIDE_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tide_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snout_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RIB_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rib_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spire_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wayfinder_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shaper_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "silence_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> RAISER_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "raiser_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> HOST_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "host_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FLOW_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flow_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BOLT_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bolt_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ANGLER_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "angler_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ARCHER_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "archer_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> ARMS_UP_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "arms_up_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BLADE_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blade_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BREWER_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brewer_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BURN_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "burn_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> DANGER_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "danger_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> EXPLORER_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "explorer_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FLOW_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flow_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> FRIEND_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "friend_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> GUSTER_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "guster_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> HEART_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "heart_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> HEARTBREAK_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "heartbreak_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> HOWL_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "howl_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MINER_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "miner_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> MOURNER_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mourner_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PLENTY_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "plenty_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> PRIZE_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prize_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SCRAPE_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "scrape_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SHEAF_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sheaf_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SHELTER_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shelter_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SKULL_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skull_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> SNORT_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snort_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> EXPOSED_COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WEATHERED_COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OXIDIZED_COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_EXPOSED_COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_WEATHERED_COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_OXIDIZED_COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> EXPOSED_COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WEATHERED_COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OXIDIZED_COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_EXPOSED_COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_WEATHERED_COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> WAXED_OXIDIZED_COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TRIAL_SPAWNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trial_spawner"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> TRIAL_KEY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trial_key"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OMINOUS_TRIAL_KEY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ominous_trial_key"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> VAULT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vault"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> OMINOUS_BOTTLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ominous_bottle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

	public static final MCCReference<MCCItemType> BREEZE_ROD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "breeze_rod"), VANILLA_REGISTRY_KEY, new TypeToken<MCCItemType>(){}).getAsReference();

}
