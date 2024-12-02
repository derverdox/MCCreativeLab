package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainer;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCBeaconContainerMenu;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import net.minecraft.world.inventory.BeaconMenu;

public class NMSBeaconContainerMenu extends NMSContainerMenu<MCCBlockContainerSource, BeaconMenu, MCCContainer> implements MCCBeaconContainerMenu {
    public static final MCCConverter<BeaconMenu, NMSBeaconContainerMenu> CONVERTER = converter(NMSBeaconContainerMenu.class, BeaconMenu.class, NMSBeaconContainerMenu::new, MCCHandle::getHandle);

    public NMSBeaconContainerMenu(BeaconMenu abstractContainerMenu) {
        super(abstractContainerMenu);
    }

    @Override
    public MCCContainer getContainer() {
        return conversionService.wrap(readContainerFromField("beacon"));
    }
}
