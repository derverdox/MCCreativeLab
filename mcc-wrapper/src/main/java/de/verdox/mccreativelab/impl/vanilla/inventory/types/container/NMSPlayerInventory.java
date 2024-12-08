package de.verdox.mccreativelab.impl.vanilla.inventory.types.container;

import com.google.common.base.Preconditions;
import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainer;
import de.verdox.mccreativelab.wrapper.entity.MCCEquipmentSlotGroup;
import de.verdox.mccreativelab.wrapper.inventory.types.container.MCCPlayerInventory;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.minecraft.network.protocol.game.ClientboundSetCarriedItemPacket;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.item.ItemStack;
import org.checkerframework.common.value.qual.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NMSPlayerInventory extends NMSContainer implements MCCPlayerInventory {
    public static final MCCConverter<Inventory, NMSPlayerInventory> CONVERTER = converter(NMSPlayerInventory.class, Inventory.class, NMSPlayerInventory::new, o -> (Inventory) o.getHandle());

    public NMSPlayerInventory(Inventory playerInventory) {
        super(playerInventory);
    }

    @Override
    public @NotNull MCCItemStack @NotNull [] getArmorContents() {
        MCCItemStack[] armorContents = new MCCItemStack[((Inventory) handle).armor.size()];
        for (ItemStack itemStack : ((Inventory) handle).armor) {
            armorContents = MCCPlatform.getInstance().getConversionService().wrap(itemStack, new TypeToken<MCCItemStack[]>() {});
        }
        return armorContents;
    }

    @Override
    public void setItem(@NotNull MCCEquipmentSlotGroup slot, @Nullable MCCItemStack item) {
        switch (slot) {
            case HEAD -> setItem(getSize() - 2, item);
            case CHEST -> setItem(getSize() - 3, item);
            case LEGS -> setItem(getSize() - 4, item);
            case FEET -> setItem(getSize() - 5, item);
            case MAINHAND -> setItem(this.getHeldItemSlot(), item);
            case OFFHAND ->
                this.setSlots(new MCCItemStack[]{item}, ((Inventory) handle).items.size() + ((Inventory) handle).armor.size(), ((Inventory) handle).offhand.size());
            case ANY -> {
                if (item != null) {
                    addItem(item);
                }
            }
        }
    }

    @Override
    public @NotNull MCCItemStack getItem(@NotNull MCCEquipmentSlotGroup slot) {
        return switch (slot) {
            case HEAD -> getItem(getSize() - 2);
            case CHEST, ARMOR, BODY -> getItem(getSize() - 3);
            case LEGS -> getItem(getSize() - 4);
            case FEET -> getItem(getSize() - 5);
            case MAINHAND, HAND -> getItem(this.getHeldItemSlot());
            case OFFHAND ->
                MCCPlatform.getInstance().getConversionService().wrap((((Inventory) handle).offhand.get(0)), new TypeToken<>() {});
            case ANY -> getItemInMainHand();
        };
    }

    @Override
    public void setArmorContents(@Nullable MCCItemStack[] items) {
        this.setSlots(items, ((Inventory) handle).items.size(), ((Inventory) handle).armor.size());
    }

    @Override
    public int getHeldItemSlot() {
        return ((Inventory) handle).selected;
    }

    @Override
    public void setHeldItemSlot(@IntRange(from = 0, to = 8) int slot) {
        Preconditions.checkArgument(slot >= 0 && slot < Inventory.getSelectionSize(), "Slot (%s) is not between 0 and %s inclusive", slot, Inventory.getSelectionSize() - 1);
        ((Inventory) handle).selected = slot;
        ((ServerPlayer) ((Inventory) handle).player).connection.send(new ClientboundSetCarriedItemPacket(slot));
    }

    @Override
    public void sendFakeContents(MCCItemStack[] contents) {

    }

    private void setSlots(MCCItemStack[] items, int baseSlot, int length) {
        if (items == null) {
            items = new MCCItemStack[length];
        }
        Preconditions.checkArgument(items.length <= length, "items.length must be <= %s", length);

        for (int i = 0; i < length; i++) {
            if (i >= items.length) {
                this.setItem(baseSlot + i, null);
            } else {
                this.setItem(baseSlot + i, items[i]);
            }
        }
    }
}
