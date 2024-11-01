package de.verdox.mccreativelab.wrapper.block;

import de.verdox.mccreativelab.wrapper.MCCBlockSoundGroup;
import de.verdox.mccreativelab.wrapper.MCCLocation;
import de.verdox.mccreativelab.wrapper.MCCWrapped;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface MCCBlockType extends MCCWrapped {

    void setBlock(@NotNull MCCLocation location);

    List<MCCBlockData> getAllBlockStates();

    MCCBlockSoundGroup getSoundGroup();
}
