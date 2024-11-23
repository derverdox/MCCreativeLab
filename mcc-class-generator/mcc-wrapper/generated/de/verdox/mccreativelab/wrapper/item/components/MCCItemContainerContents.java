package de.verdox.mccreativelab.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import java.util.List;
public interface MCCItemContainerContents extends MCCItemComponentType{

	public int getHashCode ();
	public MCCItemContainerContents withItems (List<MCCItemStack> items);
	public MCCItemContainerContents withHashCode (int hashCode);
	public List<MCCItemStack> getItems ();
	public interface Slot extends MCCItemComponentType{

		public MCCItemStack getItem ();
		public Slot withIndex (int newIndex);
		public Slot withItem (MCCItemStack newItem);
		public int getIndex ();
}
}
