package de.verdox.mccreativelab.world.block;

import de.verdox.mccreativelab.behaviour.BehaviourResult;
import de.verdox.mccreativelab.behaviour.BlockBehaviour;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.BlockData;
import org.jetbrains.annotations.NotNull;

public class NoteBlockBehaviour implements BlockBehaviour {

    @Override
    public BehaviourResult.@NotNull Object<BlockData> blockUpdate(@NotNull Location location, @NotNull BlockData blockData, @NotNull BlockFace direction, @NotNull BlockData neighbourBlockData, @NotNull Location neighbourLocation) {
        return new BehaviourResult.Object<>(Bukkit.createBlockData(Material.NOTE_BLOCK), BehaviourResult.Object.Type.REPLACE_VANILLA);
    }


}
