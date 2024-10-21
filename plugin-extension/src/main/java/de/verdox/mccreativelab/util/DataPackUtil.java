package de.verdox.mccreativelab.util;

import de.verdox.mccreativelab.generator.Asset;
import de.verdox.mccreativelab.util.io.ZipUtil;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class DataPackUtil {
    public static File installDataPack(String levelName, String dataPackName, Asset<?> dataPackAsset) {
        return ZipUtil.extractFilesFromZipFileResource(dataPackAsset.assetInputStream(), String.valueOf(Path.of(levelName + "/datapacks/" + dataPackName)));
    }

    public static void removeInstalledDataPack(String levelName, String dataPackName, Asset<?> dataPackAsset) throws IOException {
        File dataPackDirectory = Path.of(levelName + "/datapacks/" + dataPackName).toFile();
        FileUtils.deleteDirectory(dataPackDirectory);
    }
}
