package de.verdox.mccreativelab.world.block.entity;

import de.verdox.mccreativelab.behaviour.BehaviourResult;
import de.verdox.mccreativelab.behaviour.entity.EntityBehaviour;
import de.verdox.mccreativelab.util.nbt.NBTContainer;
import de.verdox.vcore.paper.serializer.PDCSerializationContext;
import de.verdox.vserializer.generic.SerializationContainer;
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
        SerializationContainer container = PDCSerializationContext.INSTANCE.deserializeFromPDC(persistentDataContainer).getAsContainer();
        fakeBlockEntity.saveNBTDataWithInventory(container, PDCSerializationContext.INSTANCE);
        PDCSerializationContext.INSTANCE.serializeToPDC(container, persistentDataContainer);
        return EntityBehaviour.super.addAdditionalSaveData(entity, persistentDataContainer);
    }

    @Override
    public BehaviourResult.@NotNull Callback readAdditionalSaveData(@NotNull Marker entity, @NotNull PersistentDataContainer persistentDataContainer) {
        fakeBlockEntity.load(PDCSerializationContext.INSTANCE.deserializeFromPDC(persistentDataContainer).getAsContainer(), PDCSerializationContext.INSTANCE);
        return EntityBehaviour.super.readAdditionalSaveData(entity, persistentDataContainer);
    }
}
