package de.verdox.mccreativelab.impl.vanilla.inventory.types;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainer;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSHandle;
import de.verdox.mccreativelab.wrapper.inventory.MCCEnchantmentOffer;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import de.verdox.mccreativelab.wrapper.inventory.types.MCCEnchantingTableContainer;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.EnchantmentMenu;
import org.bukkit.enchantments.EnchantmentOffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NMSEnchantingTableContainer extends NMSContainer<MCCBlockContainerSource, EnchantmentMenu> implements MCCEnchantingTableContainer {
    public static final MCCConverter<EnchantmentMenu, NMSEnchantingTableContainer> CONVERTER = converter(NMSEnchantingTableContainer.class, EnchantmentMenu.class, NMSEnchantingTableContainer::new, NMSHandle::getHandle);

    public NMSEnchantingTableContainer(EnchantmentMenu abstractContainerMenu) {
        super(abstractContainerMenu);
    }

    @Override
    protected Container getNMSContainer(EnchantmentMenu abstractContainerMenu) {
        return readContainerFromField("enchantSlots");
    }

    @Override
    public int getEnchantmentSeed() {
        return 0;
    }

    @Override
    public void setEnchantmentSeed(int seed) {

    }

    @Override
    public @Nullable MCCEnchantmentOffer getOffer(int index) {
        return null;
    }

    @Override
    public void setOffer(@NotNull EnchantmentOffer offer, int index) throws IllegalArgumentException {

    }
}
