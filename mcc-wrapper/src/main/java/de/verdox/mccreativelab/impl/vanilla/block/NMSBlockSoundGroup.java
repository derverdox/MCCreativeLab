package de.verdox.mccreativelab.impl.vanilla.block;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.block.MCCBlockSoundGroup;
import net.kyori.adventure.sound.Sound;
import net.minecraft.world.level.block.SoundType;

public class NMSBlockSoundGroup extends NMSHandle<SoundType> implements MCCBlockSoundGroup {
    public static final MCCConverter<SoundType, NMSBlockSoundGroup> CONVERTER = converter(NMSBlockSoundGroup.class, SoundType.class, NMSBlockSoundGroup::new, NMSHandle::getHandle);

    public NMSBlockSoundGroup(SoundType handle) {
        super(handle);
    }

    @Override
    public float getVolume() {
        return handle.getVolume();
    }

    @Override
    public float getPitch() {
        return handle.getPitch();
    }

    @Override
    public Sound getHitSound() {
        return conversionService.wrap(handle.getHitSound(), new TypeToken<>() {});
    }

    @Override
    public Sound getStepSound() {
        return conversionService.wrap(handle.getStepSound(), new TypeToken<>() {});
    }

    @Override
    public Sound getBreakSound() {
        return conversionService.wrap(handle.getBreakSound(), new TypeToken<>() {});
    }

    @Override
    public Sound getPlaceSound() {
        return conversionService.wrap(handle.getPlaceSound(), new TypeToken<>() {});
    }

    @Override
    public Sound getFallSound() {
        return conversionService.wrap(handle.getFallSound(), new TypeToken<>() {});
    }
}
