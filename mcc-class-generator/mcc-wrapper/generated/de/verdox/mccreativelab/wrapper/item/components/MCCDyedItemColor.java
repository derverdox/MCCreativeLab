package de.verdox.mccreativelab.wrapper.item.components;

public interface MCCDyedItemColor extends MCCItemComponentType{

	public MCCDyedItemColor withRgb (int newRgb);
	public int getRgb ();
	public boolean getShowInTooltip ();
	public MCCDyedItemColor withShowInTooltip (boolean newShowInTooltip);
}
