package de.verdox.mccreativelab.impl.vanilla.inventory;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.entity.ContainerViewer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.annotations.MCCReflective;
import de.verdox.mccreativelab.wrapper.exceptions.OperationNotPossibleOnNMS;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCContainerSource;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import net.kyori.adventure.text.Component;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Iterator;
import java.util.Set;

public abstract class NMSContainerMenu<T extends MCCContainerSource, A extends AbstractContainerMenu, C extends MCCContainer> extends MCCHandle<A> implements MCCContainerMenu<T,C> {

    public NMSContainerMenu(A abstractContainerMenu) {
        super(abstractContainerMenu);
    }

    @Override
    public MCCMenuType getType() {
        return conversionService.wrap(handle.getType(), new TypeToken<>() {});
    }

    @Override
    public @NotNull Iterator<MCCItemStack> iterator() {
        return getContainer().iterator();
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

    @Override
    public void setTitle(Component component) {
        handle.setTitle(conversionService.unwrap(component));
    }

    @Override
    public Component getTitle() {
        return conversionService.wrap(getTitle());
    }

    @Override
    public void close() {
        throw new OperationNotPossibleOnNMS();
    }

    @Override
    public Set<ContainerViewer> getViewers() {
        throw new OperationNotPossibleOnNMS();
    }
}
