package de.verdox.mccreativelab.wrapper.item.components;


public interface MCCDyedItemColor extends MCCItemComponent  {

	public int getRgb();

	public MCCDyedItemColor withRgb(int rgb);

	public boolean getShowInTooltip();

	public MCCDyedItemColor withShowInTooltip(boolean showInTooltip);

}
