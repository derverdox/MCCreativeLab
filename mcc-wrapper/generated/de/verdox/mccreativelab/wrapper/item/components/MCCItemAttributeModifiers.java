package de.verdox.mccreativelab.wrapper.item.components;

import java.util.List;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.item.components.MCCItemAttributeModifiers;
import de.verdox.mccreativelab.wrapper.entity.MCCAttribute;

public interface MCCItemAttributeModifiers extends MCCItemComponent  {

	public MCCItemAttributeModifiers.MCCBuilder createMCCBuilder();

	public MCCItemAttributeModifiers.MCCEntry createMCCEntry();

	public List<MCCItemAttributeModifiers.MCCEntry> getModifiers();

	public MCCItemAttributeModifiers withModifiers(List<MCCItemAttributeModifiers.MCCEntry> modifiers);

	public boolean getShowInTooltip();

	public MCCItemAttributeModifiers withShowInTooltip(boolean showInTooltip);


	public static interface MCCBuilder  {
	
	}

	public static interface MCCEntry  {
	
		public MCCReference<MCCAttribute> getAttribute();
	
		public MCCItemAttributeModifiers.MCCEntry withAttribute(MCCReference<MCCAttribute> attribute);
	
		public MCCAttributeModifier getModifier();
	
		public MCCItemAttributeModifiers.MCCEntry withModifier(MCCAttributeModifier modifier);
	
		public MCCEquipmentSlotGroup getSlot();
	
		public MCCItemAttributeModifiers.MCCEntry withSlot(MCCEquipmentSlotGroup slot);
	
	}
}
