package de.verdox.mccreativelab.wrapper.types;

import net.kyori.adventure.sound.Sound;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import net.kyori.adventure.text.Component;
import de.verdox.mccreativelab.wrapper.MCCWrapped;

public interface MCCJukeboxSong extends MCCWrapped  {

	public MCCReference<Sound> getSoundEvent();

	public Component getDescription();

	public float getLengthInSeconds();

	public int getComparatorOutput();

}
