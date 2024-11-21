package de.verdox.mccreativelab.impl.vanilla.types;

import net.minecraft.resources.ResourceLocation;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import java.lang.reflect.Field;
import java.lang.Integer;
import java.util.function.Supplier;
import java.util.ArrayList;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.crafting.Ingredient;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import java.util.HashSet;
import de.verdox.mccreativelab.impl.vanilla.types.NMSArmorMaterial;
import java.util.List;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.core.Holder;
import net.minecraft.sounds.SoundEvent;
import java.util.Map;
import de.verdox.mccreativelab.wrapper.types.MCCArmorMaterial;
import java.lang.String;
import net.kyori.adventure.key.Key;

public class NMSArmorMaterial extends NMSHandle<ArmorMaterial> implements MCCArmorMaterial  {

	public static final MCCConverter<ArmorMaterial, NMSArmorMaterial> CONVERTER  = converter(NMSArmorMaterial.class, ArmorMaterial.class, NMSArmorMaterial::new, NMSHandle::getHandle);

	public NMSArmorMaterial (ArmorMaterial handle){
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
		return nms;
	}

	private int getEnchantmentValueFromImpl(){
		return handle == null ? 0 : handle.enchantmentValue();
	}

	public MCCReference<SoundEvent> getEquipSound(){
		var nms = getEquipSoundFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCReference<SoundEvent>>() {});
	}

	private Holder<SoundEvent> getEquipSoundFromImpl(){
		return handle == null ? null : handle.equipSound();
	}

	public Supplier<Ingredient> getRepairIngredient(){
		var nms = getRepairIngredientFromImpl();
		return nms;
	}

	private Supplier<Ingredient> getRepairIngredientFromImpl(){
		return handle == null ? null : handle.repairIngredient();
	}

	public List<MCCArmorMaterial.MCCLayer> getLayers(){
		var nms = getLayersFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<List<MCCArmorMaterial.MCCLayer>>() {});
	}

	private List<ArmorMaterial.Layer> getLayersFromImpl(){
		return handle == null ? List.of() : handle.layers();
	}

	public float getToughness(){
		var nms = getToughnessFromImpl();
		return nms;
	}

	private float getToughnessFromImpl(){
		return handle == null ? 0 : handle.toughness();
	}

	public float getKnockbackResistance(){
		var nms = getKnockbackResistanceFromImpl();
		return nms;
	}

	private float getKnockbackResistanceFromImpl(){
		return handle == null ? 0 : handle.knockbackResistance();
	}


	public static class NMSLayer extends NMSHandle<ArmorMaterial.Layer> implements MCCArmorMaterial.MCCLayer  {
	
		public static final MCCConverter<ArmorMaterial.Layer, NMSArmorMaterial.NMSLayer> CONVERTER  = converter(NMSArmorMaterial.NMSLayer.class, ArmorMaterial.Layer.class, NMSArmorMaterial.NMSLayer::new, NMSHandle::getHandle);

		public NMSLayer (ArmorMaterial.Layer handle){
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
			return nms;
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
			return nms;
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
