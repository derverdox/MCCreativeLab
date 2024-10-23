package de.verdox.mccreativelab.serialization.generic;

public interface SerializationArray extends Iterable<SerializationElement> {
    int length();

    SerializationElement get(int index);

    void add(SerializationElement serializationElement);

    void set(int index, SerializationElement serializationElement);

    SerializationElement remove(int index);

    void addAll(SerializationArray serializationArray);
}
