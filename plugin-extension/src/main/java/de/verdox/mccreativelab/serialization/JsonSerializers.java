package de.verdox.mccreativelab.serialization;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import de.verdox.itemformat.BasicItemFormat;
import de.verdox.mccreativelab.MCCUtil;
import de.verdox.mccreativelab.generator.AssetFileStorage;
import de.verdox.mccreativelab.generator.AssetPath;
import de.verdox.mccreativelab.generator.AssetType;
import de.verdox.mccreativelab.generator.resourcepack.AssetBasedResourcePackResource;
import de.verdox.mccreativelab.generator.resourcepack.CustomResourcePack;
import de.verdox.mccreativelab.generator.resourcepack.types.lang.LanguageInfo;
import de.verdox.mccreativelab.generator.resourcepack.types.lang.Translatable;
import de.verdox.mccreativelab.util.gson.JsonArrayBuilder;
import de.verdox.mccreativelab.util.gson.JsonObjectBuilder;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.Nullable;

public class JsonSerializers {
    public static class TranslatableSerializer implements JsonSerializer<Translatable> {

        public static final TranslatableSerializer INSTANCE = new TranslatableSerializer();

        @Override
        public JsonElement toJson(Translatable wrapped) {
            return JsonObjectBuilder.create(toJsonWithoutKey(wrapped)).add("key", wrapped.key()).build();
        }

        @Override
        public String id() {
            return "translatable";
        }

        public JsonObject toJsonWithoutKey(Translatable wrapped) {
            JsonArrayBuilder jsonArrayBuilder = JsonArrayBuilder.create();
            wrapped.getCache().forEach((languageInfo, translation) ->
                jsonArrayBuilder.add(JsonObjectBuilder.create()
                    .add("language", languageInfo.identifier())
                    .add("translation", translation.content())));
            return JsonObjectBuilder.create()
                .add("translations", jsonArrayBuilder)
                .build();
        }

        @Override
        public @Nullable Translatable fromJson(JsonElement jsonElement) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            if (!jsonObject.has("key") || !jsonObject.has("translations"))
                return null;

            String key = jsonObject.get("key").getAsString();
            return fromJsonWithProvidedKey(jsonElement, key);
        }

        public @Nullable Translatable fromJsonWithProvidedKey(JsonElement jsonElement, String key) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            if (!jsonObject.has("translations"))
                return null;
            JsonArray array = jsonObject.get("translations").getAsJsonArray();

            Translatable translatable = new Translatable(key);

            for (JsonElement element : array) {
                JsonObject translationJson = element.getAsJsonObject();
                String languageID = translationJson.get("language").getAsString();
                String translation = translationJson.get("translation").getAsString();
                translatable.withAdditionalTranslation(new LanguageInfo(languageID, "", "", true), translation);
            }
            return translatable;
        }
    }

    public static class ItemStackSerializer implements JsonSerializer<ItemStack> {
        public static final ItemStackSerializer INSTANCE = new ItemStackSerializer();

        @Override
        public JsonElement toJson(ItemStack wrapped) {
            ItemStack toSerialize = wrapped.clone();
            if (MCCUtil.getInstance().isMCCreativeLabServerSoftware())
                toSerialize.editMeta(meta -> meta.getPersistentDataContainer().remove(BasicItemFormat.sessionIDKey));
            JsonObject jsonObject = Bukkit.getUnsafe().serializeItemAsJson(toSerialize);
            // We remove values that are only needed internally

            jsonObject.remove("DataVersion");
            return jsonObject;
        }

        @Override
        public String id() {
            return "item_stack";
        }

        @Override
        public @Nullable ItemStack fromJson(JsonElement jsonElement) {
            JsonObject jsonObject = JsonObjectBuilder.create(jsonElement.getAsJsonObject())
                .add("DataVersion", Bukkit.getUnsafe().getDataVersion())
                .build();
            ItemStack itemStack = Bukkit.getUnsafe().deserializeItemFromJson(jsonObject);
            return itemStack;
        }
    }

    public static class NameSpacedAssetSerializer implements JsonSerializer<AssetBasedResourcePackResource> {
        private Plugin javaPlugin;

        public static NameSpacedAssetSerializer get(JavaPlugin javaPlugin) {
            return new NameSpacedAssetSerializer(javaPlugin);
        }

        private NameSpacedAssetSerializer(Plugin javaPlugin) {
            this.javaPlugin = javaPlugin;
        }

        @Override
        public JsonElement toJson(AssetBasedResourcePackResource wrapped) {
            AssetType<CustomResourcePack> assetType = wrapped.getAssetType();
            String fileEnding = wrapped.getFileEnding();
            NamespacedKey key = wrapped.getKey();
            return JsonObjectBuilder.create()
                .add("plugin", javaPlugin.getName())
                .add("assetType", assetType.resourceTypePath().toPath().toString())
                .add("key", key.asString())
                .add("fileEnding", fileEnding)
                .build();
        }

        @Override
        public String id() {
            return "name_spaced_asset";
        }

        @Override
        public @Nullable AssetBasedResourcePackResource fromJson(JsonElement jsonElement) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();

            String pluginName = javaPlugin.getName();
            NamespacedKey key = null;
            AssetType<CustomResourcePack> assetType = null;
            String fileEnding = null;

            if (jsonObject.has("plugin")) {
                pluginName = jsonObject.get("plugin").getAsString();
            }
            if (jsonObject.has("assetType"))
                assetType = new AssetType<>(AssetPath.buildPath(jsonObject.get("assetType").getAsString()));
            if (jsonObject.has("key"))
                key = NamespacedKey.fromString(jsonObject.get("key").getAsString());
            if (jsonObject.has("fileEnding"))
                fileEnding = jsonObject.get("fileEnding").getAsString();

            if (key == null)
                throw new IllegalStateException("No key specified for asset");
            if (assetType == null)
                throw new IllegalStateException("No asset type specified for asset " + key);
            if (fileEnding == null)
                throw new IllegalStateException("No file ending specified for asset " + key);

            return AssetFileStorage.get(pluginName).loadAsset(key, assetType, fileEnding);
        }
    }

    public static final JsonSerializer<NamespacedKey> NAMESPACED_KEY_SERIALIZER = JsonSerializerBuilder
        .create("key", NamespacedKey.class)
        .constructor(
            new SerializableField<>("namespace", JsonSerializer.Primitive.STRING, NamespacedKey::namespace),
            new SerializableField<>("key", JsonSerializer.Primitive.STRING, NamespacedKey::getKey),
            NamespacedKey::new
        )
        .build();
}
