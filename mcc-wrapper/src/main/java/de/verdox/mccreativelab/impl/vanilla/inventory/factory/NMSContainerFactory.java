package de.verdox.mccreativelab.impl.vanilla.inventory.factory;

import com.mojang.datafixers.util.Function4;
import de.verdox.mccreativelab.conversion.ConversionService;
import de.verdox.mccreativelab.impl.vanilla.inventory.factory.creator.AbstractLocationBasedMenuCreatorInstance;
import de.verdox.mccreativelab.impl.vanilla.inventory.factory.creator.AbstractMenuCreatorInstance;
import de.verdox.mccreativelab.impl.vanilla.inventory.factory.creator.AbstractSharedBasedMenuCreatorInstance;
import de.verdox.mccreativelab.impl.vanilla.inventory.types.menu.custom.*;
import de.verdox.mccreativelab.wrapper.entity.types.MCCPlayer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuTypes;
import de.verdox.mccreativelab.wrapper.inventory.factory.MCCContainerFactory;
import de.verdox.mccreativelab.wrapper.inventory.types.MCCLocatedContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.MCCPrivateContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.MCCSharedContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.*;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.creator.LocationBasedMenuCreatorInstance;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.creator.MenuCreatorInstance;
import de.verdox.mccreativelab.wrapper.inventory.types.menu.creator.SharedMenuCreatorInstance;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import net.kyori.adventure.text.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.*;
import org.apache.commons.lang3.function.TriFunction;
import org.checkerframework.checker.index.qual.Positive;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class NMSContainerFactory implements MCCContainerFactory {
    private final Map<MCCMenuType<?>, Function<MCCLocation, LocationBasedMenuCreatorInstance<MCCLocatedContainerMenu<?, ?>>>> containerBasedCache = new HashMap<>();
    private final Map<MCCMenuType<?>, Function<MCCContainer, SharedMenuCreatorInstance<MCCContainer, MCCSharedContainerMenu<?, ?>>>> sharedBasedCache = new HashMap<>();
    private final Map<MCCMenuType<?>, Supplier<MenuCreatorInstance<MCCPrivateContainerMenu<?, ?>>>> privateContainerCache = new HashMap<>();
    private final Map<MCCMenuType<?>, Supplier<? extends MenuCreatorInstance<? extends MCCContainerMenu<?, ?>>>> standardCache = new HashMap<>();

    public NMSContainerFactory() {
        initLocationBased();
        initShared();
        initPrivate();
    }

    public <F extends MCCPrivateContainerMenu<?, ?>> void registerPrivate(MCCMenuType<F> menuType, Class<F> mccType, BiFunction<Integer, Inventory, AbstractContainerMenu> menuCreator) {
        Supplier<MenuCreatorInstance<MCCPrivateContainerMenu<?, ?>>> supplier = () -> new AbstractMenuCreatorInstance<>() {
            @Override
            public MCCPrivateContainerMenu<?, ?> createMenuForPlayer(MCCPlayer player, Component title) {
                ConversionService conversionService = MCCPlatform.getInstance().getConversionService();
                ServerPlayer serverPlayer = conversionService.unwrap(player);

                return openViaNMSMenuProvider(serverPlayer, title, (syncId, inventory, player1) -> menuCreator.apply(syncId, inventory));
            }
        };
        privateContainerCache.put(menuType, supplier);
        standardCache.put(menuType, supplier);
    }

    public <F extends MCCLocatedContainerMenu<?, ?>> void registerLocationBased(MCCMenuType<F> menuType, Class<F> mccType, TriFunction<Integer, Inventory, ContainerLevelAccess, AbstractContainerMenu> menuCreator) {
        containerBasedCache.put(menuType, AbstractLocationBasedMenuCreatorInstance.createWithoutDelegate(menuCreator));
        standardCache.put(menuType, () -> AbstractLocationBasedMenuCreatorInstance.createWithoutDelegate(menuCreator).apply(null));
    }

    public <F extends MCCLocatedContainerMenu<?, ?>> void registerLocationBased(MCCMenuType<F> menuType, Class<F> mccType, int containerDataSize, Function4<Integer, Inventory, ContainerLevelAccess, ContainerData, AbstractContainerMenu> menuCreator) {
        containerBasedCache.put(menuType, AbstractLocationBasedMenuCreatorInstance.createWithDelegate(containerDataSize, menuCreator));
        standardCache.put(menuType, () -> AbstractLocationBasedMenuCreatorInstance.createWithDelegate(containerDataSize, menuCreator).apply(null));
    }

    public <N extends Container, F extends MCCSharedContainerMenu<?, ?>> void registerShared(MCCMenuType<F> menuType, Class<F> mccType, int containerSize, TriFunction<Integer, Inventory, N, AbstractContainerMenu> menuCreator) {
        sharedBasedCache.put(menuType, AbstractSharedBasedMenuCreatorInstance.createWithoutDelegate(containerSize, menuCreator));
        standardCache.put(menuType, () -> AbstractSharedBasedMenuCreatorInstance.createWithoutDelegate(containerSize, menuCreator).apply(createSimpleContainer(containerSize)));
    }

    public <N extends Container, F extends MCCSharedContainerMenu<?, ?>> void registerShared(MCCMenuType<F> menuType, Class<F> mccType, int containerSize, int containerDataSize, Function4<Integer, Inventory, N, ContainerData, AbstractContainerMenu> menuCreator) {
        sharedBasedCache.put(menuType, AbstractSharedBasedMenuCreatorInstance.createWithDelegate(containerSize, containerDataSize, menuCreator));
        standardCache.put(menuType, () -> AbstractSharedBasedMenuCreatorInstance.createWithDelegate(containerSize, containerDataSize, menuCreator).apply(createSimpleContainer(containerSize)));
    }

    @Override
    public MCCContainer createSimpleContainer(@Positive int size) {
        return MCCPlatform.getInstance().getConversionService().wrap(new SimpleContainer(size));
    }


    @Override
    public <F extends MCCLocatedContainerMenu<?, ?>> LocationBasedMenuCreatorInstance<F> createLocated(MCCMenuType<F> menuType,@NotNull MCCLocation location) {
        return (LocationBasedMenuCreatorInstance<F>) containerBasedCache.get(menuType).apply(location);
    }

    @Override
    public <C extends MCCContainer, F extends MCCSharedContainerMenu<?, ?>> SharedMenuCreatorInstance<C, F> createShared(MCCMenuType<F> menuType,@NotNull C container) {
        return (SharedMenuCreatorInstance<C, F>) sharedBasedCache.get(menuType).apply(container);
    }

    @Override
    public <F extends MCCPrivateContainerMenu<?, ?>> MenuCreatorInstance<F> createPrivate(MCCMenuType<F> menuType) {
        return (MenuCreatorInstance<F>) privateContainerCache.get(menuType).get();
    }

    @Override
    public <F extends MCCContainerMenu<?, ?>> MenuCreatorInstance<F> create(MCCMenuType<F> menuType) {
        return (MenuCreatorInstance<F>) standardCache.get(menuType).get();
    }

    public void initLocationBased() {
        registerLocationBased(MCCMenuTypes.ANVIL, MCCAnvilContainerMenu.class, CustomAnvilMenu::new);
        registerLocationBased(MCCMenuTypes.CRAFTING, MCCWorkBenchContainerMenu.class, CustomCraftingMenu::new);
        registerLocationBased(MCCMenuTypes.ENCHANTMENT, MCCEnchantingTableContainerMenu.class, CustomEnchantmentMenu::new);
        registerLocationBased(MCCMenuTypes.GRINDSTONE, MCCGrindstoneContainerMenu.class, CustomGrindstoneMenu::new);
        registerLocationBased(MCCMenuTypes.LOOM, MCCLoomContainerMenu.class, CustomLoomMenu::new);
        registerLocationBased(MCCMenuTypes.SMITHING, MCCSmithingContainerMenu.class, CustomSmithingMenu::new);
        registerLocationBased(MCCMenuTypes.CARTOGRAPHY_TABLE, MCCCartographyTableContainerMenu.class, CustomCartographyTableMenu::new);
        registerLocationBased(MCCMenuTypes.STONECUTTER, MCCStonecutterContainerMenu.class, CustomStonecutterMenu::new);
        registerLocationBased(MCCMenuTypes.BEACON, MCCBeaconContainerMenu.class, 3, (integer, inventory, containerLevelAccess, containerData) -> new CustomBeaconMenu(integer, inventory, containerData, containerLevelAccess));
    }

    public void initShared() {
        registerShared(MCCMenuTypes.GENERIC_3x3, MCCDispenserContainerMenu.class, 9, CustomDispenserMenu::new);

        registerShared(MCCMenuTypes.BLAST_FURNACE, MCCFurnaceContainerMenu.class, 3, 4, CustomBlastFurnaceMenu::new);
        registerShared(MCCMenuTypes.BREWING_STAND, MCCBrewingStandContainerMenu.class, 5, 3, CustomBrewingStandMenu::new);
        registerShared(MCCMenuTypes.FURNACE, MCCFurnaceContainerMenu.class, 3, 4, CustomFurnaceMenu::new);
        registerShared(MCCMenuTypes.HOPPER, MCCHopperContainerMenu.class, 5, CustomHopperMenu::new);
        registerShared(MCCMenuTypes.LECTERN, MCCLecternContainerMenu.class, 1, 1, CustomLecternMenu::new);
        registerShared(MCCMenuTypes.SHULKER_BOX, MCCShulkerContainerMenu.class, 27, CustomShulkerBoxMenu::new);
        registerShared(MCCMenuTypes.SMOKER, MCCFurnaceContainerMenu.class, 3, 4, CustomSmokerMenu::new);

        registerShared(MCCMenuTypes.GENERIC_9x1, MCCChestContainerMenu.class, 9, (syncId, inventory, container) -> new CustomChestMenu(MenuType.GENERIC_9x1, syncId, inventory, container, 1));
        registerShared(MCCMenuTypes.GENERIC_9x2, MCCChestContainerMenu.class, 18, (syncId, inventory, container) -> new CustomChestMenu(MenuType.GENERIC_9x1, syncId, inventory, container, 2));
        registerShared(MCCMenuTypes.GENERIC_9x3, MCCChestContainerMenu.class, 27, (syncId, inventory, container) -> new CustomChestMenu(MenuType.GENERIC_9x1, syncId, inventory, container, 3));
        registerShared(MCCMenuTypes.GENERIC_9x4, MCCChestContainerMenu.class, 36, (syncId, inventory, container) -> new CustomChestMenu(MenuType.GENERIC_9x1, syncId, inventory, container, 4));
        registerShared(MCCMenuTypes.GENERIC_9x5, MCCChestContainerMenu.class, 45, (syncId, inventory, container) -> new CustomChestMenu(MenuType.GENERIC_9x1, syncId, inventory, container, 5));
        registerShared(MCCMenuTypes.GENERIC_9x6, MCCChestContainerMenu.class, 54, (syncId, inventory, container) -> new CustomChestMenu(MenuType.GENERIC_9x1, syncId, inventory, container, 6));
    }

    public void initPrivate() {
        registerPrivate(MCCMenuTypes.CRAFTER_3x3, MCCCrafterContainerMenu.class, CustomCrafterMenu::new);
        registerPrivate(MCCMenuTypes.MERCHANT, MCCMerchantContainerMenu.class, CustomMerchantMenu::new);
    }
}
