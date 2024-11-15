package de.verdox.mccreativelab.wrapper.world;

import de.verdox.mccreativelab.wrapper.MCCWrapped;

public record MCCLocation(MCCWorld world, double x, double y, double z) implements MCCWrapped {
}
