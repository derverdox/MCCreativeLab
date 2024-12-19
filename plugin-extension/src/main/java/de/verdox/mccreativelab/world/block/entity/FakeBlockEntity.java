package de.verdox.mccreativelab.world.block.entity;

import de.verdox.mccreativelab.serialization.Serializers;
import de.verdox.mccreativelab.util.nbt.NBTContainer;
import de.verdox.mccreativelab.util.nbt.NBTPersistent;
import de.verdox.vserializer.generic.SerializationContainer;
import de.verdox.vserializer.generic.SerializationContext;
import de.verdox.vserializer.generic.SerializationElement;
import de.verdox.vserializer.generic.Serializer;
import org.bukkit.Keyed;
import org.bukkit.Location;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Marker;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

public abstract class FakeBlockEntity implements NBTPersistent, Keyed {
    private NamespacedKey namespacedKey;
    private Marker markerEntity;
    private Location location;
    private FakeBlockEntityType<?> fakeBlockEntityType;

    public void changePosition(Location location) {
        this.location = location.getBlock().getLocation().clone();
    }

    public void onRemove() {
    }

    void setMarkerEntity(@NotNull Marker markerEntity) {
        Objects.requireNonNull(markerEntity);
        this.markerEntity = markerEntity;
        this.location = markerEntity.getLocation().clone();
    }

    void setFakeBlockEntityType(FakeBlockEntityType<?> fakeBlockEntityType) {
        this.fakeBlockEntityType = fakeBlockEntityType;
    }

    void setNamespacedKey(NamespacedKey namespacedKey) {
        this.namespacedKey = namespacedKey;
    }

    public Location getLocation() {
        return location;
    }

    public FakeBlockEntityType<?> getFakeBlockEntityType() {
        return fakeBlockEntityType;
    }

    @NotNull
    public Marker getMarkerEntity() {
        return markerEntity;
    }

    void doTick() {
        tick();
        if (!markerEntity.getLocation().equals(location))
            markerEntity.teleport(location);
    }

    protected void tick() {

    }

    protected void saveNBT(SerializationContainer storage, SerializationContext serializationContext) {
    }

    protected void loadNBT(SerializationContainer storage, SerializationContext serializationContext) {
    }

    public void onUnload() {

    }

    /**
     * Returns the inventory of the fake block entity. If the method returns null the entity does not have any inventory.
     *
     * @return The entity inventory if it exists
     */
    @Nullable
    public abstract Inventory getContainerOfEntity();

    @Override
    public final @NotNull NamespacedKey getKey() {
        return namespacedKey;
    }

    boolean serializeInventory = false;

    @Override
    public void save(SerializationContainer storage, SerializationContext serializationContext) {
        storage.set("id", fakeBlockEntityType.getKey().asString());
        if (getContainerOfEntity() != null) {
            ItemStack[] items = getContainerOfEntity().getStorageContents();
            SerializationElement serializedItems = Serializer.Array.create(Serializers.ItemStackSerializer.INSTANCE, ItemStack[]::new).serialize(serializationContext, items);
            storage.set("inventory", serializedItems);
        }
    }

    public void saveNBTDataWithInventory(SerializationContainer storage, SerializationContext serializationContext) {
        saveNBT(storage, serializationContext);
        storage.set("id", fakeBlockEntityType.getKey().asString());
        if (getContainerOfEntity() != null) {
            ItemStack[] items = getContainerOfEntity().getStorageContents();
            SerializationElement serializedItems = Serializer.Array.create(Serializers.ItemStackSerializer.INSTANCE, ItemStack[]::new).serialize(serializationContext, items);
            storage.set("inventory", serializedItems);
        }
    }

    @Override
    public void load(SerializationContainer storage, SerializationContext serializationContext) {
        loadNBT(storage, serializationContext);
        if (getContainerOfEntity() != null && storage.contains("inventory")) {
            ItemStack[] items = Serializer.Array.create(Serializers.ItemStackSerializer.INSTANCE, ItemStack[]::new).deserialize(storage.get("inventory"));
            getContainerOfEntity().setStorageContents(items);
        }
    }

    public final FakeBlockEntityType<?> getType() {
        return fakeBlockEntityType;
    }
}
