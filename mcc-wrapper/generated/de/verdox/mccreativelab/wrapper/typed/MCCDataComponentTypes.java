package de.verdox.mccreativelab.wrapper.typed;

import de.verdox.mccreativelab.wrapper.item.components.MCCFoodProperties;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.item.components.MCCCustomModelData;
import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.item.components.MCCMapId;
import java.lang.Integer;
import de.verdox.mccreativelab.wrapper.item.components.MCCTool;
import de.verdox.mccreativelab.wrapper.item.components.MCCMapItemColor;
import de.verdox.mccreativelab.wrapper.item.components.MCCRarity;
import de.verdox.mccreativelab.wrapper.item.components.MCCLockCode;
import de.verdox.mccreativelab.wrapper.item.components.MCCSeededContainerLoot;
import net.kyori.adventure.text.Component;
import java.lang.Boolean;
import de.verdox.mccreativelab.wrapper.item.components.MCCFireworkExplosion;
import de.verdox.mccreativelab.wrapper.item.components.MCCDyedItemColor;
import de.verdox.mccreativelab.wrapper.item.components.MCCBlockItemStateProperties;
import de.verdox.mccreativelab.wrapper.item.components.MCCSuspiciousStewEffects;
import de.verdox.mccreativelab.wrapper.item.components.MCCResolvableProfile;
import de.verdox.mccreativelab.wrapper.item.components.MCCJukeboxPlayable;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.item.components.MCCDataComponentType;
import de.verdox.mccreativelab.wrapper.item.components.MCCArmorTrim;
import de.verdox.mccreativelab.wrapper.item.components.MCCItemAttributeModifiers;
import de.verdox.mccreativelab.wrapper.types.MCCInstrument;
import de.verdox.mccreativelab.wrapper.item.components.MCCItemLore;
import de.verdox.mccreativelab.wrapper.item.components.MCCPotionContents;
import de.verdox.mccreativelab.wrapper.item.components.MCCLodestoneTracker;
import de.verdox.mccreativelab.wrapper.item.components.MCCMapPostProcessing;
import java.util.List;
import de.verdox.mccreativelab.wrapper.item.components.MCCUnbreakable;
import org.bukkit.DyeColor;
import de.verdox.mccreativelab.wrapper.item.components.MCCMapDecorations;
import net.kyori.adventure.key.Key;

public class MCCDataComponentTypes  {

	public static final Key VANILLA_REGISTRY_KEY  = Key.key("minecraft", "data_component_type");

	public static final MCCReference<MCCDataComponentType<Integer>> MAX_STACK_SIZE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "max_stack_size"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<Integer>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<Integer>> MAX_DAMAGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "max_damage"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<Integer>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<Integer>> DAMAGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "damage"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<Integer>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<MCCUnbreakable>> UNBREAKABLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "unbreakable"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<MCCUnbreakable>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<Component>> CUSTOM_NAME  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "custom_name"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<Component>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<Component>> ITEM_NAME  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item_name"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<Component>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<MCCItemLore>> LORE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lore"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<MCCItemLore>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<MCCRarity>> RARITY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rarity"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<MCCRarity>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<MCCItemAttributeModifiers>> ATTRIBUTE_MODIFIERS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "attribute_modifiers"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<MCCItemAttributeModifiers>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<MCCCustomModelData>> CUSTOM_MODEL_DATA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "custom_model_data"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<MCCCustomModelData>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<Integer>> REPAIR_COST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "repair_cost"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<Integer>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<Boolean>> ENCHANTMENT_GLINT_OVERRIDE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "enchantment_glint_override"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<Boolean>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<MCCFoodProperties>> FOOD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "food"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<MCCFoodProperties>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<MCCTool>> TOOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tool"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<MCCTool>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<MCCDyedItemColor>> DYED_COLOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dyed_color"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<MCCDyedItemColor>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<MCCMapItemColor>> MAP_COLOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "map_color"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<MCCMapItemColor>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<MCCMapId>> MAP_ID  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "map_id"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<MCCMapId>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<MCCMapDecorations>> MAP_DECORATIONS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "map_decorations"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<MCCMapDecorations>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<MCCMapPostProcessing>> MAP_POST_PROCESSING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "map_post_processing"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<MCCMapPostProcessing>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<MCCPotionContents>> POTION_CONTENTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potion_contents"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<MCCPotionContents>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<MCCSuspiciousStewEffects>> SUSPICIOUS_STEW_EFFECTS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "suspicious_stew_effects"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<MCCSuspiciousStewEffects>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<MCCArmorTrim>> TRIM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trim"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<MCCArmorTrim>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<MCCReference<MCCInstrument>>> INSTRUMENT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "instrument"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<MCCReference<MCCInstrument>>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<Integer>> OMINOUS_BOTTLE_AMPLIFIER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ominous_bottle_amplifier"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<Integer>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<MCCJukeboxPlayable>> JUKEBOX_PLAYABLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jukebox_playable"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<MCCJukeboxPlayable>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<List<Key>>> RECIPES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "recipes"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<List<Key>>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<MCCLodestoneTracker>> LODESTONE_TRACKER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lodestone_tracker"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<MCCLodestoneTracker>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<MCCFireworkExplosion>> FIREWORK_EXPLOSION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "firework_explosion"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<MCCFireworkExplosion>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<MCCResolvableProfile>> PROFILE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "profile"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<MCCResolvableProfile>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<Key>> NOTE_BLOCK_SOUND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "note_block_sound"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<Key>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<DyeColor>> BASE_COLOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "base_color"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<DyeColor>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<MCCBlockItemStateProperties>> BLOCK_STATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block_state"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<MCCBlockItemStateProperties>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<MCCLockCode>> LOCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lock"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<MCCLockCode>>(){}).getAsReference();

	public static final MCCReference<MCCDataComponentType<MCCSeededContainerLoot>> CONTAINER_LOOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "container_loot"), VANILLA_REGISTRY_KEY, new TypeToken<MCCDataComponentType<MCCSeededContainerLoot>>(){}).getAsReference();

}
