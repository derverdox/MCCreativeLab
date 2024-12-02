package de.verdox.mccreativelab.impl.mcclab.item;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.item.NMSItemStack;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import net.minecraft.world.item.ItemStack;

public class MCCCustomItemStack extends NMSItemStack {
    public static final MCCConverter<ItemStack, MCCCustomItemStack> CONVERTER = converter(MCCCustomItemStack.class, ItemStack.class, MCCCustomItemStack::new, MCCHandle::getHandle);

    public MCCCustomItemStack(ItemStack handle) {
        super(handle);
    }

    @Override
    public MCCItemType getType() {
        //TODO: MCC Custom Logic
        return super.getType();
    }
}
