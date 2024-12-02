package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCDispenserContainerMenu;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import net.minecraft.world.inventory.DispenserMenu;

public class NMSDispenserContainerMenu extends NMSContainerMenu<MCCBlockContainerSource, DispenserMenu, MCCContainer> implements MCCDispenserContainerMenu {
    public static final MCCConverter<DispenserMenu, NMSDispenserContainerMenu> CONVERTER = converter(NMSDispenserContainerMenu.class, DispenserMenu.class, NMSDispenserContainerMenu::new, MCCHandle::getHandle);

    public NMSDispenserContainerMenu(DispenserMenu container) {
        super(container);
    }

    @Override
    public MCCContainer getContainer() {
        return conversionService.wrap(readContainerDataFromField("dispenser"));
    }
}
