package de.verdox.mccreativelab.wrapper.block.settings;

import de.verdox.mccreativelab.wrapper.annotations.MCCLogic;
import de.verdox.mccreativelab.wrapper.block.MCCBlockType;

/**
 * Used to change the block hardness of any block type.
 * This logic is not supported by the minecraft native platform so here is a quick guide on how to achieve that.
 * <p>
 * When a minecraft player breaks a block he will send block damage packets to the server. The server then distributes this information to all other players
 * who could potentially see the player breaking the block. Since the player simulates the block breaking process on the client side the server will just accept a block break
 * by the player if it was legal on the server. So there is some logic happening on the client side. Thus, we cannot just change the hardness of a block on the server
 * platform and expect the client to accept that. Instead, we will get a weird desync.
 * Fortunately, minecraft has added a new player attribute that we can use to control the block breaking speed of a player.
 * With this attribute we can manipulate the client to have the same block hardness as the server.
 */
@MCCLogic
public interface MCCBlockHardnessSettings {
    /**
     * Returns the hardness of the provided block type
     *
     * @param mccBlockType the block type
     * @return the hardness
     */
    float getHardness(MCCBlockType mccBlockType);

    /**
     * Checks whether the provided block types hardness was changed by this logic
     *
     * @param mccBlockType the block type
     * @return true if the hardness was changed
     */
    boolean doesHardnessDifferFromVanilla(MCCBlockType mccBlockType);

    /**
     * Sets the custom block hardness for a specified block type
     *
     * @param mccBlockType the block type
     * @param hardness     the hardness
     */
    void setHardness(MCCBlockType mccBlockType, float hardness);

}
