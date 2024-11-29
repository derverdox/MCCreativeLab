package de.verdox.mccreativelab.wrapper.event;

public interface MCCCancellable {
    /**
     * Checks if the event was cancelled
     *
     * @return true if the event was cancelled
     */
    boolean isCancelled();

    /**
     * Changes the cancel value of the event
     *
     * @param cancelled the new cancel value
     */
    void setCancelled(boolean cancelled);
}
