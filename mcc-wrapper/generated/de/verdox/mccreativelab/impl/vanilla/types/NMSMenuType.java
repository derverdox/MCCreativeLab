package de.verdox.mccreativelab.impl.vanilla.types;

import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import java.util.HashSet;
import java.util.List;
import de.verdox.mccreativelab.wrapper.types.MCCMenuType;
import de.verdox.mccreativelab.impl.vanilla.types.NMSMenuType;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import net.minecraft.world.inventory.MenuType;
import java.util.ArrayList;

public class NMSMenuType extends NMSHandle<MenuType> implements MCCMenuType  {

	public static final MCCConverter<MenuType, NMSMenuType> CONVERTER  = converter(NMSMenuType.class, MenuType.class, NMSMenuType::new, NMSHandle::getHandle);

	public NMSMenuType (MenuType handle){
		super(handle);
	}

}
