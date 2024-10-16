package de.verdox.mccreativelab.serialization.pdc;

import de.verdox.mccreativelab.serialization.SerializationContainer;
import de.verdox.mccreativelab.serialization.SerializationElement;
import org.bukkit.NamespacedKey;
import org.bukkit.craftbukkit.persistence.CraftPersistentDataContainer;
import org.bukkit.persistence.PersistentDataContainer;

import java.util.Collection;
import java.util.stream.Collectors;

public class PDCSerializationContainer extends PDCSerializationElement implements SerializationContainer {
    public PDCSerializationContainer(NamespacedKey namespacedKey, PersistentDataContainer persistentDataContainer) {
        super(namespacedKey, persistentDataContainer);
    }

    @Override
    public Collection<String> getChildKeys() {
        return persistentDataContainer.getKeys().stream().map(NamespacedKey::asString).collect(Collectors.toSet());
    }

    @Override
    public SerializationElement get(String key) {
        return persistentDataContainer.get(null,null);
    }

    @Override
    public boolean contains(String key) {
        return persistentDataContainer.has(null);
    }
}
