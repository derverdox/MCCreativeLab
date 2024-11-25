package de.verdox.mccreativelab.wrapper.item.components;

import java.util.List;
import de.verdox.mccreativelab.wrapper.item.components.MCCFoodProperties;
import de.verdox.mccreativelab.wrapper.entity.MCCEffect;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import java.util.Optional;

public interface MCCFoodProperties extends MCCItemComponent  {

	public MCCFoodProperties.PossibleEffect createPossibleEffect();

	public MCCFoodProperties.Builder createBuilder();

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

	public List<MCCFoodProperties.PossibleEffect> getEffects();

	public MCCFoodProperties withEffects(List<MCCFoodProperties.PossibleEffect> effects);


	public static interface PossibleEffect  {
	
		public MCCEffect getEffect();
	
		public MCCFoodProperties.PossibleEffect withEffect(MCCEffect effect);
	
		public float getProbability();
	
		public MCCFoodProperties.PossibleEffect withProbability(float probability);
	
	}

	public static interface Builder  {
	
	}
}
