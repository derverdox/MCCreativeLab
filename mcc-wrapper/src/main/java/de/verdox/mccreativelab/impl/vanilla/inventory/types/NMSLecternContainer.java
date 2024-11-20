package de.verdox.mccreativelab.impl.vanilla.inventory.types;

import com.google.common.base.Preconditions;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainer;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.inventory.types.MCCLecternContainer;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.LecternMenu;
import net.minecraft.world.level.block.entity.LecternBlockEntity;

public class NMSLecternContainer extends NMSContainer<MCCBlockContainerSource, LecternMenu> implements MCCLecternContainer {
    public static final MCCConverter<LecternMenu, NMSLecternContainer> CONVERTER = converter(NMSLecternContainer.class, LecternMenu.class, NMSLecternContainer::new, NMSHandle::getHandle);

    public NMSLecternContainer(LecternMenu abstractContainerMenu) {
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
    protected Container getNMSContainer(LecternMenu abstractContainerMenu) {
        return readContainerFromField("lectern");
    }
}
