package de.verdox.mccreativelab.wrapper.entity;

import de.verdox.mccreativelab.wrapper.annotations.MCCBuiltIn;
import de.verdox.mccreativelab.wrapper.MCCKeyedWrapper;
import de.verdox.mccreativelab.wrapper.annotations.MCCInstantiationSource;
import de.verdox.mccreativelab.wrapper.entity.types.MCCLivingEntity;
import org.jetbrains.annotations.Nullable;

@MCCInstantiationSource(sourceClasses = {MCCLivingEntity.class})
@MCCBuiltIn(syncState = MCCBuiltIn.SyncState.SYNCED, clientEntersErrorStateOnDesync = true)
public interface MCCEffectType extends MCCKeyedWrapper {
    void applyEffectType(MCCLivingEntity mccEntity, MCCEffect mccEffect);

    MCCEffect create(int duration, int amplifier, boolean ambient, boolean particles, boolean icon, @Nullable MCCEffect hiddenEffect);

    /**
     * Gets the active effect for a provided effect type or null if no active effect was found
     *
     * @return the active effect or null
     */
    @Nullable
    MCCEffect getActiveEffect(MCCLivingEntity livingEntity);

    /**
     * Checks if this entity has an active effect of the provided effect type
     *
     * @return true if there is an active effect
     */
    default boolean hasActiveEffect(MCCLivingEntity livingEntity){
        return getActiveEffect(livingEntity) != null;
    }
}
