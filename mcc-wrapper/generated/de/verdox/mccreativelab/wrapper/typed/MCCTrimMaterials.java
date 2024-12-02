package de.verdox.mccreativelab.wrapper.typed;

import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.types.MCCTrimMaterial;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import com.google.common.reflect.TypeToken;
import net.kyori.adventure.key.Key;

public class MCCTrimMaterials  {

	public static final Key VANILLA_REGISTRY_KEY  = Key.key("minecraft", "trim_material");

	public static final MCCTypedKey<MCCTrimMaterial> QUARTZ  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "quartz"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimMaterial> IRON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimMaterial> NETHERITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimMaterial> REDSTONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "redstone"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimMaterial> COPPER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "copper"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimMaterial> GOLD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gold"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimMaterial> EMERALD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "emerald"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimMaterial> DIAMOND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimMaterial> LAPIS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lapis"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCTrimMaterial> AMETHYST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "amethyst"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

}
