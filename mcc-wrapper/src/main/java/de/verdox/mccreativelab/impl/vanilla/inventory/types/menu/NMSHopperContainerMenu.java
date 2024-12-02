package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCHopperContainerMenu;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import net.minecraft.world.inventory.HopperMenu;

public class NMSHopperContainerMenu extends NMSContainerMenu<MCCBlockContainerSource, HopperMenu, MCCContainer> implements MCCHopperContainerMenu {
    public static final MCCConverter<HopperMenu, NMSHopperContainerMenu> CONVERTER = converter(NMSHopperContainerMenu.class, HopperMenu.class, NMSHopperContainerMenu::new, MCCHandle::getHandle);

    public NMSHopperContainerMenu(HopperMenu container) {
        super(container);
    }

    @Override
    public MCCContainer getContainer() {
        return conversionService.wrap(readContainerFromField("hopper"));
    }
}
