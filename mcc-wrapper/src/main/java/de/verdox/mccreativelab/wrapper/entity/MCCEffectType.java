package de.verdox.mccreativelab.wrapper.entity;

import de.verdox.mccreativelab.wrapper.MCCKeyedWrapper;
import org.jetbrains.annotations.Nullable;

public interface MCCEffectType extends MCCKeyedWrapper {
    void applyEffectType(MCCLivingEntity mccEntity, MCCEffect mccEffect);

    MCCEffect create(int duration, int amplifier, boolean ambient, boolean particles, boolean icon, @Nullable MCCEffect hiddenEffect);
}
