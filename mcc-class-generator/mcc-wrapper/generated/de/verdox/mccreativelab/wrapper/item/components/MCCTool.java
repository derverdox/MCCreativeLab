package de.verdox.mccreativelab.wrapper.item.components;

import java.util.List;
import java.util.Optional;
import java.lang.Float;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import java.lang.Boolean;
public interface MCCTool extends MCCItemComponentType{

	public MCCTool withDamagePerBlock (int newDamagePerBlock);
	public MCCTool withRules (List<Rule> newRules);
	public List<Rule> getRules ();
	public MCCTool withDefaultMiningSpeed (float newDefaultMiningSpeed);
	public int getDamagePerBlock ();
	public float getDefaultMiningSpeed ();
	public interface Rule extends MCCItemComponentType{

		public Optional<Float> getSpeed ();
		public Rule withBlocks (List<MCCBlockType> newBlocks);
		public Optional<Boolean> getCorrectForDrops ();
		public Rule withCorrectForDrops (Optional<Boolean> newCorrectForDrops);
		public Rule withSpeed (Optional<Float> newSpeed);
		public List<MCCBlockType> getBlocks ();
}
}
