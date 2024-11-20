package de.verdox.mccreativelab.impl.vanilla.inventory.types;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainer;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.inventory.types.MCCBeaconContainer;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.BeaconMenu;

public class NMSBeaconContainer extends NMSContainer<MCCBlockContainerSource, BeaconMenu> implements MCCBeaconContainer {
    public static final MCCConverter<BeaconMenu, NMSBeaconContainer> CONVERTER = converter(NMSBeaconContainer.class, BeaconMenu.class, NMSBeaconContainer::new, NMSHandle::getHandle);

    public NMSBeaconContainer(BeaconMenu abstractContainerMenu) {
        super(abstractContainerMenu);
    }

    @Override
    protected Container getNMSContainer(BeaconMenu abstractContainerMenu) {
        return readContainerFromField("beacon");
    }
}
