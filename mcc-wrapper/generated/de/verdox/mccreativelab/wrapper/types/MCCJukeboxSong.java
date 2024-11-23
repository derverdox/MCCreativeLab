package de.verdox.mccreativelab.wrapper.types;

import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import net.kyori.adventure.text.Component;
import de.verdox.mccreativelab.wrapper.world.MCCSound;
import de.verdox.mccreativelab.wrapper.MCCWrapped;

public interface MCCJukeboxSong extends MCCWrapped  {

	public MCCReference<MCCSound> getSoundEvent();

	public Component getDescription();

	public float getLengthInSeconds();

	public int getComparatorOutput();

}
