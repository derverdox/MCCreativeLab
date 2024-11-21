package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import net.minecraft.world.food.FoodProperties;
import de.verdox.mccreativelab.wrapper.item.components.MCCFoodProperties;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSFoodProperties;
import java.util.Set;
import net.minecraft.world.effect.MobEffectInstance;
import com.google.common.reflect.TypeToken;
import java.util.ArrayList;
import org.bukkit.potion.PotionEffect;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import net.minecraft.world.item.ItemStack;

public class NMSFoodProperties extends NMSHandle<FoodProperties> implements MCCFoodProperties  {

	public static final MCCConverter<FoodProperties, NMSFoodProperties> CONVERTER  = converter(NMSFoodProperties.class, FoodProperties.class, NMSFoodProperties::new, NMSHandle::getHandle);

	public NMSFoodProperties (FoodProperties handle){
		super(handle);
	}

	public MCCFoodProperties.MCCPossibleEffect createMCCPossibleEffect(){
		return new NMSPossibleEffect(null);
	}

	public MCCFoodProperties.MCCBuilder createMCCBuilder(){
		return new NMSBuilder(null);
	}

	public int getNutrition(){
		var nms = getNutritionFromImpl();
		return nms;
	}

	private int getNutritionFromImpl(){
		return handle == null ? 0 : handle.nutrition();
	}

	public MCCFoodProperties withNutrition(int nutrition){
		var param0 = nutrition;
		var param1 = getSaturationFromImpl();
		var param2 = getCanAlwaysEatFromImpl();
		var param3 = getEatSecondsFromImpl();
		var param4 = getUsingConvertsToFromImpl();
		var param5 = getEffectsFromImpl();
		return new NMSFoodProperties(new FoodProperties(param0, param1, param2, param3, param4, param5));
	}

	public float getSaturation(){
		var nms = getSaturationFromImpl();
		return nms;
	}

	private float getSaturationFromImpl(){
		return handle == null ? 0 : handle.saturation();
	}

	public MCCFoodProperties withSaturation(float saturation){
		var param0 = getNutritionFromImpl();
		var param1 = saturation;
		var param2 = getCanAlwaysEatFromImpl();
		var param3 = getEatSecondsFromImpl();
		var param4 = getUsingConvertsToFromImpl();
		var param5 = getEffectsFromImpl();
		return new NMSFoodProperties(new FoodProperties(param0, param1, param2, param3, param4, param5));
	}

	public boolean getCanAlwaysEat(){
		var nms = getCanAlwaysEatFromImpl();
		return nms;
	}

	private boolean getCanAlwaysEatFromImpl(){
		return handle == null ? false : handle.canAlwaysEat();
	}

	public MCCFoodProperties withCanAlwaysEat(boolean canAlwaysEat){
		var param0 = getNutritionFromImpl();
		var param1 = getSaturationFromImpl();
		var param2 = canAlwaysEat;
		var param3 = getEatSecondsFromImpl();
		var param4 = getUsingConvertsToFromImpl();
		var param5 = getEffectsFromImpl();
		return new NMSFoodProperties(new FoodProperties(param0, param1, param2, param3, param4, param5));
	}

	public float getEatSeconds(){
		var nms = getEatSecondsFromImpl();
		return nms;
	}

	private float getEatSecondsFromImpl(){
		return handle == null ? 0 : handle.eatSeconds();
	}

	public MCCFoodProperties withEatSeconds(float eatSeconds){
		var param0 = getNutritionFromImpl();
		var param1 = getSaturationFromImpl();
		var param2 = getCanAlwaysEatFromImpl();
		var param3 = eatSeconds;
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

	public List<MCCFoodProperties.MCCPossibleEffect> getEffects(){
		var nms = getEffectsFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<List<MCCFoodProperties.MCCPossibleEffect>>() {});
	}

	private List<FoodProperties.PossibleEffect> getEffectsFromImpl(){
		return handle == null ? List.of() : handle.effects();
	}

	public MCCFoodProperties withEffects(List<MCCFoodProperties.MCCPossibleEffect> effects){
		var param0 = getNutritionFromImpl();
		var param1 = getSaturationFromImpl();
		var param2 = getCanAlwaysEatFromImpl();
		var param3 = getEatSecondsFromImpl();
		var param4 = getUsingConvertsToFromImpl();
		var param5 = MCCPlatform.getInstance().getConversionService().unwrap(effects, new TypeToken<List<FoodProperties.PossibleEffect>>() {});
		return new NMSFoodProperties(new FoodProperties(param0, param1, param2, param3, param4, param5));
	}


	public static class NMSPossibleEffect extends NMSHandle<FoodProperties.PossibleEffect> implements MCCFoodProperties.MCCPossibleEffect  {
	
		public static final MCCConverter<FoodProperties.PossibleEffect, NMSFoodProperties.NMSPossibleEffect> CONVERTER  = converter(NMSFoodProperties.NMSPossibleEffect.class, FoodProperties.PossibleEffect.class, NMSFoodProperties.NMSPossibleEffect::new, NMSHandle::getHandle);

		public NMSPossibleEffect (FoodProperties.PossibleEffect handle){
			super(handle);
		}
	
		public PotionEffect getEffect(){
			var nms = getEffectFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<PotionEffect>() {});
		}
	
		private MobEffectInstance getEffectFromImpl(){
			return handle == null ? null : handle.effect();
		}
	
		public MCCFoodProperties.MCCPossibleEffect withEffect(PotionEffect effect){
			var param0 = MCCPlatform.getInstance().getConversionService().unwrap(effect, new TypeToken<MobEffectInstance>() {});
			var param1 = getProbabilityFromImpl();
			return new NMSFoodProperties.NMSPossibleEffect(new FoodProperties.PossibleEffect(param0, param1));
		}
	
		public float getProbability(){
			var nms = getProbabilityFromImpl();
			return nms;
		}
	
		private float getProbabilityFromImpl(){
			return handle == null ? 0 : handle.probability();
		}
	
		public MCCFoodProperties.MCCPossibleEffect withProbability(float probability){
			var param0 = getEffectFromImpl();
			var param1 = probability;
			return new NMSFoodProperties.NMSPossibleEffect(new FoodProperties.PossibleEffect(param0, param1));
		}
	
	}

	public static class NMSBuilder extends NMSHandle<FoodProperties.Builder> implements MCCFoodProperties.MCCBuilder  {
	
		public static final MCCConverter<FoodProperties.Builder, NMSFoodProperties.NMSBuilder> CONVERTER  = converter(NMSFoodProperties.NMSBuilder.class, FoodProperties.Builder.class, NMSFoodProperties.NMSBuilder::new, NMSHandle::getHandle);

		public NMSBuilder (FoodProperties.Builder handle){
			super(handle);
		}
	
	}
}
