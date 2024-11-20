package de.verdox.mccreativelab.generator.resourcepack.types.menu;

import de.verdox.mccreativelab.MCCUtil;
import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.platform.MCCTask;
import de.verdox.mccreativelab.wrapper.world.MCCLocation;
import org.jetbrains.annotations.Nullable;

import java.util.function.BiConsumer;

public class MenuBehaviour {
    private static final int tickCooldown = 3;
    private final MCCPlayer player;
    private final ActiveMenu activeMenu;
    private final BiConsumer<PlayerKeyInput, ActiveMenu> consumer;
    private final Runnable onEnd;
    private MCCTask posUpdaterTask;
    private MCCTask effectTask;
    private MCCLocation locationBefore;
    private int lastTickButtonPressed;
    private int lastScrollTick;
    private int currentScrollMode = 0;
    private int heldSlotBefore;

    public MenuBehaviour(MCCPlayer player, ActiveMenu activeMenu, BiConsumer<PlayerKeyInput, ActiveMenu> consumer, Runnable onEnd) {
        this.onEnd = onEnd;
        this.player = player;
        this.activeMenu = activeMenu;
        this.consumer = consumer;
    }

    public void start() {
        if (activeMenu.getCustomMenu().hideOtherPlayers) {
            for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {
                player.hidePlayer(MCCreativeLabExtension.getInstance(), onlinePlayer);
            }
        }

        ItemStack[] fakeContents = new ItemStack[46];

        heldSlotBefore = player.getInventory().getHeldItemSlot();

        locationBefore = player.getLocation();

        if (activeMenu.getCustomMenu().doFakeTime)
            player.setPlayerTime(6000, false);
        if (activeMenu.getCustomMenu().doFakeWeather)
            player.setPlayerWeather(WeatherType.CLEAR);
        player.setMetadata("hasMenuOpen", new FixedMetadataValue(MCCreativeLabExtension.getInstance(), false));

        MCCLocation locationOnOpen = getLocationOnOpen();

        this.posUpdaterTask = Bukkit.getScheduler().runTaskTimer(platformPlugin, () -> {
            player.getInventory().setHeldItemSlot(4);
            fakeContents[45] = activeMenu.getActiveBackgroundPicture();
            MCCUtil.getInstance().sendFakeInventoryContents(player, fakeContents);

            if (!activeMenu.getCustomMenu().doYawPitchLock && !activeMenu.getCustomMenu().doPositionLoc)
                return;

            if (player.getLocation().yaw() == 0 && player.getLocation().pitch() == -90 && activeMenu.getCustomMenu().doYawPitchLock)
                return;

            if (locationOnOpen != null)
                player.teleport(locationOnOpen);
        }, 0L, 1L);

        if (activeMenu.getCustomMenu().doEffects) {
            this.effectTask = Bukkit.getScheduler().runTaskTimer(platformPlugin, () -> {
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOWNESS, 20, 3, false, false, false));
                player.addPotionEffect(new PotionEffect(PotionEffectType.MINING_FATIGUE, 20, -1, false, false, false));
                player.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 40, 1, false, false, false));
            }, 0L, 20L);
        }
    }

    private @Nullable MCCLocation getLocationOnOpen() {
        MCCLocation location = null;

        if (activeMenu.getCustomMenu().doYawPitchLock)
            location = new MCCLocation(player.getLocation().world(), player.getLocation().x() + 0.5, player.getLocation().y(), player.getLocation().z() + 0.5, 0, -90);
        else if (activeMenu.getCustomMenu().doPositionLoc)
            location = new MCCLocation(player.getLocation().world(), player.getLocation().x() + 0.5, player.getLocation().y(), player.getLocation().z() + 0.5, player.getLocation().yaw(), player.getLocation().pitch());
        return location;
    }

    public void close() {
        player.resetPlayerTime();
        player.resetPlayerWeather();

        FakeInventory.stopFakeInventoryOfPlayer(player);

        player.getInventory().setHeldItemSlot(heldSlotBefore);

        player.updateInventory();

        HandlerList.unregisterAll(this);
        if (posUpdaterTask != null)
            posUpdaterTask.cancel();
        if (effectTask != null)
            effectTask.cancel();
        player.teleport(locationBefore);
        if (onEnd != null)
            onEnd.run();

        player.removeMetadata("hasMenuOpen", MCCreativeLabExtension.getInstance());
        if (activeMenu.getCustomMenu().hideOtherPlayers) {
            for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {
                player.showPlayer(MCCreativeLabExtension.getInstance(), onlinePlayer);
            }
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onQuit(PlayerQuitEvent e) {
        if (!isRightPlayer(e.getPlayer()))
            return;

        close();
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onDamage(EntityDamageByBlockEvent e) {
        if (!isRightPlayer(e.getEntity()))
            return;
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onDamage(EntityDamageByEntityEvent e) {
        if (!isRightPlayer(e.getEntity()))
            return;
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onTarget(EntityTargetLivingEntityEvent e) {
        if (e.getTarget() == null || !isRightPlayer(e.getTarget()))
            return;
        e.setCancelled(true);
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onQuit(PlayerKickEvent e) {
        if (!isRightPlayer(e.getPlayer()))
            return;
        close();
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void track(PlayerTrackEntityEvent e) {
        if (!isRightPlayer(e.getEntity()))
            return;
        if (e.getEntity() instanceof Player) {
            if (activeMenu.getCustomMenu().hideOtherPlayers)
                e.setCancelled(true);
        }
    }

    @EventHandler
    public void pickupItem(EntityPickupItemEvent e) {
        if (!isRightPlayer(e.getEntity()))
            return;
        e.setCancelled(true);
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        if (!isRightPlayer((Player) e.getWhoClicked()))
            return;
        e.setCancelled(true);
    }

    @EventHandler
    public void onInventoryClick(InventoryInteractEvent e) {
        if (!isRightPlayer((Player) e.getWhoClicked()))
            return;
        e.setCancelled(true);
    }

    @EventHandler
    public void onSwap(PlayerSwapHandItemsEvent e) {
        if (!isRightPlayer(e.getPlayer()))
            return;
        e.setCancelled(true);
    }

    @EventHandler
    public void playerHeldItemEvent(PlayerItemHeldEvent e) {
        if (!isRightPlayer(e.getPlayer()))
            return;
        e.setCancelled(true);

        var difference = Bukkit.getCurrentTick() - lastScrollTick;
        lastScrollTick = Bukkit.getCurrentTick();
        if (difference <= 2) {
            if (currentScrollMode == 1)
                consumer.accept(PlayerKeyInput.SCROLL_UP, activeMenu);
            else if (currentScrollMode == -1)
                consumer.accept(PlayerKeyInput.SCROLL_DOWN, activeMenu);
        } else {
            var slotDifference = e.getNewSlot() - e.getPreviousSlot();

            if (slotDifference >= 0 && slotDifference <= 3) {
                consumer.accept(PlayerKeyInput.SCROLL_DOWN, activeMenu);
                currentScrollMode = -1;
            } else if (slotDifference <= 0 && slotDifference >= -3) {
                consumer.accept(PlayerKeyInput.SCROLL_UP, activeMenu);
                currentScrollMode = 1;
            } else
                currentScrollMode = 0;
        }


    }

    @EventHandler
    private void onInteract(PlayerInteractEvent e) {
        if (!isRightPlayer(e.getPlayer()))
            return;
        if (e.getAction().equals(Action.LEFT_CLICK_AIR) || e.getAction().equals(Action.LEFT_CLICK_BLOCK))
            triggerKeyInput(PlayerKeyInput.LEFT_CLICK, e);
        else if (e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK))
            triggerKeyInput(PlayerKeyInput.RIGHT_CLICK, e);
    }

    @EventHandler
    private void onDeath(PlayerDeathEvent e) {
        if (!isRightPlayer(e.getPlayer()))
            return;
        close();
    }

    @EventHandler
    private void onJump(PlayerJumpEvent e) {
        if (!isRightPlayer(e.getPlayer()))
            return;
        triggerKeyInput(PlayerKeyInput.SPACE, e);
    }

    @EventHandler
    private void onMove(PlayerMoveEvent e) {
        if (!isRightPlayer(e.getPlayer()))
            return;
        var direction = e.getTo().clone().add(-e.getFrom().getX(), -e.getFrom().getY(), -e.getFrom().getZ());

        var currentTick = Bukkit.getServer().getCurrentTick();
        e.setTo(new Location(e.getFrom().getWorld(), e.getFrom().getX(), e.getTo().getY(), e.getFrom().getZ(), e
            .getFrom().getYaw(), e.getFrom().getPitch()));

        var lastTick = currentTick - lastTickButtonPressed;
        lastTickButtonPressed = currentTick;

        if (lastTick < tickCooldown)
            return;


        if (direction.getX() > 0)
            triggerKeyInput(PlayerKeyInput.A, e);
        if (direction.getX() < 0)
            triggerKeyInput(PlayerKeyInput.D, e);
        if (direction.getZ() > 0)
            triggerKeyInput(PlayerKeyInput.W, e);
        if (direction.getZ() < 0)
            triggerKeyInput(PlayerKeyInput.S, e);
    }

    private void triggerKeyInput(PlayerKeyInput playerKeyInput, Cancellable cancellable) {
        if (activeMenu.getCustomMenu().getCancelledGameInputs().contains(playerKeyInput))
            cancellable.setCancelled(true);
        consumer.accept(playerKeyInput, activeMenu);
    }

}
