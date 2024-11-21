package de.verdox.mccreativelab.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.item.components.MCCSuspiciousStewEffects;
import java.util.List;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import net.minecraft.world.effect.MobEffect;

public interface MCCSuspiciousStewEffects extends MCCItemComponent  {

	public MCCSuspiciousStewEffects.MCCEntry createMCCEntry();

	public List<MCCSuspiciousStewEffects.MCCEntry> getEffects();

	public MCCSuspiciousStewEffects withEffects(List<MCCSuspiciousStewEffects.MCCEntry> effects);


	public static interface MCCEntry  {
	
		public MCCReference<MobEffect> getEffect();
	
		public MCCSuspiciousStewEffects.MCCEntry withEffect(MCCReference<MobEffect> effect);
	
		public int getDuration();
	
		public MCCSuspiciousStewEffects.MCCEntry withDuration(int duration);
	
	}
}
