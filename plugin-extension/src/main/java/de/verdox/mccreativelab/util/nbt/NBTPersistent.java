package de.verdox.mccreativelab.util.nbt;

import de.verdox.vcore.paper.serializer.PDCSerializationContext;
import de.verdox.vserializer.generic.SerializationContainer;
import org.bukkit.NamespacedKey;
import org.bukkit.persistence.PersistentDataAdapterContext;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataObject;
import org.jetbrains.annotations.NotNull;

import de.verdox.vserializer.generic.Serializable;

public interface NBTPersistent extends PersistentDataObject, Serializable {
    @Override
    default PersistentDataContainer serialize(@NotNull PersistentDataAdapterContext context) {
        PersistentDataContainer persistentDataContainer = context.newPersistentDataContainer();
        SerializationContainer container = PDCSerializationContext.INSTANCE.createContainer();
        save(container, PDCSerializationContext.INSTANCE);
        PDCSerializationContext.INSTANCE.serializeToPDC(container, context.newPersistentDataContainer());
        return persistentDataContainer;
    }

    @Override
    default void deSerialize(PersistentDataContainer persistentDataContainer) {
        SerializationContainer container = PDCSerializationContext.INSTANCE.deserializeFromPDC(persistentDataContainer).getAsContainer();
        load(container, PDCSerializationContext.INSTANCE);
    }
}
