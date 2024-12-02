package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu;

import com.google.common.base.Preconditions;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCLecternContainerMenu;
import net.minecraft.world.inventory.LecternMenu;
import net.minecraft.world.level.block.entity.LecternBlockEntity;

public class NMSLecternContainerMenu extends NMSContainerMenu<MCCBlockContainerSource, LecternMenu, MCCContainer> implements MCCLecternContainerMenu {
    public static final MCCConverter<LecternMenu, NMSLecternContainerMenu> CONVERTER = converter(NMSLecternContainerMenu.class, LecternMenu.class, NMSLecternContainerMenu::new, MCCHandle::getHandle);

    public NMSLecternContainerMenu(LecternMenu abstractContainerMenu) {
        super(abstractContainerMenu);
    }

    @Override
    public int getPage() {
        return this.getHandle().getPage();
    }

    @Override
    public void setPage(int page) {
        Preconditions.checkArgument(page >= 0, "The minimum page is 0");
        this.getHandle().setData(LecternBlockEntity.DATA_PAGE, page);
    }

    @Override
    public MCCContainer getContainer() {
        return conversionService.wrap(readContainerFromField("lectern"));
    }
}
