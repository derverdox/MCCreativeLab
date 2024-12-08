package de.verdox.mccreativelab.classgenerator;

import com.destroystokyo.paper.profile.PlayerProfile;
import com.mojang.authlib.GameProfile;
import de.verdox.mccreativelab.classgenerator.codegen.type.impl.DynamicType;
import de.verdox.mccreativelab.classgenerator.codegen.type.ClassDescription;
import de.verdox.mccreativelab.conversion.ConversionService;
import de.verdox.mccreativelab.conversion.ConversionServiceImpl;
import de.verdox.mccreativelab.impl.paper.platform.PaperPlatform;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSPlatform;
import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.entity.ai.MCCMemoryModuleType;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.*;
import de.verdox.mccreativelab.wrapper.item.components.MCCDataComponentType;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import io.papermc.paper.registry.data.util.Conversions;
import it.unimi.dsi.fastutil.ints.IntList;
import net.kyori.adventure.key.Key;
import net.minecraft.core.*;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.ai.memory.MemoryModuleType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.BlastFurnaceMenu;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import org.bukkit.potion.PotionEffect;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class NMSMapper {
    public static final Logger LOGGER = Logger.getLogger(NMSMapper.class.getSimpleName());

    private static final Map<DynamicType, ClassSwap> SWAP_MAP = new HashMap<>();

    public static void register(Type from, Type to, boolean allowsGenerics) {
        register(DynamicType.of(from, false), DynamicType.of(to, false), allowsGenerics);
    }

    public static void register(Type from, Type to) {
        if (from == null || to == null) {
            return;
        }
        register(DynamicType.of(from, false), DynamicType.of(to, false), false);
    }

    public static void register(DynamicType from, DynamicType to, boolean allowsGenerics) {
        if (SWAP_MAP.containsKey(from)) {
            //LOGGER.warning("The type " + from.getClassDescription() + " already has a mapping");
            return;
        }
        ClassSwap classSwap = new ClassSwap(to, allowsGenerics);
        SWAP_MAP.put(from, classSwap);
        //LOGGER.warning("Registered mapping from " + from.getClassDescription()+ " to " + to.getClassDescription());
    }

    static {
        useSwapCacheFromPlatform();
        // NMS to adventure
        register(Component.class, net.kyori.adventure.text.Component.class);
        register(MutableComponent.class, net.kyori.adventure.text.Component.class);

        // NMS to MCC
        register(GlobalPos.class, MCCLocation.class);
        register(ItemLike.class, MCCItemStack.class);
        register(DataComponentType.class, MCCDataComponentType.class, true);

        // NMS to java
        register(Void.class, new ClassDescription(void.class));
        register(NonNullList.class, List.class, true);
        register(IntList.class, IntList.class, true);
    }

    public static void useSwapCacheFromPlatform() {
        for (ConversionService.ClassPair classPair : MCCPlatform.getInstance().getConversionService().getAllKnownClassPairs()) {
            register(classPair.nativeType(), classPair.apiType());
        }
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

        if (type.getRawType() != null) {
            swappedType = type;
            Class<?> swapClass = MCCPlatform.getInstance().getConversionService().wrapClassTypeOrNull(type.getRawType());
            if (swapClass != null) {
                swappedType = swappedType.withRawType(DynamicType.of(swapClass, false));
            }
        }

        if (swappedType == null) {
            for (Map.Entry<DynamicType, ClassSwap> dynamicTypeClassSwapEntry : SWAP_MAP.entrySet()) {
                DynamicType key = dynamicTypeClassSwapEntry.getKey();

                if (key.compareWithoutGenerics(type)) {
                    ClassSwap classSwap = dynamicTypeClassSwapEntry.getValue();

                    // If we want to ignore generics we erase them and swap with the blank class
/*                if (!classSwap.allowsGenerics()) {
                    return classSwap.newType();
                }*/
                    swappedType = type;
                    swappedType = swappedType.withRawType(classSwap.newType);

                }
            }
        }

        for (DynamicType genericType : type.getGenericTypes()) {
            DynamicType swappedGeneric = getSwap(genericType);
            if (swappedGeneric != null) {
                if (swappedType == null)
                    swappedType = type;
                swappedType = swappedType.withSwappedGeneric(genericType, swappedGeneric);
            }
        }

        return swappedType;
    }

    public record ClassSwap(DynamicType newType, boolean allowsGenerics) {

    }
}
