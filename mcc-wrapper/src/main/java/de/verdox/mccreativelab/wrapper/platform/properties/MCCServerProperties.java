package de.verdox.mccreativelab.wrapper.platform.properties;

import java.util.Properties;

public record MCCServerProperties(Properties properties) {
    /**
     * Reads a value from the servers server property file
     *
     * @param key the key
     * @param <T> the generic value type
     * @return the value
     */
    public <T> T read(MCCPropertyKey<T> key){
        return key.type().read(key.id(), properties);
    }

    /**
     * Writes a value to the server property file
     *
     * @param key   the key
     * @param value the new value
     * @param <T>   the generic value type
     */
    public <T> void write(MCCPropertyKey<T> key, T value){
        key.type().write(key.id(), properties, value);
    }
}
