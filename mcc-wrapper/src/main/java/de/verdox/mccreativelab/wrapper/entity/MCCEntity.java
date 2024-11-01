package de.verdox.mccreativelab.wrapper.entity;

import de.verdox.mccreativelab.wrapper.MCCWrapped;
import de.verdox.mccreativelab.wrapper.block.MCCBlockData;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Entity;
import org.jetbrains.annotations.NotNull;

public interface MCCEntity extends MCCWrapped {
    @NotNull MCCEntityType getType();
}
