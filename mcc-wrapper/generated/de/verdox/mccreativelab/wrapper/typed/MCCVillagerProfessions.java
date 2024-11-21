package de.verdox.mccreativelab.wrapper.typed;

import de.verdox.mccreativelab.wrapper.types.MCCVillagerProfession;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCRegistry;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import com.google.common.reflect.TypeToken;
import net.kyori.adventure.key.Key;

public class MCCVillagerProfessions  {

	public static final Key VANILLA_REGISTRY_KEY  = Key.key("minecraft", "villager_profession");

	public static final MCCTypedKey<MCCRegistry<MCCVillagerProfession>> VANILLA_REGISTRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "root"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});;

	public static final MCCTypedKey<MCCVillagerProfession> NONE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "none"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCVillagerProfession> ARMORER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "armorer"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCVillagerProfession> BUTCHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "butcher"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCVillagerProfession> CARTOGRAPHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cartographer"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCVillagerProfession> CLERIC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cleric"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCVillagerProfession> FARMER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "farmer"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCVillagerProfession> FISHERMAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fisherman"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCVillagerProfession> FLETCHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fletcher"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCVillagerProfession> LEATHERWORKER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "leatherworker"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCVillagerProfession> LIBRARIAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "librarian"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCVillagerProfession> MASON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mason"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCVillagerProfession> NITWIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nitwit"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCVillagerProfession> SHEPHERD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "shepherd"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCVillagerProfession> TOOLSMITH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "toolsmith"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCVillagerProfession> WEAPONSMITH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "weaponsmith"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

}
