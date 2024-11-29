package de.verdox.mccreativelab.impl.vanilla.types;

import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.impl.vanilla.types.NMSInstrument;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.types.MCCInstrument;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import net.kyori.adventure.sound.Sound;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Instrument;

public class NMSInstrument extends MCCHandle<Instrument> implements MCCInstrument  {

	public static final MCCConverter<Instrument, NMSInstrument> CONVERTER  = converter(NMSInstrument.class, Instrument.class, NMSInstrument::new, MCCHandle::getHandle);

	public NMSInstrument(Instrument handle){
		super(handle);
	}

	public MCCReference<Sound> getSoundEvent(){
		var nms = getSoundEventFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCReference<Sound>>() {});
	}

	private Holder<SoundEvent> getSoundEventFromImpl(){
		return handle == null ? null : handle.soundEvent();
	}

	public int getUseDuration(){
		var nms = getUseDurationFromImpl();
		return nms;
	}

	private int getUseDurationFromImpl(){
		return handle == null ? 0 : handle.useDuration();
	}

	public float getRange(){
		var nms = getRangeFromImpl();
		return nms;
	}

	private float getRangeFromImpl(){
		return handle == null ? 0 : handle.range();
	}

}
