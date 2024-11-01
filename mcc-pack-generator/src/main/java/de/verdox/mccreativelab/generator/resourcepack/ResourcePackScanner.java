package de.verdox.mccreativelab.generator.resourcepack;

import de.verdox.mccreativelab.generator.Asset;
import de.verdox.mccreativelab.generator.AssetPath;
import de.verdox.mccreativelab.generator.AssetType;
import net.kyori.adventure.key.Key;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class ResourcePackScanner {
    private static final Logger LOGGER = Logger.getLogger(ResourcePackScanner.class.getName());
    private final Map<AssetType<CustomResourcePack>, Map<Key, AssetBasedResourcePackResource>> foundAssets = new HashMap<>();
    private final Set<AssetBasedResourcePackResource> resources = new HashSet<>();
    private final Path packMainFolder;

    public ResourcePackScanner(Path packMainFolder) {
        this.packMainFolder = packMainFolder;
    }

    public void scan() throws IOException {
        if (!Path.of(packMainFolder + "/pack.mcmeta").toFile().exists()) {
            LOGGER.info(packMainFolder + " is not a resource pack");
            return;
        }
        LOGGER.info("Scanning resource pack located at " + packMainFolder);
        Path assetPaths = Path.of(packMainFolder + "/assets");
        try (Stream<Path> fileStream = Files.walk(assetPaths)) {
            fileStream.forEachOrdered(path -> {
                if (!path.toFile().isFile())
                    return;
                String[] pathSplit = getRelativePath(assetPaths.toString(), path.toString()).split(Pattern.quote(File.separator));
                String namespace = pathSplit[0];
                String type = pathSplit[1];
                int indexOfType = path.toString().indexOf(type);
                AssetType<CustomResourcePack> resourceType = new AssetType<>(AssetPath.buildPath(pathSplit[1]));
                String key = path.toString()
                                 .substring(indexOfType + type.length() + 1)
                                 .split("\\.")[0].replace("\\", "/");

                Asset<CustomResourcePack> asset = new Asset<>(() -> {
                    try {
                        return new FileInputStream(path.toFile());
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                }, false);

                AssetBasedResourcePackResource assetBasedResourcePackResource = new AssetBasedResourcePackResource(Key.key(namespace, key), asset, resourceType, FilenameUtils.getExtension(path.toFile().getName()));
                foundAssets.computeIfAbsent(resourceType, assetType -> new HashMap<>()).put(Key.key(namespace, key), assetBasedResourcePackResource);
                resources.add(assetBasedResourcePackResource);
            });
        }
    }

    public Set<AssetBasedResourcePackResource> getResources() {
        return resources;
    }

    private String getRelativePath(String parentPath, String fullAssetPath) {
        if (!fullAssetPath.startsWith(parentPath)) {
            // Der vollständige Pfad sollte mit dem Basispfad beginnen
            return "Ungültige Pfade";
        }

        // Entferne den Basispfad und das Trennzeichen am Anfang
        return fullAssetPath.substring(parentPath.length() + 1);
    }
}
