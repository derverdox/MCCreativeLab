package de.verdox.mccreativelab.impl.vanilla.platform.converter;

import net.minecraft.resources.ResourceLocation;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSBlockItemStateProperties;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.item.components.MCCCustomModelData;
import net.minecraft.world.item.component.DyedItemColor;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.world.item.component.MapPostProcessing;
import net.minecraft.world.item.component.LodestoneTracker;
import net.minecraft.world.item.component.CustomModelData;
import java.lang.Integer;
import de.verdox.mccreativelab.wrapper.item.components.MCCTool;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSSuspiciousStewEffects;
import de.verdox.mccreativelab.wrapper.item.components.MCCRarity;
import net.minecraft.core.Holder;
import net.minecraft.world.LockCode;
import net.minecraft.world.item.Instrument;
import de.verdox.mccreativelab.wrapper.item.components.MCCFireworkExplosion;
import de.verdox.mccreativelab.impl.vanilla.item.components.NMSDataComponentType;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSUnbreakable;
import net.minecraft.world.item.component.MapDecorations;
import de.verdox.mccreativelab.wrapper.item.components.MCCBlockItemStateProperties;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSDyedItemColor;
import net.minecraft.world.item.alchemy.PotionContents;
import de.verdox.mccreativelab.wrapper.item.components.MCCJukeboxPlayable;
import de.verdox.mccreativelab.wrapper.item.components.MCCArmorTrim;
import de.verdox.mccreativelab.wrapper.registry.MCCReference;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSFoodProperties;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSMapDecorations;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSJukeboxPlayable;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSItemAttributeModifiers;
import de.verdox.mccreativelab.wrapper.item.components.MCCLodestoneTracker;
import net.minecraft.world.item.component.FireworkExplosion;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.component.Tool;
import java.util.List;
import net.minecraft.world.item.component.SeededContainerLoot;
import de.verdox.mccreativelab.wrapper.item.components.MCCUnbreakable;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSMapId;
import net.minecraft.world.item.component.ResolvableProfile;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.component.SuspiciousStewEffects;
import de.verdox.mccreativelab.wrapper.item.components.MCCMapDecorations;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSItemLore;
import net.minecraft.world.item.Rarity;
import net.kyori.adventure.key.Key;
import de.verdox.mccreativelab.wrapper.item.components.MCCFoodProperties;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.component.ItemLore;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSLodestoneTracker;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSPotionContents;
import net.minecraft.world.item.component.Unbreakable;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSLockCode;
import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.item.components.MCCMapId;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSCustomModelData;
import de.verdox.mccreativelab.wrapper.item.components.MCCMapItemColor;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSSeededContainerLoot;
import net.minecraft.world.item.component.MapItemColor;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSFireworkExplosion;
import de.verdox.mccreativelab.wrapper.item.components.MCCLockCode;
import de.verdox.mccreativelab.wrapper.item.components.MCCSeededContainerLoot;
import java.lang.Boolean;
import net.minecraft.world.item.armortrim.ArmorTrim;
import net.minecraft.world.item.JukeboxPlayable;
import net.minecraft.world.level.saveddata.maps.MapId;
import de.verdox.mccreativelab.wrapper.item.components.MCCDyedItemColor;
import net.minecraft.world.food.FoodProperties;
import de.verdox.mccreativelab.wrapper.item.components.MCCSuspiciousStewEffects;
import de.verdox.mccreativelab.wrapper.item.components.MCCResolvableProfile;
import net.minecraft.network.chat.Component;
import de.verdox.mccreativelab.wrapper.item.components.MCCItemAttributeModifiers;
import de.verdox.mccreativelab.wrapper.types.MCCInstrument;
import de.verdox.mccreativelab.wrapper.item.components.MCCItemLore;
import de.verdox.mccreativelab.wrapper.item.components.MCCPotionContents;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSResolvableProfile;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSArmorTrim;
import de.verdox.mccreativelab.wrapper.item.components.MCCMapPostProcessing;
import java.lang.Class;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSTool;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSMapItemColor;
import net.minecraft.world.item.component.BlockItemStateProperties;

public class DataComponentTypeConverter implements MCCConverter<DataComponentType, NMSDataComponentType>  {

