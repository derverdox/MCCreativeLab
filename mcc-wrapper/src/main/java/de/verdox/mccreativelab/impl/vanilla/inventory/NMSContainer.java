package de.verdox.mccreativelab.impl.vanilla.inventory;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.ConversionService;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.annotations.MCCReflective;
import de.verdox.mccreativelab.wrapper.entity.ContainerViewer;
import de.verdox.mccreativelab.wrapper.exceptions.OperationNotPossibleOnNMS;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerCloseReason;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCContainerSource;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.kyori.adventure.text.Component;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public abstract class NMSContainer<T extends MCCContainerSource, A extends AbstractContainerMenu> extends NMSHandle<A> implements MCCContainer<T> {

    private final ConversionService service = MCCPlatform.getInstance().getConversionService();

    protected final Container container;

    public NMSContainer(A abstractContainerMenu) {
        super(abstractContainerMenu);
        this.container = getNMSContainer(abstractContainerMenu);
    }

    protected abstract Container getNMSContainer(A abstractContainerMenu);

    @Override
    public void setItem(int index, @Nullable MCCItemStack stack) {
        if(stack == null || stack.isEmpty()){
            this.container.setItem(index, ItemStack.EMPTY);
            return;
        }
        this.container.setItem(index, service.unwrap(stack, new TypeToken<>() {}));
    }

    @Override
    public MCCItemStack getItem(int index) {
        //TODO: Nullable? Or Empty MCCItemStack
        return service.wrap(this.container.getItem(index), new TypeToken<>() {});
    }

    @Override
    public void removeItem(int index) {
        setItem(index, null);
    }

    @Override
    public boolean contains(MCCItemType mccItemType) {
        //TODO: Use caching for better lookups
        return false;
    }

    @Override
    public boolean contains(MCCItemType mccItemType, int amount) {
        return false;
    }

    @Override
    public boolean containsAtLeast(MCCItemType mccItemType, int amount) {
        return false;
    }

    @Override
    public boolean contains(MCCItemStack mccItemStack) {
        return false;
    }

    @Override
    public boolean contains(MCCItemStack mccItemStack, int amount) {
        return false;
    }

    @Override
    public boolean containsAtLeast(MCCItemStack mccItemStack, int amount) {
        return false;
    }

    @Override
    public void setTitle(Component component) {

    }

    @Override
    public Component getTitle() {
        return null;
    }

    @Override
    public @NotNull HashMap<Integer, MCCItemStack> addItem(@NotNull MCCItemStack... items) throws IllegalArgumentException {
        return null;
    }

    @Override
    public @NotNull HashMap<Integer, MCCItemStack> removeItem(@NotNull MCCItemStack... items) throws IllegalArgumentException {
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

    }

    @Override
    public @NotNull HashMap<Integer, ? extends MCCItemStack> all(@NotNull MCCItemType material) throws IllegalArgumentException {
        return null;
    }

    @Override
    public @NotNull HashMap<Integer, ? extends MCCItemStack> all(@Nullable MCCItemStack item) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public void close() {
        for (ContainerViewer viewer : getViewers()) {
            viewer.closeCurrentInventory(MCCContainerCloseReason.CLOSED_BY_SERVER);
        }
    }

    @Override
    public Set<ContainerViewer> getViewers() {
        return Set.of();
    }

    @Override
    public @NotNull Iterator<MCCItemStack> iterator() {
        return new Iterator<>() {
            int currentIndex;

            @Override
            public boolean hasNext() {
                return currentIndex < container.getContainerSize();
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

    @MCCReflective
    protected Container readContainerFromField(String fieldName){
        try {
            return (Container) getHandle().getClass().getDeclaredField(fieldName).get(getHandle());
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    @MCCReflective
    protected Container readContainerFromField(Class<?> otherType, String fieldName){
        try {
            return (Container) otherType.getDeclaredField(fieldName).get(getHandle());
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    @MCCReflective
    protected ContainerData readContainerDataFromField(String fieldName){
        try {
            return (ContainerData) getHandle().getClass().getDeclaredField(fieldName).get(getHandle());
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public @Nullable T getSource() {
        throw new OperationNotPossibleOnNMS();
    }
}
