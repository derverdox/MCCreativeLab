package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainerMenu;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSResultContainer;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.inventory.types.container.MCCResultContainer;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCWorkBenchContainerMenu;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import net.minecraft.world.inventory.CraftingMenu;

public class NMSWorkBenchContainerMenu extends NMSContainerMenu<MCCBlockContainerSource, CraftingMenu, MCCResultContainer> implements MCCWorkBenchContainerMenu {
    public static final MCCConverter<CraftingMenu, NMSWorkBenchContainerMenu> CONVERTER = converter(NMSWorkBenchContainerMenu.class, CraftingMenu.class, NMSWorkBenchContainerMenu::new, MCCHandle::getHandle);

    public NMSWorkBenchContainerMenu(CraftingMenu abstractContainerMenu) {
        super(abstractContainerMenu);
    }

    @Override
    public MCCResultContainer getContainer() {
        return new NMSResultContainer(readContainerFromField("craftSlots"), readContainerFromField("resultSlots"));
    }
}
