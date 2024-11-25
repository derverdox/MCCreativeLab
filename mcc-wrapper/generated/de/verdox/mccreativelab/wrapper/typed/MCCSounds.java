package de.verdox.mccreativelab.wrapper.typed;

import net.kyori.adventure.sound.Sound;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCRegistry;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import com.google.common.reflect.TypeToken;
import net.kyori.adventure.key.Key;

public class MCCSounds  {

	public static final Key VANILLA_REGISTRY_KEY  = Key.key("minecraft", "sound_event");

	public static final MCCTypedKey<MCCRegistry<Sound>> VANILLA_REGISTRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "root"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});;

	public static final MCCTypedKey<Sound> ALLAY_AMBIENT_WITH_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "allay_ambient_with_item"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ALLAY_AMBIENT_WITHOUT_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "allay_ambient_without_item"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ALLAY_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "allay_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ALLAY_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "allay_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ALLAY_ITEM_GIVEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "allay_item_given"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ALLAY_ITEM_TAKEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "allay_item_taken"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ALLAY_THROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "allay_throw"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMBIENT_CAVE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.cave"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMBIENT_BASALT_DELTAS_ADDITIONS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.basalt_deltas.additions"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMBIENT_BASALT_DELTAS_LOOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.basalt_deltas.loop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMBIENT_BASALT_DELTAS_MOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.basalt_deltas.mood"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMBIENT_CRIMSON_FOREST_ADDITIONS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.crimson_forest.additions"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMBIENT_CRIMSON_FOREST_LOOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.crimson_forest.loop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMBIENT_CRIMSON_FOREST_MOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.crimson_forest.mood"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMBIENT_NETHER_WASTES_ADDITIONS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.nether_wastes.additions"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMBIENT_NETHER_WASTES_LOOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.nether_wastes.loop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMBIENT_NETHER_WASTES_MOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.nether_wastes.mood"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMBIENT_SOUL_SAND_VALLEY_ADDITIONS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.soul_sand_valley.additions"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMBIENT_SOUL_SAND_VALLEY_LOOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.soul_sand_valley.loop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMBIENT_SOUL_SAND_VALLEY_MOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.soul_sand_valley.mood"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMBIENT_WARPED_FOREST_ADDITIONS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.warped_forest.additions"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMBIENT_WARPED_FOREST_LOOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.warped_forest.loop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMBIENT_WARPED_FOREST_MOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.warped_forest.mood"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMBIENT_UNDERWATER_ENTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient_underwater_enter"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMBIENT_UNDERWATER_EXIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient_underwater_exit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMBIENT_UNDERWATER_LOOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient_underwater_loop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMBIENT_UNDERWATER_LOOP_ADDITIONS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient_underwater_loop_additions"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMBIENT_UNDERWATER_LOOP_ADDITIONS_RARE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient_underwater_loop_additions_rare"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMBIENT_UNDERWATER_LOOP_ADDITIONS_ULTRA_RARE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient_underwater_loop_additions_ultra_rare"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMETHYST_BLOCK_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "amethyst_block_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMETHYST_BLOCK_CHIME  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "amethyst_block_chime"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMETHYST_BLOCK_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "amethyst_block_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMETHYST_BLOCK_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "amethyst_block_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMETHYST_BLOCK_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "amethyst_block_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMETHYST_BLOCK_RESONATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "amethyst_block_resonate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMETHYST_BLOCK_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "amethyst_block_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMETHYST_CLUSTER_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "amethyst_cluster_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMETHYST_CLUSTER_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "amethyst_cluster_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMETHYST_CLUSTER_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "amethyst_cluster_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMETHYST_CLUSTER_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "amethyst_cluster_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AMETHYST_CLUSTER_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "amethyst_cluster_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ANCIENT_DEBRIS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ancient_debris_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ANCIENT_DEBRIS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ancient_debris_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ANCIENT_DEBRIS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ancient_debris_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ANCIENT_DEBRIS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ancient_debris_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ANCIENT_DEBRIS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ancient_debris_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ANVIL_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "anvil_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ANVIL_DESTROY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "anvil_destroy"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ANVIL_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "anvil_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ANVIL_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "anvil_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ANVIL_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "anvil_land"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ANVIL_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "anvil_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ANVIL_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "anvil_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ANVIL_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "anvil_use"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMADILLO_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armadillo_eat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMADILLO_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armadillo_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMADILLO_HURT_REDUCED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armadillo_hurt_reduced"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMADILLO_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armadillo_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMADILLO_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armadillo_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMADILLO_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armadillo_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMADILLO_ROLL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armadillo_roll"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMADILLO_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armadillo_land"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMADILLO_SCUTE_DROP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armadillo_scute_drop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMADILLO_UNROLL_FINISH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armadillo_unroll_finish"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMADILLO_PEEK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armadillo_peek"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMADILLO_UNROLL_START  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armadillo_unroll_start"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMADILLO_BRUSH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armadillo_brush"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMOR_EQUIP_CHAIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.armor.equip_chain"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMOR_EQUIP_DIAMOND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.armor.equip_diamond"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMOR_EQUIP_ELYTRA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.armor.equip_elytra"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMOR_EQUIP_GENERIC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.armor.equip_generic"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMOR_EQUIP_GOLD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.armor.equip_gold"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMOR_EQUIP_IRON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.armor.equip_iron"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMOR_EQUIP_LEATHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.armor.equip_leather"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMOR_EQUIP_NETHERITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.armor.equip_netherite"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMOR_EQUIP_TURTLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.armor.equip_turtle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMOR_EQUIP_WOLF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.armor.equip_wolf"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMOR_UNEQUIP_WOLF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armor_unequip_wolf"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMOR_STAND_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armor_stand_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMOR_STAND_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armor_stand_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMOR_STAND_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armor_stand_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARMOR_STAND_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armor_stand_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARROW_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "arrow_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARROW_HIT_PLAYER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "arrow_hit_player"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ARROW_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "arrow_shoot"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AXE_STRIP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "axe_strip"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AXE_SCRAPE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "axe_scrape"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AXE_WAX_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "axe_wax_off"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AXOLOTL_ATTACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "axolotl_attack"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AXOLOTL_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "axolotl_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AXOLOTL_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "axolotl_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AXOLOTL_IDLE_AIR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "axolotl_idle_air"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AXOLOTL_IDLE_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "axolotl_idle_water"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AXOLOTL_SPLASH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "axolotl_splash"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AXOLOTL_SWIM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "axolotl_swim"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AZALEA_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "azalea_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AZALEA_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "azalea_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AZALEA_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "azalea_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AZALEA_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "azalea_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AZALEA_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "azalea_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AZALEA_LEAVES_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "azalea_leaves_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AZALEA_LEAVES_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "azalea_leaves_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AZALEA_LEAVES_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "azalea_leaves_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AZALEA_LEAVES_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "azalea_leaves_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> AZALEA_LEAVES_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "azalea_leaves_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_SAPLING_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_sapling_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_SAPLING_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_sapling_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_SAPLING_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_sapling_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_WOOD_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_wood_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_WOOD_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_wood_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_WOOD_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_wood_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_WOOD_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_wood_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_WOOD_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_wood_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_WOOD_DOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_wood_door_close"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_WOOD_DOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_wood_door_open"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_WOOD_TRAPDOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_wood_trapdoor_close"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_WOOD_TRAPDOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_wood_trapdoor_open"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_WOOD_BUTTON_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_wood_button_click_off"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_WOOD_BUTTON_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_wood_button_click_on"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_WOOD_PRESSURE_PLATE_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_wood_pressure_plate_click_off"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_WOOD_PRESSURE_PLATE_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_wood_pressure_plate_click_on"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_WOOD_FENCE_GATE_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_wood_fence_gate_close"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_WOOD_FENCE_GATE_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_wood_fence_gate_open"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BARREL_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "barrel_close"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BARREL_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "barrel_open"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BASALT_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "basalt_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BASALT_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "basalt_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BASALT_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "basalt_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BASALT_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "basalt_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BASALT_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "basalt_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAT_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bat_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAT_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bat_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAT_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bat_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAT_LOOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bat_loop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAT_TAKEOFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bat_takeoff"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BEACON_ACTIVATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beacon_activate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BEACON_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beacon_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BEACON_DEACTIVATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beacon_deactivate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BEACON_POWER_SELECT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beacon_power_select"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BEE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bee_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BEE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bee_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BEE_LOOP_AGGRESSIVE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bee_loop_aggressive"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BEE_LOOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bee_loop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BEE_STING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bee_sting"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BEE_POLLINATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bee_pollinate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BEEHIVE_DRIP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beehive_drip"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BEEHIVE_ENTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beehive_enter"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BEEHIVE_EXIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beehive_exit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BEEHIVE_SHEAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beehive_shear"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BEEHIVE_WORK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "beehive_work"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BELL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bell_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BELL_RESONATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bell_resonate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BIG_DRIPLEAF_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "big_dripleaf_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BIG_DRIPLEAF_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "big_dripleaf_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BIG_DRIPLEAF_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "big_dripleaf_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BIG_DRIPLEAF_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "big_dripleaf_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BIG_DRIPLEAF_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "big_dripleaf_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BLAZE_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blaze_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BLAZE_BURN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blaze_burn"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BLAZE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blaze_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BLAZE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blaze_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BLAZE_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blaze_shoot"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BOAT_PADDLE_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "boat_paddle_land"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BOAT_PADDLE_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "boat_paddle_water"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BOGGED_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bogged_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BOGGED_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bogged_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BOGGED_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bogged_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BOGGED_SHEAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bogged_shear"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BOGGED_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bogged_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BONE_BLOCK_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bone_block_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BONE_BLOCK_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bone_block_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BONE_BLOCK_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bone_block_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BONE_BLOCK_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bone_block_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BONE_BLOCK_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bone_block_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BONE_MEAL_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bone_meal_use"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BOOK_PAGE_TURN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "book_page_turn"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BOOK_PUT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "book_put"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BLASTFURNACE_FIRE_CRACKLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blastfurnace_fire_crackle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BOTTLE_EMPTY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bottle_empty"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BOTTLE_FILL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bottle_fill"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BOTTLE_FILL_DRAGONBREATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bottle_fill_dragonbreath"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BREEZE_CHARGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "breeze_charge"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BREEZE_DEFLECT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "breeze_deflect"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BREEZE_INHALE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "breeze_inhale"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BREEZE_IDLE_GROUND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "breeze_idle_ground"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BREEZE_IDLE_AIR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "breeze_idle_air"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BREEZE_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "breeze_shoot"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BREEZE_JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "breeze_jump"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BREEZE_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "breeze_land"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BREEZE_SLIDE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "breeze_slide"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BREEZE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "breeze_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BREEZE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "breeze_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BREEZE_WHIRL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "breeze_whirl"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BREEZE_WIND_CHARGE_BURST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.breeze.wind_burst"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BREWING_STAND_BREW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brewing_stand_brew"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BRUSH_GENERIC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brush_generic"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BRUSH_SAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brush_sand"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BRUSH_GRAVEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brush_gravel"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BRUSH_SAND_COMPLETED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brush_sand_completed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BRUSH_GRAVEL_COMPLETED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "brush_gravel_completed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BUBBLE_COLUMN_BUBBLE_POP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bubble_column_bubble_pop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BUBBLE_COLUMN_UPWARDS_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bubble_column_upwards_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BUBBLE_COLUMN_UPWARDS_INSIDE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bubble_column_upwards_inside"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BUBBLE_COLUMN_WHIRLPOOL_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bubble_column_whirlpool_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BUBBLE_COLUMN_WHIRLPOOL_INSIDE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bubble_column_whirlpool_inside"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BUCKET_EMPTY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bucket_empty"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BUCKET_EMPTY_AXOLOTL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bucket_empty_axolotl"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BUCKET_EMPTY_FISH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bucket_empty_fish"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BUCKET_EMPTY_LAVA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bucket_empty_lava"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BUCKET_EMPTY_POWDER_SNOW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bucket_empty_powder_snow"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BUCKET_EMPTY_TADPOLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bucket_empty_tadpole"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BUCKET_FILL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bucket_fill"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BUCKET_FILL_AXOLOTL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bucket_fill_axolotl"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BUCKET_FILL_FISH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bucket_fill_fish"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BUCKET_FILL_LAVA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bucket_fill_lava"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BUCKET_FILL_POWDER_SNOW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bucket_fill_powder_snow"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BUCKET_FILL_TADPOLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bucket_fill_tadpole"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BUNDLE_DROP_CONTENTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bundle_drop_contents"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BUNDLE_INSERT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bundle_insert"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BUNDLE_REMOVE_ONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bundle_remove_one"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAKE_ADD_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cake_add_candle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CALCITE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "calcite_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CALCITE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "calcite_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CALCITE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "calcite_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CALCITE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "calcite_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CALCITE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "calcite_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAMEL_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "camel_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAMEL_DASH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "camel_dash"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAMEL_DASH_READY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "camel_dash_ready"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAMEL_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "camel_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAMEL_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "camel_eat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAMEL_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "camel_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAMEL_SADDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "camel_saddle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAMEL_SIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "camel_sit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAMEL_STAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "camel_stand"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAMEL_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "camel_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAMEL_STEP_SAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "camel_step_sand"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAMPFIRE_CRACKLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "campfire_crackle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CANDLE_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "candle_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CANDLE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "candle_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CANDLE_EXTINGUISH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "candle_extinguish"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CANDLE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "candle_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CANDLE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "candle_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CANDLE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "candle_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CANDLE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "candle_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAT_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cat_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAT_STRAY_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cat_stray_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAT_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cat_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAT_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cat_eat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAT_HISS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cat_hiss"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAT_BEG_FOR_FOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cat_beg_for_food"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAT_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cat_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAT_PURR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cat_purr"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAT_PURREOW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cat_purreow"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAVE_VINES_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cave_vines_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAVE_VINES_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cave_vines_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAVE_VINES_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cave_vines_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAVE_VINES_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cave_vines_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAVE_VINES_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cave_vines_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CAVE_VINES_PICK_BERRIES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cave_vines_pick_berries"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHAIN_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chain_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHAIN_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chain_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHAIN_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chain_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHAIN_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chain_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHAIN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chain_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_WOOD_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wood_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_WOOD_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wood_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_WOOD_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wood_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_WOOD_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wood_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_WOOD_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wood_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_SAPLING_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_sapling_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_SAPLING_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_sapling_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_SAPLING_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_sapling_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_SAPLING_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_sapling_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_SAPLING_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_sapling_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_LEAVES_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_leaves_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_LEAVES_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_leaves_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_LEAVES_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_leaves_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_LEAVES_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_leaves_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_LEAVES_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_leaves_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_WOOD_HANGING_SIGN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wood_hanging_sign_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_WOOD_HANGING_SIGN_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wood_hanging_sign_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_WOOD_HANGING_SIGN_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wood_hanging_sign_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_WOOD_HANGING_SIGN_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wood_hanging_sign_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_WOOD_HANGING_SIGN_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wood_hanging_sign_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_WOOD_DOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wood_door_close"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_WOOD_DOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wood_door_open"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_WOOD_TRAPDOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wood_trapdoor_close"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_WOOD_TRAPDOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wood_trapdoor_open"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_WOOD_BUTTON_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wood_button_click_off"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_WOOD_BUTTON_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wood_button_click_on"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_WOOD_PRESSURE_PLATE_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wood_pressure_plate_click_off"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_WOOD_PRESSURE_PLATE_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wood_pressure_plate_click_on"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_WOOD_FENCE_GATE_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wood_fence_gate_close"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHERRY_WOOD_FENCE_GATE_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cherry_wood_fence_gate_open"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHEST_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chest_close"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHEST_LOCKED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chest_locked"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHEST_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chest_open"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHICKEN_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chicken_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHICKEN_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chicken_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHICKEN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chicken_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHICKEN_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chicken_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHICKEN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chicken_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHISELED_BOOKSHELF_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_bookshelf_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHISELED_BOOKSHELF_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_bookshelf_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHISELED_BOOKSHELF_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_bookshelf_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHISELED_BOOKSHELF_INSERT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_bookshelf_insert"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHISELED_BOOKSHELF_INSERT_ENCHANTED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_bookshelf_insert_enchanted"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHISELED_BOOKSHELF_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_bookshelf_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHISELED_BOOKSHELF_PICKUP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_bookshelf_pickup"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHISELED_BOOKSHELF_PICKUP_ENCHANTED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_bookshelf_pickup_enchanted"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHISELED_BOOKSHELF_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chiseled_bookshelf_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHORUS_FLOWER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chorus_flower_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHORUS_FLOWER_GROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chorus_flower_grow"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CHORUS_FRUIT_TELEPORT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chorus_fruit_teleport"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COBWEB_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobweb_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COBWEB_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobweb_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COBWEB_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobweb_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COBWEB_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobweb_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COBWEB_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cobweb_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COD_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cod_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COD_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cod_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COD_FLOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cod_flop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COD_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cod_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COMPARATOR_CLICK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "comparator_click"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COMPOSTER_EMPTY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "composter_empty"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COMPOSTER_FILL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "composter_fill"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COMPOSTER_FILL_SUCCESS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "composter_fill_success"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COMPOSTER_READY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "composter_ready"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CONDUIT_ACTIVATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "conduit_activate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CONDUIT_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "conduit_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CONDUIT_AMBIENT_SHORT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "conduit_ambient_short"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CONDUIT_ATTACK_TARGET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "conduit_attack_target"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CONDUIT_DEACTIVATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "conduit_deactivate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COPPER_BULB_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_bulb_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COPPER_BULB_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_bulb_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COPPER_BULB_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_bulb_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COPPER_BULB_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_bulb_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COPPER_BULB_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_bulb_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COPPER_BULB_TURN_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_bulb_turn_on"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COPPER_BULB_TURN_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_bulb_turn_off"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COPPER_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COPPER_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COPPER_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COPPER_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COPPER_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COPPER_DOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_door_close"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COPPER_DOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_door_open"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COPPER_GRATE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_grate_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COPPER_GRATE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_grate_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COPPER_GRATE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_grate_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COPPER_GRATE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_grate_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COPPER_GRATE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_grate_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COPPER_TRAPDOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_trapdoor_close"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COPPER_TRAPDOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper_trapdoor_open"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CORAL_BLOCK_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "coral_block_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CORAL_BLOCK_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "coral_block_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CORAL_BLOCK_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "coral_block_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CORAL_BLOCK_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "coral_block_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CORAL_BLOCK_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "coral_block_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COW_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cow_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COW_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cow_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COW_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cow_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COW_MILK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cow_milk"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> COW_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cow_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CRAFTER_CRAFT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crafter_craft"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CRAFTER_FAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crafter_fail"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CREEPER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "creeper_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CREEPER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "creeper_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CREEPER_PRIMED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "creeper_primed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CROP_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crop_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CROP_PLANTED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crop_planted"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CROSSBOW_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crossbow_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CROSSBOW_LOADING_END  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.crossbow.loading_end"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CROSSBOW_LOADING_MIDDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.crossbow.loading_middle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CROSSBOW_LOADING_START  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.crossbow.loading_start"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CROSSBOW_QUICK_CHARGE_1  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.crossbow.quick_charge_1"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CROSSBOW_QUICK_CHARGE_2  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.crossbow.quick_charge_2"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CROSSBOW_QUICK_CHARGE_3  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.crossbow.quick_charge_3"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> CROSSBOW_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "crossbow_shoot"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DECORATED_POT_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "decorated_pot_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DECORATED_POT_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "decorated_pot_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DECORATED_POT_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "decorated_pot_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DECORATED_POT_INSERT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "decorated_pot_insert"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DECORATED_POT_INSERT_FAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "decorated_pot_insert_fail"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DECORATED_POT_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "decorated_pot_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DECORATED_POT_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "decorated_pot_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DECORATED_POT_SHATTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "decorated_pot_shatter"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DEEPSLATE_BRICKS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_bricks_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DEEPSLATE_BRICKS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_bricks_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DEEPSLATE_BRICKS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_bricks_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DEEPSLATE_BRICKS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_bricks_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DEEPSLATE_BRICKS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_bricks_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DEEPSLATE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DEEPSLATE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DEEPSLATE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DEEPSLATE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DEEPSLATE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DEEPSLATE_TILES_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_tiles_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DEEPSLATE_TILES_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_tiles_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DEEPSLATE_TILES_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_tiles_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DEEPSLATE_TILES_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_tiles_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DEEPSLATE_TILES_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "deepslate_tiles_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DISPENSER_DISPENSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dispenser_dispense"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DISPENSER_FAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dispenser_fail"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DISPENSER_LAUNCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dispenser_launch"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DOLPHIN_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dolphin_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DOLPHIN_AMBIENT_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dolphin_ambient_water"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DOLPHIN_ATTACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dolphin_attack"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DOLPHIN_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dolphin_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DOLPHIN_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dolphin_eat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DOLPHIN_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dolphin_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DOLPHIN_JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dolphin_jump"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DOLPHIN_PLAY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dolphin_play"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DOLPHIN_SPLASH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dolphin_splash"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DOLPHIN_SWIM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dolphin_swim"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DONKEY_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "donkey_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DONKEY_ANGRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "donkey_angry"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DONKEY_CHEST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "donkey_chest"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DONKEY_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "donkey_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DONKEY_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "donkey_eat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DONKEY_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "donkey_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DONKEY_JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "donkey_jump"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DRIPSTONE_BLOCK_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dripstone_block_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DRIPSTONE_BLOCK_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dripstone_block_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DRIPSTONE_BLOCK_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dripstone_block_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DRIPSTONE_BLOCK_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dripstone_block_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DRIPSTONE_BLOCK_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dripstone_block_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POINTED_DRIPSTONE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pointed_dripstone_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POINTED_DRIPSTONE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pointed_dripstone_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POINTED_DRIPSTONE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pointed_dripstone_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POINTED_DRIPSTONE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pointed_dripstone_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POINTED_DRIPSTONE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pointed_dripstone_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POINTED_DRIPSTONE_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pointed_dripstone_land"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POINTED_DRIPSTONE_DRIP_LAVA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pointed_dripstone_drip_lava"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POINTED_DRIPSTONE_DRIP_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pointed_dripstone_drip_water"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POINTED_DRIPSTONE_DRIP_LAVA_INTO_CAULDRON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pointed_dripstone_drip_lava_into_cauldron"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POINTED_DRIPSTONE_DRIP_WATER_INTO_CAULDRON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pointed_dripstone_drip_water_into_cauldron"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BIG_DRIPLEAF_TILT_DOWN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "big_dripleaf_tilt_down"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BIG_DRIPLEAF_TILT_UP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "big_dripleaf_tilt_up"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DROWNED_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "drowned_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DROWNED_AMBIENT_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "drowned_ambient_water"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DROWNED_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "drowned_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DROWNED_DEATH_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "drowned_death_water"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DROWNED_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "drowned_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DROWNED_HURT_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "drowned_hurt_water"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DROWNED_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "drowned_shoot"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DROWNED_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "drowned_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DROWNED_SWIM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "drowned_swim"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DYE_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dye_use"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> EGG_THROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "egg_throw"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ELDER_GUARDIAN_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "elder_guardian_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ELDER_GUARDIAN_AMBIENT_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "elder_guardian_ambient_land"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ELDER_GUARDIAN_CURSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "elder_guardian_curse"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ELDER_GUARDIAN_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "elder_guardian_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ELDER_GUARDIAN_DEATH_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "elder_guardian_death_land"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ELDER_GUARDIAN_FLOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "elder_guardian_flop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ELDER_GUARDIAN_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "elder_guardian_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ELDER_GUARDIAN_HURT_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "elder_guardian_hurt_land"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ELYTRA_FLYING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "elytra_flying"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ENCHANTMENT_TABLE_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "enchantment_table_use"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ENDER_CHEST_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ender_chest_close"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ENDER_CHEST_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ender_chest_open"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ENDER_DRAGON_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ender_dragon_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ENDER_DRAGON_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ender_dragon_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> DRAGON_FIREBALL_EXPLODE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dragon_fireball_explode"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ENDER_DRAGON_FLAP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ender_dragon_flap"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ENDER_DRAGON_GROWL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ender_dragon_growl"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ENDER_DRAGON_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ender_dragon_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ENDER_DRAGON_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ender_dragon_shoot"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ENDER_EYE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ender_eye_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ENDER_EYE_LAUNCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ender_eye_launch"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ENDERMAN_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "enderman_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ENDERMAN_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "enderman_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ENDERMAN_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "enderman_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ENDERMAN_SCREAM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "enderman_scream"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ENDERMAN_STARE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "enderman_stare"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ENDERMAN_TELEPORT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "enderman_teleport"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ENDERMITE_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "endermite_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ENDERMITE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "endermite_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ENDERMITE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "endermite_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ENDERMITE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "endermite_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ENDER_PEARL_THROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ender_pearl_throw"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> END_GATEWAY_SPAWN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_gateway_spawn"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> END_PORTAL_FRAME_FILL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_portal_frame_fill"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> END_PORTAL_SPAWN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "end_portal_spawn"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> EVOKER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "evoker_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> EVOKER_CAST_SPELL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "evoker_cast_spell"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> EVOKER_CELEBRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "evoker_celebrate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> EVOKER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "evoker_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> EVOKER_FANGS_ATTACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "evoker_fangs_attack"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> EVOKER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "evoker_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> EVOKER_PREPARE_ATTACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "evoker_prepare_attack"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> EVOKER_PREPARE_SUMMON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "evoker_prepare_summon"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> EVOKER_PREPARE_WOLOLO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "evoker_prepare_wololo"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> EXPERIENCE_BOTTLE_THROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "experience_bottle_throw"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> EXPERIENCE_ORB_PICKUP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "experience_orb_pickup"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FENCE_GATE_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fence_gate_close"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FENCE_GATE_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fence_gate_open"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FIRECHARGE_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "firecharge_use"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FIREWORK_ROCKET_BLAST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "firework_rocket_blast"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FIREWORK_ROCKET_BLAST_FAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "firework_rocket_blast_far"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FIREWORK_ROCKET_LARGE_BLAST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "firework_rocket_large_blast"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FIREWORK_ROCKET_LARGE_BLAST_FAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "firework_rocket_large_blast_far"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FIREWORK_ROCKET_LAUNCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "firework_rocket_launch"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FIREWORK_ROCKET_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "firework_rocket_shoot"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FIREWORK_ROCKET_TWINKLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "firework_rocket_twinkle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FIREWORK_ROCKET_TWINKLE_FAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "firework_rocket_twinkle_far"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FIRE_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fire_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FIRE_EXTINGUISH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fire_extinguish"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FISH_SWIM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fish_swim"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FISHING_BOBBER_RETRIEVE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fishing_bobber_retrieve"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FISHING_BOBBER_SPLASH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fishing_bobber_splash"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FISHING_BOBBER_THROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fishing_bobber_throw"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FLINTANDSTEEL_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flintandsteel_use"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FLOWERING_AZALEA_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flowering_azalea_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FLOWERING_AZALEA_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flowering_azalea_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FLOWERING_AZALEA_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flowering_azalea_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FLOWERING_AZALEA_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flowering_azalea_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FLOWERING_AZALEA_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flowering_azalea_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FOX_AGGRO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fox_aggro"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FOX_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fox_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FOX_BITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fox_bite"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FOX_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fox_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FOX_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fox_eat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FOX_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fox_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FOX_SCREECH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fox_screech"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FOX_SLEEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fox_sleep"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FOX_SNIFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fox_sniff"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FOX_SPIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fox_spit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FOX_TELEPORT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fox_teleport"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SUSPICIOUS_SAND_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "suspicious_sand_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SUSPICIOUS_SAND_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "suspicious_sand_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SUSPICIOUS_SAND_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "suspicious_sand_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SUSPICIOUS_SAND_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "suspicious_sand_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SUSPICIOUS_SAND_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "suspicious_sand_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SUSPICIOUS_GRAVEL_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "suspicious_gravel_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SUSPICIOUS_GRAVEL_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "suspicious_gravel_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SUSPICIOUS_GRAVEL_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "suspicious_gravel_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SUSPICIOUS_GRAVEL_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "suspicious_gravel_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SUSPICIOUS_GRAVEL_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "suspicious_gravel_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FROGLIGHT_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "froglight_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FROGLIGHT_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "froglight_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FROGLIGHT_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "froglight_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FROGLIGHT_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "froglight_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FROGLIGHT_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "froglight_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FROGSPAWNSTEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "frogspawnstep"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FROGSPAWN_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "frogspawn_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FROGSPAWN_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "frogspawn_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FROGSPAWN_HATCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "frogspawn_hatch"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FROGSPAWN_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "frogspawn_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FROGSPAWN_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "frogspawn_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FROG_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "frog_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FROG_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "frog_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FROG_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "frog_eat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FROG_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "frog_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FROG_LAY_SPAWN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "frog_lay_spawn"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FROG_LONG_JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "frog_long_jump"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FROG_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "frog_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FROG_TONGUE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "frog_tongue"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ROOTS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "roots_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ROOTS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "roots_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ROOTS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "roots_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ROOTS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "roots_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ROOTS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "roots_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FURNACE_FIRE_CRACKLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "furnace_fire_crackle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GENERIC_BIG_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic_big_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GENERIC_BURN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic_burn"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GENERIC_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GENERIC_DRINK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic_drink"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GENERIC_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic_eat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GENERIC_EXPLODE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.generic.explode"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GENERIC_EXTINGUISH_FIRE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic_extinguish_fire"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GENERIC_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GENERIC_SMALL_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic_small_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GENERIC_SPLASH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic_splash"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GENERIC_SWIM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic_swim"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GHAST_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ghast_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GHAST_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ghast_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GHAST_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ghast_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GHAST_SCREAM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ghast_scream"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GHAST_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ghast_shoot"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GHAST_WARN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ghast_warn"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GILDED_BLACKSTONE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gilded_blackstone_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GILDED_BLACKSTONE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gilded_blackstone_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GILDED_BLACKSTONE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gilded_blackstone_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GILDED_BLACKSTONE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gilded_blackstone_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GILDED_BLACKSTONE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gilded_blackstone_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GLASS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glass_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GLASS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glass_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GLASS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glass_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GLASS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glass_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GLASS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glass_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GLOW_INK_SAC_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glow_ink_sac_use"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GLOW_ITEM_FRAME_ADD_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glow_item_frame_add_item"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GLOW_ITEM_FRAME_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glow_item_frame_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GLOW_ITEM_FRAME_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glow_item_frame_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GLOW_ITEM_FRAME_REMOVE_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glow_item_frame_remove_item"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GLOW_ITEM_FRAME_ROTATE_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glow_item_frame_rotate_item"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GLOW_SQUID_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glow_squid_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GLOW_SQUID_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glow_squid_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GLOW_SQUID_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glow_squid_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GLOW_SQUID_SQUIRT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glow_squid_squirt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GOAT_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GOAT_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GOAT_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_eat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GOAT_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GOAT_LONG_JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_long_jump"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GOAT_MILK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_milk"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GOAT_PREPARE_RAM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_prepare_ram"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GOAT_RAM_IMPACT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_ram_impact"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GOAT_HORN_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_horn_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GOAT_HORN_PLAY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_horn_play"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GOAT_SCREAMING_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_screaming_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GOAT_SCREAMING_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_screaming_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GOAT_SCREAMING_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_screaming_eat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GOAT_SCREAMING_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_screaming_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GOAT_SCREAMING_LONG_JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_screaming_long_jump"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GOAT_SCREAMING_MILK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_screaming_milk"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GOAT_SCREAMING_PREPARE_RAM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_screaming_prepare_ram"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GOAT_SCREAMING_RAM_IMPACT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_screaming_ram_impact"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GOAT_SCREAMING_HORN_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_screaming_horn_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GOAT_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "goat_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GRASS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "grass_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GRASS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "grass_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GRASS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "grass_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GRASS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "grass_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GRASS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "grass_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GRAVEL_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gravel_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GRAVEL_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gravel_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GRAVEL_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gravel_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GRAVEL_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gravel_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GRAVEL_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gravel_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GRINDSTONE_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "grindstone_use"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GROWING_PLANT_CROP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "growing_plant_crop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GUARDIAN_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "guardian_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GUARDIAN_AMBIENT_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "guardian_ambient_land"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GUARDIAN_ATTACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "guardian_attack"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GUARDIAN_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "guardian_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GUARDIAN_DEATH_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "guardian_death_land"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GUARDIAN_FLOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "guardian_flop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GUARDIAN_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "guardian_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> GUARDIAN_HURT_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "guardian_hurt_land"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HANGING_ROOTS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hanging_roots_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HANGING_ROOTS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hanging_roots_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HANGING_ROOTS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hanging_roots_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HANGING_ROOTS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hanging_roots_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HANGING_ROOTS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hanging_roots_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HANGING_SIGN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hanging_sign_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HANGING_SIGN_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hanging_sign_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HANGING_SIGN_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hanging_sign_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HANGING_SIGN_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hanging_sign_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HANGING_SIGN_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hanging_sign_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HEAVY_CORE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "heavy_core_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HEAVY_CORE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "heavy_core_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HEAVY_CORE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "heavy_core_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HEAVY_CORE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "heavy_core_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HEAVY_CORE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "heavy_core_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_WOOD_HANGING_SIGN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wood_hanging_sign_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_WOOD_HANGING_SIGN_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wood_hanging_sign_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_WOOD_HANGING_SIGN_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wood_hanging_sign_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_WOOD_HANGING_SIGN_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wood_hanging_sign_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_WOOD_HANGING_SIGN_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wood_hanging_sign_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_WOOD_HANGING_SIGN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_wood_hanging_sign_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_WOOD_HANGING_SIGN_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_wood_hanging_sign_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_WOOD_HANGING_SIGN_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_wood_hanging_sign_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_WOOD_HANGING_SIGN_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_wood_hanging_sign_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> BAMBOO_WOOD_HANGING_SIGN_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bamboo_wood_hanging_sign_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIAL_SPAWNER_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trial_spawner_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIAL_SPAWNER_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trial_spawner_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIAL_SPAWNER_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trial_spawner_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIAL_SPAWNER_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trial_spawner_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIAL_SPAWNER_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trial_spawner_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIAL_SPAWNER_SPAWN_MOB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trial_spawner_spawn_mob"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIAL_SPAWNER_ABOUT_TO_SPAWN_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trial_spawner_about_to_spawn_item"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIAL_SPAWNER_SPAWN_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trial_spawner_spawn_item"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIAL_SPAWNER_SPAWN_ITEM_BEGIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trial_spawner_spawn_item_begin"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIAL_SPAWNER_DETECT_PLAYER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trial_spawner_detect_player"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIAL_SPAWNER_OMINOUS_ACTIVATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trial_spawner_ominous_activate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIAL_SPAWNER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trial_spawner_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIAL_SPAWNER_AMBIENT_OMINOUS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trial_spawner_ambient_ominous"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIAL_SPAWNER_OPEN_SHUTTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trial_spawner_open_shutter"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIAL_SPAWNER_CLOSE_SHUTTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trial_spawner_close_shutter"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIAL_SPAWNER_EJECT_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trial_spawner_eject_item"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HOE_TILL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hoe_till"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HOGLIN_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hoglin_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HOGLIN_ANGRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hoglin_angry"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HOGLIN_ATTACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hoglin_attack"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HOGLIN_CONVERTED_TO_ZOMBIFIED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hoglin_converted_to_zombified"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HOGLIN_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hoglin_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HOGLIN_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hoglin_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HOGLIN_RETREAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hoglin_retreat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HOGLIN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hoglin_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HONEY_BLOCK_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "honey_block_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HONEY_BLOCK_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "honey_block_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HONEY_BLOCK_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "honey_block_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HONEY_BLOCK_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "honey_block_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HONEY_BLOCK_SLIDE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "honey_block_slide"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HONEY_BLOCK_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "honey_block_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HONEYCOMB_WAX_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "honeycomb_wax_on"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HONEY_DRINK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "honey_drink"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HORSE_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horse_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HORSE_ANGRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horse_angry"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HORSE_ARMOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horse_armor"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HORSE_BREATHE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horse_breathe"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HORSE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horse_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HORSE_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horse_eat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HORSE_GALLOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horse_gallop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HORSE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horse_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HORSE_JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horse_jump"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HORSE_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horse_land"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HORSE_SADDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horse_saddle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HORSE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horse_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HORSE_STEP_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "horse_step_wood"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HOSTILE_BIG_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hostile_big_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HOSTILE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hostile_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HOSTILE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hostile_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HOSTILE_SMALL_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hostile_small_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HOSTILE_SPLASH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hostile_splash"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HOSTILE_SWIM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hostile_swim"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HUSK_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "husk_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HUSK_CONVERTED_TO_ZOMBIE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "husk_converted_to_zombie"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HUSK_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "husk_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HUSK_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "husk_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> HUSK_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "husk_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ILLUSIONER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "illusioner_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ILLUSIONER_CAST_SPELL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "illusioner_cast_spell"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ILLUSIONER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "illusioner_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ILLUSIONER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "illusioner_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ILLUSIONER_MIRROR_MOVE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "illusioner_mirror_move"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ILLUSIONER_PREPARE_BLINDNESS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "illusioner_prepare_blindness"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ILLUSIONER_PREPARE_MIRROR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "illusioner_prepare_mirror"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> INK_SAC_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ink_sac_use"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> IRON_DOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_door_close"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> IRON_DOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_door_open"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> IRON_GOLEM_ATTACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_golem_attack"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> IRON_GOLEM_DAMAGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_golem_damage"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> IRON_GOLEM_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_golem_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> IRON_GOLEM_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_golem_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> IRON_GOLEM_REPAIR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_golem_repair"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> IRON_GOLEM_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_golem_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> IRON_TRAPDOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_trapdoor_close"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> IRON_TRAPDOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron_trapdoor_open"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ITEM_FRAME_ADD_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item_frame_add_item"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ITEM_FRAME_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item_frame_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ITEM_FRAME_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item_frame_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ITEM_FRAME_REMOVE_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item_frame_remove_item"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ITEM_FRAME_ROTATE_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item_frame_rotate_item"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ITEM_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ITEM_PICKUP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item_pickup"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LADDER_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ladder_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LADDER_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ladder_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LADDER_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ladder_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LADDER_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ladder_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LADDER_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ladder_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LANTERN_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lantern_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LANTERN_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lantern_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LANTERN_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lantern_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LANTERN_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lantern_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LANTERN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lantern_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LARGE_AMETHYST_BUD_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "large_amethyst_bud_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LARGE_AMETHYST_BUD_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "large_amethyst_bud_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LAVA_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lava_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LAVA_EXTINGUISH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lava_extinguish"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LAVA_POP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lava_pop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LEASH_KNOT_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "leash_knot_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LEASH_KNOT_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "leash_knot_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LEVER_CLICK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lever_click"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LIGHTNING_BOLT_IMPACT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lightning_bolt_impact"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LIGHTNING_BOLT_THUNDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lightning_bolt_thunder"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LINGERING_POTION_THROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lingering_potion_throw"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LLAMA_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "llama_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LLAMA_ANGRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "llama_angry"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LLAMA_CHEST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "llama_chest"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LLAMA_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "llama_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LLAMA_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "llama_eat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LLAMA_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "llama_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LLAMA_SPIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "llama_spit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LLAMA_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "llama_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LLAMA_SWAG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.llama.swag"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MAGMA_CUBE_DEATH_SMALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magma_cube_death_small"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LODESTONE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lodestone_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LODESTONE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lodestone_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LODESTONE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lodestone_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LODESTONE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lodestone_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LODESTONE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lodestone_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LODESTONE_COMPASS_LOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lodestone_compass_lock"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MACE_SMASH_AIR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mace_smash_air"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MACE_SMASH_GROUND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mace_smash_ground"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MACE_SMASH_GROUND_HEAVY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mace_smash_ground_heavy"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MAGMA_CUBE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magma_cube_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MAGMA_CUBE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magma_cube_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MAGMA_CUBE_HURT_SMALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magma_cube_hurt_small"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MAGMA_CUBE_JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magma_cube_jump"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MAGMA_CUBE_SQUISH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magma_cube_squish"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MAGMA_CUBE_SQUISH_SMALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "magma_cube_squish_small"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MANGROVE_ROOTS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_roots_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MANGROVE_ROOTS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_roots_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MANGROVE_ROOTS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_roots_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MANGROVE_ROOTS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_roots_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MANGROVE_ROOTS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mangrove_roots_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MEDIUM_AMETHYST_BUD_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "medium_amethyst_bud_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MEDIUM_AMETHYST_BUD_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "medium_amethyst_bud_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> METAL_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "metal_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> METAL_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "metal_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> METAL_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "metal_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> METAL_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "metal_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> METAL_PRESSURE_PLATE_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "metal_pressure_plate_click_off"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> METAL_PRESSURE_PLATE_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "metal_pressure_plate_click_on"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> METAL_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "metal_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MINECART_INSIDE_UNDERWATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "minecart_inside_underwater"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MINECART_INSIDE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "minecart_inside"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MINECART_RIDING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "minecart_riding"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MOOSHROOM_CONVERT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mooshroom_convert"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MOOSHROOM_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mooshroom_eat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MOOSHROOM_MILK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mooshroom_milk"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MOOSHROOM_MILK_SUSPICIOUSLY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mooshroom_milk_suspiciously"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MOOSHROOM_SHEAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mooshroom_shear"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MOSS_CARPET_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "moss_carpet_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MOSS_CARPET_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "moss_carpet_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MOSS_CARPET_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "moss_carpet_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MOSS_CARPET_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "moss_carpet_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MOSS_CARPET_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "moss_carpet_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PINK_PETALS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_petals_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PINK_PETALS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_petals_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PINK_PETALS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_petals_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PINK_PETALS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_petals_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PINK_PETALS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pink_petals_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MOSS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "moss_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MOSS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "moss_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MOSS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "moss_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MOSS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "moss_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MOSS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "moss_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUD_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUD_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUD_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUD_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUD_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUD_BRICKS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud_bricks_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUD_BRICKS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud_bricks_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUD_BRICKS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud_bricks_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUD_BRICKS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud_bricks_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUD_BRICKS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mud_bricks_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUDDY_MANGROVE_ROOTS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "muddy_mangrove_roots_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUDDY_MANGROVE_ROOTS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "muddy_mangrove_roots_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUDDY_MANGROVE_ROOTS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "muddy_mangrove_roots_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUDDY_MANGROVE_ROOTS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "muddy_mangrove_roots_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUDDY_MANGROVE_ROOTS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "muddy_mangrove_roots_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MULE_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mule_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MULE_ANGRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mule_angry"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MULE_CHEST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mule_chest"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MULE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mule_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MULE_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mule_eat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MULE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mule_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MULE_JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mule_jump"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_CREATIVE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.creative"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_CREDITS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.credits"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_DISC_5  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.5"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_DISC_11  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.11"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_DISC_13  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.13"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_DISC_BLOCKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.blocks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_DISC_CAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.cat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_DISC_CHIRP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.chirp"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_DISC_FAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.far"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_DISC_MALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.mall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_DISC_MELLOHI  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.mellohi"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_DISC_PIGSTEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.pigstep"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_DISC_STAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.stal"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_DISC_STRAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.strad"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_DISC_WAIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.wait"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_DISC_WARD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.ward"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_DISC_OTHERSIDE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.otherside"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_DISC_RELIC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.relic"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_DISC_CREATOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.creator"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_DISC_CREATOR_MUSIC_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.creator_music_box"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_DISC_PRECIPICE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.precipice"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_DRAGON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.dragon"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_END  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.end"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_GAME  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.game"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_MENU  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.menu"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_BASALT_DELTAS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.nether.basalt_deltas"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_CRIMSON_FOREST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.nether.crimson_forest"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_DEEP_DARK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.deep_dark"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_DRIPSTONE_CAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.dripstone_caves"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_GROVE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.grove"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_JAGGED_PEAKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.jagged_peaks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_LUSH_CAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.lush_caves"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_SWAMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.swamp"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_FOREST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.forest"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_OLD_GROWTH_TAIGA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.old_growth_taiga"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_MEADOW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.meadow"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_CHERRY_GROVE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.cherry_grove"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_NETHER_WASTES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.nether.nether_wastes"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_FROZEN_PEAKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.frozen_peaks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_SNOWY_SLOPES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.snowy_slopes"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_SOUL_SAND_VALLEY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.nether.soul_sand_valley"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_STONY_PEAKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.stony_peaks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_WARPED_FOREST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.nether.warped_forest"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_FLOWER_FOREST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.flower_forest"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_DESERT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.desert"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_BADLANDS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.badlands"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_JUNGLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.jungle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_SPARSE_JUNGLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.sparse_jungle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_BIOME_BAMBOO_JUNGLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.bamboo_jungle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> MUSIC_UNDER_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.under_water"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_BRICKS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_bricks_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_BRICKS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_bricks_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_BRICKS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_bricks_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_BRICKS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_bricks_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_BRICKS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_bricks_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_WART_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wart_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_WART_PLANTED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wart_planted"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_WOOD_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wood_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_WOOD_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wood_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_WOOD_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wood_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_WOOD_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wood_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_WOOD_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wood_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_WOOD_DOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wood_door_close"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_WOOD_DOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wood_door_open"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_WOOD_TRAPDOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wood_trapdoor_close"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_WOOD_TRAPDOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wood_trapdoor_open"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_WOOD_BUTTON_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wood_button_click_off"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_WOOD_BUTTON_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wood_button_click_on"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_WOOD_PRESSURE_PLATE_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wood_pressure_plate_click_off"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_WOOD_PRESSURE_PLATE_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wood_pressure_plate_click_on"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_WOOD_FENCE_GATE_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wood_fence_gate_close"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_WOOD_FENCE_GATE_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_wood_fence_gate_open"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> EMPTY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "empty"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PACKED_MUD_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "packed_mud_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PACKED_MUD_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "packed_mud_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PACKED_MUD_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "packed_mud_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PACKED_MUD_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "packed_mud_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PACKED_MUD_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "packed_mud_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STEM_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stem_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STEM_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stem_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STEM_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stem_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STEM_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stem_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STEM_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stem_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NYLIUM_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nylium_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NYLIUM_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nylium_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NYLIUM_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nylium_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NYLIUM_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nylium_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NYLIUM_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nylium_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_SPROUTS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_sprouts_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_SPROUTS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_sprouts_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_SPROUTS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_sprouts_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_SPROUTS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_sprouts_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_SPROUTS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_sprouts_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FUNGUS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fungus_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FUNGUS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fungus_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FUNGUS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fungus_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FUNGUS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fungus_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> FUNGUS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fungus_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WEEPING_VINES_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weeping_vines_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WEEPING_VINES_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weeping_vines_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WEEPING_VINES_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weeping_vines_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WEEPING_VINES_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weeping_vines_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WEEPING_VINES_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weeping_vines_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WART_BLOCK_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wart_block_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WART_BLOCK_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wart_block_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WART_BLOCK_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wart_block_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WART_BLOCK_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wart_block_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WART_BLOCK_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wart_block_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHERITE_BLOCK_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_block_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHERITE_BLOCK_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_block_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHERITE_BLOCK_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_block_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHERITE_BLOCK_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_block_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHERITE_BLOCK_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite_block_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHERRACK_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherrack_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHERRACK_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherrack_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHERRACK_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherrack_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHERRACK_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherrack_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHERRACK_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherrack_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NOTE_BLOCK_BASEDRUM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.basedrum"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NOTE_BLOCK_BASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.bass"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NOTE_BLOCK_BELL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.bell"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NOTE_BLOCK_CHIME  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.chime"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NOTE_BLOCK_FLUTE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.flute"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NOTE_BLOCK_GUITAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.guitar"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NOTE_BLOCK_HARP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.harp"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NOTE_BLOCK_HAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.hat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NOTE_BLOCK_PLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.pling"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NOTE_BLOCK_SNARE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.snare"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NOTE_BLOCK_XYLOPHONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.xylophone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NOTE_BLOCK_IRON_XYLOPHONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.iron_xylophone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NOTE_BLOCK_COW_BELL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.cow_bell"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NOTE_BLOCK_DIDGERIDOO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.didgeridoo"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NOTE_BLOCK_BIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.bit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NOTE_BLOCK_BANJO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.banjo"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NOTE_BLOCK_IMITATE_ZOMBIE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.imitate.zombie"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NOTE_BLOCK_IMITATE_SKELETON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.imitate.skeleton"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NOTE_BLOCK_IMITATE_CREEPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.imitate.creeper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NOTE_BLOCK_IMITATE_ENDER_DRAGON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.imitate.ender_dragon"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NOTE_BLOCK_IMITATE_WITHER_SKELETON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.imitate.wither_skeleton"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NOTE_BLOCK_IMITATE_PIGLIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.imitate.piglin"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> OCELOT_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ocelot_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> OCELOT_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ocelot_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> OCELOT_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ocelot_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> OMINOUS_BOTTLE_DISPOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ominous_bottle_dispose"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PAINTING_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "painting_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PAINTING_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "painting_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PANDA_PRE_SNEEZE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "panda_pre_sneeze"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PANDA_SNEEZE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "panda_sneeze"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PANDA_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "panda_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PANDA_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "panda_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PANDA_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "panda_eat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PANDA_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "panda_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PANDA_CANT_BREED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "panda_cant_breed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PANDA_AGGRESSIVE_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "panda_aggressive_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PANDA_WORRIED_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "panda_worried_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PANDA_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "panda_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PANDA_BITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "panda_bite"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_eat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_FLY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_fly"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_BLAZE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_blaze"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_BOGGED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_bogged"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_BREEZE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_breeze"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_CREEPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_creeper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_DROWNED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_drowned"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_ELDER_GUARDIAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_elder_guardian"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_ENDER_DRAGON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_ender_dragon"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_ENDERMITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_endermite"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_EVOKER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_evoker"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_GHAST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_ghast"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_GUARDIAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_guardian"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_HOGLIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_hoglin"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_HUSK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_husk"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_ILLUSIONER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_illusioner"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_MAGMA_CUBE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_magma_cube"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_PHANTOM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_phantom"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_PIGLIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_piglin"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_PIGLIN_BRUTE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_piglin_brute"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_PILLAGER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_pillager"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_RAVAGER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_ravager"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_SHULKER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_shulker"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_SILVERFISH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_silverfish"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_SKELETON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_skeleton"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_SLIME  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_slime"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_SPIDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_spider"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_STRAY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_stray"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_VEX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_vex"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_VINDICATOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_vindicator"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_WARDEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_warden"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_WITCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_witch"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_WITHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_wither"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_WITHER_SKELETON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_wither_skeleton"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_ZOGLIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_zoglin"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_ZOMBIE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_zombie"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_IMITATE_ZOMBIE_VILLAGER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_imitate_zombie_villager"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PARROT_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "parrot_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PHANTOM_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "phantom_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PHANTOM_BITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "phantom_bite"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PHANTOM_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "phantom_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PHANTOM_FLAP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "phantom_flap"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PHANTOM_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "phantom_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PHANTOM_SWOOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "phantom_swoop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PIG_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pig_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PIG_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pig_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PIG_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pig_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PIG_SADDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pig_saddle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PIG_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pig_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PIGLIN_ADMIRING_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_admiring_item"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PIGLIN_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PIGLIN_ANGRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_angry"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PIGLIN_CELEBRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_celebrate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PIGLIN_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PIGLIN_JEALOUS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_jealous"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PIGLIN_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PIGLIN_RETREAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_retreat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PIGLIN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PIGLIN_CONVERTED_TO_ZOMBIFIED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_converted_to_zombified"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PIGLIN_BRUTE_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_brute_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PIGLIN_BRUTE_ANGRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_brute_angry"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PIGLIN_BRUTE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_brute_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PIGLIN_BRUTE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_brute_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PIGLIN_BRUTE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_brute_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PIGLIN_BRUTE_CONVERTED_TO_ZOMBIFIED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piglin_brute_converted_to_zombified"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PILLAGER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pillager_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PILLAGER_CELEBRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pillager_celebrate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PILLAGER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pillager_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PILLAGER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pillager_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PISTON_CONTRACT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piston_contract"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PISTON_EXTEND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piston_extend"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PLAYER_ATTACK_CRIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_attack_crit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PLAYER_ATTACK_KNOCKBACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_attack_knockback"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PLAYER_ATTACK_NODAMAGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_attack_nodamage"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PLAYER_ATTACK_STRONG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_attack_strong"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PLAYER_ATTACK_SWEEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_attack_sweep"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PLAYER_ATTACK_WEAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_attack_weak"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PLAYER_BIG_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_big_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PLAYER_BREATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_breath"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PLAYER_BURP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_burp"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PLAYER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PLAYER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PLAYER_HURT_DROWN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_hurt_drown"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PLAYER_HURT_FREEZE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_hurt_freeze"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PLAYER_HURT_ON_FIRE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_hurt_on_fire"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PLAYER_HURT_SWEET_BERRY_BUSH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_hurt_sweet_berry_bush"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PLAYER_LEVELUP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_levelup"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PLAYER_SMALL_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_small_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PLAYER_SPLASH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_splash"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PLAYER_SPLASH_HIGH_SPEED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_splash_high_speed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PLAYER_SWIM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_swim"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PLAYER_TELEPORT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player_teleport"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POLAR_BEAR_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polar_bear_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POLAR_BEAR_AMBIENT_BABY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polar_bear_ambient_baby"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POLAR_BEAR_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polar_bear_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POLAR_BEAR_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polar_bear_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POLAR_BEAR_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polar_bear_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POLAR_BEAR_WARNING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polar_bear_warning"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POLISHED_DEEPSLATE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_deepslate_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POLISHED_DEEPSLATE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_deepslate_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POLISHED_DEEPSLATE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_deepslate_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POLISHED_DEEPSLATE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_deepslate_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POLISHED_DEEPSLATE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_deepslate_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PORTAL_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "portal_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PORTAL_TRAVEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "portal_travel"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PORTAL_TRIGGER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "portal_trigger"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POWDER_SNOW_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "powder_snow_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POWDER_SNOW_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "powder_snow_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POWDER_SNOW_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "powder_snow_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POWDER_SNOW_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "powder_snow_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POWDER_SNOW_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "powder_snow_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PUFFER_FISH_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "puffer_fish_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PUFFER_FISH_BLOW_OUT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "puffer_fish_blow_out"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PUFFER_FISH_BLOW_UP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "puffer_fish_blow_up"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PUFFER_FISH_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "puffer_fish_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PUFFER_FISH_FLOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "puffer_fish_flop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PUFFER_FISH_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "puffer_fish_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PUFFER_FISH_STING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "puffer_fish_sting"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> PUMPKIN_CARVE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pumpkin_carve"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> RABBIT_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rabbit_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> RABBIT_ATTACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rabbit_attack"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> RABBIT_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rabbit_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> RABBIT_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rabbit_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> RABBIT_JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rabbit_jump"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> RAID_HORN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "event.raid.horn"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> RAVAGER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ravager_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> RAVAGER_ATTACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ravager_attack"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> RAVAGER_CELEBRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ravager_celebrate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> RAVAGER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ravager_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> RAVAGER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ravager_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> RAVAGER_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ravager_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> RAVAGER_STUNNED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ravager_stunned"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> RAVAGER_ROAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ravager_roar"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_GOLD_ORE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_gold_ore_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_GOLD_ORE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_gold_ore_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_GOLD_ORE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_gold_ore_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_GOLD_ORE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_gold_ore_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_GOLD_ORE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_gold_ore_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_ORE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_ore_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_ORE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_ore_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_ORE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_ore_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_ORE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_ore_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> NETHER_ORE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nether_ore_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> REDSTONE_TORCH_BURNOUT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "redstone_torch_burnout"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> RESPAWN_ANCHOR_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "respawn_anchor_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> RESPAWN_ANCHOR_CHARGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "respawn_anchor_charge"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> RESPAWN_ANCHOR_DEPLETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.respawn_anchor.deplete"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> RESPAWN_ANCHOR_SET_SPAWN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "respawn_anchor_set_spawn"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ROOTED_DIRT_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rooted_dirt_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ROOTED_DIRT_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rooted_dirt_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ROOTED_DIRT_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rooted_dirt_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ROOTED_DIRT_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rooted_dirt_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ROOTED_DIRT_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rooted_dirt_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SALMON_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "salmon_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SALMON_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "salmon_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SALMON_FLOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "salmon_flop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SALMON_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "salmon_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SAND_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sand_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SAND_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sand_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SAND_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sand_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SAND_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sand_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SAND_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sand_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCAFFOLDING_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "scaffolding_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCAFFOLDING_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "scaffolding_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCAFFOLDING_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "scaffolding_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCAFFOLDING_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "scaffolding_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCAFFOLDING_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "scaffolding_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_BLOCK_SPREAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_block_spread"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_BLOCK_CHARGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_block_charge"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_BLOCK_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_block_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_BLOCK_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_block_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_BLOCK_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_block_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_BLOCK_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_block_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_BLOCK_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_block_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_CATALYST_BLOOM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_catalyst_bloom"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_CATALYST_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_catalyst_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_CATALYST_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_catalyst_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_CATALYST_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_catalyst_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_CATALYST_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_catalyst_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_CATALYST_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_catalyst_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_CLICKING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_clicking"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_CLICKING_STOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_clicking_stop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_SENSOR_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_sensor_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_SENSOR_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_sensor_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_SENSOR_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_sensor_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_SENSOR_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_sensor_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_SENSOR_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_sensor_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_SHRIEKER_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_shrieker_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_SHRIEKER_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_shrieker_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_SHRIEKER_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_shrieker_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_SHRIEKER_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_shrieker_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_SHRIEKER_SHRIEK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_shrieker_shriek"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_SHRIEKER_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_shrieker_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_VEIN_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_vein_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_VEIN_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_vein_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_VEIN_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_vein_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_VEIN_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_vein_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SCULK_VEIN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sculk_vein_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHEEP_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sheep_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHEEP_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sheep_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHEEP_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sheep_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHEEP_SHEAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sheep_shear"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHEEP_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sheep_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHIELD_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shield_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHIELD_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shield_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHROOMLIGHT_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shroomlight_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHROOMLIGHT_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shroomlight_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHROOMLIGHT_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shroomlight_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHROOMLIGHT_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shroomlight_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHROOMLIGHT_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shroomlight_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHOVEL_FLATTEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shovel_flatten"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHULKER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shulker_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHULKER_BOX_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shulker_box_close"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHULKER_BOX_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shulker_box_open"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHULKER_BULLET_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shulker_bullet_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHULKER_BULLET_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shulker_bullet_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHULKER_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shulker_close"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHULKER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shulker_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHULKER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shulker_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHULKER_HURT_CLOSED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shulker_hurt_closed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHULKER_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shulker_open"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHULKER_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shulker_shoot"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SHULKER_TELEPORT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shulker_teleport"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SILVERFISH_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "silverfish_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SILVERFISH_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "silverfish_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SILVERFISH_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "silverfish_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SILVERFISH_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "silverfish_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SKELETON_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skeleton_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SKELETON_CONVERTED_TO_STRAY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skeleton_converted_to_stray"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SKELETON_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skeleton_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SKELETON_HORSE_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skeleton_horse_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SKELETON_HORSE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skeleton_horse_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SKELETON_HORSE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skeleton_horse_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SKELETON_HORSE_SWIM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skeleton_horse_swim"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SKELETON_HORSE_AMBIENT_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skeleton_horse_ambient_water"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SKELETON_HORSE_GALLOP_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skeleton_horse_gallop_water"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SKELETON_HORSE_JUMP_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skeleton_horse_jump_water"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SKELETON_HORSE_STEP_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skeleton_horse_step_water"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SKELETON_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skeleton_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SKELETON_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skeleton_shoot"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SKELETON_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skeleton_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SLIME_ATTACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slime_attack"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SLIME_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slime_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SLIME_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slime_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SLIME_JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slime_jump"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SLIME_SQUISH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slime_squish"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SLIME_BLOCK_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slime_block_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SLIME_BLOCK_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slime_block_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SLIME_BLOCK_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slime_block_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SLIME_BLOCK_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slime_block_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SLIME_BLOCK_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slime_block_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SMALL_AMETHYST_BUD_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "small_amethyst_bud_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SMALL_AMETHYST_BUD_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "small_amethyst_bud_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SMALL_DRIPLEAF_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "small_dripleaf_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SMALL_DRIPLEAF_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "small_dripleaf_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SMALL_DRIPLEAF_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "small_dripleaf_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SMALL_DRIPLEAF_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "small_dripleaf_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SMALL_DRIPLEAF_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "small_dripleaf_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SOUL_SAND_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_sand_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SOUL_SAND_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_sand_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SOUL_SAND_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_sand_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SOUL_SAND_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_sand_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SOUL_SAND_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_sand_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SOUL_SOIL_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_soil_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SOUL_SOIL_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_soil_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SOUL_SOIL_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_soil_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SOUL_SOIL_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_soil_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SOUL_SOIL_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_soil_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SOUL_ESCAPE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "particle.soul_escape"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SPORE_BLOSSOM_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spore_blossom_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SPORE_BLOSSOM_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spore_blossom_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SPORE_BLOSSOM_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spore_blossom_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SPORE_BLOSSOM_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spore_blossom_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SPORE_BLOSSOM_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spore_blossom_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STRIDER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "strider_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STRIDER_HAPPY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "strider_happy"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STRIDER_RETREAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "strider_retreat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STRIDER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "strider_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STRIDER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "strider_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STRIDER_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "strider_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STRIDER_STEP_LAVA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "strider_step_lava"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STRIDER_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "strider_eat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STRIDER_SADDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "strider_saddle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SLIME_DEATH_SMALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slime_death_small"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SLIME_HURT_SMALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slime_hurt_small"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SLIME_JUMP_SMALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slime_jump_small"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SLIME_SQUISH_SMALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slime_squish_small"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SMITHING_TABLE_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smithing_table_use"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SMOKER_SMOKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smoker_smoke"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNIFFER_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sniffer_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNIFFER_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sniffer_eat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNIFFER_IDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sniffer_idle"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNIFFER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sniffer_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNIFFER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sniffer_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNIFFER_DROP_SEED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sniffer_drop_seed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNIFFER_SCENTING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sniffer_scenting"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNIFFER_SNIFFING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sniffer_sniffing"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNIFFER_SEARCHING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sniffer_searching"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNIFFER_DIGGING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sniffer_digging"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNIFFER_DIGGING_STOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sniffer_digging_stop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNIFFER_HAPPY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sniffer_happy"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNIFFER_EGG_PLOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sniffer_egg_plop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNIFFER_EGG_CRACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sniffer_egg_crack"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNIFFER_EGG_HATCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sniffer_egg_hatch"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNOWBALL_THROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snowball_throw"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNOW_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snow_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNOW_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snow_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNOW_GOLEM_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snow_golem_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNOW_GOLEM_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snow_golem_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNOW_GOLEM_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snow_golem_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNOW_GOLEM_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snow_golem_shoot"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNOW_GOLEM_SHEAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snow_golem_shear"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNOW_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snow_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNOW_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snow_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SNOW_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snow_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SPIDER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spider_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SPIDER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spider_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SPIDER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spider_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SPIDER_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spider_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SPLASH_POTION_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "splash_potion_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SPLASH_POTION_THROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "splash_potion_throw"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SPONGE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sponge_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SPONGE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sponge_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SPONGE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sponge_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SPONGE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sponge_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SPONGE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sponge_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SPONGE_ABSORB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sponge_absorb"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SPYGLASS_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spyglass_use"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SPYGLASS_STOP_USING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spyglass_stop_using"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SQUID_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "squid_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SQUID_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "squid_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SQUID_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "squid_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SQUID_SQUIRT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "squid_squirt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STONE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STONE_BUTTON_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_button_click_off"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STONE_BUTTON_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_button_click_on"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STONE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STONE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STONE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STONE_PRESSURE_PLATE_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_pressure_plate_click_off"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STONE_PRESSURE_PLATE_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_pressure_plate_click_on"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STONE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stone_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STRAY_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stray_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STRAY_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stray_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STRAY_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stray_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> STRAY_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stray_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SWEET_BERRY_BUSH_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sweet_berry_bush_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SWEET_BERRY_BUSH_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sweet_berry_bush_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> SWEET_BERRY_BUSH_PICK_BERRIES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sweet_berry_bush_pick_berries"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TADPOLE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tadpole_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TADPOLE_FLOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tadpole_flop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TADPOLE_GROW_UP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tadpole_grow_up"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TADPOLE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tadpole_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> THORNS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "thorns_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TNT_PRIMED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tnt_primed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TOTEM_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "totem_use"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIDENT_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trident_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIDENT_HIT_GROUND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trident_hit_ground"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIDENT_RETURN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trident_return"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIDENT_RIPTIDE_1  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.trident.riptide_1"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIDENT_RIPTIDE_2  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.trident.riptide_2"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIDENT_RIPTIDE_3  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.trident.riptide_3"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIDENT_THROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.trident.throw"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIDENT_THUNDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.trident.thunder"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIPWIRE_ATTACH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tripwire_attach"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIPWIRE_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tripwire_click_off"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIPWIRE_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tripwire_click_on"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TRIPWIRE_DETACH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tripwire_detach"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TROPICAL_FISH_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tropical_fish_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TROPICAL_FISH_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tropical_fish_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TROPICAL_FISH_FLOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tropical_fish_flop"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TROPICAL_FISH_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tropical_fish_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TUFF_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TUFF_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TUFF_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TUFF_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TUFF_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TUFF_BRICKS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_bricks_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TUFF_BRICKS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_bricks_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TUFF_BRICKS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_bricks_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TUFF_BRICKS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_bricks_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TUFF_BRICKS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tuff_bricks_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POLISHED_TUFF_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_tuff_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POLISHED_TUFF_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_tuff_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POLISHED_TUFF_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_tuff_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POLISHED_TUFF_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_tuff_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> POLISHED_TUFF_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "polished_tuff_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TURTLE_AMBIENT_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "turtle_ambient_land"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TURTLE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "turtle_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TURTLE_DEATH_BABY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "turtle_death_baby"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TURTLE_EGG_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "turtle_egg_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TURTLE_EGG_CRACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "turtle_egg_crack"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TURTLE_EGG_HATCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "turtle_egg_hatch"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TURTLE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "turtle_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TURTLE_HURT_BABY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "turtle_hurt_baby"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TURTLE_LAY_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "turtle_lay_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TURTLE_SHAMBLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "turtle_shamble"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TURTLE_SHAMBLE_BABY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "turtle_shamble_baby"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> TURTLE_SWIM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "turtle_swim"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> UI_BUTTON_CLICK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ui.button.click"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> UI_LOOM_SELECT_PATTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ui_loom_select_pattern"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> UI_LOOM_TAKE_RESULT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ui_loom_take_result"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> UI_CARTOGRAPHY_TABLE_TAKE_RESULT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ui_cartography_table_take_result"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> UI_STONECUTTER_TAKE_RESULT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ui_stonecutter_take_result"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> UI_STONECUTTER_SELECT_RECIPE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ui_stonecutter_select_recipe"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> UI_TOAST_CHALLENGE_COMPLETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ui_toast_challenge_complete"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> UI_TOAST_IN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ui_toast_in"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> UI_TOAST_OUT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ui_toast_out"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VAULT_ACTIVATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vault_activate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VAULT_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vault_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VAULT_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vault_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VAULT_CLOSE_SHUTTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vault_close_shutter"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VAULT_DEACTIVATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vault_deactivate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VAULT_EJECT_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vault_eject_item"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VAULT_REJECT_REWARDED_PLAYER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vault_reject_rewarded_player"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VAULT_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vault_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VAULT_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vault_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VAULT_INSERT_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vault_insert_item"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VAULT_INSERT_ITEM_FAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vault_insert_item_fail"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VAULT_OPEN_SHUTTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vault_open_shutter"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VAULT_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vault_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VAULT_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vault_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VEX_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vex_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VEX_CHARGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vex_charge"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VEX_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vex_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VEX_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vex_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VILLAGER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "villager_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VILLAGER_CELEBRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "villager_celebrate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VILLAGER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "villager_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VILLAGER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "villager_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VILLAGER_NO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "villager_no"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VILLAGER_TRADE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "villager_trade"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VILLAGER_YES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "villager_yes"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VILLAGER_WORK_ARMORER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "villager_work_armorer"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VILLAGER_WORK_BUTCHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "villager_work_butcher"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VILLAGER_WORK_CARTOGRAPHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "villager_work_cartographer"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VILLAGER_WORK_CLERIC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "villager_work_cleric"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VILLAGER_WORK_FARMER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "villager_work_farmer"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VILLAGER_WORK_FISHERMAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "villager_work_fisherman"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VILLAGER_WORK_FLETCHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "villager_work_fletcher"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VILLAGER_WORK_LEATHERWORKER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "villager_work_leatherworker"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VILLAGER_WORK_LIBRARIAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "villager_work_librarian"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VILLAGER_WORK_MASON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "villager_work_mason"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VILLAGER_WORK_SHEPHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "villager_work_shepherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VILLAGER_WORK_TOOLSMITH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "villager_work_toolsmith"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VILLAGER_WORK_WEAPONSMITH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "villager_work_weaponsmith"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VINDICATOR_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vindicator_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VINDICATOR_CELEBRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vindicator_celebrate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VINDICATOR_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vindicator_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VINDICATOR_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vindicator_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VINE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vine_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VINE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vine_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VINE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vine_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VINE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vine_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> VINE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vine_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> LILY_PAD_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lily_pad_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WANDERING_TRADER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wandering_trader_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WANDERING_TRADER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wandering_trader_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WANDERING_TRADER_DISAPPEARED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wandering_trader_disappeared"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WANDERING_TRADER_DRINK_MILK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wandering_trader_drink_milk"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WANDERING_TRADER_DRINK_POTION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wandering_trader_drink_potion"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WANDERING_TRADER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wandering_trader_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WANDERING_TRADER_NO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wandering_trader_no"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WANDERING_TRADER_REAPPEARED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wandering_trader_reappeared"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WANDERING_TRADER_TRADE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wandering_trader_trade"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WANDERING_TRADER_YES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wandering_trader_yes"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WARDEN_AGITATED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warden_agitated"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WARDEN_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warden_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WARDEN_ANGRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warden_angry"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WARDEN_ATTACK_IMPACT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warden_attack_impact"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WARDEN_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warden_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WARDEN_DIG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warden_dig"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WARDEN_EMERGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warden_emerge"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WARDEN_HEARTBEAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warden_heartbeat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WARDEN_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warden_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WARDEN_LISTENING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warden_listening"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WARDEN_LISTENING_ANGRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warden_listening_angry"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WARDEN_NEARBY_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warden_nearby_close"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WARDEN_NEARBY_CLOSER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warden_nearby_closer"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WARDEN_NEARBY_CLOSEST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warden_nearby_closest"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WARDEN_ROAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warden_roar"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WARDEN_SNIFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warden_sniff"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WARDEN_SONIC_BOOM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warden_sonic_boom"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WARDEN_SONIC_CHARGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warden_sonic_charge"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WARDEN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warden_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WARDEN_TENDRIL_CLICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warden_tendril_clicks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WAXED_HANGING_SIGN_INTERACT_FAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_hanging_sign_interact_fail"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WAXED_SIGN_INTERACT_FAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "waxed_sign_interact_fail"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WATER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "water_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WEATHER_RAIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weather_rain"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WEATHER_RAIN_ABOVE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weather_rain_above"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WET_GRASS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wet_grass_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WET_GRASS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wet_grass_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WET_GRASS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wet_grass_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WET_GRASS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wet_grass_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WET_GRASS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wet_grass_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WET_SPONGE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wet_sponge_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WET_SPONGE_DRIES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wet_sponge_dries"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WET_SPONGE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wet_sponge_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WET_SPONGE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wet_sponge_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WET_SPONGE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wet_sponge_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WET_SPONGE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wet_sponge_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WIND_CHARGE_BURST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wind_charge.wind_burst"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WIND_CHARGE_THROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wind_charge_throw"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WITCH_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "witch_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WITCH_CELEBRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "witch_celebrate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WITCH_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "witch_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WITCH_DRINK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "witch_drink"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WITCH_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "witch_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WITCH_THROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "witch_throw"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WITHER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WITHER_BREAK_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither_break_block"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WITHER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WITHER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WITHER_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither_shoot"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WITHER_SKELETON_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither_skeleton_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WITHER_SKELETON_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither_skeleton_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WITHER_SKELETON_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither_skeleton_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WITHER_SKELETON_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither_skeleton_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WITHER_SPAWN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither_spawn"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOLF_ARMOR_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wolf_armor_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOLF_ARMOR_CRACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wolf_armor_crack"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOLF_ARMOR_DAMAGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wolf_armor_damage"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOLF_ARMOR_REPAIR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wolf_armor_repair"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOLF_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wolf_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOLF_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wolf_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOLF_GROWL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wolf_growl"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOLF_HOWL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wolf_howl"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOLF_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wolf_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOLF_PANT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wolf_pant"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOLF_SHAKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wolf_shake"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOLF_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wolf_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOLF_WHINE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wolf_whine"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOODEN_DOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wooden_door_close"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOODEN_DOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wooden_door_open"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOODEN_TRAPDOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wooden_trapdoor_close"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOODEN_TRAPDOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wooden_trapdoor_open"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOODEN_BUTTON_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wooden_button_click_off"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOODEN_BUTTON_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wooden_button_click_on"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOODEN_PRESSURE_PLATE_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wooden_pressure_plate_click_off"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOODEN_PRESSURE_PLATE_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wooden_pressure_plate_click_on"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOOD_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wood_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOOD_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wood_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOOD_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wood_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOOD_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wood_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOOD_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wood_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOOL_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wool_break"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOOL_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wool_fall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOOL_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wool_hit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOOL_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wool_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> WOOL_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wool_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOGLIN_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zoglin_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOGLIN_ANGRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zoglin_angry"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOGLIN_ATTACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zoglin_attack"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOGLIN_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zoglin_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOGLIN_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zoglin_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOGLIN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zoglin_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOMBIE_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOMBIE_ATTACK_WOODEN_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_attack_wooden_door"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOMBIE_ATTACK_IRON_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_attack_iron_door"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOMBIE_BREAK_WOODEN_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_break_wooden_door"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOMBIE_CONVERTED_TO_DROWNED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_converted_to_drowned"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOMBIE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOMBIE_DESTROY_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_destroy_egg"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOMBIE_HORSE_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_horse_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOMBIE_HORSE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_horse_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOMBIE_HORSE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_horse_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOMBIE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOMBIE_INFECT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_infect"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOMBIFIED_PIGLIN_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombified_piglin_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOMBIFIED_PIGLIN_ANGRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombified_piglin_angry"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOMBIFIED_PIGLIN_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombified_piglin_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOMBIFIED_PIGLIN_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombified_piglin_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOMBIE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOMBIE_VILLAGER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_villager_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOMBIE_VILLAGER_CONVERTED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_villager_converted"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOMBIE_VILLAGER_CURE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_villager_cure"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOMBIE_VILLAGER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_villager_death"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOMBIE_VILLAGER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_villager_hurt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> ZOMBIE_VILLAGER_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie_villager_step"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> APPLY_EFFECT_BAD_OMEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "apply_effect_bad_omen"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> APPLY_EFFECT_TRIAL_OMEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "apply_effect_trial_omen"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<Sound> APPLY_EFFECT_RAID_OMEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "apply_effect_raid_omen"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

}
