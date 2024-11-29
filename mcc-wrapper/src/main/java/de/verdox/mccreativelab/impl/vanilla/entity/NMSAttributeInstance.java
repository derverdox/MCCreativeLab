package de.verdox.mccreativelab.impl.vanilla.entity;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.entity.MCCAttribute;
import de.verdox.mccreativelab.wrapper.entity.MCCAttributeInstance;
import de.verdox.mccreativelab.wrapper.exceptions.OperationNotPossibleOnNMS;
import de.verdox.mccreativelab.wrapper.item.MCCAttributeModifier;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import net.kyori.adventure.key.Key;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class NMSAttributeInstance extends MCCHandle<AttributeInstance> implements MCCAttributeInstance {
    public NMSAttributeInstance(AttributeInstance handle) {
        super(handle);
    }

    @Override
    public @NotNull MCCReference<MCCAttribute> getAttribute() {
        return MCCPlatform.getInstance().getConversionService().wrap(handle.getAttribute(), new TypeToken<>() {});
    }

    @Override
    public double getBaseValue() {
        return handle.getBaseValue();
    }

    @Override
    public void setBaseValue(double value) {
        handle.setBaseValue(value);
    }

    @Override
    public @NotNull Collection<MCCAttributeModifier> getModifiers() {
        return MCCPlatform.getInstance().getConversionService().wrap(handle.getModifiers(), new TypeToken<>() {});
    }

    @Override
    public void removeModifier(@NotNull Key key) {
        throw new OperationNotPossibleOnNMS();
    }

    @Override
    public void addModifier(@NotNull MCCAttributeModifier modifier) {
        throw new OperationNotPossibleOnNMS();
    }

    @Override
    public void addTransientModifier(@NotNull MCCAttributeModifier modifier) {
        throw new OperationNotPossibleOnNMS();
    }

    @Override
    public void removeModifier(@NotNull MCCAttributeModifier modifier) {
        throw new OperationNotPossibleOnNMS();
    }

    @Override
    public double getValue() {
        return handle.getValue();
    }

    @Override
    public double getDefaultValue() {
        return handle.getBaseValue();
    }
}
