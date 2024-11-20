package de.verdox.mccreativelab.impl.vanilla.inventory.types;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainer;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.inventory.types.MCCChestContainer;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.ChestMenu;

public class NMSChestContainer extends NMSContainer<MCCBlockContainerSource, ChestMenu> implements MCCChestContainer {
    public static final MCCConverter<ChestMenu, NMSChestContainer> CONVERTER = converter(NMSChestContainer.class, ChestMenu.class, NMSChestContainer::new, NMSHandle::getHandle);

    public NMSChestContainer(ChestMenu abstractContainerMenu) {
        super(abstractContainerMenu);
    }

    @Override
    protected Container getNMSContainer(ChestMenu abstractContainerMenu) {
        return readContainerFromField("container");
    }

    @Override
    public MCCMenuType getType() {
        return MCCPlatform.getInstance().getConversionService().wrap(getHandle().getType(), new TypeToken<>() {});
    }
}
