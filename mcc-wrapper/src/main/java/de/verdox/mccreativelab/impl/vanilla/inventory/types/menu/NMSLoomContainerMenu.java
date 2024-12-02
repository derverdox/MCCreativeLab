package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainerMenu;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSResultContainer;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.inventory.types.container.MCCResultContainer;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCLoomContainerMenu;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;

import net.minecraft.world.inventory.LoomMenu;
import org.bukkit.block.banner.PatternType;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class NMSLoomContainerMenu extends NMSContainerMenu<MCCBlockContainerSource, LoomMenu, MCCResultContainer> implements MCCLoomContainerMenu {
    public static final MCCConverter<LoomMenu, NMSLoomContainerMenu> CONVERTER = converter(NMSLoomContainerMenu.class, LoomMenu.class, NMSLoomContainerMenu::new, MCCHandle::getHandle);

    public NMSLoomContainerMenu(LoomMenu container) {
        super(container);
    }

    @Override
    public @NotNull List<PatternType> getSelectablePatterns() {
        //TODO
        return List.of();
    }

    @Override
    public int getSelectedPatternIndex() {
        return handle.getSelectedBannerPatternIndex();
    }

    @Override
    public MCCResultContainer getContainer() {
        return new NMSResultContainer(readContainerFromField("inputContainer"), readContainerFromField("outputContainer"));
    }
}
