package de.verdox.mccreativelab.wrapper.types;

import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import net.minecraft.sounds.SoundEvent;
import de.verdox.mccreativelab.wrapper.MCCWrapped;

public interface MCCInstrument extends MCCWrapped  {

	public MCCReference<SoundEvent> getSoundEvent();

	public int getUseDuration();

	public float getRange();

}
