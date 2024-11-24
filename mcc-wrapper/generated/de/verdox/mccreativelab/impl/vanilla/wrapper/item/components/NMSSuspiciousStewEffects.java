package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.item.components.MCCSuspiciousStewEffects;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.entity.MCCEffectType;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import java.util.ArrayList;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import java.util.HashSet;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSSuspiciousStewEffects;
import java.util.List;
import net.minecraft.core.Holder;
import net.minecraft.world.item.component.SuspiciousStewEffects;
import net.minecraft.world.effect.MobEffect;

public class NMSSuspiciousStewEffects extends NMSHandle<SuspiciousStewEffects> implements MCCSuspiciousStewEffects  {

	public static final MCCConverter<SuspiciousStewEffects, NMSSuspiciousStewEffects> CONVERTER  = converter(NMSSuspiciousStewEffects.class, SuspiciousStewEffects.class, NMSSuspiciousStewEffects::new, NMSHandle::getHandle);

	public NMSSuspiciousStewEffects (SuspiciousStewEffects handle){
		super(handle);
	}

	public MCCSuspiciousStewEffects.MCCEntry createMCCEntry(){
		return new NMSEntry(null);
	}

	public List<MCCSuspiciousStewEffects.MCCEntry> getEffects(){
		var nms = getEffectsFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<List<MCCSuspiciousStewEffects.MCCEntry>>() {});
	}

	private List<SuspiciousStewEffects.Entry> getEffectsFromImpl(){
		return handle == null ? List.of() : handle.effects();
	}

	public MCCSuspiciousStewEffects withEffects(List<MCCSuspiciousStewEffects.MCCEntry> effects){
		var param0 = MCCPlatform.getInstance().getConversionService().unwrap(effects, new TypeToken<List<SuspiciousStewEffects.Entry>>() {});
		return new NMSSuspiciousStewEffects(new SuspiciousStewEffects(param0));
	}


	public static class NMSEntry extends NMSHandle<SuspiciousStewEffects.Entry> implements MCCSuspiciousStewEffects.MCCEntry  {
	
		public static final MCCConverter<SuspiciousStewEffects.Entry, NMSSuspiciousStewEffects.NMSEntry> CONVERTER  = converter(NMSSuspiciousStewEffects.NMSEntry.class, SuspiciousStewEffects.Entry.class, NMSSuspiciousStewEffects.NMSEntry::new, NMSHandle::getHandle);

		public NMSEntry (SuspiciousStewEffects.Entry handle){
			super(handle);
		}
	
		public MCCReference<MCCEffectType> getEffect(){
			var nms = getEffectFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCReference<MCCEffectType>>() {});
		}
	
		private Holder<MobEffect> getEffectFromImpl(){
			return handle == null ? null : handle.effect();
		}
	
		public MCCSuspiciousStewEffects.MCCEntry withEffect(MCCReference<MCCEffectType> effect){
			var param0 = MCCPlatform.getInstance().getConversionService().unwrap(effect, new TypeToken<Holder<MobEffect>>() {});
			var param1 = getDurationFromImpl();
			return new NMSSuspiciousStewEffects.NMSEntry(new SuspiciousStewEffects.Entry(param0, param1));
		}
	
		public int getDuration(){
			var nms = getDurationFromImpl();
			return nms;
		}
	
		private int getDurationFromImpl(){
			return handle == null ? 0 : handle.duration();
		}
	
		public MCCSuspiciousStewEffects.MCCEntry withDuration(int duration){
			var param0 = getEffectFromImpl();
			var param1 = duration;
			return new NMSSuspiciousStewEffects.NMSEntry(new SuspiciousStewEffects.Entry(param0, param1));
		}
	
	}
}