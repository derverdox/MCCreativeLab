package de.verdox.mccreativelab.wrapper.types;

import de.verdox.mccreativelab.wrapper.types.MCCPoiType;
import net.kyori.adventure.sound.Sound;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import java.util.function.Predicate;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import java.util.Set;
import de.verdox.mccreativelab.wrapper.MCCWrapped;
import java.lang.String;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;

public interface MCCVillagerProfession extends MCCWrapped  {

	public String getName();

	public Predicate<MCCReference<MCCPoiType>> getHeldJobSite();

	public Predicate<MCCReference<MCCPoiType>> getAcquirableJobSite();

	public Set<MCCItemType> getRequestedItems();

	public Set<MCCBlockType> getSecondaryPoi();

	public Sound getWorkSound();

}
