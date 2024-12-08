package de.verdox.mccreativelab.generator.resourcepack.types.gui.element.active;

import de.verdox.mccreativelab.generator.resourcepack.types.gui.ActiveGUI;
import de.verdox.mccreativelab.generator.resourcepack.types.gui.GUIClickAction;
import de.verdox.mccreativelab.generator.resourcepack.types.gui.element.GUIButton;
import de.verdox.mccreativelab.generator.resourcepack.types.rendered.element.single.SingleHudText;
import de.verdox.mccreativelab.generator.resourcepack.types.rendered.element.single.SingleHudTexture;
import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.typed.MCCSounds;
import net.kyori.adventure.sound.Sound;

import java.util.function.Consumer;

public class ActiveGUIButton extends ActiveGUIElement<GUIButton> {
    private boolean isVisible = false;
    public ActiveGUIButton(ActiveGUI activeGUI, GUIButton guiElement) {
        super(activeGUI, guiElement);
    }

    @Override
    public void setVisible(boolean visible) {
        if(isVisible == visible)
            return;

        isVisible = visible;

        activeGUI.editRenderedElement(this.guiElement.getTextureID(), SingleHudTexture.RenderedSingleHudTexture.class, texture -> texture.setVisible(visible));
        activeGUI.editRenderedElement(this.guiElement.getTextID(), SingleHudText.RenderedSingleHudText.class, text -> text.setVisible(visible));

        if (visible)
            setItem();
        else
            removeItem();
    }

    public void editButtonText(Consumer<SingleHudText.RenderedSingleHudText> edit) {
        activeGUI.editRenderedElement(this.guiElement.getTextID(), SingleHudText.RenderedSingleHudText.class, edit);
    }

    public void editButtonTexture(Consumer<SingleHudTexture.RenderedSingleHudTexture> edit) {
        activeGUI.editRenderedElement(this.guiElement.getTextID(), SingleHudTexture.RenderedSingleHudTexture.class, edit);
    }

    @Override
    public void onClick(GUIClickAction inventoryClickEvent, int clickedX, int clickedY) {
        if (guiElement.getOnClick() != null)
            guiElement.getOnClick().accept(inventoryClickEvent, activeGUI);
        inventoryClickEvent.getEntityClicking().playSound(Sound.sound().type(MCCSounds.UI_BUTTON_CLICK.unwrapKey().get().key()).volume(0.5f).build(), net.kyori.adventure.sound.Sound.Emitter.self());
    }

    private void hideOtherButtons() {
        int index = guiElement.getStartIndex();
        ActiveGUIElement<?> activeGUIElement = activeGUI.getGUIElementAtIndex(index);
        if (this.equals(activeGUIElement) || !(activeGUIElement instanceof ActiveGUIButton activeGUIButton))
            return;
        activeGUIButton.removeItem();
    }

    private void setItem() {
        hideOtherButtons();
        int index = guiElement.getStartIndex();

        for (int x = 0; x < guiElement.getXSize(); x++) {
            for (int y = 0; y < guiElement.getYSize(); y++) {
                int slotIndex = index + x + (9 * y);
                MCCItemStack stackToPut = guiElement.getButtonItem().createItem();
                activeGUI.placeGuiElementInSlot(slotIndex, this);
                activeGUI.getVanillaInventory().setItem(slotIndex, stackToPut);
            }
        }
    }

    private void removeItem() {
        int index = guiElement.getStartIndex();

        for (int x = 0; x < guiElement.getXSize(); x++) {
            for (int y = 0; y < guiElement.getYSize(); y++) {
                int slotIndex = index + x + (9 * y);
                activeGUI.placeGuiElementInSlot(slotIndex, null);
                activeGUI.getVanillaInventory().setItem(slotIndex, null);
            }
        }
    }
}
