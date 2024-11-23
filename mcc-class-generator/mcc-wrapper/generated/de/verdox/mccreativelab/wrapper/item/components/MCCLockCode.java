package de.verdox.mccreativelab.wrapper.item.components;

import java.lang.String;
public interface MCCLockCode extends MCCItemComponentType{

	public MCCLockCode withKey (String newKey);
	public String getKey ();
}
