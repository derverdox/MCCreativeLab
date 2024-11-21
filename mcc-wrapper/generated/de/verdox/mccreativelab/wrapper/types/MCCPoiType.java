package de.verdox.mccreativelab.wrapper.types;

import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import java.util.Set;
import de.verdox.mccreativelab.wrapper.MCCWrapped;

public interface MCCPoiType extends MCCWrapped  {

	public Set<MCCBlockState> getMatchingStates();

	public int getMaxTickets();

	public int getValidRange();

}
