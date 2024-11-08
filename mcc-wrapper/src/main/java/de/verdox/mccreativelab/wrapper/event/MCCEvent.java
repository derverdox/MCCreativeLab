package de.verdox.mccreativelab.wrapper.event;

import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;

public interface MCCEvent {
    default boolean callEvent(){
        MCCPlatform.getInstance().callEvent(this);
        if (this instanceof MCCCancellable) {
            return !((MCCCancellable) this).isCancelled();
        } else {
            return true;
        }
    }

    String getEventName();
}
