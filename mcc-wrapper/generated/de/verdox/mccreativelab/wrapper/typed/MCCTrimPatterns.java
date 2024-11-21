package de.verdox.mccreativelab.wrapper.typed;

import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCRegistry;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import de.verdox.mccreativelab.wrapper.types.MCCTrimPattern;
import com.google.common.reflect.TypeToken;
import net.kyori.adventure.key.Key;

public class MCCTrimPatterns  {

	public static final Key VANILLA_REGISTRY_KEY  = Key.key("minecraft", "trim_pattern");

	public static final MCCTypedKey<MCCRegistry<MCCTrimPattern>> VANILLA_REGISTRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "root"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});;

	public static final MCCTypedKey<MCCTrimPattern> SENTRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sentry"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimPattern> DUNE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dune"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimPattern> COAST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "coast"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimPattern> WILD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wild"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimPattern> WARD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ward"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimPattern> EYE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "eye"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimPattern> VEX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "vex"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimPattern> TIDE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tide"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimPattern> SNOUT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "snout"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimPattern> RIB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "rib"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimPattern> SPIRE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "spire"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimPattern> WAYFINDER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wayfinder"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimPattern> SHAPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shaper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimPattern> SILENCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "silence"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimPattern> RAISER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "raiser"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimPattern> HOST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "host"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimPattern> FLOW  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "flow"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimPattern> BOLT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bolt"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

}
