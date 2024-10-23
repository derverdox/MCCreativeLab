package de.verdox.mccreativelab.serialization.generic;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Experimental
public interface SerializationElement {
    boolean getAsBoolean();

    String getAsString();

    char getAsCharacter();

    Number getAsNumber();

    double getAsDouble();

    float getAsFloat();

    long getAsLong();

    int getAsInt();

    short getAsShort();

    byte getAsByte();

    default SerializationElement getAsElement(){
        return this;
    }

    SerializationContainer getAsContainer();

    SerializationArray getAsArray();
}
