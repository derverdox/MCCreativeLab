package de.verdox.mccreativelab.world.item.template;

import de.verdox.mccreativelab.behaviour.BehaviourResult;
import de.verdox.mccreativelab.impl.paper.platform.converter.BukkitAdapter;
import de.verdox.mccreativelab.world.item.FakeItem;
import de.verdox.mccreativelab.wrapper.annotations.MCCRequireVanillaElement;
import de.verdox.mccreativelab.wrapper.block.MCCBlockState;
import org.bukkit.Location;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class FakeBlockItem extends FakeItem {
    private final MCCBlockState blockData;

    public FakeBlockItem(@MCCRequireVanillaElement MCCBlockState blockData) {
        this.blockData = blockData;
    }

    @Override
    public BehaviourResult.@NotNull Object<BlockData> placeBlockAction(@NotNull ItemStack stack, @NotNull Player player, @NotNull Location clickedPosition, @NotNull BlockData vanillaBlockData) {
        return result(BukkitAdapter.unwrap(blockData));
    }
}
