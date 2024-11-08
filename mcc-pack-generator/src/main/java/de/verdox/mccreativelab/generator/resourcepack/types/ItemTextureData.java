package de.verdox.mccreativelab.generator.resourcepack.types;

import com.google.common.hash.Hashing;
import com.google.gson.JsonObject;
import de.verdox.mccreativelab.generator.Asset;
import de.verdox.mccreativelab.generator.resourcepack.CustomResourcePack;
import de.verdox.mccreativelab.generator.resourcepack.ResourcePackAssetTypes;
import de.verdox.mccreativelab.generator.resourcepack.ResourcePackResource;
import de.verdox.mccreativelab.wrapper.block.MCCBlockFace;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.vserializer.util.gson.JsonArrayBuilder;
import de.verdox.vserializer.util.gson.JsonObjectBuilder;
import de.verdox.vserializer.util.gson.JsonUtil;
import de.verdox.mccreativelab.util.io.AssetUtil;
import net.kyori.adventure.key.Key;
import net.kyori.adventure.key.Keyed;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.logging.Logger;

public class ItemTextureData extends ResourcePackResource {
    public static final Logger LOGGER = Logger.getLogger(ItemTextureData.class.getName());
    private final Key material;
    private final int customModelData;
    private final Asset<CustomResourcePack> pngFile;
    private final @Nullable ModelType modelType;
    private final boolean useVanillaTexture;

    public ItemTextureData(@NotNull Key namespacedKey,
                           @NotNull Key material,
                           int customModelData,
                           @Nullable Asset<CustomResourcePack> pngFile,
                           @Nullable ModelType modelType, boolean useVanillaTexture) {
        super(namespacedKey);
        this.material = material;
        this.customModelData = customModelData;
        this.pngFile = pngFile;
        this.modelType = modelType;
        this.useVanillaTexture = useVanillaTexture;
    }

    public ItemTextureData(@NotNull Key namespacedKey,
                           @NotNull Key material,
                           @Nullable Asset<CustomResourcePack> pngFile,
                           @Nullable ModelType modelType, boolean useVanillaTexture) {
        this(namespacedKey, material, Math.abs(Hashing.sha256().hashString(namespacedKey.asString(), StandardCharsets.UTF_8).asInt()), pngFile, modelType, useVanillaTexture);
    }

    public ItemTextureData(@NotNull Key namespacedKey,
                           @NotNull Key material,
                           int customModelData,
                           @Nullable Asset<CustomResourcePack> pngFile,
                           @Nullable ModelType modelType) {
        this(namespacedKey, material, customModelData, pngFile, modelType, false);
    }

    public ItemTextureData(@NotNull Key namespacedKey,
                           @NotNull Key material,
                           @Nullable Asset<CustomResourcePack> pngFile,
                           @Nullable ModelType modelType) {
        this(namespacedKey, material, pngFile, modelType, false);
    }

    public MCCItemStack createItem() {
        var stack = new ItemStack(material);
        if (customModelData != 0)
            stack.editMeta(meta -> meta.setCustomModelData(customModelData));
        return stack;
    }

    @Override
    public void installResourceToPack(CustomResourcePack customPack) throws IOException {
        var hasCustomTexture = pngFile != null;

        if (hasCustomTexture)
            pngFile.installAsset(customPack, key(), ResourcePackAssetTypes.TEXTURES, "png");

        createModelFile(customPack);
    }

    public static void createVanillaModelFile(Key material, Set<ItemTextureData> installedItems, CustomResourcePack customPack) {
        Key vanillaKey = Key.key(material.namespace(), "item/" + material.value());
        JsonObject jsonToWriteToFile = createModelJson(material, vanillaKey, null);

        addCustomModelDataListToVanillaModelFile(installedItems, jsonToWriteToFile);

        AssetUtil.createJsonAssetAndInstall(jsonToWriteToFile, customPack, vanillaKey, ResourcePackAssetTypes.MODELS);
        LOGGER.info("Installing modified vanilla item model for " + vanillaKey + " with " + installedItems.size() + " entries");
    }

