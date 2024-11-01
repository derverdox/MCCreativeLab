package de.verdox.mccreativelab.generator.resourcepack.types.font;

import de.verdox.vserializer.util.gson.JsonArrayBuilder;
import net.kyori.adventure.key.Key;

public interface FontElement {
    void buildToProviders(Key namespacedKey, JsonArrayBuilder providers);
}
