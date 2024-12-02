package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCChestContainerMenu;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import net.minecraft.world.inventory.ChestMenu;

public class NMSChestContainerMenu extends NMSContainerMenu<MCCBlockContainerSource, ChestMenu, MCCContainer> implements MCCChestContainerMenu {
    public static final MCCConverter<ChestMenu, NMSChestContainerMenu> CONVERTER = converter(NMSChestContainerMenu.class, ChestMenu.class, NMSChestContainerMenu::new, MCCHandle::getHandle);

    public NMSChestContainerMenu(ChestMenu abstractContainerMenu) {
        super(abstractContainerMenu);
    }

    @Override
    public MCCContainer getContainer() {
        return conversionService.wrap(readContainerFromField("container"));
    }
}
