package de.verdox.mccreativelab.classgenerator;

import com.destroystokyo.paper.profile.PlayerProfile;
import com.mojang.authlib.GameProfile;
import de.verdox.mccreativelab.wrapper.MCCLocation;
import de.verdox.mccreativelab.wrapper.block.MCCBlock;
import de.verdox.mccreativelab.wrapper.block.MCCBlockData;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import net.kyori.adventure.key.Key;
import net.minecraft.core.GlobalPos;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.EitherHolder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.bukkit.Location;
import org.bukkit.block.data.BlockData;
import org.bukkit.potion.PotionEffect;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NMSMapper {
    public static final Map<Class<?>, ClassBuilder.ImportableClass> NMS_TO_API_NAME = new HashMap<>();
    public static final Map<Class<?>, Class<?>> NMS_TO_API_MAPPING = new HashMap<>();
    public static final Map<Class<?>, ClassBuilder.ImportableClass> NMS_GENERIC_TO_API_GENERIC = new HashMap<>();

    public static void register(Class<?> nmsClass, ClassBuilder.ImportableClass apiClass) {
        NMS_TO_API_NAME.put(nmsClass, apiClass);
    }

    public static void register(Class<?> nmsClass, Class<?> apiClass) {
        NMS_TO_API_MAPPING.put(nmsClass, apiClass);
        register(nmsClass, new ClassBuilder.ImportableClass(apiClass));
    }

    public static void registerGeneric(Class<?> nmsClass, ClassBuilder.ImportableClass importableClass) {
        NMS_GENERIC_TO_API_GENERIC.put(nmsClass, importableClass);
        register(nmsClass, importableClass);
    }

    static {
        // NMS to adventure
        register(EitherHolder.class, Key.class);
        register(ResourceKey.class, Key.class);
        register(ResourceLocation.class, Key.class);
        register(Holder.class, Key.class);
        register(Component.class, net.kyori.adventure.text.Component.class);
        register(MutableComponent.class, net.kyori.adventure.text.Component.class);

        // NMS to MCC
        register(GlobalPos.class, MCCLocation.class);
        register(Block.class, MCCBlockType.class);
        register(ItemStack.class, MCCItemStack.class);
        register(ItemLike.class, MCCItemStack.class);
        register(BlockState.class, MCCBlockData.class);

        // NMS to Bukkit

        register(GameProfile.class, PlayerProfile.class);
        register(MobEffectInstance.class, PotionEffect.class);
        register(DyeColor.class, org.bukkit.DyeColor.class);
        register(Player.class, org.bukkit.entity.Player.class);
        register(EquipmentSlot.class, org.bukkit.inventory.EquipmentSlot.class);
        register(AttributeModifier.class, org.bukkit.attribute.AttributeModifier.class);
        register(EquipmentSlotGroup.class, org.bukkit.inventory.EquipmentSlotGroup.class);

        // NMS to java
        register(Void.class, new ClassBuilder.ImportableClass("", "void"));
        registerGeneric(HolderSet.class, new ClassBuilder.ImportableClass(List.class));
        registerGeneric(NonNullList.class, new ClassBuilder.ImportableClass(List.class));
    }

    @Nullable
    public static Class<?> getAPIClassOfNMSClass(Class<?> nmsClass) {
        return NMS_TO_API_MAPPING.getOrDefault(nmsClass, null);
    }

    @Nullable
    public static ClassBuilder.ImportableClass getAPIGenericClassOfNMSClass(Class<?> nmsClass) {
        return NMS_GENERIC_TO_API_GENERIC.getOrDefault(nmsClass, null);
    }

    @Nullable
    public static ClassBuilder.ImportableClass getAPIClassNameForNMSClass(Class<?> nmsClass) {
        return NMS_TO_API_NAME.getOrDefault(nmsClass, new ClassBuilder.ImportableClass(nmsClass));
    }
}
