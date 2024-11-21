package de.verdox.mccreativelab.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.item.components.MCCFoodProperties;
import java.util.List;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import java.util.Optional;
import org.bukkit.potion.PotionEffect;

public interface MCCFoodProperties extends MCCItemComponent  {

	public MCCFoodProperties.MCCPossibleEffect createMCCPossibleEffect();

	public MCCFoodProperties.MCCBuilder createMCCBuilder();

	public int getNutrition();

	public MCCFoodProperties withNutrition(int nutrition);

	public float getSaturation();

	public MCCFoodProperties withSaturation(float saturation);

	public boolean getCanAlwaysEat();

	public MCCFoodProperties withCanAlwaysEat(boolean canAlwaysEat);

	public float getEatSeconds();

	public MCCFoodProperties withEatSeconds(float eatSeconds);

	public Optional<MCCItemStack> getUsingConvertsTo();

	public MCCFoodProperties withUsingConvertsTo(Optional<MCCItemStack> usingConvertsTo);

	public List<MCCFoodProperties.MCCPossibleEffect> getEffects();

	public MCCFoodProperties withEffects(List<MCCFoodProperties.MCCPossibleEffect> effects);


	public static interface MCCPossibleEffect  {
	
		public PotionEffect getEffect();
	
		public MCCFoodProperties.MCCPossibleEffect withEffect(PotionEffect effect);
	
		public float getProbability();
	
		public MCCFoodProperties.MCCPossibleEffect withProbability(float probability);
	
	}

	public static interface MCCBuilder  {
	
	}
}
