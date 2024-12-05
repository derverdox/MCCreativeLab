package de.verdox.mccreativelab.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.types.MCCJukeboxSong;
import de.verdox.mccreativelab.wrapper.registry.MCCEitherReference;

public interface MCCJukeboxPlayable extends MCCItemComponent  {

	public MCCEitherReference<MCCJukeboxSong> getSong();

	public MCCJukeboxPlayable withSong(MCCEitherReference<MCCJukeboxSong> song);

	public boolean getShowInTooltip();

	public MCCJukeboxPlayable withShowInTooltip(boolean showInTooltip);

}
