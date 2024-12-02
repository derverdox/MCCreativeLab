package de.verdox.mccreativelab.wrapper.typed;

import de.verdox.mccreativelab.wrapper.types.MCCVillagerProfession;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import com.google.common.reflect.TypeToken;
import net.kyori.adventure.key.Key;

public class MCCVillagerProfessions  {

	public static final Key VANILLA_REGISTRY_KEY  = Key.key("minecraft", "villager_profession");

	public static final MCCReference<MCCVillagerProfession> NONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "none"), VANILLA_REGISTRY_KEY, new TypeToken<MCCVillagerProfession>(){}).getAsReference();

	public static final MCCReference<MCCVillagerProfession> ARMORER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armorer"), VANILLA_REGISTRY_KEY, new TypeToken<MCCVillagerProfession>(){}).getAsReference();

	public static final MCCReference<MCCVillagerProfession> BUTCHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "butcher"), VANILLA_REGISTRY_KEY, new TypeToken<MCCVillagerProfession>(){}).getAsReference();

	public static final MCCReference<MCCVillagerProfession> CARTOGRAPHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cartographer"), VANILLA_REGISTRY_KEY, new TypeToken<MCCVillagerProfession>(){}).getAsReference();

	public static final MCCReference<MCCVillagerProfession> CLERIC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cleric"), VANILLA_REGISTRY_KEY, new TypeToken<MCCVillagerProfession>(){}).getAsReference();

	public static final MCCReference<MCCVillagerProfession> FARMER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "farmer"), VANILLA_REGISTRY_KEY, new TypeToken<MCCVillagerProfession>(){}).getAsReference();

	public static final MCCReference<MCCVillagerProfession> FISHERMAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fisherman"), VANILLA_REGISTRY_KEY, new TypeToken<MCCVillagerProfession>(){}).getAsReference();

	public static final MCCReference<MCCVillagerProfession> FLETCHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fletcher"), VANILLA_REGISTRY_KEY, new TypeToken<MCCVillagerProfession>(){}).getAsReference();

	public static final MCCReference<MCCVillagerProfession> LEATHERWORKER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "leatherworker"), VANILLA_REGISTRY_KEY, new TypeToken<MCCVillagerProfession>(){}).getAsReference();

	public static final MCCReference<MCCVillagerProfession> LIBRARIAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "librarian"), VANILLA_REGISTRY_KEY, new TypeToken<MCCVillagerProfession>(){}).getAsReference();

	public static final MCCReference<MCCVillagerProfession> MASON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mason"), VANILLA_REGISTRY_KEY, new TypeToken<MCCVillagerProfession>(){}).getAsReference();

	public static final MCCReference<MCCVillagerProfession> NITWIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nitwit"), VANILLA_REGISTRY_KEY, new TypeToken<MCCVillagerProfession>(){}).getAsReference();

	public static final MCCReference<MCCVillagerProfession> SHEPHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shepherd"), VANILLA_REGISTRY_KEY, new TypeToken<MCCVillagerProfession>(){}).getAsReference();

	public static final MCCReference<MCCVillagerProfession> TOOLSMITH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "toolsmith"), VANILLA_REGISTRY_KEY, new TypeToken<MCCVillagerProfession>(){}).getAsReference();

	public static final MCCReference<MCCVillagerProfession> WEAPONSMITH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weaponsmith"), VANILLA_REGISTRY_KEY, new TypeToken<MCCVillagerProfession>(){}).getAsReference();

}
