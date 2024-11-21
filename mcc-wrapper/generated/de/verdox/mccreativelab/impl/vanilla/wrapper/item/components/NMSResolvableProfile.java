package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.item.components.MCCResolvableProfile;
import com.destroystokyo.paper.profile.PlayerProfile;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import com.mojang.authlib.GameProfile;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import java.util.UUID;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSResolvableProfile;
import java.util.ArrayList;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import java.util.HashSet;
import java.util.List;
import com.mojang.authlib.properties.PropertyMap;
import net.minecraft.world.item.component.ResolvableProfile;
import java.util.Optional;
import java.lang.String;

public class NMSResolvableProfile extends NMSHandle<ResolvableProfile> implements MCCResolvableProfile  {

	public static final MCCConverter<ResolvableProfile, NMSResolvableProfile> CONVERTER  = converter(NMSResolvableProfile.class, ResolvableProfile.class, NMSResolvableProfile::new, NMSHandle::getHandle);

	public NMSResolvableProfile (ResolvableProfile handle){
		super(handle);
	}

	public Optional<String> getName(){
		var nms = getNameFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Optional<String>>() {});
	}

	private Optional<String> getNameFromImpl(){
		return handle == null ? null : handle.name();
	}

	public MCCResolvableProfile withName(Optional<String> name){
		var param0 = MCCPlatform.getInstance().getConversionService().unwrap(name, new TypeToken<Optional<String>>() {});
		var param1 = getIdFromImpl();
		var param2 = getPropertiesFromImpl();
		var param3 = getGameProfileFromImpl();
		return new NMSResolvableProfile(new ResolvableProfile(param0, param1, param2, param3));
	}

	public Optional<UUID> getId(){
		var nms = getIdFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Optional<UUID>>() {});
	}

	private Optional<UUID> getIdFromImpl(){
		return handle == null ? null : handle.id();
	}

	public MCCResolvableProfile withId(Optional<UUID> id){
		var param0 = getNameFromImpl();
		var param1 = MCCPlatform.getInstance().getConversionService().unwrap(id, new TypeToken<Optional<UUID>>() {});
		var param2 = getPropertiesFromImpl();
		var param3 = getGameProfileFromImpl();
		return new NMSResolvableProfile(new ResolvableProfile(param0, param1, param2, param3));
	}

	public PropertyMap getProperties(){
		var nms = getPropertiesFromImpl();
		return nms;
	}

	private PropertyMap getPropertiesFromImpl(){
		return handle == null ? null : handle.properties();
	}

	public MCCResolvableProfile withProperties(PropertyMap properties){
		var param0 = getNameFromImpl();
		var param1 = getIdFromImpl();
		var param2 = properties;
		var param3 = getGameProfileFromImpl();
		return new NMSResolvableProfile(new ResolvableProfile(param0, param1, param2, param3));
	}

	public PlayerProfile getGameProfile(){
		var nms = getGameProfileFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<PlayerProfile>() {});
	}

	private GameProfile getGameProfileFromImpl(){
		return handle == null ? null : handle.gameProfile();
	}

	public MCCResolvableProfile withGameProfile(PlayerProfile gameProfile){
		var param0 = getNameFromImpl();
		var param1 = getIdFromImpl();
		var param2 = getPropertiesFromImpl();
		var param3 = MCCPlatform.getInstance().getConversionService().unwrap(gameProfile, new TypeToken<GameProfile>() {});
		return new NMSResolvableProfile(new ResolvableProfile(param0, param1, param2, param3));
	}

}
