package de.verdox.mccreativelab.impl.vanilla.world;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.platform.TempCache;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.entity.MCCEntityType;
import de.verdox.mccreativelab.wrapper.platform.TempData;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import de.verdox.mccreativelab.wrapper.world.MCCWorld;
import de.verdox.mccreativelab.wrapper.world.chunk.MCCChunk;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.pointer.Pointers;
import net.minecraft.server.level.ServerLevel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class NMSWorld extends MCCHandle<ServerLevel> implements MCCWorld {
    public static final MCCConverter<ServerLevel, NMSWorld> CONVERTER = converter(NMSWorld.class, ServerLevel.class, NMSWorld::new, MCCHandle::getHandle);
    private Pointers adventurePointer;

    public NMSWorld(ServerLevel handle) {
        super(handle);
    }

    @Override
    public String getName() {
        return handle.serverLevelData.getLevelName();
    }

    @Override
    public void breakBlockNaturally(@Nullable MCCItemStack tool, boolean triggerEffect, boolean dropLoot, boolean dropExperience, boolean ignoreTool) {
        //TODO
    }

    @Override
    public MCCEntity dropItemsNaturally(MCCLocation location, Collection<MCCItemStack> items, @Nullable Consumer<MCCEntity> dropCallback) {
        //TODO
        return null;
    }

    @Override
    public List<MCCPlayer> getPlayers() {
        //TODO
        return List.of();
    }

    @Override
    public CompletableFuture<MCCEntity> teleport(@NotNull MCCLocation location, @NotNull MCCEntity mccEntity) {
        //TODO
        return null;
    }

    @Override
    public CompletableFuture<MCCEntity> summon(@NotNull MCCLocation location, @NotNull MCCEntityType mccEntityType) {
        //TODO
        return null;
    }

    @Override
    public CompletableFuture<MCCChunk> getOrLoadChunk(int x, int z) {
        //TODO
        return null;
    }

    @Override
    public CompletableFuture<MCCChunk> getOrLoadChunk(MCCLocation location) {
        //TODO
        return null;
    }

    @Override
    public @Nullable MCCChunk getChunkImmediately(int x, int z) {
        //TODO
        return null;
    }

    @Override
    public @Nullable MCCChunk getChunkImmediately(MCCLocation location) {
        //TODO
        return null;
    }

    @Override
    public UUID getUUID() {
        //TODO
        return null;
    }

    @Override
    public void triggerBlockUpdate(MCCLocation location) {
        //TODO
    }

    @Override
    public @NotNull Key key() {
        //TODO
        return null;
    }

    @Override
    public TempData getTempData() {
        return TempCache.get(getHandle());
    }

    @Override
    public net.kyori.adventure.pointer.Pointers pointers() {
        if (this.adventurePointer == null) {
            this.adventurePointer = net.kyori.adventure.pointer.Pointers.builder()
                .withDynamic(net.kyori.adventure.identity.Identity.NAME, this::getName)
                .withDynamic(net.kyori.adventure.identity.Identity.UUID, this::getUUID)
                .build();
        }

        return this.adventurePointer;
    }
}
