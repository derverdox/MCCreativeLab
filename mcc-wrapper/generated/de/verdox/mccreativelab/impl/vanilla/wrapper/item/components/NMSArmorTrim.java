package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.item.components.MCCArmorTrim;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import net.minecraft.world.item.armortrim.TrimMaterial;
import java.lang.reflect.Field;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSArmorTrim;
import java.util.ArrayList;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import java.util.HashSet;
import java.util.List;
import net.minecraft.core.Holder;
import net.minecraft.world.item.armortrim.ArmorTrim;
import net.minecraft.world.item.armortrim.TrimPattern;

public class NMSArmorTrim extends NMSHandle<ArmorTrim> implements MCCArmorTrim  {

	public static final MCCConverter<ArmorTrim, NMSArmorTrim> CONVERTER  = converter(NMSArmorTrim.class, ArmorTrim.class, NMSArmorTrim::new, NMSHandle::getHandle);

	public NMSArmorTrim (ArmorTrim handle){
		super(handle);
	}

	public MCCReference<TrimMaterial> getMaterial(){
		var nms = getMaterialFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCReference<TrimMaterial>>() {});
	}

	private Holder<TrimMaterial> getMaterialFromImpl(){
		Holder<TrimMaterial> nms;
		if(handle==null) return null;
		try {
			Field nmsField = ArmorTrim.class.getDeclaredField("material");
			nmsField.setAccessible(true);
			nms = (Holder<TrimMaterial>) nmsField.get(handle);
		} catch (Throwable e) { throw new RuntimeException(e); }
		return nms;
	}

	public MCCArmorTrim withMaterial(MCCReference<TrimMaterial> material){
		var param0 = MCCPlatform.getInstance().getConversionService().unwrap(material, new TypeToken<Holder<TrimMaterial>>() {});
		var param1 = getPatternFromImpl();
		var param2 = getShowInTooltipFromImpl();
		return new NMSArmorTrim(new ArmorTrim(param0, param1, param2));
	}

	public MCCReference<TrimPattern> getPattern(){
		var nms = getPatternFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCReference<TrimPattern>>() {});
	}

	private Holder<TrimPattern> getPatternFromImpl(){
		Holder<TrimPattern> nms;
		if(handle==null) return null;
		try {
			Field nmsField = ArmorTrim.class.getDeclaredField("pattern");
			nmsField.setAccessible(true);
			nms = (Holder<TrimPattern>) nmsField.get(handle);
		} catch (Throwable e) { throw new RuntimeException(e); }
		return nms;
	}

	public MCCArmorTrim withPattern(MCCReference<TrimPattern> pattern){
		var param0 = getMaterialFromImpl();
		var param1 = MCCPlatform.getInstance().getConversionService().unwrap(pattern, new TypeToken<Holder<TrimPattern>>() {});
		var param2 = getShowInTooltipFromImpl();
		return new NMSArmorTrim(new ArmorTrim(param0, param1, param2));
	}

	public boolean getShowInTooltip(){
		var nms = getShowInTooltipFromImpl();
		return nms;
	}

	private boolean getShowInTooltipFromImpl(){
		boolean nms;
		if(handle==null) return false;
		try {
			Field nmsField = ArmorTrim.class.getDeclaredField("showInTooltip");
			nmsField.setAccessible(true);
			nms = (boolean) nmsField.get(handle);
		} catch (Throwable e) { throw new RuntimeException(e); }
		return nms;
	}

	public MCCArmorTrim withShowInTooltip(boolean showInTooltip){
		var param0 = getMaterialFromImpl();
		var param1 = getPatternFromImpl();
		var param2 = showInTooltip;
		return new NMSArmorTrim(new ArmorTrim(param0, param1, param2));
	}

}
