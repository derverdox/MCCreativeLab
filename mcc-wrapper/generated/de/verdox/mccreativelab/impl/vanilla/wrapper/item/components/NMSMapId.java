package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import java.util.List;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSMapId;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.item.components.MCCMapId;
import net.minecraft.world.level.saveddata.maps.MapId;

public class NMSMapId extends MCCHandle<MapId> implements MCCMapId  {

	public static final MCCConverter<MapId, NMSMapId> CONVERTER  = converter(NMSMapId.class, MapId.class, NMSMapId::new, MCCHandle::getHandle);

	public NMSMapId(MapId handle){
		super(handle);
	}

	public int getId(){
		var nms = getIdFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Integer>() {});
	}

	private int getIdFromImpl(){
		return handle == null ? 0 : handle.id();
	}

	public MCCMapId withId(int id){
		var param0 = MCCPlatform.getInstance().getConversionService().unwrap(id, new TypeToken<Integer>() {});
		return new NMSMapId(new MapId(param0));
	}

}
