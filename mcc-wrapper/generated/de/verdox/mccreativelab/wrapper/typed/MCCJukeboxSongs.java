package de.verdox.mccreativelab.wrapper.typed;

import de.verdox.mccreativelab.wrapper.types.MCCJukeboxSong;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCRegistry;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import com.google.common.reflect.TypeToken;
import net.kyori.adventure.key.Key;

public class MCCJukeboxSongs  {

	public static final Key VANILLA_REGISTRY_KEY  = Key.key("minecraft", "jukebox_song");

	public static final MCCTypedKey<MCCRegistry<MCCJukeboxSong>> VANILLA_REGISTRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "root"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});;

	public static final MCCTypedKey<MCCJukeboxSong> THIRTEEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "13"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCJukeboxSong> CAT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cat"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCJukeboxSong> BLOCKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "blocks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCJukeboxSong> CHIRP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "chirp"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCJukeboxSong> FAR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "far"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCJukeboxSong> MALL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mall"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCJukeboxSong> MELLOHI  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mellohi"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCJukeboxSong> STAL  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "stal"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCJukeboxSong> STRAD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "strad"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCJukeboxSong> WARD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ward"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCJukeboxSong> ELEVEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "11"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCJukeboxSong> WAIT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "wait"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCJukeboxSong> PIGSTEP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pigstep"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCJukeboxSong> OTHERSIDE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "otherside"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCJukeboxSong> FIVE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "5"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCJukeboxSong> RELIC  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "relic"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCJukeboxSong> PRECIPICE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "precipice"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCJukeboxSong> CREATOR  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "creator"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCJukeboxSong> CREATOR_MUSIC_BOX  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "creator_music_box"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

}
