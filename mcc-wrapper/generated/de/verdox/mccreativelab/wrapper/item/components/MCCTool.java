package de.verdox.mccreativelab.wrapper.item.components;

import java.lang.Float;
import java.util.List;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import java.util.Optional;
import java.lang.Boolean;
import de.verdox.mccreativelab.wrapper.registry.MCCReferenceSet;
import de.verdox.mccreativelab.wrapper.item.components.MCCTool;

public interface MCCTool extends MCCItemComponent  {

	public MCCTool.MCCRule createMCCRule();

	public List<MCCTool.MCCRule> getRules();

	public MCCTool withRules(List<MCCTool.MCCRule> rules);

	public float getDefaultMiningSpeed();

	public MCCTool withDefaultMiningSpeed(float defaultMiningSpeed);

	public int getDamagePerBlock();

	public MCCTool withDamagePerBlock(int damagePerBlock);


	public static interface MCCRule  {
	
		public MCCReferenceSet<MCCBlockType> getBlocks();
	
		public MCCTool.MCCRule withBlocks(MCCReferenceSet<MCCBlockType> blocks);
	
		public Optional<Float> getSpeed();
	
		public MCCTool.MCCRule withSpeed(Optional<Float> speed);
	
		public Optional<Boolean> getCorrectForDrops();
	
		public MCCTool.MCCRule withCorrectForDrops(Optional<Boolean> correctForDrops);
	
	}
}
