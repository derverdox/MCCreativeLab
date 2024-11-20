package de.verdox.mccreativelab.wrapper.world;

import de.verdox.mccreativelab.wrapper.MCCWrapped;

public record MCCLocation(MCCWorld world, double x, double y, double z, float yaw, float pitch) implements MCCWrapped {
    public MCCLocation(MCCWorld world, double x, double y, double z) {
        this(world, x, y, z, 0, 0);
    }
}
