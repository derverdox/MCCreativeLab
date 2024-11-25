package de.verdox.mccreativelab.wrapper.types;

import net.kyori.adventure.sound.Sound;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.MCCWrapped;

public interface MCCInstrument extends MCCWrapped  {

	public MCCReference<Sound> getSoundEvent();

	public int getUseDuration();

	public float getRange();

}
