package de.verdox.mccreativelab.serialization;

import com.google.gson.JsonObject;
import de.verdox.itemformat.BasicItemFormat;
import de.verdox.mccreativelab.MCCUtil;
import de.verdox.vserializer.SerializableField;
import de.verdox.vserializer.generic.SerializationContext;
import de.verdox.vserializer.generic.SerializationElement;
import de.verdox.vserializer.generic.Serializer;
import de.verdox.vserializer.generic.SerializerBuilder;
import de.verdox.vserializer.json.JsonSerializationElement;
import de.verdox.vserializer.json.JsonSerializerContext;
import de.verdox.vserializer.util.gson.JsonObjectBuilder;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public class Serializers {
    public static class ItemStackSerializer implements Serializer<ItemStack> {
        public static final ItemStackSerializer INSTANCE = new ItemStackSerializer();

        @Override
        public SerializationElement serialize(SerializationContext serializationContext, ItemStack itemStack) {
            ItemStack toSerialize = itemStack.clone();

            if (MCCUtil.getInstance().isMCCreativeLabServerSoftware())
                toSerialize.editMeta(meta -> meta.getPersistentDataContainer().remove(BasicItemFormat.sessionIDKey));

            JsonObject jsonObject = Bukkit.getUnsafe().serializeItemAsJson(toSerialize);
            // We remove values that are only needed internally

            jsonObject.remove("DataVersion");
            return serializationContext.convert(new JsonSerializerContext().toElement(jsonObject), false);
        }

        @Override
        public ItemStack deserialize(SerializationElement serializationElement) {
            JsonSerializationElement jsonSerializationElement = (JsonSerializationElement) new JsonSerializerContext().convert(serializationElement, false);
            JsonObject jsonObject = JsonObjectBuilder.create(jsonSerializationElement.getJsonElement().getAsJsonObject())
                .add("DataVersion", Bukkit.getUnsafe().getDataVersion())
                .build();
            ItemStack itemStack = Bukkit.getUnsafe().deserializeItemFromJson(jsonObject);
            return itemStack;
        }

        @Override
        public String id() {
            return "item_stack";
        }

        @Override
        public Class<? extends ItemStack> getType() {
            return ItemStack.class;
        }
    }
    public static final Serializer<NamespacedKey> NAMESPACED_KEY_SERIALIZER = SerializerBuilder
        .create("key", NamespacedKey.class)
        .constructor(
            new SerializableField<>("namespace", Serializer.Primitive.STRING, NamespacedKey::namespace),
            new SerializableField<>("key", Serializer.Primitive.STRING, NamespacedKey::getKey),
            NamespacedKey::new
        )
        .build();
}
