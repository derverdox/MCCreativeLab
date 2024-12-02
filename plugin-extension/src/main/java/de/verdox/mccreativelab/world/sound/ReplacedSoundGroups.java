package de.verdox.mccreativelab.world.sound;

import de.verdox.mccreativelab.MCCreativeLabExtension;
import de.verdox.mccreativelab.generator.Asset;
import de.verdox.mccreativelab.generator.resourcepack.CustomResourcePack;
import de.verdox.mccreativelab.generator.resourcepack.types.sound.SoundData;
import de.verdox.mccreativelab.world.block.FakeBlock;
import de.verdox.mccreativelab.wrapper.block.MCCBlockSoundGroup;
import de.verdox.mccreativelab.wrapper.platform.MCCPlatform;
import de.verdox.mccreativelab.wrapper.typed.MCCBlocks;
import org.bukkit.NamespacedKey;

public class ReplacedSoundGroups {

    public static void replaceWoodSoundGroup() {
        SoundData newWoodDigSound = new SoundData(new NamespacedKey("minecraft", "block.wood.custom.break"), false, "subtitles.block.generic.break")
            .withSoundVariant(new NamespacedKey("minecraft", "block/custom/wood/dig/wood1"), new Asset<>("/sounds/wood/dig/wood1.ogg"), 1, 1)
            .withSoundVariant(new NamespacedKey("minecraft", "block/custom/wood/dig/wood2"), new Asset<>("/sounds/wood/dig/wood2.ogg"), 1, 1)
            .withSoundVariant(new NamespacedKey("minecraft", "block/custom/wood/dig/wood3"), new Asset<>("/sounds/wood/dig/wood3.ogg"), 1, 1)
            .withSoundVariant(new NamespacedKey("minecraft", "block/custom/wood/dig/wood4"), new Asset<>("/sounds/wood/dig/wood4.ogg"), 1, 1);

        SoundData newWoodStepSound = new SoundData(new NamespacedKey("minecraft", "block.wood.custom.step"), false, "subtitles.block.generic.step")
            .withSoundVariant(new NamespacedKey("minecraft", "block/custom/wood/step/wood1"), new Asset<>("/sounds/wood/step/wood1.ogg"), 1, 1)
            .withSoundVariant(new NamespacedKey("minecraft", "block/custom/wood/step/wood2"), new Asset<>("/sounds/wood/step/wood2.ogg"), 1, 1)
            .withSoundVariant(new NamespacedKey("minecraft", "block/custom/wood/step/wood3"), new Asset<>("/sounds/wood/step/wood3.ogg"), 1, 1)
            .withSoundVariant(new NamespacedKey("minecraft", "block/custom/wood/step/wood4"), new Asset<>("/sounds/wood/step/wood4.ogg"), 1, 1)
            .withSoundVariant(new NamespacedKey("minecraft", "block/custom/wood/step/wood5"), new Asset<>("/sounds/wood/step/wood5.ogg"), 1, 1)
            .withSoundVariant(new NamespacedKey("minecraft", "block/custom/wood/step/wood6"), new Asset<>("/sounds/wood/step/wood6.ogg"), 1, 1);

        net.kyori.adventure.sound.Sound hitSound = newWoodStepSound.asSound(net.kyori.adventure.sound.Sound.Source.BLOCK, 1, 1);
        net.kyori.adventure.sound.Sound stepSound = hitSound;
        net.kyori.adventure.sound.Sound breakSound = newWoodDigSound.asSound(net.kyori.adventure.sound.Sound.Source.BLOCK, 1, 1);
        net.kyori.adventure.sound.Sound placeSound = breakSound;
        net.kyori.adventure.sound.Sound fallSound = MCCBlocks.STONE.get().getSoundGroup().fallSound();

        FakeBlock.FakeBlockSoundGroup fakeBlockSoundGroup = new FakeBlock.FakeBlockSoundGroup(newWoodDigSound, newWoodDigSound, newWoodStepSound, newWoodStepSound, null);

        replaceSoundGroup("block.wood", MCCBlocks.OAK_LOG.get().getSoundGroup(), fakeBlockSoundGroup);
    }

    public static void replaceSoundGroup(String groupParentName, MCCBlockSoundGroup vanillaSoundGroupToReplace, FakeBlock.FakeBlockSoundGroup soundGroup) {
        CustomResourcePack customResourcePack = MCCreativeLabExtension.getInstance().getCustomResourcePack();

        customResourcePack.register(new SoundData(NamespacedKey.minecraft(groupParentName + ".break"), true, "subtitles.block.generic.break"));
        customResourcePack.register(new SoundData(NamespacedKey.minecraft(groupParentName + ".hit"), true, "subtitles.block.generic.hit"));
        customResourcePack.register(new SoundData(NamespacedKey.minecraft(groupParentName + ".place"), true, "subtitles.block.generic.place"));
        customResourcePack.register(new SoundData(NamespacedKey.minecraft(groupParentName + ".step"), true, "subtitles.block.generic.footsteps"));

        if (soundGroup.getBreakSound() != null)
            customResourcePack.register(soundGroup.getBreakSound());
        if (soundGroup.getHitSound() != null)
            customResourcePack.register(soundGroup.getHitSound());
        if (soundGroup.getPlaceSound() != null)
            customResourcePack.register(soundGroup.getPlaceSound());
        if (soundGroup.getStepSound() != null)
            customResourcePack.register(soundGroup.getStepSound());
        if (soundGroup.getFallSound() != null)
            customResourcePack.register(soundGroup.getFallSound());

        MCCPlatform.getInstance().getBlockSoundSettings().swapVanillaSoundGroup(vanillaSoundGroupToReplace, soundGroup.asMCCBlockSoundGroup());
    }
}
