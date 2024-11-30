package de.verdox.mccreativelab.impl.vanilla.entity;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.entity.MCCEffect;
import de.verdox.mccreativelab.wrapper.entity.MCCEffectType;
import de.verdox.mccreativelab.wrapper.entity.MCCLivingEntity;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.typed.MCCRegistries;
import net.kyori.adventure.key.Key;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public class NMSEffectType extends MCCHandle<MobEffect> implements MCCEffectType {
    public static final MCCConverter<MobEffect, NMSEffectType> CONVERTER = converter(NMSEffectType.class, MobEffect.class, NMSEffectType::new, MCCHandle::getHandle);

    public NMSEffectType(MobEffect handle) {
        super(handle);
    }

    @Override
    public @NotNull Key key() {
        return conversionService.wrap(BuiltInRegistries.MOB_EFFECT.getKey(handle), new TypeToken<>() {});
    }

    @Override
    public void applyEffectType(MCCLivingEntity mccEntity, MCCEffect mccEffect) {
        LivingEntity entity = MCCPlatform.getInstance().getConversionService().unwrap(mccEntity, new TypeToken<>() {});
        MobEffectInstance mobEffectInstance = MCCPlatform.getInstance().getConversionService().unwrap(mccEffect, new TypeToken<>() {});
        entity.addEffect(mobEffectInstance);
    }

    @Override
    public MCCEffect create(int duration, int amplifier, boolean ambient, boolean particles, boolean icon, @Nullable MCCEffect hiddenEffect) {

        MobEffectInstance hidden = null;
        if(hiddenEffect != null){
            hidden = MCCPlatform.getInstance().getConversionService().unwrap(hiddenEffect, new TypeToken<>() {});
        }
        ResourceLocation resourceLocation = BuiltInRegistries.MOB_EFFECT.getKey(handle);
        Objects.requireNonNull(resourceLocation);
        return new NMSEffect(new MobEffectInstance(BuiltInRegistries.MOB_EFFECT.getHolder(resourceLocation).get(), duration, amplifier, ambient, particles, icon, hidden));
    }

    @Override
    public @Nullable MCCEffect getActiveEffect(MCCLivingEntity livingEntity) {
        NMSLivingEntity<?> nmsLivingEntity = conversionService.unwrap(livingEntity, new TypeToken<>() {});
        Holder<MobEffect> mobEffectHolder = MCCPlatform.getInstance().getConversionService().unwrap(MCCRegistries.EFFECT_TYPE_REGISTRY.get().getReference(this).get(), new TypeToken<>() {});
        MobEffectInstance mobEffectInstance = nmsLivingEntity.getHandle().getEffect(mobEffectHolder);
        if (mobEffectInstance == null) {
            return null;
        }
        return MCCPlatform.getInstance().getConversionService().wrap(mobEffectHolder, new TypeToken<>() {});
    }
}
