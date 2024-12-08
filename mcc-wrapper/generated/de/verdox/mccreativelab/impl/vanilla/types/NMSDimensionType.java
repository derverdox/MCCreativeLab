package de.verdox.mccreativelab.impl.vanilla.types;

import net.minecraft.resources.ResourceLocation;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.registry.MCCTag;
import java.util.Set;
import net.minecraft.world.level.dimension.DimensionType;
import com.google.common.reflect.TypeToken;
import net.minecraft.tags.TagKey;
import java.util.OptionalLong;
import java.util.List;
import net.minecraft.util.valueproviders.IntProvider;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import net.minecraft.world.level.block.Block;
import de.verdox.mccreativelab.wrapper.types.MCCDimensionType;
import de.verdox.mccreativelab.impl.vanilla.types.NMSDimensionType;
import net.kyori.adventure.key.Key;

public class NMSDimensionType extends MCCHandle<DimensionType> implements MCCDimensionType  {

	public static final MCCConverter<DimensionType, NMSDimensionType> CONVERTER  = converter(NMSDimensionType.class, DimensionType.class, NMSDimensionType::new, MCCHandle::getHandle);

	public NMSDimensionType(DimensionType handle){
		super(handle);
	}

	public OptionalLong getFixedTime(){
		var nms = getFixedTimeFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<OptionalLong>() {});
	}

	private OptionalLong getFixedTimeFromImpl(){
		return handle == null ? null : handle.fixedTime();
	}

	public boolean getHasSkyLight(){
		var nms = getHasSkyLightFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Boolean>() {});
	}

	private boolean getHasSkyLightFromImpl(){
		return handle == null ? false : handle.hasSkyLight();
	}

	public boolean getHasCeiling(){
		var nms = getHasCeilingFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Boolean>() {});
	}

	private boolean getHasCeilingFromImpl(){
		return handle == null ? false : handle.hasCeiling();
	}

	public boolean getUltraWarm(){
		var nms = getUltraWarmFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Boolean>() {});
	}

	private boolean getUltraWarmFromImpl(){
		return handle == null ? false : handle.ultraWarm();
	}

	public boolean getNatural(){
		var nms = getNaturalFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Boolean>() {});
	}

	private boolean getNaturalFromImpl(){
		return handle == null ? false : handle.natural();
	}

	public double getCoordinateScale(){
		var nms = getCoordinateScaleFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Double>() {});
	}

	private double getCoordinateScaleFromImpl(){
		return handle == null ? 0 : handle.coordinateScale();
	}

	public boolean getBedWorks(){
		var nms = getBedWorksFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Boolean>() {});
	}

	private boolean getBedWorksFromImpl(){
		return handle == null ? false : handle.bedWorks();
	}

	public boolean getRespawnAnchorWorks(){
		var nms = getRespawnAnchorWorksFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Boolean>() {});
	}

	private boolean getRespawnAnchorWorksFromImpl(){
		return handle == null ? false : handle.respawnAnchorWorks();
	}

	public int getMinY(){
		var nms = getMinYFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Integer>() {});
	}

	private int getMinYFromImpl(){
		return handle == null ? 0 : handle.minY();
	}

	public int getHeight(){
		var nms = getHeightFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Integer>() {});
	}

	private int getHeightFromImpl(){
		return handle == null ? 0 : handle.height();
	}

	public int getLogicalHeight(){
		var nms = getLogicalHeightFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Integer>() {});
	}

	private int getLogicalHeightFromImpl(){
		return handle == null ? 0 : handle.logicalHeight();
	}

	public MCCTag<MCCBlockType> getInfiniburn(){
		var nms = getInfiniburnFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCTag<MCCBlockType>>() {});
	}

	private TagKey<Block> getInfiniburnFromImpl(){
		return handle == null ? null : handle.infiniburn();
	}

	public Key getEffectsLocation(){
		var nms = getEffectsLocationFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Key>() {});
	}

	private ResourceLocation getEffectsLocationFromImpl(){
		return handle == null ? null : handle.effectsLocation();
	}

	public float getAmbientLight(){
		var nms = getAmbientLightFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Float>() {});
	}

	private float getAmbientLightFromImpl(){
		return handle == null ? 0 : handle.ambientLight();
	}

	public MCCDimensionType.MonsterSettings getMonsterSettings(){
		var nms = getMonsterSettingsFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCDimensionType.MonsterSettings>() {});
	}

	private DimensionType.MonsterSettings getMonsterSettingsFromImpl(){
		return handle == null ? null : handle.monsterSettings();
	}


	public static class NMSMonsterSettings extends MCCHandle<DimensionType.MonsterSettings> implements MCCDimensionType.MonsterSettings  {
	
		public static final MCCConverter<DimensionType.MonsterSettings, NMSDimensionType.NMSMonsterSettings> CONVERTER  = converter(NMSDimensionType.NMSMonsterSettings.class, DimensionType.MonsterSettings.class, NMSDimensionType.NMSMonsterSettings::new, MCCHandle::getHandle);

		public NMSMonsterSettings(DimensionType.MonsterSettings handle){
			super(handle);
		}
	
		public boolean getPiglinSafe(){
			var nms = getPiglinSafeFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Boolean>() {});
		}
	
		private boolean getPiglinSafeFromImpl(){
			return handle == null ? false : handle.piglinSafe();
		}
	
		public boolean getHasRaids(){
			var nms = getHasRaidsFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Boolean>() {});
		}
	
		private boolean getHasRaidsFromImpl(){
			return handle == null ? false : handle.hasRaids();
		}
	
		public IntProvider getMonsterSpawnLightTest(){
			var nms = getMonsterSpawnLightTestFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<IntProvider>() {});
		}
	
		private IntProvider getMonsterSpawnLightTestFromImpl(){
			return handle == null ? null : handle.monsterSpawnLightTest();
		}
	
		public int getMonsterSpawnBlockLightLimit(){
			var nms = getMonsterSpawnBlockLightLimitFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Integer>() {});
		}
	
		private int getMonsterSpawnBlockLightLimitFromImpl(){
			return handle == null ? 0 : handle.monsterSpawnBlockLightLimit();
		}
	
	}
}
