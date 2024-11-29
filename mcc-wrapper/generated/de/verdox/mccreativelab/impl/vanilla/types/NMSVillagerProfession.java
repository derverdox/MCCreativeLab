package de.verdox.mccreativelab.impl.vanilla.types;

import de.verdox.mccreativelab.wrapper.types.MCCPoiType;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.types.MCCVillagerProfession;
import com.google.common.collect.ImmutableSet;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import java.util.function.Predicate;
import net.minecraft.world.item.Item;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import net.minecraft.core.Holder;
import net.kyori.adventure.sound.Sound;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.npc.VillagerProfession;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import net.minecraft.world.level.block.Block;
import java.lang.String;
import de.verdox.mccreativelab.impl.vanilla.types.NMSVillagerProfession;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;

public class NMSVillagerProfession extends MCCHandle<VillagerProfession> implements MCCVillagerProfession  {

	public static final MCCConverter<VillagerProfession, NMSVillagerProfession> CONVERTER  = converter(NMSVillagerProfession.class, VillagerProfession.class, NMSVillagerProfession::new, MCCHandle::getHandle);

	public NMSVillagerProfession(VillagerProfession handle){
		super(handle);
	}

	public String getName(){
		var nms = getNameFromImpl();
		return nms;
	}

	private String getNameFromImpl(){
		return handle == null ? null : handle.name();
	}

	public Predicate<MCCReference<MCCPoiType>> getHeldJobSite(){
		var nms = getHeldJobSiteFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Predicate<MCCReference<MCCPoiType>>>() {});
	}

	private Predicate<Holder<PoiType>> getHeldJobSiteFromImpl(){
		return handle == null ? null : handle.heldJobSite();
	}

	public Predicate<MCCReference<MCCPoiType>> getAcquirableJobSite(){
		var nms = getAcquirableJobSiteFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Predicate<MCCReference<MCCPoiType>>>() {});
	}

	private Predicate<Holder<PoiType>> getAcquirableJobSiteFromImpl(){
		return handle == null ? null : handle.acquirableJobSite();
	}

	public ImmutableSet<MCCItemType> getRequestedItems(){
		var nms = getRequestedItemsFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<ImmutableSet<MCCItemType>>() {});
	}

	private ImmutableSet<Item> getRequestedItemsFromImpl(){
		return handle == null ? ImmutableSet.of() : handle.requestedItems();
	}

	public ImmutableSet<MCCBlockType> getSecondaryPoi(){
		var nms = getSecondaryPoiFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<ImmutableSet<MCCBlockType>>() {});
	}

	private ImmutableSet<Block> getSecondaryPoiFromImpl(){
		return handle == null ? ImmutableSet.of() : handle.secondaryPoi();
	}

	public Sound getWorkSound(){
		var nms = getWorkSoundFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Sound>() {});
	}

	private SoundEvent getWorkSoundFromImpl(){
		return handle == null ? null : handle.workSound();
	}

}
