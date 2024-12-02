package de.verdox.mccreativelab.impl.vanilla.platform.factory;

import com.google.common.reflect.TypeToken;
import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Function4;
import de.verdox.mccreativelab.impl.vanilla.inventory.NMSContainerMenu;
import de.verdox.mccreativelab.impl.vanilla.inventory.types.menu.*;
import de.verdox.mccreativelab.wrapper.annotations.MCCRequireVanillaElement;
import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuTypes;
import de.verdox.mccreativelab.wrapper.inventory.factory.ContainerProvider;
import de.verdox.mccreativelab.wrapper.inventory.factory.MCCContainerFactory;
import de.verdox.mccreativelab.wrapper.platform.MCCHandle;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import net.kyori.adventure.text.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Container;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.npc.ClientSideMerchant;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.*;
import net.minecraft.world.level.block.state.BlockState;
import org.apache.commons.lang3.function.TriFunction;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class NMSContainerFactory implements MCCContainerFactory {
    private static final Map<MCCMenuType, Function<MCCLocation, ContainerProvider<?>>> fabricators = new HashMap<>();

    //TODO: Modern implementations of guis all require a player to have them open while they exist. Take a look at various impls of AbstractContainerMenu. All of them require a player inventory.
    // maybe we create a dummy server player that keeps the logic alive? Whe then only have to manipulate the menu providers so multiple players can hook into the same view.
    // For this to work we create custom MenuProviders

    @Override
    public ContainerProvider<?> createContainerProvider(MCCMenuType mccMenuType, MCCLocation mccLocation) {
        if (!fabricators.containsKey(mccMenuType)) {
            throw new NoSuchElementException("The menu type " + mccMenuType + " does not have any provider function");
        }
        return fabricators.get(mccMenuType).apply(mccLocation);
    }

    @Override
    public ContainerProvider<?> fromExistingContainer(MCCContainerMenu<?> existingContainer) {
        return createDummy(existingContainer);
    }

    public static void test() {
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
    }

    private static void init() {
        createChestFabricators(MCCMenuTypes.GENERIC_9x1, 1);
        createChestFabricators(MCCMenuTypes.GENERIC_9x2, 2);
        createChestFabricators(MCCMenuTypes.GENERIC_9x3, 3);
        createChestFabricators(MCCMenuTypes.GENERIC_9x4, 4);
        createChestFabricators(MCCMenuTypes.GENERIC_9x5, 5);
        createChestFabricators(MCCMenuTypes.GENERIC_9x6, 6);

        createTileBased(MCCMenuTypes.GENERIC_3x3, DispenserBlockEntity::new, NMSDispenserContainerMenu::new, (integer, inventory, containerLevelAccess, blockEntity) -> new DispenserMenu(integer, inventory, blockEntity) {
            @Override
            public boolean stillValid(Player player) {
                return true;
            }
        });

        createTileBased(MCCMenuTypes.CRAFTER_3x3, CrafterBlockEntity::new, NMSCrafterContainerMenu::new, (integer, inventory, containerLevelAccess, blockEntity) -> {
            ContainerData containerData = MCCHandle.readFieldFromHandle(blockEntity, "containerData", new TypeToken<>() {});
            return new CrafterMenu(integer, inventory, blockEntity, containerData) {
                @Override
                public boolean stillValid(@NotNull Player player) {
                    return true;
                }
            };
        });

        createWorldAccessed(MCCMenuTypes.ANVIL, NMSAnvilContainerMenu::new, (syncId, playerInventory, containerLevelAccess) ->
            new AnvilMenu(syncId, playerInventory, containerLevelAccess) {
                @Override
                public boolean stillValid(@NotNull Player player) {
                    return true;
                }
            });

        createTileBased(MCCMenuTypes.BEACON, BeaconBlockEntity::new, NMSBeaconContainerMenu::new, (integer, inventory, containerLevelAccess, blockEntity) -> {
            ContainerData containerData = MCCHandle.readFieldFromHandle(blockEntity, "dataAccess", new TypeToken<>() {});
            return new BeaconMenu(integer, inventory, containerData, containerLevelAccess) {
                @Override
                public boolean stillValid(@NotNull Player player) {
                    return true;
                }
            };
        });

        createTileBased(MCCMenuTypes.BLAST_FURNACE, BlastFurnaceBlockEntity::new, NMSFurnaceContainerMenu::new, (integer, inventory, containerLevelAccess, blockEntity) -> {
            ContainerData containerData = MCCHandle.readFieldFromHandle(blockEntity, "dataAccess", new TypeToken<>() {});
            return new BlastFurnaceMenu(integer, inventory, blockEntity, containerData) {
                @Override
                public boolean stillValid(@NotNull Player player) {
                    return true;
                }
            };
        });

        createTileBased(MCCMenuTypes.BREWING_STAND, BrewingStandBlockEntity::new, NMSBrewingStandContainerMenu::new, (integer, inventory, containerLevelAccess, blockEntity) -> {
            ContainerData containerData = MCCHandle.readFieldFromHandle(blockEntity, "dataAccess", new TypeToken<>() {});
            return new BrewingStandMenu(integer, inventory, blockEntity, containerData) {
                @Override
                public boolean stillValid(@NotNull Player player) {
                    return true;
                }
            };
        });

        createWorldAccessed(MCCMenuTypes.CRAFTING, NMSWorkBenchContainerMenu::new, (syncId, playerInventory, containerLevelAccess) ->
            new CraftingMenu(syncId, playerInventory, containerLevelAccess) {
                @Override
                public boolean stillValid(@NotNull Player player) {
                    return true;
                }
            });

        createWorldAccessed(MCCMenuTypes.ENCHANTMENT, NMSEnchantingTableContainerMenu::new, (syncId, playerInventory, containerLevelAccess) ->
            new EnchantmentMenu(syncId, playerInventory, containerLevelAccess) {
                @Override
                public boolean stillValid(@NotNull Player player) {
                    return true;
                }
            });

        createTileBased(MCCMenuTypes.FURNACE, FurnaceBlockEntity::new, NMSFurnaceContainerMenu::new, (integer, inventory, containerLevelAccess, blockEntity) -> {
            ContainerData containerData = MCCHandle.readFieldFromHandle(blockEntity, "dataAccess", new TypeToken<>() {});
            return new FurnaceMenu(integer, inventory, blockEntity, containerData) {
                @Override
                public boolean stillValid(@NotNull Player player) {
                    return true;
                }
            };
        });

        createWorldAccessed(MCCMenuTypes.GRINDSTONE, NMSGrindstoneContainerMenu::new, (syncId, playerInventory, containerLevelAccess) ->
            new GrindstoneMenu(syncId, playerInventory, containerLevelAccess) {
                @Override
                public boolean stillValid(@NotNull Player player) {
                    return true;
                }
            });

        createTileBased(MCCMenuTypes.HOPPER, HopperBlockEntity::new, NMSHopperContainerMenu::new, (integer, inventory, containerLevelAccess, blockEntity) -> {
            return new HopperMenu(integer, inventory, blockEntity) {
                @Override
                public boolean stillValid(@NotNull Player player) {
                    return true;
                }
            };
        });

        createTileBased(MCCMenuTypes.LECTERN, LecternBlockEntity::new, NMSLecternContainerMenu::new, (integer, inventory, containerLevelAccess, blockEntity) -> {
            Container bookAccess = MCCHandle.readFieldFromHandle(blockEntity, "bookAccess", new TypeToken<>() {});
            ContainerData containerData = MCCHandle.readFieldFromHandle(blockEntity, "dataAccess", new TypeToken<>() {});
            return new LecternMenu(integer, bookAccess, containerData, inventory) {
                @Override
                public boolean stillValid(@NotNull Player player) {
                    return true;
                }
            };
        });

        createWorldAccessed(MCCMenuTypes.LOOM, NMSLoomContainerMenu::new, (syncId, playerInventory, containerLevelAccess) -> {
            return new LoomMenu(syncId, playerInventory, containerLevelAccess) {
                @Override
                public boolean stillValid(Player player) {
                    return true;
                }
            };
        });

        //TODO: Custom Merchant
        createSimple(MCCMenuTypes.MERCHANT, () -> new ClientSideMerchant(null) {

            @Override
            public Player getTradingPlayer() {
                //TODO
                return super.getTradingPlayer();
            }

            @Override
            public boolean isClientSide() {
                //TODO
                return super.isClientSide();
            }
        }, NMSMerchantContainerMenu::new, (syncId, playerInventory, merchant) -> {
            return new MerchantMenu(syncId, playerInventory, merchant) {
                @Override
                public boolean stillValid(Player player) {
                    return true;
                }
            };
        });


        createSimple(MCCMenuTypes.SHULKER_BOX, () -> new SimpleContainer(27), NMSShulkerContainerMenu::new, (syncId, playerInventory, container) -> {
            return new ShulkerBoxMenu(syncId, playerInventory, container) {
                @Override
                public boolean stillValid(Player player) {
                    return true;
                }
            };
        });


        createWorldAccessed(MCCMenuTypes.SMITHING, NMSSmithingContainerMenu::new, (syncId, playerInventory, containerLevelAccess) -> {
            return new SmithingMenu(syncId, playerInventory, containerLevelAccess) {
                @Override
                public boolean stillValid(Player player) {
                    return true;
                }
            };
        });

        createTileBased(MCCMenuTypes.SMOKER, SmokerBlockEntity::new, NMSFurnaceContainerMenu::new, (integer, inventory, containerLevelAccess, blockEntity) -> {
            ContainerData containerData = MCCHandle.readFieldFromHandle(blockEntity, "dataAccess", new TypeToken<>() {});
            return new SmokerMenu(integer, inventory, blockEntity, containerData) {
                @Override
                public boolean stillValid(@NotNull Player player) {
                    return true;
                }
            };
        });


        createWorldAccessed(MCCMenuTypes.CARTOGRAPHY_TABLE, NMSCartographyTableContainerMenu::new, (syncId, playerInventory, containerLevelAccess) -> {
            return new CartographyTableMenu(syncId, playerInventory, containerLevelAccess) {
                @Override
                public boolean stillValid(Player player) {
                    return true;
                }
            };
        });

        //TODO MCCStonecutterContainer existiert bereits
        createWorldAccessed(MCCMenuTypes.STONECUTTER, NMSStoneCutterContainerMenu::new, (syncId, playerInventory, containerLevelAccess) -> {
            return new StonecutterMenu(syncId, playerInventory, containerLevelAccess) {
                @Override
                public boolean stillValid(Player player) {
                    return true;
                }
            };
        });
    }

    private static Function<MCCLocation, CustomMenuProvider<ChestMenu, NMSChestContainerMenu>> createChestFabricators(@MCCRequireVanillaElement MCCMenuType mccMenuType, int rows) {
        mccMenuType.requireVanilla();
        return createSimple(mccMenuType, () -> new SimpleContainer(9 * rows), NMSChestContainerMenu::new, (syncId, playerInventory, container) -> {
            return new ChestMenu(MCCPlatform.getInstance().getConversionService().unwrap(mccMenuType, new TypeToken<>() {}), syncId, playerInventory, container, rows) {
                @Override
                public boolean stillValid(Player player) {
                    return true;
                }
            };
        });
    }

    //TODO Make this an NMS Implementation of nms Menu Providers -> Reuse this api in block entities that provide menus to players
    public abstract static class CustomMenuProvider<F extends AbstractContainerMenu, T extends NMSContainerMenu<?, F>> implements ContainerProvider<T>, MenuProvider {
        private Component title = Component.empty();
        private final MCCLocation location;

        public abstract @NotNull F createMenu(int syncId, Inventory playerInventory, Player player);

        protected abstract T construct(F nativeMenu);

        public CustomMenuProvider(MCCLocation location) {
            this.location = location;
            init(location);
        }

        public abstract void init(@NotNull MCCLocation location);

        @Override
        public void setTitle(Component title) {
            this.title = title;
        }

        @Override
        public Component getTitle() {
            return title;
        }

        @Override
        public MCCLocation origin() {
            return location;
        }

        @Override
        public net.minecraft.network.chat.Component getDisplayName() {
            return MCCPlatform.getInstance().getConversionService().unwrap(title, new TypeToken<>() {});
        }

        @Override
        public T createMenuForPlayer(MCCPlayer player) {
            //TODO: Maybe geht das nicht weil nur ein Converter für Player existiert -> Test Case schreiben.
            ServerPlayer serverPlayer = MCCPlatform.getInstance().getConversionService().unwrap(player, new TypeToken<>() {});
            F menu = createMenu(serverPlayer.nextContainerCounter(), serverPlayer.getInventory(), serverPlayer);
            return construct(menu);
        }
    }

    public static <F extends AbstractContainerMenu, T extends NMSContainerMenu<?, F>> Function<MCCLocation, CustomMenuProvider<F, T>> createWorldAccessed(MCCMenuType mccMenuType, Function<F, T> apiConstructor, Function3<Integer, Inventory, ContainerLevelAccess, F> nativeConstructor) {
        return mccLocation ->
            new CustomMenuProvider<>(mccLocation) {
                @Override
                public @NotNull F createMenu(int syncId, Inventory playerInventory, Player player) {
                    ContainerLevelAccess containerLevelAccess = ContainerLevelAccess.create(player.level(), player.blockPosition());
                    return nativeConstructor.apply(syncId, playerInventory, containerLevelAccess);
                }

                @Override
                protected T construct(F nativeMenu) {
                    return apiConstructor.apply(nativeMenu);
                }

                @Override
                public void init(@NotNull MCCLocation location) {

                }
            };
    }

    public static <B extends BlockEntity, F extends AbstractContainerMenu, T extends NMSContainerMenu<?, F>> Function<MCCLocation, CustomMenuProvider<F, T>> createTileBased(MCCMenuType mccMenuType, BiFunction<BlockPos, BlockState, B> blockEntityConstructor, Function<F, T> apiConstructor, Function4<Integer, Inventory, ContainerLevelAccess, B, F> nativeConstructor) {
        return mccLocation ->
            new CustomMenuProvider<>(mccLocation) {

                private B blockEntity;
                private ContainerLevelAccess containerLevelAccess;

                @Override
                public @NotNull F createMenu(int syncId, Inventory playerInventory, Player player) {
                    return nativeConstructor.apply(syncId, playerInventory, containerLevelAccess, blockEntity);
                }

                @Override
                protected T construct(F nativeMenu) {
                    return apiConstructor.apply(nativeMenu);
                }

                @Override
                public void init(@NotNull MCCLocation location) {
                    BlockPos blockPos = new BlockPos(location.blockX(), location.blockY(), location.blockZ());
                    Level level = MCCPlatform.getInstance().getConversionService().unwrap(location.world(), new TypeToken<>() {});
                    blockEntity = blockEntityConstructor.apply(blockPos, Blocks.STONE.defaultBlockState());
                    containerLevelAccess = ContainerLevelAccess.create(level, blockPos);
                }
            };
    }

    public static <A, F extends AbstractContainerMenu, T extends NMSContainerMenu<?, F>> Function<MCCLocation, CustomMenuProvider<F, T>> createSimple(MCCMenuType mccMenuType, Supplier<A> anyAdditionalDataUsedForConstruction, Function<F, T> apiConstructor, TriFunction<Integer, Inventory, A, F> nativeConstructor) {
        return mccLocation ->
            new CustomMenuProvider<>(mccLocation) {
                private final A additional = anyAdditionalDataUsedForConstruction.get();

                @Override
                public @NotNull F createMenu(int syncId, Inventory playerInventory, Player player) {
                    return nativeConstructor.apply(syncId, playerInventory, additional);
                }

                @Override
                protected T construct(F nativeMenu) {
                    return apiConstructor.apply(nativeMenu);
                }

                @Override
                public void init(@NotNull MCCLocation location) {
                }
            };
    }

    public static CustomMenuProvider<?, ?> createDummy(@MCCRequireVanillaElement MCCContainerMenu<?> container) {
        NMSContainerMenu<?, ?> nmsContainer = MCCPlatform.getInstance().getConversionService().unwrap(container, new TypeToken<>() {});
        return new CustomMenuProvider<AbstractContainerMenu, NMSContainerMenu>(null) {
            @Override
            public @NotNull AbstractContainerMenu createMenu(int syncId, Inventory playerInventory, Player player) {
                return nmsContainer.getHandle();
            }

            @Override
            protected NMSContainerMenu construct(AbstractContainerMenu nativeMenu) {
                return nmsContainer;
            }

            @Override
            public void init(@NotNull MCCLocation location) {
            }
        };
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
