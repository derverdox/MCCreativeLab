package de.verdox.mccreativelab.wrapper.typed;

import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.entity.MCCEffectType;
import com.google.common.reflect.TypeToken;
import net.kyori.adventure.key.Key;

public class MCCEffects  {

	public static final Key VANILLA_REGISTRY_KEY  = Key.key("minecraft", "mob_effect");

	public static final MCCReference<MCCEffectType> MOVEMENT_SPEED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "speed"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> MOVEMENT_SLOWDOWN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slowness"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> DIG_SPEED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "haste"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> DIG_SLOWDOWN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mining_fatigue"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> DAMAGE_BOOST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "strength"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> HEAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "instant_health"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> HARM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "instant_damage"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jump_boost"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> CONFUSION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nausea"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> REGENERATION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "regeneration"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> DAMAGE_RESISTANCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "resistance"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> FIRE_RESISTANCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fire_resistance"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> WATER_BREATHING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "water_breathing"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> INVISIBILITY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "invisibility"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> BLINDNESS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blindness"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> NIGHT_VISION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "night_vision"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> HUNGER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hunger"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> WEAKNESS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weakness"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> POISON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "poison"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> WITHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> HEALTH_BOOST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "health_boost"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> ABSORPTION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "absorption"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> SATURATION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "saturation"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> GLOWING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glowing"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> LEVITATION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "levitation"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> LUCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "luck"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> UNLUCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "unluck"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> SLOW_FALLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slow_falling"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> CONDUIT_POWER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "conduit_power"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> DOLPHINS_GRACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dolphins_grace"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> BAD_OMEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bad_omen"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> HERO_OF_THE_VILLAGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hero_of_the_village"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> DARKNESS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "darkness"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> TRIAL_OMEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trial_omen"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> RAID_OMEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "raid_omen"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> WIND_CHARGED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wind_charged"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> WEAVING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weaving"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> OOZING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oozing"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

	public static final MCCReference<MCCEffectType> INFESTED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infested"), VANILLA_REGISTRY_KEY, new TypeToken<MCCEffectType>(){}).getAsReference();

}
