package de.verdox.mccreativelab.wrapper.item.components;

import java.util.Optional;
import de.verdox.mccreativelab.wrapper.MCCLocation;
public interface MCCLodestoneTracker extends MCCItemComponentType{

	public boolean getTracked ();
	public Optional<MCCLocation> getTarget ();
	public MCCLodestoneTracker withTarget (Optional<MCCLocation> newTarget);
	public MCCLodestoneTracker withTracked (boolean newTracked);
}
