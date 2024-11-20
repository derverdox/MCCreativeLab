package de.verdox.mccreativelab.wrapper.inventory.types;

import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuTypes;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import org.bukkit.block.banner.PatternType;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface MCCLoomContainer extends MCCContainer<MCCBlockContainerSource> {

    /**
     * Gets a list of all selectable to the player.
     *
     * @return A copy of the {@link PatternType}'s currently selectable by the
     * player
     */
    @NotNull
    //TODO MCC Wrapper for Banner Patterns!
    List<PatternType> getSelectablePatterns();

    /**
     * Gets an index of the selected pattern.
     *
     * @return Index of the selected pattern
     */
    int getSelectedPatternIndex();

    @Override
    default MCCMenuType getType() {
        return MCCMenuTypes.LOOM;
    }

    @Override
    default boolean canBeOpened() {
        return true;
    }
}
