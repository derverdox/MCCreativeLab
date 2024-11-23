package de.verdox.mccreativelab.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import java.util.List;
public interface MCCChargedProjectiles extends MCCItemComponentType{

	public List<MCCItemStack> getItems ();
	public MCCChargedProjectiles withItems (List<MCCItemStack> items);
}
