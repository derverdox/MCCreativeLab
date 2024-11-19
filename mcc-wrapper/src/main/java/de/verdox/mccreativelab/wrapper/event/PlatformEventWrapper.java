package de.verdox.mccreativelab.wrapper.event;

import com.google.common.reflect.TypeToken;
import net.kyori.adventure.key.Keyed;

/**
 * The underlying platform may have implemented event listeners we can listen to.
 * We use this class to create a wrapper for these events
 */
public interface PlatformEventWrapper extends Keyed {
    <T> EventArgument<T> getArgument(TypeToken<T> apiType, int index);
    <T> EventArgument<T> getArgument(TypeToken<T> apiType, String name);

    boolean cancelEventIfPossible();
}
