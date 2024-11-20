package de.verdox.mccreativelab.wrapper.inventory.source;

import de.verdox.mccreativelab.wrapper.block.MCCBlock;
import org.jetbrains.annotations.NotNull;

public interface MCCBlockContainerSource extends MCCContainerSource {
    @NotNull MCCBlock getBlock();
}
