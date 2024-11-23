package de.verdox.mccreativelab.wrapper.types;

import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.world.MCCSound;
import de.verdox.mccreativelab.wrapper.MCCWrapped;

public interface MCCInstrument extends MCCWrapped  {

	public MCCReference<MCCSound> getSoundEvent();

	public int getUseDuration();

	public float getRange();

}
