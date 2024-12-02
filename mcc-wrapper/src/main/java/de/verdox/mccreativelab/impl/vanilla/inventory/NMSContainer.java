package de.verdox.mccreativelab.impl.vanilla.inventory;

import com.google.common.base.Preconditions;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.typed.MCCDataComponentTypes;
import net.minecraft.world.Container;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Iterator;

public class NMSContainer extends MCCHandle<Container> implements MCCContainer {
    public static final MCCConverter<Container, NMSContainer> CONVERTER = converter(NMSContainer.class, Container.class, NMSContainer::new, MCCHandle::getHandle);

    public NMSContainer(Container handle) {
        super(handle);
    }

    @Override
    public void setItem(int index, @Nullable MCCItemStack stack) {
        handle.setItem(index, conversionService.unwrap(stack));
    }

    @Override
    public MCCItemStack getItem(int index) {
        return conversionService.wrap(handle.getItem(index));
    }

    @Override
    public void removeItem(int index) {
        handle.removeItemNoUpdate(index);
    }

    @Override
    public int getSize() {
        return handle.getContainerSize();
    }

    @Override
    public @NotNull HashMap<Integer, MCCItemStack> addItem(@NotNull MCCItemStack... items) throws IllegalArgumentException {
        Preconditions.checkArgument(items != null, "items cannot be null");
        HashMap<Integer, MCCItemStack> leftover = new HashMap<>();

        /* TODO: some optimization
         *  - Create a 'firstPartial' with a 'fromIndex'
         *  - Record the lastPartial per Material
         *  - Cache firstEmpty result
         */

        for (int i = 0; i < items.length; i++) {
            MCCItemStack item = items[i];
            Preconditions.checkArgument(item != null, "ItemStack cannot be null");
            while (true) {
                // Do we already have a stack of it?
                int firstPartial = this.firstPartial(item);

                // Drat! no partial stack
                if (firstPartial == -1) {
                    // Find a free spot!
                    int firstFree = this.firstEmpty();

                    if (firstFree == -1) {
                        // No space at all!
                        leftover.put(i, item);
                        break;
                    } else {
                        this.setItem(firstFree, item);
                        break;
                    }
                } else {
                    // So, apparently it might only partially fit, well lets do just that
                    MCCItemStack partialItem = this.getItem(firstPartial);

                    int amount = item.getAmount();
                    int partialAmount = partialItem.getAmount();
                    int maxAmount = partialItem.get(MCCDataComponentTypes.MAX_STACK_SIZE.get());

                    // Check if it fully fits
                    if (amount + partialAmount <= maxAmount) {
                        partialItem.setAmount(amount + partialAmount);
                        // To make sure the packet is sent to the client
                        this.setItem(firstPartial, partialItem);
                        break;
                    }

                    // It fits partially
                    partialItem.setAmount(maxAmount);
                    // To make sure the packet is sent to the client
                    this.setItem(firstPartial, partialItem);
                    item.setAmount(amount + partialAmount - maxAmount);
                }
            }
        }
        return leftover;
    }

    @Override
    public @NotNull HashMap<Integer, MCCItemStack> removeItem(@NotNull MCCItemStack... items) throws IllegalArgumentException {
        Preconditions.checkArgument(items != null, "items cannot be null");
        HashMap<Integer, MCCItemStack> leftover = new HashMap<>();
        // TODO: optimization

        for (int i = 0; i < items.length; i++) {
            MCCItemStack item = items[i];
            Preconditions.checkArgument(item != null, "ItemStack cannot be null");
            int toDelete = item.getAmount();

            while (true) {
                // Paper start - Allow searching entire contents
                MCCItemStack[] toSearch = getContent();
                int first = this.first(item, false, toSearch);
                // Paper end

                // Drat! we don't have this type in the inventory
                if (first == -1) {
                    item.setAmount(toDelete);
                    leftover.put(i, item);
                    break;
                } else {
                    MCCItemStack itemStack = this.getItem(first);
                    int amount = itemStack.getAmount();

                    if (amount <= toDelete) {
                        toDelete -= amount;
                        // clear the slot, all used up
                        this.removeItem(first);
                    } else {
                        // split the stack and store
                        itemStack.setAmount(amount - toDelete);
                        this.setItem(first, itemStack);
                        toDelete = 0;
                    }
                }

                // Bail when done
                if (toDelete <= 0) {
                    break;
                }
            }
        }
        return leftover;
    }

    @Override
    public MCCItemStack[] getContent() {
        return new MCCItemStack[0];
    }

    @Override
    public @NotNull HashMap<Integer, ? extends MCCItemStack> all(@NotNull MCCItemType material) throws IllegalArgumentException {
        Preconditions.checkArgument(material != null, "Material cannot be null");
        HashMap<Integer, MCCItemStack> slots = new HashMap<>();

        MCCItemStack[] inventory = this.getContent();
        for (int i = 0; i < inventory.length; i++) {
            MCCItemStack item = inventory[i];
            if (item != null && item.getType().equals(material)) {
                slots.put(i, item);
            }
        }
        return slots;
    }

    @Override
    public @NotNull HashMap<Integer, ? extends MCCItemStack> all(@Nullable MCCItemStack item) {
        HashMap<Integer, MCCItemStack> slots = new HashMap<>();
        if (item != null) {
            MCCItemStack[] inventory = this.getContent();
            for (int i = 0; i < inventory.length; i++) {
                if (item.equals(inventory[i])) {
                    slots.put(i, inventory[i]);
                }
            }
        }
        return slots;
    }

    @Override
    public void clear() {

    }

    @Override
    public Iterator<MCCItemStack> iterator() {
        return null;
    }

    @Override
    public int firstEmpty() {
        MCCItemStack[] content = this.getContent();
        for (int i = 0; i < content.length; i++) {
            if (content[i] == null) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int first(MCCItemStack stack, boolean checkItemAmounts) {
        return first(stack, checkItemAmounts, getContent());
    }

    private int firstPartial(MCCItemStack item) {
        MCCItemStack[] content = this.getContent();
        if (item == null || item.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < content.length; i++) {
            MCCItemStack foundItem = content[i];
            if (!foundItem.isEmpty() && foundItem.isSimilar(item)) {
                return i;
            }
        }
        return -1;
    }

    private int first(MCCItemStack item, boolean withAmount, MCCItemStack[] inventory) {
        // Paper end
        if (item == null) {
            return -1;
        }
        // ItemStack[] inventory = this.getStorageContents(); // Paper - let param deal
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) continue;

            if (withAmount ? item.equals(inventory[i]) : item.isSimilar(inventory[i])) {
                return i;
            }
        }
        return -1;
    }
}
