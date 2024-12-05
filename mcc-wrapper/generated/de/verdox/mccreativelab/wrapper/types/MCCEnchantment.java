package de.verdox.mccreativelab.wrapper.types;

import java.util.List;
import de.verdox.mccreativelab.wrapper.entity.MCCEquipmentSlotGroup;
import net.kyori.adventure.text.Component;
import net.minecraft.core.component.DataComponentMap;
import java.util.Optional;
import de.verdox.mccreativelab.wrapper.types.MCCEnchantment;
import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.registry.MCCReferenceSet;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;

public interface MCCEnchantment extends MCCWrapped  {

	public Component getDescription();

	public MCCEnchantment.EnchantmentDefinition getDefinition();

	public MCCReferenceSet<MCCEnchantment> getExclusiveSet();

	public DataComponentMap getEffects();


	public static interface EnchantmentDefinition  {
	
		public MCCReferenceSet<MCCItemType> getSupportedItems();
	
		public Optional<MCCReferenceSet<MCCItemType>> getPrimaryItems();
	
		public int getWeight();
	
		public int getMaxLevel();
	
		public MCCEnchantment.Cost getMinCost();
	
		public MCCEnchantment.Cost getMaxCost();
	
		public int getAnvilCost();
	
		public List<MCCEquipmentSlotGroup> getSlots();
	
	}

	public static interface Cost  {
	
		public int getBase();
	
		public int getPerLevelAboveFirst();
	
	}

	public static interface Builder  {
	
		public MCCEnchantment.EnchantmentDefinition getProperties();
	
	}
}