    private static void addCustomModelDataListToVanillaModelFile(Set<ItemTextureData> installedItems, JsonObject jsonToWriteToFile) {
        var list = new LinkedList<JsonObject>();
        var builder = JsonObjectBuilder.create(jsonToWriteToFile)
            .getOrCreateArray("overrides", jsonArrayBuilder -> {
                for (ItemTextureData installedItem : installedItems) {
                    String textureKey = installedItem.useVanillaTexture ? Key.key(Key.MINECRAFT_NAMESPACE,"item/" + installedItem.getMaterial().value()).asString() : installedItem.key().toString();
                    jsonArrayBuilder.add(
                        JsonObjectBuilder
                            .create()
                            .add("predicate",
                                JsonObjectBuilder
                                    .create()
                                    .add("custom_model_data", installedItem.customModelData))
                            .add("model", textureKey));
                }
                jsonArrayBuilder.build()
                    .forEach(jsonElement -> list.add(jsonElement.getAsJsonObject()));
            });

        list.sort(Comparator.comparing(jsonElement -> jsonElement.getAsJsonObject().getAsJsonObject("predicate")
            .get("custom_model_data").getAsJsonPrimitive()
            .getAsInt()));

        var sortedArray = JsonArrayBuilder.create();
        list.forEach(jsonElement -> {
            sortedArray.add(JsonObjectBuilder.create(jsonElement));
        });
        builder.add("overrides", sortedArray);
    }

    private void createModelFile(CustomResourcePack customPack) {
        JsonObject jsonToWriteToFile = createModelJson(this.material, key(), modelType);

        AssetUtil.createJsonAssetAndInstall(jsonToWriteToFile, customPack, key(), ResourcePackAssetTypes.MODELS);
    }

    private static JsonObject createModelJson(Key material, Key key, @Nullable ModelType modelType) {
        JsonObject jsonToWriteToFile = new JsonObject();
        if (modelType != null)
            modelType.modelCreator().accept(key, jsonToWriteToFile);
        else {
            if (isHandheldItem(material))
                ModelType.HAND_HELD.modelCreator.accept(key, jsonToWriteToFile);
            else
                ModelType.GENERATED_ITEM.modelCreator.accept(key, jsonToWriteToFile);
        }
        return jsonToWriteToFile;
    }

    private static boolean isHandheldItem(Key material) {
        return material.value().contains("sword") || material.value().contains("axe") || material.value().contains("hoe") || material.value().contains("shovel") || material.value().contains("fishing_rod") || material.value().equals("stick");
    }

    public record ModelType(String modelName, BiConsumer<Key, JsonObject> modelCreator) {

