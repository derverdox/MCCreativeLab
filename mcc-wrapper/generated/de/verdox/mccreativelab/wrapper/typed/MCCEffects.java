package de.verdox.mccreativelab.wrapper.typed;

import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.entity.MCCEffectType;
import de.verdox.mccreativelab.wrapper.registry.MCCRegistry;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import com.google.common.reflect.TypeToken;
import net.kyori.adventure.key.Key;

public class MCCEffects  {

	public static final Key VANILLA_REGISTRY_KEY  = Key.key("minecraft", "mob_effect");

	public static final MCCTypedKey<MCCRegistry<MCCEffectType>> VANILLA_REGISTRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "root"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});;

	public static final MCCTypedKey<MCCEffectType> MOVEMENT_SPEED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "speed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> MOVEMENT_SLOWDOWN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slowness"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> DIG_SPEED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "haste"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> DIG_SLOWDOWN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mining_fatigue"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> DAMAGE_BOOST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "strength"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> HEAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "instant_health"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> HARM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "instant_damage"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "jump_boost"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> CONFUSION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nausea"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> REGENERATION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "regeneration"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> DAMAGE_RESISTANCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "resistance"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> FIRE_RESISTANCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fire_resistance"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> WATER_BREATHING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "water_breathing"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> INVISIBILITY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "invisibility"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> BLINDNESS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blindness"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> NIGHT_VISION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "night_vision"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> HUNGER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hunger"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> WEAKNESS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weakness"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> POISON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "poison"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> WITHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> HEALTH_BOOST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "health_boost"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> ABSORPTION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "absorption"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> SATURATION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "saturation"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> GLOWING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "glowing"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> LEVITATION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "levitation"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> LUCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "luck"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> UNLUCK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "unluck"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> SLOW_FALLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "slow_falling"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> CONDUIT_POWER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "conduit_power"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> DOLPHINS_GRACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dolphins_grace"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> BAD_OMEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bad_omen"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> HERO_OF_THE_VILLAGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hero_of_the_village"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> DARKNESS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "darkness"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> TRIAL_OMEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "trial_omen"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> RAID_OMEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "raid_omen"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> WIND_CHARGED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wind_charged"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> WEAVING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weaving"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> OOZING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "oozing"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEffectType> INFESTED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infested"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

}
