package de.verdox.mccreativelab.wrapper.item.components;

import net.kyori.adventure.key.Key;
public interface MCCSeededContainerLoot extends MCCItemComponentType{

	public MCCSeededContainerLoot withLootTable (Key newLootTable);
	public long getSeed ();
	public MCCSeededContainerLoot withSeed (long newSeed);
	public Key getLootTable ();
}
