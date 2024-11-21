package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import java.util.HashSet;
import java.util.List;
import de.verdox.mccreativelab.wrapper.item.components.MCCUnbreakable;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import net.minecraft.world.item.component.Unbreakable;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSUnbreakable;
import java.util.ArrayList;

public class NMSUnbreakable extends NMSHandle<Unbreakable> implements MCCUnbreakable  {

	public static final MCCConverter<Unbreakable, NMSUnbreakable> CONVERTER  = converter(NMSUnbreakable.class, Unbreakable.class, NMSUnbreakable::new, NMSHandle::getHandle);

	public NMSUnbreakable (Unbreakable handle){
		super(handle);
	}

	public boolean getShowInTooltip(){
		var nms = getShowInTooltipFromImpl();
		return nms;
	}

	private boolean getShowInTooltipFromImpl(){
		return handle == null ? false : handle.showInTooltip();
	}

	public MCCUnbreakable withShowInTooltip(boolean showInTooltip){
		var param0 = showInTooltip;
		return new NMSUnbreakable(new Unbreakable(param0));
	}

}
