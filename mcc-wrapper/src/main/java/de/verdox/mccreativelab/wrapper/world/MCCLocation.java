package de.verdox.mccreativelab.wrapper.world;

import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.block.MCCBlock;
import org.bukkit.util.NumberConversions;
import org.jetbrains.annotations.NotNull;

public record MCCLocation(MCCWorld world, double x, double y, double z, float yaw, float pitch) implements MCCWrapped {
    public MCCLocation(MCCWorld world, double x, double y, double z) {
        this(world, x, y, z, 0, 0);
    }

    public MCCLocation above() {
        return new MCCLocation(this.world(), this.x(), this.y() + 1, this.z(), this.yaw(), this.pitch());
    }

    public MCCLocation below() {
        return new MCCLocation(this.world(), this.x(), this.y() - 1, this.z(), this.yaw(), this.pitch());
    }

    public MCCLocation left() {
        return new MCCLocation(this.world(), this.x() - 1, this.y(), this.z(), this.yaw(), this.pitch());
    }

    public MCCLocation right() {
        return new MCCLocation(this.world(), this.x() + 1, this.y(), this.z(), this.yaw(), this.pitch());
    }

    public MCCLocation forward() {
        return new MCCLocation(this.world(), this.x(), this.y(), this.z() + 1, this.yaw(), this.pitch());
    }

    public MCCLocation backward() {
        return new MCCLocation(this.world(), this.x(), this.y(), this.z() - 1, this.yaw(), this.pitch());
    }

    public MCCBlock getBlock(){
        return world().getBlockAt(this);
    }

    public double distanceSquared(@NotNull MCCLocation o) {
        if (o == null) {
            throw new IllegalArgumentException("Cannot measure distance to a null location");
        } else if (o.world() == null || world() == null) {
            throw new IllegalArgumentException("Cannot measure distance to a null world");
        } else if (o.world() != world()) {
            throw new IllegalArgumentException("Cannot measure distance between " + world().getName() + " and " + o.world().getName());
        }

        return NumberConversions.square(x - o.x) + NumberConversions.square(y - o.y) + NumberConversions.square(z - o.z);
    }
}
