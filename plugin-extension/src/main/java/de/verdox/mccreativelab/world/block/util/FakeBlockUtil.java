package de.verdox.mccreativelab.world.block.util;

import de.verdox.mccreativelab.world.block.FakeBlock;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;

import javax.annotation.Nullable;

public class FakeBlockUtil {
    public static void simulateBlockBreakWithParticlesAndSound(@Nullable FakeBlock.FakeBlockState fakeBlockState, Block block) {
        BlockData destroyParticleBlockData = block.getBlockData();

        if(fakeBlockState != null && fakeBlockState.getFakeBlockDisplay().getDestroyParticleData() != null)
            destroyParticleBlockData = fakeBlockState.getFakeBlockDisplay().getDestroyParticleData();


        //if(fakeBlockState != null && fakeBlockState.getFakeBlockSoundGroup() != null || FakeBlockSoundManager.isBlockWithoutStandardSound(block))
            //FakeBlockSoundManager.simulateBreakSound(block, fakeBlockState);

        block.getWorld().playEffect(block.getLocation(), Effect.STEP_SOUND, destroyParticleBlockData);
        //block.getWorld().spawnParticle(Particle.BLOCK_CRACK, block.getLocation().clone().add(0.5, 0.5, 0.5), 40, 0.1, 0.1, 0.1, destroyParticleBlockData);
    }
}
