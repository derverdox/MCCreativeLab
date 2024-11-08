package de.verdox.mccreativelab.impl.vanilla.item;

import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import net.kyori.adventure.key.Key;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

public class NMSItemType implements MCCItemType {
    private final Item item;

    public NMSItemType(Item item) {
        this.item = item;
    }

    @Override
    public @NotNull MCCItemStack createItem() {
        return new NMSItemStack(new ItemStack(this.item));
    }

    @Override
    public boolean isEmpty() {
        return item.equals(Items.AIR);
    }
    @Override
    public @NotNull Key key() {
        ResourceLocation resourceLocation = BuiltInRegistries.ITEM.getKey(item);
        return Key.key(resourceLocation.getNamespace(), resourceLocation.getPath());
    }
}
