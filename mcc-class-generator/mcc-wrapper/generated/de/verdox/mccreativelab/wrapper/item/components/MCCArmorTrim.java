package de.verdox.mccreativelab.wrapper.item.components;

import java.util.function.Function;
import net.kyori.adventure.key.Key;
public interface MCCArmorTrim extends MCCItemComponentType{

	public Function<Key, Key> getOuterTexture ();
	public Key getMaterial ();
	public Key getPattern ();
	public Function<Key, Key> getInnerTexture ();
	public MCCArmorTrim withMaterial (Key material);
	public MCCArmorTrim withOuterTexture (Function<Key, Key> outerTexture);
	public MCCArmorTrim withPattern (Key pattern);
	public boolean getShowInTooltip ();
	public MCCArmorTrim withInnerTexture (Function<Key, Key> innerTexture);
	public MCCArmorTrim withShowInTooltip (boolean showInTooltip);
}
