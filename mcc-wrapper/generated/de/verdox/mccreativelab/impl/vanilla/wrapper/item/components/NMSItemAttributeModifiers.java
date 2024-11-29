package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import net.minecraft.world.entity.EquipmentSlotGroup;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.item.components.MCCItemAttributeModifiers;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import java.util.Set;
import de.verdox.mccreativelab.wrapper.entity.MCCAttribute;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSItemAttributeModifiers;
import com.google.common.reflect.TypeToken;
import java.util.ArrayList;
import net.minecraft.world.entity.ai.attributes.Attribute;
import java.util.HashSet;
import java.util.List;
import net.minecraft.core.Holder;
import de.verdox.mccreativelab.wrapper.item.MCCAttributeModifier;
import de.verdox.mccreativelab.wrapper.entity.MCCEquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.component.ItemAttributeModifiers;

public class NMSItemAttributeModifiers extends MCCHandle<ItemAttributeModifiers> implements MCCItemAttributeModifiers  {

	public static final MCCConverter<ItemAttributeModifiers, NMSItemAttributeModifiers> CONVERTER  = converter(NMSItemAttributeModifiers.class, ItemAttributeModifiers.class, NMSItemAttributeModifiers::new, MCCHandle::getHandle);

	public NMSItemAttributeModifiers(ItemAttributeModifiers handle){
		super(handle);
	}

	public MCCItemAttributeModifiers.Builder createBuilder(){
		return new NMSBuilder(null);
	}

	public MCCItemAttributeModifiers.Entry createEntry(){
		return new NMSEntry(null);
	}

	public List<MCCItemAttributeModifiers.Entry> getModifiers(){
		var nms = getModifiersFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<List<MCCItemAttributeModifiers.Entry>>() {});
	}

	private List<ItemAttributeModifiers.Entry> getModifiersFromImpl(){
		return handle == null ? List.of() : handle.modifiers();
	}

	public MCCItemAttributeModifiers withModifiers(List<MCCItemAttributeModifiers.Entry> modifiers){
		var param0 = MCCPlatform.getInstance().getConversionService().unwrap(modifiers, new TypeToken<List<ItemAttributeModifiers.Entry>>() {});
		var param1 = getShowInTooltipFromImpl();
		return new NMSItemAttributeModifiers(new ItemAttributeModifiers(param0, param1));
	}

	public boolean getShowInTooltip(){
		var nms = getShowInTooltipFromImpl();
		return nms;
	}

	private boolean getShowInTooltipFromImpl(){
		return handle == null ? false : handle.showInTooltip();
	}

	public MCCItemAttributeModifiers withShowInTooltip(boolean showInTooltip){
		var param0 = getModifiersFromImpl();
		var param1 = showInTooltip;
		return new NMSItemAttributeModifiers(new ItemAttributeModifiers(param0, param1));
	}


	public static class NMSBuilder extends MCCHandle<ItemAttributeModifiers.Builder> implements MCCItemAttributeModifiers.Builder  {
	
		public static final MCCConverter<ItemAttributeModifiers.Builder, NMSItemAttributeModifiers.NMSBuilder> CONVERTER  = converter(NMSItemAttributeModifiers.NMSBuilder.class, ItemAttributeModifiers.Builder.class, NMSItemAttributeModifiers.NMSBuilder::new, MCCHandle::getHandle);

		public NMSBuilder(ItemAttributeModifiers.Builder handle){
			super(handle);
		}
	
	}

	public static class NMSEntry extends MCCHandle<ItemAttributeModifiers.Entry> implements MCCItemAttributeModifiers.Entry  {
	
		public static final MCCConverter<ItemAttributeModifiers.Entry, NMSItemAttributeModifiers.NMSEntry> CONVERTER  = converter(NMSItemAttributeModifiers.NMSEntry.class, ItemAttributeModifiers.Entry.class, NMSItemAttributeModifiers.NMSEntry::new, MCCHandle::getHandle);

		public NMSEntry(ItemAttributeModifiers.Entry handle){
			super(handle);
		}
	
		public MCCReference<MCCAttribute> getAttribute(){
			var nms = getAttributeFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCReference<MCCAttribute>>() {});
		}
	
		private Holder<Attribute> getAttributeFromImpl(){
			return handle == null ? null : handle.attribute();
		}
	
		public MCCItemAttributeModifiers.Entry withAttribute(MCCReference<MCCAttribute> attribute){
			var param0 = MCCPlatform.getInstance().getConversionService().unwrap(attribute, new TypeToken<Holder<Attribute>>() {});
			var param1 = getModifierFromImpl();
			var param2 = getSlotFromImpl();
			return new NMSItemAttributeModifiers.NMSEntry(new ItemAttributeModifiers.Entry(param0, param1, param2));
		}
	
		public MCCAttributeModifier getModifier(){
			var nms = getModifierFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCAttributeModifier>() {});
		}
	
		private AttributeModifier getModifierFromImpl(){
			return handle == null ? null : handle.modifier();
		}
	
		public MCCItemAttributeModifiers.Entry withModifier(MCCAttributeModifier modifier){
			var param0 = getAttributeFromImpl();
			var param1 = MCCPlatform.getInstance().getConversionService().unwrap(modifier, new TypeToken<AttributeModifier>() {});
			var param2 = getSlotFromImpl();
			return new NMSItemAttributeModifiers.NMSEntry(new ItemAttributeModifiers.Entry(param0, param1, param2));
		}
	
		public MCCEquipmentSlotGroup getSlot(){
			var nms = getSlotFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCEquipmentSlotGroup>() {});
		}
	
		private EquipmentSlotGroup getSlotFromImpl(){
			return handle == null ? null : handle.slot();
		}
	
		public MCCItemAttributeModifiers.Entry withSlot(MCCEquipmentSlotGroup slot){
			var param0 = getAttributeFromImpl();
			var param1 = getModifierFromImpl();
			var param2 = MCCPlatform.getInstance().getConversionService().unwrap(slot, new TypeToken<EquipmentSlotGroup>() {});
			return new NMSItemAttributeModifiers.NMSEntry(new ItemAttributeModifiers.Entry(param0, param1, param2));
		}
	
	}
}
