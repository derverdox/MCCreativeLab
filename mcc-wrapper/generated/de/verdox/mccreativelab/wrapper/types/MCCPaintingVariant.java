package de.verdox.mccreativelab.wrapper.types;

import de.verdox.mccreativelab.wrapper.MCCWrapped;
import net.kyori.adventure.key.Key;

public interface MCCPaintingVariant extends MCCWrapped  {

	public int getWidth();

	public int getHeight();

	public Key getAssetId();

}
