package de.verdox.mccreativelab.impl.vanilla.entity;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.entity.*;
import de.verdox.mccreativelab.wrapper.exceptions.OperationNotPossibleOnNMS;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.typed.MCCEffects;
import de.verdox.mccreativelab.wrapper.typed.MCCRegistries;
import de.verdox.mccreativelab.wrapper.util.MCCEntityMultiProperty;
import de.verdox.mccreativelab.wrapper.util.MCCEntityProperty;
import de.verdox.mccreativelab.wrapper.world.MCCDamageType;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.Nullable;

public class NMSLivingEntity<T extends LivingEntity> extends NMSEntity<T> implements MCCLivingEntity {

    public NMSLivingEntity(T handle) {
        super(handle);
    }

    @Override
    public MCCEntityMultiProperty<MCCDamageType, MCCLivingEntity> getDamageImmunityProperty() {
        throw new OperationNotPossibleOnNMS();
    }

    @Override
    public MCCEntityMultiProperty<MCCEntityType, MCCLivingEntity> getUntargetableProperty() {
        throw new OperationNotPossibleOnNMS();
    }

    @Override
    public MCCEntityProperty<Boolean, MCCLivingEntity> getPickupItemProperty() {
        throw new OperationNotPossibleOnNMS();
    }

    @Override
    public @Nullable MCCEffect getActiveEffect(MCCEffectType effectType) {
        Holder<MobEffect> mobEffectHolder = MCCPlatform.getInstance().getConversionService().unwrap(MCCRegistries.EFFECT_TYPE_REGISTRY.get().getReference(effectType).get(), new TypeToken<>() {});
        MobEffectInstance mobEffectInstance = handle.getEffect(mobEffectHolder);
        if (mobEffectInstance == null) {
            return null;
        }
        return MCCPlatform.getInstance().getConversionService().wrap(mobEffectHolder, new TypeToken<>() {});
    }

    @Override
    public boolean hasActiveEffect(MCCEffectType effectType) {
        return getActiveEffect(effectType) != null;
    }

    @Override
    public boolean isDead() {
        return handle.isDeadOrDying();
    }

    @Override
    public MCCAttributeMap getAttributes() {
        return conversionService.wrap(handle.getAttributes(), new TypeToken<>() {});
    }
}
