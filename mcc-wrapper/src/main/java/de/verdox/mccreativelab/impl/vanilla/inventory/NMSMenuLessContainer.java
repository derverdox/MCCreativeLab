package de.verdox.mccreativelab.impl.vanilla.inventory;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCContainerSource;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.AbstractContainerMenu;

/**
 * Describes an nms container that has no menu attached to it.
 *
 * @param <T> The container source type
 */
public abstract class NMSMenuLessContainer<T extends MCCContainerSource> extends NMSContainer<T, AbstractContainerMenu> implements MCCContainer<T> {
    protected final Container container;

    public NMSMenuLessContainer(Container container) {
        super(null);
        this.container = container;
    }

    @Override
    protected Container getNMSContainer(AbstractContainerMenu abstractContainerMenu) {
        return container;
    }
}
