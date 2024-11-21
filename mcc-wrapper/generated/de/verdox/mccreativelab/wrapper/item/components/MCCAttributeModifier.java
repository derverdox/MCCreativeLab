package de.verdox.mccreativelab.wrapper.item.components;

import net.kyori.adventure.key.Key;

public interface MCCAttributeModifier  {

	public Key getId();

	public MCCAttributeModifier withId(Key id);

	public double getAmount();

	public MCCAttributeModifier withAmount(double amount);

	public MCCAttributeModifier.MCCOperation getOperation();

	public MCCAttributeModifier withOperation(MCCAttributeModifier.MCCOperation operation);


	public static enum MCCOperation  {
	
		ADD_VALUE,
		ADD_MULTIPLIED_BASE,
		ADD_MULTIPLIED_TOTAL,
	;
	}
}
