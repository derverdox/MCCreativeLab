package de.verdox.mccreativelab.wrapper.item.components;

import java.util.List;
import java.util.Optional;
import net.kyori.adventure.key.Key;
import java.lang.Integer;
import org.bukkit.potion.PotionEffect;
public interface MCCPotionContents extends MCCItemComponentType{

	public Optional<Integer> getCustomColor ();
	public Optional<Key> getPotion ();
	public List<PotionEffect> getCustomEffects ();
	public MCCPotionContents withPotion (Optional<Key> newPotion);
	public MCCPotionContents withCustomEffects (List<PotionEffect> newCustomEffects);
	public MCCPotionContents withCustomColor (Optional<Integer> newCustomColor);
}
