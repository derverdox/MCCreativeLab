package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu;

import com.google.common.base.Preconditions;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCBrewingStandContainerMenu;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import net.minecraft.world.inventory.BrewingStandMenu;
import net.minecraft.world.level.block.entity.BrewingStandBlockEntity;
import org.jetbrains.annotations.Range;

public class NMSBrewingStandContainerMenu extends NMSContainerMenu<MCCBlockContainerSource, BrewingStandMenu, MCCContainer> implements MCCBrewingStandContainerMenu {
    public static final MCCConverter<BrewingStandMenu, NMSBrewingStandContainerMenu> CONVERTER = converter(NMSBrewingStandContainerMenu.class, BrewingStandMenu.class, NMSBrewingStandContainerMenu::new, MCCHandle::getHandle);

    public NMSBrewingStandContainerMenu(BrewingStandMenu abstractContainerMenu) {
        super(abstractContainerMenu);
    }

    @Override
    public int getFuelLevel() {
        return this.getHandle().getFuel();
    }

    @Override
    public int getBrewingTicks() {
        return this.getHandle().getBrewingTicks();
    }

    @Override
    public void setFuelLevel(int level) throws IllegalArgumentException {
        Preconditions.checkArgument(level > 0, "The given fuel level must be greater than 0");
        this.getHandle().setData(BrewingStandBlockEntity.DATA_FUEL_USES, level);
    }

    @Override
    public void setBrewingTicks(int ticks) throws IllegalArgumentException {
        Preconditions.checkArgument(ticks > 0, "The given brewing ticks must be greater than 0");
        this.getHandle().setData(BrewingStandBlockEntity.DATA_BREW_TIME, ticks);
    }

    @Override
    public void setRecipeBrewTime(@Range(from = 1, to = Integer.MAX_VALUE) int recipeBrewTime) {
        com.google.common.base.Preconditions.checkArgument(recipeBrewTime > 0, "recipeBrewTime must be positive");
        this.getHandle().brewingStandData.set(2, recipeBrewTime);
    }

    @Override
    public int getRecipeBrewTime() {
        return this.getHandle().brewingStandData.get(2);
    }

    @Override
    public MCCContainer getContainer() {
        return conversionService.wrap(readContainerFromField("brewingStand"));
    }
}
