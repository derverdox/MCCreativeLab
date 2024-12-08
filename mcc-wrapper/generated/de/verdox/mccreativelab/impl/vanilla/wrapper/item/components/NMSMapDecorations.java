package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import java.util.Set;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSMapDecorations;
import com.google.common.reflect.TypeToken;
import java.util.List;
import net.minecraft.core.Holder;
import java.util.Map;
import net.minecraft.world.level.saveddata.maps.MapDecorationType;
import java.lang.String;
import de.verdox.mccreativelab.wrapper.item.components.MCCMapDecorations;
import net.minecraft.world.item.component.MapDecorations;

public class NMSMapDecorations extends MCCHandle<MapDecorations> implements MCCMapDecorations  {

	public static final MCCConverter<MapDecorations, NMSMapDecorations> CONVERTER  = converter(NMSMapDecorations.class, MapDecorations.class, NMSMapDecorations::new, MCCHandle::getHandle);

	public NMSMapDecorations(MapDecorations handle){
		super(handle);
	}

	public MCCMapDecorations.Entry createEntry(){
		return new NMSEntry(null);
	}

	public Map<String, de.verdox.mccreativelab.wrapper.item.components.MCCMapDecorations.Entry> getDecorations(){
		var nms = getDecorationsFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Map<String, de.verdox.mccreativelab.wrapper.item.components.MCCMapDecorations.Entry>>() {});
	}

	private Map<String, MapDecorations.Entry> getDecorationsFromImpl(){
		return handle == null ? Map.of() : handle.decorations();
	}

	public MCCMapDecorations withDecorations(Map<String, de.verdox.mccreativelab.wrapper.item.components.MCCMapDecorations.Entry> decorations){
		var param0 = MCCPlatform.getInstance().getConversionService().unwrap(decorations, new TypeToken<Map<String, MapDecorations.Entry>>() {});
		return new NMSMapDecorations(new MapDecorations(param0));
	}


	public static class NMSEntry extends MCCHandle<MapDecorations.Entry> implements MCCMapDecorations.Entry  {
	
		public static final MCCConverter<MapDecorations.Entry, NMSMapDecorations.NMSEntry> CONVERTER  = converter(NMSMapDecorations.NMSEntry.class, MapDecorations.Entry.class, NMSMapDecorations.NMSEntry::new, MCCHandle::getHandle);

		public NMSEntry(MapDecorations.Entry handle){
			super(handle);
		}
	
		public MCCReference<MapDecorationType> getType(){
			var nms = getTypeFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCReference<MapDecorationType>>() {});
		}
	
		private Holder<MapDecorationType> getTypeFromImpl(){
			return handle == null ? null : handle.type();
		}
	
		public MCCMapDecorations.Entry withType(MCCReference<MapDecorationType> type){
			var param0 = MCCPlatform.getInstance().getConversionService().unwrap(type, new TypeToken<Holder<MapDecorationType>>() {});
			var param1 = getXFromImpl();
			var param2 = getZFromImpl();
			var param3 = getRotationFromImpl();
			return new NMSMapDecorations.NMSEntry(new MapDecorations.Entry(param0, param1, param2, param3));
		}
	
		public double getX(){
			var nms = getXFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Double>() {});
		}
	
		private double getXFromImpl(){
			return handle == null ? 0 : handle.x();
		}
	
		public MCCMapDecorations.Entry withX(double x){
			var param0 = getTypeFromImpl();
			var param1 = MCCPlatform.getInstance().getConversionService().unwrap(x, new TypeToken<Double>() {});
			var param2 = getZFromImpl();
			var param3 = getRotationFromImpl();
			return new NMSMapDecorations.NMSEntry(new MapDecorations.Entry(param0, param1, param2, param3));
		}
	
		public double getZ(){
			var nms = getZFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Double>() {});
		}
	
		private double getZFromImpl(){
			return handle == null ? 0 : handle.z();
		}
	
		public MCCMapDecorations.Entry withZ(double z){
			var param0 = getTypeFromImpl();
			var param1 = getXFromImpl();
			var param2 = MCCPlatform.getInstance().getConversionService().unwrap(z, new TypeToken<Double>() {});
			var param3 = getRotationFromImpl();
			return new NMSMapDecorations.NMSEntry(new MapDecorations.Entry(param0, param1, param2, param3));
		}
	
		public float getRotation(){
			var nms = getRotationFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Float>() {});
		}
	
		private float getRotationFromImpl(){
			return handle == null ? 0 : handle.rotation();
		}
	
		public MCCMapDecorations.Entry withRotation(float rotation){
			var param0 = getTypeFromImpl();
			var param1 = getXFromImpl();
			var param2 = getZFromImpl();
			var param3 = MCCPlatform.getInstance().getConversionService().unwrap(rotation, new TypeToken<Float>() {});
			return new NMSMapDecorations.NMSEntry(new MapDecorations.Entry(param0, param1, param2, param3));
		}
	
	}
}
