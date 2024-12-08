package de.verdox.mccreativelab.impl.vanilla.types;

import de.verdox.mccreativelab.wrapper.types.MCCEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import net.minecraft.world.entity.EquipmentSlotGroup;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import net.minecraft.core.HolderSet;
import net.minecraft.world.item.Item;
import net.minecraft.core.component.DataComponentMap;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import java.lang.reflect.Field;
import java.util.List;
import de.verdox.mccreativelab.wrapper.entity.MCCEquipmentSlotGroup;
import net.kyori.adventure.text.Component;
import de.verdox.mccreativelab.impl.vanilla.types.NMSEnchantment;
import java.util.Optional;
import de.verdox.mccreativelab.wrapper.registry.MCCReferenceSet;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;

public class NMSEnchantment extends MCCHandle<Enchantment> implements de.verdox.mccreativelab.wrapper.types.MCCEnchantment  {

	public static final MCCConverter<Enchantment, NMSEnchantment> CONVERTER  = converter(NMSEnchantment.class, Enchantment.class, NMSEnchantment::new, MCCHandle::getHandle);

	public NMSEnchantment(Enchantment handle){
		super(handle);
	}

	public Component getDescription(){
		var nms = getDescriptionFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Component>() {});
	}

	private net.minecraft.network.chat.Component getDescriptionFromImpl(){
		return handle == null ? null : handle.description();
	}

	public MCCEnchantment.EnchantmentDefinition getDefinition(){
		var nms = getDefinitionFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCEnchantment.EnchantmentDefinition>() {});
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
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<DataComponentMap>() {});
	}

	private DataComponentMap getEffectsFromImpl(){
		return handle == null ? null : handle.effects();
	}


	public static class NMSEnchantmentDefinition extends MCCHandle<Enchantment.EnchantmentDefinition> implements MCCEnchantment.EnchantmentDefinition  {
	
		public static final MCCConverter<Enchantment.EnchantmentDefinition, NMSEnchantment.NMSEnchantmentDefinition> CONVERTER  = converter(NMSEnchantment.NMSEnchantmentDefinition.class, Enchantment.EnchantmentDefinition.class, NMSEnchantment.NMSEnchantmentDefinition::new, MCCHandle::getHandle);

		public NMSEnchantmentDefinition(Enchantment.EnchantmentDefinition handle){
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
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Integer>() {});
		}
	
		private int getWeightFromImpl(){
			return handle == null ? 0 : handle.weight();
		}
	
		public int getMaxLevel(){
			var nms = getMaxLevelFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Integer>() {});
		}
	
		private int getMaxLevelFromImpl(){
			return handle == null ? 0 : handle.maxLevel();
		}
	
		public MCCEnchantment.Cost getMinCost(){
			var nms = getMinCostFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCEnchantment.Cost>() {});
		}
	
		private Enchantment.Cost getMinCostFromImpl(){
			return handle == null ? null : handle.minCost();
		}
	
		public MCCEnchantment.Cost getMaxCost(){
			var nms = getMaxCostFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCEnchantment.Cost>() {});
		}
	
		private Enchantment.Cost getMaxCostFromImpl(){
			return handle == null ? null : handle.maxCost();
		}
	
		public int getAnvilCost(){
			var nms = getAnvilCostFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Integer>() {});
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

	public static class NMSCost extends MCCHandle<Enchantment.Cost> implements MCCEnchantment.Cost  {
	
		public static final MCCConverter<Enchantment.Cost, NMSEnchantment.NMSCost> CONVERTER  = converter(NMSEnchantment.NMSCost.class, Enchantment.Cost.class, NMSEnchantment.NMSCost::new, MCCHandle::getHandle);

		public NMSCost(Enchantment.Cost handle){
			super(handle);
		}
	
		public int getBase(){
			var nms = getBaseFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Integer>() {});
		}
	
		private int getBaseFromImpl(){
			return handle == null ? 0 : handle.base();
		}
	
		public int getPerLevelAboveFirst(){
			var nms = getPerLevelAboveFirstFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Integer>() {});
		}
	
		private int getPerLevelAboveFirstFromImpl(){
			return handle == null ? 0 : handle.perLevelAboveFirst();
		}
	
	}

	public static class NMSBuilder extends MCCHandle<Enchantment.Builder> implements MCCEnchantment.Builder  {
	
		public static final MCCConverter<Enchantment.Builder, NMSEnchantment.NMSBuilder> CONVERTER  = converter(NMSEnchantment.NMSBuilder.class, Enchantment.Builder.class, NMSEnchantment.NMSBuilder::new, MCCHandle::getHandle);

		public NMSBuilder(Enchantment.Builder handle){
			super(handle);
		}
	
		public MCCEnchantment.EnchantmentDefinition getProperties(){
			var nms = getPropertiesFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCEnchantment.EnchantmentDefinition>() {});
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
