package de.verdox.mccreativelab.wrapper.platform;

import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Holds temporary data that is never stored on the server.
 * If for example an {@link MCCEntity} holds temporary data and is unloaded
 * the data is gone.
 */
public class TempData {

    private final Map<String, Object> cache = new ConcurrentHashMap<>();

    public <T> void storeData(String key, T data){
        cache.put(key, data);
    }

    public @Nullable <T> T getData(Class<T> type, String key){
        if(!containsData(key))
            return null;
        return type.cast(cache.get(key));
    }

    public @Nullable <T> T getData(String key){
        if(!containsData(key))
            return null;
        return (T) cache.get(key);
    }


    public boolean containsData(String key){
        return cache.containsKey(key);
    }

    public void removeData(String key){
        cache.remove(key);
    }
}
