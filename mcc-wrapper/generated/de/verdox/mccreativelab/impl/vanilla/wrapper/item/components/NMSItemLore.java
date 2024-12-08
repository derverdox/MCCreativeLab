package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import java.util.List;
import net.minecraft.world.item.component.ItemLore;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import net.kyori.adventure.text.Component;
import de.verdox.mccreativelab.wrapper.item.components.MCCItemLore;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSItemLore;

public class NMSItemLore extends MCCHandle<ItemLore> implements MCCItemLore  {

	public static final MCCConverter<ItemLore, NMSItemLore> CONVERTER  = converter(NMSItemLore.class, ItemLore.class, NMSItemLore::new, MCCHandle::getHandle);

	public NMSItemLore(ItemLore handle){
		super(handle);
	}

	public List<Component> getLines(){
		var nms = getLinesFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<List<Component>>() {});
	}

	private List<net.minecraft.network.chat.Component> getLinesFromImpl(){
		return handle == null ? List.of() : handle.lines();
	}

	public MCCItemLore withLines(List<Component> lines){
		var param0 = MCCPlatform.getInstance().getConversionService().unwrap(lines, new TypeToken<List<net.minecraft.network.chat.Component>>() {});
		var param1 = getStyledLinesFromImpl();
		return new NMSItemLore(new ItemLore(param0, param1));
	}

	public List<Component> getStyledLines(){
		var nms = getStyledLinesFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<List<Component>>() {});
	}

	private List<net.minecraft.network.chat.Component> getStyledLinesFromImpl(){
		return handle == null ? List.of() : handle.styledLines();
	}

	public MCCItemLore withStyledLines(List<Component> styledLines){
		var param0 = getLinesFromImpl();
		var param1 = MCCPlatform.getInstance().getConversionService().unwrap(styledLines, new TypeToken<List<net.minecraft.network.chat.Component>>() {});
		return new NMSItemLore(new ItemLore(param0, param1));
	}

}
