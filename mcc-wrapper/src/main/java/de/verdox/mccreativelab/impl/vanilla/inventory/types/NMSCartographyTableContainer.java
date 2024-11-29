package de.verdox.mccreativelab.impl.vanilla.inventory.types;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainer;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.inventory.types.MCCCartographyTableContainer;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.CartographyTableMenu;

public class NMSCartographyTableContainer extends NMSContainer<MCCBlockContainerSource, CartographyTableMenu> implements MCCCartographyTableContainer {
    public static final MCCConverter<CartographyTableMenu, NMSCartographyTableContainer> CONVERTER = converter(NMSCartographyTableContainer.class, CartographyTableMenu.class, NMSCartographyTableContainer::new, MCCHandle::getHandle);

    public NMSCartographyTableContainer(CartographyTableMenu abstractContainerMenu) {
        super(abstractContainerMenu);
    }

    @Override
    protected Container getNMSContainer(CartographyTableMenu abstractContainerMenu) {
        return abstractContainerMenu.container;
    }
}
