package de.verdox.mccreativelab.impl.vanilla.types;

import net.minecraft.world.entity.animal.FrogVariant;
import net.minecraft.resources.ResourceLocation;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import java.util.Set;
import de.verdox.mccreativelab.wrapper.types.MCCFrogVariant;
import com.google.common.reflect.TypeToken;
import java.util.ArrayList;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import java.util.HashSet;
import java.util.List;
import de.verdox.mccreativelab.impl.vanilla.types.NMSFrogVariant;
import net.kyori.adventure.key.Key;

public class NMSFrogVariant extends NMSHandle<FrogVariant> implements MCCFrogVariant  {

	public static final MCCConverter<FrogVariant, NMSFrogVariant> CONVERTER  = converter(NMSFrogVariant.class, FrogVariant.class, NMSFrogVariant::new, NMSHandle::getHandle);

	public NMSFrogVariant (FrogVariant handle){
		super(handle);
	}

	public Key getTexture(){
		var nms = getTextureFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Key>() {});
	}

	private ResourceLocation getTextureFromImpl(){
		return handle == null ? null : handle.texture();
	}

}
