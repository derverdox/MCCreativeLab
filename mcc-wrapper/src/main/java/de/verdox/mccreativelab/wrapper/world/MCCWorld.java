package de.verdox.mccreativelab.wrapper.world;

import de.verdox.mccreativelab.wrapper.MCCKeyedWrapper;
import de.verdox.mccreativelab.wrapper.annotations.MCCInstantiationSource;
import de.verdox.mccreativelab.wrapper.block.MCCBlock;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.entity.MCCEntityType;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.platform.TempDataHolder;
import de.verdox.mccreativelab.wrapper.world.chunk.MCCChunk;
import net.kyori.adventure.audience.Audience;
import org.bukkit.Location;
import org.bukkit.craftbukkit.CraftWorld;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public interface MCCWorld extends MCCKeyedWrapper, TempDataHolder {

    default CompletableFuture<MCCBlockState> getBlockDataAt(int x, int y, int z) {
        return getOrLoadChunk(MCCLocation.calculateChunkX(x), MCCLocation.calculateChunkZ(z)).thenApply(mccChunk -> {
            mccChunk.getBlockDataAt(x, y, z);
            return null;
        });
    }

    default CompletableFuture<MCCBlockType> getBlockTypeAt(int x, int y, int z) {
        return getOrLoadChunk(MCCLocation.calculateChunkX(x), MCCLocation.calculateChunkZ(z)).thenApply(mccChunk -> {
            mccChunk.getBlockTypeAt(x, y, z);
            return null;
        });
    }

    default CompletableFuture<MCCBlock> getBlockAt(int x, int y, int z) {
        MCCLocation blockLocation = new MCCLocation(this, x, y, z);
        return getOrLoadChunk(blockLocation).thenApply(mccChunk -> new MCCBlock(blockLocation, mccChunk));
    }

    default CompletableFuture<MCCBlockState> getBlockDataAt(MCCLocation location) {
        if (!location.world().equals(this)) {
            throw new IllegalArgumentException("The provided location does not belong to this world.");
        }
        return getBlockDataAt((int) location.x(), (int) location.y(), (int) location.z());
    }

    String getName();

    default CompletableFuture<MCCBlockType> getBlockTypeAt(MCCLocation location) {
        if (!location.world().equals(this)) {
            throw new IllegalArgumentException("The provided location does not belong to this world.");
        }
        return getBlockTypeAt((int) location.x(), (int) location.y(), (int) location.z());
    }

    default CompletableFuture<MCCBlock> getBlockAt(MCCLocation location) {
        if (!location.world().equals(this)) {
            throw new IllegalArgumentException("The provided location does not belong to this world.");
        }
        return getBlockAt((int) location.x(), (int) location.y(), (int) location.z());
    }

    /**
     * Changes a block at the provided location to this block state
     *
     * @param mccBlockState      the block state
     * @param location           the location to change the block at
     * @param triggerBlockUpdate whether the change should trigger block updates
     */
    default CompletableFuture<Void> setBlock(@NotNull MCCBlockState mccBlockState, @NotNull MCCLocation location, boolean triggerBlockUpdate) {
        return getOrLoadChunk(location).thenApply(mccChunk -> {
            mccChunk.setBlock(mccBlockState, location);
            if (triggerBlockUpdate) {
                triggerBlockUpdate(location);
            }
            return null;
        });
    }

    /**
     * Changes a block at the provided location to this block state
     *
     * @param mccBlockType       the block type
     * @param location           the location to change the block at
     * @param triggerBlockUpdate whether the change should trigger block updates
     */
    default CompletableFuture<Void> setBlock(@NotNull MCCBlockType mccBlockType, @NotNull MCCLocation location, boolean triggerBlockUpdate) {
        return getOrLoadChunk(location).thenApply(mccChunk -> {
            mccChunk.setBlock(mccBlockType, location);
            if (triggerBlockUpdate) {
                triggerBlockUpdate(location);
            }
            return null;
        });
    }

    /**
     * Naturally breaks this block as if a player had broken it.
     *
     * @param tool           the tool used
     * @param triggerEffect  whether to trigger a block break effect
     * @param dropExperience whether to drop Experience
     * @param ignoreTool     whether to ignore the tool
     */
    void breakBlockNaturally(@Nullable MCCItemStack tool, boolean triggerEffect, boolean dropLoot, boolean dropExperience, boolean ignoreTool);

    /**
     * Naturally breaks this block as if a player had broken it.
     *
     * @param triggerEffect  whether to trigger a block break effect
     * @param dropExperience whether to drop Experience
     */
    default void breakBlockNaturally(boolean triggerEffect, boolean dropLoot, boolean dropExperience) {
        breakBlockNaturally(null, triggerEffect, dropLoot, dropExperience, true);
    }

    /**
     * Drops an item at the specified {@link Location} with a random offset
     * Note that functions will run before the entity is spawned
     *
     * @param location     Location to drop the item
     * @param items        ItemStacks to drop
     * @param dropCallback the function to be run before the entity is spawned.
     * @return ItemDrop entity created as a result of this method
     */
    MCCEntity dropItemsNaturally(MCCLocation location, Collection<MCCItemStack> items, @Nullable Consumer<MCCEntity> dropCallback);

    /**
     * Drops an item at the specified {@link Location} with a random offset
     * Note that functions will run before the entity is spawned
     *
     * @param location Location to drop the item
     * @param items    ItemStacks to drop
     * @return ItemDrop entity created as a result of this method
     */
    default MCCEntity dropItemsNaturally(MCCLocation location, Collection<MCCItemStack> items) {
        return dropItemsNaturally(location, items, null);
    }

    CompletableFuture<MCCEntity> teleport(@NotNull MCCLocation location, @NotNull MCCEntity mccEntity);

    CompletableFuture<MCCEntity> summon(@NotNull MCCLocation location, @NotNull MCCEntityType mccEntityType);

    CompletableFuture<MCCChunk> getOrLoadChunk(int x, int z);

    CompletableFuture<MCCChunk> getOrLoadChunk(MCCLocation location);

    @Nullable MCCChunk getChunkImmediately(int x, int z);

    @Nullable MCCChunk getChunkImmediately(MCCLocation location);

    Audience asAudience();

    UUID getUUID();

    void triggerBlockUpdate(MCCLocation location);
}
