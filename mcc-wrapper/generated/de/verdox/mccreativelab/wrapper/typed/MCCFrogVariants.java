package de.verdox.mccreativelab.wrapper.typed;

import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCRegistry;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import de.verdox.mccreativelab.wrapper.types.MCCFrogVariant;
import com.google.common.reflect.TypeToken;
import net.kyori.adventure.key.Key;

public class MCCFrogVariants  {

	public static final Key VANILLA_REGISTRY_KEY  = Key.key("minecraft", "frog_variant");

	public static final MCCTypedKey<MCCRegistry<MCCFrogVariant>> VANILLA_REGISTRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "root"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});;

	public static final MCCTypedKey<MCCFrogVariant> TEMPERATE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "temperate"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCFrogVariant> WARM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "warm"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCFrogVariant> COLD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cold"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

}
