package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.item.components.MCCDyedItemColor;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import java.util.List;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSDyedItemColor;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import net.minecraft.world.item.component.DyedItemColor;
import java.util.Set;
import com.google.common.reflect.TypeToken;

public class NMSDyedItemColor extends MCCHandle<DyedItemColor> implements MCCDyedItemColor  {

	public static final MCCConverter<DyedItemColor, NMSDyedItemColor> CONVERTER  = converter(NMSDyedItemColor.class, DyedItemColor.class, NMSDyedItemColor::new, MCCHandle::getHandle);

	public NMSDyedItemColor(DyedItemColor handle){
		super(handle);
	}

	public int getRgb(){
		var nms = getRgbFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Integer>() {});
	}

	private int getRgbFromImpl(){
		return handle == null ? 0 : handle.rgb();
	}

	public MCCDyedItemColor withRgb(int rgb){
		var param0 = MCCPlatform.getInstance().getConversionService().unwrap(rgb, new TypeToken<Integer>() {});
		var param1 = getShowInTooltipFromImpl();
		return new NMSDyedItemColor(new DyedItemColor(param0, param1));
	}

	public boolean getShowInTooltip(){
		var nms = getShowInTooltipFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Boolean>() {});
	}

	private boolean getShowInTooltipFromImpl(){
		return handle == null ? false : handle.showInTooltip();
	}

	public MCCDyedItemColor withShowInTooltip(boolean showInTooltip){
		var param0 = getRgbFromImpl();
		var param1 = MCCPlatform.getInstance().getConversionService().unwrap(showInTooltip, new TypeToken<Boolean>() {});
		return new NMSDyedItemColor(new DyedItemColor(param0, param1));
	}

}
