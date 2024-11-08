package de.verdox.mccreativelab.wrapper.inventory;

/**
 * A reason for why a container was closed
 *
 * @param id the id of the reason
 */
public record MCCContainerCloseReason(String id) {
    /**
     * The reason is unknown
     */
    public static final MCCContainerCloseReason UNKNOWN = new MCCContainerCloseReason("unknown");
    /**
     * Closed because the viewer was teleported
     */
    public static final MCCContainerCloseReason TELEPORT = new MCCContainerCloseReason("teleport");
    /**
     * Closed because the viewer cannot use the container anymore
     */
    public static final MCCContainerCloseReason CANT_USE = new MCCContainerCloseReason("cannot_use");
    /**
     * Closed because the container was unloaded
     */
    public static final MCCContainerCloseReason UNLOADED = new MCCContainerCloseReason("unloaded");
    /**
     * Closed because the viewer of the container opened a new container
     */
    public static final MCCContainerCloseReason OPEN_NEW = new MCCContainerCloseReason("open_new");
    /**
     * The viewer intentionally closed the container
     */
    public static final MCCContainerCloseReason CLOSED_BY_VIEWER = new MCCContainerCloseReason("viewer");
    /**
     * Closed because the viewer disconnected from the server
     */
    public static final MCCContainerCloseReason DISCONNECT = new MCCContainerCloseReason("disconnect");
    /**
     * Closed because the viewer died
     */
    public static final MCCContainerCloseReason DEATH = new MCCContainerCloseReason("death");
}
