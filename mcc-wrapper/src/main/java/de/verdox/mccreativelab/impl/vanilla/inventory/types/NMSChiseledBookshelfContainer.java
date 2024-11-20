package de.verdox.mccreativelab.impl.vanilla.inventory.types;

import de.verdox.mccreativelab.impl.vanilla.inventory.NMSMenuLessContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.inventory.types.MCCChiseledBookshelfContainer;
import net.minecraft.world.Container;

public class NMSChiseledBookshelfContainer extends NMSMenuLessContainer<MCCBlockContainerSource> implements MCCChiseledBookshelfContainer {

    public NMSChiseledBookshelfContainer(Container container) {
        super(container);
    }

    @Override
    public MCCMenuType getType() {
        return null;
    }
}
