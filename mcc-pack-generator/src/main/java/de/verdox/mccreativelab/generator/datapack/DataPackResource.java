package de.verdox.mccreativelab.generator.datapack;

import de.verdox.mccreativelab.generator.AbstractResource;
import net.kyori.adventure.key.Key;

public abstract class DataPackResource extends AbstractResource<CustomDataPack> {
    public DataPackResource(Key namespacedKey) {
        super(namespacedKey);
    }
}
