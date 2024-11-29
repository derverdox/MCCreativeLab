package de.verdox.mccreativelab.wrapper.block.settings;

import de.verdox.mccreativelab.wrapper.annotations.MCCInstantiationSource;
import de.verdox.mccreativelab.wrapper.annotations.MCCLogic;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.registry.MCCTag;

/**
 * Settings that are used to change furnace settings
 */
@MCCLogic
public interface MCCFurnaceSettings {
    /**
     * Adds a particular item type as fuel for all furnaces with minecraft logic kept in mind
     *
     * @param mccItemType     the type
     * @param durationInTicks the burn time in ticks
     */
    default void addFuel(MCCItemType mccItemType, int durationInTicks) {
        addFurnaceFuel(mccItemType, durationInTicks);
        addSmokerFuel(mccItemType, durationInTicks / 2);
        addBlastingFurnaceFuel(mccItemType, durationInTicks / 2);
    }

    /**
     * Adds a particular item type as fuel for furnaces
     *
     * @param mccItemType     the type
     * @param durationInTicks the burn time in ticks
     */
    void addFurnaceFuel(MCCItemType mccItemType, int durationInTicks);

    /**
     * Adds a particular item type as fuel for furnaces
     *
     * @param mccItemType     the types
     * @param durationInTicks the burn time in ticks
     */
    default void addFurnaceFuel(MCCTag<MCCItemType> mccItemType, int durationInTicks){
        for (MCCReference<MCCItemType> value : mccItemType.getValues()) {
            addFurnaceFuel(value.get(), durationInTicks);
        }
    }

    /**
     * Adds a particular item type as fuel for smokers
     *
     * @param mccItemType     the type
     * @param durationInTicks the burn time in ticks
     */
    void addSmokerFuel(MCCItemType mccItemType, int durationInTicks);

    /**
     * Adds a particular item type as fuel for smokers
     *
     * @param mccItemType     the types
     * @param durationInTicks the burn time in ticks
     */
    default void addSmokerFuel(MCCTag<MCCItemType> mccItemType, int durationInTicks){
        for (MCCReference<MCCItemType> value : mccItemType.getValues()) {
            addFurnaceFuel(value.get(), durationInTicks);
        }
    }

    /**
     * Adds a particular item type as fuel for blast furnaces
     *
     * @param mccItemType     the types
     * @param durationInTicks the burn time in ticks
     */
    void addBlastingFurnaceFuel(MCCItemType mccItemType, int durationInTicks);

    /**
     * Adds a particular item type as fuel for blasting furnaces
     *
     * @param mccItemType     the types
     * @param durationInTicks the burn time in ticks
     */
    default void addBlastingFurnaceFuel(MCCTag<MCCItemType> mccItemType, int durationInTicks){
        for (MCCReference<MCCItemType> value : mccItemType.getValues()) {
            addFurnaceFuel(value.get(), durationInTicks);
        }
    }

    /**
     * Returns the furnace fuel burn duration or -1 if the type cannot be used as fuel in furnaces
     *
     * @param mccItemType the item type
     * @return the burn duration or -1
     */
    int getFurnaceFuelBurnDuration(MCCItemType mccItemType);

    /**
     * Returns the blast furnace fuel burn duration or -1 if the type cannot be used as fuel in blast furnaces
     *
     * @param mccItemType the item type
     * @return the burn duration or -1
     */
    int getBlastFurnaceFuelBurnDuration(MCCItemType mccItemType);

    /**
     * Returns the smoker fuel burn duration or -1 if the type cannot be used as fuel in smokers
     *
     * @param mccItemType the item type
     * @return the burn duration or -1
     */
    int getSmokerFuelBurnDuration(MCCItemType mccItemType);
}
