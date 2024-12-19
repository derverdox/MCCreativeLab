package de.verdox.mccreativelab.world.item;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.impl.paper.platform.converter.BukkitAdapter;
import de.verdox.mccreativelab.registry.CustomRegistry;
import de.verdox.mccreativelab.registry.Reference;
import de.verdox.mccreativelab.wrapper.annotations.MCCRequireVanillaElement;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.registry.MCCRegistry;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import de.verdox.mccreativelab.wrapper.typed.MCCDataComponentTypes;
import net.kyori.adventure.key.Key;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class FakeItemRegistry extends CustomRegistry<FakeItem> {
    private static MCCReference<MCCRegistry<MCCItemType>> VANILLA_REGISTRY;

    private final Map<Entry, Reference<? extends FakeItem>> fakeItemMapping = new HashMap<>();

    public <T extends FakeItem> Reference<T> register(FakeItem.Builder<T> fakeItemBuilder){
        T fakeItem = fakeItemBuilder.buildItem();
        Reference<T> result = register(fakeItem.key(), fakeItem);
        fakeItemMapping.put(Entry.of(fakeItem.createItemStack()), result);

        MCCTypedKey<MCCRegistry<MCCItemType>> registryKey = VANILLA_REGISTRY.unwrapKey().get();
        MCCTypedKey<MCCItemType> typedKey = MCCPlatform.getInstance().getTypedKeyFactory().getKey(result.getKey(), registryKey.key(), new TypeToken<MCCItemType>() {});
        VANILLA_REGISTRY.get().register(typedKey, result.unwrapValue().asItemType());
        return result;
    }

    @Nullable
    public Reference<? extends FakeItem> getFakeItem(Entry entry){
        if(!fakeItemMapping.containsKey(entry))
            return null;
        return fakeItemMapping.get(entry);
    }

    public Reference<? extends FakeItem> getFakeItem(@Nullable MCCItemStack stack){
        return stack == null ? null : getFakeItem(Entry.of(stack));
    }

    @Deprecated
    public Reference<? extends FakeItem> getFakeItem(@Nullable ItemStack stack){
        return getFakeItem(BukkitAdapter.wrap(stack, MCCItemStack.class));
    }

    public record Entry(@MCCRequireVanillaElement MCCItemType vanillaMaterial, int customModelData){
        public static Entry of(MCCItemStack stack){
            return new Entry(stack.getType(), stack.components().get(MCCDataComponentTypes.CUSTOM_MODEL_DATA.get()).getValue());
        }
    }

    public static void registerToMinecraftRegistry(){
        VANILLA_REGISTRY = MCCPlatform.getInstance().getRegistryStorage().createMinecraftRegistry(Key.key("mcc", "item"));
    }

}
