package de.verdox.mccreativelab.impl.paper.entity;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.entity.NMSAttributeInstance;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.item.MCCAttributeModifier;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.kyori.adventure.key.Key;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import org.jetbrains.annotations.NotNull;

public class PaperAttributeInstance extends NMSAttributeInstance {
    public static final MCCConverter<AttributeInstance, PaperAttributeInstance> CONVERTER = converter(PaperAttributeInstance.class, AttributeInstance.class, PaperAttributeInstance::new, MCCHandle::getHandle);

    public PaperAttributeInstance(AttributeInstance handle) {
        super(handle);
    }

    @Override
    public void addModifier(@NotNull MCCAttributeModifier modifier) {
        AttributeModifier attributeModifier = MCCPlatform.getInstance().getConversionService().unwrap(modifier, new TypeToken<>() {});
        handle.addPermanentModifier(attributeModifier);
    }

    @Override
    public void removeModifier(@NotNull Key key) {
        ResourceLocation resourceLocation = MCCPlatform.getInstance().getConversionService().unwrap(key, new TypeToken<>() {});
        handle.removeModifier(resourceLocation);
    }

    @Override
    public void addTransientModifier(@NotNull MCCAttributeModifier modifier) {
        AttributeModifier attributeModifier = MCCPlatform.getInstance().getConversionService().unwrap(modifier, new TypeToken<>() {});
        handle.addOrUpdateTransientModifier(attributeModifier);
    }
}
