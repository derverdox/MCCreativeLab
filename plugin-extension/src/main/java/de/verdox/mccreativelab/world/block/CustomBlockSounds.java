package de.verdox.mccreativelab.world.block;

import de.verdox.mccreativelab.MCCreativeLabExtension;
import de.verdox.mccreativelab.Wrappers;
import de.verdox.mccreativelab.util.EntityMetadataPredicate;
import de.verdox.mccreativelab.util.PlayerAsyncRayTracer;
import io.papermc.paper.event.player.PlayerArmSwingEvent;
import io.papermc.paper.event.world.WorldEffectEvent;
import io.papermc.paper.event.world.WorldSoundEvent;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.world.GenericGameEvent;
import org.bukkit.metadata.FixedMetadataValue;

public class CustomBlockSounds implements Listener {
    public static final EntityMetadataPredicate.TickDelay DIGGING_SOUND_DELAY = new EntityMetadataPredicate.TickDelay("DiggingSoundDelay", 4);


    public static void simulateDiggingSound(Player player, Block block, FakeBlock.FakeBlockState fakeBlockState) {
        if (!DIGGING_SOUND_DELAY.isAllowed(player))
            return;
        if(!FakeBlockSoundManager.isBlockWithoutStandardSound(block) && fakeBlockState == null)
            return;
        Wrappers.SoundGroup soundGroup = FakeBlockSoundManager.getSoundGroup(block, fakeBlockState);
        net.kyori.adventure.sound.Sound sound = soundGroup.getStepSound().asSound(net.kyori.adventure.sound.Sound.Source.BLOCK, 0.15f, soundGroup.getPitch() * 0.3F);
        player.playSound(sound, block.getX(), block.getY(), block.getZ());
        DIGGING_SOUND_DELAY.reset(player);
    }

    public static void simulateBreakSound(Block block, FakeBlock.FakeBlockState fakeBlockState) {
        Wrappers.SoundGroup soundGroup = FakeBlockSoundManager.getSoundGroup(block, fakeBlockState);
        net.kyori.adventure.sound.Sound sound = soundGroup.getBreakSound()
            .asSound(net.kyori.adventure.sound.Sound.Source.BLOCK, (soundGroup.getVolume() + 1.0F) / 2.0F, soundGroup.getPitch() * 0.8F);
        block.getWorld().playSound(sound, block.getX(), block.getY(), block.getZ());
    }

    public static void simulateBreakSound(BlockState blockState, FakeBlock.FakeBlockState fakeBlockState) {
        Wrappers.SoundGroup soundGroup = FakeBlockSoundManager.getSoundGroup(blockState.getBlockData(), fakeBlockState);
        net.kyori.adventure.sound.Sound sound = soundGroup.getBreakSound()
            .asSound(net.kyori.adventure.sound.Sound.Source.BLOCK, (soundGroup.getVolume() + 1.0F) / 2.0F, soundGroup.getPitch() * 0.8F);
        blockState.getBlock().getWorld().playSound(sound, blockState.getBlock().getX(), blockState.getBlock().getY(), blockState.getBlock().getZ());
    }

    public static void simulateBlockPlaceSound(Block block, FakeBlock.FakeBlockState fakeBlockState) {
        Wrappers.SoundGroup soundGroup = FakeBlockSoundManager.getSoundGroup(block, fakeBlockState);
        net.kyori.adventure.sound.Sound sound = soundGroup.getPlaceSound().asSound(net.kyori.adventure.sound.Sound.Source.BLOCK, (soundGroup.getVolume() + 1.0F) / 2.0F, soundGroup.getPitch() * 0.8F);
        block.getWorld().playSound(sound, block.getX(), block.getY(), block.getZ());
    }

