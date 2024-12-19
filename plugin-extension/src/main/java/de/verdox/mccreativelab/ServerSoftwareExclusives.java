package de.verdox.mccreativelab;

import de.verdox.mccreativelab.behaviour.RepairItemBehaviour;
import de.verdox.mccreativelab.event.MCCreativeLabReloadEvent;
import de.verdox.mccreativelab.features.legacy.LegacyFeatures;
import de.verdox.mccreativelab.impl.paper.platform.converter.BukkitAdapter;
import de.verdox.mccreativelab.impl.vanilla.platform.NMSPlatform;
import de.verdox.mccreativelab.world.block.FakeBlockRegistry;
import de.verdox.mccreativelab.world.block.FakeBlockStorage;
import de.verdox.mccreativelab.world.block.FakeBlockWorldHook;
import de.verdox.mccreativelab.world.block.replaced.ReplacedBlocks;
import de.verdox.mccreativelab.world.item.FakeItemRegistry;
import de.verdox.mccreativelab.world.sound.ReplacedSoundGroups;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuTypes;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.WorldCreator;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerLoadEvent;
import org.bukkit.event.world.WorldLoadEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ServerSoftwareExclusives implements Listener {
    private static FakeBlockRegistry FAKE_BLOCK_REGISTRY;
    private static FakeItemRegistry FAKE_ITEM_REGISTRY;
    private static FakeBlockStorage fakeBlockStorage;
    private static LegacyFeatures legacyFeatures;

    public void onLoad(){
        FAKE_BLOCK_REGISTRY = new FakeBlockRegistry();
        FAKE_ITEM_REGISTRY = new FakeItemRegistry();
        fakeBlockStorage = new FakeBlockStorage();
        legacyFeatures = new LegacyFeatures();
        FakeBlockRegistry.setupFakeBlocks();
        ReplacedBlocks.setup();
        //BasicItemFormat.BASIC_FORMAT.setBehaviour(ItemDataContainer::from);
    }

    public void onEnable(){
        Bukkit.getCommandMap().register("asyncWorldCreate", new Command("asyncWorldCreate") {
            @Override
            public boolean execute(@NotNull CommandSender sender, @NotNull String commandLabel, @NotNull String[] args) {

                if(args.length == 1){
                    String worldName = args[0];
                    sender.sendMessage("Creating world "+worldName+" async");
                    MCCUtil.getInstance().createWorldAsync(MCCreativeLabExtension.getInstance(), new WorldCreator(new NamespacedKey("mccreativelab", worldName)), false)
                        .whenComplete((world, throwable) -> {
                            sender.sendMessage("World "+worldName+" was created ["+world+"]");
                            if(world != null && sender instanceof Player player){
                                player.teleportAsync(world.getSpawnLocation());
                            }
                        });
                }
                return false;
            }
        });

        RepairItemBehaviour.REPAIR_ITEM_BEHAVIOUR.setBehaviour(new RepairItemBehaviour() {
            @Override
            public boolean canCombine(@NotNull ItemStack first, @NotNull ItemStack second) {
                MCCItemStack stack1 = BukkitAdapter.wrap(first);
                MCCItemStack stack2 = BukkitAdapter.wrap(second);
                return stack1.getType().isSame(stack2);
            }

            @Override
            public @NotNull ItemStack assemble(@NotNull ItemStack first, @NotNull ItemStack second) {
                MCCItemStack stack1 = BukkitAdapter.wrap(first);
                return BukkitAdapter.unwrap(stack1.getType().createItem());
            }
        });
    }

    public void onDisable(){

    }

    public void onServerLoad(ServerLoadEvent.LoadType loadType){
        if(loadType.equals(ServerLoadEvent.LoadType.STARTUP)){
            if(MCCreativeLabExtension.getFakeBlockRegistry().hasReusedAnyBlockStates()){
                ReplacedSoundGroups.replaceWoodSoundGroup();
            }
            Bukkit.getLogger().info("ServerSoftware exclusive features started");
        }
    }

    public static FakeBlockRegistry getFakeBlockRegistry() {
        return FAKE_BLOCK_REGISTRY;
    }

    public static FakeItemRegistry getFakeItemRegistry() {
        return FAKE_ITEM_REGISTRY;
    }

    public static FakeBlockStorage getFakeBlockStorage() {
        return fakeBlockStorage;
    }

    public static LegacyFeatures getLegacyFeatures() {
        return legacyFeatures;
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void buildPackOnServerLoad(ServerLoadEvent e) {
        onServerLoad(e.getType());
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onPluginReload(MCCreativeLabReloadEvent ignored) {
        onServerLoad(ServerLoadEvent.LoadType.RELOAD);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void hookIntoWorld(WorldLoadEvent e){
        MCCreativeLab.setWorldHook(e.getWorld(), new FakeBlockWorldHook());
    }
}
