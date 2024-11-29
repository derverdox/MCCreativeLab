package de.verdox.mccreativelab.impl.vanilla.item;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.item.components.NMSMCCDataComponentEditor;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import de.verdox.mccreativelab.wrapper.item.components.MCCDataComponentEditor;
import de.verdox.mccreativelab.wrapper.item.components.MCCDataComponentType;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.types.MCCEnchantment;
import net.kyori.adventure.text.Component;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ItemStack;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

public class NMSItemStack extends MCCHandle<ItemStack> implements MCCItemStack {
    public static final MCCConverter<ItemStack, NMSItemStack> CONVERTER = converter(NMSItemStack.class, ItemStack.class, NMSItemStack::new, MCCHandle::getHandle);

    public NMSItemStack(ItemStack handle) {
        super(handle);
    }

    @Override
    public <R, T extends MCCDataComponentType<R>> MCCItemStack edit(T dataComponentType, Consumer<MCCDataComponentEditor<R, T>> editor) {
        NMSMCCDataComponentEditor<R,T> nmsItemComponentEditor = new NMSMCCDataComponentEditor<>(handle, dataComponentType);
        editor.accept(nmsItemComponentEditor);
        return this;
    }

    @Override
    public <R, T extends MCCDataComponentType<R>> R editAndGet(T dataComponentType, Function<MCCDataComponentEditor<R, T>, R> editor) {
        NMSMCCDataComponentEditor<R,T> nmsItemComponentEditor = new NMSMCCDataComponentEditor<>(handle, dataComponentType);
        return editor.apply(nmsItemComponentEditor);
    }

    @Override
    public <R, T extends MCCDataComponentType<R>> R get(T dataComponentType) {
        NMSMCCDataComponentEditor<R,T> nmsItemComponentEditor = new NMSMCCDataComponentEditor<>(handle, dataComponentType);
        return nmsItemComponentEditor.get();
    }

    @Override
    public boolean hasDataComponentType(MCCDataComponentType<?> type) {
        return handle.has(conversionService.unwrap(type, new TypeToken<>() {}));
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
        return MCCPlatform.getInstance().getConversionService().wrap(handle.get(DataComponents.ITEM_NAME), new TypeToken<>() {});
    }

    @Override
    public void name(Component name) {
        handle.set(DataComponents.ITEM_NAME, MCCPlatform.getInstance().getConversionService().unwrap(name, net.minecraft.network.chat.Component.class));
    }

    @Override
    public Component customName() {
        return MCCPlatform.getInstance().getConversionService().wrap(handle.get(DataComponents.CUSTOM_NAME), new TypeToken<>() {});
    }

    @Override
    public void customName(Component name) {
        handle.set(DataComponents.CUSTOM_NAME, MCCPlatform.getInstance().getConversionService().unwrap(name, net.minecraft.network.chat.Component.class));
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
    public boolean isCorrectToolForDrops(MCCBlockState blockState) {
        return false;
    }

    @Override
    public float getDestroySpeed(MCCBlockState mccBlockState) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return getHandle().isEmpty();
    }

    @Override
    public int getEnchantmentLevel(MCCEnchantment mccEnchantment) {
        return 0;
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
