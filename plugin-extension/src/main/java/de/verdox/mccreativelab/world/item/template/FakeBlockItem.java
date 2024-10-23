package de.verdox.mccreativelab.world.item.template;

import de.verdox.mccreativelab.behaviour.BehaviourResult;
import de.verdox.mccreativelab.world.item.FakeItem;
import org.bukkit.Location;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class FakeBlockItem extends FakeItem {
    private final BlockData blockData;

    public FakeBlockItem(BlockData blockData){
        this.blockData = blockData;
    }

    @Override
    public BehaviourResult.@NotNull Object<BlockData> placeBlockAction(@NotNull ItemStack stack, @NotNull Player player, @NotNull Location clickedPosition, @NotNull BlockData vanillaBlockData) {
        return result(blockData);
    }
}
