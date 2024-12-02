package de.verdox.mccreativelab.wrapper.block.settings;

import de.verdox.mccreativelab.wrapper.annotations.MCCLogic;
import de.verdox.mccreativelab.wrapper.annotations.MCCRequireVanillaElement;
import de.verdox.mccreativelab.wrapper.block.MCCBlockSoundGroup;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;


/**
 * Used to customize the sounds blocks make when breaking, digging, stepping on them.
 * This logic is not supported by the minecraft native platform so here is a quick guide on how to achieve that.
 * <p>
 * Since the client defines block sound groups like wood minecraft only allows us to change the sounds of these groups.
 * Hence, we first need to replace those sound groups in the resource packs with empty sounds. As a result the player won't hear anything when breaking
 * the specific block at first. That is where we simulate the sound on the server side. When walking over blocks all players but the player doing the action
 * will hear the sound because the native minecraft platform sends the corresponding packets. We then make sure that the
 * player causing the sounds also receives those packets. Since we control the server software we can interfere with this process and change the sound that is
 * sent to all players. The result is that all players hear the new sound.
 */
@MCCLogic
public interface MCCBlockSoundSettings {
    /**
     * Sets the sound group of a specific block type
     *
     * @param blockType          the block type
     * @param mccBlockSoundGroup the sound group
     */
    void setSoundGroup(MCCBlockType blockType, MCCBlockSoundGroup mccBlockSoundGroup);

    MCCBlockSoundGroup getSoundGroup(MCCBlockType mccBlockType);

    /**
     * Used to swap vanilla block sound groups with custom ones.
     *
     * @param vanillaSoundGroup the vanilla sound group to change
     * @param customSoundGroup  the custom sound group used to change
     */
    void swapVanillaSoundGroup(@MCCRequireVanillaElement MCCBlockSoundGroup vanillaSoundGroup, MCCBlockSoundGroup customSoundGroup);

    default boolean hasCustomSoundGroup(MCCBlockType mccBlockType) {
        if (!mccBlockType.isVanilla()) {
            return true;
        }
        return !mccBlockType.getSoundGroup().equals(getSoundGroup(mccBlockType));
    }
}
