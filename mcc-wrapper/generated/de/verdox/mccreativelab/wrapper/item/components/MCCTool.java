package de.verdox.mccreativelab.wrapper.item.components;

import java.lang.Float;
import java.util.List;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import java.util.Optional;
import java.lang.Boolean;
import de.verdox.mccreativelab.wrapper.registry.MCCReferenceSet;
import de.verdox.mccreativelab.wrapper.item.components.MCCTool;

public interface MCCTool extends MCCItemComponent  {

	public MCCTool.Rule createRule();

	public List<MCCTool.Rule> getRules();

	public MCCTool withRules(List<MCCTool.Rule> rules);

	public float getDefaultMiningSpeed();

	public MCCTool withDefaultMiningSpeed(float defaultMiningSpeed);

	public int getDamagePerBlock();

	public MCCTool withDamagePerBlock(int damagePerBlock);


	public static interface Rule  {
	
		public MCCReferenceSet<MCCBlockType> getBlocks();
	
		public MCCTool.Rule withBlocks(MCCReferenceSet<MCCBlockType> blocks);
	
		public Optional<Float> getSpeed();
	
		public MCCTool.Rule withSpeed(Optional<Float> speed);
	
		public Optional<Boolean> getCorrectForDrops();
	
		public MCCTool.Rule withCorrectForDrops(Optional<Boolean> correctForDrops);
	
	}
}
