package de.verdox.mccreativelab.impl.vanilla.item;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.block.NMSBlockState;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import de.verdox.mccreativelab.wrapper.platform.adapter.WrapperAdapter;
import net.kyori.adventure.key.Key;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

public class NMSItemType extends NMSHandle<Item> implements MCCItemType {
    public static final MCCConverter<Item, NMSItemType> CONVERTER = converter(NMSItemType.class, Item.class, NMSItemType::new, NMSHandle::getHandle);

    public NMSItemType(Item handle) {
        super(handle);
    }

    @Override
    public @NotNull MCCItemStack createItem() {
        return new NMSItemStack(new ItemStack(this.handle));
    }

    @Override
    public boolean isEmpty() {
        return handle.equals(Items.AIR);
    }

    @Override
    public @NotNull Key key() {
        ResourceLocation resourceLocation = BuiltInRegistries.ITEM.getKey(handle);
        return Key.key(resourceLocation.getNamespace(), resourceLocation.getPath());
    }
}
