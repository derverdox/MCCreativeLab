package de.verdox.mccreativelab.impl.vanilla.entity;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.entity.MCCAttribute;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;

public class NMSAttribute extends NMSHandle<Attribute> implements MCCAttribute {
    public static final MCCConverter<Attribute, NMSAttribute> CONVERTER = converter(NMSAttribute.class, Attribute.class, NMSAttribute::new, NMSHandle::getHandle);

    public NMSAttribute(Attribute handle) {
        super(handle);
    }

    @Override
    public String getTranslationKey() {
        return getHandle().getDescriptionId();
    }

    @Override
    public double getDefaultValue() {
        return getHandle().getDefaultValue();
    }

    @Override
    public double getMinValue() {
        if (handle instanceof RangedAttribute attribute) {
            return attribute.getMinValue();
        }
        return getHandle().getDefaultValue();
    }

    @Override
    public double getMaxValue() {
        if (handle instanceof RangedAttribute attribute) {
            return attribute.getMaxValue();
        }
        return getHandle().getDefaultValue();
    }
}
