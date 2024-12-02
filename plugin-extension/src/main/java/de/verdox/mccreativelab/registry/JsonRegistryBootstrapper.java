package de.verdox.mccreativelab.registry;

import de.verdox.vserializer.generic.SerializationContext;
import de.verdox.vserializer.generic.Serializer;
import de.verdox.vserializer.json.JsonSerializerContext;
import org.bukkit.Keyed;
import org.codehaus.plexus.util.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class JsonRegistryBootstrapper<T extends Keyed> {
    private final File registryFolder;
    private final OpenRegistry<T> registry;
    private final Serializer<T> serializer;
    private final SerializationContext context = new JsonSerializerContext();

    public JsonRegistryBootstrapper(File registryFolder, OpenRegistry<T> registry, Serializer<T> serializer) {
        this.registryFolder = registryFolder;
        this.registry = registry;
        this.serializer = serializer;
    }

    public void bootstrap(T... exampleValues) throws IOException {
        for (T exampleValue : exampleValues) {
            File file = new File(registryFolder + "/" + exampleValue.getKey().namespace() + "_" + exampleValue.getKey().value() + ".json");
            context.writeToFile(serializer.serialize(context, exampleValue), file);
        }

        try (Stream<Path> stream = Files.walk(registryFolder.toPath(), 1).skip(1)) {
            stream.filter(path -> FileUtils.extension(path.toFile().getName()).equals("json"))
                .forEach(path -> {
                    try {
                        T deserialized = serializer.deserialize(context.readFromFile(path.toFile()));
                        if (deserialized == null)
                            return;
                        registry.register(deserialized.getKey(), deserialized);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        }
    }

}
