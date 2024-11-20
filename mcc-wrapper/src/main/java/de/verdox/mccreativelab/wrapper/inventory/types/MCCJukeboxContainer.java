package de.verdox.mccreativelab.wrapper.inventory.types;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import org.jetbrains.annotations.Nullable;

public interface MCCJukeboxContainer extends MCCContainer<MCCBlockContainerSource> {
    /**
     * Set the record in the jukebox.
     * <p>
     * This will immediately start playing the inserted item or stop playing if the
     * item provided is null.
     *
     * @param item the new record
     */
    default void setRecord(@Nullable MCCItemStack item){
        if (item == null) {
            removeItem(0); // Second parameter is unused in TileEntityJukebox
        } else {
            this.setItem(0, item);
        }
    }

    /**
     * Get the record in the jukebox.
     *
     * @return the current record
     */
    @Nullable
    default MCCItemStack getRecord(){
        return this.getItem(0);
    }

    @Override
    default boolean canBeOpened() {
        return false;
    }
}
