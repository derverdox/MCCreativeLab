package de.verdox.mccreativelab.wrapper.item.components;

import net.minecraft.world.item.JukeboxSong;
import de.verdox.mccreativelab.wrapper.registry.MCCEitherReference;

public interface MCCJukeboxPlayable extends MCCItemComponent  {

	public MCCEitherReference<JukeboxSong> getSong();

	public MCCJukeboxPlayable withSong(MCCEitherReference<JukeboxSong> song);

	public boolean getShowInTooltip();

	public MCCJukeboxPlayable withShowInTooltip(boolean showInTooltip);

}
