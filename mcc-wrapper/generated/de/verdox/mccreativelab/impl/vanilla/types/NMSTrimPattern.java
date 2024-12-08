package de.verdox.mccreativelab.impl.vanilla.types;

import net.minecraft.resources.ResourceLocation;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import net.minecraft.world.item.Item;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.impl.vanilla.types.NMSTrimPattern;
import java.util.List;
import net.minecraft.core.Holder;
import net.kyori.adventure.text.Component;
import de.verdox.mccreativelab.wrapper.types.MCCTrimPattern;
import net.minecraft.world.item.armortrim.TrimPattern;
import net.kyori.adventure.key.Key;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;

public class NMSTrimPattern extends MCCHandle<TrimPattern> implements MCCTrimPattern  {

	public static final MCCConverter<TrimPattern, NMSTrimPattern> CONVERTER  = converter(NMSTrimPattern.class, TrimPattern.class, NMSTrimPattern::new, MCCHandle::getHandle);

	public NMSTrimPattern(TrimPattern handle){
		super(handle);
	}

	public Key getAssetId(){
		var nms = getAssetIdFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Key>() {});
	}

	private ResourceLocation getAssetIdFromImpl(){
		return handle == null ? null : handle.assetId();
	}

	public MCCReference<MCCItemType> getTemplateItem(){
		var nms = getTemplateItemFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCReference<MCCItemType>>() {});
	}

	private Holder<Item> getTemplateItemFromImpl(){
		return handle == null ? null : handle.templateItem();
	}

	public Component getDescription(){
		var nms = getDescriptionFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Component>() {});
	}

	private net.minecraft.network.chat.Component getDescriptionFromImpl(){
		return handle == null ? null : handle.description();
	}

	public boolean getDecal(){
		var nms = getDecalFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Boolean>() {});
	}

	private boolean getDecalFromImpl(){
		return handle == null ? false : handle.decal();
	}

}
