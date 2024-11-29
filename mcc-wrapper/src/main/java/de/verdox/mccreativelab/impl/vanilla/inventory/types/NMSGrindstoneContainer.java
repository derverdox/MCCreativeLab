package de.verdox.mccreativelab.impl.vanilla.inventory.types;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainer;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSMenuLessChildContainer;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.inventory.types.MCCGrindstoneContainer;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.GrindstoneMenu;
import net.minecraft.world.inventory.ItemCombinerMenu;

public class NMSGrindstoneContainer extends NMSContainer<MCCBlockContainerSource, GrindstoneMenu> implements MCCGrindstoneContainer {
    public static final MCCConverter<GrindstoneMenu, NMSGrindstoneContainer> CONVERTER = converter(NMSGrindstoneContainer.class, GrindstoneMenu.class, NMSGrindstoneContainer::new, MCCHandle::getHandle);

    public NMSGrindstoneContainer(GrindstoneMenu abstractContainerMenu) {
        super(abstractContainerMenu);
    }

    @Override
    protected Container getNMSContainer(GrindstoneMenu abstractContainerMenu) {
        throw new RuntimeException("This function is not supported by " + getClass().getCanonicalName());
    }

    @Override
    public MCCContainer<MCCBlockContainerSource> getResultInventory() {
        Container result = readContainerFromField(ItemCombinerMenu.class, "resultSlots");
        return new NMSMenuLessChildContainer<>(this, result);
    }

    @Override
    public MCCContainer<MCCBlockContainerSource> getIngredientsInventory() {
        Container inputs = readContainerFromField(ItemCombinerMenu.class, "repairSlots");
        return new NMSMenuLessChildContainer<>(this, inputs);
    }
}
