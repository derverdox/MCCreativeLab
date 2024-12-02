package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainerMenu;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSResultContainer;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.inventory.types.container.MCCResultContainer;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCSmithingContainerMenu;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import net.minecraft.world.inventory.SmithingMenu;
import org.bukkit.inventory.Recipe;
import org.jetbrains.annotations.Nullable;

public class NMSSmithingContainerMenu extends NMSContainerMenu<MCCBlockContainerSource, SmithingMenu, MCCResultContainer> implements MCCSmithingContainerMenu {
    public static final MCCConverter<SmithingMenu, NMSSmithingContainerMenu> CONVERTER = converter(NMSSmithingContainerMenu.class, SmithingMenu.class, NMSSmithingContainerMenu::new, MCCHandle::getHandle);

    public NMSSmithingContainerMenu(SmithingMenu container) {
        super(container);
    }

    @Override
    public @Nullable MCCItemStack getResult() {
        return getContainer().getResultInventory().getItem(0);
    }

    @Override
    public void setResult(@Nullable MCCItemStack newResult) {
        getContainer().getResultInventory().setItem(0, newResult);
    }

    @Override
    public @Nullable Recipe getRecipe() {
        //TODO: Recipe wrapper
        // RecipeHolder<?> recipe = this.getResultInventory().getRecipeUsed();
        return null;
    }

    @Override
    public MCCResultContainer getContainer() {
        return new NMSResultContainer(readContainerFromField("inputSlots"), readContainerFromField("repairSlots"));
    }
}
