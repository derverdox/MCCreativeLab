package de.verdox.mccreativelab.impl.vanilla.world;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.world.MCCSound;
import net.kyori.adventure.key.Key;
import net.minecraft.sounds.SoundEvent;
import org.jetbrains.annotations.NotNull;

public class NMSSound extends NMSHandle<SoundEvent> implements MCCSound {
    public static final MCCConverter<SoundEvent, NMSSound> CONVERTER = converter(NMSSound.class, SoundEvent.class, NMSSound::new, NMSHandle::getHandle);


    public NMSSound(SoundEvent handle) {
        super(handle);
    }

    @Override
    public boolean staticDistance() {
        return !readFieldFromHandle("newSystem", new TypeToken<Boolean>() {});
    }

    @Override
    public float range() {
        return handle.getRange(1);
    }

    @Override
    public @NotNull Key key() {
        return MCCPlatform.getInstance().getConversionService().wrap(handle.getLocation(), new TypeToken<>() {});
    }
}
