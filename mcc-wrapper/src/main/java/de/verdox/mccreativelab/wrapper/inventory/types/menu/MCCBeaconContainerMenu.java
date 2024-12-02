package de.verdox.mccreativelab.wrapper.inventory.types.menu;

import de.verdox.mccreativelab.wrapper.inventory.*;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import org.jetbrains.annotations.Nullable;

public interface MCCBeaconContainerMenu extends MCCContainerMenu<MCCBlockContainerSource, MCCContainer> {
    //TODO: Create Wrappers for PotionEffectTypes -> get / set PrimaryBeaconEffect() //// get / set SecondaryBeaconEffect()
    /**
     * Set the item powering the beacon.
     *
     * @param item The new item
     */
    default void setItem(MCCItemStack item) {
        getContainer().setItem(0, item);
    }

    /**
     * Get the item powering the beacon.
     *
     * @return The current item.
     */
    @Nullable
    default MCCItemStack getItem(){
        return getContainer().getItem(0);
    }
}
