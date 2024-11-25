package de.verdox.mccreativelab.wrapper.types;

import java.util.List;
import net.kyori.adventure.sound.Sound;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
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

	public MCCReference<Sound> getEquipSound();

	public Supplier<Ingredient> getRepairIngredient();

	public List<MCCArmorMaterial.Layer> getLayers();

	public float getToughness();

	public float getKnockbackResistance();


	public static interface Layer  {
	
		public Key getId();
	
		public String getSuffix();
	
		public boolean getDyeable();
	
	}
}
