package de.verdox.mccreativelab.world.block.entity;

import de.verdox.mccreativelab.behaviour.BehaviourResult;
import de.verdox.mccreativelab.behaviour.entity.EntityBehaviour;
import de.verdox.mccreativelab.util.nbt.NBTContainer;
import org.bukkit.entity.Marker;
import org.bukkit.persistence.PersistentDataContainer;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class FakeBlockEntityBehaviour implements EntityBehaviour<Marker> {
    private final FakeBlockEntity fakeBlockEntity;

    public FakeBlockEntityBehaviour(@NotNull FakeBlockEntity fakeBlockEntity) {
        Objects.requireNonNull(fakeBlockEntity);
        this.fakeBlockEntity = fakeBlockEntity;
    }

    @Override
    public BehaviourResult.@NotNull Callback onTick(@NotNull Marker entity) {
        fakeBlockEntity.doTick();
        return done();
    }

    @Override
    public BehaviourResult.@NotNull Callback addAdditionalSaveData(@NotNull Marker entity, @NotNull PersistentDataContainer persistentDataContainer) {
        fakeBlockEntity.saveNBTDataWithInventory(NBTContainer.of("nbt", persistentDataContainer));
        return EntityBehaviour.super.addAdditionalSaveData(entity, persistentDataContainer);
    }

    @Override
    public BehaviourResult.@NotNull Callback readAdditionalSaveData(@NotNull Marker entity, @NotNull PersistentDataContainer persistentDataContainer) {
        fakeBlockEntity.loadNBTData(NBTContainer.of("nbt", persistentDataContainer));
        return EntityBehaviour.super.readAdditionalSaveData(entity, persistentDataContainer);
    }
}
