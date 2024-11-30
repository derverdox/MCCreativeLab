package de.verdox.mccreativelab.impl.vanilla.entity;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.entity.MCCEffect;
import de.verdox.mccreativelab.wrapper.entity.MCCEffectType;
import net.minecraft.world.effect.MobEffectInstance;
import org.jetbrains.annotations.Nullable;

public class NMSEffect extends MCCHandle<MobEffectInstance> implements MCCEffect {
    public static final MCCConverter<MobEffectInstance, NMSEffect> CONVERTER = converter(NMSEffect.class, MobEffectInstance.class, NMSEffect::new, MCCHandle::getHandle);

    public NMSEffect(MobEffectInstance handle) {
        super(handle);
    }

    @Override
    public MCCEffectType getType() {
        //TODO
        return null;
    }

    @Override
    public int getDuration() {
        //TODO
        return 0;
    }

    @Override
    public int getAmplifier() {
        //TODO
        return 0;
    }

    @Override
    public boolean isAmbient() {
        //TODO
        return false;
    }

    @Override
    public boolean hasParticles() {
        //TODO
        return false;
    }

    @Override
    public boolean showsIcons() {
        //TODO
        return false;
    }

    @Override
    public @Nullable MCCEffect getHiddenEffect() {
        //TODO
        return null;
    }
}
