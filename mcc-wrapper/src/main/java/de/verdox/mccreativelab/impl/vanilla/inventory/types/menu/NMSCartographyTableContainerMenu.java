package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainerMenu;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSResultContainer;
import de.verdox.mccreativelab.wrapper.inventory.types.container.MCCResultContainer;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCCartographyTableContainerMenu;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import net.minecraft.world.inventory.CartographyTableMenu;

public class NMSCartographyTableContainerMenu extends NMSContainerMenu<MCCBlockContainerSource, CartographyTableMenu, MCCResultContainer> implements MCCCartographyTableContainerMenu {
    public static final MCCConverter<CartographyTableMenu, NMSCartographyTableContainerMenu> CONVERTER = converter(NMSCartographyTableContainerMenu.class, CartographyTableMenu.class, NMSCartographyTableContainerMenu::new, MCCHandle::getHandle);

    public NMSCartographyTableContainerMenu(CartographyTableMenu abstractContainerMenu) {
        super(abstractContainerMenu);
    }

    @Override
    public MCCResultContainer getContainer() {
        return new NMSResultContainer(readContainerFromField("container"), readContainerFromField("resultContainer"));
    }
}
