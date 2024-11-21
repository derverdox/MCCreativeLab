package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import java.util.HashSet;
import java.util.List;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.item.components.MCCCustomModelData;
import java.util.Set;
import net.minecraft.world.item.component.CustomModelData;
import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSCustomModelData;
import java.util.ArrayList;

public class NMSCustomModelData extends NMSHandle<CustomModelData> implements MCCCustomModelData  {

	public static final MCCConverter<CustomModelData, NMSCustomModelData> CONVERTER  = converter(NMSCustomModelData.class, CustomModelData.class, NMSCustomModelData::new, NMSHandle::getHandle);

	public NMSCustomModelData (CustomModelData handle){
		super(handle);
	}

	public int getValue(){
		var nms = getValueFromImpl();
		return nms;
	}

	private int getValueFromImpl(){
		return handle == null ? 0 : handle.value();
	}

	public MCCCustomModelData withValue(int value){
		var param0 = value;
		return new NMSCustomModelData(new CustomModelData(param0));
	}

}
