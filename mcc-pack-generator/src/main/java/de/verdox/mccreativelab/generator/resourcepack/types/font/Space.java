package de.verdox.mccreativelab.generator.resourcepack.types.font;

import de.verdox.vserializer.util.gson.JsonArrayBuilder;
import de.verdox.vserializer.util.gson.JsonObjectBuilder;
import net.kyori.adventure.key.Key;

import java.util.Arrays;
import java.util.Map;

public record Space(Map<String, Integer> advances) implements FontElement {
    @Override
    public void buildToProviders(Key namespacedKey, JsonArrayBuilder providers) {
        providers.add(JsonObjectBuilder
            .create()
            .add("type", "space")
            .getOrCreateJsonObject("advances",
                jsonObjectBuilder -> advances.entrySet()
                                             .stream()
                                             .sorted(Map.Entry.comparingByKey())
                                             .forEach(stringIntegerEntry -> jsonObjectBuilder.add(stringIntegerEntry.getKey(), stringIntegerEntry.getValue()))));
    }

    public boolean hasCodePoint(int codePoint) {
        return advances.keySet().stream().flatMapToInt(s -> Arrays.stream(s.codePoints().toArray()))
                       .anyMatch(value -> value == codePoint);
    }

    public int getPixelWidth(int codePoint) {
        if (!hasCodePoint(codePoint))
            return 0;
        var found = advances.keySet().stream().filter(s -> s.codePoints().anyMatch(value -> value == codePoint))
                            .findFirst().orElse(null);
        return advances.get(found);
    }
}
