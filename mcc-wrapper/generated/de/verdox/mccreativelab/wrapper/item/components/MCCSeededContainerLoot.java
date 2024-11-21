package de.verdox.mccreativelab.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import net.minecraft.world.level.storage.loot.LootTable;

public interface MCCSeededContainerLoot extends MCCItemComponent  {

	public MCCTypedKey<LootTable> getLootTable();

	public MCCSeededContainerLoot withLootTable(MCCTypedKey<LootTable> lootTable);

	public long getSeed();

	public MCCSeededContainerLoot withSeed(long seed);

}
