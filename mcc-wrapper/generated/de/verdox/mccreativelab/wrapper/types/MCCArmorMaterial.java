package de.verdox.mccreativelab.wrapper.types;

import java.util.List;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import net.minecraft.sounds.SoundEvent;
import java.util.Map;
import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.types.MCCArmorMaterial;
import java.lang.String;
import java.lang.Integer;
import java.util.function.Supplier;
import net.kyori.adventure.key.Key;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.crafting.Ingredient;

public interface MCCArmorMaterial extends MCCWrapped  {

	public Map<ArmorItem.Type, Integer> getDefense();

	public int getEnchantmentValue();

	public MCCReference<SoundEvent> getEquipSound();

	public Supplier<Ingredient> getRepairIngredient();

	public List<MCCArmorMaterial.MCCLayer> getLayers();

	public float getToughness();

	public float getKnockbackResistance();


	public static interface MCCLayer  {
	
		public Key getId();
	
		public String getSuffix();
	
		public boolean getDyeable();
	
	}
}
