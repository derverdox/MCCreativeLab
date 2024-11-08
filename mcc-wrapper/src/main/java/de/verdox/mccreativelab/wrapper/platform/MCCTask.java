package de.verdox.mccreativelab.wrapper.platform;

/**
 * A task scheduled by the {@link MCCTaskManager}
 */
public interface MCCTask {
    /**
     * Cancels this task
     */
    void cancel();

    /**
     * Gets the id of the task
     *
     * @return the id
     */
    long id();

    /**
     * Returns true if the task is still running
     *
     * @return true if the task is running
     */
    boolean isRunning();
}
