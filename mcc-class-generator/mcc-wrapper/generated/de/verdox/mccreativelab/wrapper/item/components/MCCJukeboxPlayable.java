package de.verdox.mccreativelab.wrapper.item.components;

import net.kyori.adventure.key.Key;
public interface MCCJukeboxPlayable extends MCCItemComponentType{

	public MCCJukeboxPlayable withSong (Key newSong);
	public Key getSong ();
	public boolean getShowInTooltip ();
	public MCCJukeboxPlayable withShowInTooltip (boolean newShowInTooltip);
}
