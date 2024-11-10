package de.verdox.mccreativelab.impl.vanilla.world;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.block.NMSBlockState;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.platform.TempData;
import de.verdox.mccreativelab.wrapper.platform.adapter.WrapperAdapter;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import de.verdox.mccreativelab.wrapper.world.MCCWorld;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.key.Key;
import net.minecraft.server.level.ServerLevel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class NMSWorld extends NMSHandle<ServerLevel> implements MCCWorld {
    public static final MCCConverter<ServerLevel, NMSWorld> CONVERTER = converter(NMSWorld.class, ServerLevel.class, NMSWorld::new, NMSHandle::getHandle);


    public NMSWorld(ServerLevel handle) {
        super(handle);
    }

    @Override
    public MCCBlockState getBlockDataAt(int x, int y, int z) {
        return null;
    }

    @Override
    public MCCBlockType getBlockTypeAt(int x, int y, int z) {
        return null;
    }

    @Override
    public void setBlock(@NotNull MCCBlockState mccBlockState, @NotNull MCCLocation location, boolean applyPhysics) {

    }

    @Override
    public void setBlock(@NotNull MCCBlockType mccBlockType, @NotNull MCCLocation location, boolean applyPhysics) {

    }

    @Override
    public CompletableFuture<MCCEntity> summon(@NotNull MCCLocation location, @Nullable Consumer<MCCEntity> callback) {
        return null;
    }

    @Override
    public Audience asAudience() {
        return null;
    }

    @Override
    public UUID getUUID() {
        return null;
    }

    @Override
    public @NotNull Key key() {
        return null;
    }

    @Override
    public TempData getTempData() {
        return null;
    }
}
