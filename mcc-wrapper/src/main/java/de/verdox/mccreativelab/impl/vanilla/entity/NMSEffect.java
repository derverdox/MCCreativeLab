package de.verdox.mccreativelab.impl.vanilla.entity;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.entity.MCCEffect;
import de.verdox.mccreativelab.wrapper.entity.MCCEffectType;
import net.minecraft.world.effect.MobEffectInstance;
import org.jetbrains.annotations.Nullable;

public class NMSEffect extends NMSHandle<MobEffectInstance> implements MCCEffect {
    public static final MCCConverter<MobEffectInstance, NMSEffect> CONVERTER = converter(NMSEffect.class, MobEffectInstance.class, NMSEffect::new, NMSHandle::getHandle);

    public NMSEffect(MobEffectInstance handle) {
        super(handle);
    }

    @Override
    public MCCEffectType getType() {
        return null;
    }

    @Override
    public int getDuration() {
        return 0;
    }

    @Override
    public int getAmplifier() {
        return 0;
    }

    @Override
    public boolean isAmbient() {
        return false;
    }

    @Override
    public boolean hasParticles() {
        return false;
    }

    @Override
    public boolean showsIcons() {
        return false;
    }

    @Override
    public @Nullable MCCEffect getHiddenEffect() {
        return null;
    }
}
