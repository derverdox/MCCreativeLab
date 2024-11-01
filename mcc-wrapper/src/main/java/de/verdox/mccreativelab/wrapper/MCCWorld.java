package de.verdox.mccreativelab.wrapper;

import de.verdox.mccreativelab.wrapper.block.MCCBlockData;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;

import java.util.Objects;

public interface MCCWorld extends MCCWrapped {

    MCCBlockData getBlockDataAt(int x, int y, int z);
    MCCBlockType getBlockTypeAt(int x, int y, int z);
}
