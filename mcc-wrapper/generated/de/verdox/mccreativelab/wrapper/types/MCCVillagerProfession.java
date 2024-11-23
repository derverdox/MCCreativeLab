package de.verdox.mccreativelab.wrapper.types;

import de.verdox.mccreativelab.wrapper.types.MCCPoiType;
import com.google.common.collect.ImmutableSet;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import java.util.function.Predicate;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import de.verdox.mccreativelab.wrapper.world.MCCSound;
import de.verdox.mccreativelab.wrapper.MCCWrapped;
import java.lang.String;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;

public interface MCCVillagerProfession extends MCCWrapped  {

	public String getName();

	public Predicate<MCCReference<MCCPoiType>> getHeldJobSite();

	public Predicate<MCCReference<MCCPoiType>> getAcquirableJobSite();

	public ImmutableSet<MCCItemType> getRequestedItems();

	public ImmutableSet<MCCBlockType> getSecondaryPoi();

	public MCCSound getWorkSound();

}
