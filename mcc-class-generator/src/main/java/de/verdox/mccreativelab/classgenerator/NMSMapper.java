package de.verdox.mccreativelab.classgenerator;

import com.destroystokyo.paper.profile.PlayerProfile;
import com.mojang.authlib.GameProfile;
import net.kyori.adventure.key.Key;
import net.minecraft.core.GlobalPos;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.EitherHolder;
import net.minecraft.world.item.ItemStack;
import org.bukkit.Location;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

public class NMSMapper {
    public static final Map<Class<?>, ClassBuilder.ImportableClass> NMS_TO_API_NAME = new HashMap<>();
    public static final Map<Class<?>, Class<?>> NMS_TO_API_MAPPING = new HashMap<>();

    public static void register(Class<?> nmsClass, ClassBuilder.ImportableClass apiClass) {
        NMS_TO_API_NAME.put(nmsClass, apiClass);
    }

    public static void register(Class<?> nmsClass, Class<?> apiClass) {
        NMS_TO_API_MAPPING.put(nmsClass, apiClass);
        register(nmsClass, new ClassBuilder.ImportableClass(apiClass));
    }

    static {
        register(EitherHolder.class, Key.class);
        register(ResourceKey.class, Key.class);
        register(Holder.class, Key.class);
        register(ItemStack.class, org.bukkit.inventory.ItemStack.class);
        register(Component.class, net.kyori.adventure.text.Component.class);
        register(GlobalPos.class, Location.class);
        register(GameProfile.class, PlayerProfile.class);
    }

    @Nullable
    public static Class<?> getAPIClassOfNMSClass(Class<?> nmsClass) {
        return NMS_TO_API_MAPPING.getOrDefault(nmsClass, null);
    }

    @Nullable
    public static ClassBuilder.ImportableClass getAPIClassNameForNMSClass(Class<?> nmsClass) {
        return NMS_TO_API_NAME.getOrDefault(nmsClass, new ClassBuilder.ImportableClass(nmsClass));
    }
}
