package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainerMenu;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSResultContainer;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.inventory.types.container.MCCResultContainer;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCStonecutterContainerMenu;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import net.minecraft.world.inventory.StonecutterMenu;
import org.bukkit.inventory.StonecuttingRecipe;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class NMSStoneCutterContainerMenu extends NMSContainerMenu<MCCBlockContainerSource, StonecutterMenu, MCCResultContainer> implements MCCStonecutterContainerMenu {
    public static final MCCConverter<StonecutterMenu, NMSStoneCutterContainerMenu> CONVERTER = converter(NMSStoneCutterContainerMenu.class, StonecutterMenu.class, NMSStoneCutterContainerMenu::new, MCCHandle::getHandle);

    public NMSStoneCutterContainerMenu(StonecutterMenu container) {
        super(container);
    }

    @Override
    public int getSelectedRecipeIndex() {
        return handle.getSelectedRecipeIndex();
    }

    @Override
    public @NotNull List<StonecuttingRecipe> getRecipes() {
        //TODO
        return List.of();
    }

    @Override
    public int getRecipeAmount() {
        return handle.getNumRecipes();
    }

    @Override
    public MCCResultContainer getContainer() {
        return new NMSResultContainer(readContainerFromField("container"), readContainerFromField("resultContainer"));
    }
}
