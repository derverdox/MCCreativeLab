package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainerMenu;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSResultContainer;
import de.verdox.mccreativelab.wrapper.inventory.types.container.MCCResultContainer;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.exceptions.OperationNotPossibleOnNMS;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCAnvilContainerMenu;
import net.minecraft.world.inventory.AnvilMenu;
import org.jetbrains.annotations.Nullable;

public class NMSAnvilContainerMenu extends NMSContainerMenu<MCCBlockContainerSource, AnvilMenu, MCCResultContainer> implements MCCAnvilContainerMenu {
    public static final MCCConverter<AnvilMenu, NMSAnvilContainerMenu> CONVERTER = converter(NMSAnvilContainerMenu.class, AnvilMenu.class, NMSAnvilContainerMenu::new, MCCHandle::getHandle);

    public NMSAnvilContainerMenu(AnvilMenu container) {
        super(container);
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
    public MCCResultContainer getContainer() {
        return new NMSResultContainer(readContainerFromField("inputSlots"), readContainerFromField("resultSlots"));
    }
}
