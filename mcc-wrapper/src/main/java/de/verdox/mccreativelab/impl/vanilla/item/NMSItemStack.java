package de.verdox.mccreativelab.impl.vanilla.item;

import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import de.verdox.mccreativelab.wrapper.item.components.ItemComponentEditor;
import de.verdox.mccreativelab.wrapper.item.components.MCCDataComponentType;
import de.verdox.mccreativelab.wrapper.platform.adapter.MCCAdapters;
import net.kyori.adventure.text.Component;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ItemStack;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

public class NMSItemStack implements MCCItemStack {
    private final ItemStack handle;

    public NMSItemStack(ItemStack handle) {
        this.handle = handle;
    }

    @Override
    public <R, T extends MCCDataComponentType<R>> void edit(T dataComponentType, Consumer<ItemComponentEditor<R, T>> editor) {
        NMSItemComponentEditor<R,T> nmsItemComponentEditor = new NMSItemComponentEditor<>(dataComponentType);
        editor.accept(nmsItemComponentEditor);
    }

    @Override
    public <R, T extends MCCDataComponentType<R>> R editAndGet(T dataComponentType, Function<ItemComponentEditor<R, T>, R> editor) {
        NMSItemComponentEditor<R,T> nmsItemComponentEditor = new NMSItemComponentEditor<>(dataComponentType);
        return editor.apply(nmsItemComponentEditor);
    }

    @Override
    public int getAmount() {
        return handle.getCount();
    }

    @Override
    public void setAmount(int amount) {
        handle.setCount(amount);
    }

    @Override
    public boolean isSimilar(MCCItemStack mccItemStack) {
        var copy1 = this.handle.copy();
        var copy2 = ((NMSItemStack) mccItemStack).handle.copy();

        copy1.setCount(1);
        copy2.setCount(1);

        return copy1.equals(copy2);
    }

    @Override
    public MCCItemStack withAmount(int amount) {
        var copy1 = this.handle.copy();
        copy1.setCount(amount);

        return new NMSItemStack(copy1);
    }

    @Override
    public Component name() {
        return MCCAdapters.getAdapter(Component.class).wrap(handle.get(DataComponents.ITEM_NAME));
    }

    @Override
    public void name(Component name) {
        handle.set(DataComponents.ITEM_NAME, MCCAdapters.getAdapter(Component.class).unwrap(net.minecraft.network.chat.Component.class, name));
    }

    @Override
    public Component customName() {
        return MCCAdapters.getAdapter(Component.class).wrap(handle.get(DataComponents.CUSTOM_NAME));
    }

    @Override
    public void customName(Component name) {
        handle.set(DataComponents.CUSTOM_NAME, MCCAdapters.getAdapter(Component.class).unwrap(net.minecraft.network.chat.Component.class, name));
    }

    @Override
    public MCCItemType getType() {
        return new NMSItemType(this.handle.getItem());
    }

    @Override
    public MCCItemStack copy() {
        return new NMSItemStack(this.handle.copy());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NMSItemStack that = (NMSItemStack) o;
        return Objects.equals(handle, that.handle);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(handle);
    }
}
