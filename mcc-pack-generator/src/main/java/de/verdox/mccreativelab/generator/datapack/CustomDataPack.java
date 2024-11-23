package de.verdox.mccreativelab.generator.datapack;

import de.verdox.mccreativelab.generator.AssetPath;
import de.verdox.mccreativelab.generator.CustomPack;
import de.verdox.mccreativelab.generator.resourcepack.types.lang.Translation;
import de.verdox.vserializer.util.gson.JsonObjectBuilder;
import de.verdox.vserializer.util.gson.JsonUtil;

import java.io.File;
import java.io.IOException;

public class CustomDataPack extends CustomPack<CustomDataPack> {
    public CustomDataPack(String packName, int packFormat, String description, AssetPath savePath, File templateFolder, File dataFolder) {
        super(packName, packFormat, description, savePath, templateFolder, dataFolder);
    }

    @Override
    public void createDescriptionFile() throws IOException {
        JsonUtil.writeJsonObjectToFile(JsonObjectBuilder.create().add("pack",
            JsonObjectBuilder.create()
                .add("pack_format", packFormat)
                .add("description", description)
        ).build(), pathToSavePackDataTo.concatPath("pack.mcmeta").toPath().toFile());
    }

    @Override
    public String mainFolder() {
        return "data";
    }
}
