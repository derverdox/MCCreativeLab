package de.verdox.mccreativelab.wrapper.typed;

import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import de.verdox.mccreativelab.wrapper.types.MCCEnchantment;
import com.google.common.reflect.TypeToken;
import net.kyori.adventure.key.Key;

public class MCCEnchantments  {

	public static final Key VANILLA_REGISTRY_KEY  = Key.key("minecraft", "enchantment");

	public static final MCCTypedKey<MCCEnchantment> PROTECTION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "protection"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> FIRE_PROTECTION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fire_protection"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> FEATHER_FALLING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "feather_falling"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> BLAST_PROTECTION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blast_protection"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> PROJECTILE_PROTECTION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "projectile_protection"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> RESPIRATION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "respiration"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> AQUA_AFFINITY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "aqua_affinity"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> THORNS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "thorns"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> DEPTH_STRIDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "depth_strider"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> FROST_WALKER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "frost_walker"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> BINDING_CURSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "binding_curse"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> SOUL_SPEED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "soul_speed"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> SWIFT_SNEAK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "swift_sneak"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> SHARPNESS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sharpness"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> SMITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "smite"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> BANE_OF_ARTHROPODS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bane_of_arthropods"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> KNOCKBACK  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "knockback"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> FIRE_ASPECT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fire_aspect"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> LOOTING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "looting"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> SWEEPING_EDGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sweeping_edge"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> EFFICIENCY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "efficiency"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> SILK_TOUCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "silk_touch"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> UNBREAKING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "unbreaking"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> FORTUNE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fortune"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> POWER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "power"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> PUNCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "punch"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> FLAME  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flame"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> INFINITY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "infinity"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> LUCK_OF_THE_SEA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "luck_of_the_sea"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> LURE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lure"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> LOYALTY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "loyalty"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> IMPALING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "impaling"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> RIPTIDE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "riptide"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> CHANNELING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "channeling"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> MULTISHOT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "multishot"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> QUICK_CHARGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "quick_charge"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> PIERCING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "piercing"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> DENSITY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "density"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> BREACH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "breach"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> WIND_BURST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wind_burst"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> MENDING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mending"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCEnchantment> VANISHING_CURSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vanishing_curse"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

}
