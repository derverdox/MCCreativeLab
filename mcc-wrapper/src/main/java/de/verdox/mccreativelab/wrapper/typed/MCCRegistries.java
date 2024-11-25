package de.verdox.mccreativelab.wrapper.typed;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.entity.MCCAttribute;
import de.verdox.mccreativelab.wrapper.entity.MCCEffectType;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import de.verdox.mccreativelab.wrapper.item.components.MCCDataComponentType;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCRegistry;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import net.kyori.adventure.key.Key;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.animal.FrogVariant;
import org.jetbrains.annotations.NotNull;

public interface MCCRegistries {
    @NotNull Key REGISTRY_OF_REGISTRIES = Key.key("minecraft", "root");

    //TODO:
    // TrimPattern
    // TrimMaterial
    // Recipe
    // Advancement
    // Enchantment
    // DimensionType
    // Biome
    // ArmorMaterial
    // DecoratedPotPattern
    // VillagerType
    // VillagerProfession
    // StructureType
    // StatType
    // SoundEvent
    // SensorType
    // Schedule
    // RecipeType
    // Potion
    // PoiType
    // ParticleType
    // PaintingVariant
    // MobEffect
    // MenuType
    // MemoryModuleType
    // JukeboxSong
    // Instrument
    // GameEvent
    // FrogVariant

    MCCTypedKey<MCCRegistry<MCCAttribute>> ATTRIBUTE_REGISTRY = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "attribute"), REGISTRY_OF_REGISTRIES, new TypeToken<>() {});
    MCCTypedKey<MCCRegistry<MCCBlockType>> BLOCK_REGISTRY = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "block"), REGISTRY_OF_REGISTRIES, new TypeToken<>() {});
    MCCTypedKey<MCCRegistry<MCCItemType>> ITEM_REGISTRY = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "item"), REGISTRY_OF_REGISTRIES, new TypeToken<>() {});
    MCCTypedKey<MCCRegistry<MCCDataComponentType<?>>> DATA_COMPONENT_REGISTRY = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "data_component_type"), REGISTRY_OF_REGISTRIES, new TypeToken<>() {});
    MCCTypedKey<MCCRegistry<MCCDataComponentType<?>>> ENCHANTMENT_EFFECT_COMPONENT_TYPE_REGISTRY = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "enchantment_effect_component_type"), REGISTRY_OF_REGISTRIES, new TypeToken<>() {});
    MCCTypedKey<MCCRegistry<MCCEffectType>> EFFECT_TYPE_REGISTRY = MCCPlatform.getInstance().getTypedKeyFactory().getKey(Key.key("minecraft", "mob_effect"), REGISTRY_OF_REGISTRIES, new TypeToken<>() {});

}
