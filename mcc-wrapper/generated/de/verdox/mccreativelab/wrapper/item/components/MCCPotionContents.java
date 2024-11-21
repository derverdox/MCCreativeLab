package de.verdox.mccreativelab.wrapper.item.components;

import java.util.List;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import java.util.Optional;
import java.lang.Integer;
import net.minecraft.world.item.alchemy.Potion;
import org.bukkit.potion.PotionEffect;

public interface MCCPotionContents extends MCCItemComponent  {

	public Optional<MCCReference<Potion>> getPotion();

	public MCCPotionContents withPotion(Optional<MCCReference<Potion>> potion);

	public Optional<Integer> getCustomColor();

	public MCCPotionContents withCustomColor(Optional<Integer> customColor);

	public List<PotionEffect> getCustomEffects();

	public MCCPotionContents withCustomEffects(List<PotionEffect> customEffects);

}
