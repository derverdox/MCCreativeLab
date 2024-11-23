package de.verdox.mccreativelab.wrapper.item.components;

import java.lang.String;
import com.mojang.authlib.properties.PropertyMap;
import java.util.UUID;
import java.util.Optional;
import com.destroystokyo.paper.profile.PlayerProfile;
public interface MCCResolvableProfile extends MCCItemComponentType{

	public PropertyMap getProperties ();
	public MCCResolvableProfile withId (Optional<UUID> newId);
	public MCCResolvableProfile withGameProfile (PlayerProfile newGameProfile);
	public Optional<UUID> getId ();
	public MCCResolvableProfile withName (Optional<String> newName);
	public MCCResolvableProfile withProperties (PropertyMap newProperties);
	public PlayerProfile getGameProfile ();
	public Optional<String> getName ();
}
