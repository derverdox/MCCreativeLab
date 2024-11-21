package de.verdox.mccreativelab.impl.vanilla.wrapper.item;

import net.minecraft.resources.ResourceLocation;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import java.util.ArrayList;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import java.util.HashSet;
import java.util.List;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import de.verdox.mccreativelab.wrapper.item.components.MCCAttributeModifier;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.NMSAttributeModifier;
import net.kyori.adventure.key.Key;

public class NMSAttributeModifier extends NMSHandle<AttributeModifier> implements MCCAttributeModifier  {

	public static final MCCConverter<AttributeModifier, NMSAttributeModifier> CONVERTER  = converter(NMSAttributeModifier.class, AttributeModifier.class, NMSAttributeModifier::new, NMSHandle::getHandle);

	public NMSAttributeModifier (AttributeModifier handle){
		super(handle);
	}

	public Key getId(){
		var nms = getIdFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Key>() {});
	}

	private ResourceLocation getIdFromImpl(){
		return handle == null ? null : handle.id();
	}

	public MCCAttributeModifier withId(Key id){
		var param0 = MCCPlatform.getInstance().getConversionService().unwrap(id, new TypeToken<ResourceLocation>() {});
		var param1 = getAmountFromImpl();
		var param2 = getOperationFromImpl();
		return new NMSAttributeModifier(new AttributeModifier(param0, param1, param2));
	}

	public double getAmount(){
		var nms = getAmountFromImpl();
		return nms;
	}

	private double getAmountFromImpl(){
		return handle == null ? 0 : handle.amount();
	}

	public MCCAttributeModifier withAmount(double amount){
		var param0 = getIdFromImpl();
		var param1 = amount;
		var param2 = getOperationFromImpl();
		return new NMSAttributeModifier(new AttributeModifier(param0, param1, param2));
	}

	public MCCAttributeModifier.MCCOperation getOperation(){
		var nms = getOperationFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCAttributeModifier.MCCOperation>() {});
	}

	private AttributeModifier.Operation getOperationFromImpl(){
		return handle == null ? null : handle.operation();
	}

	public MCCAttributeModifier withOperation(MCCAttributeModifier.MCCOperation operation){
		var param0 = getIdFromImpl();
		var param1 = getAmountFromImpl();
		var param2 = MCCPlatform.getInstance().getConversionService().unwrap(operation, new TypeToken<AttributeModifier.Operation>() {});
		return new NMSAttributeModifier(new AttributeModifier(param0, param1, param2));
	}

}
