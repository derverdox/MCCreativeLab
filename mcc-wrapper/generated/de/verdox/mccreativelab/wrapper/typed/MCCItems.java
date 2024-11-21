package de.verdox.mccreativelab.wrapper.typed;

import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCRegistry;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import com.google.common.reflect.TypeToken;
import net.kyori.adventure.key.Key;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;

public class MCCItems  {

	public static final Key VANILLA_REGISTRY_KEY  = Key.key("minecraft", "item");

	public static final MCCTypedKey<MCCRegistry<MCCItemType>> VANILLA_REGISTRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "root"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});;

	public static final MCCTypedKey<MCCItemType> AIR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "air"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GRANITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "granite"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_GRANITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_granite"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DIORITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diorite"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_DIORITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_diorite"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ANDESITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "andesite"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_ANDESITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_andesite"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEEPSLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COBBLED_DEEPSLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobbled_deepslate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_DEEPSLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_deepslate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CALCITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "calcite"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TUFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TUFF_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TUFF_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TUFF_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHISELED_TUFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_tuff"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_TUFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_tuff"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_TUFF_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_tuff_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_TUFF_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_tuff_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_TUFF_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_tuff_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TUFF_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TUFF_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TUFF_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TUFF_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHISELED_TUFF_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_tuff_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DRIPSTONE_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dripstone_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GRASS_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "grass_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DIRT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dirt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COARSE_DIRT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "coarse_dirt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PODZOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "podzol"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ROOTED_DIRT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rooted_dirt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRIMSON_NYLIUM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_nylium"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WARPED_NYLIUM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_nylium"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COBBLESTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobblestone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OAK_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_planks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPRUCE_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_planks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BIRCH_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_planks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> JUNGLE_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_planks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ACACIA_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_planks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHERRY_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_planks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DARK_OAK_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_planks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MANGROVE_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_planks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BAMBOO_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_planks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRIMSON_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_planks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WARPED_PLANKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_planks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BAMBOO_MOSAIC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_mosaic"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OAK_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPRUCE_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BIRCH_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> JUNGLE_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ACACIA_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHERRY_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DARK_OAK_SAPLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_sapling"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MANGROVE_PROPAGULE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_propagule"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BEDROCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bedrock"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sand"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SUSPICIOUS_SAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "suspicious_sand"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SUSPICIOUS_GRAVEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "suspicious_gravel"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_SAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_sand"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GRAVEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gravel"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COAL_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "coal_ore"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEEPSLATE_COAL_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_coal_ore"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> IRON_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_ore"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEEPSLATE_IRON_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_iron_ore"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COPPER_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_ore"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEEPSLATE_COPPER_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_copper_ore"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GOLD_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gold_ore"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEEPSLATE_GOLD_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_gold_ore"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> REDSTONE_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "redstone_ore"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEEPSLATE_REDSTONE_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_redstone_ore"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> EMERALD_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "emerald_ore"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEEPSLATE_EMERALD_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_emerald_ore"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LAPIS_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lapis_ore"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEEPSLATE_LAPIS_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_lapis_ore"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DIAMOND_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_ore"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEEPSLATE_DIAMOND_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_diamond_ore"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHER_GOLD_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_gold_ore"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHER_QUARTZ_ORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_quartz_ore"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ANCIENT_DEBRIS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ancient_debris"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "coal_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RAW_IRON_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "raw_iron_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RAW_COPPER_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "raw_copper_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RAW_GOLD_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "raw_gold_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> HEAVY_CORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "heavy_core"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> AMETHYST_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "amethyst_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BUDDING_AMETHYST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "budding_amethyst"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> IRON_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COPPER_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GOLD_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gold_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DIAMOND_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHERITE_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> EXPOSED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WEATHERED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OXIDIZED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> EXPOSED_CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WEATHERED_CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OXIDIZED_CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> EXPOSED_CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WEATHERED_CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OXIDIZED_CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> EXPOSED_CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WEATHERED_CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OXIDIZED_CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> EXPOSED_CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WEATHERED_CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OXIDIZED_CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_COPPER_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_copper_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_EXPOSED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_WEATHERED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_OXIDIZED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_EXPOSED_CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_WEATHERED_CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_OXIDIZED_CHISELED_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_chiseled_copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_EXPOSED_CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_WEATHERED_CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_OXIDIZED_CUT_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_cut_copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_EXPOSED_CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_WEATHERED_CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_OXIDIZED_CUT_COPPER_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_cut_copper_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_EXPOSED_CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_WEATHERED_CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_OXIDIZED_CUT_COPPER_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_cut_copper_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OAK_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_log"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPRUCE_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_log"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BIRCH_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_log"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> JUNGLE_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_log"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ACACIA_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_log"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHERRY_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_log"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DARK_OAK_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_log"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MANGROVE_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_log"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MANGROVE_ROOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_roots"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUDDY_MANGROVE_ROOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "muddy_mangrove_roots"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRIMSON_STEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_stem"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WARPED_STEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_stem"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BAMBOO_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRIPPED_OAK_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_oak_log"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRIPPED_SPRUCE_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_spruce_log"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRIPPED_BIRCH_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_birch_log"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRIPPED_JUNGLE_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_jungle_log"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRIPPED_ACACIA_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_acacia_log"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRIPPED_CHERRY_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_cherry_log"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRIPPED_DARK_OAK_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_dark_oak_log"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRIPPED_MANGROVE_LOG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_mangrove_log"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRIPPED_CRIMSON_STEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_crimson_stem"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRIPPED_WARPED_STEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_warped_stem"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRIPPED_OAK_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_oak_wood"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRIPPED_SPRUCE_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_spruce_wood"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRIPPED_BIRCH_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_birch_wood"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRIPPED_JUNGLE_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_jungle_wood"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRIPPED_ACACIA_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_acacia_wood"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRIPPED_CHERRY_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_cherry_wood"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRIPPED_DARK_OAK_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_dark_oak_wood"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRIPPED_MANGROVE_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_mangrove_wood"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRIPPED_CRIMSON_HYPHAE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_crimson_hyphae"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRIPPED_WARPED_HYPHAE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_warped_hyphae"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRIPPED_BAMBOO_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stripped_bamboo_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OAK_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_wood"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPRUCE_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_wood"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BIRCH_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_wood"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> JUNGLE_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_wood"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ACACIA_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_wood"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHERRY_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wood"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DARK_OAK_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_wood"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MANGROVE_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_wood"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRIMSON_HYPHAE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_hyphae"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WARPED_HYPHAE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_hyphae"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OAK_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPRUCE_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BIRCH_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> JUNGLE_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ACACIA_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHERRY_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DARK_OAK_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MANGROVE_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> AZALEA_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "azalea_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FLOWERING_AZALEA_LEAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flowering_azalea_leaves"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPONGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sponge"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WET_SPONGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wet_sponge"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TINTED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tinted_glass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LAPIS_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lapis_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHISELED_SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CUT_SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cut_sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COBWEB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobweb"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SHORT_GRASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "short_grass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fern"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> AZALEA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "azalea"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FLOWERING_AZALEA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flowering_azalea"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEAD_BUSH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_bush"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SEAGRASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "seagrass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SEA_PICKLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sea_pickle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WHITE_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_wool"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ORANGE_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_wool"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MAGENTA_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_wool"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_BLUE_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_wool"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> YELLOW_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_wool"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIME_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_wool"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PINK_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_wool"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GRAY_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_wool"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_GRAY_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_wool"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CYAN_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_wool"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PURPLE_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_wool"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLUE_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_wool"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BROWN_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_wool"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GREEN_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_wool"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_wool"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLACK_WOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_wool"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DANDELION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dandelion"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POPPY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "poppy"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLUE_ORCHID  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_orchid"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ALLIUM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "allium"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> AZURE_BLUET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "azure_bluet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_TULIP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_tulip"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ORANGE_TULIP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_tulip"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WHITE_TULIP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_tulip"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PINK_TULIP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_tulip"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OXEYE_DAISY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxeye_daisy"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CORNFLOWER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cornflower"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LILY_OF_THE_VALLEY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lily_of_the_valley"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WITHER_ROSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither_rose"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TORCHFLOWER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "torchflower"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PITCHER_PLANT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pitcher_plant"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPORE_BLOSSOM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spore_blossom"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BROWN_MUSHROOM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_mushroom"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_MUSHROOM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_mushroom"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRIMSON_FUNGUS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_fungus"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WARPED_FUNGUS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_fungus"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRIMSON_ROOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_roots"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WARPED_ROOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_roots"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHER_SPROUTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_sprouts"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WEEPING_VINES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weeping_vines"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TWISTING_VINES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "twisting_vines"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SUGAR_CANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sugar_cane"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> KELP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "kelp"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MOSS_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "moss_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PINK_PETALS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_petals"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MOSS_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "moss_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> HANGING_ROOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hanging_roots"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BIG_DRIPLEAF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "big_dripleaf"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SMALL_DRIPLEAF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "small_dripleaf"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BAMBOO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OAK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPRUCE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BIRCH_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> JUNGLE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ACACIA_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHERRY_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DARK_OAK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MANGROVE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BAMBOO_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BAMBOO_MOSAIC_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_mosaic_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRIMSON_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WARPED_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SMOOTH_STONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_stone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SANDSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sandstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CUT_STANDSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cut_standstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PETRIFIED_OAK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "petrified_oak_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COBBLESTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobblestone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STONE_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUD_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHER_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> QUARTZ_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "quartz_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_SANDSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_sandstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CUT_RED_SANDSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cut_red_sandstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PURPUR_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purpur_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PRISMARINE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PRISMARINE_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DARK_PRISMARINE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_prismarine_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SMOOTH_QUARTZ  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_quartz"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SMOOTH_RED_SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_red_sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SMOOTH_SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SMOOTH_STONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_stone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bricks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BOOKSHELF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bookshelf"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHISELED_BOOKSHELF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_bookshelf"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DECORATED_POT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "decorated_pot"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MOSSY_COBBLESTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_cobblestone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OBSIDIAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "obsidian"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TORCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "torch"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> END_ROD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_rod"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHORUS_PLANT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chorus_plant"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHORUS_FLOWER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chorus_flower"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PURPUR_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purpur_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PURPUR_PILLAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purpur_pillar"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PURPUR_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purpur_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPAWNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spawner"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHEST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chest"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRAFTING_TABLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crafting_table"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FARMLAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "farmland"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FURNACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "furnace"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LADDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ladder"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COBBLESTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobblestone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SNOW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snow"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ICE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ice"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SNOW_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snow_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CACTUS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cactus"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CLAY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "clay"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> JUKEBOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jukebox"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OAK_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_fence"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPRUCE_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_fence"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BIRCH_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_fence"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> JUNGLE_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_fence"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ACACIA_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_fence"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHERRY_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_fence"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DARK_OAK_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_fence"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MANGROVE_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_fence"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BAMBOO_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_fence"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRIMSON_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_fence"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WARPED_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_fence"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PUMPKIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pumpkin"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CARVED_PUMPKIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "carved_pumpkin"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> JACK_O_LANTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jack_o_lantern"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHERRACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherrack"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SOUL_SAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_sand"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SOUL_SOIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_soil"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BASALT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "basalt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_BASALT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_basalt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SMOOTH_BASALT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_basalt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SOUL_TORCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_torch"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GLOWSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glowstone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> INFESTED_STONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infested_stone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> INFESTED_COBBLESTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infested_cobblestone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> INFESTED_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infested_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> INFESTED_MOSSY_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infested_mossy_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> INFESTED_CRACKED_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infested_cracked_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> INFESTED_CHISELED_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infested_chiseled_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> INFESTED_DEEPSLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infested_deepslate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MOSSY_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRACKED_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cracked_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHISELED_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PACKED_MUD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "packed_mud"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUD_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEEPSLATE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRACKED_DEEPSLATE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cracked_deepslate_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEEPSLATE_TILES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_tiles"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRACKED_DEEPSLATE_TILES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cracked_deepslate_tiles"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHISELED_DEEPSLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_deepslate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> REINFORCED_DEEPSLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "reinforced_deepslate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BROWN_MUSHROOM_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_mushroom_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_MUSHROOM_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_mushroom_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUSHROOM_STEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mushroom_stem"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> IRON_BARS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_bars"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHAIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chain"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MELON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "melon"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> VINE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vine"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GLOW_LICHEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glow_lichen"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STONE_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUD_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MYCELIUM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mycelium"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LILY_PAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lily_pad"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHER_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRACKED_NETHER_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cracked_nether_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHISELED_NETHER_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_nether_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHER_BRICK_FENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_brick_fence"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHER_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SCULK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SCULK_VEIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_vein"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SCULK_CATALYST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_catalyst"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SCULK_SHRIEKER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_shrieker"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ENCHANTING_TABLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "enchanting_table"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> END_PORTAL_FRAME  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_portal_frame"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> END_STONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_stone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> END_STONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_stone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DRAGON_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dragon_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SANDSTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sandstone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ENDER_CHEST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ender_chest"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> EMERALD_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "emerald_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OAK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPRUCE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BIRCH_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> JUNGLE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ACACIA_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHERRY_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DARK_OAK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MANGROVE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BAMBOO_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BAMBOO_MOSAIC_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_mosaic_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRIMSON_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WARPED_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COMMAND_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "command_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BEACON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beacon"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COBBLESTONE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobblestone_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MOSSY_COBBLESTONE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_cobblestone_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PRISMARINE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_SANDSTONE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_sandstone_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MOSSY_STONE_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_stone_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GRANITE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "granite_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STONE_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUD_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHER_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ANDESITE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "andesite_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_NETHER_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_nether_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SANDSTONE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sandstone_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> END_STONE_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_stone_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DIORITE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diorite_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLACKSTONE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blackstone_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_BLACKSTONE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_BLACKSTONE_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COBBLED_DEEPSLATE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobbled_deepslate_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_DEEPSLATE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_deepslate_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEEPSLATE_BRICK_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_brick_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEEPSLATE_TILE_WALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_tile_wall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ANVIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "anvil"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHIPPED_ANVIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chipped_anvil"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DAMAGED_ANVIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "damaged_anvil"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHISELED_QUARTZ_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_quartz_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> QUARTZ_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "quartz_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> QUARTZ_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "quartz_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> QUARTZ_PILLAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "quartz_pillar"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> QUARTZ_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "quartz_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WHITE_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ORANGE_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MAGENTA_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_BLUE_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> YELLOW_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIME_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PINK_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GRAY_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_GRAY_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CYAN_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PURPLE_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLUE_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BROWN_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GREEN_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLACK_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BARRIER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "barrier"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> HAY_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hay_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WHITE_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ORANGE_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MAGENTA_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_BLUE_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> YELLOW_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIME_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PINK_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GRAY_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_GRAY_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CYAN_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PURPLE_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLUE_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BROWN_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GREEN_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLACK_CARPET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_carpet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PACKED_ICE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "packed_ice"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DIRT_PATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dirt_path"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SUNFLOWER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sunflower"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LILAC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lilac"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ROSE_BUSH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rose_bush"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PEONY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "peony"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TALL_GRASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tall_grass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LARGE_FERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "large_fern"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WHITE_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ORANGE_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MAGENTA_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_BLUE_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> YELLOW_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIME_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PINK_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GRAY_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_GRAY_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CYAN_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PURPLE_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLUE_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BROWN_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GREEN_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLACK_STAINED_GLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_stained_glass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WHITE_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ORANGE_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MAGENTA_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_BLUE_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> YELLOW_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIME_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PINK_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GRAY_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_GRAY_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CYAN_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PURPLE_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLUE_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BROWN_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GREEN_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLACK_STAINED_GLASS_PANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_stained_glass_pane"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PRISMARINE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PRISMARINE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DARK_PRISMARINE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_prismarine"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PRISMARINE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PRISMARINE_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DARK_PRISMARINE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_prismarine_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SEA_LANTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sea_lantern"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHISELED_RED_SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_red_sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CUT_RED_SANDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cut_red_sandstone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_SANDSTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_sandstone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> REPEATING_COMMAND_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "repeating_command_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHAIN_COMMAND_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chain_command_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MAGMA_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magma_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHER_WART_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wart_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WARPED_WART_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_wart_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_NETHER_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_nether_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BONE_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bone_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRUCTURE_VOID  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "structure_void"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WHITE_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ORANGE_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MAGENTA_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_BLUE_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> YELLOW_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIME_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PINK_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GRAY_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_GRAY_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CYAN_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PURPLE_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLUE_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BROWN_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GREEN_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLACK_SHULKER_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_shulker_box"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WHITE_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ORANGE_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MAGENTA_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_BLUE_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> YELLOW_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIME_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PINK_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GRAY_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_GRAY_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CYAN_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PURPLE_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLUE_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BROWN_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GREEN_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLACK_GLAZED_TERRACOTTA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_glazed_terracotta"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WHITE_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ORANGE_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MAGENTA_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_BLUE_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> YELLOW_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIME_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PINK_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GRAY_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_GRAY_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CYAN_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PURPLE_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLUE_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BROWN_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GREEN_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLACK_CONCRETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_concrete"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WHITE_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ORANGE_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MAGENTA_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_BLUE_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> YELLOW_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIME_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PINK_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GRAY_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_GRAY_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CYAN_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PURPLE_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLUE_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BROWN_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GREEN_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLACK_CONCRETE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_concrete_powder"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TURTLE_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "turtle_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SNIFFER_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sniffer_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEAD_TUBE_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_tube_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEAD_BRAIN_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_brain_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEAD_BUBBLE_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_bubble_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEAD_FIRE_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_fire_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEAD_HORN_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_horn_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TUBE_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tube_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BRAIN_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brain_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BUBBLE_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bubble_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FIRE_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fire_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> HORN_CORAL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horn_coral_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TUBE_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tube_coral"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BRAIN_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brain_coral"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BUBBLE_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bubble_coral"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FIRE_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fire_coral"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> HORN_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horn_coral"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEAD_BRAIN_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_brain_coral"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEAD_BUBBLE_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_bubble_coral"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEAD_FIRE_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_fire_coral"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEAD_HORN_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_horn_coral"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEAD_TUBE_CORAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_tube_coral"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TUBE_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tube_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BRAIN_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brain_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BUBBLE_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bubble_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FIRE_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fire_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> HORN_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horn_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEAD_TUBE_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_tube_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEAD_BRAIN_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_brain_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEAD_BUBBLE_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_bubble_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEAD_FIRE_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_fire_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEAD_HORN_CORAL_FAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dead_horn_coral_fan"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLUE_ICE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_ice"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CONDUIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "conduit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_GRANITE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_granite_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SMOOTH_RED_SANDSTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_red_sandstone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MOSSY_STONE_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_stone_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_DIORITE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_diorite_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MOSSY_COBBLESTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_cobblestone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> END_STONE_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_stone_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SMOOTH_SANDSTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_sandstone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SMOOTH_QUARTZ_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_quartz_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GRANITE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "granite_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ANDESITE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "andesite_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_NETHER_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_nether_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_ANDESITE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_andesite_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DIORITE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diorite_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COBBLED_DEEPSLATE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobbled_deepslate_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_DEEPSLATE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_deepslate_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEEPSLATE_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEEPSLATE_TILE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_tile_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_GRANITE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_granite_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SMOOTH_RED_SANDSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_red_sandstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MOSSY_STONE_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_stone_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_DIORITE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_diorite_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MOSSY_COBBLESTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mossy_cobblestone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> END_STONE_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_stone_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SMOOTH_SANDSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_sandstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SMOOTH_QUARTZ_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smooth_quartz_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GRANITE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "granite_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ANDESITE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "andesite_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_NETHER_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_nether_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_ANDESITE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_andesite_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DIORITE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diorite_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COBBLED_DEEPSLATE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobbled_deepslate_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_DEEPSLATE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_deepslate_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEEPSLATE_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEEPSLATE_TILE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_tile_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SCAFFOLDING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "scaffolding"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> REDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "redstone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> REDSTONE_TORCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "redstone_torch"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> REDSTONE_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "redstone_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> REPEATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "repeater"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COMPARATOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "comparator"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PISTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piston"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STICKY_PISTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sticky_piston"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SLIME_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slime_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> HONEY_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "honey_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OBSERVER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "observer"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> HOPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hopper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DISPENSER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dispenser"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DROPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dropper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LECTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lectern"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TARGET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "target"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LEVER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lever"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHTNING_ROD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lightning_rod"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DAYLIGHT_DETECTOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "daylight_detector"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SCULK_SENSOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_sensor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CALIBRATED_SCULK_SENSOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "calibrated_sculk_sensor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TRIPWIRE_HOOK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tripwire_hook"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TRAPPED_CHEST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trapped_chest"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TNT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tnt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> REDSTONE_LAMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "redstone_lamp"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NOTE_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "note_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STONE_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_button"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_BLACKSTONE_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_button"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OAK_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_button"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPRUCE_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_button"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BIRCH_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_button"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> JUNGLE_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_button"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ACACIA_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_button"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHERRY_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_button"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DARK_OAK_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_button"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MANGROVE_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_button"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BAMBOO_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_button"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRIMSON_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_button"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WARPED_BUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_button"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STONE_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_BLACKSTONE_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_WEIGHTED_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_weighted_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> HEAVY_WEIGHTED_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "heavy_weighted_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OAK_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPRUCE_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BIRCH_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> JUNGLE_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ACACIA_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHERRY_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DARK_OAK_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MANGROVE_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BAMBOO_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRIMSON_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WARPED_PRESSURE_PLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_pressure_plate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> IRON_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_door"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OAK_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_door"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPRUCE_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_door"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BIRCH_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_door"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> JUNGLE_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_door"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ACACIA_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_door"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHERRY_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_door"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DARK_OAK_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_door"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MANGROVE_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_door"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BAMBOO_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_door"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRIMSON_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_door"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WARPED_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_door"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> EXPOSED_COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WEATHERED_COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OXIDIZED_COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_EXPOSED_COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_WEATHERED_COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_OXIDIZED_COPPER_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_copper_door"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> IRON_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OAK_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPRUCE_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BIRCH_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> JUNGLE_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ACACIA_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHERRY_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DARK_OAK_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MANGROVE_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BAMBOO_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRIMSON_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WARPED_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> EXPOSED_COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WEATHERED_COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OXIDIZED_COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_EXPOSED_COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_WEATHERED_COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_OXIDIZED_COPPER_TRAPDOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_copper_trapdoor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OAK_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPRUCE_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BIRCH_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> JUNGLE_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ACACIA_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHERRY_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DARK_OAK_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MANGROVE_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BAMBOO_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRIMSON_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WARPED_FENCE_GATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_fence_gate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POWERED_RAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "powered_rail"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DETECTOR_RAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "detector_rail"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rail"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ACTIVATOR_RAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "activator_rail"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SADDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "saddle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MINECART  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "minecart"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHEST_MINECART  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chest_minecart"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FURNACE_MINECART  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "furnace_minecart"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TNT_MINECART  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tnt_minecart"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> HOPPER_MINECART  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hopper_minecart"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CARROT_ON_A_STICK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "carrot_on_a_stick"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WARPED_FUNGUS_ON_A_STICK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_fungus_on_a_stick"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ELYTRA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "elytra"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OAK_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_boat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OAK_CHEST_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_chest_boat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPRUCE_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_boat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPRUCE_CHEST_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_chest_boat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BIRCH_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_boat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BIRCH_CHEST_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_chest_boat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> JUNGLE_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_boat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> JUNGLE_CHEST_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_chest_boat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ACACIA_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_boat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ACACIA_CHEST_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_chest_boat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHERRY_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_boat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHERRY_CHEST_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_chest_boat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DARK_OAK_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_boat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DARK_OAK_CHEST_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_chest_boat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MANGROVE_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_boat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MANGROVE_CHEST_BOAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_chest_boat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BAMBOO_RAFT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_raft"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BAMBOO_CHEST_RAFT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_chest_raft"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRUCTURE_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "structure_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> JIGSAW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jigsaw"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TURTLE_HELMET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "turtle_helmet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TURTLE_SCUTE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "turtle_scute"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ARMADILLO_SCUTE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armadillo_scute"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WOLF_ARMOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wolf_armor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FLINT_AND_STEEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flint_and_steel"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BOWL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bowl"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> APPLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "apple"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BOW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bow"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ARROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "arrow"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "coal"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHARCOAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "charcoal"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DIAMOND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> EMERALD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "emerald"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LAPIS_LAZULI  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lapis_lazuli"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> QUARTZ  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "quartz"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> AMETHYST_SHARD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "amethyst_shard"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RAW_IRON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "raw_iron"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> IRON_INGOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_ingot"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RAW_COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "raw_copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COPPER_INGOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_ingot"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RAW_GOLD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "raw_gold"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GOLD_INGOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gold_ingot"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHERITE_INGOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_ingot"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHERITE_SCRAP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_scrap"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WOODEN_SWORD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wooden_sword"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WOODEN_SHOVEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wooden_shovel"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WOODEN_PICKAXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wooden_pickaxe"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WOODEN_AXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wooden_axe"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WOODEN_HOE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wooden_hoe"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STONE_SWORD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_sword"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STONE_SHOVEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_shovel"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STONE_PICKAXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_pickaxe"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STONE_AXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_axe"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STONE_HOE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_hoe"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GOLDEN_SWORD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_sword"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GOLDEN_SHOVEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_shovel"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GOLDEN_PICKAXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_pickaxe"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GOLDEN_AXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_axe"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GOLDEN_HOE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_hoe"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> IRON_SWORD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_sword"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> IRON_SHOVEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_shovel"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> IRON_PICKAXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_pickaxe"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> IRON_AXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_axe"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> IRON_HOE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_hoe"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DIAMOND_SWORD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_sword"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DIAMOND_SHOVEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_shovel"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DIAMOND_PICKAXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_pickaxe"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DIAMOND_AXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_axe"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DIAMOND_HOE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_hoe"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHERITE_SWORD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_sword"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHERITE_SHOVEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_shovel"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHERITE_PICKAXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_pickaxe"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHERITE_AXE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_axe"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHERITE_HOE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_hoe"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STICK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stick"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUSHROOM_STEW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mushroom_stew"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "string"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FEATHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "feather"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GUNPOWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gunpowder"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WHEAT_SEEDS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wheat_seeds"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WHEAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wheat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BREAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bread"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LEATHER_HELMET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "leather_helmet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LEATHER_CHESTPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "leather_chestplate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LEATHER_LEGGINGS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "leather_leggings"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LEATHER_BOOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "leather_boots"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHAINMAIL_HELMET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chainmail_helmet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHAINMAIL_CHESTPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chainmail_chestplate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHAINMAIL_LEGGINGS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chainmail_leggings"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHAINMAIL_BOOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chainmail_boots"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> IRON_HELMET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_helmet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> IRON_CHESTPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_chestplate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> IRON_LEGGINGS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_leggings"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> IRON_BOOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_boots"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DIAMOND_HELMET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_helmet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DIAMOND_CHESTPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_chestplate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DIAMOND_LEGGINGS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_leggings"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DIAMOND_BOOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_boots"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GOLDEN_HELMET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_helmet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GOLDEN_CHESTPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_chestplate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GOLDEN_LEGGINGS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_leggings"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GOLDEN_BOOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_boots"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHERITE_HELMET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_helmet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHERITE_CHESTPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_chestplate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHERITE_LEGGINGS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_leggings"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHERITE_BOOTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_boots"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FLINT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flint"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PORKCHOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "porkchop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COOKED_PORKCHOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cooked_porkchop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PAINTING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "painting"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GOLDEN_APPLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_apple"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ENCHANTED_GOLDEN_APPLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "enchanted_golden_apple"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OAK_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_sign"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPRUCE_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_sign"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BIRCH_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_sign"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> JUNGLE_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_sign"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ACACIA_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_sign"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHERRY_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_sign"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DARK_OAK_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_sign"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MANGROVE_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_sign"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BAMBOO_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_sign"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRIMSON_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_sign"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WARPED_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_sign"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OAK_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oak_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPRUCE_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spruce_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BIRCH_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "birch_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> JUNGLE_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jungle_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ACACIA_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "acacia_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHERRY_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DARK_OAK_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dark_oak_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MANGROVE_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BAMBOO_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRIMSON_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crimson_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WARPED_HANGING_SIGN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warped_hanging_sign"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BUCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bucket"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WATER_BUCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "water_bucket"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LAVA_BUCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lava_bucket"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POWDER_SNOW_BUCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "powder_snow_bucket"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SNOWBALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snowball"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LEATHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "leather"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MILK_BUCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "milk_bucket"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PUFFERFISH_BUCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pufferfish_bucket"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SALMON_BUCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "salmon_bucket"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COD_BUCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cod_bucket"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TROPICAL_FISH_BUCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tropical_fish_bucket"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> AXOLOTL_BUCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "axolotl_bucket"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TADPOLE_BUCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tadpole_bucket"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BRICK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brick"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CLAY_BALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "clay_ball"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DRIED_KELP_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dried_kelp_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PAPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "paper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BOOK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "book"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SLIME_BALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slime_ball"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COMPASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "compass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RECOVERY_COMPASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "recovery_compass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BUNDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bundle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FISHING_ROD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fishing_rod"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "clock"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPYGLASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spyglass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GLOWSTONE_DUST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glowstone_dust"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cod"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SALMON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "salmon"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TROPICAL_FISH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tropical_fish"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PUFFERFISH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pufferfish"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COOKED_COD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cooked_cod"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COOKED_SALMON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cooked_salmon"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> INK_SAC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ink_sac"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GLOW_INK_SAC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glow_ink_sac"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COCOA_BEANS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cocoa_beans"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WHITE_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_dye"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ORANGE_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_dye"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MAGENTA_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_dye"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_BLUE_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_dye"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> YELLOW_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_dye"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIME_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_dye"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PINK_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_dye"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GRAY_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_dye"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_GRAY_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_dye"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CYAN_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_dye"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PURPLE_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_dye"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLUE_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_dye"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BROWN_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_dye"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GREEN_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_dye"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_dye"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLACK_DYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_dye"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BONE_MEAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bone_meal"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SUGAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sugar"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CAKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cake"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WHITE_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_bed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ORANGE_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_bed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MAGENTA_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_bed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_BLUE_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_bed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> YELLOW_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_bed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIME_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_bed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PINK_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_bed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GRAY_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_bed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_GRAY_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_bed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CYAN_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_bed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PURPLE_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_bed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLUE_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_bed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BROWN_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_bed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GREEN_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_bed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_bed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLACK_BED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_bed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COOKIE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cookie"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRAFTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crafter"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FILLED_MAP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "filled_map"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SHEARS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shears"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MELON_SLICE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "melon_slice"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DRIED_KELP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dried_kelp"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PUMPKIN_SEEDS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pumpkin_seeds"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MELON_SEEDS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "melon_seeds"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BEEF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beef"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COOKED_BEEF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cooked_beef"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHICKEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chicken"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COOKED_CHICKEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cooked_chicken"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ROTTEN_FLESH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rotten_flesh"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ENDER_PEARL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ender_pearl"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLAZE_ROD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blaze_rod"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GHAST_TEAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ghast_tear"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GOLD_NUGGET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gold_nugget"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHER_WART  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wart"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POTION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potion"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GLASS_BOTTLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glass_bottle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPIDER_EYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spider_eye"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FERMENTED_SPIDER_EYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fermented_spider_eye"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLAZE_POWDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blaze_powder"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MAGMA_CREAM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magma_cream"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BREWING_STAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brewing_stand"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CAULDRON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cauldron"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ENDER_EYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ender_eye"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GLISTERING_MELON_SLICE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glistering_melon_slice"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ARMADILLO_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armadillo_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ALLAY_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "allay_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> AXOLOTL_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "axolotl_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BAT_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bat_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BEE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bee_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLAZE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blaze_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BOGGED_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bogged_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BREEZE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "breeze_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CAT_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cat_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CAMEL_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "camel_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CAVE_SPIDER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cave_spider_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHICKEN_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chicken_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COD_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cod_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COW_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cow_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CREEPER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "creeper_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DOLPHIN_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dolphin_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DONKEY_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "donkey_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DROWNED_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "drowned_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ELDER_GUARDIAN_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "elder_guardian_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ENDER_DRAGON_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ender_dragon_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ENDERMAN_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "enderman_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ENDERMITE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "endermite_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> EVOKER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "evoker_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FOX_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fox_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FROG_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "frog_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GHAST_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ghast_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GLOW_SQUID_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glow_squid_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GOAT_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GUARDIAN_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "guardian_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> HOGLIN_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hoglin_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> HORSE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horse_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> HUSK_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "husk_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> IRON_GOLEM_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_golem_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LLAMA_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "llama_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MAGMA_CUBE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magma_cube_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MOOSHROOM_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mooshroom_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MULE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mule_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OCELOT_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ocelot_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PANDA_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "panda_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PARROT_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PHANTOM_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "phantom_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PIG_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pig_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PIGLIN_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PIGLIN_BRUTE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_brute_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PILLAGER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pillager_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLAR_BEAR_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polar_bear_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PUFFERFISH_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pufferfish_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RABBIT_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rabbit_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RAVAGER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ravager_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SALMON_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "salmon_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SHEEP_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sheep_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SHULKER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shulker_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SILVERFISH_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "silverfish_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SKELETON_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skeleton_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SKELETON_HORSE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skeleton_horse_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SLIME_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slime_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SNIFFER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sniffer_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SNOW_GOLEM_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snow_golem_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPIDER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spider_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SQUID_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "squid_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRAY_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stray_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STRIDER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "strider_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TADPOLE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tadpole_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TRADER_LLAMA_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trader_llama_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TROPICAL_FISH_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tropical_fish_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TURTLE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "turtle_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> VEX_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vex_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> VILLAGER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "villager_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> VINDICATOR_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vindicator_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WANDERING_TRADER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wandering_trader_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WARDEN_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warden_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WITCH_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "witch_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WITHER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WITHER_SKELETON_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither_skeleton_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WOLF_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wolf_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ZOGLIN_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zoglin_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ZOMBIE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ZOMBIE_HORSE_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_horse_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ZOMBIE_VILLAGER_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_villager_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ZOMBIFIED_PIGLIN_SPAWN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombified_piglin_spawn_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> EXPERIENCE_BOTTLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "experience_bottle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FIRE_CHARGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fire_charge"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WIND_CHARGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wind_charge"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WRITABLE_BOOK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "writable_book"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WRITTEN_BOOK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "written_book"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mace"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ITEM_FRAME  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item_frame"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GLOW_ITEM_FRAME  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glow_item_frame"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FLOWER_POT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flower_pot"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CARROT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "carrot"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POTATO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potato"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BAKED_POTATO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "baked_potato"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POISONOUS_POTATO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "poisonous_potato"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MAP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "map"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GOLDEN_CARROT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_carrot"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SKELETON_SKULL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skeleton_skull"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WITHER_SKELETON_SKULL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither_skeleton_skull"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PLAYER_HEAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_head"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ZOMBIE_HEAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_head"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CREEPER_HEAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "creeper_head"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DRAGON_HEAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dragon_head"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PIGLIN_HEAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_head"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHER_STAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_star"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PUMPKIN_PIE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pumpkin_pie"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FIREWORK_ROCKET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "firework_rocket"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FIREWORK_STAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "firework_star"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ENCHANTED_BOOK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "enchanted_book"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHER_BRICK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_brick"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PRISMARINE_SHARD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine_shard"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PRISMARINE_CRYSTALS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prismarine_crystals"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RABBIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rabbit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COOKED_RABBIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cooked_rabbit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RABBIT_STEW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rabbit_stew"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RABBIT_FOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rabbit_foot"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RABBIT_HIDE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rabbit_hide"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ARMOR_STAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armor_stand"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> IRON_HORSE_ARMOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_horse_armor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GOLDEN_HORSE_ARMOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golden_horse_armor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DIAMOND_HORSE_ARMOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond_horse_armor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LEATHER_HORSE_ARMOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "leather_horse_armor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LEAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lead"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NAME_TAG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "name_tag"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COMMAND_BLOCK_MINECART  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "command_block_minecart"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mutton"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COOKED_MUTTON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cooked_mutton"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WHITE_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_banner"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ORANGE_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_banner"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MAGENTA_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_banner"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_BLUE_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_banner"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> YELLOW_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_banner"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIME_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_banner"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PINK_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_banner"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GRAY_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_banner"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_GRAY_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_banner"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CYAN_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_banner"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PURPLE_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_banner"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLUE_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_banner"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BROWN_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_banner"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GREEN_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_banner"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_banner"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLACK_BANNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_banner"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> END_CRYSTAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_crystal"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHORUS_FRUIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chorus_fruit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POPPED_CHORUS_FRUIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "popped_chorus_fruit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TORCHFLOWER_SEEDS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "torchflower_seeds"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PITCHER_POD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pitcher_pod"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BEETROOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beetroot"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BEETROOT_SEEDS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beetroot_seeds"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BEETROOT_SOUP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beetroot_soup"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DRAGON_BREATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dragon_breath"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPLASH_POTION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "splash_potion"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPECTRAL_ARROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spectral_arrow"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TIPPED_ARROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tipped_arrow"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LINGERING_POTION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lingering_potion"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SHIELD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shield"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TOTEM_OF_UNDYING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "totem_of_undying"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SHULKER_SHELL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shulker_shell"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> IRON_NUGGET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_nugget"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> KNOWLEDGE_BOOK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "knowledge_book"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DEBUG_STICK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "debug_stick"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUSIC_DISC_13  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_13"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUSIC_DISC_CAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_cat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUSIC_DISC_BLOCKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_blocks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUSIC_DISC_CHIRP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_chirp"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUSIC_DISC_CREATOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_creator"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUSIC_DISC_CREATOR_MUSIC_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_creator_music_box"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUSIC_DISC_FAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_far"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUSIC_DISC_MALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_mall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUSIC_DISC_MELLOHI  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_mellohi"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUSIC_DISC_STAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_stal"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUSIC_DISC_STRAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_strad"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUSIC_DISC_WARD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_ward"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUSIC_DISC_11  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_11"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUSIC_DISC_WAIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_wait"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUSIC_DISC_OTHERSIDE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_otherside"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUSIC_DISC_RELIC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_relic"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUSIC_DISC_5  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_5"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUSIC_DISC_PIGSTEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_pigstep"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MUSIC_DISC_PRECIPICE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc_precipice"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DISC_FRAGMENT_5  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "disc_fragment_5"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TRIDENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trident"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PHANTOM_MEMBRANE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "phantom_membrane"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NAUTILUS_SHELL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nautilus_shell"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> HEART_OF_THE_SEA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "heart_of_the_sea"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CROSSBOW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crossbow"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SUSPICIOUS_STEW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "suspicious_stew"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LOOM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "loom"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FLOWER_BANNER_PATTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flower_banner_pattern"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CREEPER_BANNER_PATTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "creeper_banner_pattern"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SKULL_BANNER_PATTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skull_banner_pattern"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MOJANG_BANNER_PATTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mojang_banner_pattern"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GLOBE_BANNER_PATTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "globe_banner_pattern"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PIGLIN_BANNER_PATTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_banner_pattern"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FLOW_BANNER_PATTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flow_banner_pattern"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GUSTER_BANNER_PATTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "guster_banner_pattern"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GOAT_HORN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_horn"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COMPOSTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "composter"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BARREL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "barrel"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SMOKER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smoker"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLAST_FURNACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blast_furnace"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CARTOGRAPHY_TABLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cartography_table"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FLETCHING_TABLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fletching_table"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GRINDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "grindstone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SMITHING_TABLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smithing_table"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> STONECUTTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stonecutter"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BELL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bell"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LANTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lantern"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SOUL_LANTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_lantern"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SWEET_BERRIES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sweet_berries"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GLOW_BERRIES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glow_berries"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CAMPFIRE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "campfire"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SOUL_CAMPFIRE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_campfire"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SHROOMLIGHT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shroomlight"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> HONEYCOMB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "honeycomb"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BEE_NEST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bee_nest"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BEEHIVE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beehive"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> HONEY_BOTTLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "honey_bottle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> HONEYCOMB_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "honeycomb_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LODESTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lodestone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRYING_OBSIDIAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crying_obsidian"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLACKSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blackstone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLACKSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blackstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLACKSTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blackstone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GILDED_BLACKSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gilded_blackstone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_BLACKSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_BLACKSTONE_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_BLACKSTONE_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CHISELED_POLISHED_BLACKSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_polished_blackstone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_BLACKSTONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_BLACKSTONE_BRICK_SLAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_brick_slab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POLISHED_BLACKSTONE_BRICK_STAIRS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_blackstone_brick_stairs"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CRACKED_POLISHED_BLACKSTONE_BRICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cracked_polished_blackstone_bricks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RESPAWN_ANCHOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "respawn_anchor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "candle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WHITE_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "white_candle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ORANGE_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orange_candle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MAGENTA_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magenta_candle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_BLUE_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_blue_candle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> YELLOW_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "yellow_candle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIME_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lime_candle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PINK_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_candle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GRAY_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gray_candle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LIGHT_GRAY_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "light_gray_candle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> CYAN_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cyan_candle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PURPLE_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "purple_candle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLUE_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blue_candle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BROWN_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brown_candle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GREEN_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "green_candle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RED_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "red_candle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLACK_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "black_candle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SMALL_AMETHYST_BUD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "small_amethyst_bud"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MEDIUM_AMETHYST_BUD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "medium_amethyst_bud"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> LARGE_AMETHYST_BUD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "large_amethyst_bud"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> AMETHYST_CLUSTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "amethyst_cluster"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> POINTED_DRIPSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pointed_dripstone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OCHRE_FROGLIGHT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ochre_froglight"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> VERDANT_FROGLIGHT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "verdant_froglight"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PEARLESCENT_FROGLIGHT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pearlescent_froglight"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FROGSPAWN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "frogspawn"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ECHO_SHARD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "echo_shard"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BRUSH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brush"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> NETHERITE_UPGRADE_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_upgrade_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SENTRY_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sentry_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DUNE_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dune_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COAST_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "coast_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WILD_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wild_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WARD_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ward_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> EYE_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "eye_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> VEX_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vex_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TIDE_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tide_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SNOUT_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snout_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RIB_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rib_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SPIRE_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spire_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAYFINDER_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wayfinder_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SHAPER_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shaper_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SILENCE_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "silence_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> RAISER_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "raiser_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> HOST_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "host_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FLOW_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flow_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BOLT_ARMOR_TRIM_SMITHING_TEMPLATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bolt_armor_trim_smithing_template"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ANGLER_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "angler_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ARCHER_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "archer_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> ARMS_UP_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "arms_up_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BLADE_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blade_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BREWER_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brewer_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BURN_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "burn_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> DANGER_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "danger_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> EXPLORER_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "explorer_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FLOW_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flow_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> FRIEND_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "friend_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> GUSTER_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "guster_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> HEART_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "heart_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> HEARTBREAK_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "heartbreak_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> HOWL_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "howl_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MINER_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "miner_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> MOURNER_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mourner_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PLENTY_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "plenty_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> PRIZE_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prize_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SCRAPE_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "scrape_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SHEAF_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sheaf_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SHELTER_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shelter_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SKULL_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skull_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> SNORT_POTTERY_SHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snort_pottery_sherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> EXPOSED_COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WEATHERED_COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OXIDIZED_COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_EXPOSED_COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_WEATHERED_COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_OXIDIZED_COPPER_GRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_copper_grate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> EXPOSED_COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "exposed_copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WEATHERED_COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weathered_copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OXIDIZED_COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oxidized_copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_EXPOSED_COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_exposed_copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_WEATHERED_COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_weathered_copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> WAXED_OXIDIZED_COPPER_BULB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_oxidized_copper_bulb"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TRIAL_SPAWNER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trial_spawner"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> TRIAL_KEY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trial_key"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OMINOUS_TRIAL_KEY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ominous_trial_key"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> VAULT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vault"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> OMINOUS_BOTTLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ominous_bottle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCItemType> BREEZE_ROD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "breeze_rod"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

}
