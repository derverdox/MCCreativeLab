package de.verdox.mccreativelab.wrapper.item.components;

import java.util.List;
import org.bukkit.attribute.AttributeModifier;
import net.kyori.adventure.key.Key;
import com.google.common.collect.Builder;
import org.bukkit.inventory.EquipmentSlotGroup;
public interface MCCItemAttributeModifiers extends MCCItemComponentType{

	public MCCItemAttributeModifiers withShowInTooltip (boolean newShowInTooltip);
	public MCCItemAttributeModifiers withModifiers (List<Entry> newModifiers);
	public boolean getShowInTooltip ();
	public List<Entry> getModifiers ();
	public interface Entry extends MCCItemComponentType{

		public Entry withSlot (EquipmentSlotGroup newSlot);
		public AttributeModifier getModifier ();
		public Key getAttribute ();
		public EquipmentSlotGroup getSlot ();
		public Entry withModifier (AttributeModifier newModifier);
		public Entry withAttribute (Key newAttribute);
}
	public interface Builder extends MCCItemComponentType{

		public Builder withEntries (Builder<Entry> entries);
		public Builder<Entry> getEntries ();
}
}
