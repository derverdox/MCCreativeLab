package de.verdox.mccreativelab.impl.vanilla.inventory;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.types.container.MCCResultContainer;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.minecraft.world.Container;

public class NMSResultContainer implements MCCResultContainer {
    private final Container ingredientsInventory;
    private final Container resultInventory;

    public NMSResultContainer(Container ingredientsInventory, Container resultInventory){
        this.ingredientsInventory = ingredientsInventory;
        this.resultInventory = resultInventory;
    }

    @Override
    public MCCContainer getResultInventory() {
        return MCCPlatform.getInstance().getConversionService().wrap(resultInventory);
    }

    @Override
    public MCCContainer getIngredientsInventory() {
        return MCCPlatform.getInstance().getConversionService().wrap(ingredientsInventory);
    }
}
