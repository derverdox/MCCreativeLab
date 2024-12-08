package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import java.util.List;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.item.components.MCCCustomModelData;
import java.util.Set;
import net.minecraft.world.item.component.CustomModelData;
import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSCustomModelData;

public class NMSCustomModelData extends MCCHandle<CustomModelData> implements MCCCustomModelData  {

	public static final MCCConverter<CustomModelData, NMSCustomModelData> CONVERTER  = converter(NMSCustomModelData.class, CustomModelData.class, NMSCustomModelData::new, MCCHandle::getHandle);

	public NMSCustomModelData(CustomModelData handle){
		super(handle);
	}

	public int getValue(){
		var nms = getValueFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Integer>() {});
	}

	private int getValueFromImpl(){
		return handle == null ? 0 : handle.value();
	}

	public MCCCustomModelData withValue(int value){
		var param0 = MCCPlatform.getInstance().getConversionService().unwrap(value, new TypeToken<Integer>() {});
		return new NMSCustomModelData(new CustomModelData(param0));
	}

}
