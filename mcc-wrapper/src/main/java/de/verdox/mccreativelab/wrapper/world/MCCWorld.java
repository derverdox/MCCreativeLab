package de.verdox.mccreativelab.wrapper.world;

import de.verdox.mccreativelab.wrapper.MCCKeyedWrapper;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.entity.TempData;
import net.kyori.adventure.audience.Audience;

import java.util.UUID;

public interface MCCWorld extends MCCKeyedWrapper, TempData {

    MCCBlockState getBlockDataAt(int x, int y, int z);

    MCCBlockType getBlockTypeAt(int x, int y, int z);

    Audience asAudience();

    UUID getUUID();
}
