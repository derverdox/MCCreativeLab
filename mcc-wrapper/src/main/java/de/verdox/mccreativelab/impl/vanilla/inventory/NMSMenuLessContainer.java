package de.verdox.mccreativelab.impl.vanilla.inventory;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.ConversionService;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.entity.ContainerViewer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerCloseReason;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCContainerSource;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.kyori.adventure.text.Component;
import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Describes an nms container that has no menu attached to it.
 *
 * @param <T> The container source type
 */
public class NMSMenuLessContainer<T extends MCCContainerSource> extends MCCHandle<Container> implements MCCContainer<T> {
    public static final MCCConverter<Container, NMSMenuLessContainer> CONVERTER = converter(NMSMenuLessContainer.class, Container.class, NMSMenuLessContainer::new, o -> (Container) o.getHandle());

    private final ConversionService service = MCCPlatform.getInstance().getConversionService();

    public NMSMenuLessContainer(Container container) {
        super(container);
    }

    @Override
    public MCCMenuType getType() {
        throw new UnsupportedOperationException("Not implemented for menu less containers");
    }

    @Override
    public void setItem(int index, @Nullable MCCItemStack stack) {
        if(stack == null || stack.isEmpty()){
            this.handle.setItem(index, ItemStack.EMPTY);
            return;
        }
        this.handle.setItem(index, service.unwrap(stack, new TypeToken<>() {}));
    }

    @Override
    public MCCItemStack getItem(int index) {
        //TODO: Nullable? Or Empty MCCItemStack
        return service.wrap(this.handle.getItem(index), new TypeToken<>() {});
    }

    @Override
    public void removeItem(int index) {
        //TODO
        setItem(index, null);
    }

    @Override
    public boolean contains(MCCItemType mccItemType) {
        //TODO: Use caching for better lookups
        return false;
    }

    @Override
    public boolean contains(MCCItemType mccItemType, int amount) {
        //TODO
        return false;
    }

    @Override
    public boolean containsAtLeast(MCCItemType mccItemType, int amount) {
        //TODO
        return false;
    }

    @Override
    public boolean contains(MCCItemStack mccItemStack) {
        //TODO
        return false;
    }

    @Override
    public boolean contains(MCCItemStack mccItemStack, int amount) {
        //TODO
        return false;
    }

    @Override
    public boolean containsAtLeast(MCCItemStack mccItemStack, int amount) {
        //TODO
        return false;
    }

    @Override
    public void setTitle(Component component) {
        //TODO
    }

    @Override
    public Component getTitle() {
        //TODO
        return null;
    }

    @Override
    public @NotNull HashMap<Integer, MCCItemStack> addItem(@NotNull MCCItemStack... items) throws IllegalArgumentException {
        //TODO
        return null;
    }

    @Override
    public @NotNull HashMap<Integer, MCCItemStack> removeItem(@NotNull MCCItemStack... items) throws IllegalArgumentException {
        //TODO
        return null;
    }

    @Override
    public MCCItemStack[] getContent() {
        //TODO: Nullable? Or Empty MCCItemStack
        //TODO: If we use caching we could also cache the array here.

        return null;
    }

    //TODO: If we use caching we could also cache the array here.
    @Override
    public void setContents(MCCItemStack[] items) {
        //TODO
    }

    @Override
    public @NotNull HashMap<Integer, ? extends MCCItemStack> all(@NotNull MCCItemType material) throws IllegalArgumentException {
        //TODO
        return null;
    }

    @Override
    public @NotNull HashMap<Integer, ? extends MCCItemStack> all(@Nullable MCCItemStack item) {
        //TODO
        return null;
    }

    @Override
    public void clear() {
        //TODO
    }

    @Override
    public void close() {
        for (ContainerViewer viewer : getViewers()) {
            viewer.closeCurrentInventory(MCCContainerCloseReason.CLOSED_BY_SERVER);
        }
    }

    @Override
    public Set<ContainerViewer> getViewers() {
        //TODO
        return Set.of();
    }

    @Override
    public boolean canBeOpened() {
        return true;
    }

    @Override
    public @Nullable T getSource() {
        throw new UnsupportedOperationException("MenuLess Containers don't have any source");
    }

    @Override
    public @NotNull Iterator<MCCItemStack> iterator() {
        return new Iterator<>() {
            int currentIndex;

            @Override
            public boolean hasNext() {
                return currentIndex < handle.getContainerSize();
            }

            @Override
            public MCCItemStack next() {
                return getItem(currentIndex++);
            }

            @Override
            public void remove() {
                removeItem(currentIndex);
            }
        };
    }
}
