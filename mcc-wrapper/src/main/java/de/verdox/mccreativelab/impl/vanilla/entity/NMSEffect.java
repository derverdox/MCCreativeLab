package de.verdox.mccreativelab.impl.vanilla.entity;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.entity.MCCEffect;
import de.verdox.mccreativelab.wrapper.entity.MCCEffectType;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import net.minecraft.world.effect.MobEffectInstance;
import org.jetbrains.annotations.Nullable;

public class NMSEffect extends MCCHandle<MobEffectInstance> implements MCCEffect {
    public static final MCCConverter<MobEffectInstance, NMSEffect> CONVERTER = converter(NMSEffect.class, MobEffectInstance.class, NMSEffect::new, MCCHandle::getHandle);

    public NMSEffect(MobEffectInstance handle) {
        super(handle);
    }

    @Override
    public MCCEffectType getType() {
        return conversionService.wrap(handle.getEffect(), new TypeToken<MCCReference<MCCEffectType>>() {}).get();
    }

    @Override
    public int getDuration() {
        return handle.getDuration();
    }

    @Override
    public int getAmplifier() {
        return handle.getAmplifier();
    }

    @Override
    public boolean isAmbient() {
        return handle.isAmbient();
    }

    @Override
    public boolean hasParticles() {
        return handle.isVisible();
    }

    @Override
    public boolean showsIcons() {
        return handle.showIcon();
    }

    @Override
    public @Nullable MCCEffect getHiddenEffect() {
        if (handle.hiddenEffect == null) {
            return null;
        }
        return new NMSEffect(handle.hiddenEffect);
    }
}
