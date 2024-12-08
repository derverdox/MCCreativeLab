package de.verdox.mccreativelab.wrapper.item.components;

import net.minecraft.core.GlobalPos;
import java.util.Optional;

public interface MCCLodestoneTracker extends MCCItemComponent  {

	public Optional<GlobalPos> getTarget();

	public MCCLodestoneTracker withTarget(Optional<GlobalPos> target);

	public boolean getTracked();

	public MCCLodestoneTracker withTracked(boolean tracked);

}
