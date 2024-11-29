package de.verdox.mccreativelab.impl.vanilla.inventory;

import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.annotations.MCCReflective;
import de.verdox.mccreativelab.wrapper.entity.ContainerViewer;
import de.verdox.mccreativelab.wrapper.exceptions.OperationNotPossibleOnNMS;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCContainerSource;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;
import net.kyori.adventure.text.Component;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public abstract class NMSContainer<T extends MCCContainerSource, A extends AbstractContainerMenu> extends MCCHandle<A> implements MCCContainer<T> {

    protected final NMSMenuLessContainer<T> implContainer;

    public NMSContainer(A abstractContainerMenu) {
        super(abstractContainerMenu);
        this.implContainer = new NMSMenuLessContainer<>(getNMSContainer(abstractContainerMenu));
    }

    protected abstract Container getNMSContainer(A abstractContainerMenu);

    @Override
    public void setItem(int index, @Nullable MCCItemStack stack) {
        implContainer.setItem(index, stack);
    }

    @Override
    public MCCItemStack getItem(int index) {
        return implContainer.getItem(index);
    }

    @Override
    public void removeItem(int index) {
        implContainer.removeItem(index);
    }

    @Override
    public boolean contains(MCCItemType mccItemType) {
        return implContainer.contains(mccItemType);
    }

    @Override
    public boolean contains(MCCItemType mccItemType, int amount) {
        return implContainer.contains(mccItemType, amount);
    }

    @Override
    public boolean containsAtLeast(MCCItemType mccItemType, int amount) {
        return implContainer.containsAtLeast(mccItemType, amount);
    }

    @Override
    public boolean contains(MCCItemStack mccItemStack) {
        return implContainer.contains(mccItemStack);
    }

    @Override
    public boolean contains(MCCItemStack mccItemStack, int amount) {
        return implContainer.contains(mccItemStack, amount);
    }

    @Override
    public boolean containsAtLeast(MCCItemStack mccItemStack, int amount) {
        return implContainer.containsAtLeast(mccItemStack, amount);
    }

    @Override
    public void setTitle(Component component) {
        implContainer.setTitle(component);
    }

    @Override
    public Component getTitle() {
        return implContainer.getTitle();
    }

    @Override
    public @NotNull HashMap<Integer, MCCItemStack> addItem(@NotNull MCCItemStack... items) throws IllegalArgumentException {
        return implContainer.addItem(items);
    }

    @Override
    public @NotNull HashMap<Integer, MCCItemStack> removeItem(@NotNull MCCItemStack... items) throws IllegalArgumentException {
        return implContainer.removeItem(items);
    }

    @Override
    public MCCItemStack[] getContent() {
        return implContainer.getContent();
    }

    //TODO: If we use caching we could also cache the array here.
    @Override
    public void setContents(MCCItemStack[] items) {
        implContainer.setContents(items);
    }

    @Override
    public @NotNull HashMap<Integer, ? extends MCCItemStack> all(@NotNull MCCItemType material) throws IllegalArgumentException {
        return implContainer.all(material);
    }

    @Override
    public @NotNull HashMap<Integer, ? extends MCCItemStack> all(@Nullable MCCItemStack item) {
        return implContainer.all(item);
    }

    @Override
    public void clear() {
        implContainer.clear();
    }

    @Override
    public void close() {
        implContainer.close();
    }

    @Override
    public Set<ContainerViewer> getViewers() {
        return implContainer.getViewers();
    }

    @Override
    public @NotNull Iterator<MCCItemStack> iterator() {
        return implContainer.iterator();
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
