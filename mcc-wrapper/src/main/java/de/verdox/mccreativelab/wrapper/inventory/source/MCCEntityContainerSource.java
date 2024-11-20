package de.verdox.mccreativelab.wrapper.inventory.source;

import de.verdox.mccreativelab.wrapper.entity.MCCEntity;

public interface MCCEntityContainerSource<T extends MCCEntity> extends MCCContainerSource {
    T getEntity();
}
