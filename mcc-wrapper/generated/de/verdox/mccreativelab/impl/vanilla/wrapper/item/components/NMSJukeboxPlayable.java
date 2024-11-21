package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.item.components.MCCJukeboxPlayable;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.minecraft.world.item.JukeboxSong;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import java.util.Set;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSJukeboxPlayable;
import com.google.common.reflect.TypeToken;
import java.util.ArrayList;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import java.util.HashSet;
import java.util.List;
import net.minecraft.world.item.EitherHolder;
import de.verdox.mccreativelab.wrapper.registry.MCCEitherReference;
import net.minecraft.world.item.JukeboxPlayable;

public class NMSJukeboxPlayable extends NMSHandle<JukeboxPlayable> implements MCCJukeboxPlayable  {

	public static final MCCConverter<JukeboxPlayable, NMSJukeboxPlayable> CONVERTER  = converter(NMSJukeboxPlayable.class, JukeboxPlayable.class, NMSJukeboxPlayable::new, NMSHandle::getHandle);

	public NMSJukeboxPlayable (JukeboxPlayable handle){
		super(handle);
	}

	public MCCEitherReference<JukeboxSong> getSong(){
		var nms = getSongFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCEitherReference<JukeboxSong>>() {});
	}

	private EitherHolder<JukeboxSong> getSongFromImpl(){
		return handle == null ? null : handle.song();
	}

	public MCCJukeboxPlayable withSong(MCCEitherReference<JukeboxSong> song){
		var param0 = MCCPlatform.getInstance().getConversionService().unwrap(song, new TypeToken<EitherHolder<JukeboxSong>>() {});
		var param1 = getShowInTooltipFromImpl();
		return new NMSJukeboxPlayable(new JukeboxPlayable(param0, param1));
	}

	public boolean getShowInTooltip(){
		var nms = getShowInTooltipFromImpl();
		return nms;
	}

	private boolean getShowInTooltipFromImpl(){
		return handle == null ? false : handle.showInTooltip();
	}

	public MCCJukeboxPlayable withShowInTooltip(boolean showInTooltip){
		var param0 = getSongFromImpl();
		var param1 = showInTooltip;
		return new NMSJukeboxPlayable(new JukeboxPlayable(param0, param1));
	}

}
