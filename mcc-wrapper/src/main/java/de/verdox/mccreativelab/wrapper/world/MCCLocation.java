package de.verdox.mccreativelab.wrapper.world;

import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.block.MCCBlock;
import org.bukkit.util.NumberConversions;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public record MCCLocation(MCCWorld world, double x, double y, double z, float yaw, float pitch) implements MCCWrapped {

    public static final int CHUNK_X_LENGTH = 16;
    public static final int CHUNK_Z_LENGTH = 16;

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

    public CompletableFuture<MCCBlock> getBlock(){
        return world().getBlockAt(this);
    }

    @Nullable
    public MCCBlock getBlockNow(){
        return world().getBlockAt(this).getNow(null);
    }

    public int toChunkBlockLocalX() {
        return Math.floorMod(blockX(), CHUNK_X_LENGTH);
    }

    public int toChunkBlockLocalY() {
        return blockY();
    }

    public int toChunkBlockLocalZ() {
        return Math.floorMod(blockZ(), CHUNK_Z_LENGTH);
    }

    public int getChunkX(){
        return calculateChunkX(blockX());
    }

    public int getChunkZ(){
        return calculateChunkZ(blockZ());
    }

    public static int calculateChunkX(int globalX){
        return globalX / 16;
    }

    public static int calculateChunkZ(int globalZ){
        return globalZ / 16;
    }

    public int blockX(){
        return (int) x();
    }

    public int blockY(){
        return (int) y();
    }

    public int blockZ(){
        return (int) z();
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

    /**
     * Check if each component of this Location is finite.
     *
     * @throws IllegalArgumentException if any component is not finite
     */
    public void checkFinite() throws IllegalArgumentException {
        NumberConversions.checkFinite(x, "x not finite");
        NumberConversions.checkFinite(y, "y not finite");
        NumberConversions.checkFinite(z, "z not finite");
        NumberConversions.checkFinite(pitch, "pitch not finite");
        NumberConversions.checkFinite(yaw, "yaw not finite");
    }
}
