package de.verdox.mccreativelab.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import java.util.List;
import java.util.Optional;
import com.google.common.collect.Builder;
import org.bukkit.potion.PotionEffect;
import java.lang.Void;
public interface MCCFoodProperties extends MCCItemComponentType{

	public Optional<MCCItemStack> getUsingConvertsTo ();
	public MCCFoodProperties withUsingConvertsTo (Optional<MCCItemStack> newUsingConvertsTo);
	public List<PossibleEffect> getEffects ();
	public float getSaturation ();
	public MCCFoodProperties withCanAlwaysEat (boolean newCanAlwaysEat);
	public float getEatSeconds ();
	public MCCFoodProperties withEatSeconds (float newEatSeconds);
	public MCCFoodProperties withNutrition (int newNutrition);
	public MCCFoodProperties withSaturation (float newSaturation);
	public MCCFoodProperties withEffects (List<PossibleEffect> newEffects);
	public int getNutrition ();
	public boolean getCanAlwaysEat ();
	public interface PossibleEffect extends MCCItemComponentType{

		public PossibleEffect withEffect (PotionEffect newEffect);
		public PossibleEffect withProbability (float newProbability);
		public float getProbability ();
		public PotionEffect getEffect ();
}
	public interface Builder extends MCCItemComponentType{

		public boolean getCanAlwaysEat ();
		public Optional<MCCItemStack> getUsingConvertsTo ();
		public Builder<PossibleEffect> getEffects ();
		public void setCanAlwaysEat (boolean canAlwaysEat);
		public float getEatSeconds ();
		public int getNutrition ();
		public float getSaturationModifier ();
		public void setSaturationModifier (float saturationModifier);
		public void setUsingConvertsTo (Optional<MCCItemStack> usingConvertsTo);
		public Builder withEffects (Builder<PossibleEffect> effects);
		public void setNutrition (int nutrition);
		public void setEatSeconds (float eatSeconds);
}
}
