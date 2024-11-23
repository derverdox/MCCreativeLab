package de.verdox.mccreativelab.wrapper.item.components;

import java.util.List;
import de.verdox.mccreativelab.wrapper.item.components.MCCSuspiciousStewEffects;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.wrapper.entity.MCCEffectType;

public interface MCCSuspiciousStewEffects extends MCCItemComponent  {

	public MCCSuspiciousStewEffects.MCCEntry createMCCEntry();

	public List<MCCSuspiciousStewEffects.MCCEntry> getEffects();

	public MCCSuspiciousStewEffects withEffects(List<MCCSuspiciousStewEffects.MCCEntry> effects);


	public static interface MCCEntry  {
	
		public MCCReference<MCCEffectType> getEffect();
	
		public MCCSuspiciousStewEffects.MCCEntry withEffect(MCCReference<MCCEffectType> effect);
	
		public int getDuration();
	
		public MCCSuspiciousStewEffects.MCCEntry withDuration(int duration);
	
	}
}
