package de.verdox.mccreativelab.world.block;

import de.verdox.mccreativelab.MCCreativeLabExtension;
import de.verdox.mccreativelab.Wrappers;
import de.verdox.mccreativelab.util.EntityMetadataPredicate;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.SoundGroup;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.event.Listener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class FakeBlockSoundManager implements Listener {
    public static final EntityMetadataPredicate.TickDelay DIGGING_SOUND_DELAY = new EntityMetadataPredicate.TickDelay("DiggingSoundDelay", 4);
    public static final EntityMetadataPredicate.DistanceTravelled STEP_DISTANCE_SOUND_DELAY = new EntityMetadataPredicate.DistanceTravelled("StepSoundDelay", 2.2);
    public static final @NotNull SoundGroup DEFAULT_SOUND_GROUP = Bukkit.createBlockData(Material.STONE)
                                                                        .getSoundGroup();

    /**
     * This method is used to determine whether a block has no sound due to resource pack patching.
     * Normally this returns true for glass or ice blocks since we use them to create the HitBoxes for our fake blocks.
     *
     * @return true if it has no sound
     */
    public static boolean isBlockWithoutStandardSound(Block block) {
        return isBlockWithoutStandardSound(block.getBlockData());
    }

    public static boolean isBlockWithoutStandardSound(BlockData data) {
        return MCCreativeLabExtension.getReplacedSoundGroups().wasSoundReplaced(data.getSoundGroup());
    }

    public static Wrappers.SoundGroup getSoundGroup(@NotNull Block block, @Nullable FakeBlock.FakeBlockState fakeBlockState) {
        return getSoundGroup(block.getBlockData(), fakeBlockState);
    }

    public static Wrappers.SoundGroup getSoundGroup(@NotNull BlockData blockData, @Nullable FakeBlock.FakeBlockState fakeBlockState) {
        if(fakeBlockState == null)
            return MCCreativeLabExtension.getReplacedSoundGroups().getSoundGroup(blockData);

        if(fakeBlockState.getFakeBlockSoundGroup() != null)
            return fakeBlockState.getFakeBlockSoundGroup().asSoundGroup();

        BlockData blockDataToGetSoundFrom = fakeBlockState.getVanillaBlockSound() != null ? fakeBlockState.getVanillaBlockSound() : blockData;
        return MCCreativeLabExtension.getReplacedSoundGroups().getSoundGroup(blockDataToGetSoundFrom);
    }
}
