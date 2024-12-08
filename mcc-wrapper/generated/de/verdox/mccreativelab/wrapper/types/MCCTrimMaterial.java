package de.verdox.mccreativelab.wrapper.types;

import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import net.kyori.adventure.text.Component;
import java.util.Map;
import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.types.MCCArmorMaterial;
import java.lang.String;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;

public interface MCCTrimMaterial extends MCCWrapped  {

	public String getAssetName();

	public MCCReference<MCCItemType> getIngredient();

	public float getItemModelIndex();

	public Map<MCCReference<MCCArmorMaterial>, String> getOverrideArmorMaterials();

	public Component getDescription();

}
