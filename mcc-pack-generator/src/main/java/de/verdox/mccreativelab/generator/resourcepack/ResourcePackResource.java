package de.verdox.mccreativelab.generator.resourcepack;

import de.verdox.mccreativelab.generator.AbstractResource;
import net.kyori.adventure.key.Key;

public abstract class ResourcePackResource extends AbstractResource<CustomResourcePack> {
    public ResourcePackResource(Key namespacedKey) {
        super(namespacedKey);
    }
}
