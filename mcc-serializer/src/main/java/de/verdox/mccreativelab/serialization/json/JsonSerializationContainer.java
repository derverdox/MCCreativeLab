package de.verdox.mccreativelab.serialization.json;

import com.google.gson.JsonObject;
import de.verdox.mccreativelab.serialization.generic.SerializationContainer;
import de.verdox.mccreativelab.serialization.generic.SerializationElement;

import java.util.Collection;

public class JsonSerializationContainer extends JsonSerializationElement implements SerializationContainer {
    public JsonSerializationContainer(JsonObject jsonElement) {
        super(jsonElement);
    }

    @Override
    public Collection<String> getChildKeys() {
        return jsonElement.getAsJsonObject().keySet();
    }

    @Override
    public SerializationElement get(String key) {
        return new JsonSerializationElement(jsonElement.getAsJsonObject().get(key));
    }

    @Override
    public boolean contains(String key) {
        return jsonElement.getAsJsonObject().has(key);
    }
}
