package de.verdox.mccreativelab.wrapper.inventory.types;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuTypes;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;

public interface MCCCrafterContainer extends MCCContainer<MCCBlockContainerSource> {
    /**
     * Checks if the given crafter slot is disabled.
     *
     * @param slot the slot to check
     * @return true if the slot is disabled otherwise false
     */
    boolean isSlotDisabled(int slot);

    /**
     * Checks if this crafter view is powered.
     *
     * @return true if the crafter is powered
     */
    boolean isPowered();

    /**
     * Sets the powered state of the crafter container
     *
     * @param value the value
     */
    void setPowered(boolean value);

    /**
     * Sets the status of the crafter slot.
     *
     * @param slot     the slot to set the status of
     * @param disabled true if the slot should be disabled otherwise false
     */
    void setSlotDisabled(int slot, boolean disabled);

    @Override
    default MCCMenuType getType() {
        return MCCMenuTypes.CRAFTER_3x3;
    }

    @Override
    default boolean canBeOpened() {
        return true;
    }
}
