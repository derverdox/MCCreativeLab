package de.verdox.mccreativelab.impl.vanilla.platform.converter;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.item.MCCAttributeModifier;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.kyori.adventure.key.Key;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;

public class AttributeModifierConverter implements MCCConverter<AttributeModifier, MCCAttributeModifier> {
    @Override
    public ConversionResult<MCCAttributeModifier> wrap(AttributeModifier nativeType) {
        Key key = MCCPlatform.getInstance().getConversionService().wrap(nativeType.id(), new TypeToken<>() {});
        double amount = nativeType.amount();
        MCCAttributeModifier.Operation operation = wrap(nativeType.operation());
        return done(new MCCAttributeModifier(key, amount, operation));
    }

    @Override
    public ConversionResult<AttributeModifier> unwrap(MCCAttributeModifier platformImplType) {
        ResourceLocation key = MCCPlatform.getInstance().getConversionService().unwrap(platformImplType.key(), new TypeToken<>() {});
        double amount = platformImplType.amount();
        AttributeModifier.Operation operation = unwrap(platformImplType.operation());
        return done(new AttributeModifier(key, amount, operation));
    }

    @Override
    public Class<MCCAttributeModifier> apiImplementationClass() {
        return MCCAttributeModifier.class;
    }

    @Override
    public Class<AttributeModifier> nativeMinecraftType() {
        return AttributeModifier.class;
    }

    private MCCAttributeModifier.Operation wrap(AttributeModifier.Operation operation){
        return switch (operation){
            case ADD_VALUE -> MCCAttributeModifier.Operation.ADD_VALUE;
            case ADD_MULTIPLIED_BASE -> MCCAttributeModifier.Operation.ADD_MULTIPLIED_BASE;
            case ADD_MULTIPLIED_TOTAL -> MCCAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL;
        };
    }

    private AttributeModifier.Operation unwrap(MCCAttributeModifier.Operation operation){
        return switch (operation){
            case ADD_VALUE -> AttributeModifier.Operation.ADD_VALUE;
            case ADD_MULTIPLIED_BASE -> AttributeModifier.Operation.ADD_MULTIPLIED_BASE;
            case ADD_MULTIPLIED_TOTAL -> AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL;
        };
    }
}
