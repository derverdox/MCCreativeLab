package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSLodestoneTracker;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import net.minecraft.world.item.component.LodestoneTracker;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.item.components.MCCLodestoneTracker;
import java.util.ArrayList;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import java.util.HashSet;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import net.minecraft.core.GlobalPos;
import java.util.List;
import java.util.Optional;

public class NMSLodestoneTracker extends NMSHandle<LodestoneTracker> implements MCCLodestoneTracker  {

	public static final MCCConverter<LodestoneTracker, NMSLodestoneTracker> CONVERTER  = converter(NMSLodestoneTracker.class, LodestoneTracker.class, NMSLodestoneTracker::new, NMSHandle::getHandle);

	public NMSLodestoneTracker (LodestoneTracker handle){
		super(handle);
	}

	public Optional<MCCLocation> getTarget(){
		var nms = getTargetFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Optional<MCCLocation>>() {});
	}

	private Optional<GlobalPos> getTargetFromImpl(){
		return handle == null ? null : handle.target();
	}

	public MCCLodestoneTracker withTarget(Optional<MCCLocation> target){
		var param0 = MCCPlatform.getInstance().getConversionService().unwrap(target, new TypeToken<Optional<GlobalPos>>() {});
		var param1 = getTrackedFromImpl();
		return new NMSLodestoneTracker(new LodestoneTracker(param0, param1));
	}

	public boolean getTracked(){
		var nms = getTrackedFromImpl();
		return nms;
	}

	private boolean getTrackedFromImpl(){
		return handle == null ? false : handle.tracked();
	}

	public MCCLodestoneTracker withTracked(boolean tracked){
		var param0 = getTargetFromImpl();
		var param1 = tracked;
		return new NMSLodestoneTracker(new LodestoneTracker(param0, param1));
	}

}
