package de.verdox.mccreativelab.debug.vanilla;

import de.verdox.mccreativelab.MCCUtil;
import de.verdox.mccreativelab.behaviour.BehaviourResult;
import de.verdox.mccreativelab.random.VanillaRandomSource;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.block.data.type.Sapling;
import org.jetbrains.annotations.NotNull;

public class VanillaSaplingBlockBehaviour extends VanillaCropRandomTickBehaviour {
    public VanillaSaplingBlockBehaviour(int minLightLevel) {
        super(minLightLevel);
    }

    @Override
    public BehaviourResult.@NotNull Void randomTick(@NotNull Block block, @NotNull VanillaRandomSource vanillaRandomSource) {
        if(block.getLightLevel() >= 9 && drawRandomNumber(vanillaRandomSource) < (getAndValidateGrowth("Sapling") / (100.0f * 7))){
            var sapling = (Sapling) block.getBlockData();
            var stage = sapling.getStage();
            if(stage == 0){
                sapling.setStage(1);
                handleBlockGrowEvent(block, sapling);
            }
            else {
                MCCUtil.getInstance().growTreeIfSapling(block.getLocation());
            }
        }
        return voidResult();
    }

    @Override
    public BehaviourResult.@NotNull Bool isBlockDataRandomlyTicking(@NotNull BlockData blockData) {
        return bool(true);
    }
}
