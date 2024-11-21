package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import java.util.Set;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSMapDecorations;
import com.google.common.reflect.TypeToken;
import java.util.ArrayList;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import java.util.HashSet;
import java.util.List;
import net.minecraft.core.Holder;
import java.util.Map;
import net.minecraft.world.level.saveddata.maps.MapDecorationType;
import java.lang.String;
import de.verdox.mccreativelab.wrapper.item.components.MCCMapDecorations;
import net.minecraft.world.item.component.MapDecorations;

public class NMSMapDecorations extends NMSHandle<MapDecorations> implements MCCMapDecorations  {

	public static final MCCConverter<MapDecorations, NMSMapDecorations> CONVERTER  = converter(NMSMapDecorations.class, MapDecorations.class, NMSMapDecorations::new, NMSHandle::getHandle);

	public NMSMapDecorations (MapDecorations handle){
		super(handle);
	}

	public MCCMapDecorations.MCCEntry createMCCEntry(){
		return new NMSEntry(null);
	}

	public Map<String, MCCMapDecorations.MCCEntry> getDecorations(){
		var nms = getDecorationsFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Map<String, MCCMapDecorations.MCCEntry>>() {});
	}

	private Map<String, MapDecorations.Entry> getDecorationsFromImpl(){
		return handle == null ? Map.of() : handle.decorations();
	}

	public MCCMapDecorations withDecorations(Map<String, MCCMapDecorations.MCCEntry> decorations){
		var param0 = MCCPlatform.getInstance().getConversionService().unwrap(decorations, new TypeToken<Map<String, MapDecorations.Entry>>() {});
		return new NMSMapDecorations(new MapDecorations(param0));
	}


	public static class NMSEntry extends NMSHandle<MapDecorations.Entry> implements MCCMapDecorations.MCCEntry  {
	
		public static final MCCConverter<MapDecorations.Entry, NMSMapDecorations.NMSEntry> CONVERTER  = converter(NMSMapDecorations.NMSEntry.class, MapDecorations.Entry.class, NMSMapDecorations.NMSEntry::new, NMSHandle::getHandle);

		public NMSEntry (MapDecorations.Entry handle){
			super(handle);
		}
	
		public MCCReference<MapDecorationType> getType(){
			var nms = getTypeFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCReference<MapDecorationType>>() {});
		}
	
		private Holder<MapDecorationType> getTypeFromImpl(){
			return handle == null ? null : handle.type();
		}
	
		public MCCMapDecorations.MCCEntry withType(MCCReference<MapDecorationType> type){
			var param0 = MCCPlatform.getInstance().getConversionService().unwrap(type, new TypeToken<Holder<MapDecorationType>>() {});
			var param1 = getXFromImpl();
			var param2 = getZFromImpl();
			var param3 = getRotationFromImpl();
			return new NMSMapDecorations.NMSEntry(new MapDecorations.Entry(param0, param1, param2, param3));
		}
	
		public double getX(){
			var nms = getXFromImpl();
			return nms;
		}
	
		private double getXFromImpl(){
			return handle == null ? 0 : handle.x();
		}
	
		public MCCMapDecorations.MCCEntry withX(double x){
			var param0 = getTypeFromImpl();
			var param1 = x;
			var param2 = getZFromImpl();
			var param3 = getRotationFromImpl();
			return new NMSMapDecorations.NMSEntry(new MapDecorations.Entry(param0, param1, param2, param3));
		}
	
		public double getZ(){
			var nms = getZFromImpl();
			return nms;
		}
	
		private double getZFromImpl(){
			return handle == null ? 0 : handle.z();
		}
	
		public MCCMapDecorations.MCCEntry withZ(double z){
			var param0 = getTypeFromImpl();
			var param1 = getXFromImpl();
			var param2 = z;
			var param3 = getRotationFromImpl();
			return new NMSMapDecorations.NMSEntry(new MapDecorations.Entry(param0, param1, param2, param3));
		}
	
		public float getRotation(){
			var nms = getRotationFromImpl();
			return nms;
		}
	
		private float getRotationFromImpl(){
			return handle == null ? 0 : handle.rotation();
		}
	
		public MCCMapDecorations.MCCEntry withRotation(float rotation){
			var param0 = getTypeFromImpl();
			var param1 = getXFromImpl();
			var param2 = getZFromImpl();
			var param3 = rotation;
			return new NMSMapDecorations.NMSEntry(new MapDecorations.Entry(param0, param1, param2, param3));
		}
	
	}
}
