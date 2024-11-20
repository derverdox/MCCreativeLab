package de.verdox.mccreativelab.wrapper.inventory.view;

import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainer;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import net.kyori.adventure.text.Component;

public class MCCContainerView {
    private final MCCPlayer mccPlayer;
    private final MCCContainer<?> viewing;

    public MCCContainerView(MCCPlayer mccPlayer, MCCContainer<?> viewing) {
        this.mccPlayer = mccPlayer;
        this.viewing = viewing;
    }

    public MCCContainer<?> getTopInventory(){
        return viewing;
    }

    public MCCContainer<?> getBottomInventory(){
        return mccPlayer.getInventory();
    }

    public MCCPlayer getPlayer() {
        return mccPlayer;
    }

    public MCCMenuType getType(){
        return getTopInventory().getType();
    }

    public Component getTitle(){
        return getTopInventory().getTitle();
    }

    public void setTitle(Component component){
        getTopInventory().setTitle(component);
    }

    public boolean isInTop(int rawSlot) {
        return rawSlot < this.viewing.getSize();
    }
}
