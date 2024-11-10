package de.verdox.mccreativelab.conversion;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.item.NMSItemStack;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class OnlyStoneItemStack extends NMSItemStack {
    public static final MCCConverter<ItemStack, OnlyStoneItemStack> CONVERTER = converterCustomResult(OnlyStoneItemStack.class, ItemStack.class, itemStack -> {
        if (itemStack.is(Items.STONE))
            return new MCCConverter.ConversionResult<>(MCCConverter.ResultType.DONE, new OnlyStoneItemStack(itemStack));
        return new MCCConverter.ConversionResult<>(MCCConverter.ResultType.NOT_DONE, null);
    }, onlyStoneItemStack -> new MCCConverter.ConversionResult<>(MCCConverter.ResultType.DONE, onlyStoneItemStack.getHandle()));

    public OnlyStoneItemStack(ItemStack handle) {
        super(handle);
    }

    @Override
    public MCCItemType getType() {
        return super.getType();
    }
}
