package de.verdox.mccreativelab.wrapper.event;

public interface MCCEvent {
    default boolean callEvent(){
        //MCCPlatform.getInstance().callEvent(this);
        if (this instanceof MCCCancellable) {
            return !((MCCCancellable) this).isCancelled();
        } else {
            return true;
        }
    }

    default String getEventName(){
        return getClass().getSimpleName();
    }
}
