package de.verdox.mccreativelab.impl.paper.world;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.impl.vanilla.world.NMSWorld;
import de.verdox.mccreativelab.wrapper.entity.types.MCCPlayer;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import de.verdox.mccreativelab.wrapper.world.chunk.MCCChunk;
import net.minecraft.server.level.ServerLevel;
import org.bukkit.Location;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class PaperWorld extends NMSWorld {
    public PaperWorld(ServerLevel handle) {
        super(handle);
    }

    @Override
    public List<MCCPlayer> getPlayers() {
        return conversionService.wrap(handle.getPlayers(serverPlayer -> serverPlayer.isRealPlayer).stream().toList());
    }

    @Override
    public CompletableFuture<MCCChunk> getOrLoadChunk(int chunkX, int chunkZ) {
        return handle.getWorld().getChunkAtAsync(chunkX, chunkZ).thenApply(chunk -> conversionService.wrap(chunk));
    }

    @Override
    public CompletableFuture<MCCChunk> getOrLoadChunk(MCCLocation location) {
        return handle.getWorld().getChunkAtAsync(conversionService.unwrap(location, new TypeToken<Location>(){})).thenApply(chunk -> conversionService.wrap(chunk));
    }
}
