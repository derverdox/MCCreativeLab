package de.verdox.mccreativelab.wrapper.entity;

import de.verdox.mccreativelab.wrapper.annotations.MCCBuiltIn;
import de.verdox.mccreativelab.wrapper.annotations.MCCInstantiationSource;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import de.verdox.mccreativelab.wrapper.MCCKeyedWrapper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

@MCCInstantiationSource(sourceClasses = {MCCEntity.class})
@MCCBuiltIn(syncState = MCCBuiltIn.SyncState.SYNCED, clientEntersErrorStateOnDesync = true)
public interface MCCEntityType extends MCCKeyedWrapper {
    default CompletableFuture<MCCEntity> summon(@NotNull MCCLocation location){
        return location.world().summon(location, this);
    }
}
