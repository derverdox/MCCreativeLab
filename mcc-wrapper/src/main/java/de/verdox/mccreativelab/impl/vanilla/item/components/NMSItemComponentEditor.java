package de.verdox.mccreativelab.impl.vanilla.item.components;

import de.verdox.mccreativelab.wrapper.item.components.ItemComponentEditor;
import de.verdox.mccreativelab.wrapper.item.components.MCCDataComponentType;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public record NMSItemComponentEditor<R, T extends MCCDataComponentType<R>>(ItemStack itemStack,
                                                                           T type) implements ItemComponentEditor<R, T> {
    @Override
    public @Nullable R get() {
        // The native data that is stored inside a minecraft DataComponentType
        DataComponentType<?> nativeDataComponentType = MCCPlatform.getInstance().getConversionService().unwrap(type, DataComponentType.class);
        if (!itemStack.has(nativeDataComponentType))
            return null;

        Object nativeComponentData = itemStack.get(nativeDataComponentType);

        return MCCPlatform.getInstance().getConversionService().wrap(nativeComponentData, type().dataType());
    }

    @Override
    public void set(@Nullable R data) {
        DataComponentType nativeDataComponentType = MCCPlatform.getInstance().getConversionService().unwrap(type, DataComponentType.class);

        if (data == null) {
            itemStack.set(nativeDataComponentType, null);
            return;
        }
        itemStack.set(nativeDataComponentType, MCCPlatform.getInstance().getConversionService().unwrap(data));
    }

    @Override
    public @NotNull R create() {
        return type.createEmpty();
    }
}
