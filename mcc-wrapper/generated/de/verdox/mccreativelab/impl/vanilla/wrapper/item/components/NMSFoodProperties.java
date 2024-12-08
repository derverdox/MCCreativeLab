package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import net.minecraft.world.food.FoodProperties;
import de.verdox.mccreativelab.wrapper.item.components.MCCFoodProperties;
import de.verdox.mccreativelab.wrapper.entity.MCCEffect;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSFoodProperties;
import java.util.Set;
import net.minecraft.world.effect.MobEffectInstance;
import com.google.common.reflect.TypeToken;
import java.util.List;
import java.util.Optional;
import net.minecraft.world.item.ItemStack;

public class NMSFoodProperties extends MCCHandle<FoodProperties> implements MCCFoodProperties  {

	public static final MCCConverter<FoodProperties, NMSFoodProperties> CONVERTER  = converter(NMSFoodProperties.class, FoodProperties.class, NMSFoodProperties::new, MCCHandle::getHandle);

	public NMSFoodProperties(FoodProperties handle){
		super(handle);
	}

	public MCCFoodProperties.PossibleEffect createPossibleEffect(){
		return new NMSPossibleEffect(null);
	}

	public MCCFoodProperties.Builder createBuilder(){
		return new NMSBuilder(null);
	}

