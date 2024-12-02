package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import net.minecraft.world.item.alchemy.PotionContents;
import de.verdox.mccreativelab.wrapper.entity.MCCEffect;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSPotionContents;
import java.util.Set;
import net.minecraft.world.effect.MobEffectInstance;
import de.verdox.mccreativelab.wrapper.item.components.MCCPotionContents;
import com.google.common.reflect.TypeToken;
import java.lang.Integer;
import net.minecraft.world.item.alchemy.Potion;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import net.minecraft.core.Holder;
import java.util.Optional;

public class NMSPotionContents extends MCCHandle<PotionContents> implements MCCPotionContents  {

	public static final MCCConverter<PotionContents, NMSPotionContents> CONVERTER  = converter(NMSPotionContents.class, PotionContents.class, NMSPotionContents::new, MCCHandle::getHandle);

	public NMSPotionContents(PotionContents handle){
		super(handle);
	}

	public Optional<MCCReference<Potion>> getPotion(){
		var nms = getPotionFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Optional<MCCReference<Potion>>>() {});
	}

	private Optional<Holder<Potion>> getPotionFromImpl(){
		return handle == null ? null : handle.potion();
	}

	public MCCPotionContents withPotion(Optional<MCCReference<Potion>> potion){
		var param0 = MCCPlatform.getInstance().getConversionService().unwrap(potion, new TypeToken<Optional<Holder<Potion>>>() {});
		var param1 = getCustomColorFromImpl();
		var param2 = getCustomEffectsFromImpl();
		return new NMSPotionContents(new PotionContents(param0, param1, param2));
	}

	public Optional<Integer> getCustomColor(){
		var nms = getCustomColorFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Optional<Integer>>() {});
	}

	private Optional<Integer> getCustomColorFromImpl(){
		return handle == null ? null : handle.customColor();
	}

	public MCCPotionContents withCustomColor(Optional<Integer> customColor){
		var param0 = getPotionFromImpl();
		var param1 = MCCPlatform.getInstance().getConversionService().unwrap(customColor, new TypeToken<Optional<Integer>>() {});
		var param2 = getCustomEffectsFromImpl();
		return new NMSPotionContents(new PotionContents(param0, param1, param2));
	}

	public List<MCCEffect> getCustomEffects(){
		var nms = getCustomEffectsFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<List<MCCEffect>>() {});
	}

	private List<MobEffectInstance> getCustomEffectsFromImpl(){
		return handle == null ? List.of() : handle.customEffects();
	}

	public MCCPotionContents withCustomEffects(List<MCCEffect> customEffects){
		var param0 = getPotionFromImpl();
		var param1 = getCustomColorFromImpl();
		var param2 = MCCPlatform.getInstance().getConversionService().unwrap(customEffects, new TypeToken<List<MobEffectInstance>>() {});
		return new NMSPotionContents(new PotionContents(param0, param1, param2));
	}

}
