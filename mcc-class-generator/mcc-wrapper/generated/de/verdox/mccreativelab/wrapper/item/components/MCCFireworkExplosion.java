package de.verdox.mccreativelab.wrapper.item.components;

import it.unimi.dsi.fastutil.ints.IntList;
public interface MCCFireworkExplosion extends MCCItemComponentType{

	public MCCFireworkExplosion withHasTwinkle (boolean newHasTwinkle);
	public MCCFireworkExplosion withFadeColors (IntList newFadeColors);
	public boolean getHasTrail ();
	public boolean getHasTwinkle ();
	public IntList getColors ();
	public IntList getFadeColors ();
	public MCCFireworkExplosion withHasTrail (boolean newHasTrail);
	public MCCFireworkExplosion withShape (Shape newShape);
	public MCCFireworkExplosion withColors (IntList newColors);
	public Shape getShape ();
	public interface Shape extends MCCItemComponentType{

}
}
