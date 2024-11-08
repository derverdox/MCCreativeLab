package de.verdox.mccreativelab.classgenerator;

import com.destroystokyo.paper.profile.PlayerProfile;
import com.mojang.authlib.GameProfile;
import de.verdox.mccreativelab.classgenerator.codegen.DynamicType;
import de.verdox.mccreativelab.classgenerator.codegen.type.ClassDescription;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
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
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.EitherHolder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.bukkit.potion.PotionEffect;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Type;
import java.util.*;
import java.util.logging.Logger;

public class NMSMapper {
    public static final Logger LOGGER = Logger.getLogger(NMSMapper.class.getName());

    private static final Map<DynamicType, ClassSwap> SWAP_MAP = new HashMap<>();

    public static void register(Type from, Type to, boolean allowsGenerics) {
        register(DynamicType.of(from, false), DynamicType.of(to, false), allowsGenerics);
    }

    public static void register(Type from, Type to) {
        register(DynamicType.of(from, false), DynamicType.of(to, false), false);
    }

    private static void register(DynamicType from, DynamicType to, boolean allowsGenerics) {
        ClassSwap classSwap = new ClassSwap(to, allowsGenerics);
        SWAP_MAP.put(from, classSwap);
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
        register(BlockState.class, MCCBlockState.class);

        // NMS to Bukkit

        register(GameProfile.class, PlayerProfile.class);
        register(MobEffectInstance.class, PotionEffect.class);
        register(DyeColor.class, org.bukkit.DyeColor.class);
        register(Player.class, org.bukkit.entity.Player.class);
        register(EquipmentSlot.class, org.bukkit.inventory.EquipmentSlot.class);

        // NMS to java
        register(Void.class, new ClassDescription(void.class));
        register(HolderSet.class, List.class, true);
        register(NonNullList.class, List.class, true);
    }

    public static boolean isSwapped(Type type) {
        return isSwapped(DynamicType.of(type, false));
    }

    public static boolean isSwapped(DynamicType type) {
        if (getSwap(type) != null)
            return true;
        for (DynamicType genericType : type.getGenericTypes()) {
            if (isSwapped(genericType))
                return true;
        }
        return false;
    }

    @Nullable
    public static DynamicType getSwap(Type type) {
        DynamicType typeToCompare = DynamicType.of(type, false);
        return getSwap(typeToCompare);
    }

    public static DynamicType getSwap(DynamicType type) {
        DynamicType swappedType = null;

        for (Map.Entry<DynamicType, ClassSwap> dynamicTypeClassSwapEntry : SWAP_MAP.entrySet()) {
            DynamicType key = dynamicTypeClassSwapEntry.getKey();

            if (key.compareWithoutGenerics(type)) {
                ClassSwap classSwap = dynamicTypeClassSwapEntry.getValue();

                // If we want to ignore generics we erase them and swap with the blank class
                if (!classSwap.allowsGenerics())
                    return classSwap.newType();
                swappedType = type;
                swappedType = swappedType.withRawType(classSwap.newType);
            }
        }

        for (DynamicType genericType : type.getGenericTypes()) {
            DynamicType swappedGeneric = getSwap(genericType);
            if(swappedGeneric != null) {
                if(swappedType == null)
                    swappedType = type;
                swappedType = swappedType.withSwappedGeneric(genericType, swappedGeneric);
            }
        }

        return swappedType;
    }

    public record ClassSwap(DynamicType newType, boolean allowsGenerics) {

    }
}
