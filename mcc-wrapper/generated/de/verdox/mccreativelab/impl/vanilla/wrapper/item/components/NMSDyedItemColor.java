package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.item.components.MCCDyedItemColor;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import java.util.HashSet;
import java.util.List;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSDyedItemColor;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import net.minecraft.world.item.component.DyedItemColor;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import java.util.ArrayList;

public class NMSDyedItemColor extends NMSHandle<DyedItemColor> implements MCCDyedItemColor  {

	public static final MCCConverter<DyedItemColor, NMSDyedItemColor> CONVERTER  = converter(NMSDyedItemColor.class, DyedItemColor.class, NMSDyedItemColor::new, NMSHandle::getHandle);

	public NMSDyedItemColor (DyedItemColor handle){
		super(handle);
	}

	public int getRgb(){
		var nms = getRgbFromImpl();
		return nms;
	}

	private int getRgbFromImpl(){
		return handle == null ? 0 : handle.rgb();
	}

	public MCCDyedItemColor withRgb(int rgb){
		var param0 = rgb;
		var param1 = getShowInTooltipFromImpl();
		return new NMSDyedItemColor(new DyedItemColor(param0, param1));
	}

	public boolean getShowInTooltip(){
		var nms = getShowInTooltipFromImpl();
		return nms;
	}

	private boolean getShowInTooltipFromImpl(){
		return handle == null ? false : handle.showInTooltip();
	}

	public MCCDyedItemColor withShowInTooltip(boolean showInTooltip){
		var param0 = getRgbFromImpl();
		var param1 = showInTooltip;
		return new NMSDyedItemColor(new DyedItemColor(param0, param1));
	}

}
