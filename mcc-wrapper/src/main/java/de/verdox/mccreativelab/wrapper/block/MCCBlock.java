package de.verdox.mccreativelab.wrapper.block;

import de.verdox.mccreativelab.wrapper.MCCLocation;
import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.entity.MCCEntity;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;

public interface MCCBlock extends MCCWrapped {
    @NotNull MCCLocation getLocation();

    @NotNull MCCBlockData getBlockData();

    @NotNull MCCBlockType getBlockType();

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

    default void breakBlockNaturally(boolean triggerEffect, boolean dropLoot, boolean dropExperience) {
        breakBlockNaturally(null, triggerEffect, dropLoot, dropExperience, true);
    }
}
