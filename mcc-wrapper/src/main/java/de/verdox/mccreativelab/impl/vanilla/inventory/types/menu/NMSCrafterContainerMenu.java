package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu;

import com.google.common.base.Preconditions;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainerMenu;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSResultContainer;
import de.verdox.mccreativelab.wrapper.inventory.types.container.MCCResultContainer;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCCrafterContainerMenu;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import net.minecraft.world.inventory.CrafterMenu;

public class NMSCrafterContainerMenu extends NMSContainerMenu<MCCBlockContainerSource, CrafterMenu, MCCResultContainer> implements MCCCrafterContainerMenu {
    public static final MCCConverter<CrafterMenu, NMSCrafterContainerMenu> CONVERTER = converter(NMSCrafterContainerMenu.class, CrafterMenu.class, NMSCrafterContainerMenu::new, MCCHandle::getHandle);

    public NMSCrafterContainerMenu(CrafterMenu abstractContainerMenu) {
        super(abstractContainerMenu);
    }

    @Override
    public boolean isSlotDisabled(int slot) {
        return this.getHandle().isSlotDisabled(slot);
    }

    @Override
    public boolean isPowered() {
        return this.getHandle().isPowered();
    }

    @Override
    public void setPowered(boolean value) {
        readContainerDataFromField("containerData").set(9, value ? 1 : 0);
    }

    @Override
    public void setSlotDisabled(int slot, boolean disabled) {
        Preconditions.checkArgument(slot >= 0 && slot < 9, "Invalid slot index %s for Crafter", slot);
        this.getHandle().setSlotState(slot, !disabled);
    }

    @Override
    public MCCResultContainer getContainer() {
        return new NMSResultContainer(readContainerFromField("container"), readContainerFromField("resultContainer"));
    }
}
