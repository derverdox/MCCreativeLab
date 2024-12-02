package de.verdox.mccreativelab.impl.mcclab.item;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.world.item.FakeItem;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import net.kyori.adventure.key.Key;
import org.jetbrains.annotations.NotNull;

public class MCCCustomItemType extends MCCHandle<FakeItem> implements MCCItemType {
    public static final MCCConverter<FakeItem, MCCCustomItemType> CONVERTER = converter(MCCCustomItemType.class, FakeItem.class, MCCCustomItemType::new, MCCHandle::getHandle);

    public MCCCustomItemType(FakeItem handle) {
        super(handle);
    }

    @Override
    public @NotNull MCCItemStack createItem() {
        return handle.createItem();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public @NotNull Key key() {
        return handle.key();
    }
}
