package de.verdox.mccreativelab.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.types.MCCTrimMaterial;
import de.verdox.mccreativelab.wrapper.types.MCCTrimPattern;

public interface MCCArmorTrim extends MCCItemComponent  {

	public MCCReference<MCCTrimMaterial> getMaterial();

	public MCCArmorTrim withMaterial(MCCReference<MCCTrimMaterial> material);

	public MCCReference<MCCTrimPattern> getPattern();

	public MCCArmorTrim withPattern(MCCReference<MCCTrimPattern> pattern);

	public boolean getShowInTooltip();

	public MCCArmorTrim withShowInTooltip(boolean showInTooltip);

}
