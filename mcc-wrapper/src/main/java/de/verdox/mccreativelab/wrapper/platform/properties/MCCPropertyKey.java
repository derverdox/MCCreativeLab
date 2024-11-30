package de.verdox.mccreativelab.wrapper.platform.properties;

import java.util.List;

public record MCCPropertyKey<T>(String id, PropertyValue<T> type) {

    public static final MCCPropertyKey<Boolean> DEBUG = new MCCPropertyKey<>("debug", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<Boolean> ONLINE_MODE = new MCCPropertyKey<>("online-mode", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<Boolean> PREVENT_PROXY_CONNECTIONS = new MCCPropertyKey<>("prevent-proxy-connections", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<String> SERVER_IP = new MCCPropertyKey<>("server-ip", PropertyValue.STRING);
    public static final MCCPropertyKey<Boolean> SPAWN_ANIMALS = new MCCPropertyKey<>("spawn-animals", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<Boolean> SPAWN_NPCS = new MCCPropertyKey<>("spawn-npcs", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<Boolean> PVP = new MCCPropertyKey<>("pvp", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<Boolean> ALLOW_FLIGHT = new MCCPropertyKey<>("allow-flight", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<String> MOTD = new MCCPropertyKey<>("motd", PropertyValue.STRING);
    public static final MCCPropertyKey<String> BUG_REPORT_LINK = new MCCPropertyKey<>("bug-report-link", PropertyValue.STRING);
    public static final MCCPropertyKey<Boolean> FORCE_GAME_MODE = new MCCPropertyKey<>("force-gamemode", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<Boolean> ENFORCE_WHITELIST = new MCCPropertyKey<>("enforce-whitelist", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<String> LEVEL_NAME = new MCCPropertyKey<>("level-name", PropertyValue.STRING);
    public static final MCCPropertyKey<Integer> SERVER_PORT = new MCCPropertyKey<>("server-port", PropertyValue.INTEGER);
    public static final MCCPropertyKey<Boolean> ANNOUNCE_PLAYER_ACHIEVEMENTS = new MCCPropertyKey<>("announce-player-achievements", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<Boolean> ENABLE_QUERY = new MCCPropertyKey<>("enable-query", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<Integer> QUERY_PORT = new MCCPropertyKey<>("query-port", PropertyValue.INTEGER);
    public static final MCCPropertyKey<Boolean> ENABLE_RCON = new MCCPropertyKey<>("enable-rcon", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<Integer> RCON_PORT = new MCCPropertyKey<>("rcon-port", PropertyValue.INTEGER);
    public static final MCCPropertyKey<String> RCON_PASSWORD = new MCCPropertyKey<>("rcon-password", PropertyValue.STRING);
    public static final MCCPropertyKey<Boolean> HARDCORE = new MCCPropertyKey<>("hardcore", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<Boolean> ALLOW_NETHER = new MCCPropertyKey<>("allow-nether", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<Boolean> SPAWN_MONSTERS = new MCCPropertyKey<>("spawn-monsters", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<Boolean> USE_NATIVE_TRANSPORT = new MCCPropertyKey<>("use-native-transport", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<Boolean> ENABLE_COMMAND_BLOCK = new MCCPropertyKey<>("enable-command-block", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<Integer> SPAWN_PROTECTION = new MCCPropertyKey<>("spawn-protection", PropertyValue.INTEGER);
    public static final MCCPropertyKey<Integer> OP_PERMISSION_LEVEL = new MCCPropertyKey<>("op-permission-level", PropertyValue.INTEGER);
    public static final MCCPropertyKey<Integer> FUNCTION_PERMISSION_LEVEL = new MCCPropertyKey<>("function-permission-level", PropertyValue.INTEGER);
    public static final MCCPropertyKey<Long> MAX_TICK_TIME = new MCCPropertyKey<>("max-tick-time", PropertyValue.LONG);
    public static final MCCPropertyKey<Integer> MAX_CHAINED_NEIGHBOR_UPDATES = new MCCPropertyKey<>("max-chained-neighbor-updates", PropertyValue.INTEGER);
    public static final MCCPropertyKey<Integer> RATE_LIMIT_PACKETS_PER_SECOND = new MCCPropertyKey<>("rate-limit-packets-per-second", PropertyValue.INTEGER);
    public static final MCCPropertyKey<Integer> VIEW_DISTANCE = new MCCPropertyKey<>("view-distance", PropertyValue.INTEGER);
    public static final MCCPropertyKey<Integer> SIMULATION_DISTANCE = new MCCPropertyKey<>("simulation-distance", PropertyValue.INTEGER);
    public static final MCCPropertyKey<Integer> MAX_PLAYERS = new MCCPropertyKey<>("max-players", PropertyValue.INTEGER);
    public static final MCCPropertyKey<Integer> NETWORK_COMPRESSION_THRESHOLD = new MCCPropertyKey<>("network-compression-threshold", PropertyValue.INTEGER);
    public static final MCCPropertyKey<Boolean> BROADCAST_RCON_TO_OPS = new MCCPropertyKey<>("broadcast-rcon-to-ops", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<Boolean> BROADCAST_CONSOLE_TO_OPS = new MCCPropertyKey<>("broadcast-console-to-ops", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<Integer> MAX_WORLD_SIZE = new MCCPropertyKey<>("max-world-size", PropertyValue.INTEGER);
    public static final MCCPropertyKey<Boolean> SYNC_CHUNK_WRITES = new MCCPropertyKey<>("sync-chunk-writes", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<String> REGION_FILE_COMPRESSION = new MCCPropertyKey<>("region-file-compression", PropertyValue.STRING);
    public static final MCCPropertyKey<Boolean> ENABLE_JMX_MONITORING = new MCCPropertyKey<>("enable-jmx-monitoring", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<Boolean> ENABLE_STATUS = new MCCPropertyKey<>("enable-status", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<Boolean> HIDE_ONLINE_PLAYERS = new MCCPropertyKey<>("hide-online-players", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<Integer> ENTITY_BROADCAST_RANGE_PERCENTAGE = new MCCPropertyKey<>("entity-broadcast-range-percentage", PropertyValue.INTEGER);
    public static final MCCPropertyKey<String> TEXT_FILTERING_CONFIG = new MCCPropertyKey<>("text-filtering-config", PropertyValue.STRING);
    public static final MCCPropertyKey<Integer> PLAYER_IDLE_TIMEOUT = new MCCPropertyKey<>("player-idle-timeout", PropertyValue.INTEGER);
    public static final MCCPropertyKey<Boolean> WHITE_LIST = new MCCPropertyKey<>("white-list", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<Boolean> ENFORCE_SECURE_PROFILE = new MCCPropertyKey<>("enforce-secure-profile", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<Boolean> LOG_IPS = new MCCPropertyKey<>("log-ips", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<Boolean> ACCEPTS_TRANSFERS = new MCCPropertyKey<>("accepts-transfers", PropertyValue.BOOLEAN);

    public static final MCCPropertyKey<String> RESOURCE_PACK_ID = new MCCPropertyKey<>("resource-pack-id", PropertyValue.STRING);
    public static final MCCPropertyKey<String> RESOURCE_PACK = new MCCPropertyKey<>("resource-pack", PropertyValue.STRING);
    public static final MCCPropertyKey<String> RESOURCE_PACK_SHA1 = new MCCPropertyKey<>("resource-pack-sha1", PropertyValue.STRING);
    public static final MCCPropertyKey<Boolean> RESOURCE_PACK_REQUIRE = new MCCPropertyKey<>("require-resource-pack", PropertyValue.BOOLEAN);
    public static final MCCPropertyKey<String> RESOURCE_PACK_PROMPT = new MCCPropertyKey<>("resource-pack-prompt", PropertyValue.STRING);

    public static final MCCPropertyKey<List<String>> INITIAL_ENABLED_PACKS = new MCCPropertyKey<>("initial-enabled-packs", PropertyValue.STRING_LIST);
    public static final MCCPropertyKey<List<String>> INITIAL_DISABLED_PACKS = new MCCPropertyKey<>("initial-disabled-packs", PropertyValue.STRING_LIST);

    public static final MCCPropertyKey<String> DIFFICULTY = new MCCPropertyKey<>("difficulty", PropertyValue.STRING);
    public static final MCCPropertyKey<String> GAMEMODE = new MCCPropertyKey<>("gamemode", PropertyValue.STRING);
}
