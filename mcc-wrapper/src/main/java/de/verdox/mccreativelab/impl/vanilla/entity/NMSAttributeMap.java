package de.verdox.mccreativelab.impl.vanilla.entity;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.annotations.MCCReflective;
import de.verdox.mccreativelab.wrapper.entity.MCCAttribute;
import de.verdox.mccreativelab.wrapper.entity.MCCAttributeInstance;
import de.verdox.mccreativelab.wrapper.entity.MCCAttributeMap;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import de.verdox.mccreativelab.wrapper.typed.MCCRegistries;
import net.kyori.adventure.key.Key;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeMap;

import java.util.Map;

public class NMSAttributeMap extends NMSHandle<AttributeMap> implements MCCAttributeMap {
    public static final MCCConverter<AttributeMap, NMSAttributeMap> CONVERTER = converter(NMSAttributeMap.class, AttributeMap.class, NMSAttributeMap::new, NMSHandle::getHandle);

    public NMSAttributeMap(AttributeMap handle) {
        super(handle);
    }

    @Override
    @MCCReflective
    public void registerAttribute(MCCTypedKey<MCCAttribute> attribute) {
        if (hasAttribute(attribute)) {
            throw new IllegalArgumentException("The attribute " + attribute.key() + " is already registered");
        }
        try {
            Map<Holder<Attribute>, AttributeInstance> attributes = (Map<Holder<Attribute>, AttributeInstance>) AttributeMap.class.getField("attributes").get(handle);
            AttributeInstance attributeModifiable = new AttributeInstance(toHolder(attribute), AttributeInstance::getAttribute);
            attributes.put(toHolder(attribute), attributeModifiable);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public MCCAttributeInstance getAttributeInstance(MCCTypedKey<MCCAttribute> attribute) throws IllegalArgumentException {
        if (!hasAttribute(attribute)) {
            throw new IllegalArgumentException("The attribute " + attribute.key() + " is not registered");
        }
        return conversionService.wrap(handle.getInstance(toHolder(attribute)), new TypeToken<>() {});
    }

    @Override
    public boolean hasAttribute(MCCTypedKey<MCCAttribute> attribute) {
        return handle.hasAttribute(toHolder(attribute));
    }

    @Override
    public boolean hasModifier(MCCTypedKey<MCCAttribute> attribute, Key modifierKey) {
        return handle.hasModifier(toHolder(attribute), conversionService.unwrap(modifierKey, new TypeToken<>() {}));
    }

    @Override
    public double getValue(MCCTypedKey<MCCAttribute> attribute) {
        return handle.getValue(toHolder(attribute));
    }

    @Override
    public double getBaseValue(MCCTypedKey<MCCAttribute> attribute) {
        return handle.getBaseValue(toHolder(attribute));
    }

    @Override
    public double getModifierValue(MCCTypedKey<MCCAttribute> attribute, Key modifierKey) {
        return handle.getModifierValue(toHolder(attribute), conversionService.unwrap(modifierKey, new TypeToken<>() {}));
    }

    @Override
    public void assignAllValues(MCCAttributeMap other) {
        AttributeMap attributeMap = MCCPlatform.getInstance().getConversionService().unwrap(other, new TypeToken<>() {});
        handle.assignAllValues(attributeMap);
    }

    @Override
    public void assignBaseValues(MCCAttributeMap other) {
        AttributeMap attributeMap = MCCPlatform.getInstance().getConversionService().unwrap(other, new TypeToken<>() {});
        handle.assignBaseValues(attributeMap);
    }

    private Holder<Attribute> toHolder(MCCTypedKey<MCCAttribute> attribute) {
        return MCCPlatform.getInstance().getConversionService().unwrap(MCCRegistries.ATTRIBUTE_REGISTRY.get().getReference(attribute), new TypeToken<>() {});
    }
}
