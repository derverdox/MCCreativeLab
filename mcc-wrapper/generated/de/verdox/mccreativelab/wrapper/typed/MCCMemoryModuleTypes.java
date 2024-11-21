package de.verdox.mccreativelab.wrapper.typed;

import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import java.util.UUID;
import java.lang.Integer;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import java.util.List;
import java.lang.Long;
import de.verdox.mccreativelab.wrapper.registry.MCCRegistry;
import java.lang.Boolean;
import de.verdox.mccreativelab.wrapper.entity.ai.MCCMemoryModuleType;
import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import net.kyori.adventure.key.Key;

public class MCCMemoryModuleTypes  {

	public static final Key VANILLA_REGISTRY_KEY  = Key.key("minecraft", "memory_module_type");

	public static final MCCTypedKey<MCCRegistry<MCCMemoryModuleType<Void>>> VANILLA_REGISTRY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "root"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});;

	public static final MCCTypedKey<MCCMemoryModuleType<Void>> DUMMY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dummy"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<MCCLocation>> HOME  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "home"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<MCCLocation>> JOB_SITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "job_site"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<MCCLocation>> POTENTIAL_JOB_SITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "potential_job_site"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<MCCLocation>> MEETING_POINT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "meeting_point"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<List<MCCLocation>>> SECONDARY_JOB_SITE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "secondary_job_site"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<List<MCCPlayer>>> NEAREST_PLAYERS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nearest_players"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<MCCPlayer>> NEAREST_VISIBLE_PLAYER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nearest_visible_player"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<MCCPlayer>> NEAREST_VISIBLE_ATTACKABLE_PLAYER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nearest_visible_attackable_player"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Boolean>> ATTACK_COOLING_DOWN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "attack_cooling_down"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<MCCEntity>> RIDE_TARGET  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ride_target"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<List<MCCLocation>>> INTERACTABLE_DOORS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "interactable_doors"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Set<MCCLocation>>> DOORS_TO_CLOSE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "doors_to_close"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<MCCLocation>> HIDING_PLACE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hiding_place"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Long>> HEARD_BELL_TIME  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "heard_bell_time"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Long>> CANT_REACH_WALK_TARGET_SINCE  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "cant_reach_walk_target_since"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Boolean>> GOLEM_DETECTED_RECENTLY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "golem_detected_recently"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Boolean>> DANGER_DETECTED_RECENTLY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "danger_detected_recently"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Long>> LAST_SLEPT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "last_slept"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Long>> LAST_WOKEN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "last_woken"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Long>> LAST_WORKED_AT_POI  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "last_worked_at_poi"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Integer>> PLAY_DEAD_TICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "play_dead_ticks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<MCCPlayer>> TEMPTING_PLAYER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "tempting_player"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Integer>> TEMPTATION_COOLDOWN_TICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "temptation_cooldown_ticks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Integer>> GAZE_COOLDOWN_TICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "gaze_cooldown_ticks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Boolean>> IS_TEMPTED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "is_tempted"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Integer>> LONG_JUMP_COOLDOWN_TICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "long_jump_cooldown_ticks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Boolean>> LONG_JUMP_MID_JUMP  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "long_jump_mid_jump"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Boolean>> HAS_HUNTING_COOLDOWN  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "has_hunting_cooldown"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Integer>> RAM_COOLDOWN_TICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ram_cooldown_ticks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Boolean>> IS_PANICKING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "is_panicking"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<List<UUID>>> UNREACHABLE_TONGUE_TARGETS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "unreachable_tongue_targets"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<UUID>> ANGRY_AT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "angry_at"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Boolean>> UNIVERSAL_ANGER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "universal_anger"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Boolean>> ADMIRING_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "admiring_item"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Integer>> TIME_TRYING_TO_REACH_ADMIRE_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "time_trying_to_reach_admire_item"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Boolean>> DISABLE_WALK_TO_ADMIRE_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "disable_walk_to_admire_item"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Boolean>> ADMIRING_DISABLED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "admiring_disabled"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Boolean>> HUNTED_RECENTLY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "hunted_recently"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Boolean>> DANCING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "dancing"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<MCCPlayer>> NEAREST_TARGETABLE_PLAYER_NOT_WEARING_GOLD  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nearest_targetable_player_not_wearing_gold"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Integer>> VISIBLE_ADULT_PIGLIN_COUNT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "visible_adult_piglin_count"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Integer>> VISIBLE_ADULT_HOGLIN_COUNT  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "visible_adult_hoglin_count"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<MCCPlayer>> NEAREST_PLAYER_HOLDING_WANTED_ITEM  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "nearest_player_holding_wanted_item"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Boolean>> ATE_RECENTLY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "ate_recently"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Boolean>> PACIFIED  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "pacified"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<UUID>> LIKED_PLAYER  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "liked_player"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<MCCLocation>> LIKED_NOTEBLOCK_POSITION  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "liked_noteblock_position"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Integer>> LIKED_NOTEBLOCK_COOLDOWN_TICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "liked_noteblock_cooldown_ticks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Integer>> ITEM_PICKUP_COOLDOWN_TICKS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item_pickup_cooldown_ticks"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<List<MCCLocation>>> SNIFFER_EXPLORED_POSITIONS  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sniffer_explored_positions"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Boolean>> SNIFFER_DIGGING  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sniffer_digging"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

	public static final MCCTypedKey<MCCMemoryModuleType<Boolean>> SNIFFER_HAPPY  = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "sniffer_happy"), VANILLA_REGISTRY_KEY, new TypeToken<>(){});

}
