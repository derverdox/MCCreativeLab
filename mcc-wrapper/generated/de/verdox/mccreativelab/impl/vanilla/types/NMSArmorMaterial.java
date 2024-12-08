package de.verdox.mccreativelab.impl.vanilla.types;

import net.minecraft.resources.ResourceLocation;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import java.lang.reflect.Field;
import java.lang.Integer;
import java.util.function.Supplier;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.crafting.Ingredient;
import de.verdox.mccreativelab.impl.vanilla.types.NMSArmorMaterial;
import java.util.List;
import net.minecraft.world.item.ArmorMaterial;
import net.kyori.adventure.sound.Sound;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;
import java.util.Map;
import de.verdox.mccreativelab.wrapper.types.MCCArmorMaterial;
import java.lang.String;
import net.kyori.adventure.key.Key;

public class NMSArmorMaterial extends MCCHandle<ArmorMaterial> implements MCCArmorMaterial  {

	public static final MCCConverter<ArmorMaterial, NMSArmorMaterial> CONVERTER  = converter(NMSArmorMaterial.class, ArmorMaterial.class, NMSArmorMaterial::new, MCCHandle::getHandle);

	public NMSArmorMaterial(ArmorMaterial handle){
		super(handle);
	}

	public Map<ArmorItem.Type, Integer> getDefense(){
		var nms = getDefenseFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Map<ArmorItem.Type, Integer>>() {});
	}

	private Map<ArmorItem.Type, Integer> getDefenseFromImpl(){
		return handle == null ? Map.of() : handle.defense();
	}

	public int getEnchantmentValue(){
		var nms = getEnchantmentValueFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Integer>() {});
	}

	private int getEnchantmentValueFromImpl(){
		return handle == null ? 0 : handle.enchantmentValue();
	}

	public MCCReference<Sound> getEquipSound(){
		var nms = getEquipSoundFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCReference<Sound>>() {});
	}

	private Holder<SoundEvent> getEquipSoundFromImpl(){
		return handle == null ? null : handle.equipSound();
	}

	public Supplier<Ingredient> getRepairIngredient(){
		var nms = getRepairIngredientFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Supplier<Ingredient>>() {});
	}

	private Supplier<Ingredient> getRepairIngredientFromImpl(){
		return handle == null ? null : handle.repairIngredient();
	}

	public List<MCCArmorMaterial.Layer> getLayers(){
		var nms = getLayersFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<List<MCCArmorMaterial.Layer>>() {});
	}

	private List<ArmorMaterial.Layer> getLayersFromImpl(){
		return handle == null ? List.of() : handle.layers();
	}

	public float getToughness(){
		var nms = getToughnessFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Float>() {});
	}

	private float getToughnessFromImpl(){
		return handle == null ? 0 : handle.toughness();
	}

	public float getKnockbackResistance(){
		var nms = getKnockbackResistanceFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Float>() {});
	}

	private float getKnockbackResistanceFromImpl(){
		return handle == null ? 0 : handle.knockbackResistance();
	}


	public static class NMSLayer extends MCCHandle<ArmorMaterial.Layer> implements MCCArmorMaterial.Layer  {
	
		public static final MCCConverter<ArmorMaterial.Layer, NMSArmorMaterial.NMSLayer> CONVERTER  = converter(NMSArmorMaterial.NMSLayer.class, ArmorMaterial.Layer.class, NMSArmorMaterial.NMSLayer::new, MCCHandle::getHandle);

		public NMSLayer(ArmorMaterial.Layer handle){
			super(handle);
		}
	
		public Key getId(){
			var nms = getIdFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Key>() {});
		}
	
		private ResourceLocation getIdFromImpl(){
			ResourceLocation nms;
			if(handle==null) return null;
			try {
				Field nmsField = ArmorMaterial.Layer.class.getDeclaredField("id");
				nmsField.setAccessible(true);
				nms = (ResourceLocation) nmsField.get(handle);
			} catch (Throwable e) { throw new RuntimeException(e); }
			return nms;
		}
	
		public String getSuffix(){
			var nms = getSuffixFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<String>() {});
		}
	
		private String getSuffixFromImpl(){
			String nms;
			if(handle==null) return null;
			try {
				Field nmsField = ArmorMaterial.Layer.class.getDeclaredField("suffix");
				nmsField.setAccessible(true);
				nms = (String) nmsField.get(handle);
			} catch (Throwable e) { throw new RuntimeException(e); }
			return nms;
		}
	
		public boolean getDyeable(){
			var nms = getDyeableFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Boolean>() {});
		}
	
		private boolean getDyeableFromImpl(){
			boolean nms;
			if(handle==null) return false;
			try {
				Field nmsField = ArmorMaterial.Layer.class.getDeclaredField("dyeable");
				nmsField.setAccessible(true);
				nms = (boolean) nmsField.get(handle);
			} catch (Throwable e) { throw new RuntimeException(e); }
			return nms;
		}
	
	}
}
