package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.item.components.MCCSuspiciousStewEffects;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.entity.MCCEffectType;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSSuspiciousStewEffects;
import java.util.List;
import net.minecraft.core.Holder;
import net.minecraft.world.item.component.SuspiciousStewEffects;
import net.minecraft.world.effect.MobEffect;

public class NMSSuspiciousStewEffects extends MCCHandle<SuspiciousStewEffects> implements MCCSuspiciousStewEffects  {

	public static final MCCConverter<SuspiciousStewEffects, NMSSuspiciousStewEffects> CONVERTER  = converter(NMSSuspiciousStewEffects.class, SuspiciousStewEffects.class, NMSSuspiciousStewEffects::new, MCCHandle::getHandle);

	public NMSSuspiciousStewEffects(SuspiciousStewEffects handle){
		super(handle);
	}

	public MCCSuspiciousStewEffects.Entry createEntry(){
		return new NMSEntry(null);
	}

	public List<de.verdox.mccreativelab.wrapper.item.components.MCCSuspiciousStewEffects.Entry> getEffects(){
		var nms = getEffectsFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<List<de.verdox.mccreativelab.wrapper.item.components.MCCSuspiciousStewEffects.Entry>>() {});
	}

	private List<SuspiciousStewEffects.Entry> getEffectsFromImpl(){
		return handle == null ? List.of() : handle.effects();
	}

	public MCCSuspiciousStewEffects withEffects(List<de.verdox.mccreativelab.wrapper.item.components.MCCSuspiciousStewEffects.Entry> effects){
		var param0 = MCCPlatform.getInstance().getConversionService().unwrap(effects, new TypeToken<List<SuspiciousStewEffects.Entry>>() {});
		return new NMSSuspiciousStewEffects(new SuspiciousStewEffects(param0));
	}


	public static class NMSEntry extends MCCHandle<SuspiciousStewEffects.Entry> implements MCCSuspiciousStewEffects.Entry  {
	
		public static final MCCConverter<SuspiciousStewEffects.Entry, NMSSuspiciousStewEffects.NMSEntry> CONVERTER  = converter(NMSSuspiciousStewEffects.NMSEntry.class, SuspiciousStewEffects.Entry.class, NMSSuspiciousStewEffects.NMSEntry::new, MCCHandle::getHandle);

		public NMSEntry(SuspiciousStewEffects.Entry handle){
			super(handle);
		}
	
		public MCCReference<MCCEffectType> getEffect(){
			var nms = getEffectFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCReference<MCCEffectType>>() {});
		}
	
		private Holder<MobEffect> getEffectFromImpl(){
			return handle == null ? null : handle.effect();
		}
	
		public MCCSuspiciousStewEffects.Entry withEffect(MCCReference<MCCEffectType> effect){
			var param0 = MCCPlatform.getInstance().getConversionService().unwrap(effect, new TypeToken<Holder<MobEffect>>() {});
			var param1 = getDurationFromImpl();
			return new NMSSuspiciousStewEffects.NMSEntry(new SuspiciousStewEffects.Entry(param0, param1));
		}
	
		public int getDuration(){
			var nms = getDurationFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Integer>() {});
		}
	
		private int getDurationFromImpl(){
			return handle == null ? 0 : handle.duration();
		}
	
		public MCCSuspiciousStewEffects.Entry withDuration(int duration){
			var param0 = getEffectFromImpl();
			var param1 = MCCPlatform.getInstance().getConversionService().unwrap(duration, new TypeToken<Integer>() {});
			return new NMSSuspiciousStewEffects.NMSEntry(new SuspiciousStewEffects.Entry(param0, param1));
		}
	
	}
}
