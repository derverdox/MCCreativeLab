package de.verdox.mccreativelab.impl.vanilla.item;

import de.verdox.mccreativelab.wrapper.item.components.ItemComponentEditor;
import de.verdox.mccreativelab.wrapper.item.components.MCCDataComponentType;
import de.verdox.mccreativelab.wrapper.platform.adapter.MCCAdapter;
import de.verdox.mccreativelab.wrapper.platform.adapter.MCCAdapters;
import de.verdox.mccreativelab.wrapper.platform.adapter.NoAdapterFoundException;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public record NMSItemComponentEditor<R, T extends MCCDataComponentType<R>>(ItemStack itemStack, T type) implements ItemComponentEditor<R, T> {
    @Override
    public @Nullable R get() {
        // First we try to get the data directly. This works sometimes for types like integer
        try {
            DataComponentType<R> dataComponentType = MCCAdapters.getAdapter(MCCDataComponentType.class).unwrap(DataComponentType.class, type());
            return itemStack.get(dataComponentType);
        } catch (Throwable e) {
            DataComponentType<?> dataComponentType = MCCAdapters.getAdapter(MCCDataComponentType.class).unwrap(DataComponentType.class, type());
            try {
                return (R) MCCAdapters.tryWrap(itemStack.get(dataComponentType));
            } catch (NoAdapterFoundException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    @Override
    public void set(@Nullable R data) {
        // First we try to store the data directly. This works sometimes for types like integer
        try {
            DataComponentType<R> dataComponentType = MCCAdapters.getAdapter(MCCDataComponentType.class).unwrap(DataComponentType.class, type());
            itemStack.set(dataComponentType, data);
        } catch (Throwable e) {
            DataComponentType dataComponentType = MCCAdapters.getAdapter(MCCDataComponentType.class).unwrap(DataComponentType.class, type());
            MCCAdapter<R> adapter = MCCAdapters.getAdapter((Class<R>) data.getClass());
            itemStack.set(dataComponentType, adapter.unwrap(data));
        }
    }

    @Override
    public @NotNull R create() {
        return null;
    }
}
