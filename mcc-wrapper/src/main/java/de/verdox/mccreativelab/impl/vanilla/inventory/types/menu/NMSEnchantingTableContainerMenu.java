package de.verdox.mccreativelab.impl.vanilla.inventory.types.menu;

import de.verdox.mccreativelab.conversion.converter.MCCConverter;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.MCCEnchantingTableContainerMenu;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.inventory.MCCEnchantmentOffer;
import de.verdox.mccreativelab.wrapper.inventory.source.MCCBlockContainerSource;
import net.minecraft.world.inventory.EnchantmentMenu;
import org.bukkit.enchantments.EnchantmentOffer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NMSEnchantingTableContainerMenu extends NMSContainerMenu<MCCBlockContainerSource, EnchantmentMenu, MCCContainer> implements MCCEnchantingTableContainerMenu {
    public static final MCCConverter<EnchantmentMenu, NMSEnchantingTableContainerMenu> CONVERTER = converter(NMSEnchantingTableContainerMenu.class, EnchantmentMenu.class, NMSEnchantingTableContainerMenu::new, MCCHandle::getHandle);

    public NMSEnchantingTableContainerMenu(EnchantmentMenu abstractContainerMenu) {
        super(abstractContainerMenu);
    }

    @Override
    public int getEnchantmentSeed() {
        return handle.getEnchantmentSeed();
    }

    @Override
    public void setEnchantmentSeed(int seed) {
        handle.setEnchantmentSeed(seed);
    }

    @Override
    public @Nullable MCCEnchantmentOffer getOffer(int index) {
        //TODO
        return null;
    }

    @Override
    public void setOffer(@NotNull EnchantmentOffer offer, int index) throws IllegalArgumentException {
        //TODO
    }

    @Override
    public MCCContainer getContainer() {
        return conversionService.wrap(readContainerFromField("enchantSlots"));
    }
}
