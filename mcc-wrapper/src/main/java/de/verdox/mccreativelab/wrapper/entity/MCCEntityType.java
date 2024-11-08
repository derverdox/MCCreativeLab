package de.verdox.mccreativelab.wrapper.entity;

import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import de.verdox.mccreativelab.wrapper.MCCKeyedWrapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public interface MCCEntityType extends MCCKeyedWrapper {
    CompletableFuture<MCCEntity> summon(@NotNull MCCLocation location, @Nullable Consumer<MCCEntity> callback);
}
