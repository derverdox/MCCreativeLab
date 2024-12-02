package de.verdox.mccreativelab.wrapper.typed;

import net.kyori.adventure.sound.Sound;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import com.google.common.reflect.TypeToken;
import net.kyori.adventure.key.Key;

public class MCCSounds  {

	public static final Key VANILLA_REGISTRY_KEY  = Key.key("minecraft", "sound_event");

	public static final MCCReference<Sound> ALLAY_AMBIENT_WITH_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.allay.ambient_with_item"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ALLAY_AMBIENT_WITHOUT_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.allay.ambient_without_item"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ALLAY_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.allay.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ALLAY_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.allay.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ALLAY_ITEM_GIVEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.allay.item_given"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ALLAY_ITEM_TAKEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.allay.item_taken"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ALLAY_THROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.allay.item_thrown"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMBIENT_CAVE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.cave"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMBIENT_BASALT_DELTAS_ADDITIONS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.basalt_deltas.additions"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMBIENT_BASALT_DELTAS_LOOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.basalt_deltas.loop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMBIENT_BASALT_DELTAS_MOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.basalt_deltas.mood"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMBIENT_CRIMSON_FOREST_ADDITIONS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.crimson_forest.additions"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMBIENT_CRIMSON_FOREST_LOOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.crimson_forest.loop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMBIENT_CRIMSON_FOREST_MOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.crimson_forest.mood"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMBIENT_NETHER_WASTES_ADDITIONS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.nether_wastes.additions"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMBIENT_NETHER_WASTES_LOOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.nether_wastes.loop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMBIENT_NETHER_WASTES_MOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.nether_wastes.mood"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMBIENT_SOUL_SAND_VALLEY_ADDITIONS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.soul_sand_valley.additions"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMBIENT_SOUL_SAND_VALLEY_LOOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.soul_sand_valley.loop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMBIENT_SOUL_SAND_VALLEY_MOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.soul_sand_valley.mood"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMBIENT_WARPED_FOREST_ADDITIONS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.warped_forest.additions"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMBIENT_WARPED_FOREST_LOOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.warped_forest.loop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMBIENT_WARPED_FOREST_MOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.warped_forest.mood"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMBIENT_UNDERWATER_ENTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.underwater.enter"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMBIENT_UNDERWATER_EXIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.underwater.exit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMBIENT_UNDERWATER_LOOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.underwater.loop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMBIENT_UNDERWATER_LOOP_ADDITIONS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.underwater.loop.additions"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMBIENT_UNDERWATER_LOOP_ADDITIONS_RARE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.underwater.loop.additions.rare"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMBIENT_UNDERWATER_LOOP_ADDITIONS_ULTRA_RARE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ambient.underwater.loop.additions.ultra_rare"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMETHYST_BLOCK_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.amethyst_block.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMETHYST_BLOCK_CHIME  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.amethyst_block.chime"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMETHYST_BLOCK_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.amethyst_block.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMETHYST_BLOCK_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.amethyst_block.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMETHYST_BLOCK_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.amethyst_block.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMETHYST_BLOCK_RESONATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.amethyst_block.resonate"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMETHYST_BLOCK_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.amethyst_block.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMETHYST_CLUSTER_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.amethyst_cluster.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMETHYST_CLUSTER_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.amethyst_cluster.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMETHYST_CLUSTER_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.amethyst_cluster.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMETHYST_CLUSTER_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.amethyst_cluster.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AMETHYST_CLUSTER_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.amethyst_cluster.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ANCIENT_DEBRIS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.ancient_debris.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ANCIENT_DEBRIS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.ancient_debris.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ANCIENT_DEBRIS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.ancient_debris.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ANCIENT_DEBRIS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.ancient_debris.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ANCIENT_DEBRIS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.ancient_debris.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ANVIL_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.anvil.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ANVIL_DESTROY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.anvil.destroy"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ANVIL_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.anvil.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ANVIL_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.anvil.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ANVIL_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.anvil.land"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ANVIL_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.anvil.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ANVIL_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.anvil.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ANVIL_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.anvil.use"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMADILLO_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.armadillo.eat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMADILLO_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.armadillo.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMADILLO_HURT_REDUCED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.armadillo.hurt_reduced"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMADILLO_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.armadillo.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMADILLO_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.armadillo.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMADILLO_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.armadillo.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMADILLO_ROLL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.armadillo.roll"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMADILLO_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.armadillo.land"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMADILLO_SCUTE_DROP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.armadillo.scute_drop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMADILLO_UNROLL_FINISH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.armadillo.unroll_finish"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMADILLO_PEEK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.armadillo.peek"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMADILLO_UNROLL_START  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.armadillo.unroll_start"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMADILLO_BRUSH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.armadillo.brush"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMOR_EQUIP_CHAIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.armor.equip_chain"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMOR_EQUIP_DIAMOND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.armor.equip_diamond"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMOR_EQUIP_ELYTRA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.armor.equip_elytra"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMOR_EQUIP_GENERIC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.armor.equip_generic"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMOR_EQUIP_GOLD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.armor.equip_gold"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMOR_EQUIP_IRON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.armor.equip_iron"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMOR_EQUIP_LEATHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.armor.equip_leather"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMOR_EQUIP_NETHERITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.armor.equip_netherite"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMOR_EQUIP_TURTLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.armor.equip_turtle"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMOR_EQUIP_WOLF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.armor.equip_wolf"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMOR_UNEQUIP_WOLF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.armor.unequip_wolf"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMOR_STAND_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.armor_stand.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMOR_STAND_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.armor_stand.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMOR_STAND_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.armor_stand.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARMOR_STAND_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.armor_stand.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARROW_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.arrow.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARROW_HIT_PLAYER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.arrow.hit_player"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ARROW_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.arrow.shoot"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AXE_STRIP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.axe.strip"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AXE_SCRAPE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.axe.scrape"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AXE_WAX_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.axe.wax_off"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AXOLOTL_ATTACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.axolotl.attack"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AXOLOTL_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.axolotl.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AXOLOTL_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.axolotl.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AXOLOTL_IDLE_AIR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.axolotl.idle_air"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AXOLOTL_IDLE_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.axolotl.idle_water"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AXOLOTL_SPLASH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.axolotl.splash"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AXOLOTL_SWIM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.axolotl.swim"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AZALEA_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.azalea.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AZALEA_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.azalea.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AZALEA_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.azalea.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AZALEA_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.azalea.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AZALEA_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.azalea.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AZALEA_LEAVES_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.azalea_leaves.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AZALEA_LEAVES_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.azalea_leaves.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AZALEA_LEAVES_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.azalea_leaves.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AZALEA_LEAVES_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.azalea_leaves.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> AZALEA_LEAVES_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.azalea_leaves.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_SAPLING_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo_sapling.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_SAPLING_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo_sapling.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_SAPLING_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo_sapling.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_WOOD_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo_wood.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_WOOD_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo_wood.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_WOOD_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo_wood.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_WOOD_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo_wood.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_WOOD_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo_wood.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_WOOD_DOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo_wood_door.close"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_WOOD_DOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo_wood_door.open"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_WOOD_TRAPDOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo_wood_trapdoor.close"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_WOOD_TRAPDOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo_wood_trapdoor.open"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_WOOD_BUTTON_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo_wood_button.click_off"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_WOOD_BUTTON_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo_wood_button.click_on"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_WOOD_PRESSURE_PLATE_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo_wood_pressure_plate.click_off"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_WOOD_PRESSURE_PLATE_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo_wood_pressure_plate.click_on"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_WOOD_FENCE_GATE_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo_wood_fence_gate.close"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_WOOD_FENCE_GATE_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo_wood_fence_gate.open"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BARREL_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.barrel.close"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BARREL_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.barrel.open"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BASALT_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.basalt.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BASALT_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.basalt.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BASALT_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.basalt.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BASALT_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.basalt.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BASALT_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.basalt.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAT_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.bat.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAT_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.bat.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAT_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.bat.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAT_LOOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.bat.loop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAT_TAKEOFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.bat.takeoff"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BEACON_ACTIVATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.beacon.activate"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BEACON_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.beacon.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BEACON_DEACTIVATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.beacon.deactivate"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BEACON_POWER_SELECT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.beacon.power_select"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BEE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.bee.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BEE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.bee.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BEE_LOOP_AGGRESSIVE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.bee.loop_aggressive"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BEE_LOOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.bee.loop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BEE_STING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.bee.sting"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BEE_POLLINATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.bee.pollinate"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BEEHIVE_DRIP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.beehive.drip"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BEEHIVE_ENTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.beehive.enter"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BEEHIVE_EXIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.beehive.exit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BEEHIVE_SHEAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.beehive.shear"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BEEHIVE_WORK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.beehive.work"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BELL_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bell.use"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BELL_RESONATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bell.resonate"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BIG_DRIPLEAF_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.big_dripleaf.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BIG_DRIPLEAF_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.big_dripleaf.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BIG_DRIPLEAF_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.big_dripleaf.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BIG_DRIPLEAF_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.big_dripleaf.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BIG_DRIPLEAF_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.big_dripleaf.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BLAZE_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.blaze.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BLAZE_BURN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.blaze.burn"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BLAZE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.blaze.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BLAZE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.blaze.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BLAZE_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.blaze.shoot"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BOAT_PADDLE_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.boat.paddle_land"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BOAT_PADDLE_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.boat.paddle_water"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BOGGED_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.bogged.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BOGGED_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.bogged.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BOGGED_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.bogged.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BOGGED_SHEAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.bogged.shear"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BOGGED_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.bogged.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BONE_BLOCK_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bone_block.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BONE_BLOCK_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bone_block.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BONE_BLOCK_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bone_block.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BONE_BLOCK_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bone_block.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BONE_BLOCK_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bone_block.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BONE_MEAL_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.bone_meal.use"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BOOK_PAGE_TURN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.book.page_turn"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BOOK_PUT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.book.put"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BLASTFURNACE_FIRE_CRACKLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.blastfurnace.fire_crackle"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BOTTLE_EMPTY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.bottle.empty"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BOTTLE_FILL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.bottle.fill"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BOTTLE_FILL_DRAGONBREATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.bottle.fill_dragonbreath"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BREEZE_CHARGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.breeze.charge"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BREEZE_DEFLECT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.breeze.deflect"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BREEZE_INHALE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.breeze.inhale"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BREEZE_IDLE_GROUND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.breeze.idle_ground"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BREEZE_IDLE_AIR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.breeze.idle_air"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BREEZE_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.breeze.shoot"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BREEZE_JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.breeze.jump"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BREEZE_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.breeze.land"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BREEZE_SLIDE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.breeze.slide"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BREEZE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.breeze.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BREEZE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.breeze.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BREEZE_WHIRL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.breeze.whirl"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BREEZE_WIND_CHARGE_BURST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.breeze.wind_burst"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BREWING_STAND_BREW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.brewing_stand.brew"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BRUSH_GENERIC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.brush.brushing.generic"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BRUSH_SAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.brush.brushing.sand"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BRUSH_GRAVEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.brush.brushing.gravel"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BRUSH_SAND_COMPLETED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.brush.brushing.sand.complete"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BRUSH_GRAVEL_COMPLETED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.brush.brushing.gravel.complete"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BUBBLE_COLUMN_BUBBLE_POP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bubble_column.bubble_pop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BUBBLE_COLUMN_UPWARDS_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bubble_column.upwards_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BUBBLE_COLUMN_UPWARDS_INSIDE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bubble_column.upwards_inside"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BUBBLE_COLUMN_WHIRLPOOL_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bubble_column.whirlpool_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BUBBLE_COLUMN_WHIRLPOOL_INSIDE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bubble_column.whirlpool_inside"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BUCKET_EMPTY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.bucket.empty"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BUCKET_EMPTY_AXOLOTL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.bucket.empty_axolotl"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BUCKET_EMPTY_FISH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.bucket.empty_fish"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BUCKET_EMPTY_LAVA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.bucket.empty_lava"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BUCKET_EMPTY_POWDER_SNOW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.bucket.empty_powder_snow"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BUCKET_EMPTY_TADPOLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.bucket.empty_tadpole"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BUCKET_FILL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.bucket.fill"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BUCKET_FILL_AXOLOTL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.bucket.fill_axolotl"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BUCKET_FILL_FISH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.bucket.fill_fish"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BUCKET_FILL_LAVA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.bucket.fill_lava"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BUCKET_FILL_POWDER_SNOW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.bucket.fill_powder_snow"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BUCKET_FILL_TADPOLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.bucket.fill_tadpole"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BUNDLE_DROP_CONTENTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.bundle.drop_contents"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BUNDLE_INSERT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.bundle.insert"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BUNDLE_REMOVE_ONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.bundle.remove_one"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAKE_ADD_CANDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cake.add_candle"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CALCITE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.calcite.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CALCITE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.calcite.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CALCITE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.calcite.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CALCITE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.calcite.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CALCITE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.calcite.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAMEL_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.camel.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAMEL_DASH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.camel.dash"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAMEL_DASH_READY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.camel.dash_ready"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAMEL_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.camel.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAMEL_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.camel.eat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAMEL_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.camel.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAMEL_SADDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.camel.saddle"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAMEL_SIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.camel.sit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAMEL_STAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.camel.stand"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAMEL_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.camel.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAMEL_STEP_SAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.camel.step_sand"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAMPFIRE_CRACKLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.campfire.crackle"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CANDLE_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.candle.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CANDLE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.candle.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CANDLE_EXTINGUISH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.candle.extinguish"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CANDLE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.candle.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CANDLE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.candle.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CANDLE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.candle.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CANDLE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.candle.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAT_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.cat.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAT_STRAY_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.cat.stray_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAT_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.cat.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAT_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.cat.eat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAT_HISS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.cat.hiss"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAT_BEG_FOR_FOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.cat.beg_for_food"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAT_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.cat.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAT_PURR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.cat.purr"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAT_PURREOW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.cat.purreow"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAVE_VINES_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cave_vines.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAVE_VINES_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cave_vines.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAVE_VINES_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cave_vines.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAVE_VINES_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cave_vines.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAVE_VINES_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cave_vines.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CAVE_VINES_PICK_BERRIES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cave_vines.pick_berries"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHAIN_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.chain.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHAIN_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.chain.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHAIN_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.chain.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHAIN_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.chain.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHAIN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.chain.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_WOOD_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_wood.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_WOOD_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_wood.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_WOOD_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_wood.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_WOOD_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_wood.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_WOOD_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_wood.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_SAPLING_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_sapling.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_SAPLING_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_sapling.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_SAPLING_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_sapling.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_SAPLING_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_sapling.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_SAPLING_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_sapling.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_LEAVES_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_leaves.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_LEAVES_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_leaves.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_LEAVES_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_leaves.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_LEAVES_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_leaves.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_LEAVES_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_leaves.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_WOOD_HANGING_SIGN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_wood_hanging_sign.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_WOOD_HANGING_SIGN_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_wood_hanging_sign.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_WOOD_HANGING_SIGN_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_wood_hanging_sign.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_WOOD_HANGING_SIGN_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_wood_hanging_sign.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_WOOD_HANGING_SIGN_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_wood_hanging_sign.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_WOOD_DOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_wood_door.close"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_WOOD_DOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_wood_door.open"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_WOOD_TRAPDOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_wood_trapdoor.close"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_WOOD_TRAPDOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_wood_trapdoor.open"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_WOOD_BUTTON_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_wood_button.click_off"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_WOOD_BUTTON_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_wood_button.click_on"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_WOOD_PRESSURE_PLATE_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_wood_pressure_plate.click_off"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_WOOD_PRESSURE_PLATE_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_wood_pressure_plate.click_on"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_WOOD_FENCE_GATE_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_wood_fence_gate.close"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHERRY_WOOD_FENCE_GATE_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cherry_wood_fence_gate.open"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHEST_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.chest.close"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHEST_LOCKED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.chest.locked"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHEST_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.chest.open"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHICKEN_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.chicken.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHICKEN_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.chicken.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHICKEN_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.chicken.egg"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHICKEN_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.chicken.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHICKEN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.chicken.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHISELED_BOOKSHELF_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.chiseled_bookshelf.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHISELED_BOOKSHELF_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.chiseled_bookshelf.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHISELED_BOOKSHELF_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.chiseled_bookshelf.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHISELED_BOOKSHELF_INSERT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.chiseled_bookshelf.insert"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHISELED_BOOKSHELF_INSERT_ENCHANTED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.chiseled_bookshelf.insert.enchanted"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHISELED_BOOKSHELF_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.chiseled_bookshelf.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHISELED_BOOKSHELF_PICKUP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.chiseled_bookshelf.pickup"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHISELED_BOOKSHELF_PICKUP_ENCHANTED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.chiseled_bookshelf.pickup.enchanted"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHISELED_BOOKSHELF_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.chiseled_bookshelf.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHORUS_FLOWER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.chorus_flower.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHORUS_FLOWER_GROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.chorus_flower.grow"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CHORUS_FRUIT_TELEPORT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.chorus_fruit.teleport"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COBWEB_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cobweb.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COBWEB_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cobweb.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COBWEB_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cobweb.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COBWEB_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cobweb.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COBWEB_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.cobweb.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COD_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.cod.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COD_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.cod.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COD_FLOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.cod.flop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COD_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.cod.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COMPARATOR_CLICK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.comparator.click"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COMPOSTER_EMPTY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.composter.empty"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COMPOSTER_FILL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.composter.fill"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COMPOSTER_FILL_SUCCESS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.composter.fill_success"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COMPOSTER_READY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.composter.ready"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CONDUIT_ACTIVATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.conduit.activate"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CONDUIT_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.conduit.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CONDUIT_AMBIENT_SHORT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.conduit.ambient.short"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CONDUIT_ATTACK_TARGET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.conduit.attack.target"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CONDUIT_DEACTIVATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.conduit.deactivate"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COPPER_BULB_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.copper_bulb.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COPPER_BULB_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.copper_bulb.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COPPER_BULB_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.copper_bulb.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COPPER_BULB_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.copper_bulb.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COPPER_BULB_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.copper_bulb.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COPPER_BULB_TURN_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.copper_bulb.turn_on"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COPPER_BULB_TURN_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.copper_bulb.turn_off"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COPPER_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.copper.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COPPER_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.copper.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COPPER_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.copper.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COPPER_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.copper.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COPPER_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.copper.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COPPER_DOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.copper_door.close"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COPPER_DOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.copper_door.open"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COPPER_GRATE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.copper_grate.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COPPER_GRATE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.copper_grate.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COPPER_GRATE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.copper_grate.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COPPER_GRATE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.copper_grate.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COPPER_GRATE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.copper_grate.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COPPER_TRAPDOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.copper_trapdoor.close"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COPPER_TRAPDOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.copper_trapdoor.open"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CORAL_BLOCK_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.coral_block.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CORAL_BLOCK_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.coral_block.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CORAL_BLOCK_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.coral_block.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CORAL_BLOCK_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.coral_block.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CORAL_BLOCK_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.coral_block.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COW_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.cow.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COW_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.cow.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COW_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.cow.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COW_MILK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.cow.milk"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> COW_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.cow.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CRAFTER_CRAFT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.crafter.craft"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CRAFTER_FAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.crafter.fail"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CREEPER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.creeper.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CREEPER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.creeper.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CREEPER_PRIMED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.creeper.primed"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CROP_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.crop.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CROP_PLANTED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.crop.plant"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CROSSBOW_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.crossbow.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CROSSBOW_LOADING_END  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.crossbow.loading_end"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CROSSBOW_LOADING_MIDDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.crossbow.loading_middle"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CROSSBOW_LOADING_START  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.crossbow.loading_start"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CROSSBOW_QUICK_CHARGE_1  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.crossbow.quick_charge_1"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CROSSBOW_QUICK_CHARGE_2  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.crossbow.quick_charge_2"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CROSSBOW_QUICK_CHARGE_3  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.crossbow.quick_charge_3"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> CROSSBOW_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.crossbow.shoot"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DECORATED_POT_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.decorated_pot.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DECORATED_POT_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.decorated_pot.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DECORATED_POT_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.decorated_pot.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DECORATED_POT_INSERT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.decorated_pot.insert"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DECORATED_POT_INSERT_FAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.decorated_pot.insert_fail"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DECORATED_POT_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.decorated_pot.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DECORATED_POT_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.decorated_pot.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DECORATED_POT_SHATTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.decorated_pot.shatter"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DEEPSLATE_BRICKS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.deepslate_bricks.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DEEPSLATE_BRICKS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.deepslate_bricks.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DEEPSLATE_BRICKS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.deepslate_bricks.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DEEPSLATE_BRICKS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.deepslate_bricks.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DEEPSLATE_BRICKS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.deepslate_bricks.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DEEPSLATE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.deepslate.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DEEPSLATE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.deepslate.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DEEPSLATE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.deepslate.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DEEPSLATE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.deepslate.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DEEPSLATE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.deepslate.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DEEPSLATE_TILES_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.deepslate_tiles.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DEEPSLATE_TILES_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.deepslate_tiles.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DEEPSLATE_TILES_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.deepslate_tiles.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DEEPSLATE_TILES_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.deepslate_tiles.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DEEPSLATE_TILES_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.deepslate_tiles.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DISPENSER_DISPENSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.dispenser.dispense"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DISPENSER_FAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.dispenser.fail"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DISPENSER_LAUNCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.dispenser.launch"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DOLPHIN_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.dolphin.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DOLPHIN_AMBIENT_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.dolphin.ambient_water"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DOLPHIN_ATTACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.dolphin.attack"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DOLPHIN_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.dolphin.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DOLPHIN_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.dolphin.eat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DOLPHIN_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.dolphin.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DOLPHIN_JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.dolphin.jump"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DOLPHIN_PLAY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.dolphin.play"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DOLPHIN_SPLASH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.dolphin.splash"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DOLPHIN_SWIM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.dolphin.swim"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DONKEY_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.donkey.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DONKEY_ANGRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.donkey.angry"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DONKEY_CHEST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.donkey.chest"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DONKEY_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.donkey.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DONKEY_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.donkey.eat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DONKEY_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.donkey.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DONKEY_JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.donkey.jump"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DRIPSTONE_BLOCK_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.dripstone_block.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DRIPSTONE_BLOCK_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.dripstone_block.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DRIPSTONE_BLOCK_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.dripstone_block.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DRIPSTONE_BLOCK_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.dripstone_block.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DRIPSTONE_BLOCK_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.dripstone_block.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POINTED_DRIPSTONE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.pointed_dripstone.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POINTED_DRIPSTONE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.pointed_dripstone.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POINTED_DRIPSTONE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.pointed_dripstone.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POINTED_DRIPSTONE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.pointed_dripstone.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POINTED_DRIPSTONE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.pointed_dripstone.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POINTED_DRIPSTONE_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.pointed_dripstone.land"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POINTED_DRIPSTONE_DRIP_LAVA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.pointed_dripstone.drip_lava"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POINTED_DRIPSTONE_DRIP_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.pointed_dripstone.drip_water"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POINTED_DRIPSTONE_DRIP_LAVA_INTO_CAULDRON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.pointed_dripstone.drip_lava_into_cauldron"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POINTED_DRIPSTONE_DRIP_WATER_INTO_CAULDRON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.pointed_dripstone.drip_water_into_cauldron"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BIG_DRIPLEAF_TILT_DOWN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.big_dripleaf.tilt_down"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BIG_DRIPLEAF_TILT_UP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.big_dripleaf.tilt_up"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DROWNED_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.drowned.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DROWNED_AMBIENT_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.drowned.ambient_water"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DROWNED_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.drowned.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DROWNED_DEATH_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.drowned.death_water"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DROWNED_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.drowned.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DROWNED_HURT_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.drowned.hurt_water"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DROWNED_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.drowned.shoot"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DROWNED_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.drowned.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DROWNED_SWIM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.drowned.swim"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DYE_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.dye.use"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> EGG_THROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.egg.throw"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ELDER_GUARDIAN_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.elder_guardian.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ELDER_GUARDIAN_AMBIENT_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.elder_guardian.ambient_land"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ELDER_GUARDIAN_CURSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.elder_guardian.curse"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ELDER_GUARDIAN_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.elder_guardian.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ELDER_GUARDIAN_DEATH_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.elder_guardian.death_land"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ELDER_GUARDIAN_FLOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.elder_guardian.flop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ELDER_GUARDIAN_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.elder_guardian.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ELDER_GUARDIAN_HURT_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.elder_guardian.hurt_land"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ELYTRA_FLYING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.elytra.flying"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ENCHANTMENT_TABLE_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.enchantment_table.use"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ENDER_CHEST_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.ender_chest.close"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ENDER_CHEST_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.ender_chest.open"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ENDER_DRAGON_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ender_dragon.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ENDER_DRAGON_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ender_dragon.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> DRAGON_FIREBALL_EXPLODE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.dragon_fireball.explode"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ENDER_DRAGON_FLAP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ender_dragon.flap"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ENDER_DRAGON_GROWL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ender_dragon.growl"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ENDER_DRAGON_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ender_dragon.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ENDER_DRAGON_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ender_dragon.shoot"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ENDER_EYE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ender_eye.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ENDER_EYE_LAUNCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ender_eye.launch"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ENDERMAN_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.enderman.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ENDERMAN_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.enderman.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ENDERMAN_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.enderman.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ENDERMAN_SCREAM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.enderman.scream"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ENDERMAN_STARE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.enderman.stare"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ENDERMAN_TELEPORT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.enderman.teleport"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ENDERMITE_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.endermite.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ENDERMITE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.endermite.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ENDERMITE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.endermite.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ENDERMITE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.endermite.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ENDER_PEARL_THROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ender_pearl.throw"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> END_GATEWAY_SPAWN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.end_gateway.spawn"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> END_PORTAL_FRAME_FILL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.end_portal_frame.fill"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> END_PORTAL_SPAWN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.end_portal.spawn"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> EVOKER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.evoker.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> EVOKER_CAST_SPELL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.evoker.cast_spell"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> EVOKER_CELEBRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.evoker.celebrate"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> EVOKER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.evoker.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> EVOKER_FANGS_ATTACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.evoker_fangs.attack"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> EVOKER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.evoker.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> EVOKER_PREPARE_ATTACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.evoker.prepare_attack"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> EVOKER_PREPARE_SUMMON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.evoker.prepare_summon"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> EVOKER_PREPARE_WOLOLO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.evoker.prepare_wololo"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> EXPERIENCE_BOTTLE_THROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.experience_bottle.throw"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> EXPERIENCE_ORB_PICKUP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.experience_orb.pickup"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FENCE_GATE_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.fence_gate.close"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FENCE_GATE_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.fence_gate.open"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FIRECHARGE_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.firecharge.use"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FIREWORK_ROCKET_BLAST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.firework_rocket.blast"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FIREWORK_ROCKET_BLAST_FAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.firework_rocket.blast_far"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FIREWORK_ROCKET_LARGE_BLAST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.firework_rocket.large_blast"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FIREWORK_ROCKET_LARGE_BLAST_FAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.firework_rocket.large_blast_far"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FIREWORK_ROCKET_LAUNCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.firework_rocket.launch"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FIREWORK_ROCKET_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.firework_rocket.shoot"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FIREWORK_ROCKET_TWINKLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.firework_rocket.twinkle"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FIREWORK_ROCKET_TWINKLE_FAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.firework_rocket.twinkle_far"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FIRE_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.fire.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FIRE_EXTINGUISH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.fire.extinguish"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FISH_SWIM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.fish.swim"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FISHING_BOBBER_RETRIEVE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.fishing_bobber.retrieve"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FISHING_BOBBER_SPLASH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.fishing_bobber.splash"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FISHING_BOBBER_THROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.fishing_bobber.throw"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FLINTANDSTEEL_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.flintandsteel.use"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FLOWERING_AZALEA_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.flowering_azalea.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FLOWERING_AZALEA_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.flowering_azalea.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FLOWERING_AZALEA_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.flowering_azalea.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FLOWERING_AZALEA_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.flowering_azalea.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FLOWERING_AZALEA_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.flowering_azalea.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FOX_AGGRO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.fox.aggro"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FOX_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.fox.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FOX_BITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.fox.bite"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FOX_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.fox.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FOX_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.fox.eat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FOX_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.fox.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FOX_SCREECH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.fox.screech"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FOX_SLEEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.fox.sleep"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FOX_SNIFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.fox.sniff"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FOX_SPIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.fox.spit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FOX_TELEPORT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.fox.teleport"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SUSPICIOUS_SAND_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.suspicious_sand.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SUSPICIOUS_SAND_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.suspicious_sand.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SUSPICIOUS_SAND_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.suspicious_sand.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SUSPICIOUS_SAND_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.suspicious_sand.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SUSPICIOUS_SAND_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.suspicious_sand.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SUSPICIOUS_GRAVEL_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.suspicious_gravel.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SUSPICIOUS_GRAVEL_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.suspicious_gravel.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SUSPICIOUS_GRAVEL_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.suspicious_gravel.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SUSPICIOUS_GRAVEL_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.suspicious_gravel.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SUSPICIOUS_GRAVEL_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.suspicious_gravel.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FROGLIGHT_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.froglight.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FROGLIGHT_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.froglight.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FROGLIGHT_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.froglight.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FROGLIGHT_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.froglight.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FROGLIGHT_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.froglight.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FROGSPAWNSTEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.frogspawn.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FROGSPAWN_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.frogspawn.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FROGSPAWN_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.frogspawn.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FROGSPAWN_HATCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.frogspawn.hatch"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FROGSPAWN_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.frogspawn.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FROGSPAWN_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.frogspawn.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FROG_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.frog.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FROG_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.frog.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FROG_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.frog.eat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FROG_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.frog.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FROG_LAY_SPAWN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.frog.lay_spawn"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FROG_LONG_JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.frog.long_jump"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FROG_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.frog.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FROG_TONGUE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.frog.tongue"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ROOTS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.roots.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ROOTS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.roots.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ROOTS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.roots.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ROOTS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.roots.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ROOTS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.roots.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FURNACE_FIRE_CRACKLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.furnace.fire_crackle"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GENERIC_BIG_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.generic.big_fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GENERIC_BURN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.generic.burn"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GENERIC_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.generic.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GENERIC_DRINK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.generic.drink"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GENERIC_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.generic.eat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GENERIC_EXPLODE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.generic.explode"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GENERIC_EXTINGUISH_FIRE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.generic.extinguish_fire"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GENERIC_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.generic.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GENERIC_SMALL_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.generic.small_fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GENERIC_SPLASH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.generic.splash"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GENERIC_SWIM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.generic.swim"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GHAST_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ghast.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GHAST_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ghast.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GHAST_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ghast.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GHAST_SCREAM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ghast.scream"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GHAST_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ghast.shoot"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GHAST_WARN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ghast.warn"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GILDED_BLACKSTONE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.gilded_blackstone.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GILDED_BLACKSTONE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.gilded_blackstone.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GILDED_BLACKSTONE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.gilded_blackstone.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GILDED_BLACKSTONE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.gilded_blackstone.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GILDED_BLACKSTONE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.gilded_blackstone.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GLASS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.glass.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GLASS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.glass.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GLASS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.glass.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GLASS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.glass.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GLASS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.glass.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GLOW_INK_SAC_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.glow_ink_sac.use"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GLOW_ITEM_FRAME_ADD_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.glow_item_frame.add_item"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GLOW_ITEM_FRAME_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.glow_item_frame.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GLOW_ITEM_FRAME_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.glow_item_frame.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GLOW_ITEM_FRAME_REMOVE_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.glow_item_frame.remove_item"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GLOW_ITEM_FRAME_ROTATE_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.glow_item_frame.rotate_item"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GLOW_SQUID_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.glow_squid.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GLOW_SQUID_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.glow_squid.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GLOW_SQUID_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.glow_squid.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GLOW_SQUID_SQUIRT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.glow_squid.squirt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GOAT_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.goat.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GOAT_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.goat.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GOAT_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.goat.eat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GOAT_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.goat.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GOAT_LONG_JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.goat.long_jump"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GOAT_MILK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.goat.milk"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GOAT_PREPARE_RAM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.goat.prepare_ram"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GOAT_RAM_IMPACT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.goat.ram_impact"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GOAT_HORN_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.goat.horn_break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GOAT_HORN_PLAY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.goat_horn.play"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GOAT_SCREAMING_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.goat.screaming.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GOAT_SCREAMING_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.goat.screaming.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GOAT_SCREAMING_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.goat.screaming.eat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GOAT_SCREAMING_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.goat.screaming.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GOAT_SCREAMING_LONG_JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.goat.screaming.long_jump"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GOAT_SCREAMING_MILK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.goat.screaming.milk"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GOAT_SCREAMING_PREPARE_RAM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.goat.screaming.prepare_ram"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GOAT_SCREAMING_RAM_IMPACT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.goat.screaming.ram_impact"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GOAT_SCREAMING_HORN_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.goat.screaming.horn_break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GOAT_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.goat.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GRASS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.grass.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GRASS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.grass.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GRASS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.grass.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GRASS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.grass.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GRASS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.grass.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GRAVEL_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.gravel.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GRAVEL_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.gravel.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GRAVEL_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.gravel.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GRAVEL_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.gravel.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GRAVEL_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.gravel.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GRINDSTONE_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.grindstone.use"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GROWING_PLANT_CROP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.growing_plant.crop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GUARDIAN_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.guardian.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GUARDIAN_AMBIENT_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.guardian.ambient_land"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GUARDIAN_ATTACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.guardian.attack"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GUARDIAN_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.guardian.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GUARDIAN_DEATH_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.guardian.death_land"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GUARDIAN_FLOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.guardian.flop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GUARDIAN_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.guardian.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> GUARDIAN_HURT_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.guardian.hurt_land"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HANGING_ROOTS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.hanging_roots.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HANGING_ROOTS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.hanging_roots.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HANGING_ROOTS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.hanging_roots.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HANGING_ROOTS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.hanging_roots.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HANGING_ROOTS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.hanging_roots.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HANGING_SIGN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.hanging_sign.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HANGING_SIGN_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.hanging_sign.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HANGING_SIGN_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.hanging_sign.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HANGING_SIGN_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.hanging_sign.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HANGING_SIGN_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.hanging_sign.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HEAVY_CORE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.heavy_core.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HEAVY_CORE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.heavy_core.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HEAVY_CORE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.heavy_core.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HEAVY_CORE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.heavy_core.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HEAVY_CORE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.heavy_core.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_WOOD_HANGING_SIGN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_wood_hanging_sign.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_WOOD_HANGING_SIGN_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_wood_hanging_sign.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_WOOD_HANGING_SIGN_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_wood_hanging_sign.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_WOOD_HANGING_SIGN_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_wood_hanging_sign.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_WOOD_HANGING_SIGN_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_wood_hanging_sign.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_WOOD_HANGING_SIGN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo_wood_hanging_sign.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_WOOD_HANGING_SIGN_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo_wood_hanging_sign.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_WOOD_HANGING_SIGN_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo_wood_hanging_sign.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_WOOD_HANGING_SIGN_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo_wood_hanging_sign.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> BAMBOO_WOOD_HANGING_SIGN_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.bamboo_wood_hanging_sign.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIAL_SPAWNER_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.trial_spawner.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIAL_SPAWNER_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.trial_spawner.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIAL_SPAWNER_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.trial_spawner.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIAL_SPAWNER_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.trial_spawner.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIAL_SPAWNER_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.trial_spawner.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIAL_SPAWNER_SPAWN_MOB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.trial_spawner.spawn_mob"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIAL_SPAWNER_ABOUT_TO_SPAWN_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.trial_spawner.about_to_spawn_item"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIAL_SPAWNER_SPAWN_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.trial_spawner.spawn_item"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIAL_SPAWNER_SPAWN_ITEM_BEGIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.trial_spawner.spawn_item_begin"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIAL_SPAWNER_DETECT_PLAYER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.trial_spawner.detect_player"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIAL_SPAWNER_OMINOUS_ACTIVATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.trial_spawner.ominous_activate"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIAL_SPAWNER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.trial_spawner.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIAL_SPAWNER_AMBIENT_OMINOUS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.trial_spawner.ambient_ominous"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIAL_SPAWNER_OPEN_SHUTTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.trial_spawner.open_shutter"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIAL_SPAWNER_CLOSE_SHUTTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.trial_spawner.close_shutter"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIAL_SPAWNER_EJECT_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.trial_spawner.eject_item"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HOE_TILL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.hoe.till"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HOGLIN_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.hoglin.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HOGLIN_ANGRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.hoglin.angry"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HOGLIN_ATTACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.hoglin.attack"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HOGLIN_CONVERTED_TO_ZOMBIFIED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.hoglin.converted_to_zombified"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HOGLIN_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.hoglin.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HOGLIN_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.hoglin.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HOGLIN_RETREAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.hoglin.retreat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HOGLIN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.hoglin.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HONEY_BLOCK_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.honey_block.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HONEY_BLOCK_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.honey_block.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HONEY_BLOCK_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.honey_block.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HONEY_BLOCK_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.honey_block.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HONEY_BLOCK_SLIDE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.honey_block.slide"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HONEY_BLOCK_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.honey_block.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HONEYCOMB_WAX_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.honeycomb.wax_on"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HONEY_DRINK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.honey_bottle.drink"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HORSE_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.horse.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HORSE_ANGRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.horse.angry"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HORSE_ARMOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.horse.armor"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HORSE_BREATHE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.horse.breathe"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HORSE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.horse.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HORSE_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.horse.eat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HORSE_GALLOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.horse.gallop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HORSE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.horse.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HORSE_JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.horse.jump"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HORSE_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.horse.land"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HORSE_SADDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.horse.saddle"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HORSE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.horse.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HORSE_STEP_WOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.horse.step_wood"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HOSTILE_BIG_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.hostile.big_fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HOSTILE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.hostile.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HOSTILE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.hostile.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HOSTILE_SMALL_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.hostile.small_fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HOSTILE_SPLASH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.hostile.splash"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HOSTILE_SWIM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.hostile.swim"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HUSK_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.husk.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HUSK_CONVERTED_TO_ZOMBIE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.husk.converted_to_zombie"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HUSK_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.husk.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HUSK_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.husk.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> HUSK_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.husk.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ILLUSIONER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.illusioner.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ILLUSIONER_CAST_SPELL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.illusioner.cast_spell"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ILLUSIONER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.illusioner.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ILLUSIONER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.illusioner.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ILLUSIONER_MIRROR_MOVE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.illusioner.mirror_move"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ILLUSIONER_PREPARE_BLINDNESS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.illusioner.prepare_blindness"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ILLUSIONER_PREPARE_MIRROR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.illusioner.prepare_mirror"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> INK_SAC_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.ink_sac.use"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> IRON_DOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.iron_door.close"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> IRON_DOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.iron_door.open"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> IRON_GOLEM_ATTACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.iron_golem.attack"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> IRON_GOLEM_DAMAGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.iron_golem.damage"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> IRON_GOLEM_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.iron_golem.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> IRON_GOLEM_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.iron_golem.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> IRON_GOLEM_REPAIR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.iron_golem.repair"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> IRON_GOLEM_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.iron_golem.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> IRON_TRAPDOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.iron_trapdoor.close"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> IRON_TRAPDOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.iron_trapdoor.open"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ITEM_FRAME_ADD_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.item_frame.add_item"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ITEM_FRAME_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.item_frame.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ITEM_FRAME_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.item_frame.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ITEM_FRAME_REMOVE_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.item_frame.remove_item"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ITEM_FRAME_ROTATE_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.item_frame.rotate_item"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ITEM_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.item.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ITEM_PICKUP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.item.pickup"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LADDER_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.ladder.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LADDER_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.ladder.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LADDER_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.ladder.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LADDER_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.ladder.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LADDER_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.ladder.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LANTERN_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.lantern.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LANTERN_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.lantern.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LANTERN_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.lantern.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LANTERN_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.lantern.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LANTERN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.lantern.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LARGE_AMETHYST_BUD_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.large_amethyst_bud.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LARGE_AMETHYST_BUD_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.large_amethyst_bud.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LAVA_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.lava.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LAVA_EXTINGUISH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.lava.extinguish"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LAVA_POP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.lava.pop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LEASH_KNOT_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.leash_knot.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LEASH_KNOT_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.leash_knot.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LEVER_CLICK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.lever.click"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LIGHTNING_BOLT_IMPACT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.lightning_bolt.impact"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LIGHTNING_BOLT_THUNDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.lightning_bolt.thunder"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LINGERING_POTION_THROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.lingering_potion.throw"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LLAMA_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.llama.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LLAMA_ANGRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.llama.angry"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LLAMA_CHEST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.llama.chest"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LLAMA_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.llama.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LLAMA_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.llama.eat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LLAMA_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.llama.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LLAMA_SPIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.llama.spit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LLAMA_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.llama.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LLAMA_SWAG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.llama.swag"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MAGMA_CUBE_DEATH_SMALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.magma_cube.death_small"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LODESTONE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.lodestone.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LODESTONE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.lodestone.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LODESTONE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.lodestone.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LODESTONE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.lodestone.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LODESTONE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.lodestone.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LODESTONE_COMPASS_LOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.lodestone_compass.lock"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MACE_SMASH_AIR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.mace.smash_air"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MACE_SMASH_GROUND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.mace.smash_ground"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MACE_SMASH_GROUND_HEAVY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.mace.smash_ground_heavy"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MAGMA_CUBE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.magma_cube.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MAGMA_CUBE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.magma_cube.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MAGMA_CUBE_HURT_SMALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.magma_cube.hurt_small"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MAGMA_CUBE_JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.magma_cube.jump"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MAGMA_CUBE_SQUISH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.magma_cube.squish"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MAGMA_CUBE_SQUISH_SMALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.magma_cube.squish_small"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MANGROVE_ROOTS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.mangrove_roots.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MANGROVE_ROOTS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.mangrove_roots.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MANGROVE_ROOTS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.mangrove_roots.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MANGROVE_ROOTS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.mangrove_roots.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MANGROVE_ROOTS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.mangrove_roots.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MEDIUM_AMETHYST_BUD_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.medium_amethyst_bud.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MEDIUM_AMETHYST_BUD_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.medium_amethyst_bud.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> METAL_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.metal.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> METAL_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.metal.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> METAL_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.metal.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> METAL_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.metal.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> METAL_PRESSURE_PLATE_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.metal_pressure_plate.click_off"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> METAL_PRESSURE_PLATE_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.metal_pressure_plate.click_on"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> METAL_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.metal.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MINECART_INSIDE_UNDERWATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.minecart.inside.underwater"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MINECART_INSIDE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.minecart.inside"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MINECART_RIDING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.minecart.riding"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MOOSHROOM_CONVERT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.mooshroom.convert"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MOOSHROOM_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.mooshroom.eat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MOOSHROOM_MILK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.mooshroom.milk"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MOOSHROOM_MILK_SUSPICIOUSLY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.mooshroom.suspicious_milk"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MOOSHROOM_SHEAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.mooshroom.shear"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MOSS_CARPET_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.moss_carpet.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MOSS_CARPET_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.moss_carpet.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MOSS_CARPET_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.moss_carpet.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MOSS_CARPET_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.moss_carpet.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MOSS_CARPET_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.moss_carpet.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PINK_PETALS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.pink_petals.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PINK_PETALS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.pink_petals.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PINK_PETALS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.pink_petals.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PINK_PETALS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.pink_petals.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PINK_PETALS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.pink_petals.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MOSS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.moss.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MOSS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.moss.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MOSS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.moss.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MOSS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.moss.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MOSS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.moss.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUD_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.mud.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUD_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.mud.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUD_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.mud.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUD_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.mud.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUD_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.mud.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUD_BRICKS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.mud_bricks.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUD_BRICKS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.mud_bricks.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUD_BRICKS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.mud_bricks.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUD_BRICKS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.mud_bricks.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUD_BRICKS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.mud_bricks.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUDDY_MANGROVE_ROOTS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.muddy_mangrove_roots.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUDDY_MANGROVE_ROOTS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.muddy_mangrove_roots.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUDDY_MANGROVE_ROOTS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.muddy_mangrove_roots.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUDDY_MANGROVE_ROOTS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.muddy_mangrove_roots.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUDDY_MANGROVE_ROOTS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.muddy_mangrove_roots.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MULE_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.mule.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MULE_ANGRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.mule.angry"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MULE_CHEST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.mule.chest"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MULE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.mule.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MULE_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.mule.eat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MULE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.mule.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MULE_JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.mule.jump"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_CREATIVE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.creative"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_CREDITS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.credits"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_DISC_5  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.5"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_DISC_11  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.11"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_DISC_13  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.13"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_DISC_BLOCKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.blocks"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_DISC_CAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.cat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_DISC_CHIRP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.chirp"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_DISC_FAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.far"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_DISC_MALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.mall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_DISC_MELLOHI  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.mellohi"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_DISC_PIGSTEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.pigstep"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_DISC_STAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.stal"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_DISC_STRAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.strad"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_DISC_WAIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.wait"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_DISC_WARD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.ward"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_DISC_OTHERSIDE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.otherside"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_DISC_RELIC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.relic"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_DISC_CREATOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.creator"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_DISC_CREATOR_MUSIC_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.creator_music_box"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_DISC_PRECIPICE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music_disc.precipice"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_DRAGON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.dragon"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_END  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.end"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_GAME  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.game"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_MENU  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.menu"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_BASALT_DELTAS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.nether.basalt_deltas"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_CRIMSON_FOREST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.nether.crimson_forest"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_DEEP_DARK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.deep_dark"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_DRIPSTONE_CAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.dripstone_caves"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_GROVE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.grove"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_JAGGED_PEAKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.jagged_peaks"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_LUSH_CAVES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.lush_caves"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_SWAMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.swamp"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_FOREST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.forest"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_OLD_GROWTH_TAIGA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.old_growth_taiga"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_MEADOW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.meadow"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_CHERRY_GROVE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.cherry_grove"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_NETHER_WASTES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.nether.nether_wastes"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_FROZEN_PEAKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.frozen_peaks"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_SNOWY_SLOPES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.snowy_slopes"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_SOUL_SAND_VALLEY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.nether.soul_sand_valley"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_STONY_PEAKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.stony_peaks"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_WARPED_FOREST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.nether.warped_forest"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_FLOWER_FOREST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.flower_forest"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_DESERT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.desert"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_BADLANDS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.badlands"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_JUNGLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.jungle"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_SPARSE_JUNGLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.sparse_jungle"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_BIOME_BAMBOO_JUNGLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.overworld.bamboo_jungle"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> MUSIC_UNDER_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "music.under_water"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_BRICKS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_bricks.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_BRICKS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_bricks.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_BRICKS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_bricks.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_BRICKS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_bricks.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_BRICKS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_bricks.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_WART_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_wart.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_WART_PLANTED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.nether_wart.plant"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_WOOD_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_wood.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_WOOD_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_wood.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_WOOD_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_wood.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_WOOD_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_wood.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_WOOD_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_wood.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_WOOD_DOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_wood_door.close"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_WOOD_DOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_wood_door.open"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_WOOD_TRAPDOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_wood_trapdoor.close"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_WOOD_TRAPDOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_wood_trapdoor.open"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_WOOD_BUTTON_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_wood_button.click_off"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_WOOD_BUTTON_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_wood_button.click_on"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_WOOD_PRESSURE_PLATE_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_wood_pressure_plate.click_off"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_WOOD_PRESSURE_PLATE_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_wood_pressure_plate.click_on"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_WOOD_FENCE_GATE_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_wood_fence_gate.close"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_WOOD_FENCE_GATE_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_wood_fence_gate.open"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> EMPTY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "intentionally_empty"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PACKED_MUD_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.packed_mud.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PACKED_MUD_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.packed_mud.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PACKED_MUD_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.packed_mud.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PACKED_MUD_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.packed_mud.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PACKED_MUD_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.packed_mud.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STEM_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.stem.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STEM_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.stem.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STEM_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.stem.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STEM_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.stem.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STEM_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.stem.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NYLIUM_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nylium.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NYLIUM_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nylium.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NYLIUM_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nylium.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NYLIUM_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nylium.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NYLIUM_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nylium.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_SPROUTS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_sprouts.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_SPROUTS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_sprouts.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_SPROUTS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_sprouts.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_SPROUTS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_sprouts.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_SPROUTS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_sprouts.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FUNGUS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.fungus.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FUNGUS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.fungus.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FUNGUS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.fungus.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FUNGUS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.fungus.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> FUNGUS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.fungus.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WEEPING_VINES_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.weeping_vines.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WEEPING_VINES_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.weeping_vines.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WEEPING_VINES_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.weeping_vines.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WEEPING_VINES_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.weeping_vines.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WEEPING_VINES_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.weeping_vines.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WART_BLOCK_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wart_block.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WART_BLOCK_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wart_block.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WART_BLOCK_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wart_block.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WART_BLOCK_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wart_block.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WART_BLOCK_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wart_block.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHERITE_BLOCK_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.netherite_block.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHERITE_BLOCK_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.netherite_block.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHERITE_BLOCK_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.netherite_block.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHERITE_BLOCK_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.netherite_block.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHERITE_BLOCK_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.netherite_block.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHERRACK_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.netherrack.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHERRACK_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.netherrack.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHERRACK_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.netherrack.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHERRACK_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.netherrack.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHERRACK_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.netherrack.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NOTE_BLOCK_BASEDRUM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.basedrum"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NOTE_BLOCK_BASS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.bass"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NOTE_BLOCK_BELL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.bell"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NOTE_BLOCK_CHIME  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.chime"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NOTE_BLOCK_FLUTE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.flute"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NOTE_BLOCK_GUITAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.guitar"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NOTE_BLOCK_HARP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.harp"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NOTE_BLOCK_HAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.hat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NOTE_BLOCK_PLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.pling"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NOTE_BLOCK_SNARE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.snare"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NOTE_BLOCK_XYLOPHONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.xylophone"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NOTE_BLOCK_IRON_XYLOPHONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.iron_xylophone"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NOTE_BLOCK_COW_BELL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.cow_bell"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NOTE_BLOCK_DIDGERIDOO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.didgeridoo"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NOTE_BLOCK_BIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.bit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NOTE_BLOCK_BANJO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.banjo"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NOTE_BLOCK_IMITATE_ZOMBIE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.imitate.zombie"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NOTE_BLOCK_IMITATE_SKELETON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.imitate.skeleton"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NOTE_BLOCK_IMITATE_CREEPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.imitate.creeper"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NOTE_BLOCK_IMITATE_ENDER_DRAGON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.imitate.ender_dragon"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NOTE_BLOCK_IMITATE_WITHER_SKELETON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.imitate.wither_skeleton"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NOTE_BLOCK_IMITATE_PIGLIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.note_block.imitate.piglin"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> OCELOT_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ocelot.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> OCELOT_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ocelot.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> OCELOT_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ocelot.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> OMINOUS_BOTTLE_DISPOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.ominous_bottle.dispose"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PAINTING_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.painting.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PAINTING_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.painting.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PANDA_PRE_SNEEZE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.panda.pre_sneeze"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PANDA_SNEEZE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.panda.sneeze"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PANDA_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.panda.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PANDA_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.panda.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PANDA_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.panda.eat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PANDA_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.panda.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PANDA_CANT_BREED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.panda.cant_breed"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PANDA_AGGRESSIVE_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.panda.aggressive_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PANDA_WORRIED_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.panda.worried_ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PANDA_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.panda.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PANDA_BITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.panda.bite"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.eat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_FLY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.fly"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_BLAZE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.blaze"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_BOGGED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.bogged"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_BREEZE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.breeze"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_CREEPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.creeper"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_DROWNED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.drowned"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_ELDER_GUARDIAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.elder_guardian"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_ENDER_DRAGON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.ender_dragon"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_ENDERMITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.endermite"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_EVOKER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.evoker"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_GHAST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.ghast"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_GUARDIAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.guardian"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_HOGLIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.hoglin"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_HUSK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.husk"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_ILLUSIONER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.illusioner"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_MAGMA_CUBE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.magma_cube"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_PHANTOM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.phantom"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_PIGLIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.piglin"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_PIGLIN_BRUTE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.piglin_brute"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_PILLAGER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.pillager"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_RAVAGER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.ravager"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_SHULKER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.shulker"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_SILVERFISH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.silverfish"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_SKELETON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.skeleton"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_SLIME  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.slime"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_SPIDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.spider"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_STRAY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.stray"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_VEX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.vex"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_VINDICATOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.vindicator"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_WARDEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.warden"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_WITCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.witch"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_WITHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.wither"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_WITHER_SKELETON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.wither_skeleton"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_ZOGLIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.zoglin"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_ZOMBIE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.zombie"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_IMITATE_ZOMBIE_VILLAGER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.imitate.zombie_villager"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PARROT_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.parrot.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PHANTOM_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.phantom.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PHANTOM_BITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.phantom.bite"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PHANTOM_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.phantom.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PHANTOM_FLAP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.phantom.flap"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PHANTOM_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.phantom.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PHANTOM_SWOOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.phantom.swoop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PIG_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.pig.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PIG_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.pig.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PIG_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.pig.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PIG_SADDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.pig.saddle"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PIG_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.pig.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PIGLIN_ADMIRING_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.piglin.admiring_item"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PIGLIN_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.piglin.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PIGLIN_ANGRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.piglin.angry"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PIGLIN_CELEBRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.piglin.celebrate"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PIGLIN_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.piglin.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PIGLIN_JEALOUS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.piglin.jealous"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PIGLIN_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.piglin.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PIGLIN_RETREAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.piglin.retreat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PIGLIN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.piglin.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PIGLIN_CONVERTED_TO_ZOMBIFIED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.piglin.converted_to_zombified"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PIGLIN_BRUTE_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.piglin_brute.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PIGLIN_BRUTE_ANGRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.piglin_brute.angry"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PIGLIN_BRUTE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.piglin_brute.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PIGLIN_BRUTE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.piglin_brute.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PIGLIN_BRUTE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.piglin_brute.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PIGLIN_BRUTE_CONVERTED_TO_ZOMBIFIED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.piglin_brute.converted_to_zombified"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PILLAGER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.pillager.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PILLAGER_CELEBRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.pillager.celebrate"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PILLAGER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.pillager.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PILLAGER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.pillager.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PISTON_CONTRACT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.piston.contract"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PISTON_EXTEND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.piston.extend"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PLAYER_ATTACK_CRIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.player.attack.crit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PLAYER_ATTACK_KNOCKBACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.player.attack.knockback"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PLAYER_ATTACK_NODAMAGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.player.attack.nodamage"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PLAYER_ATTACK_STRONG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.player.attack.strong"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PLAYER_ATTACK_SWEEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.player.attack.sweep"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PLAYER_ATTACK_WEAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.player.attack.weak"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PLAYER_BIG_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.player.big_fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PLAYER_BREATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.player.breath"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PLAYER_BURP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.player.burp"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PLAYER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.player.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PLAYER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.player.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PLAYER_HURT_DROWN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.player.hurt_drown"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PLAYER_HURT_FREEZE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.player.hurt_freeze"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PLAYER_HURT_ON_FIRE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.player.hurt_on_fire"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PLAYER_HURT_SWEET_BERRY_BUSH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.player.hurt_sweet_berry_bush"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PLAYER_LEVELUP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.player.levelup"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PLAYER_SMALL_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.player.small_fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PLAYER_SPLASH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.player.splash"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PLAYER_SPLASH_HIGH_SPEED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.player.splash.high_speed"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PLAYER_SWIM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.player.swim"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PLAYER_TELEPORT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.player.teleport"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POLAR_BEAR_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.polar_bear.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POLAR_BEAR_AMBIENT_BABY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.polar_bear.ambient_baby"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POLAR_BEAR_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.polar_bear.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POLAR_BEAR_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.polar_bear.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POLAR_BEAR_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.polar_bear.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POLAR_BEAR_WARNING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.polar_bear.warning"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POLISHED_DEEPSLATE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.polished_deepslate.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POLISHED_DEEPSLATE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.polished_deepslate.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POLISHED_DEEPSLATE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.polished_deepslate.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POLISHED_DEEPSLATE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.polished_deepslate.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POLISHED_DEEPSLATE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.polished_deepslate.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PORTAL_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.portal.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PORTAL_TRAVEL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.portal.travel"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PORTAL_TRIGGER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.portal.trigger"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POWDER_SNOW_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.powder_snow.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POWDER_SNOW_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.powder_snow.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POWDER_SNOW_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.powder_snow.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POWDER_SNOW_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.powder_snow.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POWDER_SNOW_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.powder_snow.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PUFFER_FISH_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.puffer_fish.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PUFFER_FISH_BLOW_OUT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.puffer_fish.blow_out"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PUFFER_FISH_BLOW_UP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.puffer_fish.blow_up"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PUFFER_FISH_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.puffer_fish.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PUFFER_FISH_FLOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.puffer_fish.flop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PUFFER_FISH_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.puffer_fish.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PUFFER_FISH_STING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.puffer_fish.sting"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> PUMPKIN_CARVE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.pumpkin.carve"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> RABBIT_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.rabbit.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> RABBIT_ATTACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.rabbit.attack"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> RABBIT_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.rabbit.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> RABBIT_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.rabbit.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> RABBIT_JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.rabbit.jump"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> RAID_HORN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "event.raid.horn"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> RAVAGER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ravager.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> RAVAGER_ATTACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ravager.attack"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> RAVAGER_CELEBRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ravager.celebrate"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> RAVAGER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ravager.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> RAVAGER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ravager.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> RAVAGER_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ravager.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> RAVAGER_STUNNED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ravager.stunned"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> RAVAGER_ROAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.ravager.roar"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_GOLD_ORE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_gold_ore.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_GOLD_ORE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_gold_ore.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_GOLD_ORE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_gold_ore.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_GOLD_ORE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_gold_ore.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_GOLD_ORE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_gold_ore.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_ORE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_ore.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_ORE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_ore.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_ORE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_ore.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_ORE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_ore.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> NETHER_ORE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.nether_ore.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> REDSTONE_TORCH_BURNOUT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.redstone_torch.burnout"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> RESPAWN_ANCHOR_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.respawn_anchor.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> RESPAWN_ANCHOR_CHARGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.respawn_anchor.charge"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> RESPAWN_ANCHOR_DEPLETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.respawn_anchor.deplete"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> RESPAWN_ANCHOR_SET_SPAWN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.respawn_anchor.set_spawn"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ROOTED_DIRT_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.rooted_dirt.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ROOTED_DIRT_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.rooted_dirt.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ROOTED_DIRT_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.rooted_dirt.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ROOTED_DIRT_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.rooted_dirt.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ROOTED_DIRT_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.rooted_dirt.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SALMON_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.salmon.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SALMON_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.salmon.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SALMON_FLOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.salmon.flop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SALMON_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.salmon.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SAND_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sand.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SAND_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sand.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SAND_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sand.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SAND_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sand.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SAND_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sand.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCAFFOLDING_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.scaffolding.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCAFFOLDING_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.scaffolding.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCAFFOLDING_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.scaffolding.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCAFFOLDING_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.scaffolding.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCAFFOLDING_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.scaffolding.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_BLOCK_SPREAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk.spread"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_BLOCK_CHARGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk.charge"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_BLOCK_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_BLOCK_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_BLOCK_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_BLOCK_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_BLOCK_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_CATALYST_BLOOM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_catalyst.bloom"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_CATALYST_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_catalyst.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_CATALYST_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_catalyst.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_CATALYST_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_catalyst.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_CATALYST_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_catalyst.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_CATALYST_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_catalyst.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_CLICKING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_sensor.clicking"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_CLICKING_STOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_sensor.clicking_stop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_SENSOR_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_sensor.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_SENSOR_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_sensor.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_SENSOR_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_sensor.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_SENSOR_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_sensor.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_SENSOR_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_sensor.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_SHRIEKER_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_shrieker.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_SHRIEKER_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_shrieker.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_SHRIEKER_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_shrieker.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_SHRIEKER_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_shrieker.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_SHRIEKER_SHRIEK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_shrieker.shriek"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_SHRIEKER_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_shrieker.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_VEIN_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_vein.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_VEIN_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_vein.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_VEIN_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_vein.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_VEIN_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_vein.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SCULK_VEIN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sculk_vein.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHEEP_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.sheep.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHEEP_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.sheep.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHEEP_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.sheep.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHEEP_SHEAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.sheep.shear"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHEEP_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.sheep.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHIELD_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.shield.block"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHIELD_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.shield.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHROOMLIGHT_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.shroomlight.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHROOMLIGHT_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.shroomlight.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHROOMLIGHT_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.shroomlight.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHROOMLIGHT_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.shroomlight.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHROOMLIGHT_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.shroomlight.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHOVEL_FLATTEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.shovel.flatten"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHULKER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.shulker.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHULKER_BOX_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.shulker_box.close"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHULKER_BOX_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.shulker_box.open"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHULKER_BULLET_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.shulker_bullet.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHULKER_BULLET_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.shulker_bullet.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHULKER_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.shulker.close"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHULKER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.shulker.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHULKER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.shulker.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHULKER_HURT_CLOSED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.shulker.hurt_closed"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHULKER_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.shulker.open"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHULKER_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.shulker.shoot"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SHULKER_TELEPORT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.shulker.teleport"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SILVERFISH_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.silverfish.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SILVERFISH_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.silverfish.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SILVERFISH_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.silverfish.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SILVERFISH_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.silverfish.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SKELETON_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.skeleton.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SKELETON_CONVERTED_TO_STRAY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.skeleton.converted_to_stray"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SKELETON_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.skeleton.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SKELETON_HORSE_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.skeleton_horse.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SKELETON_HORSE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.skeleton_horse.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SKELETON_HORSE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.skeleton_horse.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SKELETON_HORSE_SWIM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.skeleton_horse.swim"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SKELETON_HORSE_AMBIENT_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.skeleton_horse.ambient_water"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SKELETON_HORSE_GALLOP_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.skeleton_horse.gallop_water"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SKELETON_HORSE_JUMP_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.skeleton_horse.jump_water"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SKELETON_HORSE_STEP_WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.skeleton_horse.step_water"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SKELETON_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.skeleton.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SKELETON_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.skeleton.shoot"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SKELETON_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.skeleton.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SLIME_ATTACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.slime.attack"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SLIME_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.slime.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SLIME_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.slime.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SLIME_JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.slime.jump"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SLIME_SQUISH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.slime.squish"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SLIME_BLOCK_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.slime_block.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SLIME_BLOCK_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.slime_block.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SLIME_BLOCK_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.slime_block.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SLIME_BLOCK_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.slime_block.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SLIME_BLOCK_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.slime_block.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SMALL_AMETHYST_BUD_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.small_amethyst_bud.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SMALL_AMETHYST_BUD_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.small_amethyst_bud.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SMALL_DRIPLEAF_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.small_dripleaf.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SMALL_DRIPLEAF_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.small_dripleaf.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SMALL_DRIPLEAF_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.small_dripleaf.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SMALL_DRIPLEAF_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.small_dripleaf.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SMALL_DRIPLEAF_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.small_dripleaf.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SOUL_SAND_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.soul_sand.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SOUL_SAND_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.soul_sand.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SOUL_SAND_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.soul_sand.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SOUL_SAND_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.soul_sand.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SOUL_SAND_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.soul_sand.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SOUL_SOIL_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.soul_soil.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SOUL_SOIL_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.soul_soil.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SOUL_SOIL_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.soul_soil.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SOUL_SOIL_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.soul_soil.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SOUL_SOIL_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.soul_soil.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SOUL_ESCAPE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "particle.soul_escape"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SPORE_BLOSSOM_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.spore_blossom.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SPORE_BLOSSOM_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.spore_blossom.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SPORE_BLOSSOM_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.spore_blossom.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SPORE_BLOSSOM_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.spore_blossom.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SPORE_BLOSSOM_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.spore_blossom.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STRIDER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.strider.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STRIDER_HAPPY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.strider.happy"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STRIDER_RETREAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.strider.retreat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STRIDER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.strider.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STRIDER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.strider.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STRIDER_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.strider.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STRIDER_STEP_LAVA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.strider.step_lava"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STRIDER_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.strider.eat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STRIDER_SADDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.strider.saddle"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SLIME_DEATH_SMALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.slime.death_small"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SLIME_HURT_SMALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.slime.hurt_small"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SLIME_JUMP_SMALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.slime.jump_small"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SLIME_SQUISH_SMALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.slime.squish_small"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SMITHING_TABLE_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.smithing_table.use"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SMOKER_SMOKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.smoker.smoke"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNIFFER_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.sniffer.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNIFFER_EAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.sniffer.eat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNIFFER_IDLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.sniffer.idle"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNIFFER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.sniffer.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNIFFER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.sniffer.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNIFFER_DROP_SEED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.sniffer.drop_seed"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNIFFER_SCENTING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.sniffer.scenting"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNIFFER_SNIFFING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.sniffer.sniffing"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNIFFER_SEARCHING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.sniffer.searching"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNIFFER_DIGGING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.sniffer.digging"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNIFFER_DIGGING_STOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.sniffer.digging_stop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNIFFER_HAPPY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.sniffer.happy"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNIFFER_EGG_PLOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sniffer_egg.plop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNIFFER_EGG_CRACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sniffer_egg.crack"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNIFFER_EGG_HATCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sniffer_egg.hatch"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNOWBALL_THROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.snowball.throw"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNOW_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.snow.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNOW_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.snow.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNOW_GOLEM_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.snow_golem.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNOW_GOLEM_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.snow_golem.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNOW_GOLEM_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.snow_golem.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNOW_GOLEM_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.snow_golem.shoot"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNOW_GOLEM_SHEAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.snow_golem.shear"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNOW_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.snow.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNOW_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.snow.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SNOW_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.snow.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SPIDER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.spider.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SPIDER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.spider.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SPIDER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.spider.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SPIDER_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.spider.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SPLASH_POTION_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.splash_potion.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SPLASH_POTION_THROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.splash_potion.throw"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SPONGE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sponge.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SPONGE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sponge.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SPONGE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sponge.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SPONGE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sponge.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SPONGE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sponge.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SPONGE_ABSORB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sponge.absorb"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SPYGLASS_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.spyglass.use"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SPYGLASS_STOP_USING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.spyglass.stop_using"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SQUID_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.squid.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SQUID_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.squid.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SQUID_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.squid.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SQUID_SQUIRT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.squid.squirt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STONE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.stone.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STONE_BUTTON_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.stone_button.click_off"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STONE_BUTTON_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.stone_button.click_on"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STONE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.stone.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STONE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.stone.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STONE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.stone.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STONE_PRESSURE_PLATE_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.stone_pressure_plate.click_off"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STONE_PRESSURE_PLATE_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.stone_pressure_plate.click_on"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STONE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.stone.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STRAY_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.stray.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STRAY_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.stray.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STRAY_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.stray.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> STRAY_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.stray.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SWEET_BERRY_BUSH_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sweet_berry_bush.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SWEET_BERRY_BUSH_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sweet_berry_bush.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> SWEET_BERRY_BUSH_PICK_BERRIES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sweet_berry_bush.pick_berries"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TADPOLE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.tadpole.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TADPOLE_FLOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.tadpole.flop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TADPOLE_GROW_UP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.tadpole.grow_up"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TADPOLE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.tadpole.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> THORNS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "enchant.thorns.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TNT_PRIMED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.tnt.primed"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TOTEM_USE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.totem.use"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIDENT_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.trident.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIDENT_HIT_GROUND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.trident.hit_ground"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIDENT_RETURN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.trident.return"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIDENT_RIPTIDE_1  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.trident.riptide_1"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIDENT_RIPTIDE_2  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.trident.riptide_2"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIDENT_RIPTIDE_3  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.trident.riptide_3"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIDENT_THROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.trident.throw"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIDENT_THUNDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.trident.thunder"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIPWIRE_ATTACH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.tripwire.attach"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIPWIRE_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.tripwire.click_off"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIPWIRE_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.tripwire.click_on"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TRIPWIRE_DETACH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.tripwire.detach"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TROPICAL_FISH_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.tropical_fish.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TROPICAL_FISH_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.tropical_fish.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TROPICAL_FISH_FLOP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.tropical_fish.flop"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TROPICAL_FISH_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.tropical_fish.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TUFF_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.tuff.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TUFF_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.tuff.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TUFF_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.tuff.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TUFF_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.tuff.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TUFF_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.tuff.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TUFF_BRICKS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.tuff_bricks.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TUFF_BRICKS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.tuff_bricks.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TUFF_BRICKS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.tuff_bricks.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TUFF_BRICKS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.tuff_bricks.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TUFF_BRICKS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.tuff_bricks.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POLISHED_TUFF_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.polished_tuff.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POLISHED_TUFF_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.polished_tuff.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POLISHED_TUFF_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.polished_tuff.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POLISHED_TUFF_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.polished_tuff.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> POLISHED_TUFF_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.polished_tuff.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TURTLE_AMBIENT_LAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.turtle.ambient_land"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TURTLE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.turtle.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TURTLE_DEATH_BABY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.turtle.death_baby"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TURTLE_EGG_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.turtle.egg_break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TURTLE_EGG_CRACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.turtle.egg_crack"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TURTLE_EGG_HATCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.turtle.egg_hatch"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TURTLE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.turtle.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TURTLE_HURT_BABY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.turtle.hurt_baby"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TURTLE_LAY_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.turtle.lay_egg"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TURTLE_SHAMBLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.turtle.shamble"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TURTLE_SHAMBLE_BABY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.turtle.shamble_baby"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> TURTLE_SWIM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.turtle.swim"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> UI_BUTTON_CLICK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ui.button.click"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> UI_LOOM_SELECT_PATTERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ui.loom.select_pattern"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> UI_LOOM_TAKE_RESULT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ui.loom.take_result"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> UI_CARTOGRAPHY_TABLE_TAKE_RESULT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ui.cartography_table.take_result"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> UI_STONECUTTER_TAKE_RESULT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ui.stonecutter.take_result"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> UI_STONECUTTER_SELECT_RECIPE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ui.stonecutter.select_recipe"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> UI_TOAST_CHALLENGE_COMPLETE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ui.toast.challenge_complete"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> UI_TOAST_IN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ui.toast.in"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> UI_TOAST_OUT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ui.toast.out"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VAULT_ACTIVATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.vault.activate"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VAULT_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.vault.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VAULT_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.vault.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VAULT_CLOSE_SHUTTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.vault.close_shutter"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VAULT_DEACTIVATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.vault.deactivate"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VAULT_EJECT_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.vault.eject_item"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VAULT_REJECT_REWARDED_PLAYER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.vault.reject_rewarded_player"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VAULT_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.vault.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VAULT_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.vault.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VAULT_INSERT_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.vault.insert_item"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VAULT_INSERT_ITEM_FAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.vault.insert_item_fail"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VAULT_OPEN_SHUTTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.vault.open_shutter"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VAULT_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.vault.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VAULT_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.vault.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VEX_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.vex.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VEX_CHARGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.vex.charge"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VEX_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.vex.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VEX_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.vex.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VILLAGER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.villager.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VILLAGER_CELEBRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.villager.celebrate"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VILLAGER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.villager.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VILLAGER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.villager.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VILLAGER_NO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.villager.no"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VILLAGER_TRADE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.villager.trade"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VILLAGER_YES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.villager.yes"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VILLAGER_WORK_ARMORER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.villager.work_armorer"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VILLAGER_WORK_BUTCHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.villager.work_butcher"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VILLAGER_WORK_CARTOGRAPHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.villager.work_cartographer"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VILLAGER_WORK_CLERIC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.villager.work_cleric"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VILLAGER_WORK_FARMER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.villager.work_farmer"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VILLAGER_WORK_FISHERMAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.villager.work_fisherman"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VILLAGER_WORK_FLETCHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.villager.work_fletcher"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VILLAGER_WORK_LEATHERWORKER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.villager.work_leatherworker"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VILLAGER_WORK_LIBRARIAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.villager.work_librarian"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VILLAGER_WORK_MASON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.villager.work_mason"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VILLAGER_WORK_SHEPHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.villager.work_shepherd"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VILLAGER_WORK_TOOLSMITH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.villager.work_toolsmith"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VILLAGER_WORK_WEAPONSMITH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.villager.work_weaponsmith"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VINDICATOR_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.vindicator.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VINDICATOR_CELEBRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.vindicator.celebrate"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VINDICATOR_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.vindicator.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VINDICATOR_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.vindicator.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VINE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.vine.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VINE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.vine.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VINE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.vine.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VINE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.vine.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> VINE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.vine.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> LILY_PAD_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.lily_pad.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WANDERING_TRADER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wandering_trader.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WANDERING_TRADER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wandering_trader.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WANDERING_TRADER_DISAPPEARED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wandering_trader.disappeared"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WANDERING_TRADER_DRINK_MILK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wandering_trader.drink_milk"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WANDERING_TRADER_DRINK_POTION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wandering_trader.drink_potion"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WANDERING_TRADER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wandering_trader.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WANDERING_TRADER_NO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wandering_trader.no"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WANDERING_TRADER_REAPPEARED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wandering_trader.reappeared"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WANDERING_TRADER_TRADE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wandering_trader.trade"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WANDERING_TRADER_YES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wandering_trader.yes"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WARDEN_AGITATED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.warden.agitated"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WARDEN_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.warden.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WARDEN_ANGRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.warden.angry"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WARDEN_ATTACK_IMPACT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.warden.attack_impact"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WARDEN_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.warden.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WARDEN_DIG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.warden.dig"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WARDEN_EMERGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.warden.emerge"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WARDEN_HEARTBEAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.warden.heartbeat"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WARDEN_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.warden.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WARDEN_LISTENING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.warden.listening"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WARDEN_LISTENING_ANGRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.warden.listening_angry"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WARDEN_NEARBY_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.warden.nearby_close"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WARDEN_NEARBY_CLOSER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.warden.nearby_closer"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WARDEN_NEARBY_CLOSEST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.warden.nearby_closest"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WARDEN_ROAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.warden.roar"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WARDEN_SNIFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.warden.sniff"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WARDEN_SONIC_BOOM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.warden.sonic_boom"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WARDEN_SONIC_CHARGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.warden.sonic_charge"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WARDEN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.warden.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WARDEN_TENDRIL_CLICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.warden.tendril_clicks"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WAXED_HANGING_SIGN_INTERACT_FAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.hanging_sign.waxed_interact_fail"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WAXED_SIGN_INTERACT_FAIL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.sign.waxed_interact_fail"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WATER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.water.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WEATHER_RAIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weather.rain"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WEATHER_RAIN_ABOVE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weather.rain.above"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WET_GRASS_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wet_grass.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WET_GRASS_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wet_grass.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WET_GRASS_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wet_grass.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WET_GRASS_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wet_grass.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WET_GRASS_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wet_grass.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WET_SPONGE_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wet_sponge.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WET_SPONGE_DRIES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wet_sponge.dries"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WET_SPONGE_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wet_sponge.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WET_SPONGE_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wet_sponge.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WET_SPONGE_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wet_sponge.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WET_SPONGE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wet_sponge.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WIND_CHARGE_BURST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wind_charge.wind_burst"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WIND_CHARGE_THROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wind_charge.throw"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WITCH_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.witch.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WITCH_CELEBRATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.witch.celebrate"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WITCH_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.witch.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WITCH_DRINK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.witch.drink"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WITCH_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.witch.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WITCH_THROW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.witch.throw"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WITHER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wither.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WITHER_BREAK_BLOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wither.break_block"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WITHER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wither.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WITHER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wither.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WITHER_SHOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wither.shoot"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WITHER_SKELETON_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wither_skeleton.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WITHER_SKELETON_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wither_skeleton.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WITHER_SKELETON_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wither_skeleton.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WITHER_SKELETON_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wither_skeleton.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WITHER_SPAWN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wither.spawn"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOLF_ARMOR_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.wolf_armor.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOLF_ARMOR_CRACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.wolf_armor.crack"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOLF_ARMOR_DAMAGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.wolf_armor.damage"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOLF_ARMOR_REPAIR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item.wolf_armor.repair"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOLF_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wolf.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOLF_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wolf.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOLF_GROWL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wolf.growl"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOLF_HOWL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wolf.howl"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOLF_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wolf.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOLF_PANT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wolf.pant"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOLF_SHAKE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wolf.shake"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOLF_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wolf.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOLF_WHINE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.wolf.whine"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOODEN_DOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wooden_door.close"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOODEN_DOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wooden_door.open"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOODEN_TRAPDOOR_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wooden_trapdoor.close"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOODEN_TRAPDOOR_OPEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wooden_trapdoor.open"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOODEN_BUTTON_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wooden_button.click_off"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOODEN_BUTTON_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wooden_button.click_on"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOODEN_PRESSURE_PLATE_CLICK_OFF  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wooden_pressure_plate.click_off"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOODEN_PRESSURE_PLATE_CLICK_ON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wooden_pressure_plate.click_on"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOOD_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wood.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOOD_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wood.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOOD_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wood.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOOD_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wood.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOOD_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wood.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOOL_BREAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wool.break"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOOL_FALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wool.fall"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOOL_HIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wool.hit"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOOL_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wool.place"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> WOOL_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block.wool.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOGLIN_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zoglin.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOGLIN_ANGRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zoglin.angry"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOGLIN_ATTACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zoglin.attack"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOGLIN_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zoglin.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOGLIN_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zoglin.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOGLIN_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zoglin.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOMBIE_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zombie.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOMBIE_ATTACK_WOODEN_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zombie.attack_wooden_door"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOMBIE_ATTACK_IRON_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zombie.attack_iron_door"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOMBIE_BREAK_WOODEN_DOOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zombie.break_wooden_door"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOMBIE_CONVERTED_TO_DROWNED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zombie.converted_to_drowned"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOMBIE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zombie.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOMBIE_DESTROY_EGG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zombie.destroy_egg"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOMBIE_HORSE_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zombie_horse.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOMBIE_HORSE_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zombie_horse.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOMBIE_HORSE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zombie_horse.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOMBIE_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zombie.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOMBIE_INFECT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zombie.infect"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOMBIFIED_PIGLIN_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zombified_piglin.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOMBIFIED_PIGLIN_ANGRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zombified_piglin.angry"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOMBIFIED_PIGLIN_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zombified_piglin.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOMBIFIED_PIGLIN_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zombified_piglin.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOMBIE_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zombie.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOMBIE_VILLAGER_AMBIENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zombie_villager.ambient"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOMBIE_VILLAGER_CONVERTED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zombie_villager.converted"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOMBIE_VILLAGER_CURE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zombie_villager.cure"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOMBIE_VILLAGER_DEATH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zombie_villager.death"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOMBIE_VILLAGER_HURT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zombie_villager.hurt"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> ZOMBIE_VILLAGER_STEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "entity.zombie_villager.step"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> APPLY_EFFECT_BAD_OMEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "event.mob_effect.bad_omen"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> APPLY_EFFECT_TRIAL_OMEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "event.mob_effect.trial_omen"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

	public static final MCCReference<Sound> APPLY_EFFECT_RAID_OMEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "event.mob_effect.raid_omen"), VANILLA_REGISTRY_KEY, new TypeToken<Sound>(){}).getAsReference();

}
