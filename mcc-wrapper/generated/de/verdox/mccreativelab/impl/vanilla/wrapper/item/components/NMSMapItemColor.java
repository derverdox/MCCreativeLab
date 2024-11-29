package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import java.util.HashSet;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import java.util.List;
import net.minecraft.world.item.component.MapItemColor;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import java.util.Set;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSMapItemColor;
import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.item.components.MCCMapItemColor;
import java.util.ArrayList;

public class NMSMapItemColor extends MCCHandle<MapItemColor> implements MCCMapItemColor  {

	public static final MCCConverter<MapItemColor, NMSMapItemColor> CONVERTER  = converter(NMSMapItemColor.class, MapItemColor.class, NMSMapItemColor::new, MCCHandle::getHandle);

	public NMSMapItemColor(MapItemColor handle){
		super(handle);
	}

	public int getRgb(){
		var nms = getRgbFromImpl();
		return nms;
	}

	private int getRgbFromImpl(){
		return handle == null ? 0 : handle.rgb();
	}

	public MCCMapItemColor withRgb(int rgb){
		var param0 = rgb;
		return new NMSMapItemColor(new MapItemColor(param0));
	}

}
