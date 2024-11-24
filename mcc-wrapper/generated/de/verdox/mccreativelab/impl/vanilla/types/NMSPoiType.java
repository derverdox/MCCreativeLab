package de.verdox.mccreativelab.impl.vanilla.types;

import de.verdox.mccreativelab.wrapper.types.MCCPoiType;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import java.util.Set;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import com.google.common.reflect.TypeToken;
import java.util.ArrayList;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import java.util.HashSet;
import java.util.List;
import de.verdox.mccreativelab.impl.vanilla.types.NMSPoiType;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;

public class NMSPoiType extends NMSHandle<PoiType> implements MCCPoiType  {

	public static final MCCConverter<PoiType, NMSPoiType> CONVERTER  = converter(NMSPoiType.class, PoiType.class, NMSPoiType::new, NMSHandle::getHandle);

	public NMSPoiType (PoiType handle){
		super(handle);
	}

	public Set<MCCBlockState> getMatchingStates(){
		var nms = getMatchingStatesFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Set<MCCBlockState>>() {});
	}

	private Set<BlockState> getMatchingStatesFromImpl(){
		return handle == null ? Set.of() : handle.matchingStates();
	}

	public int getMaxTickets(){
		var nms = getMaxTicketsFromImpl();
		return nms;
	}

	private int getMaxTicketsFromImpl(){
		return handle == null ? 0 : handle.maxTickets();
	}

	public int getValidRange(){
		var nms = getValidRangeFromImpl();
		return nms;
	}

	private int getValidRangeFromImpl(){
		return handle == null ? 0 : handle.validRange();
	}

}