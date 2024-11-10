package de.verdox.mccreativelab.wrapper.block;

import de.verdox.mccreativelab.wrapper.platform.TempDataHolder;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import de.verdox.mccreativelab.wrapper.MCCKeyedWrapper;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;

/**
 * Describes an actual block in a minecraft world with a location and a type
 */
public interface MCCBlock extends MCCKeyedWrapper, TempDataHolder {
    /**
     * Returns the location of this block
     * @return
     */
    @NotNull MCCLocation getLocation();

    /**
     * Returns the block data of this block.
     * @return the block data
     */
    @NotNull MCCBlockState getBlockData();

    /**
     * Returns the block type of this block
     * @return the block type
     */
    @NotNull MCCBlockType getBlockType();

    /**
     * Returns all drops of this block as if it was broken by an entity.
     * @param tool the tool used to break the block
     * @param entity the entity breaking the block
     * @return the drops of this block as items
     */
    @NotNull Collection<MCCItemStack> getDrops(@Nullable MCCItemStack tool, @Nullable MCCEntity entity);

    /**
     * Naturally breaks this block as if a player had broken it.
     *
     * @param tool           the tool used
     * @param triggerEffect  whether to trigger a block break effect
     * @param dropExperience whether to drop Experience
     * @param ignoreTool     whether to ignore the tool
     */
    void breakBlockNaturally(@Nullable MCCItemStack tool, boolean triggerEffect, boolean dropLoot, boolean dropExperience, boolean ignoreTool);

    /**
     * Naturally breaks this block as if a player had broken it.
     *
     * @param triggerEffect  whether to trigger a block break effect
     * @param dropExperience whether to drop Experience
     */
    default void breakBlockNaturally(boolean triggerEffect, boolean dropLoot, boolean dropExperience) {
        breakBlockNaturally(null, triggerEffect, dropLoot, dropExperience, true);
    }
}