	public MCCConverter.ConversionResult<NMSDataComponentType> wrap(DataComponentType nativeType){
		if(nativeType.equals(DataComponents.MAX_STACK_SIZE)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<Integer>(){}, new TypeToken<Integer>(){}, null));
		}
		if(nativeType.equals(DataComponents.MAX_DAMAGE)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<Integer>(){}, new TypeToken<Integer>(){}, null));
		}
		if(nativeType.equals(DataComponents.DAMAGE)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<Integer>(){}, new TypeToken<Integer>(){}, null));
		}
		if(nativeType.equals(DataComponents.UNBREAKABLE)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<Unbreakable>(){}, new TypeToken<MCCUnbreakable>(){}, () -> new NMSUnbreakable(null)));
		}
		if(nativeType.equals(DataComponents.CUSTOM_NAME)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<Component>(){}, new TypeToken<net.kyori.adventure.text.Component>(){}, null));
		}
		if(nativeType.equals(DataComponents.ITEM_NAME)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<Component>(){}, new TypeToken<net.kyori.adventure.text.Component>(){}, null));
		}
		if(nativeType.equals(DataComponents.LORE)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<ItemLore>(){}, new TypeToken<MCCItemLore>(){}, () -> new NMSItemLore(null)));
		}
		if(nativeType.equals(DataComponents.RARITY)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<Rarity>(){}, new TypeToken<MCCRarity>(){}, null));
		}
		if(nativeType.equals(DataComponents.ATTRIBUTE_MODIFIERS)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<ItemAttributeModifiers>(){}, new TypeToken<MCCItemAttributeModifiers>(){}, () -> new NMSItemAttributeModifiers(null)));
		}
		if(nativeType.equals(DataComponents.CUSTOM_MODEL_DATA)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<CustomModelData>(){}, new TypeToken<MCCCustomModelData>(){}, () -> new NMSCustomModelData(null)));
		}
		if(nativeType.equals(DataComponents.REPAIR_COST)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<Integer>(){}, new TypeToken<Integer>(){}, null));
		}
		if(nativeType.equals(DataComponents.ENCHANTMENT_GLINT_OVERRIDE)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<Boolean>(){}, new TypeToken<Boolean>(){}, null));
		}
		if(nativeType.equals(DataComponents.FOOD)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<FoodProperties>(){}, new TypeToken<MCCFoodProperties>(){}, () -> new NMSFoodProperties(null)));
		}
		if(nativeType.equals(DataComponents.TOOL)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<Tool>(){}, new TypeToken<MCCTool>(){}, () -> new NMSTool(null)));
		}
		if(nativeType.equals(DataComponents.DYED_COLOR)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<DyedItemColor>(){}, new TypeToken<MCCDyedItemColor>(){}, () -> new NMSDyedItemColor(null)));
		}
		if(nativeType.equals(DataComponents.MAP_COLOR)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<MapItemColor>(){}, new TypeToken<MCCMapItemColor>(){}, () -> new NMSMapItemColor(null)));
		}
		if(nativeType.equals(DataComponents.MAP_ID)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<MapId>(){}, new TypeToken<MCCMapId>(){}, () -> new NMSMapId(null)));
		}
		if(nativeType.equals(DataComponents.MAP_DECORATIONS)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<MapDecorations>(){}, new TypeToken<MCCMapDecorations>(){}, () -> new NMSMapDecorations(null)));
		}
		if(nativeType.equals(DataComponents.MAP_POST_PROCESSING)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<MapPostProcessing>(){}, new TypeToken<MCCMapPostProcessing>(){}, null));
		}
		if(nativeType.equals(DataComponents.POTION_CONTENTS)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<PotionContents>(){}, new TypeToken<MCCPotionContents>(){}, () -> new NMSPotionContents(null)));
		}
		if(nativeType.equals(DataComponents.SUSPICIOUS_STEW_EFFECTS)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<SuspiciousStewEffects>(){}, new TypeToken<MCCSuspiciousStewEffects>(){}, () -> new NMSSuspiciousStewEffects(null)));
		}
		if(nativeType.equals(DataComponents.TRIM)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<ArmorTrim>(){}, new TypeToken<MCCArmorTrim>(){}, () -> new NMSArmorTrim(null)));
		}
		if(nativeType.equals(DataComponents.INSTRUMENT)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<Holder<Instrument>>(){}, new TypeToken<MCCReference<MCCInstrument>>(){}, null));
		}
		if(nativeType.equals(DataComponents.OMINOUS_BOTTLE_AMPLIFIER)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<Integer>(){}, new TypeToken<Integer>(){}, null));
		}
		if(nativeType.equals(DataComponents.JUKEBOX_PLAYABLE)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<JukeboxPlayable>(){}, new TypeToken<MCCJukeboxPlayable>(){}, () -> new NMSJukeboxPlayable(null)));
		}
		if(nativeType.equals(DataComponents.RECIPES)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<List<ResourceLocation>>(){}, new TypeToken<List<Key>>(){}, null));
		}
		if(nativeType.equals(DataComponents.LODESTONE_TRACKER)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<LodestoneTracker>(){}, new TypeToken<MCCLodestoneTracker>(){}, () -> new NMSLodestoneTracker(null)));
		}
		if(nativeType.equals(DataComponents.FIREWORK_EXPLOSION)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<FireworkExplosion>(){}, new TypeToken<MCCFireworkExplosion>(){}, () -> new NMSFireworkExplosion(null)));
		}
		if(nativeType.equals(DataComponents.PROFILE)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<ResolvableProfile>(){}, new TypeToken<MCCResolvableProfile>(){}, () -> new NMSResolvableProfile(null)));
		}
		if(nativeType.equals(DataComponents.NOTE_BLOCK_SOUND)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<ResourceLocation>(){}, new TypeToken<Key>(){}, null));
		}
		if(nativeType.equals(DataComponents.BASE_COLOR)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<DyeColor>(){}, new TypeToken<org.bukkit.DyeColor>(){}, null));
		}
		if(nativeType.equals(DataComponents.BLOCK_STATE)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<BlockItemStateProperties>(){}, new TypeToken<MCCBlockItemStateProperties>(){}, () -> new NMSBlockItemStateProperties(null)));
		}
		if(nativeType.equals(DataComponents.LOCK)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<LockCode>(){}, new TypeToken<MCCLockCode>(){}, () -> new NMSLockCode(null)));
		}
		if(nativeType.equals(DataComponents.CONTAINER_LOOT)) {
			return done(new NMSDataComponentType<>(nativeType, new TypeToken<SeededContainerLoot>(){}, new TypeToken<MCCSeededContainerLoot>(){}, () -> new NMSSeededContainerLoot(null)));
		}
		return notDone(null);
	}

	public MCCConverter.ConversionResult<DataComponentType> unwrap(NMSDataComponentType platformImplType){
		return done((DataComponentType) platformImplType.getHandle());
	}

	public Class<NMSDataComponentType> apiImplementationClass(){
		return NMSDataComponentType.class;
	}

	public Class<DataComponentType> nativeMinecraftType(){
		return DataComponentType.class;
	}

}
