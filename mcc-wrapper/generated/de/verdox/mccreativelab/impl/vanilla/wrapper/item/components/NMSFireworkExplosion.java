package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import java.util.HashSet;
import java.util.List;
import it.unimi.dsi.fastutil.ints.IntList;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSFireworkExplosion;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import java.util.Set;
import de.verdox.mccreativelab.wrapper.item.components.MCCFireworkExplosion;
import com.google.common.reflect.TypeToken;
import net.minecraft.world.item.component.FireworkExplosion;
import java.util.ArrayList;

public class NMSFireworkExplosion extends NMSHandle<FireworkExplosion> implements MCCFireworkExplosion  {

	public static final MCCConverter<FireworkExplosion, NMSFireworkExplosion> CONVERTER  = converter(NMSFireworkExplosion.class, FireworkExplosion.class, NMSFireworkExplosion::new, NMSHandle::getHandle);

	public NMSFireworkExplosion (FireworkExplosion handle){
		super(handle);
	}

	public MCCFireworkExplosion.Shape getShape(){
		var nms = getShapeFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCFireworkExplosion.Shape>() {});
	}

	private FireworkExplosion.Shape getShapeFromImpl(){
		return handle == null ? null : handle.shape();
	}

	public MCCFireworkExplosion withShape(MCCFireworkExplosion.Shape shape){
		var param0 = MCCPlatform.getInstance().getConversionService().unwrap(shape, new TypeToken<FireworkExplosion.Shape>() {});
		var param1 = getColorsFromImpl();
		var param2 = getFadeColorsFromImpl();
		var param3 = getHasTrailFromImpl();
		var param4 = getHasTwinkleFromImpl();
		return new NMSFireworkExplosion(new FireworkExplosion(param0, param1, param2, param3, param4));
	}

	public IntList getColors(){
		var nms = getColorsFromImpl();
		return nms;
	}

	private IntList getColorsFromImpl(){
		return handle == null ? IntList.of() : handle.colors();
	}

	public MCCFireworkExplosion withColors(IntList colors){
		var param0 = getShapeFromImpl();
		var param1 = colors;
		var param2 = getFadeColorsFromImpl();
		var param3 = getHasTrailFromImpl();
		var param4 = getHasTwinkleFromImpl();
		return new NMSFireworkExplosion(new FireworkExplosion(param0, param1, param2, param3, param4));
	}

	public IntList getFadeColors(){
		var nms = getFadeColorsFromImpl();
		return nms;
	}

	private IntList getFadeColorsFromImpl(){
		return handle == null ? IntList.of() : handle.fadeColors();
	}

	public MCCFireworkExplosion withFadeColors(IntList fadeColors){
		var param0 = getShapeFromImpl();
		var param1 = getColorsFromImpl();
		var param2 = fadeColors;
		var param3 = getHasTrailFromImpl();
		var param4 = getHasTwinkleFromImpl();
		return new NMSFireworkExplosion(new FireworkExplosion(param0, param1, param2, param3, param4));
	}

	public boolean getHasTrail(){
		var nms = getHasTrailFromImpl();
		return nms;
	}

	private boolean getHasTrailFromImpl(){
		return handle == null ? false : handle.hasTrail();
	}

	public MCCFireworkExplosion withHasTrail(boolean hasTrail){
		var param0 = getShapeFromImpl();
		var param1 = getColorsFromImpl();
		var param2 = getFadeColorsFromImpl();
		var param3 = hasTrail;
		var param4 = getHasTwinkleFromImpl();
		return new NMSFireworkExplosion(new FireworkExplosion(param0, param1, param2, param3, param4));
	}

	public boolean getHasTwinkle(){
		var nms = getHasTwinkleFromImpl();
		return nms;
	}

	private boolean getHasTwinkleFromImpl(){
		return handle == null ? false : handle.hasTwinkle();
	}

	public MCCFireworkExplosion withHasTwinkle(boolean hasTwinkle){
		var param0 = getShapeFromImpl();
		var param1 = getColorsFromImpl();
		var param2 = getFadeColorsFromImpl();
		var param3 = getHasTrailFromImpl();
		var param4 = hasTwinkle;
		return new NMSFireworkExplosion(new FireworkExplosion(param0, param1, param2, param3, param4));
	}

}
