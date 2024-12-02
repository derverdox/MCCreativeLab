package de.verdox.mccreativelab.world.block;

import de.verdox.mccreativelab.behaviour.BlockBehaviour;
import de.verdox.mccreativelab.world.block.behaviour.ReusedStateBehaviour;
import de.verdox.mccreativelab.world.block.display.ReusedBlockStateDisplay;
import de.verdox.mccreativelab.registry.CustomRegistry;
import de.verdox.mccreativelab.util.storage.palette.IdMap;
import org.bukkit.*;
import org.bukkit.block.data.BlockData;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FakeBlockRegistry extends CustomRegistry<FakeBlock> {
    public static final IdMap<FakeBlock.FakeBlockState> FAKE_BLOCK_STATE_ID_MAP = new IdMap<>();

    private static final Map<BlockData, FakeBlock.FakeBlockState> reusedBlockStates = new HashMap<>();

    public static void setupFakeBlocks() {
        BlockBehaviour.BLOCK_BEHAVIOUR.setBehaviour(Material.NOTE_BLOCK, new ReusedStateBehaviour(Material.NOTE_BLOCK));
    }

    public <T extends FakeBlock> T register(FakeBlock.Builder<T> fakeBlockBuilder) {
        T fakeBlock = fakeBlockBuilder.buildBlock();
        register(fakeBlockBuilder.namespacedKey, fakeBlock);
        for (FakeBlock.FakeBlockState fakeBlockState : fakeBlockBuilder.blockStates) {
            fakeBlockState.linkFakeBlock(fakeBlock);
            fakeBlockState.getProperties().makeImmutable();
            FAKE_BLOCK_STATE_ID_MAP.add(fakeBlockState);
            if (fakeBlockState.getFakeBlockDisplay() instanceof ReusedBlockStateDisplay reusedBlockStateDisplay)
                reusedBlockStates.put(reusedBlockStateDisplay.getHitBox().getBlockData(), fakeBlockState);
        }
        Bukkit.getLogger().info("Registering fake block " + fakeBlockBuilder.namespacedKey);
        return fakeBlock;
    }

    public boolean hasReusedAnyBlockStates(){
        return !reusedBlockStates.isEmpty();
    }

    @Nullable
    public static FakeBlock.FakeBlockState getFakeBlockStateFromBlockData(BlockData blockData) {
        if (reusedBlockStates.containsKey(blockData))
            return reusedBlockStates.get(blockData);
        return null;
    }

    public static Map<BlockData, FakeBlock.FakeBlockState> getReusedBlockStates() {
        return Map.copyOf(reusedBlockStates);
    }
}
