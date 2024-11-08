package de.verdox.mccreativelab.impl.vanilla.platform.adapter;

import de.verdox.mccreativelab.wrapper.item.components.MCCDataComponentType;
import de.verdox.mccreativelab.wrapper.platform.adapter.WrapperAdapter;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.component.DataComponents;

public class DataComponentTypeAdapter implements WrapperAdapter<DataComponentType, MCCDataComponentType> {
    @Override
    public DataComponentType apiToPlatform(MCCDataComponentType wrappedObject) {
        if (wrappedObject.equals(MCCDataComponentType.ATTRIBUTE_MODIFIERS))
            return DataComponents.ATTRIBUTE_MODIFIERS;
        return null;
    }

    @Override
    public MCCDataComponentType platformToApi(DataComponentType platformObject) {
        return null;
    }

    @Override
    public Class<DataComponentType> getPlatformType() {
        return DataComponentType.class;
    }

    @Override
    public Class<MCCDataComponentType> getApiType() {
        return MCCDataComponentType.class;
    }
}
