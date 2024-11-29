package de.verdox.mccreativelab.wrapper.entity;

import de.verdox.mccreativelab.wrapper.annotations.MCCInstantiationSource;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

@MCCInstantiationSource(sourceClasses = MCCEffectType.class)
public interface MCCEffect {

    MCCEffectType getType();

    int getDuration();

    int getAmplifier();

    boolean isAmbient();

    boolean hasParticles();

    boolean showsIcons();

    @Nullable MCCEffect getHiddenEffect();

    class Builder {
        private MCCEffectType type;
        private int duration = 20;
        private int amplifier = 0;
        private boolean ambient = true;
        private boolean particles = true;
        private boolean icon = true;
        private MCCEffect hiddenEffect;

        public Builder withType(MCCEffectType type) {
            Objects.requireNonNull(type);
            this.type = type;
            return this;
        }

        public Builder withDuration(int duration) {
            this.duration = duration;
            return this;
        }

        public Builder withAmplifier(int amplifier) {
            this.amplifier = amplifier;
            return this;
        }

        public Builder withAmbient(boolean ambient) {
            this.ambient = ambient;
            return this;
        }

        public Builder withParticles(boolean particles) {
            this.particles = particles;
            return this;
        }

        public Builder withIcon(boolean icon) {
            this.icon = icon;
            return this;
        }

        public Builder withHiddenEffect(MCCEffect hiddenEffect) {
            this.hiddenEffect = hiddenEffect;
            return this;
        }

        public MCCEffect build(){
            return type.create(duration, amplifier, ambient, particles, icon, hiddenEffect);
        }
    }

    default void apply(MCCLivingEntity mccEntity){
        getType().applyEffectType(mccEntity, this);
    }
}
