package de.verdox.mccreativelab.wrapper.platform.adapter;

import de.verdox.mccreativelab.wrapper.block.MCCBlock;
import de.verdox.mccreativelab.wrapper.block.MCCBlockFace;
import de.verdox.mccreativelab.wrapper.block.MCCBlockSoundGroup;
import net.kyori.adventure.text.Component;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class MCCAdapters {
    private static final Map<Class<?>, MCCAdapter<?>> TYPE_TO_ADAPTER_MAPPING = new ConcurrentHashMap<>();
    private static final Map<Class<?>, MCCAdapter<?>> FIND_ADAPTER_CACHE = new ConcurrentHashMap<>();

    public static final MCCAdapter<MCCBlock> BLOCK = register(MCCBlock.class);
    public static final MCCAdapter<MCCBlockFace> BLOCK_FACE = register(MCCBlockFace.class);
    public static final MCCAdapter<MCCBlockSoundGroup> BLOCK_SOUND_GROUP = register(MCCBlockSoundGroup.class);
    public static final MCCAdapter<Component> COMPONENT = register(Component.class);

    public static <T> MCCAdapter<T> register(Class<T> type) {
        if (TYPE_TO_ADAPTER_MAPPING.containsKey(type))
            throw new IllegalArgumentException("The type " + type + " already has an mcc adapter");
        MCCAdapter<T> adapter = new MCCAdapter<>(type);
        TYPE_TO_ADAPTER_MAPPING.put(type, adapter);
        return adapter;
    }

    public static <T> MCCAdapter<T> getAdapter(Class<T> type) {
        if (!TYPE_TO_ADAPTER_MAPPING.containsKey(type))
            return register(type);
        return (MCCAdapter<T>) TYPE_TO_ADAPTER_MAPPING.get(type);
    }

    /**
     * Searches for the right adapter and tries to wrap the provided platform object.
     * If the platform object could not be wrapped an {@link NoAdapterFoundException} is thrown.
     *
     * @param platformObjectToWrap the platform object
     * @return the wrapped object
     * @throws NoAdapterFoundException if no adapter was found
     */
    public static Object tryWrap(Object platformObjectToWrap) throws NoAdapterFoundException {
        if(FIND_ADAPTER_CACHE.containsKey(platformObjectToWrap.getClass()))
            return FIND_ADAPTER_CACHE.get(platformObjectToWrap.getClass()).wrap(platformObjectToWrap);

        return TYPE_TO_ADAPTER_MAPPING.values()
            .parallelStream()
            .map(mccAdapter -> {
                try {
                    var wrapped = mccAdapter.wrap(platformObjectToWrap);
                    FIND_ADAPTER_CACHE.put(platformObjectToWrap.getClass(), mccAdapter);
                    return wrapped;
                } catch (Throwable ignored) {
                    return null;
                }
            }).filter(Objects::nonNull)
            .findAny()
            .orElseThrow(() -> new NoAdapterFoundException("No adapter found that could wrap a platform object of type " + platformObjectToWrap.getClass()));
    }
}
