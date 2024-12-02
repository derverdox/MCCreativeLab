package de.verdox.mccreativelab.wrapper.inventory.view;

import de.verdox.mccreativelab.wrapper.entity.MCCPlayer;
import de.verdox.mccreativelab.wrapper.inventory.MCCContainerMenu;
import de.verdox.mccreativelab.wrapper.inventory.MCCMenuType;
import net.kyori.adventure.text.Component;

public class MCCContainerView {
    private final MCCPlayer mccPlayer;
    private final MCCContainerMenu<?> viewing;

    public MCCContainerView(MCCPlayer mccPlayer, MCCContainerMenu<?> viewing) {
        this.mccPlayer = mccPlayer;
        this.viewing = viewing;
    }

    public MCCContainerMenu<?> getTopInventory(){
        return viewing;
    }

    public MCCContainerMenu<?> getBottomInventory(){
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
