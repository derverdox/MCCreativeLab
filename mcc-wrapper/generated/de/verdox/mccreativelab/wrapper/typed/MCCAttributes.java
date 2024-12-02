package de.verdox.mccreativelab.wrapper.typed;

import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.entity.MCCAttribute;
import com.google.common.reflect.TypeToken;
import net.kyori.adventure.key.Key;

public class MCCAttributes  {

	public static final Key VANILLA_REGISTRY_KEY  = Key.key("minecraft", "attribute");

	public static final MCCReference<MCCAttribute> ARMOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic.armor"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> ARMOR_TOUGHNESS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic.armor_toughness"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> ATTACK_DAMAGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic.attack_damage"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> ATTACK_KNOCKBACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic.attack_knockback"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> ATTACK_SPEED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic.attack_speed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> BLOCK_BREAK_SPEED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player.block_break_speed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> BLOCK_INTERACTION_RANGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player.block_interaction_range"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> BURNING_TIME  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic.burning_time"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> EXPLOSION_KNOCKBACK_RESISTANCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic.explosion_knockback_resistance"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> ENTITY_INTERACTION_RANGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player.entity_interaction_range"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> FALL_DAMAGE_MULTIPLIER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic.fall_damage_multiplier"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> FLYING_SPEED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic.flying_speed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> FOLLOW_RANGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic.follow_range"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> GRAVITY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic.gravity"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> JUMP_STRENGTH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic.jump_strength"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> KNOCKBACK_RESISTANCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic.knockback_resistance"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> LUCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic.luck"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> MAX_ABSORPTION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic.max_absorption"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> MAX_HEALTH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic.max_health"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> MINING_EFFICIENCY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player.mining_efficiency"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> MOVEMENT_EFFICIENCY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic.movement_efficiency"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> MOVEMENT_SPEED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic.movement_speed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> OXYGEN_BONUS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic.oxygen_bonus"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> SAFE_FALL_DISTANCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic.safe_fall_distance"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> SCALE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic.scale"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> SNEAKING_SPEED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player.sneaking_speed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> SPAWN_REINFORCEMENTS_CHANCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "zombie.spawn_reinforcements"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> STEP_HEIGHT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic.step_height"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> SUBMERGED_MINING_SPEED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player.submerged_mining_speed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> SWEEPING_DAMAGE_RATIO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "player.sweeping_damage_ratio"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

	public static final MCCReference<MCCAttribute> WATER_MOVEMENT_EFFICIENCY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "generic.water_movement_efficiency"), VANILLA_REGISTRY_KEY, new TypeToken<MCCAttribute>(){}).getAsReference();

}
