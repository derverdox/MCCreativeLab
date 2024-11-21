package de.verdox.mccreativelab.wrapper.typed;

import de.verdox.mccreativelab.wrapper.types.MCCPaintingVariant;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCRegistry;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import com.google.common.reflect.TypeToken;
import net.kyori.adventure.key.Key;

public class MCCPaintingVariants  {

	public static final Key VANILLA_REGISTRY_KEY  = Key.key("minecraft", "painting_variant");

	public static final MCCTypedKey<MCCRegistry<MCCPaintingVariant>> VANILLA_REGISTRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "root"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});;

	public static final MCCTypedKey<MCCPaintingVariant> KEBAB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "kebab"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> AZTEC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "aztec"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> ALBAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "alban"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> AZTEC2  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "aztec2"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> BOMB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bomb"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> PLANT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "plant"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> WASTELAND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wasteland"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> POOL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pool"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> COURBET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "courbet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> SEA  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sea"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> SUNSET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sunset"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> CREEBET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "creebet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> WANDERER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wanderer"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> GRAHAM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "graham"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> MATCH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "match"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> BUST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bust"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> STAGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stage"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> VOID  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "void"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> SKULL_AND_ROSES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skull_and_roses"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> WITHER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wither"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> FIGHTERS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fighters"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> POINTER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pointer"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> PIGSCENE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pigscene"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> BURNING_SKULL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "burning_skull"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> SKELETON  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "skeleton"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> DONKEY_KONG  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "donkey_kong"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> EARTH  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "earth"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> WIND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wind"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> WATER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "water"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> FIRE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fire"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> BAROQUE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "baroque"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> HUMBLE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "humble"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> MEDITATIVE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "meditative"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> PRAIRIE_RIDE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "prairie_ride"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> UNPACKED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "unpacked"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> BACKYARD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "backyard"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> BOUQUET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "bouquet"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> CAVEBIRD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cavebird"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> CHANGING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "changing"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> COTAN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cotan"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> ENDBOSS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "endboss"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> FERN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "fern"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> FINDING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "finding"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> LOWMIST  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "lowmist"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> ORB  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "orb"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> OWLEMONS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "owlemons"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> PASSAGE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "passage"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> POND  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pond"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> SUNFLOWERS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sunflowers"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCPaintingVariant> TIDES  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tides"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

}
