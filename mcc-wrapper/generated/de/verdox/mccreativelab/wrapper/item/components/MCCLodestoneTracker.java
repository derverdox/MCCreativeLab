package de.verdox.mccreativelab.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import java.util.Optional;

public interface MCCLodestoneTracker extends MCCItemComponent  {

	public Optional<MCCLocation> getTarget();

	public MCCLodestoneTracker withTarget(Optional<MCCLocation> target);

	public boolean getTracked();

	public MCCLodestoneTracker withTracked(boolean tracked);

}
