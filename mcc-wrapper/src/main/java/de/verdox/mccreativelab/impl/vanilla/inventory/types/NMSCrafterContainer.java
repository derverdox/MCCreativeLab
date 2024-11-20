package de.verdox.mccreativelab.impl.vanilla.inventory.types;

import com.google.common.base.Preconditions;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainer;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.inventory.types.MCCCrafterContainer;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.CrafterMenu;

public class NMSCrafterContainer extends NMSContainer<MCCBlockContainerSource, CrafterMenu> implements MCCCrafterContainer {
    public static final MCCConverter<CrafterMenu, NMSCrafterContainer> CONVERTER = converter(NMSCrafterContainer.class, CrafterMenu.class, NMSCrafterContainer::new, NMSHandle::getHandle);

    public NMSCrafterContainer(CrafterMenu abstractContainerMenu) {
        super(abstractContainerMenu);
    }

    @Override
    protected Container getNMSContainer(CrafterMenu abstractContainerMenu) {
        return readContainerFromField("container");
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
}
