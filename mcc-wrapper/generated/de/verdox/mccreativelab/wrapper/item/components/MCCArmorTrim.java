package de.verdox.mccreativelab.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimPattern;

public interface MCCArmorTrim extends MCCItemComponent  {

	public MCCReference<TrimMaterial> getMaterial();

	public MCCArmorTrim withMaterial(MCCReference<TrimMaterial> material);

	public MCCReference<TrimPattern> getPattern();

	public MCCArmorTrim withPattern(MCCReference<TrimPattern> pattern);

	public boolean getShowInTooltip();

	public MCCArmorTrim withShowInTooltip(boolean showInTooltip);

}
