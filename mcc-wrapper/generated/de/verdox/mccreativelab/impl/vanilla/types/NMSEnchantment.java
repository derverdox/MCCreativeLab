package de.verdox.mccreativelab.impl.vanilla.types;

import net.minecraft.world.item.enchantment.Enchantment;
import de.verdox.mccreativelab.wrapper.item.components.MCCEquipmentSlotGroup;
import net.minecraft.world.entity.EquipmentSlotGroup;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import net.minecraft.world.item.Item;
import net.minecraft.core.HolderSet;
import net.minecraft.core.component.DataComponentMap;
import de.verdox.mccreativelab.wrapper.types.MCCEnchantment;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import java.lang.reflect.Field;
import java.util.ArrayList;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import java.util.HashSet;
import java.util.List;
import net.kyori.adventure.text.Component;
import de.verdox.mccreativelab.impl.vanilla.types.NMSEnchantment;
import java.util.Optional;
import de.verdox.mccreativelab.wrapper.registry.MCCReferenceSet;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;

public class NMSEnchantment extends NMSHandle<Enchantment> implements MCCEnchantment  {

	public static final MCCConverter<Enchantment, NMSEnchantment> CONVERTER  = converter(NMSEnchantment.class, Enchantment.class, NMSEnchantment::new, NMSHandle::getHandle);

	public NMSEnchantment (Enchantment handle){
		super(handle);
	}

	public Component getDescription(){
		var nms = getDescriptionFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Component>() {});
	}

	private net.minecraft.network.chat.Component getDescriptionFromImpl(){
		return handle == null ? null : handle.description();
	}

	public MCCEnchantment.MCCEnchantmentDefinition getDefinition(){
		var nms = getDefinitionFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCEnchantment.MCCEnchantmentDefinition>() {});
	}

	private Enchantment.EnchantmentDefinition getDefinitionFromImpl(){
		return handle == null ? null : handle.definition();
	}

	public MCCReferenceSet<MCCEnchantment> getExclusiveSet(){
		var nms = getExclusiveSetFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCReferenceSet<MCCEnchantment>>() {});
	}

	private HolderSet<Enchantment> getExclusiveSetFromImpl(){
		return handle == null ? null : handle.exclusiveSet();
	}

	public DataComponentMap getEffects(){
		var nms = getEffectsFromImpl();
		return nms;
	}

	private DataComponentMap getEffectsFromImpl(){
		return handle == null ? null : handle.effects();
	}


	public static class NMSEnchantmentDefinition extends NMSHandle<Enchantment.EnchantmentDefinition> implements MCCEnchantment.MCCEnchantmentDefinition  {
	
		public static final MCCConverter<Enchantment.EnchantmentDefinition, NMSEnchantment.NMSEnchantmentDefinition> CONVERTER  = converter(NMSEnchantment.NMSEnchantmentDefinition.class, Enchantment.EnchantmentDefinition.class, NMSEnchantment.NMSEnchantmentDefinition::new, NMSHandle::getHandle);

		public NMSEnchantmentDefinition (Enchantment.EnchantmentDefinition handle){
			super(handle);
		}
	
		public MCCReferenceSet<MCCItemType> getSupportedItems(){
			var nms = getSupportedItemsFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCReferenceSet<MCCItemType>>() {});
		}
	
		private HolderSet<Item> getSupportedItemsFromImpl(){
			return handle == null ? null : handle.supportedItems();
		}
	
		public Optional<MCCReferenceSet<MCCItemType>> getPrimaryItems(){
			var nms = getPrimaryItemsFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Optional<MCCReferenceSet<MCCItemType>>>() {});
		}
	
		private Optional<HolderSet<Item>> getPrimaryItemsFromImpl(){
			return handle == null ? null : handle.primaryItems();
		}
	
		public int getWeight(){
			var nms = getWeightFromImpl();
			return nms;
		}
	
		private int getWeightFromImpl(){
			return handle == null ? 0 : handle.weight();
		}
	
		public int getMaxLevel(){
			var nms = getMaxLevelFromImpl();
			return nms;
		}
	
		private int getMaxLevelFromImpl(){
			return handle == null ? 0 : handle.maxLevel();
		}
	
		public Enchantment.Cost getMinCost(){
			var nms = getMinCostFromImpl();
			return nms;
		}
	
		private Enchantment.Cost getMinCostFromImpl(){
			return handle == null ? null : handle.minCost();
		}
	
		public Enchantment.Cost getMaxCost(){
			var nms = getMaxCostFromImpl();
			return nms;
		}
	
		private Enchantment.Cost getMaxCostFromImpl(){
			return handle == null ? null : handle.maxCost();
		}
	
		public int getAnvilCost(){
			var nms = getAnvilCostFromImpl();
			return nms;
		}
	
		private int getAnvilCostFromImpl(){
			return handle == null ? 0 : handle.anvilCost();
		}
	
		public List<MCCEquipmentSlotGroup> getSlots(){
			var nms = getSlotsFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<List<MCCEquipmentSlotGroup>>() {});
		}
	
		private List<EquipmentSlotGroup> getSlotsFromImpl(){
			return handle == null ? List.of() : handle.slots();
		}
	
	}

	public static class NMSCost extends NMSHandle<Enchantment.Cost> implements MCCEnchantment.MCCCost  {
	
		public static final MCCConverter<Enchantment.Cost, NMSEnchantment.NMSCost> CONVERTER  = converter(NMSEnchantment.NMSCost.class, Enchantment.Cost.class, NMSEnchantment.NMSCost::new, NMSHandle::getHandle);

		public NMSCost (Enchantment.Cost handle){
			super(handle);
		}
	
		public int getBase(){
			var nms = getBaseFromImpl();
			return nms;
		}
	
		private int getBaseFromImpl(){
			return handle == null ? 0 : handle.base();
		}
	
		public int getPerLevelAboveFirst(){
			var nms = getPerLevelAboveFirstFromImpl();
			return nms;
		}
	
		private int getPerLevelAboveFirstFromImpl(){
			return handle == null ? 0 : handle.perLevelAboveFirst();
		}
	
	}

	public static class NMSBuilder extends NMSHandle<Enchantment.Builder> implements MCCEnchantment.MCCBuilder  {
	
		public static final MCCConverter<Enchantment.Builder, NMSEnchantment.NMSBuilder> CONVERTER  = converter(NMSEnchantment.NMSBuilder.class, Enchantment.Builder.class, NMSEnchantment.NMSBuilder::new, NMSHandle::getHandle);

		public NMSBuilder (Enchantment.Builder handle){
			super(handle);
		}
	
		public MCCEnchantment.MCCEnchantmentDefinition getProperties(){
			var nms = getPropertiesFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCEnchantment.MCCEnchantmentDefinition>() {});
		}
	
		private Enchantment.EnchantmentDefinition getPropertiesFromImpl(){
			Enchantment.EnchantmentDefinition nms;
			if(handle==null) return null;
			try {
				Field nmsField = Enchantment.Builder.class.getDeclaredField("properties");
				nmsField.setAccessible(true);
				nms = (Enchantment.EnchantmentDefinition) nmsField.get(handle);
			} catch (Throwable e) { throw new RuntimeException(e); }
			return nms;
		}
	
	}
}
