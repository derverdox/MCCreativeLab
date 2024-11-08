package de.verdox.mccreativelab.wrapper.entity;

import org.jetbrains.annotations.Nullable;

/**
 * Holds temporary data that is never stored on the server.
 * If for example an {@link MCCEntity} holds temporary data and is unloaded
 * the data is gone.
 */
public interface TempData {
    <T> void storeData(String key, T data);

    @Nullable <T> T getData(Class<T> type, String key);

    boolean containsData(String key);

    void removeData(String key);
}