    @EventHandler
    public void gameEvent(GenericGameEvent genericGameEvent) {
        if (!(genericGameEvent.getEntity() instanceof Player))
            return;
        Block block = genericGameEvent.getLocation().getBlock();
        if (!FakeBlockSoundManager.isBlockWithoutStandardSound(block))
            return;
        FakeBlock.FakeBlockState fakeBlockState = FakeBlockStorage.getFakeBlockState(block.getLocation(), false);

        if (genericGameEvent.getEvent().equals(GameEvent.BLOCK_PLACE))
            simulateBlockPlaceSound(block, fakeBlockState);

        if (genericGameEvent.getEvent().equals(GameEvent.BLOCK_DESTROY))
            simulateBreakSound(block, fakeBlockState);
    }

    @EventHandler
    public void resetDiggingDelayOnBlockBreak(BlockBreakEvent e) {
        DIGGING_SOUND_DELAY.reset(e.getPlayer());
    }


    // The upper method will not be called when the block break was cancelled. However, the client will predict a block break and needs a sound anyway.
    @EventHandler(priority = EventPriority.MONITOR)
    public void playBreakSoundEvenWhenBreakCancelled(BlockBreakEvent e) {
        if (!e.isCancelled())
            return;
        if (!FakeBlockSoundManager.isBlockWithoutStandardSound(e.getBrokenState().getBlockData()))
            return;
        FakeBlock.FakeBlockState fakeBlockState = FakeBlockStorage.getFakeBlockState(e.getBlock().getLocation(), false);
        simulateBreakSound(e.getBrokenState(), fakeBlockState);
    }

    @EventHandler
    public void storeLastPlayerInteraction(PlayerInteractEvent e) {
        e.getPlayer().setMetadata("last_click_action", new FixedMetadataValue(MCCreativeLabExtension.getInstance(), e.getAction()));
    }

    @EventHandler
    public void simulateDiggingSoundOnArmSwing(PlayerArmSwingEvent e) {
        Player player = e.getPlayer();
        if (!e.getHand().isHand())
            return;
        if (e.getPlayer().hasMetadata("last_click_action")) {

            Action action = (Action) e.getPlayer().getMetadata("last_click_action").get(0).value();
            if (action != null && action.isRightClick())
                return;

        }

        Block rayTracedBlock = PlayerAsyncRayTracer.getTargetBlock(e.getPlayer());
        if (rayTracedBlock == null)
            return;
        FakeBlock.FakeBlockState fakeBlockState = FakeBlockStorage.getFakeBlockState(rayTracedBlock.getLocation(), false);
        if (!FakeBlockSoundManager.isBlockWithoutStandardSound(rayTracedBlock))
            return;
        simulateDiggingSound(player, rayTracedBlock, fakeBlockState);
    }

    @EventHandler
    public void replaceSounds(WorldSoundEvent e) {
        if (!e.getSound().namespace().equals("minecraft"))
            return;

        String key = e.getSound().getKey();
        if (!key.contains("block") || !key.contains("step"))
            return;
        if (e.getExcept() == null)
            return;

        Location blockLoc = e.getSoundLocation().clone().add(0, -1, 0);
        if (!FakeBlockSoundManager.isBlockWithoutStandardSound(blockLoc.getBlock()))
            return;
        FakeBlock.FakeBlockState fakeBlockState = FakeBlockStorage.getFakeBlockState(blockLoc, false);
        Wrappers.SoundGroup soundGroup = FakeBlockSoundManager.getSoundGroup(blockLoc.getBlock(), fakeBlockState);
        e.setSound(soundGroup.getStepSound().getKey());
        e.setExcept(null);
    }

    @EventHandler
    public void replaceEffect(WorldEffectEvent e) {
        if (e.getExcept() == null)
            return;

        if (e.getEffect().equals(Effect.STEP_SOUND)) {
            FakeBlock.FakeBlockState fakeBlockState = FakeBlockStorage.getFakeBlockState(e.getSoundLocation()
                .toBlockLocation(), false);
            if (fakeBlockState != null) {
                e.setExcept(null);
                BlockData blockData = fakeBlockState.getFakeBlockDisplay().getDestroyParticleData();
                e.setData(blockData);
            }
        }
    }

}
