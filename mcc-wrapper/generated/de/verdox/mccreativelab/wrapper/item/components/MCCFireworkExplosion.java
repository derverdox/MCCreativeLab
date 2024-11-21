package de.verdox.mccreativelab.wrapper.item.components;

import it.unimi.dsi.fastutil.ints.IntList;

public interface MCCFireworkExplosion extends MCCItemComponent  {

	public MCCFireworkExplosion.MCCShape getShape();

	public MCCFireworkExplosion withShape(MCCFireworkExplosion.MCCShape shape);

	public IntList getColors();

	public MCCFireworkExplosion withColors(IntList colors);

	public IntList getFadeColors();

	public MCCFireworkExplosion withFadeColors(IntList fadeColors);

	public boolean getHasTrail();

	public MCCFireworkExplosion withHasTrail(boolean hasTrail);

	public boolean getHasTwinkle();

	public MCCFireworkExplosion withHasTwinkle(boolean hasTwinkle);


	public static enum MCCShape  {
	
		SMALL_BALL,
		LARGE_BALL,
		STAR,
		CREEPER,
		BURST,
	;
	}
}
