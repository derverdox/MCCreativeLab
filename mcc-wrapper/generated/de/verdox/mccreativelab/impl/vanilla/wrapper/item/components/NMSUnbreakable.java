package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import java.util.List;
import de.verdox.mccreativelab.wrapper.item.components.MCCUnbreakable;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import net.minecraft.world.item.component.Unbreakable;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSUnbreakable;

public class NMSUnbreakable extends MCCHandle<Unbreakable> implements MCCUnbreakable  {

	public static final MCCConverter<Unbreakable, NMSUnbreakable> CONVERTER  = converter(NMSUnbreakable.class, Unbreakable.class, NMSUnbreakable::new, MCCHandle::getHandle);

	public NMSUnbreakable(Unbreakable handle){
		super(handle);
	}

	public boolean getShowInTooltip(){
		var nms = getShowInTooltipFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Boolean>() {});
	}

	private boolean getShowInTooltipFromImpl(){
		return handle == null ? false : handle.showInTooltip();
	}

	public MCCUnbreakable withShowInTooltip(boolean showInTooltip){
		var param0 = MCCPlatform.getInstance().getConversionService().unwrap(showInTooltip, new TypeToken<Boolean>() {});
		return new NMSUnbreakable(new Unbreakable(param0));
	}

}
