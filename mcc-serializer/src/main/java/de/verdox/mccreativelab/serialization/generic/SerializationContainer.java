package de.verdox.mccreativelab.serialization.generic;

import org.jetbrains.annotations.ApiStatus;

import java.util.Collection;

@ApiStatus.Experimental
public interface SerializationContainer extends SerializationElement {
    Collection<String> getChildKeys();

    SerializationElement get(String key);

    boolean contains(String key);
}
