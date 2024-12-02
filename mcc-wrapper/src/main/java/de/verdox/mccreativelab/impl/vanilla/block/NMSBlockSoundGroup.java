package de.verdox.mccreativelab.impl.vanilla.block;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.block.MCCBlockSoundGroup;
import net.kyori.adventure.sound.Sound;
import net.minecraft.world.level.block.SoundType;

public class NMSBlockSoundGroup extends MCCHandle<SoundType> implements MCCBlockSoundGroup {
    public static final MCCConverter<SoundType, NMSBlockSoundGroup> CONVERTER = converter(NMSBlockSoundGroup.class, SoundType.class, NMSBlockSoundGroup::new, MCCHandle::getHandle);

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
    public Sound hitSound() {
        return conversionService.wrap(handle.getHitSound(), new TypeToken<>() {});
    }

    @Override
    public Sound stepSound() {
        return conversionService.wrap(handle.getStepSound(), new TypeToken<>() {});
    }

    @Override
    public Sound breakSound() {
        return conversionService.wrap(handle.getBreakSound(), new TypeToken<>() {});
    }

    @Override
    public Sound placeSound() {
        return conversionService.wrap(handle.getPlaceSound(), new TypeToken<>() {});
    }

    @Override
    public Sound fallSound() {
        return conversionService.wrap(handle.getFallSound(), new TypeToken<>() {});
    }

}