        public static ModelType fromJsonAsset(Asset<CustomResourcePack> asset, Consumer<JsonObject> consumer) {
            try {
                JsonObject jsonObject = JsonUtil.readJsonInputStream(asset.assetInputStream().get());
                return new ModelType("", (namespacedKey, jsonObject1) -> {
                    jsonObject1.asMap().putAll(jsonObject.asMap());
                    consumer.accept(jsonObject1);
                });
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public static ModelType createJsonForModel(Consumer<JsonObject> consumer) {
            return new ModelType("", (namespacedKey, jsonObject1) -> consumer.accept(jsonObject1));
        }

        public static ModelType modifyExistingModelType(ModelType modelType, BiConsumer<Key, JsonObject> modelCreator) {
            return new ModelType(modelType.modelName, (namespacedKey, jsonObject) -> {
                modelType.modelCreator().accept(namespacedKey, jsonObject);
                modelCreator.accept(namespacedKey, jsonObject);
            });
        }

        public static ModelType createModelForBlockItem(String modelName, Key blockModel) {
            return new ModelType(modelName, (namespacedKey, jsonObject) ->
                JsonObjectBuilder.create(jsonObject).add("parent", blockModel.toString())
                    .build());
        }

        public static ModelType createFullCubeModel(Key resourceKey) {
            return new ModelType("minecraft:block/cube_all", (namespacedKey, jsonObject) ->
                JsonObjectBuilder.create().add("parent", "minecraft:block/cube_all")
                    .add("textures", JsonObjectBuilder.create().add("all", resourceKey.toString()))
                    .build());
        }

        public static ModelType createFullCubeWithSingleTexture(Key textureKey) {
            return createFullCubeWithSeparateTextures(Map.of(MCCBlockFace.UP, textureKey, MCCBlockFace.DOWN, textureKey, MCCBlockFace.NORTH, textureKey, MCCBlockFace.EAST, textureKey, MCCBlockFace.SOUTH, textureKey, MCCBlockFace.WEST, textureKey));
        }

        public static ModelType createFullCubeWithSeparateTextures(Map<MCCBlockFace, ? extends Keyed> texturesPerBlockFace) {
            var textures = JsonObjectBuilder.create();
            texturesPerBlockFace.forEach((blockFace, itemTextureData) -> {
                textures.add(blockFace.name().toLowerCase(Locale.ROOT), itemTextureData.key().toString());
                textures.add("particle", itemTextureData.key().toString());
            });

            return new ModelType("", (namespacedKey, jsonObject) ->
                JsonObjectBuilder.create(jsonObject).add("parent", "block/cube")
                    .add("textures", textures));

        }

        public static ModelType createOnlyOneSideTextureOfCube(MCCBlockFace face) {

            String faceName;
            if (face.equals(MCCBlockFace.UP) || face.equals(MCCBlockFace.DOWN))
                faceName = face.name().toLowerCase(Locale.ROOT);
            else
                faceName = face.getOppositeFace().name().toLowerCase(Locale.ROOT);
            int posX = 0;
            int posY = 0;
            int posZ = 0;

            int sizeX = 0;
            int sizeY = 0;
            int sizeZ = 0;

            if (face == MCCBlockFace.DOWN) {
                posY = 8;
                sizeY = 8;

                sizeX = 16;
                sizeZ = 16;
            } else if (face == MCCBlockFace.EAST) {
                posX = 8;
                sizeX = 8;

                sizeY = 16;
                sizeZ = 16;
            } else if (face == MCCBlockFace.NORTH) {
                posZ = 8;
                sizeZ = 8;

                sizeX = 16;
                sizeY = 16;
            } else if (face == MCCBlockFace.SOUTH) {
                posZ = 8;
                sizeZ = 8;

                sizeX = 16;
                sizeY = 16;
            } else if (face == MCCBlockFace.UP) {
                posY = 8;
                sizeY = 8;

                sizeX = 16;
                sizeZ = 16;
            } else if (face == MCCBlockFace.WEST) {
                posX = 8;
                sizeX = 8;

                sizeY = 16;
                sizeZ = 16;
            }

            var element = JsonObjectBuilder.create()
                .add("from", JsonArrayBuilder.create().add(posX).add(posY).add(posZ))
                .add("to", JsonArrayBuilder.create().add(sizeX).add(sizeY).add(sizeZ))
                .add("faces",
                    JsonObjectBuilder.create()
                        .add(faceName,
                            JsonObjectBuilder.create()
                                .add("texture", "#" + faceName)
                                .add("cullface", faceName)
                        )
                );


            return new ModelType("", (namespacedKey, jsonObject) ->
                JsonObjectBuilder.create(jsonObject).add("parent", "block/block")
                    .add("elements", JsonArrayBuilder.create().add(element))
                    .add("textures",
                        JsonObjectBuilder.create()
                            .add("particle", namespacedKey.toString())
/*                                                      .add("down", emptyTexture.toString())
                                                      .add("up", emptyTexture.toString())
                                                      .add("north", emptyTexture.toString())
                                                      .add("east", emptyTexture.toString())
                                                      .add("south", emptyTexture.toString())
                                                      .add("west", emptyTexture.toString())*/
                            .add(faceName, namespacedKey.toString())
                    )
                    .build());
        }

        public static ModelType useModelOfExistingItem(Key itemKey) {
            return new ModelType("item/generated", (namespacedKey, jsonObject) ->
                JsonObjectBuilder.create(jsonObject).add("parent", itemKey.asString())
                    .build());
        }

        public static final ModelType GENERATED_ITEM = new ModelType("item/generated", (namespacedKey, jsonObject) ->
            JsonObjectBuilder.create(jsonObject).add("parent", "item/generated")
                .add("textures", JsonObjectBuilder.create().add("layer0", namespacedKey.toString()))
                .build());
        public static final ModelType HAND_HELD = new ModelType("item/handheld", (namespacedKey, jsonObject) ->
            JsonObjectBuilder.create(jsonObject).add("parent", "item/handheld")
                .add("textures", JsonObjectBuilder.create().add("layer0", namespacedKey.toString()))
                .build());
        public static final ModelType FAKE_CROP = new ModelType("minecraft:block/crop", (namespacedKey, jsonObject) ->
            JsonObjectBuilder.create(jsonObject).add("parent", "minecraft:block/crop")
                .add("textures", JsonObjectBuilder.create().add("crop", namespacedKey.toString()))
                .build());

        public static final ModelType CUBE_ALL = new ModelType("minecraft:block/cube_all", (namespacedKey, jsonObject) ->
            JsonObjectBuilder.create(jsonObject).add("parent", "minecraft:block/cube_all")
                .add("textures", JsonObjectBuilder.create().add("all", namespacedKey.toString()))
                .build());

        public static final ModelType CUBE_ONLY_FACE_UP = new ModelType("minecraft:block/cube_all", (namespacedKey, jsonObject) ->
            JsonObjectBuilder.create(jsonObject).add("parent", "minecraft:block/cube_all")
                .add("textures", JsonObjectBuilder.create().add("all", namespacedKey.toString()))
                .build());

        public static final ModelType CLICKABLE_ITEM = new ModelType("clickable_item", (namespacedKey, jsonObject) ->
            JsonObjectBuilder.create(jsonObject).add("parent", "item/generated")
                .add("textures", JsonObjectBuilder.create().add("layer0", namespacedKey.toString()))
                .add("", "")
                .add("display",
                    JsonObjectBuilder.create()
                        .add("gui",
                            JsonObjectBuilder.create()
                                .add("scale", JsonArrayBuilder
                                    .create()
                                    .add(1)
                                    .add(1)
                                    .add(1)))
                        .add("thirdperson_righthand",
                            JsonObjectBuilder.create()
                                .add("scale", JsonArrayBuilder
                                    .create()
                                    .add(0)
                                    .add(0)
                                    .add(0)))
                        .add("thirdperson_lefthand",
                            JsonObjectBuilder.create()
                                .add("scale", JsonArrayBuilder
                                    .create()
                                    .add(0)
                                    .add(0)
                                    .add(0)))
                        .add("firstperson_righthand",
                            JsonObjectBuilder.create()
                                .add("scale", JsonArrayBuilder
                                    .create()
                                    .add(0)
                                    .add(0)
                                    .add(0)))
                        .add("firstperson_lefthand",
                            JsonObjectBuilder.create()
                                .add("scale", JsonArrayBuilder
                                    .create()
                                    .add(0)
                                    .add(0)
                                    .add(0)))
                        .add("ground",
                            JsonObjectBuilder.create()
                                .add("scale", JsonArrayBuilder
                                    .create()
                                    .add(0)
                                    .add(0)
                                    .add(0)))
                        .add("head",
                            JsonObjectBuilder.create()
                                .add("scale", JsonArrayBuilder
                                    .create()
                                    .add(0)
                                    .add(0)
                                    .add(0)))
                )
                .build());
    }

    public Key getMaterial() {
        return material;
    }

    public int getCustomModelData() {
        return customModelData;
    }

    public Asset<CustomResourcePack> getPngFile() {
        return pngFile;
    }

    public ModelType getModelType() {
        return modelType;
    }
}
