package de.verdox.mccreativelab.impl.vanilla.inventory.types;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainer;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSMenuLessChildContainer;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.exceptions.OperationNotPossibleOnNMS;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.inventory.types.MCCAnvilContainer;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.AnvilMenu;
import net.minecraft.world.inventory.ItemCombinerMenu;
import org.jetbrains.annotations.Nullable;

public class NMSAnvilContainer extends NMSContainer<MCCBlockContainerSource, AnvilMenu> implements MCCAnvilContainer {
    public static final MCCConverter<AnvilMenu, NMSAnvilContainer> CONVERTER = converter(NMSAnvilContainer.class, AnvilMenu.class, NMSAnvilContainer::new, MCCHandle::getHandle);

    public NMSAnvilContainer(AnvilMenu container) {
        super(container);
    }

    @Override
    protected Container getNMSContainer(AnvilMenu abstractContainerMenu) {
        throw new RuntimeException("This function is not supported by " + getClass().getCanonicalName());
    }

    @Override
    public @Nullable String getTextFieldText() {
        return getHandle().itemName;
    }

    @Override
    public int getRepairItemCountCost() {
        return getHandle().repairItemCountCost;
    }

    @Override
    public int getRepairCost() {
        return getHandle().cost.get();
    }

    @Override
    public void setRepairItemCountCost(int amount) {
        getHandle().repairItemCountCost = amount;
    }

    @Override
    public void setRepairCost(int cost) {
        getHandle().cost.set(cost);
    }

    @Override
    public boolean bypassesEnchantmentLevelRestriction() {
        throw new OperationNotPossibleOnNMS();
    }

    @Override
    public void bypassEnchantmentLevelRestriction(boolean bypassEnchantmentLevelRestriction) {
        throw new OperationNotPossibleOnNMS();
    }

    @Override
    public MCCContainer<MCCBlockContainerSource> getResultInventory() {
        Container result = readContainerFromField(ItemCombinerMenu.class, "resultSlots");
        return new NMSMenuLessChildContainer<>(this, result);
    }

    @Override
    public MCCContainer<MCCBlockContainerSource> getIngredientsInventory() {
        Container inputs = readContainerFromField(ItemCombinerMenu.class, "inputSlots");
        return new NMSMenuLessChildContainer<>(this, inputs);
    }
}
