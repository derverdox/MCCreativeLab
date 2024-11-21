package de.verdox.mccreativelab.impl.vanilla.wrapper.item.components;

import java.lang.Float;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import net.minecraft.core.HolderSet;
import java.util.Set;
import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.item.components.MCCTool;
import java.util.ArrayList;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import java.util.HashSet;
import net.minecraft.world.item.component.Tool;
import java.util.List;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;
import java.util.Optional;
import java.lang.Boolean;
import de.verdox.mccreativelab.wrapper.registry.MCCReferenceSet;
import net.minecraft.world.level.block.Block;
import de.verdox.mccreativelab.impl.vanilla.wrapper.item.components.NMSTool;

public class NMSTool extends NMSHandle<Tool> implements MCCTool  {

	public static final MCCConverter<Tool, NMSTool> CONVERTER  = converter(NMSTool.class, Tool.class, NMSTool::new, NMSHandle::getHandle);

	public NMSTool (Tool handle){
		super(handle);
	}

	public MCCTool.MCCRule createMCCRule(){
		return new NMSRule(null);
	}

	public List<MCCTool.MCCRule> getRules(){
		var nms = getRulesFromImpl();
		return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<List<MCCTool.MCCRule>>() {});
	}

	private List<Tool.Rule> getRulesFromImpl(){
		return handle == null ? List.of() : handle.rules();
	}

	public MCCTool withRules(List<MCCTool.MCCRule> rules){
		var param0 = MCCPlatform.getInstance().getConversionService().unwrap(rules, new TypeToken<List<Tool.Rule>>() {});
		var param1 = getDefaultMiningSpeedFromImpl();
		var param2 = getDamagePerBlockFromImpl();
		return new NMSTool(new Tool(param0, param1, param2));
	}

	public float getDefaultMiningSpeed(){
		var nms = getDefaultMiningSpeedFromImpl();
		return nms;
	}

	private float getDefaultMiningSpeedFromImpl(){
		return handle == null ? 0 : handle.defaultMiningSpeed();
	}

	public MCCTool withDefaultMiningSpeed(float defaultMiningSpeed){
		var param0 = getRulesFromImpl();
		var param1 = defaultMiningSpeed;
		var param2 = getDamagePerBlockFromImpl();
		return new NMSTool(new Tool(param0, param1, param2));
	}

	public int getDamagePerBlock(){
		var nms = getDamagePerBlockFromImpl();
		return nms;
	}

	private int getDamagePerBlockFromImpl(){
		return handle == null ? 0 : handle.damagePerBlock();
	}

	public MCCTool withDamagePerBlock(int damagePerBlock){
		var param0 = getRulesFromImpl();
		var param1 = getDefaultMiningSpeedFromImpl();
		var param2 = damagePerBlock;
		return new NMSTool(new Tool(param0, param1, param2));
	}


	public static class NMSRule extends NMSHandle<Tool.Rule> implements MCCTool.MCCRule  {
	
		public static final MCCConverter<Tool.Rule, NMSTool.NMSRule> CONVERTER  = converter(NMSTool.NMSRule.class, Tool.Rule.class, NMSTool.NMSRule::new, NMSHandle::getHandle);

		public NMSRule (Tool.Rule handle){
			super(handle);
		}
	
		public MCCReferenceSet<MCCBlockType> getBlocks(){
			var nms = getBlocksFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<MCCReferenceSet<MCCBlockType>>() {});
		}
	
		private HolderSet<Block> getBlocksFromImpl(){
			return handle == null ? null : handle.blocks();
		}
	
		public MCCTool.MCCRule withBlocks(MCCReferenceSet<MCCBlockType> blocks){
			var param0 = MCCPlatform.getInstance().getConversionService().unwrap(blocks, new TypeToken<HolderSet<Block>>() {});
			var param1 = getSpeedFromImpl();
			var param2 = getCorrectForDropsFromImpl();
			return new NMSTool.NMSRule(new Tool.Rule(param0, param1, param2));
		}
	
		public Optional<Float> getSpeed(){
			var nms = getSpeedFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Optional<Float>>() {});
		}
	
		private Optional<Float> getSpeedFromImpl(){
			return handle == null ? null : handle.speed();
		}
	
		public MCCTool.MCCRule withSpeed(Optional<Float> speed){
			var param0 = getBlocksFromImpl();
			var param1 = MCCPlatform.getInstance().getConversionService().unwrap(speed, new TypeToken<Optional<Float>>() {});
			var param2 = getCorrectForDropsFromImpl();
			return new NMSTool.NMSRule(new Tool.Rule(param0, param1, param2));
		}
	
		public Optional<Boolean> getCorrectForDrops(){
			var nms = getCorrectForDropsFromImpl();
			return MCCPlatform.getInstance().getConversionService().wrap(nms, new TypeToken<Optional<Boolean>>() {});
		}
	
		private Optional<Boolean> getCorrectForDropsFromImpl(){
			return handle == null ? null : handle.correctForDrops();
		}
	
		public MCCTool.MCCRule withCorrectForDrops(Optional<Boolean> correctForDrops){
			var param0 = getBlocksFromImpl();
			var param1 = getSpeedFromImpl();
			var param2 = MCCPlatform.getInstance().getConversionService().unwrap(correctForDrops, new TypeToken<Optional<Boolean>>() {});
			return new NMSTool.NMSRule(new Tool.Rule(param0, param1, param2));
		}
	
	}
}
