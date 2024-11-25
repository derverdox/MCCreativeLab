package de.verdox.mccreativelab.wrapper.item;

import net.kyori.adventure.key.Key;

public record MCCAttributeModifier(Key key, double amount, Operation operation) {

    public MCCAttributeModifier withAmount(Key key){
        return new MCCAttributeModifier(key, this.amount(), this.operation());
    }

    public MCCAttributeModifier withAmount(double amount){
        return new MCCAttributeModifier(this.key(), amount, this.operation());
    }

    public MCCAttributeModifier withAmount(Operation mccOperation){
        return new MCCAttributeModifier(this.key(), this.amount(), mccOperation);
    }

    public enum Operation  {
        ADD_VALUE,
        ADD_MULTIPLIED_BASE,
        ADD_MULTIPLIED_TOTAL,
        ;
    }
}
