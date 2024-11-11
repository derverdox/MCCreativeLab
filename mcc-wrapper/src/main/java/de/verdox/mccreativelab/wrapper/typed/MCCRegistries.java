package de.verdox.mccreativelab.wrapper.typed;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCRegistry;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import net.kyori.adventure.key.Key;
import org.jetbrains.annotations.NotNull;

public interface MCCRegistries {
    @NotNull Key REGISTRY_OF_REGISTRIES = Key.key("minecraft", "root");

    MCCTypedKey<MCCRegistry<MCCBlockType>> BLOCK_REGISTRY = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block"), REGISTRY_OF_REGISTRIES, new TypeToken<>() {});
    MCCTypedKey<MCCRegistry<MCCItemType>> ITEM_REGISTRY = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item"), REGISTRY_OF_REGISTRIES, new TypeToken<>() {});
}
