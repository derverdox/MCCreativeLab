package de.verdox.mccreativelab.debug.entity;

import de.verdox.mccreativelab.ai.behavior.PaperCustomAIBehavior;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Villager;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class TestVillagerBehaviorCustom extends PaperCustomAIBehavior<Villager> {
    public TestVillagerBehaviorCustom() {
        super(Villager.class, Map.of());
    }

    @Override
    public void start(@NotNull World world, @NotNull Villager entity, long time) {
        Bukkit.getLogger().info("Starting TestBehaviour");
    }

    @Override
    public void tick(@NotNull World world, @NotNull Villager entity, long time) {

    }

    @Override
    public void stop(@NotNull World world, @NotNull Villager entity, long time) {
        Bukkit.getLogger().info("Stopping TestBehaviour");
    }

    @Override
    public boolean canStillUse(@NotNull World world, @NotNull Villager entity, long time) {
        return true;
    }

    @Override
    public boolean checkExtraStartConditions(@NotNull World world, @NotNull Villager entity, long time) {
        return true;
    }
}
