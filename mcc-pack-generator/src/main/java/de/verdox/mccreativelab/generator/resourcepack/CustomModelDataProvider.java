package de.verdox.mccreativelab.generator.resourcepack;

import net.kyori.adventure.key.Key;

import java.util.HashMap;
import java.util.Map;

public class CustomModelDataProvider {
    private static final Map<Key, Integer> drawnModelData = new HashMap<>();
    public static int drawCustomModelData(Key material){
        int modelData = drawnModelData.computeIfAbsent(material, material1 -> 5000);
        drawnModelData.put(material, modelData+1);
        return modelData;
    }
}
