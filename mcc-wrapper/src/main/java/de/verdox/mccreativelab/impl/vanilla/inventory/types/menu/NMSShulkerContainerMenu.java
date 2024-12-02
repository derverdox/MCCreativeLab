package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCShulkerContainerMenu;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import net.minecraft.world.inventory.ShulkerBoxMenu;

public class NMSShulkerContainerMenu extends NMSContainerMenu<MCCBlockContainerSource, ShulkerBoxMenu, MCCContainer> implements MCCShulkerContainerMenu {
    public static final MCCConverter<ShulkerBoxMenu, NMSShulkerContainerMenu> CONVERTER = converter(NMSShulkerContainerMenu.class, ShulkerBoxMenu.class, NMSShulkerContainerMenu::new, MCCHandle::getHandle);

    public NMSShulkerContainerMenu(ShulkerBoxMenu abstractContainerMenu) {
        super(abstractContainerMenu);
    }

    @Override
    public MCCContainer getContainer() {
        return conversionService.wrap(readContainerDataFromField("container"));
    }
}
