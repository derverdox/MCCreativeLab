package de.verdox.mccreativelab.wrapper.annotations;

/**
 * Specifies that this type of minecraft element is hard coded into the game.
 */
public @interface MCCBuiltIn {
    /**
     * Gets the sync state of this builtin element
     *
     * @return the sync state
     */
    SyncState syncState();

    /**
     * Whether the vanilla client would enter a failing game state when a desync happens.
     * A desync normally happens if we add a new element to the platforms native registry.
     * This results in the newly created element being sent to the client at some point while playing.
     * This property will be true if the client will crash as a result from that.
     * <p>
     * Some examples for that are things like custom block types or custom entity types.
     * If this method returns true it means that if you intend to implement a custom type of this type you must always make sure that the client will only receive data he knows.
     * Don't send any custom data to the client! :)
     *
     * @return true if the vanilla client enters an error state on desync
     */
    boolean clientEntersErrorStateOnDesync() default false;

    /**
     * Specifies a sync state for builtin elements.
     */
    enum SyncState {
        /**
         * Fully synced. This element is always sent to the player.
         * Elements do not automatically count as synced if the client knows them at the same time as the server, but they never exchange them (e.g. BlockSoundGroups).
         */
        SYNCED,
        /**
         * Not synced at all. This element only exists on the server.
         */
        NOT_SYNCED,
        /**
         * Partially synced. An example for that are Attributes. Some only exist on the server side, some are synced with the client (like max health).
         */
        PARTIALLY_SYNCED;
    }
}
