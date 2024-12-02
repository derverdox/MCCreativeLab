package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainerMenu;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSResultContainer;
import de.verdox.mccreativelab.wrapper.inventory.types.container.MCCResultContainer;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCGrindstoneContainerMenu;
import net.minecraft.world.inventory.GrindstoneMenu;

public class NMSGrindstoneContainerMenu extends NMSContainerMenu<MCCBlockContainerSource, GrindstoneMenu, MCCResultContainer> implements MCCGrindstoneContainerMenu {
    public static final MCCConverter<GrindstoneMenu, NMSGrindstoneContainerMenu> CONVERTER = converter(NMSGrindstoneContainerMenu.class, GrindstoneMenu.class, NMSGrindstoneContainerMenu::new, MCCHandle::getHandle);

    public NMSGrindstoneContainerMenu(GrindstoneMenu abstractContainerMenu) {
        super(abstractContainerMenu);
    }

    @Override
    public MCCResultContainer getContainer() {
        return new NMSResultContainer(readContainerFromField("repairSlots"), readContainerFromField("resultSlots"));
    }
}
