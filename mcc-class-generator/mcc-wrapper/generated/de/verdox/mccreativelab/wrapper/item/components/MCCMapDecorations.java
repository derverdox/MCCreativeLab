package de.verdox.mccreativelab.wrapper.item.components;

import java.lang.String;
import net.kyori.adventure.key.Key;
import java.util.Map;
public interface MCCMapDecorations extends MCCItemComponentType{

	public Map<String, Entry> getDecorations ();
	public MCCMapDecorations withDecorations (Map<String, Entry> newDecorations);
	public interface Entry extends MCCItemComponentType{

		public Entry withType (Key newType);
		public double getZ ();
		public Entry withX (double newX);
		public Entry withZ (double newZ);
		public Entry withRotation (float newRotation);
		public Key getType ();
		public double getX ();
		public float getRotation ();
}
}
