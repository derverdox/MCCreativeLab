package de.verdox.mccreativelab.generator.datapack.wrapper.elements;

import de.verdox.vserializer.util.gson.JsonObjectBuilder;

public class Tag implements RecipeIngredient {
    private final MCCKey tagKey;

    public Tag(MCCKey tagKey) {
        this.tagKey = tagKey;
    }

    @Override
    public JsonObjectBuilder toJson() {
        return JsonObjectBuilder.create().add("tag", tagKey.asString());
    }
}
