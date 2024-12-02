package de.verdox.mccreativelab.impl.vanilla.platform.factory;

import com.google.common.reflect.TypeToken;
import de.verdox.mccreativelab.wrapper.inventory.factory.MCCContainerFactory;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.*;

public class NMSContainerFactory implements MCCContainerFactory {

    //TODO: Modern implementations of guis all require a player to have them open while they exist. Take a look at various impls of AbstractContainerMenu. All of them require a player inventory.
    // maybe we create a dummy server player that keeps the logic alive? Whe then only have to manipulate the menu providers so multiple players can hook into the same view.
    // For this to work we create custom MenuProviders

    public static void test() {
        //TODO: We leave it as is for now. However, we need to create anonymous classes for each of them so we can overwrite the isValid function to ensure the guis are always open and won't close when the player is too far away.
        //TODO: ALWAYS TAKE A LOOK AT THE IMPLEMENTATION. SOMETIMES WE NEED TO ADOPT SOME ADDITIONAL LOGIC
        simple(DispenserMenu.class, DispenserMenu::new, new TypeToken<>() {});
        dataBased(CrafterMenu.class, CrafterMenu::new, new TypeToken<CraftingContainer>() {});

        locationBased(AnvilMenu.class, AnvilMenu::new);
        dataAndLocationBased(BeaconMenu.class, BeaconMenu::new);
        dataBased(BlastFurnaceMenu.class, BlastFurnaceMenu::new, new TypeToken<>() {});
        dataBased(BrewingStandMenu.class, BrewingStandMenu::new, new TypeToken<>() {});
        locationBased(CraftingMenu.class, CraftingMenu::new);
        locationBased(EnchantmentMenu.class, EnchantmentMenu::new);
        dataBased(FurnaceMenu.class, FurnaceMenu::new, new TypeToken<>() {});
        locationBased(GrindstoneMenu.class, GrindstoneMenu::new);
        simple(HopperMenu.class, HopperMenu::new, new TypeToken<>() {});
        dataBased(LecternMenu.class, (syncId, playerInventory, containerOfMenu, propertyDelegate) -> new LecternMenu(syncId, containerOfMenu, propertyDelegate, playerInventory), new TypeToken<>() {});
        locationBased(LoomMenu.class, LoomMenu::new);
        simple(ShulkerBoxMenu.class, ShulkerBoxMenu::new, new TypeToken<>() {});
        locationBased(SmithingMenu.class, SmithingMenu::new);
        dataBased(SmokerMenu.class, SmokerMenu::new, new TypeToken<>() {});
        locationBased(CartographyTableMenu.class, CartographyTableMenu::new);
        locationBased(StonecutterMenu.class, StonecutterMenu::new);

        simple(ChestMenu.class, (syncId, playerInventory, containerOfMenu) -> {
            return new ChestMenu(MenuType.GENERIC_9x1, syncId, playerInventory, containerOfMenu, 1);
        }, new TypeToken<>() {});
        simple(ChestMenu.class, (syncId, playerInventory, containerOfMenu) -> {
            return new ChestMenu(MenuType.GENERIC_9x2, syncId, playerInventory, containerOfMenu, 2);
        }, new TypeToken<>() {});
        simple(ChestMenu.class, (syncId, playerInventory, containerOfMenu) -> {
            return new ChestMenu(MenuType.GENERIC_9x3, syncId, playerInventory, containerOfMenu, 3);
        }, new TypeToken<>() {});
        simple(ChestMenu.class, (syncId, playerInventory, containerOfMenu) -> {
            return new ChestMenu(MenuType.GENERIC_9x4, syncId, playerInventory, containerOfMenu, 4);
        }, new TypeToken<>() {});
        simple(ChestMenu.class, (syncId, playerInventory, containerOfMenu) -> {
            return new ChestMenu(MenuType.GENERIC_9x5, syncId, playerInventory, containerOfMenu, 5);
        }, new TypeToken<>() {});
        simple(ChestMenu.class, (syncId, playerInventory, containerOfMenu) -> {
            return new ChestMenu(MenuType.GENERIC_9x6, syncId, playerInventory, containerOfMenu, 6);
        }, new TypeToken<>() {});

        //TODO: Merchant. Needs custom merchant implementation no?
        simple(MerchantMenu.class, (syncId, playerInventory, containerOfMenu) -> {
/*            new ClientSideMerchant(null) {

                @Override
                public Player getTradingPlayer() {
                    //TODO
                    return null;
                }

                @Override
                public boolean isClientSide() {
                    //TODO
                    return !MinecraftServer.getServer().isDedicatedServer();
                }
            };*/
            return new MerchantMenu(syncId, playerInventory, null);
        }, new TypeToken<>() {});
    }

    private static <F extends AbstractContainerMenu, C extends Container> void simple(Class<F> type, SimpleMenuConstructor<F, C> constructor, TypeToken<C> typeToken) {

    }

    private static <F extends AbstractContainerMenu, C extends Container> void dataBased(Class<F> type, DataBasedMenuConstructor<F, C> constructor, TypeToken<C> typeToken) {

    }

    private static <F extends AbstractContainerMenu, C extends Container> void locationBased(Class<F> type, AccessBasedMenuConstructor<F> constructor) {

    }

    private static <F extends AbstractContainerMenu, C extends Container> void dataAndLocationBased(Class<F> type, AccessAndDataBasedMenuConstructor<F> constructor) {

    }

    public interface SimpleMenuConstructor<F extends AbstractContainerMenu, C extends Container> {
        F construct(int syncId, Inventory playerInventory, C containerOfMenu);
    }

    public interface DataBasedMenuConstructor<F extends AbstractContainerMenu, C extends Container> {
        F construct(int syncId, Inventory playerInventory, C containerOfMenu, ContainerData propertyDelegate);
    }

    public interface AccessBasedMenuConstructor<F extends AbstractContainerMenu> {
        F construct(int syncId, Inventory playerInventory, ContainerLevelAccess access);
    }

    public interface AccessAndDataBasedMenuConstructor<F extends AbstractContainerMenu> {
        F construct(int syncId, Inventory playerInventory, ContainerData propertyDelegate, ContainerLevelAccess access);
    }
}
