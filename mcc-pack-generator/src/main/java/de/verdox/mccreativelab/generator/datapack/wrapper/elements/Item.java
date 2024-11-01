package de.verdox.mccreativelab.generator.datapack.wrapper.elements;

import de.verdox.vserializer.util.gson.JsonObjectBuilder;

public class Item implements RecipeIngredient, RecipeResult {
    private final MCCKey key;
    public Item(MCCKey key){
        this.key = key;
    }
    @Override
    public JsonObjectBuilder toJson() {
        return JsonObjectBuilder.create().add("item", key.asString());
    }
}
