package de.verdox.mccreativelab.impl.vanilla.inventory;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCContainerSource;
import net.minecraft.world.Container;
import org.jetbrains.annotations.Nullable;

/**
 * Describes an nms container that has no menu attached to it.
 * @param <T> The container source type
 */
public class NMSMenuLessChildContainer<T extends MCCContainerSource> extends NMSMenuLessContainer<T> implements MCCContainer<T> {
    private final NMSContainer<T, ?> parent;

    public NMSMenuLessChildContainer(NMSContainer<T,?> parent, Container container) {
        super(container);
        this.parent = parent;
    }

    @Override
    public MCCMenuType getType() {
        return parent.getType();
    }

    @Override
    public boolean canBeOpened() {
        return parent.canBeOpened();
    }

    @Override
    public @Nullable T getSource() {
        return parent.getSource();
    }
}
