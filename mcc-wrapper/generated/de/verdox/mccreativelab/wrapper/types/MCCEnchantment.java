package de.verdox.mccreativelab.wrapper.types;

import net.minecraft.world.item.enchantment.Enchantment;
import de.verdox.mccreativelab.wrapper.item.components.MCCEquipmentSlotGroup;
import java.util.List;
import net.kyori.adventure.text.Component;
import net.minecraft.core.component.DataComponentMap;
import java.util.Optional;
import de.verdox.mccreativelab.wrapper.types.MCCEnchantment;
import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.registry.MCCReferenceSet;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;

public interface MCCEnchantment extends MCCWrapped  {

	public Component getDescription();

	public MCCEnchantment.MCCEnchantmentDefinition getDefinition();

	public MCCReferenceSet<MCCEnchantment> getExclusiveSet();

	public DataComponentMap getEffects();


	public static interface MCCEnchantmentDefinition  {
	
		public MCCReferenceSet<MCCItemType> getSupportedItems();
	
		public Optional<MCCReferenceSet<MCCItemType>> getPrimaryItems();
	
		public int getWeight();
	
		public int getMaxLevel();
	
		public Enchantment.Cost getMinCost();
	
		public Enchantment.Cost getMaxCost();
	
		public int getAnvilCost();
	
		public List<MCCEquipmentSlotGroup> getSlots();
	
	}

	public static interface MCCCost  {
	
		public int getBase();
	
		public int getPerLevelAboveFirst();
	
	}

	public static interface MCCBuilder  {
	
		public MCCEnchantment.MCCEnchantmentDefinition getProperties();
	
	}
}
