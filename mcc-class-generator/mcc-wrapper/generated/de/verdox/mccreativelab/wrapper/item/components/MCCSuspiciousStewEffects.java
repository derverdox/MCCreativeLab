package de.verdox.mccreativelab.wrapper.item.components;

import java.util.List;
import net.kyori.adventure.key.Key;
public interface MCCSuspiciousStewEffects extends MCCItemComponentType{

	public List<Entry> getEffects ();
	public MCCSuspiciousStewEffects withEffects (List<Entry> newEffects);
	public interface Entry extends MCCItemComponentType{

		public Entry withDuration (int newDuration);
		public int getDuration ();
		public Entry withEffect (Key newEffect);
		public Key getEffect ();
}
}
