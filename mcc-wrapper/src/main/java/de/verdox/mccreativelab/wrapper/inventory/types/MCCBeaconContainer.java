package de.verdox.mccreativelab.wrapper.inventory.types;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuTypes;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import org.jetbrains.annotations.Nullable;

public interface MCCBeaconContainer extends MCCContainer<MCCBlockContainerSource> {
    //TODO: Create Wrappers for PotionEffectTypes -> get / set PrimaryBeaconEffect() //// get / set SecondaryBeaconEffect()
    /**
     * Set the item powering the beacon.
     *
     * @param item The new item
     */
    default void setItem(MCCItemStack item) {
        this.setItem(0, item);
    }

    /**
     * Get the item powering the beacon.
     *
     * @return The current item.
     */
    @Nullable
    default MCCItemStack getItem(){
        return this.getItem(0);
    }

    @Override
    default MCCMenuType getType() {
        return MCCMenuTypes.BEACON;
    }

    @Override
    default boolean canBeOpened() {
        return true;
    }
}
