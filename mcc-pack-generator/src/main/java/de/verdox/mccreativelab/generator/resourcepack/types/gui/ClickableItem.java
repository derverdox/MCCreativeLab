package de.verdox.mccreativelab.generator.resourcepack.types.gui;

import de.verdox.mccreativelab.wrapper.item.MCCItemStack;
import de.verdox.mccreativelab.wrapper.item.MCCItemType;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ClickableItem {
    private final MCCItemStack stack;
    private final BiConsumer<GUIClickAction, ActiveGUI> onClick;
    private final Builder builder;

    protected ClickableItem(MCCItemStack stack, BiConsumer<GUIClickAction, ActiveGUI> onClick, Builder builder) {
        this.stack = stack;
        this.onClick = onClick;
        this.builder = builder;
    }

    public Builder getBuilder() {
        return builder;
    }

    public BiConsumer<GUIClickAction, ActiveGUI> getOnClick() {
        return onClick;
    }

    public MCCItemStack getStack() {
        return stack;
    }

    public static class Builder {
        private BiConsumer<GUIClickAction, ActiveGUI> onClick = (inventoryClickEvent, activeGUI) -> {
        };
        private MCCItemStack item = MCCreativeLabExtension.getCustomResourcePack().getEmptyItem().createItem();
        public boolean popGUIStack = false;
        public boolean clearGUIStackAndClose = false;

        public Builder(MCCItemStack stack) {
            this.item = stack.copy();
        }

        public Builder(MCCItemType material) {
            this.item = material.createItem();
        }

        public Builder() {
        }

        public Builder withClick(BiConsumer<GUIClickAction, ActiveGUI> onClick) {
            this.onClick = onClick;
            return this;
        }

        public Builder withItem(MCCItemStack stack) {
            this.item = stack;
            return this;
        }

        public Builder createCopy() {
            var copy = new Builder();
            copy.onClick = this.onClick;
            copy.item = this.item.clone();
            copy.popGUIStack = this.popGUIStack;
            copy.clearGUIStackAndClose = this.clearGUIStackAndClose;
            return copy;
        }

        public Builder backToLastScreenOnClick() {
            popGUIStack = true;
            return this;
        }

        public Builder openGUI(Supplier<CustomGUIBuilder> supplyGUI){
            return withClick((inventoryClickEvent, activeGUI) -> {
                CustomGUIBuilder customGUIBuilder = supplyGUI.get();
                customGUIBuilder.asNestedGUI((Player) inventoryClickEvent.getEntityClicking(), activeGUI, activeGUI::copyTemporaryDataFromGUI);
            });
        }

        public Builder openGUI(CustomGUIBuilder customGUIBuilder){
            return openGUI(() -> customGUIBuilder);
        }

        public Builder closeGUI() {
            clearGUIStackAndClose = true;
            return this;
        }

        MCCItemStack createStack() {
            return this.item.copy();
        }

        public ClickableItem build() {
            return new ClickableItem(createStack(), onClick, this);
        }
    }

}
