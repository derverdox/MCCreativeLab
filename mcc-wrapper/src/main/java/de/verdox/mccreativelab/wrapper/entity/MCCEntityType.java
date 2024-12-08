package de.verdox.mccreativelab.wrapper.entity;

import de.verdox.mccreativelab.wrapper.annotations.MCCBuiltIn;
import de.verdox.mccreativelab.wrapper.annotations.MCCInstantiationSource;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import de.verdox.mccreativelab.wrapper.MCCKeyedWrapper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

@MCCInstantiationSource(sourceClasses = {MCCEntity.class})
@MCCBuiltIn(syncState = MCCBuiltIn.SyncState.SYNCED, clientEntersErrorStateOnDesync = true)
public interface MCCEntityType<T extends MCCEntity> extends MCCKeyedWrapper {
    default CompletableFuture<T> summon(@NotNull MCCLocation location){
        return (CompletableFuture<T>) location.world().summon(location, this);
    }

    MCCEntity constructNewEntity();
}
