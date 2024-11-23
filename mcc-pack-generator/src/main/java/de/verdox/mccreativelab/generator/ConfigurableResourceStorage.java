package de.verdox.mccreativelab.generator;

import de.verdox.vserializer.generic.SerializationElement;
import de.verdox.vserializer.generic.Serializer;
import de.verdox.vserializer.json.JsonSerializerContext;
import net.kyori.adventure.key.Key;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ConfigurableResourceStorage<C extends CustomPack<C>> {
    private final File templateFolder;
    private final File dataFolder;

    public ConfigurableResourceStorage(File templateFolder, File dataFolder){
        this.templateFolder = templateFolder;
        this.dataFolder = dataFolder;
    }

    public void deleteTemplateFolder() throws IOException {
        File parentFolder = new File(templateFolder + "/template");
        if (parentFolder.isDirectory())
            FileUtils.deleteDirectory(parentFolder);
    }

    public <T extends Resource<C>> void loadResourceFromStorage(T resource) throws IOException {
        if(resource.getSerializer() == null){
            return;
        }
        JsonSerializerContext serializerContext = new JsonSerializerContext();
        Serializer<Resource<C>> serializer = resource.getSerializer();
        SerializationElement serializationElement = serializerContext.readFromFile(getFileOfResource(resource));

        serializer.updateLiveObjectFromJson(resource, serializationElement);

        serializerContext.writeToFile(serializer.serialize(serializerContext, resource), getTemplateFileOfResource(resource));

/*        if (fileExists(resource))
            configurableResource.deserializeFromJson(JsonUtil.readJsonFromFile(serialized));*/
    }

    private <T extends Resource<C>> boolean fileExists(T resource) {
        return getFileOfResource(resource).exists();
    }

    private <T extends Resource<C>>  File getFileOfResource(T resource) {
        String type = resource.getClass().getSimpleName();
        Key namespacedKey = resource.getKey();
        return new File(dataFolder, type + "/" + namespacedKey.namespace() + "/" + namespacedKey.key() + ".json");
    }

    private <T extends Resource<C>> File getTemplateFileOfResource(T resource) {
        String type = resource.getClass().getSimpleName();
        Key namespacedKey = resource.getKey();
        return new File(dataFolder, type + "/" + namespacedKey.namespace() + "/" + namespacedKey.key() + ".json");

    }
}
