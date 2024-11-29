package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.item.components.MCCBlockItemStateProperties;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSBlockItemStateProperties;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.lang.String;
import net.minecraft.world.item.component.BlockItemStateProperties;

public class NMSBlockItemStateProperties extends MCCHandle<BlockItemStateProperties> implements MCCBlockItemStateProperties  {

	public static final MCCConverter<BlockItemStateProperties, NMSBlockItemStateProperties> CONVERTER  = converter(NMSBlockItemStateProperties.class, BlockItemStateProperties.class, NMSBlockItemStateProperties::new, MCCHandle::getHandle);

	public NMSBlockItemStateProperties(BlockItemStateProperties handle){
		super(handle);
	}

	public Map<String, String> getProperties(){
		var nms = getPropertiesFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Map<String, String>>() {});
	}

	private Map<String, String> getPropertiesFromImpl(){
		return handle == null ? Map.of() : handle.properties();
	}

	public MCCBlockItemStateProperties withProperties(Map<String, String> properties){
		var param0 = MCCPlatform.getInstance().getConversionService().unwrap(properties, new TypeToken<Map<String, String>>() {});
		return new NMSBlockItemStateProperties(new BlockItemStateProperties(param0));
	}

}