	public int getNutrition(){
		var nms = getNutritionFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Integer>() {});
	}

	private int getNutritionFromImpl(){
		return handle == null ? 0 : handle.nutrition();
	}

	public MCCFoodProperties withNutrition(int nutrition){
		var param0 = MCCPlatform.getInstance().getConversionService().unwrap(nutrition, new TypeToken<Integer>() {});
		var param1 = getSaturationFromImpl();
		var param2 = getCanAlwaysEatFromImpl();
		var param3 = getEatSecondsFromImpl();
		var param4 = getUsingConvertsToFromImpl();
		var param5 = getEffectsFromImpl();
		return new NMSFoodProperties(new FoodProperties(param0, param1, param2, param3, param4, param5));
	}

	public float getSaturation(){
		var nms = getSaturationFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Float>() {});
	}

	private float getSaturationFromImpl(){
		return handle == null ? 0 : handle.saturation();
	}

	public MCCFoodProperties withSaturation(float saturation){
		var param0 = getNutritionFromImpl();
		var param1 = MCCPlatform.getInstance().getConversionService().unwrap(saturation, new TypeToken<Float>() {});
		var param2 = getCanAlwaysEatFromImpl();
		var param3 = getEatSecondsFromImpl();
		var param4 = getUsingConvertsToFromImpl();
		var param5 = getEffectsFromImpl();
		return new NMSFoodProperties(new FoodProperties(param0, param1, param2, param3, param4, param5));
	}

	public boolean getCanAlwaysEat(){
		var nms = getCanAlwaysEatFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Boolean>() {});
	}

	private boolean getCanAlwaysEatFromImpl(){
		return handle == null ? false : handle.canAlwaysEat();
	}

	public MCCFoodProperties withCanAlwaysEat(boolean canAlwaysEat){
		var param0 = getNutritionFromImpl();
		var param1 = getSaturationFromImpl();
		var param2 = MCCPlatform.getInstance().getConversionService().unwrap(canAlwaysEat, new TypeToken<Boolean>() {});
		var param3 = getEatSecondsFromImpl();
		var param4 = getUsingConvertsToFromImpl();
		var param5 = getEffectsFromImpl();
		return new NMSFoodProperties(new FoodProperties(param0, param1, param2, param3, param4, param5));
	}

	public float getEatSeconds(){
		var nms = getEatSecondsFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Float>() {});
	}

	private float getEatSecondsFromImpl(){
		return handle == null ? 0 : handle.eatSeconds();
	}

	public MCCFoodProperties withEatSeconds(float eatSeconds){
		var param0 = getNutritionFromImpl();
		var param1 = getSaturationFromImpl();
		var param2 = getCanAlwaysEatFromImpl();
		var param3 = MCCPlatform.getInstance().getConversionService().unwrap(eatSeconds, new TypeToken<Float>() {});
		var param4 = getUsingConvertsToFromImpl();
		var param5 = getEffectsFromImpl();
		return new NMSFoodProperties(new FoodProperties(param0, param1, param2, param3, param4, param5));
	}

	public Optional<MCCItemStack> getUsingConvertsTo(){
		var nms = getUsingConvertsToFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Optional<MCCItemStack>>() {});
	}

	private Optional<ItemStack> getUsingConvertsToFromImpl(){
		return handle == null ? null : handle.usingConvertsTo();
	}

	public MCCFoodProperties withUsingConvertsTo(Optional<MCCItemStack> usingConvertsTo){
		var param0 = getNutritionFromImpl();
		var param1 = getSaturationFromImpl();
		var param2 = getCanAlwaysEatFromImpl();
		var param3 = getEatSecondsFromImpl();
		var param4 = MCCPlatform.getInstance().getConversionService().unwrap(usingConvertsTo, new TypeToken<Optional<ItemStack>>() {});
		var param5 = getEffectsFromImpl();
		return new NMSFoodProperties(new FoodProperties(param0, param1, param2, param3, param4, param5));
	}

	public List<de.verdox.mccreativelab.wrapper.item.components.MCCFoodProperties.PossibleEffect> getEffects(){
		var nms = getEffectsFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<List<de.verdox.mccreativelab.wrapper.item.components.MCCFoodProperties.PossibleEffect>>() {});
	}

	private List<FoodProperties.PossibleEffect> getEffectsFromImpl(){
		return handle == null ? List.of() : handle.effects();
	}

	public MCCFoodProperties withEffects(List<de.verdox.mccreativelab.wrapper.item.components.MCCFoodProperties.PossibleEffect> effects){
		var param0 = getNutritionFromImpl();
		var param1 = getSaturationFromImpl();
		var param2 = getCanAlwaysEatFromImpl();
		var param3 = getEatSecondsFromImpl();
		var param4 = getUsingConvertsToFromImpl();
		var param5 = MCCPlatform.getInstance().getConversionService().unwrap(effects, new TypeToken<List<FoodProperties.PossibleEffect>>() {});
		return new NMSFoodProperties(new FoodProperties(param0, param1, param2, param3, param4, param5));
	}


	public static class NMSPossibleEffect extends MCCHandle<FoodProperties.PossibleEffect> implements MCCFoodProperties.PossibleEffect  {
	
		public static final MCCConverter<FoodProperties.PossibleEffect, NMSFoodProperties.NMSPossibleEffect> CONVERTER  = converter(NMSFoodProperties.NMSPossibleEffect.class, FoodProperties.PossibleEffect.class, NMSFoodProperties.NMSPossibleEffect::new, MCCHandle::getHandle);

		public NMSPossibleEffect(FoodProperties.PossibleEffect handle){
			super(handle);
		}
	
		public MCCEffect getEffect(){
			var nms = getEffectFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCEffect>() {});
		}
	
		private MobEffectInstance getEffectFromImpl(){
			return handle == null ? null : handle.effect();
		}
	
		public MCCFoodProperties.PossibleEffect withEffect(MCCEffect effect){
			var param0 = MCCPlatform.getInstance().getConversionService().unwrap(effect, new TypeToken<MobEffectInstance>() {});
			var param1 = getProbabilityFromImpl();
			return new NMSFoodProperties.NMSPossibleEffect(new FoodProperties.PossibleEffect(param0, param1));
		}
	
		public float getProbability(){
			var nms = getProbabilityFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Float>() {});
		}
	
		private float getProbabilityFromImpl(){
			return handle == null ? 0 : handle.probability();
		}
	
		public MCCFoodProperties.PossibleEffect withProbability(float probability){
			var param0 = getEffectFromImpl();
			var param1 = MCCPlatform.getInstance().getConversionService().unwrap(probability, new TypeToken<Float>() {});
			return new NMSFoodProperties.NMSPossibleEffect(new FoodProperties.PossibleEffect(param0, param1));
		}
	
	}

	public static class NMSBuilder extends MCCHandle<FoodProperties.Builder> implements MCCFoodProperties.Builder  {
	
		public static final MCCConverter<FoodProperties.Builder, NMSFoodProperties.NMSBuilder> CONVERTER  = converter(NMSFoodProperties.NMSBuilder.class, FoodProperties.Builder.class, NMSFoodProperties.NMSBuilder::new, MCCHandle::getHandle);

		public NMSBuilder(FoodProperties.Builder handle){
			super(handle);
		}
	
	}
}
