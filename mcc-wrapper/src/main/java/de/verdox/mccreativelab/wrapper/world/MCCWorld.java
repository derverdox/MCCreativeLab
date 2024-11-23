package de.verdox.mccreativelab.wrapper.world;

import de.verdox.mccreativelab.wrapper.MCCKeyedWrapper;
import de.verdox.mccreativelab.wrapper.block.MCCBlock;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.entity.MCCEntityType;
import de.verdox.mccreativelab.wrapper.platform.TempDataHolder;
import de.verdox.mccreativelab.wrapper.world.chunk.MCCChunk;
import net.kyori.adventure.audience.Audience;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public interface MCCWorld extends MCCKeyedWrapper, TempDataHolder {

    MCCBlockState getBlockDataAt(int x, int y, int z);

    MCCBlockType getBlockTypeAt(int x, int y, int z);

    MCCBlock getBlockAt(int x, int y, int z);

    default MCCBlockState getBlockDataAt(MCCLocation location) {
        if (!location.world().equals(this)) {
            throw new IllegalArgumentException("The provided location does not belong to this world.");
        }
        return getBlockDataAt((int) location.x(), (int) location.y(), (int) location.z());
    }

    default MCCBlockType getBlockTypeAt(MCCLocation location) {
        if (!location.world().equals(this)) {
            throw new IllegalArgumentException("The provided location does not belong to this world.");
        }
        return getBlockTypeAt((int) location.x(), (int) location.y(), (int) location.z());
    }

    default MCCBlock getBlockAt(MCCLocation location) {
        if (!location.world().equals(this)) {
            throw new IllegalArgumentException("The provided location does not belong to this world.");
        }
        return getBlockAt((int) location.x(), (int) location.y(), (int) location.z());
    }

    /**
     * Changes a block at the provided location to this block state
     *
     * @param mccBlockState the block state
     * @param location      the location to change the block at
     * @param applyPhysics  whether the change should trigger block updates
     */
    void setBlock(@NotNull MCCBlockState mccBlockState, @NotNull MCCLocation location, boolean applyPhysics);

    /**
     * Changes a block at the provided location to this block state
     *
     * @param mccBlockType the block type
     * @param location     the location to change the block at
     * @param applyPhysics whether the change should trigger block updates
     */
    void setBlock(@NotNull MCCBlockType mccBlockType, @NotNull MCCLocation location, boolean applyPhysics);

    CompletableFuture<MCCEntity> teleport(@NotNull MCCLocation location, @NotNull MCCEntity mccEntity);

    CompletableFuture<MCCEntity> summon(@NotNull MCCLocation location, @NotNull MCCEntityType mccEntityType);

    CompletableFuture<MCCChunk> getOrLoadChunk(int x, int z);

    @Nullable MCCChunk getChunkImmediately(int x, int z);

    Audience asAudience();

    UUID getUUID();
}
