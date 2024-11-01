package de.verdox.mccreativelab.wrapper.block;

import de.verdox.mccreativelab.wrapper.MCCLocation;
import de.verdox.mccreativelab.wrapper.MCCWrapped;
import org.jetbrains.annotations.NotNull;

public interface MCCBlockData extends MCCWrapped {

    @NotNull MCCBlockType getBlockType();

    default void setBlock(@NotNull MCCLocation location){
        setBlock(location, true);
    }
    void setBlock(@NotNull MCCLocation  location, boolean applyPhysics);
}
