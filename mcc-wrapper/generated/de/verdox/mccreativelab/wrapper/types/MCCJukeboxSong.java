package de.verdox.mccreativelab.wrapper.types;

import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import net.minecraft.sounds.SoundEvent;
import net.kyori.adventure.text.Component;
import de.verdox.mccreativelab.wrapper.MCCWrapped;

public interface MCCJukeboxSong extends MCCWrapped  {

	public MCCReference<SoundEvent> getSoundEvent();

	public Component getDescription();

	public float getLengthInSeconds();

	public int getComparatorOutput();

}
