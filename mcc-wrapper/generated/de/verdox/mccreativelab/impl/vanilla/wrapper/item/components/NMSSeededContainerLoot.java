package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.registry.MCCTypedKey;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import net.minecraft.resources.ResourceKey;
import java.util.ArrayList;
import java.util.HashSet;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSSeededContainerLoot;
import java.util.List;
import net.minecraft.world.item.component.SeededContainerLoot;
import de.verdox.mccreativelab.wrapper.item.components.MCCSeededContainerLoot;
import net.minecraft.world.level.storage.loot.LootTable;

public class NMSSeededContainerLoot extends MCCHandle<SeededContainerLoot> implements MCCSeededContainerLoot  {

	public static final MCCConverter<SeededContainerLoot, NMSSeededContainerLoot> CONVERTER  = converter(NMSSeededContainerLoot.class, SeededContainerLoot.class, NMSSeededContainerLoot::new, MCCHandle::getHandle);

	public NMSSeededContainerLoot(SeededContainerLoot handle){
		super(handle);
	}

	public MCCTypedKey<LootTable> getLootTable(){
		var nms = getLootTableFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCTypedKey<LootTable>>() {});
	}

	private ResourceKey<LootTable> getLootTableFromImpl(){
		return handle == null ? null : handle.lootTable();
	}

	public MCCSeededContainerLoot withLootTable(MCCTypedKey<LootTable> lootTable){
		var param0 = MCCPlatform.getInstance().getConversionService().unwrap(lootTable, new TypeToken<ResourceKey<LootTable>>() {});
		var param1 = getSeedFromImpl();
		return new NMSSeededContainerLoot(new SeededContainerLoot(param0, param1));
	}

	public long getSeed(){
		var nms = getSeedFromImpl();
		return nms;
	}

	private long getSeedFromImpl(){
		return handle == null ? 0 : handle.seed();
	}

	public MCCSeededContainerLoot withSeed(long seed){
		var param0 = getLootTableFromImpl();
		var param1 = seed;
		return new NMSSeededContainerLoot(new SeededContainerLoot(param0, param1));
	}

}
