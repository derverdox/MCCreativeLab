package de.verdox.mccreativelab.serialization.pdc;

import de.verdox.mccreativelab.serialization.SerializationArray;
import de.verdox.mccreativelab.serialization.SerializationContainer;
import de.verdox.mccreativelab.serialization.SerializationElement;
import org.bukkit.NamespacedKey;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class PDCSerializationElement implements SerializationElement {
    protected final NamespacedKey namespacedKey;
    protected final PersistentDataContainer persistentDataContainer;
    public PDCSerializationElement(NamespacedKey namespacedKey, PersistentDataContainer persistentDataContainer){
        this.namespacedKey = namespacedKey;
        this.persistentDataContainer = persistentDataContainer;
    }

    @Override
    public boolean getAsBoolean() {
        return this.persistentDataContainer.get(namespacedKey, PersistentDataType.BOOLEAN);
    }

    @Override
    public String getAsString() {
        return this.persistentDataContainer.get(namespacedKey, PersistentDataType.STRING);
    }

    @Override
    public char getAsCharacter() {
        return this.persistentDataContainer.get(namespacedKey, PersistentDataType.STRING).charAt(0);
    }

    @Override
    public Number getAsNumber() {
        return this.persistentDataContainer.get(namespacedKey, PersistentDataType.DOUBLE);
    }

    @Override
    public double getAsDouble() {
        return this.persistentDataContainer.get(namespacedKey, PersistentDataType.DOUBLE);
    }

    @Override
    public float getAsFloat() {
        return this.persistentDataContainer.get(namespacedKey, PersistentDataType.FLOAT);
    }

    @Override
    public long getAsLong() {
        return this.persistentDataContainer.get(namespacedKey, PersistentDataType.LONG);
    }

    @Override
    public int getAsInt() {
        return this.persistentDataContainer.get(namespacedKey, PersistentDataType.INTEGER);
    }

    @Override
    public short getAsShort() {
        return this.persistentDataContainer.get(namespacedKey, PersistentDataType.SHORT);
    }

    @Override
    public byte getAsByte() {
        return this.persistentDataContainer.get(namespacedKey, PersistentDataType.BYTE);
    }

    @Override
    public SerializationContainer getAsContainer() {
        return null;
    }

    @Override
    public SerializationArray getAsArray() {
        return null;
    }
}
