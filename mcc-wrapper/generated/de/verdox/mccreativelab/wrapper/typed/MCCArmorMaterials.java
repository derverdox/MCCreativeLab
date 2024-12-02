package de.verdox.mccreativelab.wrapper.typed;

import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.types.MCCArmorMaterial;
import com.google.common.reflect.TypeToken;
import net.kyori.adventure.key.Key;

public class MCCArmorMaterials  {

	public static final Key VANILLA_REGISTRY_KEY  = Key.key("minecraft", "armor_material");

	public static final MCCReference<MCCArmorMaterial> LEATHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "leather"), VANILLA_REGISTRY_KEY, new TypeToken<MCCArmorMaterial>(){}).getAsReference();

	public static final MCCReference<MCCArmorMaterial> CHAIN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chainmail"), VANILLA_REGISTRY_KEY, new TypeToken<MCCArmorMaterial>(){}).getAsReference();

	public static final MCCReference<MCCArmorMaterial> IRON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "iron"), VANILLA_REGISTRY_KEY, new TypeToken<MCCArmorMaterial>(){}).getAsReference();

	public static final MCCReference<MCCArmorMaterial> GOLD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gold"), VANILLA_REGISTRY_KEY, new TypeToken<MCCArmorMaterial>(){}).getAsReference();

	public static final MCCReference<MCCArmorMaterial> DIAMOND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "diamond"), VANILLA_REGISTRY_KEY, new TypeToken<MCCArmorMaterial>(){}).getAsReference();

	public static final MCCReference<MCCArmorMaterial> TURTLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "turtle"), VANILLA_REGISTRY_KEY, new TypeToken<MCCArmorMaterial>(){}).getAsReference();

	public static final MCCReference<MCCArmorMaterial> NETHERITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "netherite"), VANILLA_REGISTRY_KEY, new TypeToken<MCCArmorMaterial>(){}).getAsReference();

	public static final MCCReference<MCCArmorMaterial> ARMADILLO  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armadillo"), VANILLA_REGISTRY_KEY, new TypeToken<MCCArmorMaterial>(){}).getAsReference();

}
